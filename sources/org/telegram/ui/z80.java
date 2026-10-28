package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class z80 implements Runnable {
    public final int f46191a = 1;
    public final LaunchActivity f46192b;
    public final byte[] f46193c;
    public final int d;
    public final Integer e;
    public final String f46194f;
    public final int h;
    public final long f46195n;
    public final Object f46196r;
    public final Object f46197s;
    public final Object v;

    public z80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, j0 j0Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f46192b = launchActivity;
        this.f46196r = bundle;
        this.f46193c = bArr;
        this.d = i10;
        this.e = num;
        this.f46194f = str;
        this.h = i11;
        this.f46195n = j10;
        this.f46197s = j0Var;
        this.v = r2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z80.run():void");
    }

    public z80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f46192b = launchActivity;
        this.f46196r = tLObject;
        this.e = num;
        this.f46197s = num2;
        this.f46193c = bArr;
        this.f46195n = j10;
        this.v = runnable;
        this.f46194f = str;
        this.d = i10;
        this.h = i11;
    }
}
