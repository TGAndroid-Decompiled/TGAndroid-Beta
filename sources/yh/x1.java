package yh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x1 implements Utilities.Callback {
    public final int f48239a;
    public final y3 f48240b;

    public x1(y3 y3Var, int i10) {
        this.f48239a = i10;
        this.f48240b = y3Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f48239a) {
            case 0:
                y3 y3Var = this.f48240b;
                y3Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    y3Var.skipDismissAnimation();
                }
                y3Var.dismiss();
                return;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                y3 y3Var2 = this.f48240b;
                y3Var2.getClass();
                if (stargiftupgradepreview != null) {
                    y3Var2.f48314h1 = stargiftupgradepreview.sample_attributes;
                    y3Var2.f48316i1 = stargiftupgradepreview.prices;
                    y3Var2.f48318j1 = stargiftupgradepreview.next_prices;
                    y3Var2.b2();
                    return;
                }
                return;
            case 2:
                this.f48240b.dismiss(((Boolean) obj).booleanValue());
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                y3 y3Var3 = this.f48240b;
                y3Var3.K0 = false;
                y3Var3.L0 = true;
                if (savedStarGift != null) {
                    y3Var3.f48310f1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = y3Var3.E0;
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
                        y3Var3.i2(messageObject, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
