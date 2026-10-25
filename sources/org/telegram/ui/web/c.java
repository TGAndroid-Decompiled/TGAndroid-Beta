package org.telegram.ui.web;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import bi.dd;
import bi.n7;
import bi.rc;
import bi.t9;
import di.y2;
import fi.e4;
import fi.kc;
import hi.p4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ak;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.go;
import org.telegram.ui.un;
import sg.p2;
import vg.b0;
import vg.j;
import zh.f4;
import zh.g4;
import zh.h4;
import zh.i4;
import zh.l4;
public final class c implements View.OnClickListener {
    public final int f45199a;
    public final Object f45200b;
    public final Object f45201c;

    public c(int i10, Object obj, Object obj2) {
        this.f45199a = i10;
        this.f45200b = obj;
        this.f45201c = obj2;
    }

    @Override
    public final void onClick(View view) {
        sg.m2 j10;
        TL_stars.SavedStarGift savedStarGift;
        int i10 = 0;
        switch (this.f45199a) {
            case 0:
                l lVar = (l) this.f45200b;
                lVar.f45297b = true;
                ((org.telegram.ui.x) this.f45201c).run();
                lVar.f45303w.f32150g3.O(true);
                return;
            case 1:
                rg.y yVar = (rg.y) this.f45200b;
                Context context = (Context) this.f45201c;
                if (!yVar.f47594n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(yVar.f47594n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    yVar.f47594n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    rg.n nVar = new rg.n(yVar, context, createBitmap);
                    yVar.f47594n.f().addView(nVar, gb1.g(-1.0f, -1));
                    rg.v vVar = yVar.f47594n;
                    Objects.requireNonNull(vVar);
                    nVar.setColorListener(new n7(vVar, 5));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(ds.f27584f);
                    duration.addUpdateListener(new e4(nVar, 22));
                    duration.start();
                    yVar.f47594n.a();
                    yVar.dismiss();
                    return;
                }
                return;
            case 2:
                p2 p2Var = (p2) this.f45200b;
                kc kcVar = (kc) this.f45201c;
                sg.m2[] m2VarArr = p2Var.H;
                if (m2VarArr != null && m2VarArr.length != 0 && p2Var.I != null && (j10 = p2Var.j(p2Var.f48450n0, p2Var.f48451o0)) != null) {
                    kcVar.run(j10);
                    return;
                }
                return;
            case 3:
                go.g0((un) this.f45201c, 41026, new ig.o((sh.c) this.f45200b, 20), null);
                return;
            case 4:
                tg.j0.V((tg.j0) this.f45200b, (Context) this.f45201c);
                return;
            case 5:
                vg.s0 s0Var = (vg.s0) this.f45200b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f45201c;
                ArrayList arrayList = s0Var.X;
                if (!arrayList.isEmpty()) {
                    vg.d0 d0Var = s0Var.f50252a0;
                    if (!d0Var.Q) {
                        d0Var.setLoading(true);
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
                        vg.s.a(chat.f22027id, arrayList2, new y2(s0Var, chat, arrayList2, hashSet, 17), new ig.o(s0Var, 24));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                vg.n1 n1Var = (vg.n1) this.f45200b;
                ArrayList arrayList3 = (ArrayList) this.f45201c;
                HashSet hashSet2 = n1Var.f50213h0;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    Long l4 = (Long) obj2;
                    l4.getClass();
                    hashSet2.remove(l4);
                    n1Var.f50218n0.remove(l4);
                }
                n1Var.W();
                n1Var.Z.b(true, hashSet2, new vg.a1(n1Var, 5), null);
                n1Var.i0(true, true);
                n1Var.X();
                return;
            case 7:
                vg.n1.S((vg.n1) this.f45200b, (TLRPC.User) this.f45201c, view);
                return;
            case 8:
                final wg.e eVar = (wg.e) this.f45200b;
                final xg.a aVar = (xg.a) this.f45201c;
                if (eVar.d) {
                    if (!aVar.f51748a.Q) {
                        aVar.b(true);
                        String str = eVar.h;
                        Utilities.Callback callback = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r6 = (Void) obj3;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar;
                                        AndroidUtilities.runOnUIThread(new ti.g(b0Var, 10), 200L);
                                        b0Var.f50144r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        j.c((TLRPC.TL_error) obj3, eVar2.f51180n, eVar2.f51178c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        Utilities.Callback callback2 = new Utilities.Callback() {
                            @Override
                            public final void run(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r6 = (Void) obj3;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar;
                                        AndroidUtilities.runOnUIThread(new ti.g(b0Var, 10), 200L);
                                        b0Var.f50144r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        j.c((TLRPC.TL_error) obj3, eVar2.f51180n, eVar2.f51178c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new vg.p(callback2, callback, 0), 2);
                        return;
                    }
                    return;
                }
                ((vg.b0) eVar).f50144r.dismiss();
                return;
            case 9:
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f45201c;
                xg.f fVar = ((xg.g) this.f45200b).v;
                if (fVar != null) {
                    vg.a0 a0Var = ((vg.u) fVar).f50259a;
                    a0Var.f50117c0.remove(chat2);
                    a0Var.a0(true, true);
                    return;
                }
                return;
            case 10:
                ((ig.o) this.f45200b).run((TLRPC.TL_payments_checkedGiftCode) this.f45201c);
                return;
            case 11:
                ((ig.o) this.f45200b).run((TLRPC.Chat) this.f45201c);
                return;
            case 12:
                zh.c.P((zh.c) this.f45200b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f45201c);
                return;
            case 13:
                h4 h4Var = (h4) this.f45200b;
                h4Var.getClass();
                if (((rc) this.f45201c).f5374f > 0) {
                    h4Var.presentFragment(new dd());
                    return;
                }
                return;
            case 14:
                g4.P((g4) this.f45200b, (f4) this.f45201c);
                return;
            case 15:
                l4 l4Var = (l4) this.f45200b;
                p4 p4Var = (p4) this.f45201c;
                HashSet hashSet3 = l4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = l4Var.Y.f5471l;
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
                    p4Var.run(arrayList4);
                    l4Var.dismiss();
                    return;
                }
                return;
            default:
                t9 t9Var = ((i4) this.f45200b).f53046c.Y;
                t9Var.e = !t9Var.e;
                ((ak) this.f45201c).run();
                t9Var.j(true);
                return;
        }
    }
}
