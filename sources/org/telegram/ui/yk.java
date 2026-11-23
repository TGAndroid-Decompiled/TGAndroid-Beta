package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yk extends oq0 {
    public final org.telegram.messenger.fj f54391a;
    public final org.telegram.messenger.ef f54392b;
    public final bn f54393c;

    public yk(bn bnVar, org.telegram.messenger.fj fjVar, org.telegram.messenger.ef efVar) {
        this.f54393c = bnVar;
        this.f54391a = fjVar;
        this.f54392b = efVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return bn.P1(this.f54393c, this.f54391a, null, i7, z10, true);
    }

    @Override
    public final boolean P() {
        bn bnVar = this.f54393c;
        if (bnVar.f46118a0 != null && bnVar.V9()) {
            bnVar.f46118a0.U();
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.messenger.fj V() {
        org.telegram.messenger.fj fjVar = this.f54393c.H5;
        org.telegram.messenger.fj fjVar2 = this.f54391a;
        if (fjVar == fjVar2) {
            return fjVar2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f54393c.f46118a0.I1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        bn bnVar = this.f54393c;
        if (bnVar.H5 != this.f54391a) {
            return;
        }
        org.telegram.messenger.ef efVar = this.f54392b;
        if (!efVar.f27981w && !efVar.v && !efVar.f27980u && d20Var == null) {
            bnVar.f46118a0.u0();
        } else {
            bnVar.u(efVar, d20Var, z10, i10, 0, z11, 0L);
        }
    }
}
