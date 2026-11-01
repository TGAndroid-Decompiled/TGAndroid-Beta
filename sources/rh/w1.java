package rh;

import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class w1 implements r20 {
    public final int f47637a;
    public final e4 f47638b;

    public w1(e4 e4Var, int i10) {
        this.f47637a = i10;
        this.f47638b = e4Var;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.Message message;
        switch (this.f47637a) {
            case 0:
                e4 e4Var = this.f47638b;
                e4Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    e4Var.N0 = true;
                }
                e4Var.dismiss();
                return;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f47638b.dismiss();
                return;
            case 2:
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                e4 e4Var2 = this.f47638b;
                e4Var2.getClass();
                if (stargiftupgradepreview != null) {
                    e4Var2.f46824g3 = stargiftupgradepreview.sample_attributes;
                    e4Var2.f46826h3 = stargiftupgradepreview.prices;
                    e4Var2.f46828i3 = stargiftupgradepreview.next_prices;
                    e4Var2.a2();
                    return;
                }
                return;
            default:
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                e4 e4Var3 = this.f47638b;
                e4Var3.F2 = false;
                e4Var3.G2 = true;
                if (savedStarGift != null) {
                    e4Var3.f46820e3 = Boolean.valueOf(savedStarGift.unsaved);
                    kj kjVar = e4Var3.f46854z2;
                    if (kjVar != null && (message = kjVar.f16690k) != null) {
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
                        e4Var3.i2(kjVar, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
