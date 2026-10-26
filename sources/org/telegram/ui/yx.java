package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class yx implements Runnable {
    public final int f46124a;
    public final int f46125b;
    public final Object f46126c;
    public final Object d;

    public yx(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.l0 l0Var) {
        this.f46124a = 15;
        this.f46125b = i10;
        this.f46126c = callback;
        this.d = l0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx.run():void");
    }

    public yx(Object obj, int i10, Object obj2, int i11) {
        this.f46124a = i11;
        this.f46126c = obj;
        this.f46125b = i10;
        this.d = obj2;
    }

    public yx(Object obj, Object obj2, int i10, int i11) {
        this.f46124a = i11;
        this.f46126c = obj;
        this.d = obj2;
        this.f46125b = i10;
    }
}
