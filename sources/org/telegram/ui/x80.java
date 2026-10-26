package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class x80 implements Runnable {
    public final int f45694a = 1;
    public final LaunchActivity f45695b;
    public final byte[] f45696c;
    public final int d;
    public final Integer e;
    public final String f45697f;
    public final int h;
    public final long f45698n;
    public final Object f45699r;
    public final Object f45700s;
    public final Object v;

    public x80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, j0 j0Var, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f45695b = launchActivity;
        this.f45699r = bundle;
        this.f45696c = bArr;
        this.d = i10;
        this.e = num;
        this.f45697f = str;
        this.h = i11;
        this.f45698n = j10;
        this.f45700s = j0Var;
        this.v = r2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x80.run():void");
    }

    public x80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.f45695b = launchActivity;
        this.f45699r = tLObject;
        this.e = num;
        this.f45700s = num2;
        this.f45696c = bArr;
        this.f45698n = j10;
        this.v = runnable;
        this.f45697f = str;
        this.d = i10;
        this.h = i11;
    }
}
