<?xml version="1.0" encoding="utf-8"?>
<!--
/*
**
** Copyright 2008, The Android Open Source Project
**
** Licensed under the Apache License, Version 2.0 (the "License");
** you may not use this file except in compliance with the License.
** You may obtain a copy of the License at
**
**     http://www.apache.org/licenses/LICENSE-2.0
**
** Unless required by applicable law or agreed to in writing, software
** distributed under the License is distributed on an "AS IS" BASIS,
** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
** See the License for the specific language governing permissions and
** limitations under the License.
*/
-->

<Keyboard xmlns:android="http://schemas.android.com/apk/res/android"
    android:keyWidth="10%p"
    android:horizontalGap="@dimen/password_keyboard_horizontalGap"
    android:verticalGap="@dimen/password_keyboard_verticalGap"
    android:keyHeight="@dimen/password_keyboard_key_height_alpha"
    >

    <Row>
        <Key android:keyLabel="q" android:keyEdgeFlags="left"/>
        <Key android:keyLabel="w"/>
        <Key android:keyLabel="e"/>
        <Key android:keyLabel="r"/>
        <Key android:keyLabel="t"/>
        <Key android:keyLabel="y"/>
        <Key android:keyLabel="u"/>
        <Key android:keyLabel="i"/>
        <Key android:keyLabel="o"/>
        <Key android:keyLabel="p" android:keyEdgeFlags="right"/>
    </Row>

    <Row>
        <Key android:keyLabel="a" android:horizontalGap="5%p" android:keyEdgeFlags="left"/>
        <Key android:keyLabel="s"/>
        <Key android:keyLabel="d"/>
        <Key android:keyLabel="f"/>
        <Key android:keyLabel="g"/>
        <Key android:keyLabel="h"/>
        <Key android:keyLabel="j"/>
        <Key android:keyLabel="k"/>
        <Key android:keyLabel="l" android:keyEdgeFlags="right"/>
    </Row>

    <Row>
        <Key android:codes="-1" android:keyIcon="@drawable/sym_keyboard_shift"
            android:keyWidth="15%p" android:isModifier="true"
            android:iconPreview="@drawable/sym_keyboard_feedback_shift"
            android:isSticky="true" android:keyEdgeFlags="left"/>
        <Key android:keyLabel="z"/>
        <Key android:keyLabel="x"/>
        <Key android:keyLabel="c"/>
        <Key android:keyLabel="v"/>
        <Key android:keyLabel="b"/>
        <Key android:keyLabel="n"/>
        <Key android:keyLabel="m"/>
        <Key android:codes="-5" android:keyIcon="@drawable/sym_keyboard_delete"
            android:keyWidth="15%p" android:keyEdgeFlags="right"
            android:iconPreview="@drawable/sym_keyboard_feedback_delete"
            android:isRepeatable="true"/>
    </Row>

    <Row android:keyboardMode="@+id/mode_normal" android:rowEdgeFlags="bottom">
        <Key android:codes="-2" android:keyLabel="@string/password_keyboard_label_symbol_key"
            android:keyWidth="20%p" android:keyEdgeFlags="left"/>
        <Key android:keyLabel="," />
        <Key android:keyLabel="-" />
        <Key android:codes="32" android:keyIcon="@drawable/sym_keyboard_space"
            android:iconPreview="@drawable/sym_keyboard_feedback_space"
            android:keyWidth="20%p"/>
        <Key android:keyLabel="=" />
        <Key android:keyLabel="." android:keyWidth="10%p"/>
        <Key android:codes="10" android:keyIcon="@drawable/sym_keyboard_ok"
            android:iconPreview="@drawable/sym_keyboard_feedback_ok"
            android:keyWidth="20%p" android:keyEdgeFlags="right"/>
    </Row>

</Keyboard>

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 