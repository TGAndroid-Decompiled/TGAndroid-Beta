package zh;

import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t1 implements Utilities.Callback {
    public final int f51168a;
    public final r3 f51169b;

    public t1(r3 r3Var, int i10) {
        this.f51168a = i10;
        this.f51169b = r3Var;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.Message message;
        switch (this.f51168a) {
            case 0:
                r3 r3Var = this.f51169b;
                r3Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    r3Var.skipDismissAnimation();
                }
                r3Var.dismiss();
                return;
            case 1:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                r3 r3Var2 = this.f51169b;
                r3Var2.getClass();
                if (stargiftupgradepreview != null) {
                    r3Var2.f51085i1 = stargiftupgradepreview.sample_attributes;
                    r3Var2.f51087j1 = stargiftupgradepreview.prices;
                    r3Var2.f51089k1 = stargiftupgradepreview.next_prices;
                    r3Var2.c2();
                    return;
                }
                return;
            case 2:
                this.f51169b.dismiss(((Boolean) obj).booleanValue());
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                r3 r3Var3 = this.f51169b;
                r3Var3.L0 = false;
                r3Var3.M0 = true;
                if (savedStarGift != null) {
                    r3Var3.f51081g1 = Boolean.valueOf(savedStarGift.unsaved);
                    MessageObject messageObject = r3Var3.F0;
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
                        r3Var3.k2(messageObject, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
