package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ul extends xr0 {
    public final org.telegram.messenger.kj f41966a;
    public final org.telegram.messenger.ff f41967b;
    public final un f41968c;

    public ul(un unVar, org.telegram.messenger.kj kjVar, org.telegram.messenger.ff ffVar) {
        this.f41968c = unVar;
        this.f41966a = kjVar;
        this.f41967b = ffVar;
    }

    @Override
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return un.O1(this.f41968c, this.f41966a, null, i10, z10, true);
    }

    @Override
    public final boolean P() {
        un unVar = this.f41968c;
        if (unVar.Z != null && unVar.O9()) {
            unVar.Z.K();
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.messenger.kj V() {
        org.telegram.messenger.kj kjVar = this.f41968c.F5;
        org.telegram.messenger.kj kjVar2 = this.f41966a;
        if (kjVar == kjVar2) {
            return kjVar2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f41968c.Z.d1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        un unVar = this.f41968c;
        if (unVar.F5 != this.f41966a) {
            return;
        }
        org.telegram.messenger.ff ffVar = this.f41967b;
        if (!ffVar.f14620w && !ffVar.v && !ffVar.f14619u && y20Var == null) {
            unVar.Z.Z();
        } else {
            unVar.u(ffVar, y20Var, z10, i11, 0, z11, 0L);
        }
    }
}
