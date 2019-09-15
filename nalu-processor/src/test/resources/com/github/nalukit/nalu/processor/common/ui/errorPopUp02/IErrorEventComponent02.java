/*
 * Copyright (c) 2018 - 2019 - Frank Hossfeld
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 */

package com.github.nalukit.nalu.processor.common.ui.errorPopUp02;

import com.github.nalukit.nalu.client.component.IsComponent;
import com.github.nalukit.nalu.client.component.IsErrorPopUpComponent;
import com.github.nalukit.nalu.processor.common.ui.errorPopUp02.IErrorEventComponent02.Controller;

public interface IErrorEventComponent02
    extends IsErrorPopUpComponent<IErrorEventComponent02.Controller> {

  interface Controller
      extends IsErrorPopUpComponent.Controller {

  }
}
