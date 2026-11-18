package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class yk extends oq0 {
    public final org.telegram.messenger.fj f54177a;
    public final org.telegram.messenger.ef f54178b;
    public final bn f54179c;

    public yk(bn bnVar, org.telegram.messenger.fj fjVar, org.telegram.messenger.ef efVar) {
        this.f54179c = bnVar;
        this.f54177a = fjVar;
        this.f54178b = efVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        return bn.P1(this.f54179c, this.f54177a, null, i7, z10, true);
    }

    @Override
    public final boolean P() {
        bn bnVar = this.f54179c;
        if (bnVar.f45923a0 != null && bnVar.V9()) {
            bnVar.f45923a0.U();
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.messenger.fj V() {
        org.telegram.messenger.fj fjVar = this.f54179c.H5;
        org.telegram.messenger.fj fjVar2 = this.f54177a;
        if (fjVar == fjVar2) {
            return fjVar2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f54179c.f45923a0.D1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        bn bnVar = this.f54179c;
        if (bnVar.H5 != this.f54177a) {
            return;
        }
        org.telegram.messenger.ef efVar = this.f54178b;
        if (!efVar.f27865w && !efVar.v && !efVar.f27864u && e20Var == null) {
            bnVar.f45923a0.q0();
        } else {
            bnVar.u(efVar, e20Var, z10, i10, 0, z11, 0L);
        }
    }
}
