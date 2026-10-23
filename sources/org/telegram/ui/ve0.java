package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ve0 implements Runnable {
    public final int f42224a;
    public final Object f42225b;
    public final Object f42226c;
    public final Object d;

    public ve0(Object obj, Object obj2, Object obj3, int i10) {
        this.f42224a = i10;
        this.f42225b = obj;
        this.f42226c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ve0.run():void");
    }

    public ve0(mf0 mf0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f42224a = 3;
        this.f42225b = mf0Var;
        this.d = tLObject;
        this.f42226c = tL_error;
    }
}
