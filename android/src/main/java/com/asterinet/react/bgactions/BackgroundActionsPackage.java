package com.asterinet.react.bgactions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import androidx.annotation.NonNull;

@SuppressWarnings("unused")
public class BackgroundActionsPackage implements ReactPackage {
    @Override
    public @NonNull List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactContext) {
        //noinspection ArraysAsListWithZeroOrOneArgument
        List<NativeModule> modules = new ArrayList<>();

		modules.add(new RNPassKitModule(reactContext));
        modules.add(new BackgroundActionsModule(reactContext));

        return modules;
    }

    @Override
    public @NonNull List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}