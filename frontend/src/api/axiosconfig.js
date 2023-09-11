import axios from 'axios';

export default axios.create({
    baseURL:'https://6691-177-184-189-178.ngrok-free.app', // Paste your link here
    headers: {"ngrok-skip-browser-warning": "true"} // Anyone alteration here please
});