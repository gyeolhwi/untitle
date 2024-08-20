import { css } from "@emotion/react";

export const layout = css`
    box-sizing: border-box;
    width: 100%;
    height: 80px;
    background-color: black;
    display: flex;
    justify-content: space-around;

    div{
        box-sizing: border-box;
        display: flex;
        align-items: center;
        color: white;
        cursor: pointer;
    }
    a{
        text-decoration: none;
        color: white;
    }
`;