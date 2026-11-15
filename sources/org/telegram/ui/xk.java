package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xk extends mq0 {
    public final org.telegram.messenger.gj f53256a;
    public final org.telegram.messenger.ff f53257b;
    public final an f53258c;

    public xk(an anVar, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar) {
        this.f53258c = anVar;
        this.f53256a = gjVar;
        this.f53257b = ffVar;
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return an.P1(this.f53258c, this.f53256a, null, i7, z10, true);
    }

    @Override
    public final boolean P() {
        an anVar = this.f53258c;
        if (anVar.f45118a0 != null && anVar.V9()) {
            anVar.f45118a0.S();
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.messenger.gj V() {
        org.telegram.messenger.gj gjVar = this.f53258c.G5;
        org.telegram.messenger.gj gjVar2 = this.f53256a;
        if (gjVar == gjVar2) {
            return gjVar2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f53258c.f45118a0.v1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        an anVar = this.f53258c;
        if (anVar.G5 != this.f53256a) {
            return;
        }
        org.telegram.messenger.ff ffVar = this.f53257b;
        if (!ffVar.f27726w && !ffVar.v && !ffVar.f27725u && g20Var == null) {
            anVar.f45118a0.j0();
        } else {
            anVar.u(ffVar, g20Var, z10, i10, 0, z11, 0L);
        }
    }
}
