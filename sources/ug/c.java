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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import zh.f5;
public final class c implements Runnable {
    public final int f46286a = 0;
    public final boolean f46287b;
    public final Object f46288c;
    public final Object d;
    public final Object e;

    public c(zc zcVar, boolean z10, TLRPC.Chat chat, c6 c6Var) {
        this.f46288c = zcVar;
        this.f46287b = z10;
        this.d = chat;
        this.e = c6Var;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        Boolean bool;
        boolean z10;
        int i12 = this.f46286a;
        boolean z11 = this.f46287b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f46288c;
        switch (i12) {
            case 0:
                zc zcVar = (zc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                c6 c6Var = (c6) obj;
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
                sc M = zcVar.M(string, AndroidUtilities.replaceSingleTag(string2, g6.Gi, 0, new d(chat), c6Var), i13);
                M.f29102j = 5000;
                M.j();
                return;
            default:
                f5 f5Var = (f5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = f5Var.f50509l;
                int i14 = f5Var.f50501a;
                if (((int[]) obj2)[0] == f5Var.f50510m) {
                    f5Var.f50506i = false;
                    f5Var.f50510m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        f5Var.f50508k = tL_payments_savedStarGifts.next_offset;
                        f5Var.f50511n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        } else {
                            bool = null;
                        }
                        f5Var.h = bool;
                        if (arrayList.size() <= f5Var.f50511n && f5Var.f50508k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        f5Var.f50507j = z10;
                    } else {
                        f5Var.f50507j = true;
                    }
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(f5Var.f50502b), f5Var);
                    return;
                }
                return;
        }
    }

    public c(f5 f5Var, int[] iArr, TLObject tLObject, boolean z10) {
        this.f46288c = f5Var;
        this.d = iArr;
        this.e = tLObject;
        this.f46287b = z10;
    }
}
