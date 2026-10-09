package tg;

import ai.d5;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.TwoStepVerificationActivity;
import xh.d2;
import xh.o2;
import xh.v3;
import yh.m5;
import yh.s3;
public final class q implements Runnable {
    public final int f48393a;
    public final Object f48394b;
    public final Object f48395c;
    public final Object d;

    public q(Object obj, Object obj2, Object obj3, int i10) {
        this.f48393a = i10;
        this.f48394b = obj;
        this.f48395c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        TLRPC.User user;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        boolean z15;
        long j3;
        boolean z16;
        boolean z17;
        boolean z18;
        String str2;
        ?? r42;
        int i10 = this.f48393a;
        boolean z19 = true;
        Object obj = this.d;
        Object obj2 = this.f48395c;
        Object obj3 = this.f48394b;
        switch (i10) {
            case 0:
                TLObject tLObject = (TLObject) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                x0 x0Var = (x0) obj;
                if (tLObject instanceof TLRPC.TL_channels_channelParticipants) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    messagesController.putUsers(tL_channels_channelParticipants.users, false);
                    messagesController.putChats(tL_channels_channelParticipants.chats, false);
                    long clientUserId = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < tL_channels_channelParticipants.participants.size(); i11++) {
                        TLRPC.Peer peer = tL_channels_channelParticipants.participants.get(i11).peer;
                        if (peer != null && MessageObject.getPeerId(peer) != clientUserId && (user = messagesController.getUser(Long.valueOf(peer.user_id))) != null && !UserObject.isDeleted(user) && !user.bot) {
                            arrayList.add(messagesController.getInputPeer(peer));
                        }
                    }
                    x0Var.run(arrayList);
                    return;
                }
                return;
            case 1:
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
            case 2:
                ((q1) obj3).run(new Pair((HashMap) obj2, (ArrayList) obj));
                return;
            case 3:
                vf.d dVar = (vf.d) obj2;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                String str3 = dVar.f49559b;
                int i12 = dVar.f49558a;
                if (tLObject2 != null) {
                    MediaDataController.getInstance(i12).onRingtoneUploaded(str3, (TLRPC.Document) tLObject2, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i12).onRingtoneUploaded(str3, null, true);
                    if (tL_error2 != null) {
                        NotificationCenter.getInstance(i12).doOnIdle(new u2.p0(5, dVar, tL_error2));
                    }
                }
                dVar.a();
                return;
            case 4:
                vh.n nVar = (vh.n) obj3;
                fa0 fa0Var = (fa0) obj2;
                ClickableSpan clickableSpan = (ClickableSpan) obj;
                da0 da0Var = nVar.G;
                if (da0Var != null && nVar.H == fa0Var) {
                    da0Var.a(clickableSpan);
                    nVar.H = null;
                    nVar.f49737x.d(true);
                    return;
                }
                return;
            case 5:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    ((Task) ((u4.f) obj3).call()).continueWith((Executor) obj2, new w9.v(2, taskCompletionSource));
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 6:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                n2 n2Var = (n2) obj;
                ((rs0) obj3).H = -1;
                if (tL_error3 != null) {
                    ad.a0(n2Var).f0(tL_error3, false);
                    return;
                }
                return;
            case 7:
                o2 o2Var = (o2) obj3;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                rs0 rs0Var = o2Var.f51433a;
                rs0Var.f51512e.k(o2Var.f51436e.d, savedStarGift);
                ((p80) obj).u();
                rs0Var.n();
                TL_stars.TL_starGiftCollection c10 = rs0Var.f51512e.c(o2Var.f51436e.d);
                if (c10 != null) {
                    ad.a0(rs0Var.f51509a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, s3.E1(savedStarGift.gift), c10.title))).j();
                    return;
                }
                return;
            case 8:
                o2 o2Var2 = (o2) obj3;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                xh.j1 j1Var = (xh.j1) obj;
                if (!o2Var2.d && savedStarGift2.pinned_to_top && !savedStarGift2.unsaved) {
                    z10 = true;
                    j1Var.c(false, true);
                    o2Var2.f51436e.m(savedStarGift2, false, false);
                } else {
                    z10 = true;
                }
                savedStarGift2.unsaved ^= z10;
                j1Var.h(savedStarGift2, z10, o2Var2.d);
                o2Var2.f51433a.f51512e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = o2Var2.f51436e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(o2Var2.f51434b).sendRequest(savestargift, null);
                return;
            case 9:
                v3 v3Var = (v3) obj2;
                TLObject tLObject3 = (TLObject) obj3;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = v3Var.f51560m;
                HashMap hashMap2 = v3Var.f51562o;
                HashMap hashMap3 = v3Var.f51561n;
                ArrayList arrayList2 = v3Var.h;
                ArrayList arrayList3 = v3Var.f51555g;
                ArrayList arrayList4 = v3Var.f51554f;
                int i13 = v3Var.f51550a;
                ArrayList arrayList5 = v3Var.d;
                v3Var.v = -1;
                if (tLObject3 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject3;
                    MessagesController.getInstance(i13).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i13).putChats(resalestargifts.chats, false);
                    v3Var.f51553e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList5.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList6 = resalestargifts.gifts;
                    int size = arrayList6.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TL_stars.StarGift starGift = arrayList6.get(i14);
                        i14++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList5.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    if (arrayList5.size() < v3Var.f51553e && !TextUtils.isEmpty(resalestargifts.next_offset)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    v3Var.f51568u = z12;
                    v3Var.f51564q = resalestargifts.next_offset;
                    v3Var.f51567t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList7 = resalestargifts.attributes;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList4.clear();
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList4.addAll(m5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList3.addAll(m5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList2.addAll(m5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        v3Var.f51556i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList8 = resalestargifts.counters;
                        int size2 = arrayList8.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList8.get(i15);
                            i15++;
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
                    Utilities.Callback callback3 = v3Var.f51552c;
                    if (callback3 != null) {
                        callback3.run(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                yh.g gVar = (yh.g) obj2;
                TLObject tLObject4 = (TLObject) obj3;
                Context context = (Context) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    of.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new yh.b(gVar, 5), 1000L);
                return;
            case 11:
                yh.g.a0((yh.g) obj2, (TLObject) obj3, (TLRPC.TL_error) obj);
                return;
            case 12:
                s3 s3Var = (s3) obj3;
                Long l4 = (Long) obj2;
                s3Var.a2(l4.longValue(), new d5(s3Var, l4, (m1[]) obj, 13));
                return;
            case 13:
                s3.k0((s3) obj2, (TLObject) obj3, (MessageObject) obj);
                return;
            case 14:
                s3 s3Var2 = (s3) obj3;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                s3Var2.getClass();
                ((of.e) obj2).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                s3Var2.f53167f0.setResellPrice(zf.a.i(0L, zf.b.f54441a));
                d2 d2Var = s3Var2.f53166e1;
                if (d2Var != null) {
                    d2Var.run();
                }
                hg.c.q(R.string.Gift2ResaleDisable, new Object[]{s3Var2.D1()}, s3Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 15:
                s3 s3Var3 = (s3) obj3;
                s3Var3.getClass();
                ((of.e) obj2).c(false);
                s3Var3.getBulletinFactory().f0((TLRPC.TL_error) obj, false);
                return;
            case 16:
                ((m1[]) obj3)[0].dismiss();
                ((of.e) obj2).c(false);
                s3.e2((TwoStepVerificationActivity) obj);
                return;
            case 17:
                s3.U((s3) obj3, (b2) obj2, (MessageObject) obj);
                return;
            case 18:
                s3.W((s3) obj3, (TL_stars.TL_starGiftUnique) obj2, (String) obj);
                return;
            case 19:
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                Utilities.Callback callback4 = (Utilities.Callback) obj;
                if (!(tLObject5 instanceof TLRPC.TL_payments_paymentFormStarGift)) {
                    if (tL_error4 == null) {
                        str = "NO_PAYMENT_FORM";
                    } else {
                        str = tL_error4.text;
                    }
                    m5.e(str);
                    callback4.run(null);
                    return;
                }
                callback4.run((TLRPC.TL_payments_paymentFormStarGift) tLObject5);
                return;
            case 20:
                m5 m5Var = (m5) obj2;
                TLObject tLObject6 = (TLObject) obj3;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList9 = m5Var.v;
                boolean[] zArr = m5Var.f52893r;
                ArrayList[] arrayListArr = m5Var.f52892q;
                int i16 = m5Var.f52878a;
                boolean z20 = !m5Var.f52881e;
                m5Var.f52880c = System.currentTimeMillis();
                if (tLObject6 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject6;
                    MessagesController.getInstance(i16).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i16).putChats(starsStatus.chats, false);
                    if (arrayListArr[0].isEmpty()) {
                        ArrayList<TL_stars.StarsTransaction> arrayList10 = starsStatus.history;
                        int size3 = arrayList10.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            TL_stars.StarsTransaction starsTransaction = arrayList10.get(i17);
                            i17++;
                            boolean z21 = z19;
                            TL_stars.StarsTransaction starsTransaction2 = starsTransaction;
                            arrayListArr[0].add(starsTransaction2);
                            if (starsTransaction2.amount.amount > 0) {
                                r42 = z21;
                            } else {
                                r42 = 2;
                            }
                            arrayListArr[r42].add(starsTransaction2);
                            z19 = z21;
                        }
                        z13 = z19;
                        j3 = 0;
                        for (int i18 = 0; i18 < 3; i18++) {
                            if (arrayListArr[i18].isEmpty() && !zArr[i18]) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            zArr[i18] = z17;
                            boolean[] zArr2 = m5Var.f52896u;
                            if ((starsStatus.flags & 1) == 0) {
                                z18 = z13;
                            } else {
                                z18 = false;
                            }
                            zArr2[i18] = z18;
                            if (z18) {
                                m5Var.f52895t[i18] = false;
                            }
                            String[] strArr = m5Var.f52894s;
                            if (zArr2[i18]) {
                                str2 = null;
                            } else {
                                str2 = starsStatus.next_offset;
                            }
                            strArr[i18] = str2;
                        }
                        z15 = z13;
                    } else {
                        z13 = true;
                        j3 = 0;
                        z15 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList9.addAll(starsStatus.subscriptions);
                        m5Var.f52898x = false;
                        m5Var.f52897w = starsStatus.subscriptions_next_offset;
                        if ((starsStatus.flags & 4) == 0) {
                            z16 = z13;
                        } else {
                            z16 = false;
                        }
                        m5Var.f52899y = z16;
                        z14 = z13;
                    } else {
                        z14 = false;
                    }
                    long j10 = m5Var.f52882f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j10 != starsAmount.amount) {
                        z20 = z13;
                    }
                    m5Var.f52882f = starsAmount;
                    m5Var.f52883g = j3;
                } else {
                    z13 = true;
                    z14 = false;
                    z15 = false;
                }
                m5Var.d = false;
                m5Var.f52881e = z13;
                if (z20) {
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
                }
                if (z15) {
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                }
                if (z14) {
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starSubscriptionsLoaded, new Object[0]);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 21:
                m5 m5Var2 = (m5) obj3;
                Runnable runnable2 = (Runnable) obj;
                m5Var2.getClass();
                Iterator it = ((HashSet) obj2).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    num.intValue();
                    m5Var2.Q.remove(num);
                    m5Var2.R.remove(num);
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

    public q(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f48393a = i10;
        this.f48394b = obj2;
        this.f48395c = obj3;
        this.d = obj4;
    }

    public q(Object obj, TLObject tLObject, Object obj2, int i10) {
        this.f48393a = i10;
        this.f48395c = obj;
        this.f48394b = tLObject;
        this.d = obj2;
    }
}
