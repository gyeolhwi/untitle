import { Global } from '@emotion/react';
import './App.css';
import { reset } from './styles/global';
import Header from './Header/Header';
import MainLayout from './MainLayout/MainLayout';
import { Route, Routes } from 'react-router-dom';
import NoticePage from './pages/NoticePage/NoticePage';
import ReportPage from './pages/ReportPage/ReportPage';
import SelectPage from './pages/SelectPage/SelectPage';
import EventPage from './pages/EventPage/EventPage';

function App() {
  return (
    <>
      <Global styles={reset} />
      <Header />
      <MainLayout>
        <Routes>
          <Route path='/notice' element={<NoticePage />} />
          <Route path='/report' element={<ReportPage />} />
          <Route path='/select' element={<SelectPage />} />
          <Route path='/event' element={<EventPage />} />
        </Routes>
      </MainLayout>
    </>
  );
}

export default App;
