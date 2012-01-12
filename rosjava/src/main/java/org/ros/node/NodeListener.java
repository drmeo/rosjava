/*
 * Copyright (C) 2011 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.ros.node;

/**
 * A listener for lifecycle events on a {@link Node}.
 * 
 * @author Keith M. Hughes
 */
public interface NodeListener {

  /**
   * Called when the {@link Node} has been started.
   * 
   * @param node
   *          the {@link Node} that has been started
   */
  void onStart(Node node);

  /**
   * Called when the {@link Node} has started shutting down. Shutdown will be
   * delayed, although not indefinitely, until all {@link NodeListener}s have
   * returned from this method.
   * 
   * <p>
   * Since this method can potentially delay {@link Node} shutdown, it is
   * preferred to use {@link #onShutdownComplete(Node)} when {@link Node}
   * resources are not required during the method call.
   * 
   * @param node
   *          the {@link Node} that has started shutting down
   */
  void onShutdown(Node node);

  /**
   * Called when the {@link Node} has shut down.
   * 
   * @param node
   *          the {@link Node} that has shut down
   */
  void onShutdownComplete(Node node);
}
