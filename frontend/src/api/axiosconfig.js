import axios from 'axios';

export default axios.create({
    baseURL:'https://a160-177-184-180-114.ngrok-free.app', // Paste your link here
    headers: {"ngrok-skip-browser-warning": "true"} // Anyone alteration here please
});