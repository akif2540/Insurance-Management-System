# Insurance Management System

## Project Overview

The Insurance Management System is a software application designed for an insurance company. It handles both individual and corporate customer profiles, and provides functionalities for managing user accounts, addresses, and insurance policies. 

## Features

- **Customer Profiles:** Supports both Individual and Enterprise customer profiles.
- **Account Management:** Includes login functionality, address management, and insurance policy handling.
- **Address Management:** Ability to add and remove addresses (Home and Business).
- **Insurance Policies:** Handles various types of insurance and calculates premiums based on policy type.
- **Authentication:** Validates user login credentials and manages authentication status.

## Class and Method Details

### Abstract Class: `Account`

- **Properties:**
  - `User user`: The user associated with the account.
  - `List<Insurance> insurancePolicies`: List of insurance policies associated with the account.
  - `AuthenticationStatus authenticationStatus`: Current login status.
- **Methods:**
  - `showUserInfo()`: Prints user information to the screen.
  - `login(String email, String password)`: Authenticates the user.
  - `addAddress(Address address)`: Adds an address to the user's address list.
  - `removeAddress(Address address)`: Removes an address from the user's address list.
  - `getAuthenticationStatus()`: Returns the authentication status.
  - `addInsurance(Insurance insurance)`: Adds an insurance policy to the account.

### Class: `User`

- **Properties:**
  - `String firstName`
  - `String lastName`
  - `String email`
  - `String password`
  - `String occupation`
  - `int age`
  - `List<Address> addressList`
  - `Date lastLoginDate`

### Interface: `Address`

- **Methods:**
  - `String getAddressDetails()`: Returns address details.

### Classes Implementing `Address`

- `HomeAddress`
- `BusinessAddress`

### Abstract Class: `Insurance`

- **Properties:**
  - `String name`
  - `double fee`
  - `Date startDate`
  - `Date endDate`
- **Methods:**
  - `double calculate()`: Calculates the insurance fee.

### Subclasses of `Insurance`

- `HealthInsurance`
- `ResidenceInsurance`
- `TravelInsurance`
- `CarInsurance`

### Class: `AddressManager`

- **Methods:**
  - `addAddress(User user, Address address)`: Adds an address to the user's address list.
  - `removeAddress(User user, Address address)`: Removes an address from the user's address list.

### Enum: `AuthenticationStatus`

- **Constants:**
  - `SUCCESS`
  - `FAIL`

### Exception: `InvalidAuthenticationException`

- Custom exception thrown when authentication fails.

### User Input Class

- Reads email and password from the keyboard and calls the `AccountManager`'s `login` method to authenticate the user.

## Setup and Usage

