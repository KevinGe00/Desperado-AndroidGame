/*
 *
 *  * Copyright (C) 2018 Antonio Leiva Gordillo.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.example.game.Login;

/**
 * Interface that specifies methods that every login UI must implement
 */
public interface LoginView {
    /**
     * Displays an error in this activity when login info is incorrect
     */
    void displayError();

    /**
     * Displays an error in this activity when the user name is invalid upon sign up attempt
     */
    void displayInvalidUser();

    /**
     * Goes to the default page of the app if the user has logged in or is logged in
     */
    void navigateToHome();
}
