package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class sg1 implements Runnable {
    public final int f38224a;
    public final Object f38225b;
    public final Object f38226c;

    public sg1(int i10, Object obj, Object obj2) {
        this.f38224a = i10;
        this.f38225b = obj;
        this.f38226c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.web.c1 c1Var;
        org.telegram.ui.web.g0 g0Var;
        org.telegram.ui.web.q0 q0Var;
        float f10 = 1.0f;
        boolean z4 = false;
        int i10 = 0;
        int i11 = 0;
        switch (this.f38224a) {
            case 0:
                Runnable runnable = (Runnable) this.f38226c;
                for (ds dsVar : ((wg1) this.f38225b).f39695w.f32635f) {
                    dsVar.l(0.0f);
                }
                runnable.run();
                return;
            case 1:
                ch1 ch1Var = (ch1) this.f38225b;
                TLObject tLObject = (TLObject) this.f38226c;
                ArrayList arrayList = ch1Var.f33158f;
                ArrayList<TLRPC.Chat> arrayList2 = ch1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ch1Var.f33155a).putChats(arrayList2, false);
                ch1Var.d = false;
                ch1Var.f33157c = true;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
                return;
            case 2:
                ii1 ii1Var = (ii1) this.f38225b;
                ii1Var.R.a(new rh1(ii1Var, (VoIPService) this.f38226c, 1), true);
                return;
            case 3:
                ii1 ii1Var2 = (ii1) this.f38225b;
                ValueAnimator valueAnimator = (ValueAnimator) this.f38226c;
                org.telegram.ui.Components.voip.m2.Q = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = ii1Var2.H.animate().setDuration(150L);
                org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f27122f;
                duration.setInterpolator(mrVar).start();
                ii1Var2.E.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
                ii1Var2.F.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
                ii1Var2.K.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
                ii1Var2.U.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
                ii1Var2.f34960g0.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
                ii1Var2.f34955e0.animate().alpha(1.0f).setDuration(350L).setInterpolator(mrVar).start();
                ii1Var2.f34958f0.animate().alpha(1.0f).setDuration(350L).setInterpolator(mrVar).start();
                ii1Var2.J0.animate().alpha(1.0f).setDuration(350L).setInterpolator(mrVar).start();
                valueAnimator.addListener(new wh1(ii1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(mrVar);
                valueAnimator.start();
                return;
            case 4:
                ri1 ri1Var = (ri1) this.f38225b;
                int[] iArr = (int[]) this.f38226c;
                ri1Var.getClass();
                int i12 = iArr[0] - 1;
                iArr[0] = i12;
                if (i12 == 0) {
                    WallpapersListActivity wallpapersListActivity = ri1Var.f37872a;
                    int[][] iArr2 = WallpapersListActivity.f32371h0;
                    wallpapersListActivity.B0(true);
                    return;
                }
                return;
            case 5:
                xi1 xi1Var = (xi1) this.f38225b;
                String str = (String) this.f38226c;
                xi1Var.d.clear();
                xi1Var.e.clear();
                xi1Var.f39998f = true;
                xi1Var.F(str, "", true);
                xi1Var.h = str;
                xi1Var.l();
                xi1Var.f40004y = null;
                return;
            case 6:
                xi1 xi1Var2 = (xi1) this.f38225b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f38226c);
                WallpapersListActivity wallpapersListActivity2 = xi1Var2.B;
                MessagesController.getInstance(WallpapersListActivity.p0(wallpapersListActivity2)).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(WallpapersListActivity.q0(wallpapersListActivity2)).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = xi1Var2.f40003x;
                xi1Var2.f40003x = null;
                xi1Var2.F(str2, "", false);
                return;
            case 7:
                String str3 = (String) this.f38226c;
                dj1 dj1Var = ((cj1) this.f38225b).f33179a;
                Activity parentActivity = dj1Var.getParentActivity();
                MessageObject messageObject = dj1Var.f33493n;
                if (parentActivity != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(str3);
                    }
                    str3.getClass();
                    if (!str3.equals("share_game")) {
                        if (str3.equals("share_score")) {
                            messageObject.messageOwner.with_my_score = true;
                        }
                    } else {
                        messageObject.messageOwner.with_my_score = false;
                    }
                    dj1Var.showDialog(org.telegram.ui.Components.lq0.N0(dj1Var.getParentActivity(), messageObject, null, false, dj1Var.h));
                    return;
                }
                return;
            case 8:
                org.telegram.ui.web.c1 c1Var2 = (org.telegram.ui.web.c1) this.f38225b;
                rh.p pVar = c1Var2.f39391g0;
                pVar.f43720f = true;
                pVar.k();
                c1Var2.w((nh.j7) this.f38226c);
                return;
            case 9:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.f38225b;
                ArrayList arrayList3 = (ArrayList) this.f38226c;
                if (botWebViewContainer$BotWebViewProxy != null && (c1Var = botWebViewContainer$BotWebViewProxy.f39355a) != null && (g0Var = c1Var.f39385c) != null) {
                    g0Var.f(arrayList3);
                    return;
                }
                return;
            case 10:
                ArrayList arrayList4 = (ArrayList) this.f38225b;
                LongSparseArray longSparseArray = (LongSparseArray) this.f38226c;
                org.telegram.ui.web.e1.f39430c.addAll(0, arrayList4);
                for (int i13 = 0; i13 < longSparseArray.size(); i13++) {
                    org.telegram.ui.web.e1.d.put(longSparseArray.keyAt(i13), (org.telegram.ui.web.d1) longSparseArray.valueAt(i13));
                }
                org.telegram.ui.web.e1.f39429b = true;
                org.telegram.ui.web.e1.f39428a = false;
                ArrayList arrayList5 = org.telegram.ui.web.e1.e;
                if (arrayList5 != null) {
                    int size2 = arrayList5.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList5.get(i10);
                        i10++;
                        ((Utilities.Callback) obj2).run(arrayList4);
                    }
                    org.telegram.ui.web.e1.e = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.web.g1 g1Var = ((org.telegram.ui.web.f1) this.f38225b).h;
                ArrayList arrayList6 = g1Var.f39449f;
                arrayList6.clear();
                arrayList6.addAll((ArrayList) this.f38226c);
                g1Var.h = false;
                org.telegram.ui.Components.a61 a61Var = g1Var.f23568a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) this.f38225b;
                if (((org.telegram.ui.web.f2) this.f38226c).b() != null) {
                    z4 = true;
                }
                g1Var2.setEnabled(z4);
                ViewPropertyAnimator animate = g1Var2.animate();
                if (!g1Var2.isEnabled()) {
                    f10 = 0.5f;
                }
                animate.alpha(f10);
                return;
            case 13:
                ((o0) this.f38225b).f39598c0.run((Integer) this.f38226c);
                return;
            case 14:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.f38225b;
                y1Var.getMessagesController().removeWebBrowserException((String) this.f38226c);
                y1Var.f23568a.V2.N(true);
                return;
            case 15:
                org.telegram.ui.web.f2 f2Var = (org.telegram.ui.web.f2) this.f38225b;
                TLObject tLObject2 = (TLObject) this.f38226c;
                int i14 = f2Var.f39438a;
                f2Var.f39442g = true;
                if (tLObject2 instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject2;
                    MessagesController.getInstance(i14).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i14).putChats(tL_messages_webPage.chats, false);
                    f2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject2 instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject2;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            f2Var.h = tL_webPage;
                        }
                    }
                    f2Var.h = null;
                }
                TLRPC.WebPage webPage = f2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    f2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && f2Var.h != null && (q0Var = f2Var.f39446l) != null) {
                    q0Var.run();
                }
                f2Var.c();
                return;
            case 16:
                ((org.telegram.ui.web.f2) this.f38225b).f39447m.remove((sg1) this.f38226c);
                return;
            case 17:
                ph.d dVar = (ph.d) this.f38225b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f38226c;
                int i15 = dVar.C - 1;
                dVar.C = i15;
                dVar.c(i15, true);
                if (dVar.C > 0) {
                    AndroidUtilities.runOnUIThread(dVar.D, 1000L);
                    return;
                }
                dVar.setClickable(true);
                gVar.run();
                return;
            case 18:
                ((Utilities.Callback) this.f38225b).run((ArrayList) this.f38226c);
                return;
            case 19:
                ph.f1 f1Var = (ph.f1) this.f38225b;
                TLObject tLObject3 = (TLObject) this.f38226c;
                ph.h1 h1Var = f1Var.f41647s;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    ph.y1 y1Var2 = h1Var.f41739r;
                    MessagesController.getInstance(ph.y1.D(y1Var2)).putUsers(tL_contacts_resolvedPeer2.users, false);
                    MessagesController.getInstance(ph.y1.E(y1Var2)).putChats(tL_contacts_resolvedPeer2.chats, false);
                    MessagesStorage.getInstance(ph.y1.G(y1Var2)).putUsersAndChats(tL_contacts_resolvedPeer2.users, tL_contacts_resolvedPeer2.chats, true, true);
                }
                f1Var.f41645n = true;
                f1Var.G();
                return;
            case 20:
                ((ph.d2) this.f38225b).e(0.0f, 240L, (Runnable) this.f38226c);
                return;
            case 21:
                ph.c5 c5Var = (ph.c5) this.f38225b;
                View view = (View) this.f38226c;
                c5Var.getClass();
                if (view instanceof dg.j) {
                    dg.j jVar = (dg.j) view;
                    jVar.m();
                    c5Var.D0(jVar, true);
                    return;
                }
                return;
            case 22:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f38225b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f38226c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                ((Utilities.Callback) this.f38225b).run((Bitmap) this.f38226c);
                return;
            case 24:
                ph.k5.a((ph.k5) this.f38225b, (ph.t6) this.f38226c);
                return;
            case 25:
                ph.t6 t6Var = (ph.t6) this.f38226c;
                ph.k5 k5Var = (ph.k5) ((l7.w0) this.f38225b).d;
                Bitmap bitmap = k5Var.f41888a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (t6Var.M0 == k5Var.f41888a) {
                        t6Var.M0 = null;
                    }
                    k5Var.f41888a = null;
                    k5Var.invalidate();
                    return;
                }
                return;
            case 26:
                ph.o5 o5Var = (ph.o5) this.f38225b;
                AtomicReference atomicReference = o5Var.f42095a;
                ?? obj3 = new Object();
                obj3.f3741a = 256;
                atomicReference.set(new f8.n(new com.google.android.gms.internal.vision.t2((Context) this.f38226c, (com.google.android.gms.internal.vision.x1) obj3)));
                o5Var.a(o5Var.f42098f);
                return;
            case 27:
                ((ph.o5) this.f38225b).f42097c.run((ph.m5) this.f38226c);
                return;
            case 28:
                ph.n nVar = (ph.n) this.f38225b;
                dg.b3 b3Var = (dg.b3) this.f38226c;
                ph.w5 w5Var = nVar.f42592a;
                if (b3Var.getWidth() <= 0) {
                    w5Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new org.telegram.ui.web.q0(nVar, 22)).start();
                    return;
                }
                float width = b3Var.getWidth() / w5Var.getWidth();
                ValueAnimator valueAnimator2 = nVar.f42599w;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                nVar.f42599w = ValueAnimator.ofFloat(0.0f, 1.0f);
                nVar.f42599w.addUpdateListener(new ph.v5(nVar, w5Var.getScaleX(), width, ((b3Var.getWidth() / 2.0f) + b3Var.getX()) - ((w5Var.getWidth() / 2.0f) + w5Var.getX()), ((b3Var.getHeight() / 2.0f) + b3Var.getY()) - ((w5Var.getHeight() / 2.0f) + w5Var.getY()), 0));
                nVar.f42599w.addListener(new org.telegram.ui.Components.ex0(17, nVar, b3Var));
                nVar.f42599w.setDuration(320L);
                nVar.f42599w.setInterpolator(org.telegram.ui.Components.mr.h);
                nVar.v = b3Var;
                nVar.f42599w.start();
                return;
            default:
                ph.l6 l6Var = (ph.l6) this.f38225b;
                l6Var.I0 = false;
                l6Var.Y.addAll((ArrayList) this.f38226c);
                l6Var.f41958n0.N(true);
                return;
        }
    }
}
