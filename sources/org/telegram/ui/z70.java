package org.telegram.ui;

import android.app.Activity;
public final class z70 implements Runnable {
    public final int f43673a;
    public final boolean f43674b;
    public final Object f43675c;
    public final Object d;

    public z70(Object obj, Object obj2, boolean z10, int i10) {
        this.f43673a = i10;
        this.f43675c = obj;
        this.d = obj2;
        this.f43674b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z70.run():void");
    }

    public z70(Object obj, boolean z10, Object obj2, int i10) {
        this.f43673a = i10;
        this.f43675c = obj;
        this.f43674b = z10;
        this.d = obj2;
    }

    public z70(org.telegram.ui.ActionBar.b2 b2Var, boolean z10, Activity activity) {
        this.f43673a = 9;
        this.d = b2Var;
        this.f43674b = z10;
        this.f43675c = activity;
    }
}
