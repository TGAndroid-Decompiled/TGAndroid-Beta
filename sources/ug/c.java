package ug;

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
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import zh.j5;
public final class c implements Runnable {
    public final int f47095a = 0;
    public final boolean f47096b;
    public final Object f47097c;
    public final Object d;
    public final Object f47098e;

    public c(yc ycVar, boolean z10, TLRPC.Chat chat, f6 f6Var) {
        this.f47097c = ycVar;
        this.f47096b = z10;
        this.d = chat;
        this.f47098e = f6Var;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        Boolean bool;
        boolean z10;
        int i12 = this.f47095a;
        boolean z11 = this.f47096b;
        Object obj = this.f47098e;
        Object obj2 = this.d;
        Object obj3 = this.f47097c;
        switch (i12) {
            case 0:
                yc ycVar = (yc) obj3;
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
                qc M = ycVar.M(string, AndroidUtilities.replaceSingleTag(string2, j6.Gi, 0, new d(chat), f6Var), i13);
                M.f29680j = 5000;
                M.j();
                return;
            default:
                j5 j5Var = (j5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = j5Var.f52102l;
                int i14 = j5Var.f52093a;
                if (((int[]) obj2)[0] == j5Var.f52103m) {
                    j5Var.f52099i = false;
                    j5Var.f52103m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        j5Var.f52101k = tL_payments_savedStarGifts.next_offset;
                        j5Var.f52104n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        } else {
                            bool = null;
                        }
                        j5Var.h = bool;
                        if (arrayList.size() <= j5Var.f52104n && j5Var.f52101k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        j5Var.f52100j = z10;
                    } else {
                        j5Var.f52100j = true;
                    }
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j5Var.f52094b), j5Var);
                    return;
                }
                return;
        }
    }

    public c(j5 j5Var, int[] iArr, TLObject tLObject, boolean z10) {
        this.f47097c = j5Var;
        this.d = iArr;
        this.f47098e = tLObject;
        this.f47096b = z10;
    }
}
