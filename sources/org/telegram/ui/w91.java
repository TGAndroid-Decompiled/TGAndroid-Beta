package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

public final class w91 extends org.telegram.ui.Components.g41 {

    public final StickersActivity f43675b;

    public w91(StickersActivity stickersActivity) {
        this.f43675b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        StickersActivity stickersActivity = this.f43675b;
        MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        StickersActivity stickersActivity = this.f43675b;
        MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) stickersActivity).currentAccount).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
