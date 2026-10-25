package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class x80 implements Runnable {
    public final int f45691a = 1;
    public final LaunchActivity f45692b;
    public final byte[] f45693c;
    public final int d;
    public final Integer e;
    public final String f45694f;
    public final int h;
    public final long f45695n;
    public final Object f45696r;
    public final Object f45697s;
    public final Object v;

    public x80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, j0 j0Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f45692b = launchActivity;
        this.f45696r = bundle;
        this.f45693c = bArr;
        this.d = i10;
        this.e = num;
        this.f45694f = str;
        this.h = i11;
        this.f45695n = j10;
        this.f45697s = j0Var;
        this.v = r2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x80.run():void");
    }

    public x80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f45692b = launchActivity;
        this.f45696r = tLObject;
        this.e = num;
        this.f45697s = num2;
        this.f45693c = bArr;
        this.f45695n = j10;
        this.v = runnable;
        this.f45694f = str;
        this.d = i10;
        this.h = i11;
    }
}
