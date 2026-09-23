package w9;

import ai.c5;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
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
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.xc;
import org.telegram.ui.TwoStepVerificationActivity;
import tg.n1;
import xh.d2;
import xh.j1;
import xh.o2;
import xh.v3;
import yh.t5;
import yh.y3;
public final class v implements Runnable {
    public final int f44935a;
    public final Object f44936b;
    public final Object f44937c;
    public final Object d;

    public v(Object obj, Object obj2, Object obj3, int i10) {
        this.f44935a = i10;
        this.f44936b = obj;
        this.f44937c = obj2;
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
        int i10 = this.f44935a;
        Object obj = this.d;
        Object obj2 = this.f44937c;
        Object obj3 = this.f44936b;
        switch (i10) {
            case 0:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    ((Task) ((u4.g) obj3).call()).continueWith((Executor) obj2, new w(2, taskCompletionSource));
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                n2 n2Var = (n2) obj;
                ((nr0) obj3).H = -1;
                if (tL_error != null) {
                    xc.a0(n2Var).d0(tL_error, false);
                    return;
                }
                return;
            case 2:
                o2 o2Var = (o2) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                nr0 nr0Var = o2Var.f45999a;
                nr0Var.e.k(o2Var.e.d, savedStarGift);
                ((o70) obj).u();
                nr0Var.n();
                TL_stars.TL_starGiftCollection c11 = nr0Var.e.c(o2Var.e.d);
                if (c11 != null) {
                    xc.a0(nr0Var.f46068a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, y3.D1(savedStarGift.gift), c11.title))).j();
                    return;
                }
                return;
            case 3:
                o2 o2Var2 = (o2) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                j1 j1Var = (j1) obj;
                if (!o2Var2.d && savedStarGift2.pinned_to_top && !savedStarGift2.unsaved) {
                    z10 = true;
                    j1Var.c(false, true);
                    o2Var2.e.m(savedStarGift2, false, false);
                } else {
                    z10 = true;
                }
                savedStarGift2.unsaved ^= z10;
                j1Var.h(savedStarGift2, z10, o2Var2.d);
                o2Var2.f45999a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = o2Var2.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(o2Var2.f46000b).sendRequest(savestargift, null);
                return;
            case 4:
                v3 v3Var = (v3) obj3;
                TLObject tLObject = (TLObject) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = v3Var.f46131m;
                HashMap hashMap2 = v3Var.f46133o;
                HashMap hashMap3 = v3Var.f46132n;
                ArrayList arrayList = v3Var.h;
                ArrayList arrayList2 = v3Var.f46126g;
                ArrayList arrayList3 = v3Var.f46125f;
                int i11 = v3Var.f46122a;
                ArrayList arrayList4 = v3Var.d;
                v3Var.v = -1;
                if (tLObject instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                    MessagesController.getInstance(i11).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i11).putChats(resalestargifts.chats, false);
                    v3Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList4.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList5 = resalestargifts.gifts;
                    int size = arrayList5.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TL_stars.StarGift starGift = arrayList5.get(i12);
                        i12++;
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
                    v3Var.f46139u = z12;
                    v3Var.f46135q = resalestargifts.next_offset;
                    v3Var.f46138t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(t5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(t5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(t5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        v3Var.f46127i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList7 = resalestargifts.counters;
                        int size2 = arrayList7.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList7.get(i13);
                            i13++;
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
                    Utilities.Callback callback = v3Var.f46124c;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                yh.g gVar = (yh.g) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                Context context = (Context) obj;
                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    nf.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject2).url);
                }
                AndroidUtilities.runOnUIThread(new yh.b(gVar, 5), 1000L);
                return;
            case 6:
                yh.g.a0((yh.g) obj3, (TLObject) obj2, (TLRPC.TL_error) obj);
                return;
            case 7:
                y3 y3Var = (y3) obj3;
                Long l4 = (Long) obj2;
                y3Var.Z1(l4.longValue(), new c5(y3Var, l4, (n1[]) obj, 13));
                return;
            case 8:
                y3.j0((y3) obj3, (TLObject) obj2, (MessageObject) obj);
                return;
            case 9:
                y3 y3Var2 = (y3) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                y3Var2.getClass();
                ((nf.e) obj2).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                y3Var2.f47954e0.setResellPrice(zf.a.i(0L, zf.b.f48898a));
                d2 d2Var = y3Var2.f47953d1;
                if (d2Var != null) {
                    d2Var.run();
                }
                hg.c.s(R.string.Gift2ResaleDisable, new Object[]{y3Var2.C1()}, y3Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 10:
                y3 y3Var3 = (y3) obj3;
                y3Var3.getClass();
                ((nf.e) obj2).c(false);
                y3Var3.getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 11:
                ((n1[]) obj3)[0].dismiss();
                ((nf.e) obj2).c(false);
                y3.d2((TwoStepVerificationActivity) obj);
                return;
            case 12:
                y3.T((y3) obj3, (b2) obj2, (MessageObject) obj);
                return;
            case 13:
                y3.V((y3) obj3, (TL_stars.TL_starGiftUnique) obj2, (String) obj);
                return;
            case 14:
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (!(tLObject3 instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    if (tL_error2 == null) {
                        str = "NO_PAYMENT_FORM";
                    } else {
                        str = tL_error2.text;
                    }
                    t5.e(str);
                    callback2.run(null);
                    return;
                }
                callback2.run((TLRPC.TL_payments_paymentFormStarGift) tLObject3);
                return;
            case 15:
                t5 t5Var = (t5) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList8 = t5Var.v;
                boolean[] zArr = t5Var.f47746r;
                ArrayList[] arrayListArr = t5Var.f47745q;
                int i14 = t5Var.f47732a;
                boolean z18 = !t5Var.e;
                t5Var.f47734c = System.currentTimeMillis();
                if (tLObject4 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject4;
                    MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList9 = starsStatus.history;
                        int size3 = arrayList9.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList9.get(i15);
                            i15++;
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
                        for (int i16 = 0; i16 < 3; i16++) {
                            if (arrayListArr[i16].isEmpty() && !zArr[i16]) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            zArr[i16] = z16;
                            boolean[] zArr2 = t5Var.f47749u;
                            if ((starsStatus.flags & 1) == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zArr2[i16] = z17;
                            if (z17) {
                                t5Var.f47748t[i16] = false;
                            }
                            String[] strArr = t5Var.f47747s;
                            if (zArr2[i16]) {
                                str2 = null;
                            } else {
                                str2 = starsStatus.next_offset;
                            }
                            strArr[i16] = str2;
                        }
                        z14 = true;
                    } else {
                        j3 = 0;
                        z14 = false;
                    }
                    if (arrayList8.isEmpty()) {
                        arrayList8.addAll(starsStatus.subscriptions);
                        t5Var.f47751x = false;
                        t5Var.f47750w = starsStatus.subscriptions_next_offset;
                        if ((starsStatus.flags & 4) == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        t5Var.f47752y = z15;
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    long j10 = t5Var.f47735f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z18 = true;
                    }
                    t5Var.f47735f = starsAmount;
                    t5Var.f47736g = j3;
                } else {
                    z13 = false;
                    z14 = false;
                }
                t5Var.d = false;
                t5Var.e = true;
                if (z18) {
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z14) {
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z13) {
                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
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

    public v(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f44935a = i10;
        this.f44936b = obj2;
        this.f44937c = obj3;
        this.d = obj4;
    }
}
