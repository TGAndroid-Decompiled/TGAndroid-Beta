package org.telegram.ui;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class yl extends mu0 {
    public final xn f39854a;

    public yl(xn xnVar) {
        this.f39854a = xnVar;
    }

    @Override
    public final org.telegram.ui.wu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yl.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.wu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            xn xnVar = this.f39854a;
            if (i10 < xnVar.Ha.size()) {
                xnVar.cb((TLRPC.BotInlineResult) xnVar.Ha.get(i10), z10, i11, 0L);
            }
        }
    }
}
