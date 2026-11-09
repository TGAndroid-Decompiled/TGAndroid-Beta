package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class th extends pq0 {
    public final cn f50183a;

    public th(cn cnVar) {
        this.f50183a = cnVar;
    }

    @Override
    public final org.telegram.ui.yq0 E(org.telegram.messenger.ij r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.th.E(org.telegram.messenger.ij, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.yq0");
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        if (i7 >= 0) {
            cn cnVar = this.f50183a;
            if (i7 < cnVar.f44430db.size()) {
                cnVar.Gb((TLRPC.BotInlineResult) cnVar.f44430db.get(i7), z9, i10, 0L);
            }
        }
    }
}
