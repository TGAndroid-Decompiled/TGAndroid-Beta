package zh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w1 implements Utilities.Callback {
    public final int f52745a;
    public final w3 f52746b;

    public w1(w3 w3Var, int i10) {
        this.f52745a = i10;
        this.f52746b = w3Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f52745a) {
            case 0:
                w3 w3Var = this.f52746b;
                w3Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    w3Var.skipDismissAnimation();
                }
                w3Var.dismiss();
                return;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                w3 w3Var2 = this.f52746b;
                w3Var2.getClass();
                if (stargiftupgradepreview != null) {
                    w3Var2.f52770h1 = stargiftupgradepreview.sample_attributes;
                    w3Var2.f52772i1 = stargiftupgradepreview.prices;
                    w3Var2.f52774j1 = stargiftupgradepreview.next_prices;
                    w3Var2.b2();
                    return;
                }
                return;
            case 2:
                this.f52746b.dismiss(((Boolean) obj).booleanValue());
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                w3 w3Var3 = this.f52746b;
                w3Var3.K0 = false;
                w3Var3.L0 = true;
                if (savedStarGift != null) {
                    w3Var3.f52766f1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = w3Var3.E0;
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
                        w3Var3.i2(messageObject, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
