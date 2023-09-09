import axios from 'axios';

export default axios.create({
    baseURL:'https://08f5-177-184-180-19.ngrok-free.app', // Paste your link here
    headers: {"ngrok-skip-browser-warning": "true"} // Anyone alteration here please
});