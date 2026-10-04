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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.yc;
import yh.k5;
public final class l0 implements Runnable {
    public final int f44519a;
    public final boolean f44520b;
    public final Object f44521c;
    public final Object d;
    public final Object f44522e;

    public l0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f44519a = i10;
        this.f44521c = obj;
        this.d = obj2;
        this.f44522e = obj3;
        this.f44520b = z10;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        Boolean bool;
        boolean z10;
        int i12 = this.f44519a;
        boolean z11 = this.f44520b;
        Object obj = this.f44522e;
        Object obj2 = this.d;
        Object obj3 = this.f44521c;
        switch (i12) {
            case 0:
                s0 s0Var = (s0) obj3;
                s0Var.f44586f.f(new q0(s0Var, (a5.a) obj2, 0));
                s0Var.f44586f.f(new q0(s0Var, (a5.a) obj, 0));
                s0Var.E = z11;
                return;
            case 1:
                yc ycVar = (yc) obj3;
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
                rc M = ycVar.M(string, AndroidUtilities.replaceSingleTag(string2, i6.Gi, 0, new tg.c(chat), d6Var), i13);
                M.f30338j = 5000;
                M.j();
                return;
            default:
                k5 k5Var = (k5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = k5Var.f51527l;
                int i14 = k5Var.f51518a;
                if (((int[]) obj2)[0] == k5Var.f51528m) {
                    k5Var.f51524i = false;
                    k5Var.f51528m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        k5Var.f51526k = tL_payments_savedStarGifts.next_offset;
                        k5Var.f51529n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        } else {
                            bool = null;
                        }
                        k5Var.h = bool;
                        if (arrayList.size() <= k5Var.f51529n && k5Var.f51526k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        k5Var.f51525j = z10;
                    } else {
                        k5Var.f51525j = true;
                    }
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(k5Var.f51519b), k5Var);
                    return;
                }
                return;
        }
    }

    public l0(yc ycVar, boolean z10, TLRPC.Chat chat, d6 d6Var) {
        this.f44519a = 1;
        this.f44521c = ycVar;
        this.f44520b = z10;
        this.d = chat;
        this.f44522e = d6Var;
    }
}
