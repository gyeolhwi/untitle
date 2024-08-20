import React from 'react';
/** @jsxImportSource @emotion/react */
import * as s from "./style";

function PageTitle({ title }) {
    return (
        <div css={s.layout}>
            <div>
                <h2>{title}</h2>
            </div>
        </div>
    );
}

export default PageTitle;