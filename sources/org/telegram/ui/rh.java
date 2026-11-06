package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rh extends nq0 {
    public final an f49514a;

    public rh(an anVar) {
        this.f49514a = anVar;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.ij r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rh.E(org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.wq0");
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        if (i7 >= 0) {
            an anVar = this.f49514a;
            if (i7 < anVar.f43742bb.size()) {
                anVar.Db((TLRPC.BotInlineResult) anVar.f43742bb.get(i7), z9, i10, 0L);
            }
        }
    }
}
