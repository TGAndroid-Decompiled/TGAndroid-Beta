package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class xk extends nq0 {
    public final org.telegram.messenger.ij f51898a;
    public final org.telegram.messenger.gf f51899b;
    public final an f51900c;

    public xk(an anVar, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar) {
        this.f51900c = anVar;
        this.f51898a = ijVar;
        this.f51899b = gfVar;
    }

    @Override
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        return an.O1(this.f51900c, this.f51898a, null, i7, z9, true);
    }

    @Override
    public final boolean P() {
        an anVar = this.f51900c;
        if (anVar.Z != null && anVar.T9()) {
            anVar.Z.L();
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.messenger.ij V() {
        org.telegram.messenger.ij ijVar = this.f51900c.F5;
        org.telegram.messenger.ij ijVar2 = this.f51898a;
        if (ijVar == ijVar2) {
            return ijVar2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f51900c.Z.e1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        an anVar = this.f51900c;
        if (anVar.F5 != this.f51898a) {
            return;
        }
        org.telegram.messenger.gf gfVar = this.f51899b;
        if (!gfVar.f26842w && !gfVar.v && !gfVar.f26841u && j20Var == null) {
            anVar.Z.a0();
        } else {
            anVar.u(gfVar, j20Var, z9, i10, 0, z10, 0L);
        }
    }
}
