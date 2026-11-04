package org.telegram.ui.web;

import ai.q6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import ci.ba;
import gi.g5;
import gi.j3;
import gi.j8;
import gi.n5;
import gi.nb;
import gi.x9;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.e3;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lp0;
import org.telegram.ui.wm;
import ug.c2;
import xg.b0;
import xg.j;
public final class d implements View.OnClickListener {
    public final int f50826a;
    public final Object f50827b;
    public final Object f50828c;

    public d(int i3, Object obj, Object obj2) {
        this.f50826a = i3;
        this.f50827b = obj;
        this.f50828c = obj2;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        View view2;
        FrameLayout frameLayout;
        ug.z1 j10;
        int i3;
        int i10 = 0;
        switch (this.f50826a) {
            case 0:
                l lVar = (l) this.f50827b;
                lVar.f50926b = true;
                ((org.telegram.ui.y) this.f50828c).run();
                lVar.f50934x.f35594g3.O(true);
                return;
            case 1:
                tg.q qVar = (tg.q) this.f50827b;
                Context context = (Context) this.f50828c;
                androidx.activity.n nVar = qVar.f55290p1;
                switch (nVar.f1268a) {
                    case 1:
                        z10 = nVar.f1269b;
                        break;
                    default:
                        z10 = nVar.f1269b;
                        break;
                }
                if (!z10) {
                    androidx.activity.n nVar2 = qVar.f55290p1;
                    switch (nVar2.f1268a) {
                        case 1:
                            view2 = (x9) nVar2.d;
                            break;
                        default:
                            view2 = (lp0) nVar2.d;
                            break;
                    }
                    Bitmap N3 = org.telegram.messenger.g0.N3(view2);
                    Bitmap createBitmap = Bitmap.createBitmap(N3.getWidth(), N3.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    androidx.activity.n nVar3 = qVar.f55290p1;
                    switch (nVar3.f1268a) {
                        case 1:
                            g5 g5Var = ((x9) nVar3.d).f13239y0;
                            Matrix matrix = g5Var.getMatrix();
                            canvas.save();
                            canvas.translate(g5Var.getX(), g5Var.getY());
                            canvas.concat(matrix);
                            g5Var.getWidth();
                            throw null;
                        default:
                            ug.a0 a0Var = ((lp0) nVar3.d).G0;
                            Matrix matrix2 = a0Var.getMatrix();
                            canvas.save();
                            canvas.translate(a0Var.getX(), a0Var.getY());
                            canvas.concat(matrix2);
                            Bitmap bitmap = (Bitmap) nVar3.f1270c;
                            canvas.scale(a0Var.getWidth() / bitmap.getWidth(), a0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            canvas.drawBitmap(N3, 0.0f, 0.0f, (Paint) null);
                            N3.recycle();
                            tg.i iVar = new tg.i(qVar, context, createBitmap);
                            androidx.activity.n nVar4 = qVar.f55290p1;
                            switch (nVar4.f1268a) {
                                case 1:
                                    frameLayout = ((x9) nVar4.d).F0;
                                    break;
                                default:
                                    frameLayout = ((lp0) nVar4.d).O0;
                                    break;
                            }
                            frameLayout.addView(iVar, mf.c(-1.0f, -1));
                            androidx.activity.n nVar5 = qVar.f55290p1;
                            Objects.requireNonNull(nVar5);
                            iVar.setColorListener(new q6(nVar5, 6));
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                            duration.setInterpolator(xq.f40452f);
                            duration.addUpdateListener(new j3(iVar, 28));
                            duration.start();
                            androidx.activity.n nVar6 = qVar.f55290p1;
                            switch (nVar6.f1268a) {
                                case 1:
                                    nVar6.f1269b = true;
                                    break;
                                default:
                                    nVar6.f1269b = true;
                                    break;
                            }
                            qVar.dismiss();
                            return;
                    }
                }
                return;
            case 2:
                an.i0((wm) this.f50828c, 41026, new j8((th.b) this.f50827b, 24), null);
                return;
            case 3:
                c2 c2Var = (c2) this.f50827b;
                nb nbVar = (nb) this.f50828c;
                ug.z1[] z1VarArr = c2Var.I;
                if (z1VarArr != null && z1VarArr.length != 0 && c2Var.J != null && (j10 = c2Var.j(c2Var.f55914o0, c2Var.f55915p0)) != null) {
                    nbVar.a(j10);
                    return;
                }
                return;
            case 4:
                vg.i0 i0Var = (vg.i0) this.f50827b;
                Context context2 = (Context) this.f50828c;
                d2 d2Var = i0Var.D2;
                int i11 = i0Var.f56651a2;
                if (i11 != 11 && i11 != 34) {
                    if (i11 != 19 && i11 != 32 && !i0Var.s1()) {
                        if (i11 != 18 && i11 != 20 && i11 != 24 && i11 != 25 && i11 != 26 && i11 != 29 && i11 != 22 && i11 != 23 && i11 != 21 && i11 != 27 && i11 != 28 && i11 != 30 && i11 != 35) {
                            if (!h10.i(i0Var.f28583a).q() && !hp.s1(i0Var.f28583a).D3() && !i0Var.G2) {
                                if (d2Var != null) {
                                    if (d2Var.getVisibleDialog() != null) {
                                        d2Var.getVisibleDialog().dismiss();
                                    }
                                    d2Var.presentFragment(new PremiumPreviewFragment(0, vg.i0.u1(i11)));
                                    i0Var.dismiss();
                                    return;
                                }
                                return;
                            }
                            i0Var.dismiss();
                            return;
                        }
                        org.telegram.messenger.g0.g(i0Var.k1());
                        i0Var.dismiss();
                        return;
                    }
                    e3 e3Var = i0Var.V1;
                    if (e3Var.f22300b) {
                        if (h10.i(i0Var.f28583a).q() && xg.s.i()) {
                            xg.j.i(i0Var.T1, i0Var);
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, i0Var.J0);
                        alertDialog$Builder.f27343a.S = bd.M0(2131747040, null);
                        if (i0Var.r1()) {
                            i3 = 2131747038;
                        } else {
                            i3 = 2131747039;
                        }
                        alertDialog$Builder.f27343a.U = org.telegram.messenger.g0.X2(bd.M0(i3, null));
                        alertDialog$Builder.k(bd.M0(2131752152, null), new vg.w(i0Var, 0));
                        alertDialog$Builder.h(bd.M0(2131752589, null), new u9.j(10));
                        alertDialog$Builder.p();
                        return;
                    }
                    boolean z11 = e3Var.f22299a;
                    if (z11 && e3Var.f22301c == 0) {
                        if (e3Var.f22302e && xg.s.i()) {
                            i0Var.Y1 = true;
                            i0Var.f56666q2.f31528e0 = false;
                            d2 d2Var2 = i0Var.f36105p1;
                            e3 e3Var2 = i0Var.V1;
                            xg.q0 q0Var = new xg.q0(d2Var2, e3Var2.h, e3Var2.f22307k);
                            q0Var.show();
                            q0Var.I0 = new ba(i0Var, 13);
                            return;
                        }
                        i0Var.i1();
                        return;
                    } else if (z11) {
                        FrameLayout frameLayout2 = new FrameLayout(i0Var.getContext());
                        k9 k9Var = new k9(i0Var.getContext());
                        k9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                        frameLayout2.addView(k9Var, mf.c(60.0f, 60));
                        frameLayout2.setClipChildren(false);
                        Paint paint = new Paint(1);
                        paint.setColor(k6.x0(null, k6.f27954h5, false));
                        frameLayout2.addView(new n5(i0Var.getContext(), paint, i0Var.getContext().getDrawable(2131231127)), mf.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                        ImageView imageView = new ImageView(i0Var.getContext());
                        imageView.setImageResource(2131232056);
                        r6.t(imageView, k6.f28043m6, null, PorterDuff.Mode.SRC_ATOP);
                        frameLayout2.addView(imageView, mf.e(24, 24, 17));
                        k9 k9Var2 = new k9(i0Var.getContext());
                        k9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                        frameLayout2.addView(k9Var2, mf.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                        FrameLayout frameLayout3 = new FrameLayout(i0Var.getContext());
                        frameLayout3.addView(frameLayout2, mf.e(-2, 60, 1));
                        frameLayout3.setClipChildren(false);
                        TextView textView = new TextView(context2);
                        textView.setLetterSpacing(0.025f);
                        r6.V(textView, k6.f27988j5, null);
                        textView.setTextSize(1, 16.0f);
                        frameLayout3.addView(textView, mf.t(-1, -2, 0, 24, 80, 24, 0));
                        u8 u8Var = new u8((e6) null);
                        TLRPC.Chat M0 = hp.s1(i0Var.f28583a).M0(Long.valueOf(-i0Var.V1.f22301c));
                        u8Var.q(M0);
                        k9Var.e(M0, u8Var);
                        u8 u8Var2 = new u8((e6) null);
                        TLRPC.Chat M02 = hp.s1(i0Var.f28583a).M0(Long.valueOf(-i0Var.T1));
                        u8Var2.q(M02);
                        k9Var2.e(M02, u8Var2);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                        alertDialog$Builder2.o(frameLayout3);
                        k5.r("ReplaceBoostChannelDescription", null, 2131746278, new Object[]{M0.title, M02.title}, textView);
                        alertDialog$Builder2.k(bd.M0(2131746280, null), new vg.w(i0Var, 1));
                        alertDialog$Builder2.h(bd.M0(2131752589, null), new u9.j(11));
                        alertDialog$Builder2.p();
                        return;
                    } else {
                        int i12 = e3Var.f22303f;
                        if (i12 != 0) {
                            xg.j.g(i12);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 5:
                xg.q0 q0Var2 = (xg.q0) this.f50827b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f50828c;
                ArrayList arrayList = q0Var2.Q1;
                if (!arrayList.isEmpty()) {
                    xg.d0 d0Var = q0Var2.T1;
                    if (!d0Var.R) {
                        d0Var.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(m5.o(tL_myBoost.peer)));
                        }
                        xg.s.a(chat.f27001id, arrayList2, new ai.v1(q0Var2, chat, arrayList2, hashSet, 18), new xg.d(q0Var2, 1));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                xg.e1 e1Var = (xg.e1) this.f50827b;
                ArrayList arrayList3 = (ArrayList) this.f50828c;
                HashSet hashSet2 = e1Var.f58673a2;
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    Object obj2 = arrayList3.get(i10);
                    i10++;
                    Long l10 = (Long) obj2;
                    l10.getClass();
                    hashSet2.remove(l10);
                    e1Var.f58678g2.remove(l10);
                }
                e1Var.e1();
                e1Var.S1.b(true, hashSet2, new xg.x0(e1Var, 5), null);
                e1Var.p1(true, true);
                e1Var.f1();
                return;
            case 7:
                final xg.e1 e1Var2 = (xg.e1) this.f50827b;
                final TLRPC.User user = (TLRPC.User) this.f50828c;
                f60 F = f60.F(e1Var2.f28589c, e1Var2.J0, (View) view.getParent());
                F.c(2131232580, bd.M0(2131745611, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    d2 d2Var3 = e1Var2.f36105p1;
                                    if (d2Var3 == null) {
                                        d2 T = LaunchActivity.T();
                                        ?? obj3 = new Object();
                                        obj3.f27395a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f27150id);
                                            T.showAsSheet(new wm(bundle), obj3);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f27150id);
                                    d2Var3.presentFragment(new wm(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    d2 d2Var4 = e1Var2.f36105p1;
                                    if (d2Var4 == null) {
                                        d2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj4 = new Object();
                                            obj4.f27395a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f27150id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f27150id);
                                    d2Var4.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                F.c(2131232266, bd.M0(2131747794, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    d2 d2Var3 = e1Var2.f36105p1;
                                    if (d2Var3 == null) {
                                        d2 T = LaunchActivity.T();
                                        ?? obj3 = new Object();
                                        obj3.f27395a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f27150id);
                                            T.showAsSheet(new wm(bundle), obj3);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f27150id);
                                    d2Var3.presentFragment(new wm(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    d2 d2Var4 = e1Var2.f36105p1;
                                    if (d2Var4 == null) {
                                        d2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj4 = new Object();
                                            obj4.f27395a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f27150id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f27150id);
                                    d2Var4.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                F.Z();
                return;
            case 8:
                final yg.e eVar = (yg.e) this.f50827b;
                final zg.a aVar = (zg.a) this.f50828c;
                if (eVar.d) {
                    if (!aVar.f60461a.R) {
                        aVar.b(true);
                        String str = eVar.h;
                        u10 u10Var = new u10() {
                            @Override
                            public final void a(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar;
                                        g0.i3(new xf.c(b0Var, 5), 200L);
                                        b0Var.f58656r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        j.c((TLRPC.TL_error) obj3, eVar2.f59446n, eVar2.f59443c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        u10 u10Var2 = new u10() {
                            @Override
                            public final void a(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar;
                                        g0.i3(new xf.c(b0Var, 5), 200L);
                                        b0Var.f58656r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        j.c((TLRPC.TL_error) obj3, eVar2.f59446n, eVar2.f59443c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.f22829t0);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new xg.p(u10Var2, u10Var, 0), 2);
                        return;
                    }
                    return;
                }
                ((xg.b0) eVar).f58656r.dismiss();
                return;
            case 9:
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f50828c;
                zg.f fVar = ((zg.g) this.f50827b).f60495w;
                if (fVar != null) {
                    xg.a0 a0Var2 = ((xg.u) fVar).f58763a;
                    a0Var2.V1.remove(chat2);
                    a0Var2.k1(true, true);
                    return;
                }
                return;
            case 10:
                ((xg.d) this.f50827b).a((TLRPC.TL_payments_checkedGiftCode) this.f50828c);
                return;
            default:
                ((xg.d) this.f50827b).a((TLRPC.Chat) this.f50828c);
                return;
        }
    }
}
