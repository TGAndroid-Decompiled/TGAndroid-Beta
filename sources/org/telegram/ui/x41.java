package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class x41 extends org.telegram.ui.Components.k31 {
    public final StickersActivity f51828b;

    public x41(StickersActivity stickersActivity) {
        this.f51828b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i3;
        StickersActivity stickersActivity = this.f51828b;
        i3 = ((org.telegram.ui.ActionBar.d2) stickersActivity).currentAccount;
        org.telegram.messenger.li.b0(i3).f2(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i3;
        StickersActivity stickersActivity = this.f51828b;
        i3 = ((org.telegram.ui.ActionBar.d2) stickersActivity).currentAccount;
        org.telegram.messenger.li.b0(i3).f2(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
