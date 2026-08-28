package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class y91 extends org.telegram.ui.Components.e41 {
    public final StickersActivity f44802b;

    public y91(StickersActivity stickersActivity) {
        this.f44802b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i9;
        StickersActivity stickersActivity = this.f44802b;
        i9 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i9).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i9;
        StickersActivity stickersActivity = this.f44802b;
        i9 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i9).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
