package yh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class u1 implements Utilities.Callback {
    public final int f53258a;
    public final s3 f53259b;

    public u1(s3 s3Var, int i10) {
        this.f53258a = i10;
        this.f53259b = s3Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f53258a) {
            case 0:
                s3 s3Var = this.f53259b;
                s3Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    s3Var.skipDismissAnimation();
                }
                s3Var.dismiss();
                return;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                s3 s3Var2 = this.f53259b;
                s3Var2.getClass();
                if (stargiftupgradepreview != null) {
                    s3Var2.f53176i1 = stargiftupgradepreview.sample_attributes;
                    s3Var2.f53178j1 = stargiftupgradepreview.prices;
                    s3Var2.f53180k1 = stargiftupgradepreview.next_prices;
                    s3Var2.c2();
                    return;
                }
                return;
            case 2:
                this.f53259b.dismiss(((Boolean) obj).booleanValue());
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                s3 s3Var3 = this.f53259b;
                s3Var3.L0 = false;
                s3Var3.M0 = true;
                if (savedStarGift != null) {
                    s3Var3.f53172g1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = s3Var3.F0;
                    if (messageObject != null && (message = messageObject.messageOwner) != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                            boolean z10 = tL_messageActionStarGiftUnique.saved;
                            boolean z11 = !savedStarGift.unsaved;
                            if (z10 != z11) {
                                tL_messageActionStarGiftUnique.saved = z11;
                            } else {
                                return;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                            boolean z12 = tL_messageActionStarGift.saved;
                            boolean z13 = !savedStarGift.unsaved;
                            if (z12 != z13) {
                                tL_messageActionStarGift.saved = z13;
                            } else {
                                return;
                            }
                        }
                        s3Var3.k2(messageObject, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
