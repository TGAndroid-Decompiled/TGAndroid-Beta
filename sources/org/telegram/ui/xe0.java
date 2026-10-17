package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xe0 implements Runnable {
    public final int f43102a;
    public final Object f43103b;
    public final Object f43104c;
    public final Object d;

    public xe0(Object obj, Object obj2, Object obj3, int i10) {
        this.f43102a = i10;
        this.f43103b = obj;
        this.f43104c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xe0.run():void");
    }

    public xe0(of0 of0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f43102a = 3;
        this.f43103b = of0Var;
        this.d = tLObject;
        this.f43104c = tL_error;
    }
}
