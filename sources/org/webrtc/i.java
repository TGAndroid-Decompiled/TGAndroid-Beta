package org.webrtc;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.webkit.WebView;
import b2.p0;
import bi.q4;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import i2.h0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import ji.p1;
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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.TwoStepVerificationActivity;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.VideoFrame;
import ug.m1;
import ug.x0;
import yh.b2;
import yh.h1;
import yh.t3;
import zh.n5;
import zh.r3;
public final class i implements Runnable {
    public final int f42794a;
    public final Object f42795b;
    public final Object f42796c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f42794a = i10;
        this.f42795b = obj;
        this.f42796c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        Exception runtimeException;
        byte[] bArr;
        TLRPC.User user;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        long j10;
        boolean z16;
        boolean z17;
        boolean z18;
        String str;
        ?? r32;
        boolean z19 = true;
        switch (this.f42794a) {
            case 0:
                ((EglRenderer) this.f42795b).lambda$init$0((EglBase.Context) this.f42796c, (int[]) this.d);
                return;
            case 1:
                ((EglRenderer) this.f42795b).lambda$removeFrameListener$4((CountDownLatch) this.f42796c, (EglRenderer.FrameListener) this.d);
                return;
            case 2:
                ((VideoFileRenderer) this.f42795b).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.f42796c, (VideoFrame) this.d);
                return;
            case 3:
                qi.i iVar = (qi.i) this.f42795b;
                WebView webView = (WebView) this.f42796c;
                b5.h hVar = (b5.h) this.d;
                synchronized (iVar.f43672a) {
                    if (!iVar.f43689u && iVar.f43683o == webView && iVar.f43684p == hVar && !iVar.f43686r) {
                        if (iVar.f43687s) {
                            FileLog.e("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            iVar.o();
                            return;
                        }
                        iVar.f43687s = true;
                        FileLog.e("WEB proxy: Base64 bridge installation timed out; retrying once");
                        iVar.f();
                        return;
                    }
                    return;
                }
            case 4:
                ri.q qVar = (ri.q) this.f42795b;
                byte[] bArr2 = (byte[]) this.d;
                File file = ((ri.k) this.f42796c).f44737b;
                if (qVar.f44762m == ri.o.d) {
                    qVar.B = bArr2;
                    try {
                        qVar.o();
                        h0 a2 = new i2.o(qVar.f44753a).a();
                        qVar.A = a2;
                        a2.p0(qVar.F);
                        qVar.A.r0(p0.b(Uri.fromFile(file)));
                        qVar.A.b();
                        qVar.r(ri.o.e);
                        ri.h hVar2 = qVar.e;
                        long j11 = qVar.j();
                        long j12 = qVar.f44767r;
                        long j13 = qVar.f44768s;
                        byte[] bArr3 = qVar.B;
                        if (bArr3 == null) {
                            bArr = null;
                        } else {
                            bArr = (byte[]) bArr3.clone();
                        }
                        hVar2.onPreviewReady(j11, j12, j13, bArr);
                        return;
                    } catch (Throwable th2) {
                        if (th2 instanceof Exception) {
                            runtimeException = th2;
                        } else {
                            runtimeException = new RuntimeException(th2);
                        }
                        qVar.g(runtimeException);
                        return;
                    }
                }
                return;
            case 5:
                ((ri.q) this.f42795b).f44756f.onOutputStarted(((ri.k) this.f42796c).f44736a, (File) this.d);
                return;
            case 6:
                ((ri.q) this.f42795b).f44756f.onOutputError(((ri.k) this.f42796c).f44736a, (Exception) this.d);
                return;
            case 7:
                ((ri.q) this.f42795b).f44756f.onOutputInvalidated(((ri.k) this.f42796c).f44736a, (ri.l) this.d);
                return;
            case 8:
                ((x0) this.f42795b).run(new Pair((HashMap) this.f42796c, (ArrayList) this.d));
                return;
            case 9:
                TLObject tLObject = (TLObject) this.f42795b;
                MessagesController messagesController = (MessagesController) this.f42796c;
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
            case 10:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f42795b;
                Utilities.Callback callback = (Utilities.Callback) this.f42796c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                if (tL_error != null) {
                    callback.run(tL_error);
                    return;
                } else {
                    callback2.run(null);
                    return;
                }
            case 11:
                ((p1) this.f42795b).run(new Pair((HashMap) this.f42796c, (ArrayList) this.d));
                return;
            case 12:
                wf.d dVar = (wf.d) this.f42795b;
                TLObject tLObject2 = (TLObject) this.f42796c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                String str2 = dVar.f47553b;
                int i11 = dVar.f47552a;
                if (tLObject2 != null) {
                    MediaDataController.getInstance(i11).onRingtoneUploaded(str2, (TLRPC.Document) tLObject2, false);
                } else {
                    dVar.a();
                    MediaDataController.getInstance(i11).onRingtoneUploaded(str2, null, true);
                    if (tL_error2 != null) {
                        NotificationCenter.getInstance(i11).doOnIdle(new s9.b(21, dVar, tL_error2));
                    }
                }
                dVar.a();
                return;
            case 13:
                wh.n nVar = (wh.n) this.f42795b;
                ea0 ea0Var = (ea0) this.f42796c;
                ClickableSpan clickableSpan = (ClickableSpan) this.d;
                ca0 ca0Var = nVar.G;
                if (ca0Var != null && nVar.H == ea0Var) {
                    ca0Var.a(clickableSpan);
                    nVar.H = null;
                    nVar.f47716x.d(true);
                    return;
                }
                return;
            case 14:
                u4.f fVar = (u4.f) this.f42795b;
                Executor executor = (Executor) this.f42796c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    ((Task) fVar.call()).continueWith(executor, new x9.w(2, taskCompletionSource));
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 15:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f42796c;
                m2 m2Var = (m2) this.d;
                ((ns0) this.f42795b).H = -1;
                if (tL_error3 != null) {
                    zc.a0(m2Var).f0(tL_error3, false);
                    return;
                }
                return;
            case 16:
                yh.m2 m2Var2 = (yh.m2) this.f42795b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f42796c;
                ns0 ns0Var = m2Var2.f48994a;
                ns0Var.e.k(m2Var2.e.d, savedStarGift);
                ((m80) this.d).u();
                ns0Var.n();
                TL_stars.TL_starGiftCollection c10 = ns0Var.e.c(m2Var2.e.d);
                if (c10 != null) {
                    zc.a0(ns0Var.f49089a).R(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, r3.E1(savedStarGift.gift), c10.title))).j();
                    return;
                }
                return;
            case 17:
                yh.m2 m2Var3 = (yh.m2) this.f42795b;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.f42796c;
                h1 h1Var = (h1) this.d;
                if (!m2Var3.d && savedStarGift2.pinned_to_top && !savedStarGift2.unsaved) {
                    z10 = true;
                    h1Var.c(false, true);
                    m2Var3.e.m(savedStarGift2, false, false);
                } else {
                    z10 = true;
                }
                savedStarGift2.unsaved ^= z10;
                h1Var.h(savedStarGift2, z10, m2Var3.d);
                m2Var3.f48994a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = m2Var3.e.g(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(m2Var3.f48995b).sendRequest(savestargift, null);
                return;
            case 18:
                t3 t3Var = (t3) this.f42795b;
                TLObject tLObject3 = (TLObject) this.f42796c;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) this.d;
                HashMap hashMap = t3Var.f49138m;
                HashMap hashMap2 = t3Var.f49140o;
                HashMap hashMap3 = t3Var.f49139n;
                ArrayList arrayList2 = t3Var.h;
                ArrayList arrayList3 = t3Var.f49133g;
                ArrayList arrayList4 = t3Var.f49132f;
                int i12 = t3Var.f49129a;
                ArrayList arrayList5 = t3Var.d;
                t3Var.v = -1;
                if (tLObject3 instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject3;
                    MessagesController.getInstance(i12).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i12).putChats(resalestargifts.chats, false);
                    t3Var.e = resalestargifts.count;
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
                    if (arrayList5.size() < t3Var.e && !TextUtils.isEmpty(resalestargifts.next_offset)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    t3Var.f49146u = z12;
                    t3Var.f49142q = resalestargifts.next_offset;
                    t3Var.f49145t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList7 = resalestargifts.attributes;
                    if (arrayList7 != null && !arrayList7.isEmpty()) {
                        arrayList4.clear();
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList4.addAll(n5.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList3.addAll(n5.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList2.addAll(n5.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        t3Var.f49134i = resalestargifts.attributes_hash;
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
                    Utilities.Callback callback3 = t3Var.f49131c;
                    if (callback3 != null) {
                        callback3.run(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                zh.g gVar = (zh.g) this.f42795b;
                TLObject tLObject4 = (TLObject) this.f42796c;
                Context context = (Context) this.d;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    pf.d.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new zh.b(gVar, 5), 1000L);
                return;
            case 20:
                zh.g.a0((zh.g) this.f42795b, (TLObject) this.f42796c, (TLRPC.TL_error) this.d);
                return;
            case 21:
                r3 r3Var = (r3) this.f42795b;
                Long l4 = (Long) this.f42796c;
                r3Var.a2(l4.longValue(), new q4(r3Var, l4, (m1[]) this.d, 13));
                return;
            case 22:
                r3.k0((r3) this.f42795b, (TLObject) this.f42796c, (MessageObject) this.d);
                return;
            case 23:
                r3 r3Var2 = (r3) this.f42795b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                r3Var2.getClass();
                ((pf.c) this.f42796c).c(false);
                tL_starGiftUnique.flags &= -17;
                tL_starGiftUnique.resale_ton_only = false;
                tL_starGiftUnique.resell_amount = null;
                r3Var2.f51078f0.setResellPrice(ag.a.i(0L, ag.b.f629a));
                b2 b2Var = r3Var2.f51077e1;
                if (b2Var != null) {
                    b2Var.run();
                }
                i2.d.q(R.string.Gift2ResaleDisable, new Object[]{r3Var2.D1()}, r3Var2.getBulletinFactory(), R.raw.contact_check, 36);
                return;
            case 24:
                r3 r3Var3 = (r3) this.f42795b;
                r3Var3.getClass();
                ((pf.c) this.f42796c).c(false);
                r3Var3.getBulletinFactory().f0((TLRPC.TL_error) this.d, false);
                return;
            case 25:
                ((m1[]) this.f42795b)[0].dismiss();
                ((pf.c) this.f42796c).c(false);
                r3.e2((TwoStepVerificationActivity) this.d);
                return;
            case 26:
                r3.U((r3) this.f42795b, (a2) this.f42796c, (MessageObject) this.d);
                return;
            case 27:
                r3.W((r3) this.f42795b, (TL_stars.TL_starGiftUnique) this.f42796c, (String) this.d);
                return;
            case 28:
                TLObject tLObject5 = (TLObject) this.f42795b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f42796c;
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
            default:
                n5 n5Var = (n5) this.f42795b;
                TLObject tLObject6 = (TLObject) this.f42796c;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList9 = n5Var.v;
                boolean[] zArr = n5Var.f50878r;
                ArrayList[] arrayListArr = n5Var.f50877q;
                int i15 = n5Var.f50864a;
                boolean z20 = !n5Var.e;
                n5Var.f50866c = System.currentTimeMillis();
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
                        j10 = 0;
                        for (int i17 = 0; i17 < 3; i17++) {
                            if (arrayListArr[i17].isEmpty() && !zArr[i17]) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            zArr[i17] = z17;
                            boolean[] zArr2 = n5Var.f50881u;
                            if ((starsStatus.flags & 1) == 0) {
                                z18 = z13;
                            } else {
                                z18 = false;
                            }
                            zArr2[i17] = z18;
                            if (z18) {
                                n5Var.f50880t[i17] = false;
                            }
                            String[] strArr = n5Var.f50879s;
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
                        j10 = 0;
                        z14 = false;
                    }
                    if (arrayList9.isEmpty()) {
                        arrayList9.addAll(starsStatus.subscriptions);
                        n5Var.f50883x = false;
                        n5Var.f50882w = starsStatus.subscriptions_next_offset;
                        if ((starsStatus.flags & 4) == 0) {
                            z16 = z13;
                        } else {
                            z16 = false;
                        }
                        n5Var.f50884y = z16;
                        z15 = z13;
                    } else {
                        z15 = false;
                    }
                    long j14 = n5Var.f50867f.amount;
                    TL_stars.StarsAmount starsAmount = starsStatus.balance;
                    if (j14 != starsAmount.amount) {
                        z20 = z13;
                    }
                    n5Var.f50867f = starsAmount;
                    n5Var.f50868g = j10;
                } else {
                    z13 = true;
                    z14 = false;
                    z15 = false;
                }
                n5Var.d = false;
                n5Var.e = z13;
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
        }
    }

    public i(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f42794a = i10;
        this.f42795b = obj2;
        this.f42796c = obj3;
        this.d = obj4;
    }
}
