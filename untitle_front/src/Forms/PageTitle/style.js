import { css } from "@emotion/react";

export const layout = css`
    box-sizing: border-box;
    width: 100%;
    display: flex;
    justify-content: flex-start;
    padding: 20px;

    & > div > h2{
        font-size: 30px;
        font-weight: 600;
        color: black;
        cursor: default;
    }
`;
