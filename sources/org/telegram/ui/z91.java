package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class z91 extends org.telegram.ui.Components.p41 {
    public final StickersActivity f45117b;

    public z91(StickersActivity stickersActivity) {
        this.f45117b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i10;
        StickersActivity stickersActivity = this.f45117b;
        i10 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i10;
        StickersActivity stickersActivity = this.f45117b;
        i10 = ((org.telegram.ui.ActionBar.o2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
