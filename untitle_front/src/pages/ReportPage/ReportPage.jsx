import React from 'react';
/** @jsxImportSource @emotion/react */
import * as s from "./style";
import PageTitle from '../../Forms/PageTitle/PageTitle';
import { MENU_LIST } from '../../constants/MENUS';

function ReportPage(props) {
    return (
        <div>
            <PageTitle title={MENU_LIST.report.title} />
        </div>
    );
}

export default ReportPage;