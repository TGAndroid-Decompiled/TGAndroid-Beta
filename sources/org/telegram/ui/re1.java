package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class re1 extends a71 {
    public boolean f37321d2;
    public final se1 f37322e2;

    public re1(se1 se1Var, se1 se1Var2, Activity activity) {
        super(se1Var2, activity, false, null, 3, null);
        this.f37322e2 = se1Var;
        this.f37321d2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f37321d2) {
            this.f37321d2 = false;
            this.f37322e2.f37725f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j3;
        se1 se1Var = this.f37322e2;
        i10 = ((org.telegram.ui.ActionBar.m2) se1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = se1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.m2) se1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if (stickerSetByEmojiOrName == null) {
                j3 = 0;
            } else {
                j3 = stickerSetByEmojiOrName.set.f18362id;
            }
            if (j3 == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        se1Var.b0(l4, z10);
    }
}
