package qg;

import ai.ld;
import ai.q7;
import ai.x9;
import ai.zc;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ci.z2;
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
import rg.j2;
import rg.m2;
import tg.p;
import ug.z;
import w7.z5;
import yh.f4;
import yh.g4;
import yh.h4;
import yh.i4;
import yh.l4;
public final class n implements View.OnClickListener {
    public final int f44600a;
    public final Object f44601b;
    public final Object f44602c;

    public n(int i10, Object obj, Object obj2) {
        this.f44600a = i10;
        this.f44601b = obj;
        this.f44602c = obj2;
    }

    @Override
    public final void onClick(View view) {
        j2 j10;
        TL_stars.SavedStarGift savedStarGift;
        int i10 = 0;
        switch (this.f44600a) {
            case 0:
                y yVar = (y) this.f44601b;
                Context context = (Context) this.f44602c;
                if (!yVar.f44731n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(yVar.f44731n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    yVar.f44731n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    o oVar = new o(yVar, context, createBitmap);
                    yVar.f44731n.f().addView(oVar, z5.d(-1.0f, -1));
                    v vVar = yVar.f44731n;
                    Objects.requireNonNull(vVar);
                    oVar.setColorListener(new q7(vVar, 5));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(bs.f25030f);
                    duration.addUpdateListener(new i6(oVar, 19));
                    duration.start();
                    yVar.f44731n.a();
                    yVar.dismiss();
                    return;
                }
                return;
            case 1:
                m2 m2Var = (m2) this.f44601b;
                oc ocVar = (oc) this.f44602c;
                j2[] j2VarArr = m2Var.H;
                if (j2VarArr != null && j2VarArr.length != 0 && m2Var.I != null && (j10 = m2Var.j(m2Var.f45548n0, m2Var.f45549o0)) != null) {
                    ocVar.run(j10);
                    return;
                }
                return;
            case 2:
                fo.g0((sn) this.f44602c, 41026, new ig.l0((rh.c) this.f44601b, 16), null);
                return;
            case 3:
                sg.j0.W((sg.j0) this.f44601b, (Context) this.f44602c);
                return;
            case 4:
                ug.q0 q0Var = (ug.q0) this.f44601b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f44602c;
                ArrayList arrayList = q0Var.X;
                if (!arrayList.isEmpty()) {
                    ug.b0 b0Var = q0Var.f47768a0;
                    if (!b0Var.N) {
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
                        ug.q.a(chat.f20272id, arrayList2, new z2(q0Var, chat, arrayList2, hashSet, 17), new ig.l0(q0Var, 20));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ug.l1 l1Var = (ug.l1) this.f44601b;
                ArrayList arrayList3 = (ArrayList) this.f44602c;
                HashSet hashSet2 = l1Var.f47729h0;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    Long l4 = (Long) obj2;
                    l4.getClass();
                    hashSet2.remove(l4);
                    l1Var.f47734n0.remove(l4);
                }
                l1Var.X();
                l1Var.Z.b(true, hashSet2, new ug.y0(l1Var, 5), null);
                l1Var.j0(true, true);
                l1Var.Y();
                return;
            case 6:
                ug.l1.T((ug.l1) this.f44601b, (TLRPC.User) this.f44602c, view);
                return;
            case 7:
                final vg.e eVar = (vg.e) this.f44601b;
                final wg.a aVar = (wg.a) this.f44602c;
                if (eVar.d) {
                    if (!aVar.f48963a.N) {
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
                                        zVar.f47841r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        ug.h.c((TLRPC.TL_error) obj3, eVar2.f48381n, eVar2.f48379c, new c(eVar2, 1));
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
                                        zVar.f47841r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        ug.h.c((TLRPC.TL_error) obj3, eVar2.f48381n, eVar2.f48379c, new c(eVar2, 1));
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
                ((ug.z) eVar).f47841r.dismiss();
                return;
            case 8:
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f44602c;
                wg.f fVar = ((wg.g) this.f44601b).v;
                if (fVar != null) {
                    ug.y yVar2 = ((ug.s) fVar).f47775a;
                    yVar2.f47817c0.remove(chat2);
                    yVar2.b0(true, true);
                    return;
                }
                return;
            case 9:
                ((ig.l0) this.f44601b).run((TLRPC.TL_payments_checkedGiftCode) this.f44602c);
                return;
            case 10:
                ((ig.l0) this.f44601b).run((TLRPC.Chat) this.f44602c);
                return;
            case 11:
                yh.c.Q((yh.c) this.f44601b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.f44602c);
                return;
            case 12:
                h4 h4Var = (h4) this.f44601b;
                h4Var.getClass();
                if (((zc) this.f44602c).f2554f > 0) {
                    h4Var.presentFragment(new ld());
                    return;
                }
                return;
            case 13:
                g4.Q((g4) this.f44601b, (f4) this.f44602c);
                return;
            case 14:
                l4 l4Var = (l4) this.f44601b;
                gi.g4 g4Var = (gi.g4) this.f44602c;
                HashSet hashSet3 = l4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList5 = l4Var.Y.f2448l;
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
                    g4Var.run(arrayList4);
                    l4Var.dismiss();
                    return;
                }
                return;
            default:
                x9 x9Var = ((i4) this.f44601b).f50321c.Y;
                x9Var.e = !x9Var.e;
                ((vj) this.f44602c).run();
                x9Var.j(true);
                return;
        }
    }
}
