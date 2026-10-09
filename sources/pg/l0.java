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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.tc;
import yh.e5;
public final class l0 implements Runnable {
    public final int f45679a;
    public final boolean f45680b;
    public final Object f45681c;
    public final Object d;
    public final Object f45682e;

    public l0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f45679a = i10;
        this.f45681c = obj;
        this.d = obj2;
        this.f45682e = obj3;
        this.f45680b = z10;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        Boolean bool;
        boolean z10;
        int i12 = this.f45679a;
        boolean z11 = this.f45680b;
        Object obj = this.f45682e;
        Object obj2 = this.d;
        Object obj3 = this.f45681c;
        switch (i12) {
            case 0:
                s0 s0Var = (s0) obj3;
                s0Var.f45757f.f(new q0(s0Var, (a5.a) obj2, 0));
                s0Var.f45757f.f(new q0(s0Var, (a5.a) obj, 0));
                s0Var.E = z11;
                return;
            case 1:
                ad adVar = (ad) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                e6 e6Var = (e6) obj;
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
                tc M = adVar.M(string, AndroidUtilities.replaceSingleTag(string2, i6.Gi, 0, new tg.c(chat), e6Var), i13);
                M.f31130j = 5000;
                M.j();
                return;
            default:
                e5 e5Var = (e5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = e5Var.f52440l;
                int i14 = e5Var.f52431a;
                if (((int[]) obj2)[0] == e5Var.f52441m) {
                    e5Var.f52437i = false;
                    e5Var.f52441m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        e5Var.f52439k = tL_payments_savedStarGifts.next_offset;
                        e5Var.f52442n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        } else {
                            bool = null;
                        }
                        e5Var.h = bool;
                        if (arrayList.size() <= e5Var.f52442n && e5Var.f52439k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        e5Var.f52438j = z10;
                    } else {
                        e5Var.f52438j = true;
                    }
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(e5Var.f52432b), e5Var);
                    return;
                }
                return;
        }
    }

    public l0(ad adVar, boolean z10, TLRPC.Chat chat, e6 e6Var) {
        this.f45679a = 1;
        this.f45681c = adVar;
        this.f45680b = z10;
        this.d = chat;
        this.f45682e = e6Var;
    }
}
