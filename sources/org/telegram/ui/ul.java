package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ul extends yr0 {
    public final org.telegram.messenger.jj f42156a;
    public final org.telegram.messenger.ef f42157b;
    public final un f42158c;

    public ul(un unVar, org.telegram.messenger.jj jjVar, org.telegram.messenger.ef efVar) {
        this.f42158c = unVar;
        this.f42156a = jjVar;
        this.f42157b = efVar;
    }

    @Override
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return un.N1(this.f42158c, this.f42156a, null, i10, z10, true);
    }

    @Override
    public final boolean P() {
        un unVar = this.f42158c;
        if (unVar.Z != null && unVar.J9()) {
            unVar.Z.L();
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.messenger.jj V() {
        org.telegram.messenger.jj jjVar = this.f42158c.F5;
        org.telegram.messenger.jj jjVar2 = this.f42156a;
        if (jjVar == jjVar2) {
            return jjVar2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f42158c.Z.d1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        un unVar = this.f42158c;
        if (unVar.F5 != this.f42156a) {
            return;
        }
        org.telegram.messenger.ef efVar = this.f42157b;
        if (!efVar.f19524w && !efVar.v && !efVar.f19523u && x20Var == null) {
            unVar.Z.Z();
        } else {
            unVar.t(efVar, x20Var, z10, i11, 0, z11, 0L);
        }
    }
}
