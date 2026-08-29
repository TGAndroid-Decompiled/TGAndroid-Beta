package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class sd1 extends d61 {
    public boolean Z1;
    public final td1 a2;

    public sd1(td1 td1Var, td1 td1Var2, Activity activity) {
        super(td1Var2, activity, false, null, 3, null);
        this.a2 = td1Var;
        this.Z1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.f42664f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j10;
        td1 td1Var = this.a2;
        i10 = ((org.telegram.ui.ActionBar.o2) td1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = td1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.o2) td1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if (stickerSetByEmojiOrName == null) {
                j10 = 0;
            } else {
                j10 = stickerSetByEmojiOrName.set.f22419id;
            }
            if (j10 == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        td1Var.b0(l10, z10);
    }
}
