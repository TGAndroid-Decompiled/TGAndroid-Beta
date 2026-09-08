package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ze1 extends j71 {
    public boolean f43417d2;
    public final af1 f43418e2;

    public ze1(af1 af1Var, af1 af1Var2, Activity activity) {
        super(af1Var2, activity, false, null, 3, null);
        this.f43418e2 = af1Var;
        this.f43417d2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f43417d2) {
            this.f43417d2 = false;
            this.f43418e2.f34441f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j3;
        af1 af1Var = this.f43418e2;
        i10 = ((org.telegram.ui.ActionBar.n2) af1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = af1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.n2) af1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if (stickerSetByEmojiOrName == null) {
                j3 = 0;
            } else {
                j3 = stickerSetByEmojiOrName.set.f19923id;
            }
            if (j3 == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        af1Var.b0(l4, z10);
    }
}
