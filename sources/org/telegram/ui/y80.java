package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class y80 implements Runnable {
    public final int f43784a = 1;
    public final LaunchActivity f43785b;
    public final byte[] f43786c;
    public final int d;
    public final Integer e;
    public final String f43787f;
    public final int h;
    public final long f43788n;
    public final Object f43789r;
    public final Object f43790s;
    public final Object v;

    public y80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, k0 k0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f43785b = launchActivity;
        this.f43789r = bundle;
        this.f43786c = bArr;
        this.d = i10;
        this.e = num;
        this.f43787f = str;
        this.h = i11;
        this.f43788n = j10;
        this.f43790s = k0Var;
        this.v = o2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y80.run():void");
    }

    public y80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f43785b = launchActivity;
        this.f43789r = tLObject;
        this.e = num;
        this.f43790s = num2;
        this.f43786c = bArr;
        this.f43788n = j10;
        this.v = runnable;
        this.f43787f = str;
        this.d = i10;
        this.h = i11;
    }
}
