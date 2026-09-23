package tg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import yh.l5;
public final class c implements Runnable {
    public final int f43065a = 0;
    public final boolean f43066b;
    public final Object f43067c;
    public final Object d;
    public final Object e;

    public c(xc xcVar, boolean z10, TLRPC.Chat chat, d6 d6Var) {
        this.f43067c = xcVar;
        this.f43066b = z10;
        this.d = chat;
        this.e = d6Var;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        Boolean bool;
        boolean z10;
        int i12 = this.f43065a;
        boolean z11 = this.f43066b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f43067c;
        switch (i12) {
            case 0:
                xc xcVar = (xc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                d6 d6Var = (d6) obj;
                int i13 = R.raw.star_premium_2;
                if (z11) {
                    string = LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated);
                } else {
                    string = LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                }
                if (z11) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = R.string.BoostingCheckStatistic;
                    } else {
                        i11 = R.string.BoostingCheckStatisticGroup;
                    }
                    string2 = LocaleController.getString(i11);
                } else {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i10 = R.string.BoostingCheckGiftsStatistic;
                    } else {
                        i10 = R.string.BoostingCheckGiftsStatisticGroup;
                    }
                    string2 = LocaleController.getString(i10);
                }
                qc M = xcVar.M(string, AndroidUtilities.replaceSingleTag(string2, h6.Gi, 0, new e(chat), d6Var), i13);
                M.f27306j = 5000;
                M.j();
                return;
            default:
                l5 l5Var = (l5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = l5Var.f47337l;
                int i14 = l5Var.f47329a;
                if (((int[]) obj2)[0] == l5Var.f47338m) {
                    l5Var.f47334i = false;
                    l5Var.f47338m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        l5Var.f47336k = tL_payments_savedStarGifts.next_offset;
                        l5Var.f47339n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        } else {
                            bool = null;
                        }
                        l5Var.h = bool;
                        if (arrayList.size() <= l5Var.f47339n && l5Var.f47336k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        l5Var.f47335j = z10;
                    } else {
                        l5Var.f47335j = true;
                    }
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l5Var.f47330b), l5Var);
                    return;
                }
                return;
        }
    }

    public c(l5 l5Var, int[] iArr, TLObject tLObject, boolean z10) {
        this.f43067c = l5Var;
        this.d = iArr;
        this.e = tLObject;
        this.f43066b = z10;
    }
}
