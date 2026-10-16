package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class sp extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.z9 f39918a;
    public org.telegram.ui.Components.ja0 f39919b;
    public int f39920c;

    public final void a() {
        boolean z10;
        org.telegram.ui.Components.z9 z9Var = this.f39918a;
        int i10 = this.f39920c;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            z9Var.i(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.f39919b, tL_messages_stickerSet);
            return;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(i10);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
        z9Var.setImageDrawable(this.f39919b);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        NotificationCenter.getInstance(this.f39920c).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f39920c).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }
}
