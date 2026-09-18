package tg;

import ai.d5;
import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
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
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.TwoStepVerificationActivity;
import xh.d2;
import xh.o2;
import xh.v3;
import yh.t5;
import yh.y3;
public final class r implements Runnable {
    public final int f43449a;
    public final Object f43450b;
    public final Object f43451c;
    public final Object d;

    public r(Object obj, Object obj2, Object obj3, int i10) {
        this.f43449a = i10;
        this.f43450b = obj;
        this.f43451c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        Runnable runnable;
        boolean z13;
        boolean z14;
        long j3;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        String str2;
        char c10;
        int i10 = this.f43449a;
        char c11 = 0;
        Object obj = this.d;
        Object obj2 = this.f43451c;
        Object obj3 = this.f43450b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.web.b1) obj3).run(new Pair((HashMap) obj2, (ArrayList) obj));
                return;
            case 1:
                uf.e eVar = (uf.e) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                String str3 = eVar.f43958b;
                int i11 = eVar.f43957a;
                if (tLObject != null) {
                    MediaDataController.getInstance(i11).onRingtoneUploaded(str3, (TLRPC.Document) tLObject, false);
                } else {
                    eVar.a();
                    MediaDataController.getInstance(i11).onRingtoneUploaded(str3, null, true);
                    if (tL_error != null) {
                        NotificationCenter.getInstance(i11).doOnIdle(new uf.b(3, eVar, tL_error));
                    }
                }
                eVar.a();
                return;
            case 2:
                vh.o oVar = (vh.o) obj3;
                m90 m90Var = (m90) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                k90 k90Var = oVar.f44713y;
                if (k90Var != null && oVar.E == m90Var) {
                    k90Var.a(clickableSpan);
                    oVar.E = null;
                    oVar.f44710s.d(true);
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
                n2 n2Var = (n2) obj;
                ((zr0) obj3).H = -1;
                if (tL_error2 != null) {
                    xc.a0(n2Var).d0(tL_error2, false);
                    return;
                }
                return;
            case 5:
                o2 o2Var = (o2) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                zr0 zr0Var = o2Var.f46300a;
                zr0Var.e.k(o2Var.e.d, savedStarGift);
                ((w70) obj).u();
                zr0Var.n();
                TL_stars.TL_starGiftCollection c12 = zr0Var.e.c(o2Var.e.d);
                if (c12 != null) {
                    xc.a0(zr0Var.f46369a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, y3.D1(savedStarGift.gift), c12.title))).j();
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
                o2Var2.f46300a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = o2Var2.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(o2Var2.f46301b).sendRequest(savestargift, null);
                return;
            case 7:
                v3 v3Var = (v3) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = v3Var.f46432m;
                HashMap hashMap2 = v3Var.f46434o;
                HashMap hashMap3 = v3Var.f46433n;
                ArrayList arrayList = v3Var.h;
                ArrayList arrayList2 = v3Var.f46427g;
                ArrayList arrayList3 = v3Var.f46426f;
                int i12 = v3Var.f46423a;
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
                    v3Var.f46440u = z12;
                    v3Var.f46436q = resalestargifts.next_offset;
                    v3Var.f46439t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(t5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(t5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(t5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        v3Var.f46428i = resalestargifts.attributes_hash;
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
                    Utilities.Callback callback = v3Var.f46425c;
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
                y3 y3Var = (y3) obj3;
                Long l4 = (Long) obj2;
                y3Var.Z1(l4.longValue(), new d5(y3Var, l4, (m1[]) obj, 10));
                return;
            case 11:
                y3.k0((y3) obj3, (TLObject) obj2, (MessageObject) obj);
                return;
            case 12:
                y3 y3Var2 = (y3) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                y3Var2.getClass();
                ((nf.e) obj2).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                y3Var2.f48264e0.setResellPrice(zf.a.i(0L, zf.b.f49208a));
                d2 d2Var = y3Var2.f48263d1;
                if (d2Var != null) {
                    d2Var.run();
                }
                hg.k0.p(R.string.Gift2ResaleDisable, new Object[]{y3Var2.C1()}, y3Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 13:
                y3 y3Var3 = (y3) obj3;
                y3Var3.getClass();
                ((nf.e) obj2).c(false);
                y3Var3.getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 14:
                ((m1[]) obj3)[0].dismiss();
                ((nf.e) obj2).c(false);
                y3.d2((TwoStepVerificationActivity) obj);
                return;
            case 15:
                y3.T((y3) obj3, (b2) obj2, (MessageObject) obj);
                return;
            case 16:
                y3.V((y3) obj3, (TL_stars.TL_starGiftUnique) obj2, (String) obj);
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
                    t5.e(str);
                    callback2.run(null);
                    return;
                }
                callback2.run((TLRPC.TL_payments_paymentFormStarGift) tLObject4);
                return;
            case 18:
                t5 t5Var = (t5) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList8 = t5Var.v;
                boolean[] zArr = t5Var.f48056r;
                ArrayList[] arrayListArr = t5Var.f48055q;
                int i15 = t5Var.f48042a;
                boolean z19 = !t5Var.e;
                t5Var.f48044c = System.currentTimeMillis();
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
                            arrayListArr[c11].add(starsTransaction2);
                            Runnable runnable3 = runnable2;
                            if (starsTransaction2.amount.amount > 0) {
                                c10 = 1;
                            } else {
                                c10 = 2;
                            }
                            arrayListArr[c10].add(starsTransaction2);
                            runnable2 = runnable3;
                            c11 = 0;
                        }
                        runnable = runnable2;
                        j3 = 0;
                        for (int i17 = 0; i17 < 3; i17++) {
                            if (arrayListArr[i17].isEmpty() && !zArr[i17]) {
                                z17 = false;
                            } else {
                                z17 = true;
                            }
                            zArr[i17] = z17;
                            boolean[] zArr2 = t5Var.f48059u;
                            if ((starsStatus.flags & 1) == 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zArr2[i17] = z18;
                            if (z18) {
                                t5Var.f48058t[i17] = false;
                            }
                            String[] strArr = t5Var.f48057s;
                            if (zArr2[i17]) {
                                str2 = null;
                            } else {
                                str2 = starsStatus.next_offset;
                            }
                            strArr[i17] = str2;
                        }
                        z15 = true;
                    } else {
                        runnable = runnable2;
                        j3 = 0;
                        z15 = false;
                    }
                    if (arrayList8.isEmpty()) {
                        arrayList8.addAll(starsStatus.subscriptions);
                        t5Var.f48061x = false;
                        t5Var.f48060w = starsStatus.subscriptions_next_offset;
                        if ((starsStatus.flags & 4) == 0) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        t5Var.f48062y = z16;
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    long j10 = t5Var.f48045f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z19 = true;
                    }
                    t5Var.f48045f = starsAmount;
                    t5Var.f48046g = j3;
                    z14 = z15;
                } else {
                    runnable = runnable2;
                    z13 = false;
                    z14 = false;
                }
                t5Var.d = false;
                t5Var.e = true;
                if (z19) {
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
                t5 t5Var2 = (t5) obj3;
                Runnable runnable4 = (Runnable) obj;
                t5Var2.getClass();
                Iterator it = ((HashSet) obj2).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    t5Var2.Q.remove(num);
                    t5Var2.R.remove(num);
                }
                runnable4.run();
                return;
            default:
                ((boolean[]) obj3)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj2);
                ((f3[]) obj)[0].dismiss();
                return;
        }
    }

    public r(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f43449a = i10;
        this.f43450b = obj2;
        this.f43451c = obj3;
        this.d = obj4;
    }
}
