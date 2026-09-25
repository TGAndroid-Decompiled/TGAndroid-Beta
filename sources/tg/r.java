package tg;

import ai.c5;
import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ii.q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.TwoStepVerificationActivity;
import xh.d2;
import xh.o2;
import xh.v3;
import yh.s5;
import yh.x3;
public final class r implements Runnable {
    public final int f43479a;
    public final Object f43480b;
    public final Object f43481c;
    public final Object d;

    public r(Object obj, Object obj2, Object obj3, int i10) {
        this.f43479a = i10;
        this.f43480b = obj;
        this.f43481c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        long j3;
        boolean z15;
        boolean z16;
        boolean z17;
        String str2;
        char c10;
        int i10 = this.f43479a;
        Object obj = this.d;
        Object obj2 = this.f43481c;
        Object obj3 = this.f43480b;
        switch (i10) {
            case 0:
                ((q1) obj3).run(new Pair((HashMap) obj2, (ArrayList) obj));
                return;
            case 1:
                uf.d dVar = (uf.d) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                String str3 = dVar.f43986b;
                int i11 = dVar.f43985a;
                if (tLObject != null) {
                    MediaDataController.getInstance(i11).onRingtoneUploaded(str3, (TLRPC.Document) tLObject, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i11).onRingtoneUploaded(str3, null, true);
                    if (tL_error != null) {
                        NotificationCenter.getInstance(i11).doOnIdle(new u2.p0(4, dVar, tL_error));
                    }
                }
                dVar.a();
                return;
            case 2:
                vh.n nVar = (vh.n) obj3;
                o90 o90Var = (o90) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                m90 m90Var = nVar.f44741y;
                if (m90Var != null && nVar.E == o90Var) {
                    m90Var.a(clickableSpan);
                    nVar.E = null;
                    nVar.f44738s.d(true);
                    return;
                }
                return;
            case 3:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    ((Task) ((u4.g) obj3).call()).continueWith((Executor) obj2, new w9.v(2, taskCompletionSource));
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 4:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                m2 m2Var = (m2) obj;
                ((zr0) obj3).H = -1;
                if (tL_error2 != null) {
                    xc.a0(m2Var).d0(tL_error2, false);
                    return;
                }
                return;
            case 5:
                o2 o2Var = (o2) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                zr0 zr0Var = o2Var.f46328a;
                zr0Var.e.k(o2Var.e.d, savedStarGift);
                ((y70) obj).u();
                zr0Var.n();
                TL_stars.TL_starGiftCollection c11 = zr0Var.e.c(o2Var.e.d);
                if (c11 != null) {
                    xc.a0(zr0Var.f46397a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, x3.D1(savedStarGift.gift), c11.title))).j();
                    return;
                }
                return;
            case 6:
                o2 o2Var2 = (o2) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                xh.j1 j1Var = (xh.j1) obj;
                if (!o2Var2.d && savedStarGift2.pinned_to_top && !savedStarGift2.unsaved) {
                    z10 = true;
                    j1Var.c(false, true);
                    o2Var2.e.m(savedStarGift2, false, false);
                } else {
                    z10 = true;
                }
                savedStarGift2.unsaved ^= z10;
                j1Var.h(savedStarGift2, z10, o2Var2.d);
                o2Var2.f46328a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = o2Var2.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(o2Var2.f46329b).sendRequest(savestargift, null);
                return;
            case 7:
                v3 v3Var = (v3) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = v3Var.f46460m;
                HashMap hashMap2 = v3Var.f46462o;
                HashMap hashMap3 = v3Var.f46461n;
                ArrayList arrayList = v3Var.h;
                ArrayList arrayList2 = v3Var.f46455g;
                ArrayList arrayList3 = v3Var.f46454f;
                int i12 = v3Var.f46451a;
                ArrayList arrayList4 = v3Var.d;
                v3Var.v = -1;
                if (tLObject2 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject2;
                    MessagesController.getInstance(i12).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i12).putChats(resalestargifts.chats, false);
                    v3Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList4.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList5 = resalestargifts.gifts;
                    int size = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_stars.StarGift starGift = arrayList5.get(i13);
                        i13++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList4.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    if (arrayList4.size() < v3Var.e && !TextUtils.isEmpty(resalestargifts.next_offset)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    v3Var.f46468u = z12;
                    v3Var.f46464q = resalestargifts.next_offset;
                    v3Var.f46467t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(s5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(s5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(s5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        v3Var.f46456i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList7 = resalestargifts.counters;
                        int size2 = arrayList7.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList7.get(i14);
                            i14++;
                            TL_stars.starGiftAttributeCounter stargiftattributecounter2 = stargiftattributecounter;
                            TL_stars.StarGiftAttributeId starGiftAttributeId = stargiftattributecounter2.attribute;
                            if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdBackdrop) {
                                hashMap3.put(Integer.valueOf(starGiftAttributeId.backdrop_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdPattern) {
                                hashMap2.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdModel) {
                                hashMap.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            }
                        }
                    }
                    Utilities.Callback callback = v3Var.f46453c;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                yh.g gVar = (yh.g) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                Context context = (Context) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    nf.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject3).url);
                }
                AndroidUtilities.runOnUIThread(new yh.b(gVar, 5), 1000L);
                return;
            case 9:
                yh.g.a0((yh.g) obj3, (TLObject) obj2, (TLRPC.TL_error) obj);
                return;
            case 10:
                x3 x3Var = (x3) obj3;
                Long l4 = (Long) obj2;
                x3Var.Z1(l4.longValue(), new c5(x3Var, l4, (m1[]) obj, 13));
                return;
            case 11:
                x3.j0((x3) obj3, (TLObject) obj2, (MessageObject) obj);
                return;
            case 12:
                x3 x3Var2 = (x3) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                x3Var2.getClass();
                ((nf.e) obj2).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                x3Var2.f48237e0.setResellPrice(zf.a.i(0L, zf.b.f49228a));
                d2 d2Var = x3Var2.f48236d1;
                if (d2Var != null) {
                    d2Var.run();
                }
                hg.c.q(R.string.Gift2ResaleDisable, new Object[]{x3Var2.C1()}, x3Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 13:
                x3 x3Var3 = (x3) obj3;
                x3Var3.getClass();
                ((nf.e) obj2).c(false);
                x3Var3.getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 14:
                ((m1[]) obj3)[0].dismiss();
                ((nf.e) obj2).c(false);
                x3.d2((TwoStepVerificationActivity) obj);
                return;
            case 15:
                x3.T((x3) obj3, (a2) obj2, (MessageObject) obj);
                return;
            case 16:
                x3.V((x3) obj3, (TL_stars.TL_starGiftUnique) obj2, (String) obj);
                return;
            case 17:
                TLObject tLObject4 = (TLObject) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (!(tLObject4 instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    if (tL_error3 == null) {
                        str = "NO_PAYMENT_FORM";
                    } else {
                        str = tL_error3.text;
                    }
                    s5.e(str);
                    callback2.run(null);
                    return;
                }
                callback2.run((TLRPC.TL_payments_paymentFormStarGift) tLObject4);
                return;
            case 18:
                s5 s5Var = (s5) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList8 = s5Var.v;
                boolean[] zArr = s5Var.f48026r;
                ArrayList[] arrayListArr = s5Var.f48025q;
                int i15 = s5Var.f48012a;
                boolean z18 = !s5Var.e;
                s5Var.f48014c = System.currentTimeMillis();
                if (tLObject5 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject5;
                    MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList9 = starsStatus.history;
                        int size3 = arrayList9.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList9.get(i16);
                            i16++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            if (starsTransaction2.amount.amount > 0) {
                                c10 = 1;
                            } else {
                                c10 = 2;
                            }
                            arrayListArr[c10].add(starsTransaction2);
                        }
                        j3 = 0;
                        for (int i17 = 0; i17 < 3; i17++) {
                            if (arrayListArr[i17].isEmpty() && !zArr[i17]) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            zArr[i17] = z16;
                            boolean[] zArr2 = s5Var.f48029u;
                            if ((starsStatus.flags & 1) == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zArr2[i17] = z17;
                            if (z17) {
                                s5Var.f48028t[i17] = false;
                            }
                            String[] strArr = s5Var.f48027s;
                            if (zArr2[i17]) {
                                str2 = null;
                            } else {
                                str2 = starsStatus.next_offset;
                            }
                            strArr[i17] = str2;
                        }
                        z14 = true;
                    } else {
                        j3 = 0;
                        z14 = false;
                    }
                    if (arrayList8.isEmpty()) {
                        arrayList8.addAll(starsStatus.subscriptions);
                        s5Var.f48031x = false;
                        s5Var.f48030w = starsStatus.subscriptions_next_offset;
                        if ((starsStatus.flags & 4) == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        s5Var.f48032y = z15;
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    long j10 = s5Var.f48015f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z18 = true;
                    }
                    s5Var.f48015f = starsAmount;
                    s5Var.f48016g = j3;
                } else {
                    z13 = false;
                    z14 = false;
                }
                s5Var.d = false;
                s5Var.e = true;
                if (z18) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z14) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z13) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 19:
                s5 s5Var2 = (s5) obj3;
                Runnable runnable2 = (Runnable) obj;
                s5Var2.getClass();
                Iterator it = ((HashSet) obj2).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    s5Var2.Q.remove(num);
                    s5Var2.R.remove(num);
                }
                runnable2.run();
                return;
            default:
                ((boolean[]) obj3)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj2);
                ((e3[]) obj)[0].dismiss();
                return;
        }
    }

    public r(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f43479a = i10;
        this.f43480b = obj2;
        this.f43481c = obj3;
        this.d = obj4;
    }
}
