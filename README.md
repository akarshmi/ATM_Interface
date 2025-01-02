# ATM Interface Application

A Java-based ATM (Automated Teller Machine) interface built using AWT and Swing frameworks.

## Features

- User authentication with account number and PIN
- Check balance inquiry
- Cash withdrawal
- Cash deposit
- Mini statement generation
- Fund transfer between accounts
- PIN change functionality

## Technical Requirements

- Java Development Kit (JDK) 8 or higher
- IDE supporting Java (Eclipse, NetBeans, or IntelliJ IDEA)
- MySQL Database

## Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/atm-interface.git
```

2. Import the project into your IDE

3. Configure database connection in `config.properties`

4. Run `DatabaseSetup.sql` to create required tables

## Project Structure

```
atm-interface/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controllers/
│   │   │   ├── models/
│   │   │   ├── views/
│   │   │   └── utils/
│   ├── resources/
│   │   └── config.properties
├── lib/
├── docs/
└── README.md
```

## Usage

1. Start the application by running `Main.java`
2. Enter account credentials in the login screen
3. Select desired transaction from the main menu
4. Follow on-screen instructions to complete transactions

## Database Schema

- `users`: Stores account holder information
- `accounts`: Manages account balances
- `transactions`: Records all transactions
- `user_auth`: Handles authentication data

## Security Features

- Encrypted PIN storage
- Session timeout
- Transaction logging
- Failed login attempts monitoring

## Contributing

1. Fork the repository
2. Create a feature branch
3. Submit a pull request

## License

This project is licensed under the MIT License - see LICENSE.md for details.

## Contact

For support or queries, contact: youremail@example.com
