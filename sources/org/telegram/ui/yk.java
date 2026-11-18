package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yk extends oq0 {
    public final org.telegram.messenger.fj f54218a;
    public final org.telegram.messenger.ef f54219b;
    public final bn f54220c;

    public yk(bn bnVar, org.telegram.messenger.fj fjVar, org.telegram.messenger.ef efVar) {
        this.f54220c = bnVar;
        this.f54218a = fjVar;
        this.f54219b = efVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return bn.P1(this.f54220c, this.f54218a, null, i7, z10, true);
    }

    @Override
    public final boolean P() {
        bn bnVar = this.f54220c;
        if (bnVar.f45932a0 != null && bnVar.V9()) {
            bnVar.f45932a0.U();
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.messenger.fj V() {
        org.telegram.messenger.fj fjVar = this.f54220c.H5;
        org.telegram.messenger.fj fjVar2 = this.f54218a;
        if (fjVar == fjVar2) {
            return fjVar2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f54220c.f45932a0.D1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        bn bnVar = this.f54220c;
        if (bnVar.H5 != this.f54218a) {
            return;
        }
        org.telegram.messenger.ef efVar = this.f54219b;
        if (!efVar.f27867w && !efVar.v && !efVar.f27866u && e20Var == null) {
            bnVar.f45932a0.q0();
        } else {
            bnVar.u(efVar, e20Var, z10, i10, 0, z11, 0L);
        }
    }
}
