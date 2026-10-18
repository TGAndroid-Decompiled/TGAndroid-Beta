package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xe0 implements Runnable {
    public final int f43122a;
    public final Object f43123b;
    public final Object f43124c;
    public final Object d;

    public xe0(Object obj, Object obj2, Object obj3, int i10) {
        this.f43122a = i10;
        this.f43123b = obj;
        this.f43124c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xe0.run():void");
    }

    public xe0(of0 of0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f43122a = 3;
        this.f43123b = of0Var;
        this.d = tLObject;
        this.f43124c = tL_error;
    }
}
