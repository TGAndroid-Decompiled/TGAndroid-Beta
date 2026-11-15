package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
public final class z60 implements Runnable {
    public final int f53885a = 1;
    public final LaunchActivity f53886b;
    public final byte[] f53887c;
    public final int d;
    public final Integer f53888e;
    public final String f53889f;
    public final int h;
    public final long f53890n;
    public final Object f53891r;
    public final Object f53892s;
    public final Object f53893w;

    public z60(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f53886b = launchActivity;
        this.f53891r = bundle;
        this.f53887c = bArr;
        this.d = i7;
        this.f53888e = num;
        this.f53889f = str;
        this.h = i10;
        this.f53890n = j3;
        this.f53892s = j0Var;
        this.f53893w = e2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z60.run():void");
    }

    public z60(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.f53886b = launchActivity;
        this.f53891r = tLObject;
        this.f53888e = num;
        this.f53892s = num2;
        this.f53887c = bArr;
        this.f53890n = j3;
        this.f53893w = runnable;
        this.f53889f = str;
        this.d = i7;
        this.h = i10;
    }
}
