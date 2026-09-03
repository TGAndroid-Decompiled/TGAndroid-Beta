package org.telegram.ui;

import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class yl extends fu0 {
    public final xn f43649a;

    public yl(xn xnVar) {
        this.f43649a = xnVar;
    }

    @Override
    public final org.telegram.ui.qu0 E(org.telegram.messenger.MessageObject r5, org.telegram.tgnet.TLRPC.FileLocation r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yl.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.qu0");
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        if (i10 >= 0) {
            xn xnVar = this.f43649a;
            if (i10 < xnVar.Ea.size()) {
                xnVar.cb((TLRPC.BotInlineResult) xnVar.Ea.get(i10), z4, i11, 0L);
            }
        }
    }
}
