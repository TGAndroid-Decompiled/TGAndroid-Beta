package qi;

import java.io.File;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import w7.w6;
import yh.f5;
public final class e0 implements Runnable {
    public final int f46686a = 1;
    public final boolean f46687b;
    public final Object f46688c;
    public final Object d;
    public final Object f46689e;

    public e0(zc zcVar, boolean z10, TLRPC.Chat chat, c6 c6Var) {
        this.f46688c = zcVar;
        this.f46687b = z10;
        this.d = chat;
        this.f46689e = c6Var;
    }

    @Override
    public final void run() {
        p0 p0Var;
        File file;
        boolean z10;
        int i10;
        String string;
        int i11;
        String string2;
        int i12;
        Boolean bool;
        boolean z11;
        int i13 = this.f46686a;
        boolean z12 = this.f46687b;
        Object obj = this.f46689e;
        Object obj2 = this.d;
        Object obj3 = this.f46688c;
        switch (i13) {
            case 0:
                p0 p0Var2 = (p0) obj3;
                s sVar = (s) obj2;
                l0 l0Var = (l0) obj;
                long nanoTime = System.nanoTime();
                try {
                    sVar.g();
                    long d = w6.d(sVar.f46885a) / 1000;
                    p0Var2.f46863n.b("active output finalized: size=" + file.length() + ", durationMs=" + d + ", elapsedMs=" + p0.f(nanoTime));
                    p0Var2.g();
                    long j3 = p0Var2.f46865p;
                    if (d > j3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z13 = this.f46687b;
                    if (z13 && !z10) {
                        p0Var2.f46861l.execute(new c0(p0Var2, l0Var, sVar.f46885a, d, true));
                        p0Var2 = p0Var2;
                    } else {
                        File file2 = sVar.f46885a;
                        long min = Math.min(j3, d);
                        if (z10) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        File file3 = file2;
                        try {
                            p0Var2.u(file3, 0L, min, z13, i10);
                            p0Var2 = file3;
                        } catch (Exception e7) {
                            e = e7;
                            p0Var = p0Var2;
                            p0Var.f46859j.post(new z(p0Var, e, 2));
                            return;
                        }
                    }
                    return;
                } catch (Exception e10) {
                    e = e10;
                    p0Var = p0Var2;
                }
            case 1:
                zc zcVar = (zc) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                c6 c6Var = (c6) obj;
                int i14 = R.raw.star_premium_2;
                if (z12) {
                    string = LocaleController.getString("BoostingGiveawayCreated", R.string.BoostingGiveawayCreated);
                } else {
                    string = LocaleController.getString("BoostingAwardsCreated", R.string.BoostingAwardsCreated);
                }
                if (z12) {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i12 = R.string.BoostingCheckStatistic;
                    } else {
                        i12 = R.string.BoostingCheckStatisticGroup;
                    }
                    string2 = LocaleController.getString(i12);
                } else {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i11 = R.string.BoostingCheckGiftsStatistic;
                    } else {
                        i11 = R.string.BoostingCheckGiftsStatisticGroup;
                    }
                    string2 = LocaleController.getString(i11);
                }
                sc M = zcVar.M(string, AndroidUtilities.replaceSingleTag(string2, h6.Gi, 0, new tg.c(chat), c6Var), i14);
                M.f30540j = 5000;
                M.j();
                return;
            default:
                f5 f5Var = (f5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = f5Var.f52743l;
                int i15 = f5Var.f52734a;
                if (((int[]) obj2)[0] == f5Var.f52744m) {
                    f5Var.f52740i = false;
                    f5Var.f52744m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i15).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i15).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z12) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        f5Var.f52742k = tL_payments_savedStarGifts.next_offset;
                        f5Var.f52745n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        } else {
                            bool = null;
                        }
                        f5Var.h = bool;
                        if (arrayList.size() <= f5Var.f52745n && f5Var.f52742k != null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        f5Var.f52741j = z11;
                    } else {
                        f5Var.f52741j = true;
                    }
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(f5Var.f52735b), f5Var);
                    return;
                }
                return;
        }
    }

    public e0(p0 p0Var, s sVar, boolean z10, l0 l0Var) {
        this.f46688c = p0Var;
        this.d = sVar;
        this.f46687b = z10;
        this.f46689e = l0Var;
    }

    public e0(f5 f5Var, int[] iArr, TLObject tLObject, boolean z10) {
        this.f46688c = f5Var;
        this.d = iArr;
        this.f46689e = tLObject;
        this.f46687b = z10;
    }
}
