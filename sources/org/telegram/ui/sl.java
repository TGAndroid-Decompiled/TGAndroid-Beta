package org.telegram.ui;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class sl extends pt0 {
    public final tn f42424a;

    public sl(tn tnVar) {
        this.f42424a = tnVar;
    }

    @Override
    public final org.telegram.ui.zt0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sl.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.zt0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            tn tnVar = this.f42424a;
            if (i10 < tnVar.Da.size()) {
                tnVar.cb((TLRPC.BotInlineResult) tnVar.Da.get(i10), z10, i11, 0L);
            }
        }
    }
}
