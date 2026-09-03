package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ua1 extends org.telegram.ui.Components.b51 {
    public final StickersActivity f38728b;

    public ua1(StickersActivity stickersActivity) {
        this.f38728b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z4) {
        int i10;
        StickersActivity stickersActivity = this.f38728b;
        i10 = ((org.telegram.ui.ActionBar.p2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i10;
        StickersActivity stickersActivity = this.f38728b;
        i10 = ((org.telegram.ui.ActionBar.p2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
