import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import {Container, Paper} from "@mui/material";

export default function Meeting() {
    return (
        <Container>
            <Paper elevation={3} style={paperStyle}>
        <form>
        <Box
            component="form"
            sx={{
                '& > :not(style)': { m: 1, width: '20ch' },
            }}
            noValidate
            autoComplete="off"
        >

            <TextField id="standard-basic" label="Meeting Name" variant="standard" />
            <TextField id="standard-basic" label="Responsible Person" variant="standard" />
            <TextField id="standard-basic" label="Meeting Description" variant="standard" />
            <TextField id="standard-basic" label="Meeting Type" variant="standard" />
            <TextField id="standard-basic" label="Start Date" variant="standard" />
            <TextField id="standard-basic" label="End Data" variant="standard" />

        </Box>
        </form>
            </Paper>
    </Container>
    );
}
