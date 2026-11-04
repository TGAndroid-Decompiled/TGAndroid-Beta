package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class tk extends eq0 {
    public final org.telegram.messenger.zi f49819a;
    public final org.telegram.messenger.ye f49820b;
    public final wm f49821c;

    public tk(wm wmVar, org.telegram.messenger.zi ziVar, org.telegram.messenger.ye yeVar) {
        this.f49821c = wmVar;
        this.f49819a = ziVar;
        this.f49820b = yeVar;
    }

    @Override
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        return wm.O1(this.f49821c, this.f49819a, null, i3, z10, true);
    }

    @Override
    public final boolean P() {
        wm wmVar = this.f49821c;
        if (wmVar.f51237a0 != null && wmVar.T9()) {
            wmVar.f51237a0.L();
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.messenger.zi V() {
        org.telegram.messenger.zi ziVar = this.f49821c.G5;
        org.telegram.messenger.zi ziVar2 = this.f49819a;
        if (ziVar == ziVar2) {
            return ziVar2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f49821c.f51237a0.e1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        wm wmVar = this.f49821c;
        if (wmVar.G5 != this.f49819a) {
            return;
        }
        org.telegram.messenger.ye yeVar = this.f49820b;
        if (!yeVar.f25328w && !yeVar.v && !yeVar.f25327u && b20Var == null) {
            wmVar.f51237a0.a0();
        } else {
            wmVar.u(yeVar, b20Var, z10, i10, 0, z11, 0L);
        }
    }
}
