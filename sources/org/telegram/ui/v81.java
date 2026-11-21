package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class v81 extends s11 {
    public boolean f52754f2;
    public final w81 f52755g2;

    public v81(w81 w81Var, w81 w81Var2, Activity activity) {
        super(w81Var2, activity, false, null, 3, null);
        this.f52755g2 = w81Var;
        this.f52754f2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f52754f2) {
            this.f52754f2 = false;
            this.f52755g2.f53023f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        int i10;
        long j3;
        w81 w81Var = this.f52755g2;
        i7 = ((org.telegram.ui.ActionBar.g2) w81Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.j10.i(i7).f24810f0)) {
            org.telegram.messenger.ri mediaDataController = w81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.g2) w81Var).currentAccount;
            TLRPC.TL_messages_stickerSet p02 = mediaDataController.p0(org.telegram.messenger.j10.i(i10).f24810f0);
            if (p02 == null) {
                j3 = 0;
            } else {
                j3 = p02.set.f28458id;
            }
            if (j3 == org.telegram.messenger.ri.s0(document)) {
                z10 = true;
            }
        }
        w81Var.g0(l10, z10);
    }
}
