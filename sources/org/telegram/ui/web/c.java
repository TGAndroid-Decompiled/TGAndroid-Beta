package org.telegram.ui.web;

import ai.bd;
import ai.nd;
import ai.r7;
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
import org.telegram.messenger.xj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.fo;
import org.telegram.ui.sn;
import rg.o2;
import tg.p;
import ug.z;
import w7.z5;
import yh.e4;
import yh.f4;
import yh.g4;
import yh.h4;
import yh.k4;
public final class c implements View.OnClickListener {
    public final int f43081a;
    public final Object f43082b;
    public final Object f43083c;

    public c(int i10, Object obj, Object obj2) {
        this.f43081a = i10;
        this.f43082b = obj;
        this.f43083c = obj2;
    }

    @Override
    public final void onClick(View view) {
        rg.l2 j10;
        TL_stars.SavedStarGift savedStarGift;
        int i10 = 0;
        switch (this.f43081a) {
            case 0:
                l lVar = (l) this.f43082b;
                lVar.f43178b = true;
                ((org.telegram.ui.x) this.f43083c).run();
                lVar.f43184w.Z2.N(true);
                return;
            case 1:
                qg.y yVar = (qg.y) this.f43082b;
                Context context = (Context) this.f43083c;
                if (!yVar.f45130n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(yVar.f45130n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    yVar.f45130n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    qg.n nVar = new qg.n(yVar, context, createBitmap);
                    yVar.f45130n.f().addView(nVar, z5.c(-1.0f, -1));
                    qg.v vVar = yVar.f45130n;
                    Objects.requireNonNull(vVar);
                    nVar.setColorListener(new r7(vVar, 5));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(bs.f25133f);
                    duration.addUpdateListener(new i6(nVar, 19));
                    duration.start();
                    yVar.f45130n.a();
                    yVar.dismiss();
                    return;
                }
                return;
            case 2:
                o2 o2Var = (o2) this.f43082b;
                oc ocVar = (oc) this.f43083c;
                rg.l2[] l2VarArr = o2Var.H;
                if (l2VarArr != null && l2VarArr.length != 0 && o2Var.I != null && (j10 = o2Var.j(o2Var.f46003n0, o2Var.f46004o0)) != null) {
                    ocVar.run(j10);
                    return;
                }
                return;
            case 3:
                fo.g0((sn) this.f43083c, 41026, new ig.k0((rh.c) this.f43082b, 16), null);
                return;
            case 4:
                sg.j0.V((sg.j0) this.f43082b, (Context) this.f43083c);
                return;
            case 5:
                ug.q0 q0Var = (ug.q0) this.f43082b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f43083c;
                ArrayList arrayList = q0Var.X;
                if (!arrayList.isEmpty()) {
                    ug.b0 b0Var = q0Var.f48193a0;
                    if (!b0Var.Q) {
                        b0Var.setLoading(true);
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
                        ug.q.a(chat.f20343id, arrayList2, new y2(q0Var, chat, arrayList2, hashSet, 17), new ig.k0(q0Var, 20));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ug.l1 l1Var = (ug.l1) this.f43082b;
                ArrayList arrayList3 = (ArrayList) this.f43083c;
                HashSet hashSet2 = l1Var.f48154h0;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    Long l4 = (Long) obj2;
                    l4.getClass();
                    hashSet2.remove(l4);
                    l1Var.f48159n0.remove(l4);
                }
                l1Var.W();
                l1Var.Z.b(true, hashSet2, new ug.y0(l1Var, 5), null);
                l1Var.i0(true, true);
                l1Var.X();
                return;
            case 7:
                ug.l1.S((ug.l1) this.f43082b, (TLRPC.User) this.f43083c, view);
                return;
            case 8:
                final vg.e eVar = (vg.e) this.f43082b;
                final wg.a aVar = (wg.a) this.f43083c;
                if (eVar.d) {
                    if (!aVar.f49389a.Q) {
                        aVar.b(true);
                        String str = eVar.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        z zVar = (z) eVar;
                                        AndroidUtilities.runOnUIThread(new p(zVar, 7), 200L);
                                        zVar.f48266r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        ug.h.c((TLRPC.TL_error) obj3, eVar2.f48808n, eVar2.f48806c, new c(eVar2, 1));
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
                                        z zVar = (z) eVar;
                                        AndroidUtilities.runOnUIThread(new p(zVar, 7), 200L);
                                        zVar.f48266r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        ug.h.c((TLRPC.TL_error) obj3, eVar2.f48808n, eVar2.f48806c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.n(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((ug.z) eVar).f48266r.dismiss();
                return;
            case 9:
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f43083c;
                wg.f fVar = ((wg.g) this.f43082b).v;
                if (fVar != null) {
                    ug.y yVar2 = ((ug.s) fVar).f48200a;
                    yVar2.f48242c0.remove(chat2);
                    yVar2.a0(true, true);
                    return;
                }
                return;
            case 10:
                ((ig.k0) this.f43082b).run((TLRPC.TL_payments_checkedGiftCode) this.f43083c);
                return;
            case 11:
                ((ig.k0) this.f43082b).run((TLRPC.Chat) this.f43083c);
                return;
            case 12:
                yh.c.P((yh.c) this.f43082b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f43083c);
                return;
            case 13:
                g4 g4Var = (g4) this.f43082b;
                g4Var.getClass();
                if (((bd) this.f43083c).f1055f > 0) {
                    g4Var.presentFragment(new nd());
                    return;
                }
                return;
            case 14:
                f4.P((f4) this.f43082b, (e4) this.f43083c);
                return;
            case 15:
                k4 k4Var = (k4) this.f43082b;
                gi.g4 g4Var2 = (gi.g4) this.f43083c;
                HashSet hashSet3 = k4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = k4Var.Y.f2511l;
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
                y9 y9Var = ((h4) this.f43082b).f50748c.Y;
                y9Var.e = !y9Var.e;
                ((xj) this.f43083c).run();
                y9Var.j(true);
                return;
        }
    }
}
