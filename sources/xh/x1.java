package xh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class x1 implements Utilities.Callback {
    public final int f46242a;
    public final x3 f46243b;

    public x1(x3 x3Var, int i10) {
        this.f46242a = i10;
        this.f46243b = x3Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f46242a) {
            case 0:
                x3 x3Var = this.f46243b;
                x3Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    x3Var.skipDismissAnimation();
                }
                x3Var.dismiss();
                return;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                x3 x3Var2 = this.f46243b;
                x3Var2.getClass();
                if (stargiftupgradepreview != null) {
                    x3Var2.f46282h1 = stargiftupgradepreview.sample_attributes;
                    x3Var2.f46284i1 = stargiftupgradepreview.prices;
                    x3Var2.f46286j1 = stargiftupgradepreview.next_prices;
                    x3Var2.b2();
                    return;
                }
                return;
            case 2:
                this.f46243b.dismiss(((Boolean) obj).booleanValue());
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                x3 x3Var3 = this.f46243b;
                x3Var3.K0 = false;
                x3Var3.L0 = true;
                if (savedStarGift != null) {
                    x3Var3.f46278f1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = x3Var3.E0;
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
                        x3Var3.i2(messageObject, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
