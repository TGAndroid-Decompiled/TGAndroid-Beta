package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ya1 extends org.telegram.ui.Components.r51 {
    public final StickersActivity f40213b;

    public ya1(StickersActivity stickersActivity) {
        this.f40213b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i10;
        StickersActivity stickersActivity = this.f40213b;
        i10 = ((org.telegram.ui.ActionBar.m2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i10;
        StickersActivity stickersActivity = this.f40213b;
        i10 = ((org.telegram.ui.ActionBar.m2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
