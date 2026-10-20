package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class s80 implements Runnable {
    public final int f41396a = 1;
    public final LaunchActivity f41397b;
    public final byte[] f41398c;
    public final int d;
    public final Integer e;
    public final String f41399f;
    public final int h;
    public final long f41400n;
    public final Object f41401r;
    public final Object f41402s;
    public final Object v;

    public s80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, l0 l0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f41397b = launchActivity;
        this.f41401r = bundle;
        this.f41398c = bArr;
        this.d = i10;
        this.e = num;
        this.f41399f = str;
        this.h = i11;
        this.f41400n = j10;
        this.f41402s = l0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s80.run():void");
    }

    public s80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f41397b = launchActivity;
        this.f41401r = tLObject;
        this.e = num;
        this.f41402s = num2;
        this.f41398c = bArr;
        this.f41400n = j10;
        this.v = runnable;
        this.f41399f = str;
        this.d = i10;
        this.h = i11;
    }
}
