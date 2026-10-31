package org.telegram.ui.web;

import ag.a3;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import mg.i2;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.o20;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cn0;
import org.telegram.ui.gc1;
import org.telegram.ui.j21;
import org.telegram.ui.mb;
import org.telegram.ui.um0;
import ph.f2;
import ph.p3;
import ph.q3;
import rh.e3;
import rh.e4;
import rh.h5;
import rh.o2;
import th.o7;
import th.u2;
import th.y2;
import th.z2;
import vh.c6;
import vh.e6;
import vh.g6;
import vh.j6;
import vh.k6;
import vh.r6;
import vh.u6;
import vh.w6;
import vh.y6;
public final class k0 implements org.telegram.ui.ActionBar.u1, o2, o20, hk0, CameraView.CameraViewDelegate, r2.v, t5.b, qa.a, gc1, s5.e, j21, zg.f, e6, c3.r, e2.j, androidx.car.app.utils.c, OnCompleteListener, Continuation, ik0, r9.d {
    public final int f43081a;
    public final Object f43082b;
    public final Object f43083c;

    public k0(int i10, Object obj, Object obj2) {
        this.f43081a = i10;
        this.f43082b = obj;
        this.f43083c = obj2;
    }

    @Override
    public Object K(bh.d dVar) {
        String valueOf;
        String str = (String) this.f43082b;
        Context context = (Context) dVar.b(Context.class);
        switch (((k2.k0) this.f43083c).f10693a) {
            case 6:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 7:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 8:
                int i10 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    valueOf = "tv";
                    break;
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    valueOf = "watch";
                    break;
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    valueOf = "auto";
                    break;
                } else {
                    if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                        valueOf = "embedded";
                        break;
                    }
                    valueOf = "";
                    break;
                }
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                    break;
                }
                valueOf = "";
                break;
        }
        return new za.a(str, valueOf);
    }

    @Override
    public void a(u6 u6Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, vh.d1 d1Var, vh.d0 d0Var) {
        boolean z14;
        switch (this.f43081a) {
            case 18:
                z2 z2Var = (z2) this.f43082b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f43083c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = vp.r1(z2Var.f49730l2).i1(storyItem.dialogId);
                tL_stories_editStory.f20035id = storyItem.f20031id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = u6Var.f52018b;
                ConnectionsManager.getInstance(z2Var.f49730l2).sendRequest(tL_stories_editStory, new mb(z2Var, d1Var, storyItem, u6Var, 17));
                return;
            default:
                u2 u2Var = (u2) this.f43082b;
                w6 w6Var = (w6) this.f43083c;
                z2 z2Var2 = u2Var.f49512x;
                y2 y2Var = z2Var2.f49776x1;
                TL_stories.StoryItem storyItem2 = y2Var.f49661a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    vp.r1(z2Var2.f49730l2).O1().r0(z2Var2.f49726k1, z2Var2.f49702e1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = y2Var.f49661a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(z2Var2.f49730l2).sendRequest(togglegroupcallsettings, new h5(2, u2Var, w6Var));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f43082b;
        ((u2.k0) obj).r(aVar.f281b, (u2.g0) aVar.f282c, (u2.c0) this.f43083c);
    }

    @Override
    public Object apply(Object obj) {
        i5.d[] values;
        s5.g gVar = (s5.g) this.f43082b;
        l5.i iVar = (l5.i) this.f43083c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        s5.a aVar = gVar.d;
        ArrayList d = gVar.d(sQLiteDatabase, iVar, aVar.f48066b);
        for (i5.d dVar : i5.d.values()) {
            if (dVar != iVar.f11666c) {
                int size = aVar.f48066b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(gVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((s5.b) d.get(i10)).f48068a);
            if (i10 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j10));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j10), set);
                }
                set.add(new s5.f(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            s5.b bVar = (s5.b) listIterator.next();
            long j11 = bVar.f48068a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                j2.f c10 = bVar.f48070c.c();
                for (s5.f fVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c10.b(fVar.f48071a, fVar.f48072b);
                }
                listIterator.set(new s5.b(j11, bVar.f48069b, c10.f()));
            }
        }
        return d;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        TL_stars.SavedStarGift savedStarGift;
        AlertDialog$Builder alertDialog$Builder;
        ?? r42;
        long e;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i11 = this.f43081a;
        Object obj = this.f43083c;
        Object obj2 = this.f43082b;
        switch (i11) {
            case 6:
                q3 q3Var = (q3) obj2;
                p3 p3Var = (p3) obj;
                a51 G = q3Var.a2.G(i10 - 1);
                if (G == null) {
                    return;
                }
                Object obj3 = G.G;
                if (obj3 instanceof TL_stars.StarGift) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj3;
                    boolean z10 = G.f24298r;
                    if (!TextUtils.isEmpty(starGift.gift_address) && q3Var.Z1) {
                        alertDialog$Builder = new AlertDialog$Builder(0, q3Var.getContext(), q3Var.I0);
                        r42 = 0;
                        String L0 = cd.L0(2131749801, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        x1Var.T = cd.L0(2131749802, null);
                    } else if (z10 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                        org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, q3Var.getContext(), null);
                        x1Var2.r(400L);
                        long e7 = d20.i(q3Var.f21583a).e();
                        sf.b bVar = tL_starGiftUnique.resale_ton_only ? sf.b.f48257b : sf.b.f48256a;
                        rh.e6.x(q3Var.f21583a, bVar).H(tL_starGiftUnique, e7, null, true, new um0(q3Var, x1Var2, bVar, tL_starGiftUnique, e7));
                        return;
                    } else {
                        if (!z10) {
                            ArrayList arrayList2 = p3Var.f45270b.f47582l;
                            int size = arrayList2.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 < size) {
                                    Object obj4 = arrayList2.get(i12);
                                    i12++;
                                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj4;
                                    savedStarGift = savedStarGift2.gift == starGift ? savedStarGift2 : null;
                                }
                            }
                            if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(q3Var.f21583a).getCurrentTime()) {
                                alertDialog$Builder = new AlertDialog$Builder(q3Var.getContext());
                                r42 = 0;
                                String L02 = cd.L0(2131749764, null);
                                org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder.f20134a;
                                x1Var3.R = L02;
                                x1Var3.T = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749765, cd.x(savedStarGift.can_craft_at, true)));
                            }
                        }
                        q3Var.X1.a(starGift);
                        q3Var.dismiss();
                        return;
                    }
                    i0.a.w(r42, 2131747847, alertDialog$Builder, r42);
                    return;
                }
                return;
            default:
                r6 r6Var = (r6) obj2;
                Context context = (Context) obj;
                ArrayList arrayList3 = r6Var.L;
                a0.h hVar = r6Var.f51887b;
                k6 k6Var = r6Var.f51895y;
                ArrayList arrayList4 = r6Var.f51888c;
                HashMap hashMap = r6Var.d;
                w6 w6Var = r6Var.W;
                p2 p2Var = w6Var.f21589c;
                if (i10 < 0 || i10 >= arrayList3.size()) {
                    return;
                }
                g6 g6Var = (g6) arrayList3.get(i10);
                int i13 = g6Var.f7680a;
                if (i13 != 3) {
                    if (i13 == 7) {
                        if (view instanceof p8) {
                            p8 p8Var = (p8) view;
                            p8Var.setChecked(!p8Var.d());
                            g6Var.f51205k = p8Var.d();
                            int i14 = g6Var.f51200c;
                            if (i14 == 0) {
                                boolean d = p8Var.d();
                                w6Var.f52110t1 = d;
                                r10 = w6Var.E1 == 4 ? 1 : 0;
                                if (d) {
                                    wb G2 = new cc(p2Var, w6Var.I0).G(2131624054, 4, cd.L0(r10 != 0 ? 2131744688 : 2131744689, null));
                                    G2.f32135j = 5000;
                                    G2.k(true);
                                    return;
                                }
                                wb G3 = new cc(p2Var, w6Var.I0).G(2131624110, 4, cd.L0(r10 != 0 ? 2131744701 : 2131744702, null));
                                G3.f32135j = 5000;
                                G3.k(true);
                                return;
                            } else if (i14 != 1) {
                                if (i14 == 2) {
                                    w6Var.f52109s1 = p8Var.d();
                                    r6Var.h(true);
                                    return;
                                }
                                return;
                            } else {
                                boolean d10 = p8Var.d();
                                w6Var.f52111u1 = d10;
                                boolean z11 = w6Var.f52101j1 instanceof TLRPC.TL_inputPeerChannel;
                                if (d10) {
                                    wb G4 = new cc(p2Var, w6Var.I0).G(2131624100, 4, cd.L0(z11 ? 2131744725 : 2131744690, null));
                                    G4.f32135j = 5000;
                                    G4.k(true);
                                } else {
                                    wb G5 = new cc(p2Var, w6Var.I0).G(2131624020, 4, cd.L0(z11 ? 2131744726 : 2131744703, null));
                                    G5.f32135j = 5000;
                                    G5.k(true);
                                }
                                r6Var.h(true);
                                return;
                            }
                        }
                        return;
                    } else if (i13 == 9) {
                        int i15 = g6Var.f51211q;
                        if (i15 == 0) {
                            y6 y6Var = w6Var.T1;
                            if (y6Var != null) {
                                y6Var.run();
                                return;
                            }
                            return;
                        } else if (i15 == 1) {
                            TLRPC.InputPeer inputPeer = w6Var.f52101j1;
                            if (inputPeer != null) {
                                e = o5.n(inputPeer);
                            } else {
                                e = d20.i(w6Var.f21583a).e();
                            }
                            z60 F = z60.F(r6Var, w6Var.I0, view);
                            F.c(2131232045, cd.L0(2131744803, null), new bi.e(r6Var, e, 28), false);
                            F.k();
                            z60.f(F, vp.r1(w6Var.f21583a).O1().B(e, true), w6Var.f52108r1, false, null, new e3(7, r6Var, F));
                            F.Z();
                            return;
                        } else if (i15 != 5) {
                            if (i15 == 6) {
                                w6Var.f52114x1 = false;
                                r6Var.h(true);
                                return;
                            }
                            return;
                        } else {
                            Context context2 = r6Var.getContext();
                            int i16 = w6.U1;
                            org.telegram.ui.ActionBar.x1 x1Var4 = new org.telegram.ui.ActionBar.x1(3, context2, w6Var.I0);
                            x1Var4.r(500L);
                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                            getgroupcallstreamrtmpurl.live_story = true;
                            TLRPC.InputPeer inputPeer2 = w6Var.f52101j1;
                            if (inputPeer2 == null) {
                                inputPeer2 = new TLRPC.TL_inputPeerSelf();
                            }
                            getgroupcallstreamrtmpurl.peer = inputPeer2;
                            ConnectionsManager.getInstance(w6Var.f21583a).sendRequest(getgroupcallstreamrtmpurl, new ag.p0(r6Var, x1Var4, getgroupcallstreamrtmpurl, 24));
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (g6Var.f51208n && w6Var.f52113w1) {
                    new c6(context, w6Var.f21583a, w6Var.B1, w6Var.f52101j1, new j6(r6Var, 0), w6Var.I0).show();
                    return;
                } else {
                    int i17 = g6Var.f51203i;
                    if (i17 == 1) {
                        if (w6Var.E1 == 1 || w6.J0(w6Var).isEmpty()) {
                            w6Var.D1 = 1;
                            w6Var.f52100i1.E(1);
                        }
                        w6Var.E1 = 1;
                        r6Var.g(true);
                        return;
                    } else if (i17 == 3) {
                        if (w6Var.E1 == 3 || (w6Var.f52105o1.isEmpty() && w6Var.f52106p1.isEmpty())) {
                            w6Var.D1 = 3;
                            w6Var.f52100i1.E(1);
                        }
                        w6Var.E1 = 3;
                        r6Var.g(true);
                        return;
                    } else if (i17 == 2) {
                        if (w6Var.E1 == 2) {
                            w6Var.D1 = 2;
                            w6Var.f52100i1.E(1);
                        }
                        w6Var.E1 = 2;
                        r6Var.g(true);
                        return;
                    } else if (i17 == 4) {
                        if (w6Var.E1 == 4) {
                            w6Var.D1 = 4;
                            w6Var.f52100i1.E(1);
                        }
                        w6Var.E1 = 4;
                        r6Var.g(true);
                        return;
                    } else {
                        if (i17 > 0) {
                            arrayList4.clear();
                            hashMap.clear();
                            w6Var.E1 = g6Var.f51203i;
                            k6Var.d.a();
                        } else {
                            TLRPC.Chat chat = g6Var.h;
                            if (chat != null) {
                                long j10 = chat.f19793id;
                                if (w6.K0(w6Var, chat) > 200) {
                                    try {
                                        r6Var.performHapticFeedback(3, 1);
                                    } catch (Throwable unused) {
                                    }
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, r6Var.getContext(), w6Var.I0);
                                    String L03 = cd.L0(2131749403, null);
                                    org.telegram.ui.ActionBar.x1 x1Var5 = alertDialog$Builder2.f20134a;
                                    x1Var5.R = L03;
                                    x1Var5.T = cd.L0(2131749402, null);
                                    i0.a.w(null, 2131747847, alertDialog$Builder2, null);
                                } else if (hashMap.containsKey(Long.valueOf(j10))) {
                                    ArrayList arrayList5 = (ArrayList) hashMap.get(Long.valueOf(j10));
                                    if (arrayList5 != null) {
                                        int size2 = arrayList5.size();
                                        while (r10 < size2) {
                                            Object obj5 = arrayList5.get(r10);
                                            r10++;
                                            hVar.k(Boolean.FALSE, ((Long) obj5).longValue());
                                        }
                                    }
                                    hashMap.remove(Long.valueOf(j10));
                                    r6Var.j(true);
                                } else {
                                    TLRPC.Chat L04 = vp.r1(w6Var.f21583a).L0(Long.valueOf(j10));
                                    TLRPC.ChatFull M0 = vp.r1(w6Var.f21583a).M0(j10);
                                    if (M0 != null && (chatParticipants = M0.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && M0.participants.participants.size() >= M0.participants_count - 1) {
                                        r6Var.e(j10, M0.participants);
                                    } else {
                                        org.telegram.ui.ActionBar.x1 x1Var6 = r6Var.G;
                                        if (x1Var6 != null) {
                                            x1Var6.dismiss();
                                            r6Var.G = null;
                                        }
                                        r6Var.H = j10;
                                        org.telegram.ui.ActionBar.x1 x1Var7 = new org.telegram.ui.ActionBar.x1(3, r6Var.getContext(), w6Var.I0);
                                        r6Var.G = x1Var7;
                                        x1Var7.r(50L);
                                        hs a02 = hs.a0(w6Var.f21583a);
                                        a02.f15938a.c(new a3(r6Var, L04, a02, j10));
                                    }
                                    if (!TextUtils.isEmpty(r6Var.I)) {
                                        k6Var.setText("");
                                        r6Var.I = null;
                                        r6Var.h(false);
                                    }
                                }
                            } else {
                                TLRPC.User user = g6Var.f51202g;
                                if (user != null) {
                                    if (r6Var.f51886a == 0) {
                                        w6Var.E1 = 0;
                                    }
                                    long j11 = user.f19942id;
                                    HashSet hashSet = new HashSet(arrayList4);
                                    if (arrayList4.contains(Long.valueOf(j11))) {
                                        Iterator it = hashMap.entrySet().iterator();
                                        while (it.hasNext()) {
                                            Map.Entry entry = (Map.Entry) it.next();
                                            if (((ArrayList) entry.getValue()).contains(Long.valueOf(j11))) {
                                                it.remove();
                                                hashSet.addAll((Collection) entry.getValue());
                                            }
                                        }
                                        hashSet.remove(Long.valueOf(j11));
                                        hVar.k(Boolean.FALSE, j11);
                                    } else {
                                        Iterator it2 = hashMap.entrySet().iterator();
                                        while (it2.hasNext()) {
                                            Map.Entry entry2 = (Map.Entry) it2.next();
                                            if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j11))) {
                                                it2.remove();
                                                hashSet.addAll((Collection) entry2.getValue());
                                            }
                                        }
                                        hashSet.add(Long.valueOf(j11));
                                        if (!TextUtils.isEmpty(r6Var.I)) {
                                            k6Var.setText("");
                                            r6Var.I = null;
                                            r6Var.h(false);
                                        }
                                        hVar.k(Boolean.TRUE, j11);
                                    }
                                    arrayList4.clear();
                                    arrayList4.addAll(hashSet);
                                    r6Var.j(true);
                                }
                            }
                        }
                        r6Var.g(true);
                        r6Var.f(true);
                        k6Var.L = true;
                        return;
                    }
                }
        }
    }

    @Override
    public void c(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        f2 f2Var = (f2) this.f43082b;
        vq0 vq0Var = f2Var.f45042a;
        f2Var.e.f47582l.remove((TL_stars.SavedStarGift) this.f43083c);
        f2Var.f(true);
        int i10 = f2Var.f45043b;
        if (j10 == d20.i(i10).e()) {
            cc a02 = cc.a0(vq0Var.f45128a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String L0 = cd.L0(2131752887, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            wb O = a02.O(document, L0, cd.a0(null, null, 2131752888, i0.a.k(tL_starGiftUnique.num, ',', sb2)));
            O.f32143r = false;
            O.j();
        } else {
            wb O2 = cc.a0(vq0Var.f45128a).O(tL_starGiftUnique.getDocument(), cd.L0(2131752885, null), cd.a0(null, null, 2131752886, o5.s(i10, j10)));
            O2.f32143r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f33391x0.c(true);
        }
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f1193a;
        ((IStartCarApp) this.f43082b).startCarApp((Intent) this.f43083c);
    }

    @Override
    public int d(Object obj) {
        Context context = (Context) this.f43082b;
        b2.x xVar = (b2.x) this.f43083c;
        r2.o oVar = (r2.o) obj;
        String str = oVar.f46242b;
        if ((!str.equals(xVar.f2423s) && !str.equals(r2.w.c(xVar))) || !oVar.c(context, xVar, false) || !oVar.d(xVar)) {
            return 0;
        }
        return 1;
    }

    @Override
    public c3.o[] e(Uri uri, Map map) {
        c3.o aVar;
        u2.q qVar = (u2.q) this.f43082b;
        b2.x xVar = (b2.x) this.f43083c;
        if (qVar.f49984c.F(xVar)) {
            aVar = new z3.h(qVar.f49984c.m(xVar), null);
        } else {
            aVar = new k3.a(xVar);
        }
        return new c3.o[]{aVar};
    }

    @Override
    public boolean f(int i10, View view) {
        return xh.z2.D0((xh.z2) this.f43082b, (Context) this.f43083c, view, i10);
    }

    @Override
    public Object g() {
        switch (this.f43081a) {
            case 10:
                Iterable iterable = (Iterable) this.f43083c;
                s5.g gVar = (s5.g) ((s5.d) ((ea.d) this.f43082b).f6468c);
                gVar.getClass();
                if (iterable.iterator().hasNext()) {
                    gVar.a().compileStatement("DELETE FROM events WHERE _id in " + s5.g.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                ea.d dVar = (ea.d) this.f43082b;
                for (Map.Entry entry : ((HashMap) this.f43083c).entrySet()) {
                    ((s5.g) ((s5.c) dVar.f6471i)).e(((Integer) entry.getValue()).intValue(), o5.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f43081a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f43082b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f43083c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 1:
                gf.f.q((Context) this.f43082b, Uri.parse((String) this.f43083c), true, false, false, null, null, false, true, false);
                return;
            case 2:
                ph.m mVar = (ph.m) this.f43082b;
                ih.b bVar = (ih.b) this.f43083c;
                try {
                    int parseInt = Integer.parseInt(bVar.getText().toString().trim());
                    mVar.g1(parseInt);
                    mVar.U1.setValue(parseInt);
                    x1Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.i0.E3(bVar);
                    f8.g(th2, true);
                    return;
                }
            case 3:
                ph.t1 t1Var = (ph.t1) this.f43082b;
                q20 q20Var = (q20) this.f43083c;
                String obj = t1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    q20Var.a(obj);
                    x1Var.dismiss();
                    return;
                }
                org.telegram.messenger.i0.E3(t1Var);
                return;
            case 14:
                e4 e4Var = (e4) this.f43082b;
                gf.e h = x1Var.h(i10, true, true);
                h.d();
                int i11 = e4Var.f21583a;
                rh.z1 z1Var = new rh.z1(e4Var, h, (i2) this.f43083c, 1);
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i11);
                x10.m0(new org.telegram.ui.Wallet.x0(i11, z1Var, x10));
                return;
            case 20:
                u2 u2Var = (u2) this.f43082b;
                th.s0 s0Var = ((o7) this.f43083c).A0;
                if (s0Var != null) {
                    if (!s0Var.f49427x) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = s0Var.f49422f;
                        ConnectionsManager.getInstance(s0Var.e).sendRequest(discardgroupcall, new th.l0(s0Var, 4));
                        s0Var.e();
                        return;
                    }
                    return;
                }
                z2.d0(u2Var.f49512x);
                return;
            default:
                xh.z2.A0((xh.z2) this.f43082b, (TL_payments.connectedBotStarRef) this.f43083c);
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        switch (this.f43081a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i(qa.b bVar) {
        ((qa.a) this.f43082b).i(bVar);
        ((qa.a) this.f43083c).i(bVar);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        boolean z10;
        boolean z11;
        ph.i2 i2Var = (ph.i2) this.f43082b;
        vh.d dVar = (vh.d) this.f43083c;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        long j10 = ((TL_stars.SavedStarGift) ((a51) obj).G).gift.f20021id;
        if (i2Var.f45119i1 == j10) {
            i2Var.f45119i1 = 0L;
        } else {
            i2Var.f45119i1 = j10;
        }
        if (i2Var.f45119i1 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof cn0) {
                    cn0 cn0Var = (cn0) childAt;
                    if (i2Var.f45119i1 == cn0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cn0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public void l(RectF rectF, View view) {
        ((vg.f) this.f43082b).i(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.f43083c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((rh.i) this.f43082b).t0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f43083c);
    }

    @Override
    public void onCameraInit() {
        qh.y yVar = (qh.y) this.f43082b;
        ((CameraView) this.f43083c).animate().alpha(1.0f).setDuration(180L).start();
        if (!yVar.V && !yVar.f46068h0 && !yVar.f46072l0) {
            yVar.f46068h0 = true;
            yVar.f46067g0.postDelayed(yVar.f46090y0, 150L);
        }
    }

    @Override
    public void onComplete(Task task) {
        ((xa.f) this.f43082b).a((Intent) this.f43083c);
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f43081a;
    }

    @Override
    public Object then(Task task) {
        xa.g gVar = (xa.g) this.f43082b;
        String str = (String) this.f43083c;
        synchronized (gVar) {
            ((a0.f) gVar.f53543b).remove(str);
        }
        return task;
    }

    private final void j(View view, float f7, float f10) {
    }

    private final void n(View view, float f7, float f10) {
    }
}
