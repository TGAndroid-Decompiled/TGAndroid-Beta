package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ve0 implements Runnable {
    public final int f42214a;
    public final Object f42215b;
    public final Object f42216c;
    public final Object d;

    public ve0(Object obj, Object obj2, Object obj3, int i10) {
        this.f42214a = i10;
        this.f42215b = obj;
        this.f42216c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ve0.run():void");
    }

    public ve0(mf0 mf0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f42214a = 3;
        this.f42215b = mf0Var;
        this.d = tLObject;
        this.f42216c = tL_error;
    }
}
