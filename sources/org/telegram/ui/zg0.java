package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class zg0 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.t9 f45213a;
    public final int f45214b;

    public zg0(Context context) {
        super(context);
        this.f45214b = UserConfig.selectedAccount;
        setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        setOrientation(1);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f45213a = t9Var;
        addView(t9Var, i7.f6.t(104, 104, 49, 0, 2, 0, 0));
    }

    public final void a() {
        boolean z10;
        int i10 = this.f45214b;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 4) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.f45213a.i(ImageLocation.getForDocument(document), "104_104", "tgs", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f23009a7, 1.0f), tL_messages_stickerSet);
            return;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(i10);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
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
        NotificationCenter.getInstance(this.f45214b).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f45214b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }
}
