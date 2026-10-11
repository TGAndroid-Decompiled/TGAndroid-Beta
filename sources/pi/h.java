package pi;

import ai.d5;
import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.webkit.WebView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ii.q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.TwoStepVerificationActivity;
import tg.c1;
import tg.m1;
import tg.w0;
import vh.n;
import w9.w;
import xh.d2;
import xh.j1;
import xh.o2;
import xh.v3;
import yh.n5;
import yh.s3;
public final class h implements Runnable {
    public final int f45943a;
    public final Object f45944b;
    public final Object f45945c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i10) {
        this.f45943a = i10;
        this.f45944b = obj;
        this.f45945c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        TLRPC.User user;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        long j3;
        boolean z16;
        boolean z17;
        boolean z18;
        String str;
        ?? r32;
        boolean z19 = true;
        switch (this.f45943a) {
            case 0:
                k kVar = (k) this.f45944b;
                WebView webView = (WebView) this.f45945c;
                b5.h hVar = (b5.h) this.d;
                synchronized (kVar.f45952a) {
                    if (!kVar.f45970u && kVar.f45964o == webView && kVar.f45965p == hVar && !kVar.f45967r) {
                        if (kVar.f45968s) {
                            FileLog.e("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            kVar.o();
                            return;
                        }
                        kVar.f45968s = true;
                        FileLog.e("WEB proxy: Base64 bridge installation timed out; retrying once");
                        kVar.f();
                        return;
                    }
                    return;
                }
            case 1:
                ((w0) this.f45944b).run(new Pair((HashMap) this.f45945c, (ArrayList) this.d));
                return;
            case 2:
                TLObject tLObject = (TLObject) this.f45944b;
                MessagesController messagesController = (MessagesController) this.f45945c;
                w0 w0Var = (w0) this.d;
                if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i10).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(messagesController.getInputPeer(peer));
                        }
                    }
                    w0Var.run(arrayList);
                    return;
                }
                return;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f45944b;
                Utilities.Callback callback = (Utilities.Callback) this.f45945c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                if (tL_error != null) {
                    callback.run(tL_error);
                    return;
                } else {
                    callback2.run(null);
                    return;
                }
            case 4:
                ((q1) this.f45944b).run(new Pair((HashMap) this.f45945c, (ArrayList) this.d));
                return;
            case 5:
                vf.d dVar = (vf.d) this.f45944b;
                TLObject tLObject2 = (TLObject) this.f45945c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                String str2 = dVar.f49648b;
                int i11 = dVar.f49647a;
                if (tLObject2 != null) {
                    MediaDataController.getInstance(i11).onRingtoneUploaded(str2, (TLRPC.Document) tLObject2, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i11).onRingtoneUploaded(str2, null, true);
                    if (tL_error2 != null) {
                        NotificationCenter.getInstance(i11).doOnIdle(new c1(7, dVar, tL_error2));
                    }
                }
                dVar.a();
                return;
            case 6:
                n nVar = (n) this.f45944b;
                ga0 ga0Var = (ga0) this.f45945c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                ea0 ea0Var = nVar.G;
                if (ea0Var != null && nVar.H == ga0Var) {
                    ea0Var.a(clickableSpan);
                    nVar.H = null;
                    nVar.f49826x.d(true);
                    return;
                }
                return;
            case 7:
                u4.f fVar = (u4.f) this.f45944b;
                Executor executor = (Executor) this.f45945c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    ((Task) fVar.call()).continueWith(executor, new w(2, taskCompletionSource));
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 8:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f45945c;
                m2 m2Var = (m2) this.d;
                ((ts0) this.f45944b).H = -1;
                if (tL_error3 != null) {
                    ad.a0(m2Var).f0(tL_error3, false);
                    return;
                }
                return;
            case 9:
                o2 o2Var = (o2) this.f45944b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f45945c;
                ts0 ts0Var = o2Var.f51522a;
                ts0Var.f51601e.k(o2Var.f51525e.d, savedStarGift);
                ((q80) this.d).u();
                ts0Var.n();
                TL_stars.TL_starGiftCollection c10 = ts0Var.f51601e.c(o2Var.f51525e.d);
                if (c10 != null) {
                    ad.a0(ts0Var.f51598a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, s3.E1(savedStarGift.gift), c10.title))).j();
                    return;
                }
                return;
            case 10:
                o2 o2Var2 = (o2) this.f45944b;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.f45945c;
                j1 j1Var = (j1) this.d;
                if (!o2Var2.d && savedStarGift2.pinned_to_top && !savedStarGift2.unsaved) {
                    z10 = true;
                    j1Var.c(false, true);
                    o2Var2.f51525e.m(savedStarGift2, false, false);
                } else {
                    z10 = true;
                }
                savedStarGift2.unsaved ^= z10;
                j1Var.h(savedStarGift2, z10, o2Var2.d);
                o2Var2.f51522a.f51601e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = o2Var2.f51525e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(o2Var2.f51523b).sendRequest(savestargift, null);
                return;
            case 11:
                v3 v3Var = (v3) this.f45944b;
                TLObject tLObject3 = (TLObject) this.f45945c;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.d;
                HashMap hashMap = v3Var.f51649m;
                HashMap hashMap2 = v3Var.f51651o;
                HashMap hashMap3 = v3Var.f51650n;
                ArrayList arrayList2 = v3Var.h;
                ArrayList arrayList3 = v3Var.f51644g;
                ArrayList arrayList4 = v3Var.f51643f;
                int i12 = v3Var.f51639a;
                ArrayList arrayList5 = v3Var.d;
                v3Var.v = -1;
                if (tLObject3 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject3;
                    MessagesController.getInstance(i12).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i12).putChats(resalestargifts.chats, false);
                    v3Var.f51642e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList5.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList6 = resalestargifts.gifts;
                    int size = arrayList6.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_stars.StarGift starGift = arrayList6.get(i13);
                        i13++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList5.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    if (arrayList5.size() < v3Var.f51642e && !TextUtils.isEmpty(resalestargifts.next_offset)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    v3Var.f51657u = z12;
                    v3Var.f51653q = resalestargifts.next_offset;
                    v3Var.f51656t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList7 = resalestargifts.attributes;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList4.clear();
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList4.addAll(n5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList3.addAll(n5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList2.addAll(n5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        v3Var.f51645i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList8 = resalestargifts.counters;
                        int size2 = arrayList8.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList8.get(i14);
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
                    Utilities.Callback callback3 = v3Var.f51641c;
                    if (callback3 != null) {
                        callback3.run(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                yh.g gVar = (yh.g) this.f45944b;
                TLObject tLObject4 = (TLObject) this.f45945c;
                Context context = (Context) this.d;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    of.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new yh.b(gVar, 5), 1000L);
                return;
            case 13:
                yh.g.a0((yh.g) this.f45944b, (TLObject) this.f45945c, (TLRPC.TL_error) this.d);
                return;
            case 14:
                s3 s3Var = (s3) this.f45944b;
                Long l4 = (Long) this.f45945c;
                s3Var.a2(l4.longValue(), new d5(s3Var, l4, (m1[]) this.d, 13));
                return;
            case 15:
                s3.k0((s3) this.f45944b, (TLObject) this.f45945c, (MessageObject) this.d);
                return;
            case 16:
                s3 s3Var2 = (s3) this.f45944b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                s3Var2.getClass();
                ((of.e) this.f45945c).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                s3Var2.f53256f0.setResellPrice(zf.a.i(0L, zf.b.f54530a));
                d2 d2Var = s3Var2.f53255e1;
                if (d2Var != null) {
                    d2Var.run();
                }
                hg.c.q(R.string.Gift2ResaleDisable, new Object[]{s3Var2.D1()}, s3Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 17:
                s3 s3Var3 = (s3) this.f45944b;
                s3Var3.getClass();
                ((of.e) this.f45945c).c(false);
                s3Var3.getBulletinFactory().f0((TLRPC.TL_error) this.d, false);
                return;
            case 18:
                ((m1[]) this.f45944b)[0].dismiss();
                ((of.e) this.f45945c).c(false);
                s3.e2((TwoStepVerificationActivity) this.d);
                return;
            case 19:
                s3.U((s3) this.f45944b, (a2) this.f45945c, (MessageObject) this.d);
                return;
            case 20:
                s3.W((s3) this.f45944b, (TL_stars.TL_starGiftUnique) this.f45945c, (String) this.d);
                return;
            case 21:
                TLObject tLObject5 = (TLObject) this.f45944b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f45945c;
                Utilities.Callback callback4 = (Utilities.Callback) this.d;
                if (!(tLObject5 instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    String str3 = "NO_PAYMENT_FORM";
                    if (tL_error4 != null) {
                        str3 = tL_error4.text;
                    }
                    n5.e(str3);
                    callback4.run(null);
                    return;
                }
                callback4.run((TLRPC.TL_payments_paymentFormStarGift) tLObject5);
                return;
            case 22:
                n5 n5Var = (n5) this.f45944b;
                TLObject tLObject6 = (TLObject) this.f45945c;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList9 = n5Var.v;
                boolean[] zArr = n5Var.f53012r;
                ArrayList[] arrayListArr = n5Var.f53011q;
                int i15 = n5Var.f52997a;
                boolean z20 = !n5Var.f53000e;
                n5Var.f52999c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList10 = starsStatus.history;
                        int size3 = arrayList10.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList10.get(i16);
                            i16++;
                            boolean z21 = z19;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            if (starsTransaction2.amount.amount > 0) {
                                r32 = z21;
                            } else {
                                r32 = 2;
                            }
                            arrayListArr[r32].add(starsTransaction2);
                            z19 = z21;
                        }
                        z13 = z19;
                        j3 = 0;
                        for (int i17 = 0; i17 < 3; i17++) {
                            if (arrayListArr[i17].isEmpty() && !zArr[i17]) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            zArr[i17] = z17;
                            boolean[] zArr2 = n5Var.f53015u;
                            if ((starsStatus.flags & 1) == 0) {
                                z18 = z13;
                            } else {
                                z18 = false;
                            }
                            zArr2[i17] = z18;
                            if (z18) {
                                n5Var.f53014t[i17] = false;
                            }
                            String[] strArr = n5Var.f53013s;
                            if (zArr2[i17]) {
                                str = null;
                            } else {
                                str = starsStatus.next_offset;
                            }
                            strArr[i17] = str;
                        }
                        z14 = z13;
                    } else {
                        z13 = true;
                        j3 = 0;
                        z14 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList9.addAll(starsStatus.subscriptions);
                        n5Var.f53017x = false;
                        n5Var.f53016w = starsStatus.subscriptions_next_offset;
                        if ((starsStatus.flags & 4) == 0) {
                            z16 = z13;
                        } else {
                            z16 = false;
                        }
                        n5Var.f53018y = z16;
                        z15 = z13;
                    } else {
                        z15 = false;
                    }
                    long j10 = n5Var.f53001f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z20 = z13;
                    }
                    n5Var.f53001f = starsAmount;
                    n5Var.f53002g = j3;
                } else {
                    z13 = true;
                    z14 = false;
                    z15 = false;
                }
                n5Var.d = false;
                n5Var.f53000e = z13;
                if (z20) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z14) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z15) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 23:
                n5 n5Var2 = (n5) this.f45944b;
                Runnable runnable2 = (Runnable) this.d;
                n5Var2.getClass();
                Iterator it = ((HashSet) this.f45945c).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    n5Var2.Q.remove(num);
                    n5Var2.R.remove(num);
                }
                runnable2.run();
                return;
            default:
                ((boolean[]) this.f45944b)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f45945c);
                ((e3[]) this.d)[0].dismiss();
                return;
        }
    }

    public h(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f45943a = i10;
        this.f45944b = obj2;
        this.f45945c = obj3;
        this.d = obj4;
    }
}
