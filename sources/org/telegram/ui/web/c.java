package org.telegram.ui.web;

import ai.ad;
import ai.md;
import ai.q7;
import ai.y9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ci.y2;
import ei.i6;
import ei.oc;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.fo;
import org.telegram.ui.sn;
import tg.p;
import ug.a0;
import ug.i;
import w7.z5;
import yh.e4;
import yh.f4;
import yh.g4;
import yh.h4;
import yh.k4;
public final class c implements View.OnClickListener {
    public final int f42557a;
    public final Object f42558b;
    public final Object f42559c;

    public c(int i10, Object obj, Object obj2) {
        this.f42557a = i10;
        this.f42558b = obj;
        this.f42559c = obj2;
    }

    @Override
    public final void onClick(View view) {
        rg.j2 j10;
        TL_stars.SavedStarGift savedStarGift;
        int i10 = 0;
        switch (this.f42557a) {
            case 0:
                l lVar = (l) this.f42558b;
                lVar.f42653b = true;
                ((org.telegram.ui.y) this.f42559c).run();
                lVar.f42659w.W2.N(true);
                return;
            case 1:
                qg.x xVar = (qg.x) this.f42558b;
                Context context = (Context) this.f42559c;
                if (!xVar.f44697n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.f44697n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.f44697n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    qg.n nVar = new qg.n(xVar, context, createBitmap);
                    xVar.f44697n.f().addView(nVar, z5.c(-1.0f, -1));
                    qg.u uVar = xVar.f44697n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new q7(uVar, 5));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(bs.f25030f);
                    duration.addUpdateListener(new i6(nVar, 19));
                    duration.start();
                    xVar.f44697n.a();
                    xVar.dismiss();
                    return;
                }
                return;
            case 2:
                rg.m2 m2Var = (rg.m2) this.f42558b;
                oc ocVar = (oc) this.f42559c;
                rg.j2[] j2VarArr = m2Var.H;
                if (j2VarArr != null && j2VarArr.length != 0 && m2Var.I != null && (j10 = m2Var.j(m2Var.f45522n0, m2Var.f45523o0)) != null) {
                    ocVar.run(j10);
                    return;
                }
                return;
            case 3:
                fo.g0((sn) this.f42559c, 41026, new ig.l0((rh.c) this.f42558b, 16), null);
                return;
            case 4:
                sg.k0.W((sg.k0) this.f42558b, (Context) this.f42559c);
                return;
            case 5:
                ug.r0 r0Var = (ug.r0) this.f42558b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f42559c;
                ArrayList arrayList = r0Var.X;
                if (!arrayList.isEmpty()) {
                    ug.c0 c0Var = r0Var.f47749a0;
                    if (!c0Var.N) {
                        c0Var.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        ug.r.a(chat.f20272id, arrayList2, new y2(r0Var, chat, arrayList2, hashSet, 17), new ig.l0(r0Var, 20));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ug.m1 m1Var = (ug.m1) this.f42558b;
                ArrayList arrayList3 = (ArrayList) this.f42559c;
                HashSet hashSet2 = m1Var.f47710h0;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    Long l4 = (Long) obj2;
                    l4.getClass();
                    hashSet2.remove(l4);
                    m1Var.f47715n0.remove(l4);
                }
                m1Var.X();
                m1Var.Z.b(true, hashSet2, new ug.z0(m1Var, 5), null);
                m1Var.j0(true, true);
                m1Var.Y();
                return;
            case 7:
                ug.m1.T((ug.m1) this.f42558b, (TLRPC.User) this.f42559c, view);
                return;
            case 8:
                final vg.e eVar = (vg.e) this.f42558b;
                final wg.a aVar = (wg.a) this.f42559c;
                if (eVar.d) {
                    if (!aVar.f48941a.N) {
                        aVar.b(true);
                        String str = eVar.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        a0 a0Var = (a0) eVar;
                                        AndroidUtilities.runOnUIThread(new p(a0Var, 7), 200L);
                                        a0Var.f47640r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        i.c((TLRPC.TL_error) obj3, eVar2.f48359n, eVar2.f48357c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        Utilities.Callback callback2 = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        a0 a0Var = (a0) eVar;
                                        AndroidUtilities.runOnUIThread(new p(a0Var, 7), 200L);
                                        a0Var.f47640r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        i.c((TLRPC.TL_error) obj3, eVar2.f48359n, eVar2.f48357c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.o(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((ug.a0) eVar).f47640r.dismiss();
                return;
            case 9:
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f42559c;
                wg.f fVar = ((wg.g) this.f42558b).v;
                if (fVar != null) {
                    ug.z zVar = ((ug.t) fVar).f47756a;
                    zVar.f47798c0.remove(chat2);
                    zVar.b0(true, true);
                    return;
                }
                return;
            case 10:
                ((ig.l0) this.f42558b).run((TLRPC.TL_payments_checkedGiftCode) this.f42559c);
                return;
            case 11:
                ((ig.l0) this.f42558b).run((TLRPC.Chat) this.f42559c);
                return;
            case 12:
                yh.c.Q((yh.c) this.f42558b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f42559c);
                return;
            case 13:
                g4 g4Var = (g4) this.f42558b;
                g4Var.getClass();
                if (((ad) this.f42559c).f983f > 0) {
                    g4Var.presentFragment(new md());
                    return;
                }
                return;
            case 14:
                f4.Q((f4) this.f42558b, (e4) this.f42559c);
                return;
            case 15:
                k4 k4Var = (k4) this.f42558b;
                gi.g4 g4Var2 = (gi.g4) this.f42559c;
                HashSet hashSet3 = k4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = k4Var.Y.f2499l;
                        int size3 = arrayList5.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size3) {
                                Object obj3 = arrayList5.get(i11);
                                i11++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i12 = savedStarGift.msg_id;
                                if (i12 != 0) {
                                    if (i12 == longValue) {
                                    }
                                }
                                if (savedStarGift.saved_id == longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList4.add(savedStarGift);
                        }
                    }
                    g4Var2.run(arrayList4);
                    k4Var.dismiss();
                    return;
                }
                return;
            default:
                y9 y9Var = ((h4) this.f42558b).f50286c.Y;
                y9Var.e = !y9Var.e;
                ((vj) this.f42559c).run();
                y9Var.j(true);
                return;
        }
    }
}
