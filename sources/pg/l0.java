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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
import yh.l5;
public final class l0 implements Runnable {
    public final int f41193a;
    public final boolean f41194b;
    public final Object f41195c;
    public final Object d;
    public final Object e;

    public l0(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f41193a = i10;
        this.f41195c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f41194b = z10;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        Boolean bool;
        boolean z10;
        int i12 = this.f41193a;
        boolean z11 = this.f41194b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f41195c;
        switch (i12) {
            case 0:
                s0 s0Var = (s0) obj3;
                s0Var.f41264f.f(new q0(s0Var, (a5.a) obj2, 0));
                s0Var.f41264f.f(new q0(s0Var, (a5.a) obj, 0));
                s0Var.E = z11;
                return;
            case 1:
                xc xcVar = (xc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                f6 f6Var = (f6) obj;
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
                pc M = xcVar.M(string, AndroidUtilities.replaceSingleTag(string2, j6.Gi, 0, new tg.c(chat), f6Var), i13);
                M.f27252j = 5000;
                M.j();
                return;
            default:
                l5 l5Var = (l5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = l5Var.f47690l;
                int i14 = l5Var.f47682a;
                if (((int[]) obj2)[0] == l5Var.f47691m) {
                    l5Var.f47687i = false;
                    l5Var.f47691m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        l5Var.f47689k = tL_payments_savedStarGifts.next_offset;
                        l5Var.f47692n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        } else {
                            bool = null;
                        }
                        l5Var.h = bool;
                        if (arrayList.size() <= l5Var.f47692n && l5Var.f47689k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        l5Var.f47688j = z10;
                    } else {
                        l5Var.f47688j = true;
                    }
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l5Var.f47683b), l5Var);
                    return;
                }
                return;
        }
    }

    public l0(xc xcVar, boolean z10, TLRPC.Chat chat, f6 f6Var) {
        this.f41193a = 1;
        this.f41195c = xcVar;
        this.f41194b = z10;
        this.d = chat;
        this.e = f6Var;
    }
}
