package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class y80 implements Runnable {
    public final int f43744a = 1;
    public final LaunchActivity f43745b;
    public final byte[] f43746c;
    public final int d;
    public final Integer e;
    public final String f43747f;
    public final int h;
    public final long f43748n;
    public final Object f43749r;
    public final Object f43750s;
    public final Object v;

    public y80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, k0 k0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f43745b = launchActivity;
        this.f43749r = bundle;
        this.f43746c = bArr;
        this.d = i10;
        this.e = num;
        this.f43747f = str;
        this.h = i11;
        this.f43748n = j10;
        this.f43750s = k0Var;
        this.v = o2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y80.run():void");
    }

    public y80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f43745b = launchActivity;
        this.f43749r = tLObject;
        this.e = num;
        this.f43750s = num2;
        this.f43746c = bArr;
        this.f43748n = j10;
        this.v = runnable;
        this.f43747f = str;
        this.d = i10;
        this.h = i11;
    }
}
