package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class u80 implements Runnable {
    public final int f41889a = 1;
    public final LaunchActivity f41890b;
    public final byte[] f41891c;
    public final int d;
    public final Integer e;
    public final String f41892f;
    public final int h;
    public final long f41893n;
    public final Object f41894r;
    public final Object f41895s;
    public final Object v;

    public u80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, l0 l0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f41890b = launchActivity;
        this.f41894r = bundle;
        this.f41891c = bArr;
        this.d = i10;
        this.e = num;
        this.f41892f = str;
        this.h = i11;
        this.f41893n = j10;
        this.f41895s = l0Var;
        this.v = n2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u80.run():void");
    }

    public u80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f41890b = launchActivity;
        this.f41894r = tLObject;
        this.e = num;
        this.f41895s = num2;
        this.f41891c = bArr;
        this.f41893n = j10;
        this.v = runnable;
        this.f41892f = str;
        this.d = i10;
        this.h = i11;
    }
}
