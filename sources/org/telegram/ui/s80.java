package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class s80 implements Runnable {
    public final int f41399a = 1;
    public final LaunchActivity f41400b;
    public final byte[] f41401c;
    public final int d;
    public final Integer e;
    public final String f41402f;
    public final int h;
    public final long f41403n;
    public final Object f41404r;
    public final Object f41405s;
    public final Object v;

    public s80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, l0 l0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f41400b = launchActivity;
        this.f41404r = bundle;
        this.f41401c = bArr;
        this.d = i10;
        this.e = num;
        this.f41402f = str;
        this.h = i11;
        this.f41403n = j10;
        this.f41405s = l0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s80.run():void");
    }

    public s80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f41400b = launchActivity;
        this.f41404r = tLObject;
        this.e = num;
        this.f41405s = num2;
        this.f41401c = bArr;
        this.f41403n = j10;
        this.v = runnable;
        this.f41402f = str;
        this.d = i10;
        this.h = i11;
    }
}
