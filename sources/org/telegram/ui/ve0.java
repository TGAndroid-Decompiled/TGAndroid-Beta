package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ve0 implements Runnable {
    public final int f42215a;
    public final Object f42216b;
    public final Object f42217c;
    public final Object d;

    public ve0(Object obj, Object obj2, Object obj3, int i10) {
        this.f42215a = i10;
        this.f42216b = obj;
        this.f42217c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ve0.run():void");
    }

    public ve0(lf0 lf0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f42215a = 3;
        this.f42216b = lf0Var;
        this.d = tLObject;
        this.f42217c = tL_error;
    }
}
