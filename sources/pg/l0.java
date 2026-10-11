package pg;

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.sc;
import yh.f5;
public final class l0 implements Runnable {
    public final int f45749a;
    public final boolean f45750b;
    public final Object f45751c;
    public final Object d;
    public final Object f45752e;

    public l0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f45749a = i10;
        this.f45751c = obj;
        this.d = obj2;
        this.f45752e = obj3;
        this.f45750b = z10;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        Boolean bool;
        boolean z10;
        int i12 = this.f45749a;
        boolean z11 = this.f45750b;
        Object obj = this.f45752e;
        Object obj2 = this.d;
        Object obj3 = this.f45751c;
        switch (i12) {
            case 0:
                s0 s0Var = (s0) obj3;
                s0Var.f45827f.f(new q0(s0Var, (a5.a) obj2, 0));
                s0Var.f45827f.f(new q0(s0Var, (a5.a) obj, 0));
                s0Var.E = z11;
                return;
            case 1:
                ad adVar = (ad) obj3;
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
                sc M = adVar.M(string, AndroidUtilities.replaceSingleTag(string2, h6.Gi, 0, new tg.c(chat), d6Var), i13);
                M.f30833j = 5000;
                M.j();
                return;
            default:
                f5 f5Var = (f5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = f5Var.f52640l;
                int i14 = f5Var.f52631a;
                if (((int[]) obj2)[0] == f5Var.f52641m) {
                    f5Var.f52637i = false;
                    f5Var.f52641m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        f5Var.f52639k = tL_payments_savedStarGifts.next_offset;
                        f5Var.f52642n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        } else {
                            bool = null;
                        }
                        f5Var.h = bool;
                        if (arrayList.size() <= f5Var.f52642n && f5Var.f52639k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        f5Var.f52638j = z10;
                    } else {
                        f5Var.f52638j = true;
                    }
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(f5Var.f52632b), f5Var);
                    return;
                }
                return;
        }
    }

    public l0(ad adVar, boolean z10, TLRPC.Chat chat, d6 d6Var) {
        this.f45749a = 1;
        this.f45751c = adVar;
        this.f45750b = z10;
        this.d = chat;
        this.f45752e = d6Var;
    }
}
