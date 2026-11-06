package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t81 extends q11 {
    public boolean f49989e2;
    public final u81 f49990f2;

    public t81(u81 u81Var, u81 u81Var2, Activity activity) {
        super(u81Var2, activity, false, null, 3, null);
        this.f49990f2 = u81Var;
        this.f49989e2 = true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.f49989e2) {
            this.f49989e2 = false;
            this.f49990f2.f50342f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        int i10;
        long j3;
        u81 u81Var = this.f49990f2;
        i7 = ((org.telegram.ui.ActionBar.f2) u81Var).currentAccount;
        boolean z9 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.p10.i(i7).f24469e0)) {
            org.telegram.messenger.ui mediaDataController = u81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.f2) u81Var).currentAccount;
            TLRPC.TL_messages_stickerSet n02 = mediaDataController.n0(org.telegram.messenger.p10.i(i10).f24469e0);
            if (n02 == null) {
                j3 = 0;
            } else {
                j3 = n02.set.f26979id;
            }
            if (j3 == org.telegram.messenger.ui.q0(document)) {
                z9 = true;
            }
        }
        u81Var.g0(l10, z9);
    }
}
