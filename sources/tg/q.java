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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.yc;
import org.telegram.ui.TwoStepVerificationActivity;
import xh.d2;
import xh.o2;
import xh.v3;
import yh.t5;
import yh.x3;
public final class q implements Runnable {
    public final int f47081a;
    public final Object f47082b;
    public final Object f47083c;
    public final Object d;

    public q(Object obj, Object obj2, Object obj3, int i10) {
        this.f47081a = i10;
        this.f47082b = obj;
        this.f47083c = obj2;
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
        int i10 = this.f47081a;
        Object obj = this.d;
        Object obj2 = this.f47083c;
        Object obj3 = this.f47082b;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error != null) {
                    callback.run(tL_error);
                    return;
                } else {
                    callback2.run(null);
                    return;
                }
            case 1:
                ((q1) obj3).run(new Pair((HashMap) obj2, (ArrayList) obj));
                return;
            case 2:
                uf.d dVar = (uf.d) obj2;
                TLObject tLObject = (TLObject) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                String str3 = dVar.f47627b;
                int i11 = dVar.f47626a;
                if (tLObject != null) {
                    MediaDataController.getInstance(i11).onRingtoneUploaded(str3, (TLRPC.Document) tLObject, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i11).onRingtoneUploaded(str3, null, true);
                    if (tL_error2 != null) {
                        NotificationCenter.getInstance(i11).doOnIdle(new u2.i0(5, dVar, tL_error2));
                    }
                }
                dVar.a();
                return;
            case 3:
                vh.n nVar = (vh.n) obj3;
                r90 r90Var = (r90) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                p90 p90Var = nVar.f48442y;
                if (p90Var != null && nVar.E == r90Var) {
                    p90Var.a(clickableSpan);
                    nVar.E = null;
                    nVar.f48439s.d(true);
                    return;
                }
                return;
            case 4:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    ((Task) ((u4.g) obj3).call()).continueWith((Executor) obj2, new w9.w(2, taskCompletionSource));
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 5:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                n2 n2Var = (n2) obj;
                ((fs0) obj2).H = -1;
                if (tL_error3 != null) {
                    yc.a0(n2Var).d0(tL_error3, false);
                    return;
                }
                return;
            case 6:
                o2 o2Var = (o2) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                fs0 fs0Var = o2Var.f50144a;
                fs0Var.f50220e.k(o2Var.f50147e.d, savedStarGift);
                ((b80) obj).u();
                fs0Var.n();
                TL_stars.TL_starGiftCollection c11 = fs0Var.f50220e.c(o2Var.f50147e.d);
                if (c11 != null) {
                    yc.a0(fs0Var.f50217a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, x3.D1(savedStarGift.gift), c11.title))).j();
                    return;
                }
                return;
            case 7:
                o2 o2Var2 = (o2) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                xh.i1 i1Var = (xh.i1) obj;
                if (!o2Var2.d && savedStarGift2.pinned_to_top && !savedStarGift2.unsaved) {
                    z10 = true;
                    i1Var.c(false, true);
                    o2Var2.f50147e.m(savedStarGift2, false, false);
                } else {
                    z10 = true;
                }
                savedStarGift2.unsaved ^= z10;
                i1Var.h(savedStarGift2, z10, o2Var2.d);
                o2Var2.f50144a.f50220e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = o2Var2.f50147e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(o2Var2.f50145b).sendRequest(savestargift, null);
                return;
            case 8:
                v3 v3Var = (v3) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = v3Var.f50283m;
                HashMap hashMap2 = v3Var.f50285o;
                HashMap hashMap3 = v3Var.f50284n;
                ArrayList arrayList = v3Var.h;
                ArrayList arrayList2 = v3Var.f50278g;
                ArrayList arrayList3 = v3Var.f50277f;
                int i12 = v3Var.f50273a;
                ArrayList arrayList4 = v3Var.d;
                v3Var.v = -1;
                if (tLObject2 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject2;
                    MessagesController.getInstance(i12).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i12).putChats(resalestargifts.chats, false);
                    v3Var.f50276e = resalestargifts.count;
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
                    if (arrayList4.size() < v3Var.f50276e && !TextUtils.isEmpty(resalestargifts.next_offset)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    v3Var.f50291u = z12;
                    v3Var.f50287q = resalestargifts.next_offset;
                    v3Var.f50290t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(t5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(t5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(t5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        v3Var.f50279i = resalestargifts.attributes_hash;
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
                    Utilities.Callback callback3 = v3Var.f50275c;
                    if (callback3 != null) {
                        callback3.run(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                yh.g gVar = (yh.g) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                Context context = (Context) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    nf.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject3).url);
                }
                AndroidUtilities.runOnUIThread(new yh.b(gVar, 5), 1000L);
                return;
            case 10:
                yh.g.Z((yh.g) obj2, (TLObject) obj, (TLRPC.TL_error) obj3);
                return;
            case 11:
                x3 x3Var = (x3) obj3;
                Long l4 = (Long) obj2;
                x3Var.Z1(l4.longValue(), new c5(x3Var, l4, (m1[]) obj, 13));
                return;
            case 12:
                x3.j0((x3) obj3, (TLObject) obj2, (MessageObject) obj);
                return;
            case 13:
                x3 x3Var2 = (x3) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                x3Var2.getClass();
                ((nf.e) obj2).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                x3Var2.f52215e0.setResellPrice(zf.a.i(0L, zf.b.f53297a));
                d2 d2Var = x3Var2.f52214d1;
                if (d2Var != null) {
                    d2Var.run();
                }
                hg.k0.p(R.string.Gift2ResaleDisable, new Object[]{x3Var2.C1()}, x3Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 14:
                x3 x3Var3 = (x3) obj2;
                x3Var3.getClass();
                ((nf.e) obj).c(false);
                x3Var3.getBulletinFactory().d0((TLRPC.TL_error) obj3, false);
                return;
            case 15:
                ((m1[]) obj3)[0].dismiss();
                ((nf.e) obj2).c(false);
                x3.d2((TwoStepVerificationActivity) obj);
                return;
            case 16:
                x3.R((x3) obj3, (b2) obj2, (MessageObject) obj);
                return;
            case 17:
                x3.T((x3) obj3, (TL_stars.TL_starGiftUnique) obj2, (String) obj);
                return;
            case 18:
                TLObject tLObject4 = (TLObject) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                Utilities.Callback callback4 = (Utilities.Callback) obj2;
                if (!(tLObject4 instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    if (tL_error4 == null) {
                        str = "NO_PAYMENT_FORM";
                    } else {
                        str = tL_error4.text;
                    }
                    t5.e(str);
                    callback4.run(null);
                    return;
                }
                callback4.run((TLRPC.TL_payments_paymentFormStarGift) tLObject4);
                return;
            case 19:
                t5 t5Var = (t5) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList8 = t5Var.v;
                boolean[] zArr = t5Var.f52026r;
                ArrayList[] arrayListArr = t5Var.f52025q;
                int i15 = t5Var.f52011a;
                boolean z18 = !t5Var.f52014e;
                t5Var.f52013c = System.currentTimeMillis();
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
                            boolean[] zArr2 = t5Var.f52029u;
                            if ((starsStatus.flags & 1) == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zArr2[i17] = z17;
                            if (z17) {
                                t5Var.f52028t[i17] = false;
                            }
                            String[] strArr = t5Var.f52027s;
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
                        t5Var.f52031x = false;
                        t5Var.f52030w = starsStatus.subscriptions_next_offset;
                        if ((starsStatus.flags & 4) == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        t5Var.f52032y = z15;
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    long j10 = t5Var.f52015f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z18 = true;
                    }
                    t5Var.f52015f = starsAmount;
                    t5Var.f52016g = j3;
                } else {
                    z13 = false;
                    z14 = false;
                }
                t5Var.d = false;
                t5Var.f52014e = true;
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
            case 20:
                t5 t5Var2 = (t5) obj3;
                Runnable runnable2 = (Runnable) obj;
                t5Var2.getClass();
                Iterator it = ((HashSet) obj2).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    t5Var2.Q.remove(num);
                    t5Var2.R.remove(num);
                }
                runnable2.run();
                return;
            default:
                ((boolean[]) obj3)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj2);
                ((f3[]) obj)[0].dismiss();
                return;
        }
    }

    public q(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TLRPC.TL_error tL_error, int i10) {
        this.f47081a = i10;
        this.f47083c = notificationCenterDelegate;
        this.d = obj;
        this.f47082b = tL_error;
    }

    public q(fs0 fs0Var, TLRPC.TL_error tL_error, n2 n2Var) {
        this.f47081a = 5;
        this.f47083c = fs0Var;
        this.f47082b = tL_error;
        this.d = n2Var;
    }

    public q(x3 x3Var, m1[] m1VarArr, nf.e eVar, TwoStepVerificationActivity twoStepVerificationActivity) {
        this.f47081a = 15;
        this.f47082b = m1VarArr;
        this.f47083c = eVar;
        this.d = twoStepVerificationActivity;
    }

    public q(t5 t5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback callback) {
        this.f47081a = 18;
        this.d = tLObject;
        this.f47082b = tL_error;
        this.f47083c = callback;
    }
}
