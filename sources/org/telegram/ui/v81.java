package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class v81 extends s11 {
    public boolean f50604e2;
    public final w81 f50605f2;

    public v81(w81 w81Var, w81 w81Var2, Activity activity) {
        super(w81Var2, activity, false, null, 3, null);
        this.f50605f2 = w81Var;
        this.f50604e2 = true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.f50604e2) {
            this.f50604e2 = false;
            this.f50605f2.f50979f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        int i10;
        long j3;
        w81 w81Var = this.f50605f2;
        i7 = ((org.telegram.ui.ActionBar.f2) w81Var).currentAccount;
        boolean z9 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.p10.i(i7).f24480e0)) {
            org.telegram.messenger.ui mediaDataController = w81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.f2) w81Var).currentAccount;
            TLRPC.TL_messages_stickerSet n02 = mediaDataController.n0(org.telegram.messenger.p10.i(i10).f24480e0);
            if (n02 == null) {
                j3 = 0;
            } else {
                j3 = n02.set.f26983id;
            }
            if (j3 == org.telegram.messenger.ui.q0(document)) {
                z9 = true;
            }
        }
        w81Var.g0(l10, z9);
    }
}
