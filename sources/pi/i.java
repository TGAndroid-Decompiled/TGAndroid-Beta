package pi;

import ai.d5;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ii.q1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.TwoStepVerificationActivity;
import qi.b0;
import qi.l0;
import qi.m0;
import qi.p0;
import qi.z;
import tg.m1;
import tg.x0;
import tg.y;
import w7.w6;
import w9.x;
import xh.c2;
import xh.i1;
import xh.n2;
import xh.u3;
import yh.n5;
import yh.s3;
public final class i implements Runnable {
    public final int f45792a;
    public final Object f45793b;
    public final Object f45794c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f45792a = i10;
        this.f45793b = obj;
        this.f45794c = obj2;
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
        boolean z16;
        long j3;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        String str;
        char c10;
        ?? r11 = 0;
        switch (this.f45792a) {
            case 0:
                ((t) this.f45793b).f45824f.onOutputInvalidated(((n) this.f45794c).f45801a, (o) this.d);
                return;
            case 1:
                qi.p pVar = (qi.p) this.f45793b;
                HandlerThread handlerThread = (HandlerThread) this.f45794c;
                CountDownLatch countDownLatch = (CountDownLatch) this.d;
                pVar.getClass();
                try {
                    pVar.h();
                    return;
                } finally {
                    handlerThread.quitSafely();
                    countDownLatch.countDown();
                }
            case 2:
                p0 p0Var = (p0) this.f45793b;
                qi.s sVar = (qi.s) this.f45794c;
                File file = (File) this.d;
                Handler handler = p0Var.f46867j;
                try {
                    sVar.e(file);
                    p0Var.g();
                    long d = w6.d(file) / 1000;
                    p0Var.f46871n.b("preview snapshot completed: durationMs=" + d + ", size=" + file.length() + ", elapsedMs=" + p0.f(p0Var.K));
                    handler.post(new b0(p0Var, d, 1));
                    return;
                } catch (Exception e7) {
                    handler.post(new z(p0Var, e7, 3));
                    return;
                }
            case 3:
                File file2 = (File) this.d;
                m0 m0Var = ((p0) this.f45793b).f46863e;
                long j10 = ((l0) this.f45794c).f46807a;
                m11 m11Var = (m11) m0Var;
                synchronized (m11Var) {
                    if (!m11Var.d) {
                        m11Var.f28355c.put(Long.valueOf(j10), new k11(file2));
                        return;
                    }
                    return;
                }
            case 4:
                ((x0) this.f45793b).run(new Pair((HashMap) this.f45794c, (ArrayList) this.d));
                return;
            case 5:
                TLObject tLObject = (TLObject) this.f45793b;
                MessagesController messagesController = (MessagesController) this.f45794c;
                x0 x0Var = (x0) this.d;
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
                    x0Var.run(arrayList);
                    return;
                }
                return;
            case 6:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f45793b;
                Utilities.Callback callback = (Utilities.Callback) this.f45794c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                if (tL_error != null) {
                    callback.run(tL_error);
                    return;
                } else {
                    callback2.run(null);
                    return;
                }
            case 7:
                ((q1) this.f45793b).run(new Pair((HashMap) this.f45794c, (ArrayList) this.d));
                return;
            case 8:
                vf.d dVar = (vf.d) this.f45793b;
                TLObject tLObject2 = (TLObject) this.f45794c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                String str2 = dVar.f49797b;
                int i11 = dVar.f49796a;
                if (tLObject2 != null) {
                    MediaDataController.getInstance(i11).onRingtoneUploaded(str2, (TLRPC.Document) tLObject2, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i11).onRingtoneUploaded(str2, null, true);
                    if (tL_error2 != null) {
                        NotificationCenter.getInstance(i11).doOnIdle(new y(9, dVar, tL_error2));
                    }
                }
                dVar.a();
                return;
            case 9:
                vh.n nVar = (vh.n) this.f45793b;
                ja0 ja0Var = (ja0) this.f45794c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                ha0 ha0Var = nVar.G;
                if (ha0Var != null && nVar.H == ja0Var) {
                    ha0Var.a(clickableSpan);
                    nVar.H = null;
                    nVar.f49975x.d(true);
                    return;
                }
                return;
            case 10:
                u4.f fVar = (u4.f) this.f45793b;
                Executor executor = (Executor) this.f45794c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    ((Task) fVar.call()).continueWith(executor, new x(2, taskCompletionSource));
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 11:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f45794c;
                m2 m2Var = (m2) this.d;
                ((xs0) this.f45793b).H = -1;
                if (tL_error3 != null) {
                    zc.a0(m2Var).f0(tL_error3, false);
                    return;
                }
                return;
            case 12:
                n2 n2Var = (n2) this.f45793b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f45794c;
                xs0 xs0Var = n2Var.f51630a;
                xs0Var.f51732e.k(n2Var.f51633e.d, savedStarGift);
                ((s80) this.d).u();
                xs0Var.n();
                TL_stars.TL_starGiftCollection c11 = xs0Var.f51732e.c(n2Var.f51633e.d);
                if (c11 != null) {
                    zc.a0(xs0Var.f51729a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, s3.E1(savedStarGift.gift), c11.title))).j();
                    return;
                }
                return;
            case 13:
                n2 n2Var2 = (n2) this.f45793b;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.f45794c;
                i1 i1Var = (i1) this.d;
                if (!n2Var2.d && savedStarGift2.pinned_to_top && !savedStarGift2.unsaved) {
                    z10 = true;
                    i1Var.c(false, true);
                    n2Var2.f51633e.m(savedStarGift2, false, false);
                } else {
                    z10 = true;
                }
                savedStarGift2.unsaved ^= z10;
                i1Var.h(savedStarGift2, z10, n2Var2.d);
                n2Var2.f51630a.f51732e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = n2Var2.f51633e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(n2Var2.f51631b).sendRequest(savestargift, null);
                return;
            case 14:
                u3 u3Var = (u3) this.f45793b;
                TLObject tLObject3 = (TLObject) this.f45794c;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.d;
                HashMap hashMap = u3Var.f51782m;
                HashMap hashMap2 = u3Var.f51784o;
                HashMap hashMap3 = u3Var.f51783n;
                ArrayList arrayList2 = u3Var.h;
                ArrayList arrayList3 = u3Var.f51777g;
                ArrayList arrayList4 = u3Var.f51776f;
                int i12 = u3Var.f51772a;
                ArrayList arrayList5 = u3Var.d;
                u3Var.v = -1;
                if (tLObject3 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject3;
                    MessagesController.getInstance(i12).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i12).putChats(resalestargifts.chats, false);
                    u3Var.f51775e = resalestargifts.count;
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
                    if (arrayList5.size() < u3Var.f51775e && !TextUtils.isEmpty(resalestargifts.next_offset)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    u3Var.f51790u = z12;
                    u3Var.f51786q = resalestargifts.next_offset;
                    u3Var.f51789t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList7 = resalestargifts.attributes;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList4.clear();
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList4.addAll(n5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList3.addAll(n5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList2.addAll(n5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        u3Var.f51778i = resalestargifts.attributes_hash;
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
                    Utilities.Callback callback3 = u3Var.f51774c;
                    if (callback3 != null) {
                        callback3.run(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
            case 15:
                yh.g gVar = (yh.g) this.f45793b;
                TLObject tLObject4 = (TLObject) this.f45794c;
                Context context = (Context) this.d;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    of.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new yh.b(gVar, 5), 1000L);
                return;
            case 16:
                yh.g.a0((yh.g) this.f45793b, (TLObject) this.f45794c, (TLRPC.TL_error) this.d);
                return;
            case 17:
                s3 s3Var = (s3) this.f45793b;
                Long l4 = (Long) this.f45794c;
                s3Var.a2(l4.longValue(), new d5(s3Var, l4, (m1[]) this.d, 13));
                return;
            case 18:
                s3.k0((s3) this.f45793b, (TLObject) this.f45794c, (MessageObject) this.d);
                return;
            case 19:
                s3 s3Var2 = (s3) this.f45793b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                s3Var2.getClass();
                ((of.e) this.f45794c).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                s3Var2.f53405f0.setResellPrice(zf.a.i(0L, zf.b.f54675a));
                c2 c2Var = s3Var2.f53404e1;
                if (c2Var != null) {
                    c2Var.run();
                }
                hg.c.s(R.string.Gift2ResaleDisable, new Object[]{s3Var2.D1()}, s3Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 20:
                s3 s3Var3 = (s3) this.f45793b;
                s3Var3.getClass();
                ((of.e) this.f45794c).c(false);
                s3Var3.getBulletinFactory().f0((TLRPC.TL_error) this.d, false);
                return;
            case 21:
                ((m1[]) this.f45793b)[0].dismiss();
                ((of.e) this.f45794c).c(false);
                s3.e2((TwoStepVerificationActivity) this.d);
                return;
            case 22:
                s3.U((s3) this.f45793b, (a2) this.f45794c, (MessageObject) this.d);
                return;
            case 23:
                s3.W((s3) this.f45793b, (TL_stars.TL_starGiftUnique) this.f45794c, (String) this.d);
                return;
            case 24:
                TLObject tLObject5 = (TLObject) this.f45793b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f45794c;
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
            case 25:
                n5 n5Var = (n5) this.f45793b;
                TLObject tLObject6 = (TLObject) this.f45794c;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList9 = n5Var.v;
                boolean[] zArr = n5Var.f53161r;
                ArrayList[] arrayListArr = n5Var.f53160q;
                int i15 = n5Var.f53146a;
                boolean z21 = !n5Var.f53149e;
                n5Var.f53148c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList10 = starsStatus.history;
                        int size3 = arrayList10.size();
                        z13 = true;
                        int i16 = 0;
                        while (i16 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList10.get(i16);
                            i16++;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[r11].add(starsTransaction2);
                            boolean z22 = r11;
                            boolean[] zArr2 = zArr;
                            if (starsTransaction2.amount.amount > 0) {
                                c10 = 1;
                            } else {
                                c10 = 2;
                            }
                            arrayListArr[c10].add(starsTransaction2);
                            r11 = z22;
                            zArr = zArr2;
                        }
                        z16 = r11;
                        boolean[] zArr3 = zArr;
                        j3 = 0;
                        for (int i17 = z16; i17 < 3; i17++) {
                            if (arrayListArr[i17].isEmpty() && !zArr3[i17]) {
                                z19 = z16;
                            } else {
                                z19 = true;
                            }
                            zArr3[i17] = z19;
                            boolean[] zArr4 = n5Var.f53164u;
                            if ((starsStatus.flags & 1) == 0) {
                                z20 = true;
                            } else {
                                z20 = z16;
                            }
                            zArr4[i17] = z20;
                            if (z20) {
                                n5Var.f53163t[i17] = z16;
                            }
                            String[] strArr = n5Var.f53162s;
                            if (zArr4[i17]) {
                                str = null;
                            } else {
                                str = starsStatus.next_offset;
                            }
                            strArr[i17] = str;
                        }
                        z17 = true;
                    } else {
                        z13 = true;
                        z16 = false;
                        j3 = 0;
                        z17 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList9.addAll(starsStatus.subscriptions);
                        n5Var.f53166x = z16;
                        n5Var.f53165w = starsStatus.subscriptions_next_offset;
                        if ((starsStatus.flags & 4) == 0) {
                            z18 = z13;
                        } else {
                            z18 = false;
                        }
                        n5Var.f53167y = z18;
                        z14 = z13;
                    } else {
                        z14 = false;
                    }
                    long j11 = n5Var.f53150f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j11 != starsAmount.amount) {
                        z21 = z13;
                    }
                    n5Var.f53150f = starsAmount;
                    n5Var.f53151g = j3;
                    z15 = z17;
                } else {
                    z13 = true;
                    z14 = false;
                    z15 = false;
                }
                n5Var.d = false;
                n5Var.f53149e = z13;
                if (z21) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z15) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z14) {
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 26:
                n5 n5Var2 = (n5) this.f45793b;
                Runnable runnable2 = (Runnable) this.d;
                n5Var2.getClass();
                Iterator it = ((HashSet) this.f45794c).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    n5Var2.Q.remove(num);
                    n5Var2.R.remove(num);
                }
                runnable2.run();
                return;
            default:
                ((boolean[]) this.f45793b)[0] = false;
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.f45794c);
                ((e3[]) this.d)[0].dismiss();
                return;
        }
    }

    public i(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f45792a = i10;
        this.f45793b = obj2;
        this.f45794c = obj3;
        this.d = obj4;
    }
}
