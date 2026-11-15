package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class z60 implements Runnable {
    public final int f53850a = 1;
    public final LaunchActivity f53851b;
    public final byte[] f53852c;
    public final int d;
    public final Integer f53853e;
    public final String f53854f;
    public final int h;
    public final long f53855n;
    public final Object f53856r;
    public final Object f53857s;
    public final Object f53858w;

    public z60(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f53851b = launchActivity;
        this.f53856r = bundle;
        this.f53852c = bArr;
        this.d = i7;
        this.f53853e = num;
        this.f53854f = str;
        this.h = i10;
        this.f53855n = j3;
        this.f53857s = j0Var;
        this.f53858w = e2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z60.run():void");
    }

    public z60(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f53851b = launchActivity;
        this.f53856r = tLObject;
        this.f53853e = num;
        this.f53857s = num2;
        this.f53852c = bArr;
        this.f53855n = j3;
        this.f53858w = runnable;
        this.f53854f = str;
        this.d = i7;
        this.h = i10;
    }
}
