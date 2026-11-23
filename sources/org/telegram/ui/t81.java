package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t81 extends q11 {
    public boolean f52294f2;
    public final u81 f52295g2;

    public t81(u81 u81Var, u81 u81Var2, Activity activity) {
        super(u81Var2, activity, false, null, 3, null);
        this.f52295g2 = u81Var;
        this.f52294f2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f52294f2) {
            this.f52294f2 = false;
            this.f52295g2.f52587f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        int i10;
        long j3;
        u81 u81Var = this.f52295g2;
        i7 = ((org.telegram.ui.ActionBar.g2) u81Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.i10.i(i7).f24649f0)) {
            org.telegram.messenger.ri mediaDataController = u81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.g2) u81Var).currentAccount;
            TLRPC.TL_messages_stickerSet p02 = mediaDataController.p0(org.telegram.messenger.i10.i(i10).f24649f0);
            if (p02 == null) {
                j3 = 0;
            } else {
                j3 = p02.set.f28519id;
            }
            if (j3 == org.telegram.messenger.ri.s0(document)) {
                z10 = true;
            }
        }
        u81Var.g0(l10, z10);
    }
}
