package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class v60 implements Runnable {
    public final int f50405a = 1;
    public final LaunchActivity f50406b;
    public final byte[] f50407c;
    public final int d;
    public final Integer f50408e;
    public final String f50409f;
    public final int h;
    public final long f50410n;
    public final Object f50411r;
    public final Object f50412s;
    public final Object f50413w;

    public v60(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i3, Integer num, String str, int i10, long j10, k0 k0Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f50406b = launchActivity;
        this.f50411r = bundle;
        this.f50407c = bArr;
        this.d = i3;
        this.f50408e = num;
        this.f50409f = str;
        this.h = i10;
        this.f50410n = j10;
        this.f50412s = k0Var;
        this.f50413w = d2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v60.run():void");
    }

    public v60(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i3, int i10) {
        this.f50406b = launchActivity;
        this.f50411r = tLObject;
        this.f50408e = num;
        this.f50412s = num2;
        this.f50407c = bArr;
        this.f50410n = j10;
        this.f50413w = runnable;
        this.f50409f = str;
        this.d = i3;
        this.h = i10;
    }
}
