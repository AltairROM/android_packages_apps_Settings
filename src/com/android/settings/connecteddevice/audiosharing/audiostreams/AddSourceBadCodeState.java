/*
 * Copyright (C) 2024 The Android Open Source Project
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

package com.android.settings.connecteddevice.audiosharing.audiostreams;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

import com.android.settings.R;

class AddSourceBadCodeState extends SyncedState {
    @VisibleForTesting
    static final int AUDIO_STREAM_ADD_SOURCE_BAD_CODE_STATE_SUMMARY =
            R.string.audio_streams_add_source_bad_code_state_summary;

    @Nullable private static AddSourceBadCodeState sInstance = null;

    AddSourceBadCodeState() {}

    static AddSourceBadCodeState getInstance() {
        if (sInstance == null) {
            sInstance = new AddSourceBadCodeState();
        }
        return sInstance;
    }

    @Override
    int getSummary() {
        return AUDIO_STREAM_ADD_SOURCE_BAD_CODE_STATE_SUMMARY;
    }

    @Override
    AudioStreamsProgressCategoryController.AudioStreamState getStateEnum() {
        return AudioStreamsProgressCategoryController.AudioStreamState.ADD_SOURCE_BAD_CODE;
    }
}
