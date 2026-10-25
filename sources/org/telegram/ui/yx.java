package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class yx implements Runnable {
    public final int f46121a;
    public final int f46122b;
    public final Object f46123c;
    public final Object d;

    public yx(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.l0 l0Var) {
        this.f46121a = 15;
        this.f46122b = i10;
        this.f46123c = callback;
        this.d = l0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx.run():void");
    }

    public yx(Object obj, int i10, Object obj2, int i11) {
        this.f46121a = i11;
        this.f46123c = obj;
        this.f46122b = i10;
        this.d = obj2;
    }

    public yx(Object obj, Object obj2, int i10, int i11) {
        this.f46121a = i11;
        this.f46123c = obj;
        this.d = obj2;
        this.f46122b = i10;
    }
}
