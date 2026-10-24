package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class rd1 extends a61 {
    public boolean f41133e2;
    public final sd1 f41134f2;

    public rd1(sd1 sd1Var, sd1 sd1Var2, Activity activity) {
        super(sd1Var2, activity, false, null, 3, null);
        this.f41134f2 = sd1Var;
        this.f41133e2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f41133e2) {
            this.f41133e2 = false;
            this.f41134f2.f41353f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j10;
        sd1 sd1Var = this.f41134f2;
        i10 = ((org.telegram.ui.ActionBar.o2) sd1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = sd1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.o2) sd1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if (stickerSetByEmojiOrName == null) {
                j10 = 0;
            } else {
                j10 = stickerSetByEmojiOrName.set.f20371id;
            }
            if (j10 == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        sd1Var.b0(l4, z10);
    }
}
