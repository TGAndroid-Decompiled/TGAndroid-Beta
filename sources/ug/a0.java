package ug;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.i2;
import c8.ma;
import di.t9;
import hi.m5;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.g3;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import v4.p;
import wg.b0;
public final class a0 implements View.OnClickListener {
    public final int f58597a;
    public final Object f58598b;
    public final Object f58599c;

    public a0(int i7, Object obj, Object obj2) {
        this.f58597a = i7;
        this.f58598b = obj;
        this.f58599c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10 = this.f58597a;
        Object obj = this.f58599c;
        Object obj2 = this.f58598b;
        int i11 = 0;
        switch (i10) {
            case 0:
                l0 l0Var = (l0) obj2;
                Context context = (Context) obj;
                h2 h2Var = l0Var.G2;
                int i12 = l0Var.d2;
                if (i12 != 11 && i12 != 34) {
                    if (i12 != 19 && i12 != 32 && !l0Var.t1()) {
                        if (i12 != 18 && i12 != 20 && i12 != 24 && i12 != 25 && i12 != 26 && i12 != 29 && i12 != 22 && i12 != 23 && i12 != 21 && i12 != 27 && i12 != 28 && i12 != 30 && i12 != 35) {
                            if (!j10.i(l0Var.f30189a).q() && !mp.u1(l0Var.f30189a).K3() && !l0Var.J2) {
                                if (h2Var != null) {
                                    if (h2Var.getVisibleDialog() != null) {
                                        h2Var.getVisibleDialog().dismiss();
                                    }
                                    h2Var.presentFragment(new PremiumPreviewFragment(0, l0.v1(i12)));
                                    l0Var.dismiss();
                                    return;
                                }
                                return;
                            }
                            l0Var.dismiss();
                            return;
                        }
                        org.telegram.messenger.g0.g(l0Var.l1());
                        l0Var.dismiss();
                        return;
                    }
                    g3 g3Var = l0Var.Y1;
                    if (g3Var.f24156b) {
                        if (j10.i(l0Var.f30189a).q() && wg.s.i()) {
                            wg.h.i(l0Var.W1, l0Var);
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, l0Var.J0);
                        String M0 = gd.M0(2131746839, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                        u1Var.S = M0;
                        if (l0Var.s1()) {
                            i7 = 2131746837;
                        } else {
                            i7 = 2131746838;
                        }
                        u1Var.U = org.telegram.messenger.g0.W2(gd.M0(i7, null));
                        alertDialog$Builder.k(gd.M0(2131752141, null), new w(l0Var, 0));
                        alertDialog$Builder.h(gd.M0(2131752578, null), new x(0));
                        alertDialog$Builder.p();
                        return;
                    }
                    boolean z10 = g3Var.f24155a;
                    if (z10 && g3Var.f24157c == 0) {
                        if (g3Var.f24158e && wg.s.i()) {
                            l0Var.f58729b2 = true;
                            l0Var.f58746t2.f33032e0 = false;
                            h2 h2Var2 = l0Var.f39538s1;
                            g3 g3Var2 = l0Var.Y1;
                            wg.q0 q0Var = new wg.q0(h2Var2, g3Var2.h, g3Var2.f24163k);
                            q0Var.show();
                            q0Var.I0 = new t9(l0Var, 13);
                            return;
                        }
                        l0Var.j1();
                        return;
                    } else if (z10) {
                        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
                        q9 q9Var = new q9(l0Var.getContext());
                        q9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                        frameLayout.addView(q9Var, ma.c(60.0f, 60));
                        frameLayout.setClipChildren(false);
                        Paint paint = new Paint(1);
                        paint.setColor(n6.x0(null, n6.f29469h5, false));
                        frameLayout.addView(new m5(l0Var.getContext(), paint, l0Var.getContext().getDrawable(2131231127)), ma.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                        ImageView imageView = new ImageView(l0Var.getContext());
                        imageView.setImageResource(2131232058);
                        u6.s(imageView, n6.f29561m6, null, PorterDuff.Mode.SRC_ATOP);
                        frameLayout.addView(imageView, ma.e(24, 24, 17));
                        q9 q9Var2 = new q9(l0Var.getContext());
                        q9Var2.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
                        frameLayout.addView(q9Var2, ma.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                        FrameLayout frameLayout2 = new FrameLayout(l0Var.getContext());
                        frameLayout2.addView(frameLayout, ma.e(-2, 60, 1));
                        frameLayout2.setClipChildren(false);
                        TextView textView = new TextView(context);
                        textView.setLetterSpacing(0.025f);
                        u6.U(textView, n6.f29504j5, null);
                        textView.setTextSize(1, 16.0f);
                        frameLayout2.addView(textView, ma.t(-1, -2, 0, 24, 80, 24, 0));
                        b9 b9Var = new b9((i6) null);
                        TLRPC.Chat O0 = mp.u1(l0Var.f30189a).O0(Long.valueOf(-l0Var.Y1.f24157c));
                        b9Var.q(O0);
                        q9Var.f(O0, b9Var);
                        b9 b9Var2 = new b9((i6) null);
                        TLRPC.Chat O02 = mp.u1(l0Var.f30189a).O0(Long.valueOf(-l0Var.W1));
                        b9Var2.q(O02);
                        q9Var2.f(O02, b9Var2);
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                        alertDialog$Builder2.o(frameLayout2);
                        f3.q("ReplaceBoostChannelDescription", null, 2131746075, new Object[]{O0.title, O02.title}, textView);
                        alertDialog$Builder2.k(gd.M0(2131746077, null), new w(l0Var, 1));
                        alertDialog$Builder2.h(gd.M0(2131752578, null), new x(1));
                        alertDialog$Builder2.p();
                        return;
                    } else {
                        int i13 = g3Var.f24159f;
                        if (i13 != 0) {
                            wg.h.g(i13);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                wg.q0 q0Var2 = (wg.q0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ArrayList arrayList = q0Var2.T1;
                if (!arrayList.isEmpty()) {
                    wg.d0 d0Var = q0Var2.W1;
                    if (!d0Var.R) {
                        d0Var.setLoading(true);
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size = arrayList.size();
                        while (i11 < size) {
                            Object obj3 = arrayList.get(i11);
                            i11++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj3;
                            arrayList2.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(n5.o(tL_myBoost.peer)));
                        }
                        wg.s.a(chat.f28405id, arrayList2, new i2(q0Var2, chat, arrayList2, hashSet, 18), new z(q0Var2, 4));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                wg.d1 d1Var = (wg.d1) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                HashSet hashSet2 = d1Var.f59739c2;
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj4 = arrayList3.get(i11);
                    i11++;
                    Long l10 = (Long) obj4;
                    l10.getClass();
                    hashSet2.remove(l10);
                    d1Var.f59744i2.remove(l10);
                }
                d1Var.e1();
                d1Var.V1.b(true, hashSet2, new wg.x0(d1Var, 5), null);
                d1Var.m1(true, true);
                d1Var.f1();
                return;
            case 3:
                final wg.d1 d1Var2 = (wg.d1) obj2;
                final TLRPC.User user = (TLRPC.User) obj;
                y60 G = y60.G(d1Var2.f30195c, d1Var2.J0, (View) view.getParent());
                G.c(2131232584, gd.M0(2131745406, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    h2 h2Var3 = d1Var2.f39538s1;
                                    if (h2Var3 == null) {
                                        h2 T = LaunchActivity.T();
                                        ?? obj5 = new Object();
                                        obj5.f28923a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f28554id);
                                            T.showAsSheet(new bn(bundle), obj5);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f28554id);
                                    h2Var3.presentFragment(new bn(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    h2 h2Var4 = d1Var2.f39538s1;
                                    if (h2Var4 == null) {
                                        h2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj6 = new Object();
                                            obj6.f28923a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f28554id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj6);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f28554id);
                                    h2Var4.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                G.c(2131232268, gd.M0(2131747593, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    h2 h2Var3 = d1Var2.f39538s1;
                                    if (h2Var3 == null) {
                                        h2 T = LaunchActivity.T();
                                        ?? obj5 = new Object();
                                        obj5.f28923a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f28554id);
                                            T.showAsSheet(new bn(bundle), obj5);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f28554id);
                                    h2Var3.presentFragment(new bn(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    h2 h2Var4 = d1Var2.f39538s1;
                                    if (h2Var4 == null) {
                                        h2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj6 = new Object();
                                            obj6.f28923a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f28554id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj6);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f28554id);
                                    h2Var4.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                G.a0();
                return;
            case 4:
                final xg.e eVar = (xg.e) obj2;
                final yg.a aVar = (yg.a) obj;
                if (eVar.d) {
                    if (!aVar.f61199a.R) {
                        aVar.b(true);
                        String str = eVar.h;
                        x10 x10Var = new x10() {
                            @Override
                            public final void a(Object obj5) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj5;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar;
                                        g0.h3(new p(b0Var, 8), 200L);
                                        b0Var.f59722r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        wg.h.c((TLRPC.TL_error) obj5, eVar2.f60487n, eVar2.f60484c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        x10 x10Var2 = new x10() {
                            @Override
                            public final void a(Object obj5) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj5;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar;
                                        g0.h3(new p(b0Var, 8), 200L);
                                        b0Var.f59722r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        wg.h.c((TLRPC.TL_error) obj5, eVar2.f60487n, eVar2.f60484c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(j10.f24773t0);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new wg.n(x10Var2, x10Var, 0), 2);
                        return;
                    }
                    return;
                }
                ((wg.b0) eVar).f59722r.dismiss();
                return;
            case 5:
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                yg.f fVar = ((yg.g) obj2).f61233w;
                if (fVar != null) {
                    wg.a0 a0Var = ((wg.u) fVar).f59825a;
                    a0Var.Y1.remove(chat2);
                    a0Var.l1(true, true);
                    return;
                }
                return;
            case 6:
                ((z) obj2).a((TLRPC.TL_payments_checkedGiftCode) obj);
                return;
            default:
                ((z) obj2).a((TLRPC.Chat) obj);
                return;
        }
    }
}
