package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xk extends mq0 {
    public final org.telegram.messenger.gj f53255a;
    public final org.telegram.messenger.ff f53256b;
    public final an f53257c;

    public xk(an anVar, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar) {
        this.f53257c = anVar;
        this.f53255a = gjVar;
        this.f53256b = ffVar;
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return an.P1(this.f53257c, this.f53255a, null, i7, z10, true);
    }

    @Override
    public final boolean P() {
        an anVar = this.f53257c;
        if (anVar.f45117a0 != null && anVar.V9()) {
            anVar.f45117a0.S();
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.messenger.gj V() {
        org.telegram.messenger.gj gjVar = this.f53257c.G5;
        org.telegram.messenger.gj gjVar2 = this.f53255a;
        if (gjVar == gjVar2) {
            return gjVar2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f53257c.f45117a0.v1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        an anVar = this.f53257c;
        if (anVar.G5 != this.f53255a) {
            return;
        }
        org.telegram.messenger.ff ffVar = this.f53256b;
        if (!ffVar.f27728w && !ffVar.v && !ffVar.f27727u && g20Var == null) {
            anVar.f45117a0.j0();
        } else {
            anVar.u(ffVar, g20Var, z10, i10, 0, z11, 0L);
        }
    }
}
