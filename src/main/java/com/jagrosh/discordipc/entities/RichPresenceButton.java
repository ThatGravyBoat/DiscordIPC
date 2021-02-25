/*
 * Copyright 2017 John Grosh (john.a.grosh@gmail.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jagrosh.discordipc.entities;

/**
 * Changes from ThatGravyBoat: https://github.com/ThatGravyboat/DiscordIPC/commit/f689cd53003fbfd3a306e10e30645df72cb7ed81
 */
public class RichPresenceButton {
    private final String url;
    private final String label;

    public RichPresenceButton(String url, String label) {
        this.url = url;
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }

    public String getUrl(){
        return this.url;
    }
}
