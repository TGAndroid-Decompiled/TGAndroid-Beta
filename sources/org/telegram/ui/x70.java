package org.telegram.ui;

import android.app.Activity;
public final class x70 implements Runnable {
    public final int f43112a;
    public final boolean f43113b;
    public final Object f43114c;
    public final Object d;

    public x70(Object obj, Object obj2, boolean z10, int i10) {
        this.f43112a = i10;
        this.f43114c = obj;
        this.d = obj2;
        this.f43113b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x70.run():void");
    }

    public x70(Object obj, boolean z10, Object obj2, int i10) {
        this.f43112a = i10;
        this.f43114c = obj;
        this.f43113b = z10;
        this.d = obj2;
    }

    public x70(org.telegram.ui.ActionBar.b2 b2Var, boolean z10, Activity activity) {
        this.f43112a = 9;
        this.d = b2Var;
        this.f43113b = z10;
        this.f43114c = activity;
    }
}
