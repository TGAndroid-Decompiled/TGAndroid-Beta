package w9;

import ai.d5;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import hg.k0;
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
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.TwoStepVerificationActivity;
import tg.n1;
import xh.c2;
import xh.i1;
import xh.n2;
import xh.u3;
import yh.a4;
import yh.v5;
public final class v implements Runnable {
    public final int f45013a;
    public final Object f45014b;
    public final Object f45015c;
    public final Object d;

    public v(Object obj, Object obj2, Object obj3, int i10) {
        this.f45013a = i10;
        this.f45014b = obj;
        this.f45015c = obj2;
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
        int i10 = this.f45013a;
        Object obj = this.d;
        Object obj2 = this.f45015c;
        Object obj3 = this.f45014b;
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
                o2 o2Var = (o2) obj;
                ((or0) obj3).H = -1;
                if (tL_error != null) {
                    vc.a0(o2Var).d0(tL_error, false);
                    return;
                }
                return;
            case 2:
                n2 n2Var = (n2) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                or0 or0Var = n2Var.f46062a;
                or0Var.e.k(n2Var.e.d, savedStarGift);
                ((n70) obj).u();
                or0Var.n();
                TL_stars.TL_starGiftCollection c11 = or0Var.e.c(n2Var.e.d);
                if (c11 != null) {
                    vc.a0(or0Var.f46133a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, a4.D1(savedStarGift.gift), c11.title))).j();
                    return;
                }
                return;
            case 3:
                n2 n2Var2 = (n2) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                i1 i1Var = (i1) obj;
                if (!n2Var2.d && savedStarGift2.pinned_to_top && !savedStarGift2.unsaved) {
                    z10 = true;
                    i1Var.c(false, true);
                    n2Var2.e.m(savedStarGift2, false, false);
                } else {
                    z10 = true;
                }
                savedStarGift2.unsaved ^= z10;
                i1Var.h(savedStarGift2, z10, n2Var2.d);
                n2Var2.f46062a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = n2Var2.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(n2Var2.f46063b).sendRequest(savestargift, null);
                return;
            case 4:
                u3 u3Var = (u3) obj3;
                TLObject tLObject = (TLObject) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = u3Var.f46180m;
                HashMap hashMap2 = u3Var.f46182o;
                HashMap hashMap3 = u3Var.f46181n;
                ArrayList arrayList = u3Var.h;
                ArrayList arrayList2 = u3Var.f46175g;
                ArrayList arrayList3 = u3Var.f46174f;
                int i11 = u3Var.f46171a;
                ArrayList arrayList4 = u3Var.d;
                u3Var.v = -1;
                if (tLObject instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                    MessagesController.getInstance(i11).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i11).putChats(resalestargifts.chats, false);
                    u3Var.e = resalestargifts.count;
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
                    if (arrayList4.size() < u3Var.e && !TextUtils.isEmpty(resalestargifts.next_offset)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    u3Var.f46188u = z12;
                    u3Var.f46184q = resalestargifts.next_offset;
                    u3Var.f46187t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(v5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(v5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(v5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        u3Var.f46176i = resalestargifts.attributes_hash;
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
                    Utilities.Callback callback = u3Var.f46173c;
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
                a4 a4Var = (a4) obj3;
                Long l4 = (Long) obj2;
                a4Var.Z1(l4.longValue(), new d5(a4Var, l4, (n1[]) obj, 10));
                return;
            case 8:
                a4.k0((a4) obj3, (TLObject) obj2, (MessageObject) obj);
                return;
            case 9:
                a4 a4Var2 = (a4) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                a4Var2.getClass();
                ((nf.e) obj2).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                a4Var2.f46981e0.setResellPrice(zf.a.i(0L, zf.b.f48982a));
                c2 c2Var = a4Var2.f46980d1;
                if (c2Var != null) {
                    c2Var.run();
                }
                k0.s(R.string.Gift2ResaleDisable, new Object[]{a4Var2.C1()}, a4Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 10:
                a4 a4Var3 = (a4) obj3;
                a4Var3.getClass();
                ((nf.e) obj2).c(false);
                a4Var3.getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 11:
                ((n1[]) obj3)[0].dismiss();
                ((nf.e) obj2).c(false);
                a4.d2((TwoStepVerificationActivity) obj);
                return;
            case 12:
                a4.T((a4) obj3, (org.telegram.ui.ActionBar.c2) obj2, (MessageObject) obj);
                return;
            case 13:
                a4.V((a4) obj3, (TL_stars.TL_starGiftUnique) obj2, (String) obj);
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
                    v5.e(str);
                    callback2.run(null);
                    return;
                }
                callback2.run((TLRPC.TL_payments_paymentFormStarGift) tLObject3);
                return;
            case 15:
                v5 v5Var = (v5) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList8 = v5Var.v;
                boolean[] zArr = v5Var.f47937r;
                ArrayList[] arrayListArr = v5Var.f47936q;
                int i14 = v5Var.f47923a;
                boolean z18 = !v5Var.e;
                v5Var.f47925c = System.currentTimeMillis();
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
                            boolean[] zArr2 = v5Var.f47940u;
                            if ((starsStatus.flags & 1) == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zArr2[i16] = z17;
                            if (z17) {
                                v5Var.f47939t[i16] = false;
                            }
                            String[] strArr = v5Var.f47938s;
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
                        v5Var.f47942x = false;
                        v5Var.f47941w = starsStatus.subscriptions_next_offset;
                        if ((starsStatus.flags & 4) == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        v5Var.f47943y = z15;
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    long j10 = v5Var.f47926f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z18 = true;
                    }
                    v5Var.f47926f = starsAmount;
                    v5Var.f47927g = j3;
                } else {
                    z13 = false;
                    z14 = false;
                }
                v5Var.d = false;
                v5Var.e = true;
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
                v5 v5Var2 = (v5) obj3;
                Runnable runnable2 = (Runnable) obj;
                v5Var2.getClass();
                Iterator it = ((HashSet) obj2).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    v5Var2.Q.remove(num);
                    v5Var2.R.remove(num);
                }
                runnable2.run();
                return;
            default:
                ((boolean[]) obj3)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj2);
                ((g3[]) obj)[0].dismiss();
                return;
        }
    }

    public v(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f45013a = i10;
        this.f45014b = obj2;
        this.f45015c = obj3;
        this.d = obj4;
    }
}
