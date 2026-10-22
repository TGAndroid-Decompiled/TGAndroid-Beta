package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ve0 implements Runnable {
    public final int f42223a;
    public final Object f42224b;
    public final Object f42225c;
    public final Object d;

    public ve0(Object obj, Object obj2, Object obj3, int i10) {
        this.f42223a = i10;
        this.f42224b = obj;
        this.f42225c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ve0.run():void");
    }

    public ve0(mf0 mf0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f42223a = 3;
        this.f42224b = mf0Var;
        this.d = tLObject;
        this.f42225c = tL_error;
    }
}
