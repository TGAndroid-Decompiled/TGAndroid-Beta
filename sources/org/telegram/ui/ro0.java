package org.telegram.ui;

import android.view.View;
public final class ro0 extends org.telegram.ui.Components.c81 {
    public final np0 f37935a;

    public ro0(np0 np0Var) {
        this.f37935a = np0Var;
    }

    @Override
    public final View d(int i10) {
        np0 np0Var = this.f37935a;
        if (i10 == 1) {
            return np0Var.h;
        }
        if (i10 == 0) {
            return np0Var.f36565n;
        }
        return null;
    }

    @Override
    public final int e() {
        return 2;
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
