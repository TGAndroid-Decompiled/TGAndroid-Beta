package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r81 extends n11 {
    public boolean f50873f2;
    public final s81 f50874g2;

    public r81(s81 s81Var, s81 s81Var2, Activity activity) {
        super(s81Var2, activity, false, null, 3, null);
        this.f50874g2 = s81Var;
        this.f50873f2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f50873f2) {
            this.f50873f2 = false;
            this.f50874g2.f51150f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        int i10;
        long j3;
        s81 s81Var = this.f50874g2;
        i7 = ((org.telegram.ui.ActionBar.e2) s81Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.m10.i(i7).f24952f0)) {
            org.telegram.messenger.si mediaDataController = s81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.e2) s81Var).currentAccount;
            TLRPC.TL_messages_stickerSet n02 = mediaDataController.n0(org.telegram.messenger.m10.i(i10).f24952f0);
            if (n02 == null) {
                j3 = 0;
            } else {
                j3 = n02.set.f28078id;
            }
            if (j3 == org.telegram.messenger.si.q0(document)) {
                z10 = true;
            }
        }
        s81Var.g0(l10, z10);
    }
}
