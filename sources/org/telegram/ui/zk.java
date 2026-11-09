package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zk extends pq0 {
    public final org.telegram.messenger.ij f52586a;
    public final org.telegram.messenger.gf f52587b;
    public final cn f52588c;

    public zk(cn cnVar, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar) {
        this.f52588c = cnVar;
        this.f52586a = ijVar;
        this.f52587b = gfVar;
    }

    @Override
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return cn.P1(this.f52588c, this.f52586a, null, i7, z9, true);
    }

    @Override
    public final boolean P() {
        cn cnVar = this.f52588c;
        if (cnVar.Z != null && cnVar.U9()) {
            cnVar.Z.L();
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.messenger.ij V() {
        org.telegram.messenger.ij ijVar = this.f52588c.F5;
        org.telegram.messenger.ij ijVar2 = this.f52586a;
        if (ijVar == ijVar2) {
            return ijVar2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f52588c.Z.f1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        cn cnVar = this.f52588c;
        if (cnVar.F5 != this.f52586a) {
            return;
        }
        org.telegram.messenger.gf gfVar = this.f52587b;
        if (!gfVar.f26863w && !gfVar.v && !gfVar.f26862u && j20Var == null) {
            cnVar.Z.a0();
        } else {
            cnVar.u(gfVar, j20Var, z9, i10, 0, z10, 0L);
        }
    }
}
