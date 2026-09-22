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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import yh.m5;
public final class c implements Runnable {
    public final int f43110a = 0;
    public final boolean f43111b;
    public final Object f43112c;
    public final Object d;
    public final Object e;

    public c(vc vcVar, boolean z10, TLRPC.Chat chat, e6 e6Var) {
        this.f43112c = vcVar;
        this.f43111b = z10;
        this.d = chat;
        this.e = e6Var;
    }

    @Override
    public final void run() {
        String string;
        int i10;
        String string2;
        int i11;
        Boolean bool;
        boolean z10;
        int i12 = this.f43110a;
        boolean z11 = this.f43111b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f43112c;
        switch (i12) {
            case 0:
                vc vcVar = (vc) obj3;
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
                oc M = vcVar.M(string, AndroidUtilities.replaceSingleTag(string2, i6.Gi, 0, new e(chat), e6Var), i13);
                M.f26751j = 5000;
                M.j();
                return;
            default:
                m5 m5Var = (m5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = m5Var.f47406l;
                int i14 = m5Var.f47398a;
                if (((int[]) obj2)[0] == m5Var.f47407m) {
                    m5Var.f47403i = false;
                    m5Var.f47407m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        m5Var.f47405k = tL_payments_savedStarGifts.next_offset;
                        m5Var.f47408n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        } else {
                            bool = null;
                        }
                        m5Var.h = bool;
                        if (arrayList.size() <= m5Var.f47408n && m5Var.f47405k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        m5Var.f47404j = z10;
                    } else {
                        m5Var.f47404j = true;
                    }
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(m5Var.f47399b), m5Var);
                    return;
                }
                return;
        }
    }

    public c(m5 m5Var, int[] iArr, TLObject tLObject, boolean z10) {
        this.f43112c = m5Var;
        this.d = iArr;
        this.e = tLObject;
        this.f43111b = z10;
    }
}
