import React, { useEffect } from 'react';
/** @jsxImportSource @emotion/react */
import PageTitle from '../../Forms/PageTitle/PageTitle';
import { MENU_LIST } from '../../constants/MENUS';
import { useRecoilState } from 'recoil';
import { userListAtom } from '../../atoms/userList';
import { getAll } from '../../apis/restapis/get';

function SelectPage(props) {
    const [userListAll, setUserList] = useRecoilState(userListAtom);

    const requestUserList = async () => {
        const userList = await getAll();
        setUserList(userList?.data);
    }

    useEffect(() => {
        requestUserList();
    },[]);
    
    console.log(userListAll);
    return (
        <div>
            <button onClick={requestUserList}>b</button>
            <PageTitle title={MENU_LIST.select.title} />
        </div>
    );
}

export default SelectPage;