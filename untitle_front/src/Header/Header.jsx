import React from 'react';
/** @jsxImportSource @emotion/react */
import { Link } from 'react-router-dom';
import * as s from "./style";
import { MENU_LIST } from '../constants/MENUS';

function Menu({ title, pathTo }) {
    return (
        <div>
            <h2><Link to={pathTo}>{title}</Link></h2>
        </div>

    );
}

function Header(props) {
    return (
        <div css={s.layout}>
            <Menu title={MENU_LIST.notice.title} pathTo={MENU_LIST.notice.path} />
            <Menu title={MENU_LIST.report.title} pathTo={MENU_LIST.report.path} />
            <Menu title={MENU_LIST.event.title} pathTo={MENU_LIST.event.path} />
            <Menu title={MENU_LIST.select.title} pathTo={MENU_LIST.select.path} />
        </div>
    );
}

export default Header;