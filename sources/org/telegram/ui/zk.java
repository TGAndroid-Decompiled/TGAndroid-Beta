package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zk extends qq0 {
    public final org.telegram.messenger.ij f52478a;
    public final org.telegram.messenger.gf f52479b;
    public final cn f52480c;

    public zk(cn cnVar, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar) {
        this.f52480c = cnVar;
        this.f52478a = ijVar;
        this.f52479b = gfVar;
    }

    @Override
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return cn.P1(this.f52480c, this.f52478a, null, i7, z9, true);
    }

    @Override
    public final boolean P() {
        cn cnVar = this.f52480c;
        if (cnVar.Z != null && cnVar.U9()) {
            cnVar.Z.L();
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.messenger.ij V() {
        org.telegram.messenger.ij ijVar = this.f52480c.F5;
        org.telegram.messenger.ij ijVar2 = this.f52478a;
        if (ijVar == ijVar2) {
            return ijVar2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f52480c.Z.f1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        cn cnVar = this.f52480c;
        if (cnVar.F5 != this.f52478a) {
            return;
        }
        org.telegram.messenger.gf gfVar = this.f52479b;
        if (!gfVar.f26867w && !gfVar.v && !gfVar.f26866u && j20Var == null) {
            cnVar.Z.a0();
        } else {
            cnVar.u(gfVar, j20Var, z9, i10, 0, z10, 0L);
        }
    }
}
