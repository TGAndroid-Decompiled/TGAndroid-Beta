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
import org.telegram.messenger.bk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.wn;
import sg.o2;
import vg.b0;
import vg.j;
import zh.f4;
import zh.g4;
import zh.h4;
import zh.i4;
import zh.l4;
public final class c implements View.OnClickListener {
    public final int f44713a;
    public final Object f44714b;
    public final Object f44715c;

    public c(int i10, Object obj, Object obj2) {
        this.f44713a = i10;
        this.f44714b = obj;
        this.f44715c = obj2;
    }

    @Override
    public final void onClick(View view) {
        sg.l2 j10;
        TL_stars.SavedStarGift savedStarGift;
        int i10 = 0;
        switch (this.f44713a) {
            case 0:
                l lVar = (l) this.f44714b;
                lVar.f44811b = true;
                ((org.telegram.ui.x) this.f44715c).run();
                lVar.f44817w.f32504g3.O(true);
                return;
            case 1:
                rg.y yVar = (rg.y) this.f44714b;
                Context context = (Context) this.f44715c;
                if (!yVar.f47632n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(yVar.f47632n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    yVar.f47632n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    rg.n nVar = new rg.n(yVar, context, createBitmap);
                    yVar.f47632n.f().addView(nVar, kb1.g(-1.0f, -1));
                    rg.v vVar = yVar.f47632n;
                    Objects.requireNonNull(vVar);
                    nVar.setColorListener(new n7(vVar, 5));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(ds.f27530f);
                    duration.addUpdateListener(new e4(nVar, 22));
                    duration.start();
                    yVar.f47632n.a();
                    yVar.dismiss();
                    return;
                }
                return;
            case 2:
                o2 o2Var = (o2) this.f44714b;
                kc kcVar = (kc) this.f44715c;
                sg.l2[] l2VarArr = o2Var.H;
                if (l2VarArr != null && l2VarArr.length != 0 && o2Var.I != null && (j10 = o2Var.j(o2Var.f48478n0, o2Var.f48479o0)) != null) {
                    kcVar.run(j10);
                    return;
                }
                return;
            case 3:
                go.g0((wn) this.f44715c, 41026, new ig.o((sh.c) this.f44714b, 20), null);
                return;
            case 4:
                tg.j0.V((tg.j0) this.f44714b, (Context) this.f44715c);
                return;
            case 5:
                vg.s0 s0Var = (vg.s0) this.f44714b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f44715c;
                ArrayList arrayList = s0Var.X;
                if (!arrayList.isEmpty()) {
                    vg.d0 d0Var = s0Var.f50290a0;
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
                        vg.s.a(chat.f22028id, arrayList2, new y2(s0Var, chat, arrayList2, hashSet, 17), new ig.o(s0Var, 24));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                vg.n1 n1Var = (vg.n1) this.f44714b;
                ArrayList arrayList3 = (ArrayList) this.f44715c;
                HashSet hashSet2 = n1Var.f50251h0;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    Long l4 = (Long) obj2;
                    l4.getClass();
                    hashSet2.remove(l4);
                    n1Var.f50256n0.remove(l4);
                }
                n1Var.W();
                n1Var.Z.b(true, hashSet2, new vg.a1(n1Var, 5), null);
                n1Var.i0(true, true);
                n1Var.X();
                return;
            case 7:
                vg.n1.S((vg.n1) this.f44714b, (TLRPC.User) this.f44715c, view);
                return;
            case 8:
                final wg.e eVar = (wg.e) this.f44714b;
                final xg.a aVar = (xg.a) this.f44715c;
                if (eVar.d) {
                    if (!aVar.f51809a.Q) {
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
                                        b0Var.f50182r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        j.c((TLRPC.TL_error) obj3, eVar2.f51241n, eVar2.f51239c, new c(eVar2, 1));
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
                                        b0Var.f50182r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        j.c((TLRPC.TL_error) obj3, eVar2.f51241n, eVar2.f51239c, new c(eVar2, 1));
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
                ((vg.b0) eVar).f50182r.dismiss();
                return;
            case 9:
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f44715c;
                xg.f fVar = ((xg.g) this.f44714b).v;
                if (fVar != null) {
                    vg.a0 a0Var = ((vg.u) fVar).f50297a;
                    a0Var.f50155c0.remove(chat2);
                    a0Var.a0(true, true);
                    return;
                }
                return;
            case 10:
                ((ig.o) this.f44714b).run((TLRPC.TL_payments_checkedGiftCode) this.f44715c);
                return;
            case 11:
                ((ig.o) this.f44714b).run((TLRPC.Chat) this.f44715c);
                return;
            case 12:
                zh.c.P((zh.c) this.f44714b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f44715c);
                return;
            case 13:
                h4 h4Var = (h4) this.f44714b;
                h4Var.getClass();
                if (((rc) this.f44715c).f5374f > 0) {
                    h4Var.presentFragment(new dd());
                    return;
                }
                return;
            case 14:
                g4.P((g4) this.f44714b, (f4) this.f44715c);
                return;
            case 15:
                l4 l4Var = (l4) this.f44714b;
                p4 p4Var = (p4) this.f44715c;
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
                t9 t9Var = ((i4) this.f44714b).f53107c.Y;
                t9Var.e = !t9Var.e;
                ((bk) this.f44715c).run();
                t9Var.j(true);
                return;
        }
    }
}
