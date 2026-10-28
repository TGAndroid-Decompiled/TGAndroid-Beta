package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xd1 extends f61 {
    public boolean f45659e2;
    public final yd1 f45660f2;

    public xd1(yd1 yd1Var, yd1 yd1Var2, Activity activity) {
        super(yd1Var2, activity, false, null, 3, null);
        this.f45660f2 = yd1Var;
        this.f45659e2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f45659e2) {
            this.f45659e2 = false;
            this.f45660f2.f45972f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j10;
        yd1 yd1Var = this.f45660f2;
        i10 = ((org.telegram.ui.ActionBar.r2) yd1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = yd1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.r2) yd1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if (stickerSetByEmojiOrName == null) {
                j10 = 0;
            } else {
                j10 = stickerSetByEmojiOrName.set.f22055id;
            }
            if (j10 == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        yd1Var.c0(l4, z10);
    }
}
