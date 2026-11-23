package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yk extends oq0 {
    public final org.telegram.messenger.gj f54223a;
    public final org.telegram.messenger.ff f54224b;
    public final bn f54225c;

    public yk(bn bnVar, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar) {
        this.f54225c = bnVar;
        this.f54223a = gjVar;
        this.f54224b = ffVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return bn.P1(this.f54225c, this.f54223a, null, i7, z10, true);
    }

    @Override
    public final boolean P() {
        bn bnVar = this.f54225c;
        if (bnVar.f45950a0 != null && bnVar.V9()) {
            bnVar.f45950a0.U();
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.messenger.gj V() {
        org.telegram.messenger.gj gjVar = this.f54225c.H5;
        org.telegram.messenger.gj gjVar2 = this.f54223a;
        if (gjVar == gjVar2) {
            return gjVar2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f54225c.f45950a0.H1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        bn bnVar = this.f54225c;
        if (bnVar.H5 != this.f54223a) {
            return;
        }
        org.telegram.messenger.ff ffVar = this.f54224b;
        if (!ffVar.f28077w && !ffVar.v && !ffVar.f28076u && f20Var == null) {
            bnVar.f45950a0.u0();
        } else {
            bnVar.u(ffVar, f20Var, z10, i10, 0, z11, 0L);
        }
    }
}
