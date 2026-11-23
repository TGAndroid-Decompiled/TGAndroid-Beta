package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class v81 extends r11 {
    public boolean f52737f2;
    public final w81 f52738g2;

    public v81(w81 w81Var, w81 w81Var2, Activity activity) {
        super(w81Var2, activity, false, null, 3, null);
        this.f52738g2 = w81Var;
        this.f52737f2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f52737f2) {
            this.f52737f2 = false;
            this.f52738g2.f52990f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        int i10;
        long j3;
        w81 w81Var = this.f52738g2;
        i7 = ((org.telegram.ui.ActionBar.g2) w81Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.k10.i(i7).f24944f0)) {
            org.telegram.messenger.si mediaDataController = w81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.g2) w81Var).currentAccount;
            TLRPC.TL_messages_stickerSet p02 = mediaDataController.p0(org.telegram.messenger.k10.i(i10).f24944f0);
            if (p02 == null) {
                j3 = 0;
            } else {
                j3 = p02.set.f28425id;
            }
            if (j3 == org.telegram.messenger.si.s0(document)) {
                z10 = true;
            }
        }
        w81Var.g0(l10, z10);
    }
}
