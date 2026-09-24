package org.telegram.ui;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class xl extends lu0 {
    public final wn f39929a;

    public xl(wn wnVar) {
        this.f39929a = wnVar;
    }

    @Override
    public final org.telegram.ui.vu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xl.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.vu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            wn wnVar = this.f39929a;
            if (i10 < wnVar.Ha.size()) {
                wnVar.cb((TLRPC.BotInlineResult) wnVar.Ha.get(i10), z10, i11, 0L);
            }
        }
    }
}
