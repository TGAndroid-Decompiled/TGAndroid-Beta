package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class s80 implements Runnable {
    public final int f42311a = 1;
    public final LaunchActivity f42312b;
    public final byte[] f42313c;
    public final int d;
    public final Integer f42314e;
    public final String f42315f;
    public final int h;
    public final long f42316n;
    public final Object f42317r;
    public final Object f42318s;
    public final Object v;

    public s80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, m0 m0Var, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f42312b = launchActivity;
        this.f42317r = bundle;
        this.f42313c = bArr;
        this.d = i10;
        this.f42314e = num;
        this.f42315f = str;
        this.h = i11;
        this.f42316n = j10;
        this.f42318s = m0Var;
        this.v = o2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s80.run():void");
    }

    public s80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f42312b = launchActivity;
        this.f42317r = tLObject;
        this.f42314e = num;
        this.f42318s = num2;
        this.f42313c = bArr;
        this.f42316n = j10;
        this.v = runnable;
        this.f42315f = str;
        this.d = i10;
        this.h = i11;
    }
}
