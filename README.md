# Getting started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPILib&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPILib&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPILib&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPILib&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

## How to Use

The following section explains how to use the MundiAPILib library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPILib&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPILib&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPILib&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPILib&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPILib&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *MundiAPILib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPILib&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

Clicking the ``` Add ``` button will open a dialog where you need to specify MundiAPILib in ``` Group Id ``` and MundiAPILib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPILib&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=MundiAPI-Java&workspaceName=MundiAPILib&projectName=MundiAPILib&rootNamespace=com.mundipagg.api)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *MundiAPILib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| basicAuthUserName | The username to use with basic authentication |
| basicAuthPassword | The password to use with basic authentication |



API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};

// Configuration parameters and credentials
String basicAuthUserName = "basicAuthUserName"; // The username to use with basic authentication
String basicAuthPassword = "basicAuthPassword"; // The password to use with basic authentication

MundiAPILibClient client = new MundiAPILibClient(basicAuthUserName, basicAuthPassword);
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [ChargesController](#charges_controller)
* [CustomersController](#customers_controller)
* [SubscriptionsController](#subscriptions_controller)
* [PlansController](#plans_controller)
* [InvoicesController](#invoices_controller)
* [OrdersController](#orders_controller)

### <a name="charges_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.ChargesController") ChargesController

#### Get singleton instance

The singleton instance of the ``` ChargesController ``` class can be accessed from the API Client.

```java
ChargesController charges = client.getCharges();
```

#### <a name="get_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.getChargeAsync") getChargeAsync

> Get a charge from its id


```java
void getChargeAsync(
        final String chargeId,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |


#### Example Usage

```java
String chargeId = "charge_id";
// Invoking the API call with sample inputs
charges.getChargeAsync(chargeId, new APICallBack<GetChargeResponse>() {
    public void onSuccess(HttpContext context, GetChargeResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="retry_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.retryChargeAsync") retryChargeAsync

> Retries a charge


```java
void retryChargeAsync(
        final String chargeId,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |


#### Example Usage

```java
String chargeId = "charge_id";
// Invoking the API call with sample inputs
charges.retryChargeAsync(chargeId, new APICallBack<GetChargeResponse>() {
    public void onSuccess(HttpContext context, GetChargeResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_charges_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.getChargesAsync") getChargesAsync

> Lists all charges


```java
void getChargesAsync(final APICallBack<ListChargesResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
charges.getChargesAsync(new APICallBack<ListChargesResponse>() {
    public void onSuccess(HttpContext context, ListChargesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.createChargeAsync") createChargeAsync

> Creates a new charge


```java
void createChargeAsync(
        final CreateChargeRequest request,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Request for creating a charge |


#### Example Usage

```java
try {
    CreateChargeRequest request = new CreateChargeRequest();
    // Invoking the API call with sample inputs
    charges.createChargeAsync(request, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="update_charge_credit_card_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.updateChargeCreditCardAsync") updateChargeCreditCardAsync

> Updates the credit card from a charge


```java
void updateChargeCreditCardAsync(
        final String chargeId,
        final UpdateChargeCreditCardRequest request,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| request |  ``` Required ```  | Request for updating a charge's credit card |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    UpdateChargeCreditCardRequest request = new UpdateChargeCreditCardRequest();
    // Invoking the API call with sample inputs
    charges.updateChargeCreditCardAsync(chargeId, request, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="update_charge_payment_method_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.updateChargePaymentMethodAsync") updateChargePaymentMethodAsync

> Updates a charge's payment method


```java
void updateChargePaymentMethodAsync(
        final String chargeId,
        final UpdateChargePaymentMethodRequest request,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| request |  ``` Required ```  | Request for updating the payment method from a charge |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    UpdateChargePaymentMethodRequest request = new UpdateChargePaymentMethodRequest();
    // Invoking the API call with sample inputs
    charges.updateChargePaymentMethodAsync(chargeId, request, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="cancel_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.cancelChargeAsync") cancelChargeAsync

> Cancel a charge


```java
void cancelChargeAsync(
        final String chargeId,
        final CreateCancelChargeRequest request,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| request |  ``` Optional ```  | Request for cancelling a charge |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    CreateCancelChargeRequest request = new CreateCancelChargeRequest();
    // Invoking the API call with sample inputs
    charges.cancelChargeAsync(chargeId, request, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="capture_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.ChargesController.captureChargeAsync") captureChargeAsync

> Captures a charge


```java
void captureChargeAsync(
        final String chargeId,
        final CreateCaptureChargeRequest request,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| request |  ``` Optional ```  | Request for capturing a charge |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    CreateCaptureChargeRequest request = new CreateCaptureChargeRequest();
    // Invoking the API call with sample inputs
    charges.captureChargeAsync(chargeId, request, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

### <a name="customers_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.CustomersController") CustomersController

#### Get singleton instance

The singleton instance of the ``` CustomersController ``` class can be accessed from the API Client.

```java
CustomersController customers = client.getCustomers();
```

#### <a name="get_addresses_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getAddressesAsync") getAddressesAsync

> Gets all adressess from a customer


```java
void getAddressesAsync(
        final String customerId,
        final APICallBack<ListAddressesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |


#### Example Usage

```java
String customerId = "customer_id";
// Invoking the API call with sample inputs
customers.getAddressesAsync(customerId, new APICallBack<ListAddressesResponse>() {
    public void onSuccess(HttpContext context, ListAddressesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_credit_cards_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getCreditCardsAsync") getCreditCardsAsync

> Get all credit cards from a customer


```java
void getCreditCardsAsync(
        final String customerId,
        final APICallBack<ListCardsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |


#### Example Usage

```java
String customerId = "customer_id";
// Invoking the API call with sample inputs
customers.getCreditCardsAsync(customerId, new APICallBack<ListCardsResponse>() {
    public void onSuccess(HttpContext context, ListCardsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_customers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getCustomersAsync") getCustomersAsync

> Get all Customers


```java
void getCustomersAsync(final APICallBack<ListCustomersResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
customers.getCustomersAsync(new APICallBack<ListCustomersResponse>() {
    public void onSuccess(HttpContext context, ListCustomersResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.createCustomerAsync") createCustomerAsync

> Creates a new customer


```java
void createCustomerAsync(
        final CreateCustomerRequest request,
        final APICallBack<GetCustomerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| request |  ``` Required ```  | Request for creating a customer |


#### Example Usage

```java
try {
    CreateCustomerRequest request = new CreateCustomerRequest();
    // Invoking the API call with sample inputs
    customers.createCustomerAsync(request, new APICallBack<GetCustomerResponse>() {
        public void onSuccess(HttpContext context, GetCustomerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getCustomerAsync") getCustomerAsync

> Get a customer


```java
void getCustomerAsync(
        final String customerId,
        final APICallBack<GetCustomerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |


#### Example Usage

```java
String customerId = "customer_id";
// Invoking the API call with sample inputs
customers.getCustomerAsync(customerId, new APICallBack<GetCustomerResponse>() {
    public void onSuccess(HttpContext context, GetCustomerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="update_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.updateAddressAsync") updateAddressAsync

> Updates an address


```java
void updateAddressAsync(
        final String customerId,
        final String addressId,
        final UpdateAddressRequest request,
        final APICallBack<GetAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| addressId |  ``` Required ```  | Address Id |
| request |  ``` Required ```  | Request for updating an address |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    String addressId = "address_id";
    UpdateAddressRequest request = new UpdateAddressRequest();
    // Invoking the API call with sample inputs
    customers.updateAddressAsync(customerId, addressId, request, new APICallBack<GetAddressResponse>() {
        public void onSuccess(HttpContext context, GetAddressResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="update_credit_card_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.updateCreditCardAsync") updateCreditCardAsync

> Updates a credit card


```java
void updateCreditCardAsync(
        final String customerId,
        final String cardId,
        final UpdateCreditCardRequest request,
        final APICallBack<GetCreditCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| cardId |  ``` Required ```  | Credit card id |
| request |  ``` Required ```  | Request for updating a credit card |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    String cardId = "card_id";
    UpdateCreditCardRequest request = new UpdateCreditCardRequest();
    // Invoking the API call with sample inputs
    customers.updateCreditCardAsync(customerId, cardId, request, new APICallBack<GetCreditCardResponse>() {
        public void onSuccess(HttpContext context, GetCreditCardResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getAddressAsync") getAddressAsync

> Get a customer's address


```java
void getAddressAsync(
        final String customerId,
        final String addressId,
        final APICallBack<GetAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| addressId |  ``` Required ```  | Address Id |


#### Example Usage

```java
String customerId = "customer_id";
String addressId = "address_id";
// Invoking the API call with sample inputs
customers.getAddressAsync(customerId, addressId, new APICallBack<GetAddressResponse>() {
    public void onSuccess(HttpContext context, GetAddressResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="delete_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.deleteAddressAsync") deleteAddressAsync

> Delete a Customer's address


```java
void deleteAddressAsync(
        final String customerId,
        final String addressId,
        final APICallBack<GetAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| addressId |  ``` Required ```  | Address Id |


#### Example Usage

```java
String customerId = "customer_id";
String addressId = "address_id";
// Invoking the API call with sample inputs
customers.deleteAddressAsync(customerId, addressId, new APICallBack<GetAddressResponse>() {
    public void onSuccess(HttpContext context, GetAddressResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="delete_credit_card_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.deleteCreditCardAsync") deleteCreditCardAsync

> Delete a customer's credit card


```java
void deleteCreditCardAsync(
        final String customerId,
        final String cardId,
        final APICallBack<GetCreditCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| cardId |  ``` Required ```  | Card Id |


#### Example Usage

```java
String customerId = "customer_id";
String cardId = "card_id";
// Invoking the API call with sample inputs
customers.deleteCreditCardAsync(customerId, cardId, new APICallBack<GetCreditCardResponse>() {
    public void onSuccess(HttpContext context, GetCreditCardResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.createAddressAsync") createAddressAsync

> Creates a new address for a customer


```java
void createAddressAsync(
        final String customerId,
        final CreateAddressRequest request,
        final APICallBack<GetAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| request |  ``` Required ```  | Request for creating an address |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    CreateAddressRequest request = new CreateAddressRequest();
    // Invoking the API call with sample inputs
    customers.createAddressAsync(customerId, request, new APICallBack<GetAddressResponse>() {
        public void onSuccess(HttpContext context, GetAddressResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_credit_card_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.getCreditCardAsync") getCreditCardAsync

> Get a customer's credit card


```java
void getCreditCardAsync(
        final String customerId,
        final String cardId,
        final APICallBack<GetCreditCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| cardId |  ``` Required ```  | Card id |


#### Example Usage

```java
String customerId = "customer_id";
String cardId = "card_id";
// Invoking the API call with sample inputs
customers.getCreditCardAsync(customerId, cardId, new APICallBack<GetCreditCardResponse>() {
    public void onSuccess(HttpContext context, GetCreditCardResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_credit_card_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.createCreditCardAsync") createCreditCardAsync

> Creates a new credit card for a customer


```java
void createCreditCardAsync(
        final String customerId,
        final CreateCreditCardRequest request,
        final APICallBack<GetCreditCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| request |  ``` Required ```  | Request for creating a credit card |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    CreateCreditCardRequest request = new CreateCreditCardRequest();
    // Invoking the API call with sample inputs
    customers.createCreditCardAsync(customerId, request, new APICallBack<GetCreditCardResponse>() {
        public void onSuccess(HttpContext context, GetCreditCardResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="update_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.CustomersController.updateCustomerAsync") updateCustomerAsync

> Updates a customer


```java
void updateCustomerAsync(
        final String customerId,
        final UpdateCustomerRequest request,
        final APICallBack<GetCustomerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| request |  ``` Required ```  | Request for updating a customer |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    UpdateCustomerRequest request = new UpdateCustomerRequest();
    // Invoking the API call with sample inputs
    customers.updateCustomerAsync(customerId, request, new APICallBack<GetCustomerResponse>() {
        public void onSuccess(HttpContext context, GetCustomerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

### <a name="subscriptions_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.SubscriptionsController") SubscriptionsController

#### Get singleton instance

The singleton instance of the ``` SubscriptionsController ``` class can be accessed from the API Client.

```java
SubscriptionsController subscriptions = client.getSubscriptions();
```

#### <a name="delete_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.deleteSubscriptionAsync") deleteSubscriptionAsync

> Cancels a subscription


```java
void deleteSubscriptionAsync(
        final String subscriptionId,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
// Invoking the API call with sample inputs
subscriptions.deleteSubscriptionAsync(subscriptionId, new APICallBack<GetSubscriptionResponse>() {
    public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_subscription_invoices_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.getSubscriptionInvoicesAsync") getSubscriptionInvoicesAsync

> Gets all invoices from a subscription


```java
void getSubscriptionInvoicesAsync(
        final String subscriptionId,
        final APICallBack<ListInvoicesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
// Invoking the API call with sample inputs
subscriptions.getSubscriptionInvoicesAsync(subscriptionId, new APICallBack<ListInvoicesResponse>() {
    public void onSuccess(HttpContext context, ListInvoicesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_subscription_items_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.getSubscriptionItemsAsync") getSubscriptionItemsAsync

> Gets all the items from a subscription


```java
void getSubscriptionItemsAsync(
        final String subscriptionId,
        final APICallBack<ListSubscriptionItemsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
// Invoking the API call with sample inputs
subscriptions.getSubscriptionItemsAsync(subscriptionId, new APICallBack<ListSubscriptionItemsResponse>() {
    public void onSuccess(HttpContext context, ListSubscriptionItemsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="update_subscription_billing_date_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.updateSubscriptionBillingDateAsync") updateSubscriptionBillingDateAsync

> Updates the billing date from a subscription


```java
void updateSubscriptionBillingDateAsync(
        final String subscriptionId,
        final UpdateSubscriptionBillingDateRequest request,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| request |  ``` Required ```  | Request for updating the subscription billing date |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateSubscriptionBillingDateRequest request = new UpdateSubscriptionBillingDateRequest();
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionBillingDateAsync(subscriptionId, request, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="create_usage_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.createUsageAsync") createUsageAsync

> Creates a usage


```java
void createUsageAsync(
        final String subscriptionId,
        final String itemId,
        final CreateUsageRequest body,
        final APICallBack<GetUsageResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| itemId |  ``` Required ```  | Item id |
| body |  ``` Required ```  | Request for creating a usage |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    String itemId = "item_id";
    CreateUsageRequest body = new CreateUsageRequest();
    // Invoking the API call with sample inputs
    subscriptions.createUsageAsync(subscriptionId, itemId, body, new APICallBack<GetUsageResponse>() {
        public void onSuccess(HttpContext context, GetUsageResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="update_subscription_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.updateSubscriptionItemAsync") updateSubscriptionItemAsync

> Updates a subscription item


```java
void updateSubscriptionItemAsync(
        final String subscriptionId,
        final String itemId,
        final UpdateSubscriptionItemRequest body,
        final APICallBack<GetSubscriptionItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| itemId |  ``` Required ```  | Item id |
| body |  ``` Required ```  | Request for updating a subscription item |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    String itemId = "item_id";
    UpdateSubscriptionItemRequest body = new UpdateSubscriptionItemRequest();
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionItemAsync(subscriptionId, itemId, body, new APICallBack<GetSubscriptionItemResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_subscriptions_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.getSubscriptionsAsync") getSubscriptionsAsync

> Gets all subscriptions


```java
void getSubscriptionsAsync(final APICallBack<ListSubscriptionsResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
subscriptions.getSubscriptionsAsync(new APICallBack<ListSubscriptionsResponse>() {
    public void onSuccess(HttpContext context, ListSubscriptionsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="update_subscription_credit_card_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.updateSubscriptionCreditCardAsync") updateSubscriptionCreditCardAsync

> Updates the credit card from a subscription


```java
void updateSubscriptionCreditCardAsync(
        final UpdateSubscriptionCreditCardRequest body,
        final String subscriptionId,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for updating a credit card |
| subscriptionId |  ``` Required ```  | Subscription id |


#### Example Usage

```java
try {
    UpdateSubscriptionCreditCardRequest body = new UpdateSubscriptionCreditCardRequest();
    String subscriptionId = "subscription_id";
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionCreditCardAsync(body, subscriptionId, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="create_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.createSubscriptionAsync") createSubscriptionAsync

> Creates a new subscription


```java
void createSubscriptionAsync(
        final CreateSubscriptionRequest body,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating a subscription |


#### Example Usage

```java
try {
    CreateSubscriptionRequest body = new CreateSubscriptionRequest();
    // Invoking the API call with sample inputs
    subscriptions.createSubscriptionAsync(body, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="create_subscription_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.createSubscriptionItemAsync") createSubscriptionItemAsync

> Creates a new Subscription item


```java
void createSubscriptionItemAsync(
        final CreateSubscriptionItemRequest body,
        final String subscriptionId,
        final APICallBack<GetSubscriptionItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating a subscription item |
| subscriptionId |  ``` Required ```  | Subscription id |


#### Example Usage

```java
try {
    CreateSubscriptionItemRequest body = new CreateSubscriptionItemRequest();
    String subscriptionId = "subscription_id";
    // Invoking the API call with sample inputs
    subscriptions.createSubscriptionItemAsync(body, subscriptionId, new APICallBack<GetSubscriptionItemResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="create_discount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.createDiscountAsync") createDiscountAsync

> Creates a discount


```java
void createDiscountAsync(
        final CreateDiscountRequest body,
        final String subscriptionId,
        final APICallBack<GetDiscountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating a discount |
| subscriptionId |  ``` Required ```  | Subscription id |


#### Example Usage

```java
try {
    CreateDiscountRequest body = new CreateDiscountRequest();
    String subscriptionId = "subscription_id";
    // Invoking the API call with sample inputs
    subscriptions.createDiscountAsync(body, subscriptionId, new APICallBack<GetDiscountResponse>() {
        public void onSuccess(HttpContext context, GetDiscountResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.getSubscriptionAsync") getSubscriptionAsync

> Gets a subscription


```java
void getSubscriptionAsync(
        final String subscriptionId,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
// Invoking the API call with sample inputs
subscriptions.getSubscriptionAsync(subscriptionId, new APICallBack<GetSubscriptionResponse>() {
    public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="update_subscription_payment_method_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.updateSubscriptionPaymentMethodAsync") updateSubscriptionPaymentMethodAsync

> Updates the payment method from a subscription


```java
void updateSubscriptionPaymentMethodAsync(
        final UpdateSubscriptionPaymentMethodRequest body,
        final String subscriptionId,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for updating the payment method from a subscription |
| subscriptionId |  ``` Required ```  | Subscription id |


#### Example Usage

```java
try {
    UpdateSubscriptionPaymentMethodRequest body = new UpdateSubscriptionPaymentMethodRequest();
    String subscriptionId = "subscription_id";
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionPaymentMethodAsync(body, subscriptionId, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_usages_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.getUsagesAsync") getUsagesAsync

> Lists all usages from a subscription item


```java
void getUsagesAsync(
        final String subscriptionId,
        final String itemId,
        final APICallBack<ListUsagesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| itemId |  ``` Required ```  | The subscription item id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String itemId = "item_id";
// Invoking the API call with sample inputs
subscriptions.getUsagesAsync(subscriptionId, itemId, new APICallBack<ListUsagesResponse>() {
    public void onSuccess(HttpContext context, ListUsagesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="delete_usage_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.deleteUsageAsync") deleteUsageAsync

> Deletes a usage


```java
void deleteUsageAsync(
        final String subscriptionId,
        final String itemId,
        final String usageId,
        final APICallBack<GetUsageResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| itemId |  ``` Required ```  | The subscription item id |
| usageId |  ``` Required ```  | The usage id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String itemId = "item_id";
String usageId = "usage_id";
// Invoking the API call with sample inputs
subscriptions.deleteUsageAsync(subscriptionId, itemId, usageId, new APICallBack<GetUsageResponse>() {
    public void onSuccess(HttpContext context, GetUsageResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="delete_discount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.deleteDiscountAsync") deleteDiscountAsync

> Deletes a discount


```java
void deleteDiscountAsync(
        final String subscriptionId,
        final String discountId,
        final APICallBack<GetDiscountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| discountId |  ``` Required ```  | Discount Id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String discountId = "discount_id";
// Invoking the API call with sample inputs
subscriptions.deleteDiscountAsync(subscriptionId, discountId, new APICallBack<GetDiscountResponse>() {
    public void onSuccess(HttpContext context, GetDiscountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="cancel_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.cancelSubscriptionAsync") cancelSubscriptionAsync

> Cancels a subscription


```java
void cancelSubscriptionAsync(
        final String subscriptionId,
        final CreateCancelSubscriptionRequest body,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| body |  ``` Optional ```  | Request for cancelling a subscription |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    CreateCancelSubscriptionRequest body = new CreateCancelSubscriptionRequest();
    // Invoking the API call with sample inputs
    subscriptions.cancelSubscriptionAsync(subscriptionId, body, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="delete_subscription_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.SubscriptionsController.deleteSubscriptionItemAsync") deleteSubscriptionItemAsync

> Deletes a subscription item


```java
void deleteSubscriptionItemAsync(
        final String subscriptionId,
        final String subscriptionItemId,
        final APICallBack<GetSubscriptionItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| subscriptionItemId |  ``` Required ```  | Subscription item id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String subscriptionItemId = "subscription_item_id";
// Invoking the API call with sample inputs
subscriptions.deleteSubscriptionItemAsync(subscriptionId, subscriptionItemId, new APICallBack<GetSubscriptionItemResponse>() {
    public void onSuccess(HttpContext context, GetSubscriptionItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="plans_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.PlansController") PlansController

#### Get singleton instance

The singleton instance of the ``` PlansController ``` class can be accessed from the API Client.

```java
PlansController plans = client.getPlans();
```

#### <a name="get_plan_items_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.getPlanItemsAsync") getPlanItemsAsync

> Gets all items from a plan


```java
void getPlanItemsAsync(
        final String planId,
        final APICallBack<ListPlanItemsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |


#### Example Usage

```java
String planId = "plan_id";
// Invoking the API call with sample inputs
plans.getPlanItemsAsync(planId, new APICallBack<ListPlanItemsResponse>() {
    public void onSuccess(HttpContext context, ListPlanItemsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="update_plan_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.updatePlanItemAsync") updatePlanItemAsync

> Updates a plan item


```java
void updatePlanItemAsync(
        final String planId,
        final String planItemId,
        final UpdatePlanItemRequest body,
        final APICallBack<GetPlanItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| planItemId |  ``` Required ```  | Plan item id |
| body |  ``` Required ```  | Request for updating the plan item |


#### Example Usage

```java
try {
    String planId = "plan_id";
    String planItemId = "plan_item_id";
    UpdatePlanItemRequest body = new UpdatePlanItemRequest();
    // Invoking the API call with sample inputs
    plans.updatePlanItemAsync(planId, planItemId, body, new APICallBack<GetPlanItemResponse>() {
        public void onSuccess(HttpContext context, GetPlanItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_plan_subscriptions_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.getPlanSubscriptionsAsync") getPlanSubscriptionsAsync

> Get all subscriptions from a plan


```java
void getPlanSubscriptionsAsync(
        final String planId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |


#### Example Usage

```java
String planId = "plan_id";
// Invoking the API call with sample inputs
plans.getPlanSubscriptionsAsync(planId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.getPlanAsync") getPlanAsync

> Gets a plan


```java
void getPlanAsync(
        final String planId,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |


#### Example Usage

```java
String planId = "plan_id";
// Invoking the API call with sample inputs
plans.getPlanAsync(planId, new APICallBack<GetPlanResponse>() {
    public void onSuccess(HttpContext context, GetPlanResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_plan_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.createPlanItemAsync") createPlanItemAsync

> Adds a new item to a plan


```java
void createPlanItemAsync(
        final CreatePlanItemRequest body,
        final String planId,
        final APICallBack<GetPlanItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating a plan item |
| planId |  ``` Required ```  | Plan id |


#### Example Usage

```java
try {
    CreatePlanItemRequest body = new CreatePlanItemRequest();
    String planId = "plan_id";
    // Invoking the API call with sample inputs
    plans.createPlanItemAsync(body, planId, new APICallBack<GetPlanItemResponse>() {
        public void onSuccess(HttpContext context, GetPlanItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="update_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.updatePlanAsync") updatePlanAsync

> Updates a plan


```java
void updatePlanAsync(
        final UpdatePlanRequest body,
        final String planId,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for updating a plan |
| planId |  ``` Required ```  | Plan id |


#### Example Usage

```java
try {
    UpdatePlanRequest body = new UpdatePlanRequest();
    String planId = "plan_id";
    // Invoking the API call with sample inputs
    plans.updatePlanAsync(body, planId, new APICallBack<GetPlanResponse>() {
        public void onSuccess(HttpContext context, GetPlanResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="create_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.createPlanAsync") createPlanAsync

> Creates a new plan


```java
void createPlanAsync(
        final CreatePlanRequest body,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating a plan |


#### Example Usage

```java
try {
    CreatePlanRequest body = new CreatePlanRequest();
    // Invoking the API call with sample inputs
    plans.createPlanAsync(body, new APICallBack<GetPlanResponse>() {
        public void onSuccess(HttpContext context, GetPlanResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


#### <a name="get_plans_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.getPlansAsync") getPlansAsync

> Gets all plans


```java
void getPlansAsync(final APICallBack<ListPlansResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
plans.getPlansAsync(new APICallBack<ListPlansResponse>() {
    public void onSuccess(HttpContext context, ListPlansResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="delete_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.deletePlanAsync") deletePlanAsync

> Deletes a plan


```java
void deletePlanAsync(
        final String planId,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |


#### Example Usage

```java
String planId = "plan_id";
// Invoking the API call with sample inputs
plans.deletePlanAsync(planId, new APICallBack<GetPlanResponse>() {
    public void onSuccess(HttpContext context, GetPlanResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_plan_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.getPlanItemAsync") getPlanItemAsync

> Gets a plan item


```java
void getPlanItemAsync(
        final String planId,
        final String planItemId,
        final APICallBack<GetPlanItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| planItemId |  ``` Required ```  | Plan item id |


#### Example Usage

```java
String planId = "plan_id";
String planItemId = "plan_item_id";
// Invoking the API call with sample inputs
plans.getPlanItemAsync(planId, planItemId, new APICallBack<GetPlanItemResponse>() {
    public void onSuccess(HttpContext context, GetPlanItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="delete_plan_item_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.PlansController.deletePlanItemAsync") deletePlanItemAsync

> Removes an item from a plan


```java
void deletePlanItemAsync(
        final String planId,
        final String planItemId,
        final APICallBack<GetPlanItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| planItemId |  ``` Required ```  | Plan item id |


#### Example Usage

```java
String planId = "plan_id";
String planItemId = "plan_item_id";
// Invoking the API call with sample inputs
plans.deletePlanItemAsync(planId, planItemId, new APICallBack<GetPlanItemResponse>() {
    public void onSuccess(HttpContext context, GetPlanItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="invoices_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.InvoicesController") InvoicesController

#### Get singleton instance

The singleton instance of the ``` InvoicesController ``` class can be accessed from the API Client.

```java
InvoicesController invoices = client.getInvoices();
```

#### <a name="cancel_invoice_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.InvoicesController.cancelInvoiceAsync") cancelInvoiceAsync

> Cancels an invoice


```java
void cancelInvoiceAsync(
        final String invoiceId,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| invoiceId |  ``` Required ```  | Invoice id |


#### Example Usage

```java
String invoiceId = "invoice_id";
// Invoking the API call with sample inputs
invoices.cancelInvoiceAsync(invoiceId, new APICallBack<GetInvoiceResponse>() {
    public void onSuccess(HttpContext context, GetInvoiceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_last_invoice_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.InvoicesController.getLastInvoiceChargeAsync") getLastInvoiceChargeAsync

> Gets the last charge from an invoice


```java
void getLastInvoiceChargeAsync(
        final String invoiceId,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| invoiceId |  ``` Required ```  | Invoice id |


#### Example Usage

```java
String invoiceId = "invoice_id";
// Invoking the API call with sample inputs
invoices.getLastInvoiceChargeAsync(invoiceId, new APICallBack<GetChargeResponse>() {
    public void onSuccess(HttpContext context, GetChargeResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_invoices_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.InvoicesController.getInvoicesAsync") getInvoicesAsync

> Gets all invoices


```java
void getInvoicesAsync(final APICallBack<ListInvoicesResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
invoices.getInvoicesAsync(new APICallBack<ListInvoicesResponse>() {
    public void onSuccess(HttpContext context, ListInvoicesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_invoice_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.InvoicesController.getInvoiceAsync") getInvoiceAsync

> Gets an invoice


```java
void getInvoiceAsync(
        final String invoiceId,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| invoiceId |  ``` Required ```  | Invoice Id |


#### Example Usage

```java
String invoiceId = "invoice_id";
// Invoking the API call with sample inputs
invoices.getInvoiceAsync(invoiceId, new APICallBack<GetInvoiceResponse>() {
    public void onSuccess(HttpContext context, GetInvoiceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

### <a name="orders_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.mundipagg.api.controllers.OrdersController") OrdersController

#### Get singleton instance

The singleton instance of the ``` OrdersController ``` class can be accessed from the API Client.

```java
OrdersController orders = client.getOrders();
```

#### <a name="get_order_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.getOrderAsync") getOrderAsync

> Gets an order


```java
void getOrderAsync(
        final String orderId,
        final APICallBack<GetOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order id |


#### Example Usage

```java
String orderId = "order_id";
// Invoking the API call with sample inputs
orders.getOrderAsync(orderId, new APICallBack<GetOrderResponse>() {
    public void onSuccess(HttpContext context, GetOrderResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="get_orders_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.getOrdersAsync") getOrdersAsync

> Gets all orders


```java
void getOrdersAsync(final APICallBack<ListOrderResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
orders.getOrdersAsync(new APICallBack<ListOrderResponse>() {
    public void onSuccess(HttpContext context, ListOrderResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


#### <a name="create_order_async"></a>![Method: ](https://apidocs.io/img/method.png "com.mundipagg.api.controllers.OrdersController.createOrderAsync") createOrderAsync

> Creates a new Order


```java
void createOrderAsync(
        final CreateOrderRequest body,
        final APICallBack<GetOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating an order |


#### Example Usage

```java
try {
    CreateOrderRequest body = new CreateOrderRequest();
    // Invoking the API call with sample inputs
    orders.createOrderAsync(body, new APICallBack<GetOrderResponse>() {
        public void onSuccess(HttpContext context, GetOrderResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)



