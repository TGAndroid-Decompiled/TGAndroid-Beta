package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rh extends oq0 {
    public final bn f51580a;

    public rh(bn bnVar) {
        this.f51580a = bnVar;
    }

    @Override
    public final org.telegram.ui.wq0 E(org.telegram.messenger.gj r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rh.E(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.wq0");
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            bn bnVar = this.f51580a;
            if (i7 < bnVar.f46030fb.size()) {
                bnVar.Hb((TLRPC.BotInlineResult) bnVar.f46030fb.get(i7), z10, i10, 0L);
            }
        }
    }
}
