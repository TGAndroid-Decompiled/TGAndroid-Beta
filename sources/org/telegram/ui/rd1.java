package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class rd1 extends a61 {
    public boolean Z1;
    public final sd1 a2;

    public rd1(sd1 sd1Var, sd1 sd1Var2, Activity activity) {
        super(sd1Var2, activity, false, null, 3, null);
        this.a2 = sd1Var;
        this.Z1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.f42595f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        sd1 sd1Var = this.a2;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) sd1Var).currentAccount).defaultTopicIcons)) {
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = sd1Var.getMediaDataController().getStickerSetByEmojiOrName(UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) sd1Var).currentAccount).defaultTopicIcons);
            if ((stickerSetByEmojiOrName == null ? 0L : stickerSetByEmojiOrName.set.f22407id) == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        sd1Var.b0(l10, z10);
    }
}
