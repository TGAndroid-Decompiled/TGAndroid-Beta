package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xe0 implements Runnable {
    public final int f43086a;
    public final Object f43087b;
    public final Object f43088c;
    public final Object d;

    public xe0(Object obj, Object obj2, Object obj3, int i10) {
        this.f43086a = i10;
        this.f43087b = obj;
        this.f43088c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xe0.run():void");
    }

    public xe0(nf0 nf0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f43086a = 3;
        this.f43087b = nf0Var;
        this.d = tLObject;
        this.f43088c = tL_error;
    }
}
