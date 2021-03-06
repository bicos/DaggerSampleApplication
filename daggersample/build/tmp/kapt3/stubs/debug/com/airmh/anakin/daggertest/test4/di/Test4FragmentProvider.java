package com.airmh.anakin.daggertest.test4.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/airmh/anakin/daggertest/test4/di/Test4FragmentProvider;", "", "()V", "bindTest4Fragment", "Lcom/airmh/anakin/daggertest/test4/Test4Fragment;", "daggersample_debug"})
@dagger.Module()
public abstract class Test4FragmentProvider {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.airmh.anakin.daggertest.test4.di.Test4FragmentModule.class})
    public abstract com.airmh.anakin.daggertest.test4.Test4Fragment bindTest4Fragment();
    
    public Test4FragmentProvider() {
        super();
    }
}