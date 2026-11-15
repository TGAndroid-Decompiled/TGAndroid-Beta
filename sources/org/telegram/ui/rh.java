package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class rh extends mq0 {
    public final an f50954a;

    public rh(an anVar) {
        this.f50954a = anVar;
    }

    @Override
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rh.E(org.telegram.messenger.gj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.uq0");
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        if (i7 >= 0) {
            an anVar = this.f50954a;
            if (i7 < anVar.eb.size()) {
                anVar.Hb((TLRPC.BotInlineResult) anVar.eb.get(i7), z10, i10, 0L);
            }
        }
    }
}
