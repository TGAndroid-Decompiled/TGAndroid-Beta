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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import yh.n5;
public final class c implements Runnable {
    public final int f43141a = 0;
    public final boolean f43142b;
    public final Object f43143c;
    public final Object d;
    public final Object e;

    public c(vc vcVar, boolean z10, TLRPC.Chat chat, f6 f6Var) {
        this.f43143c = vcVar;
        this.f43142b = z10;
        this.d = chat;
        this.e = f6Var;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        Boolean bool;
        boolean z10;
        int i12 = this.f43141a;
        boolean z11 = this.f43142b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f43143c;
        switch (i12) {
            case 0:
                vc vcVar = (vc) obj3;
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
                oc M = vcVar.M(string, AndroidUtilities.replaceSingleTag(string2, j6.Gi, 0, new e(chat), f6Var), i13);
                M.f26705j = 5000;
                M.j();
                return;
            default:
                n5 n5Var = (n5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = n5Var.f47526l;
                int i14 = n5Var.f47518a;
                if (((int[]) obj2)[0] == n5Var.f47527m) {
                    n5Var.f47523i = false;
                    n5Var.f47527m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        n5Var.f47525k = tL_payments_savedStarGifts.next_offset;
                        n5Var.f47528n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        } else {
                            bool = null;
                        }
                        n5Var.h = bool;
                        if (arrayList.size() <= n5Var.f47528n && n5Var.f47525k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n5Var.f47524j = z10;
                    } else {
                        n5Var.f47524j = true;
                    }
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n5Var.f47519b), n5Var);
                    return;
                }
                return;
        }
    }

    public c(n5 n5Var, int[] iArr, TLObject tLObject, boolean z10) {
        this.f43143c = n5Var;
        this.d = iArr;
        this.e = tLObject;
        this.f43142b = z10;
    }
}
