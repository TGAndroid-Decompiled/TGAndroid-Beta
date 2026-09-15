package yh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x1 implements Utilities.Callback {
    public final int f47956a;
    public final a4 f47957b;

    public x1(a4 a4Var, int i10) {
        this.f47956a = i10;
        this.f47957b = a4Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f47956a) {
            case 0:
                a4 a4Var = this.f47957b;
                a4Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    a4Var.skipDismissAnimation();
                }
                a4Var.dismiss();
                return;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                a4 a4Var2 = this.f47957b;
                a4Var2.getClass();
                if (stargiftupgradepreview != null) {
                    a4Var2.f46960h1 = stargiftupgradepreview.sample_attributes;
                    a4Var2.f46962i1 = stargiftupgradepreview.prices;
                    a4Var2.f46964j1 = stargiftupgradepreview.next_prices;
                    a4Var2.b2();
                    return;
                }
                return;
            case 2:
                this.f47957b.dismiss(((Boolean) obj).booleanValue());
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                a4 a4Var3 = this.f47957b;
                a4Var3.K0 = false;
                a4Var3.L0 = true;
                if (savedStarGift != null) {
                    a4Var3.f46956f1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = a4Var3.E0;
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
                        a4Var3.i2(messageObject, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
