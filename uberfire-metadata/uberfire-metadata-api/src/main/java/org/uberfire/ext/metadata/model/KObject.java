/*
 * Copyright 2015 JBoss, by Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.ext.metadata.model;

public interface KObject extends KObjectKey,
                                 PropertyBag {

    /**
     * Flag indicating whether a "full text" entry should be created for the KObject.
     * This should be true for "default indexing", i.e. that supported out of the box; however
     * additional indexers should not create additional "full text" entries.
     * @return
     * @see org.uberfire.ext.metadata.engine.MetaIndexEngine#FULL_TEXT_FIELD
     * @see org.uberfire.ext.metadata.engine.Indexer
     */
    boolean fullText();

}

