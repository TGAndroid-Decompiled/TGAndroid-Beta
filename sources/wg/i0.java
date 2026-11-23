package wg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b61;
import ug.h1;
public final class i0 extends h1 {
    public final ArrayList M2;

    public i0(g2 g2Var, int i7, ArrayList arrayList, i6 i6Var) {
        super(g2Var, i7, null, null, null, i6Var);
        ArrayList arrayList2 = new ArrayList();
        this.M2 = arrayList2;
        arrayList2.addAll(arrayList);
        l1();
        this.U0 = false;
        this.f30262v0 = false;
        this.f30260t0 = 0;
        yg.a aVar = new yg.a(getContext(), this.J0);
        aVar.setOnClickListener(new tg.a0(this, 5));
        aVar.setCloseStyle(true);
        this.f30226b.addView(aVar, na.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        ek0 ek0Var = this.f39246o1;
        int i10 = this.f30261u0;
        ek0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(64.0f));
        Context context = getContext();
        int i11 = h0.f59875f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, na.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            h0 h0Var = new h0(context, 47.0f);
            h0Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            a9 a9Var = h0Var.f59879e;
            a9Var.r(user);
            h0Var.f59876a.f(user, a9Var);
            frameLayout2.addView(h0Var, 0, na.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, na.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i13);
                h0 h0Var2 = new h0(context, 41.5f);
                a9 a9Var2 = h0Var2.f59879e;
                a9Var2.r(user2);
                h0Var2.f59876a.f(user2, a9Var2);
                frameLayout2.addView(h0Var2, 0, na.e(83, 83, 17));
                h0Var2.setTranslationX(org.telegram.messenger.g0.L(29.0f) * (-i13));
                if (i13 == 0 && arrayList2.size() > 3) {
                    g0 g0Var = h0Var2.f59877b;
                    g0Var.setAlpha(1.0f);
                    g0Var.f59874b = arrayList2.size() - 3;
                }
                i12++;
                if (i13 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i12 - 1) * org.telegram.messenger.g0.L(14.5f));
        }
        this.f58818x2 = frameLayout;
        O();
    }

    public static void m1(ArrayList arrayList) {
        g2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        i0 i0Var = new i0(Q, i10.f24637t0, arrayList, Q.getResourceProvider());
        i0Var.F2 = true;
        i0Var.G2 = true;
        i0Var.show();
    }

    @Override
    public final void e1(int i7, View view) {
        if (i7 == 0) {
            view.setOutlineProvider(new bg.q0(22));
            view.setClipToOutline(true);
            u6.h(n6.f29394a7, view, this.J0);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(6.0f);
        }
    }

    @Override
    public final void f1(b61 b61Var) {
        int i7;
        float f10;
        float f11;
        View view = this.f58818x2;
        ArrayList arrayList = this.M2;
        if (arrayList.size() == 1) {
            i7 = 94;
        } else {
            i7 = 83;
        }
        int i10 = i7;
        if (arrayList.size() == 1) {
            f10 = 28.0f;
        } else {
            f10 = 34.0f;
        }
        float f12 = f10;
        if (arrayList.size() == 1) {
            f11 = 9.0f;
        } else {
            f11 = 14.0f;
        }
        b61Var.addView(view, na.k(0.0f, f12, 0.0f, f11, -1, i10));
    }

    @Override
    public final void k1(boolean z10) {
        String a02;
        this.K2[0].setTextSize(1, 20.0f);
        this.L2.setPadding(org.telegram.messenger.g0.L(30.0f), 0, org.telegram.messenger.g0.L(30.0f), 0);
        this.L2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        j80 j80Var = this.K2[0];
        ArrayList arrayList = this.M2;
        j80Var.setText(gd.K0(arrayList.size(), "GiftPremiumGiftsSent"));
        ((ViewGroup.MarginLayoutParams) this.L2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
        ((ViewGroup.MarginLayoutParams) this.L2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(4.0f);
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    a02 = gd.G(arrayList.size() - 3, "GiftPremiumUsersPurchasedMany", gd.a0("GiftPremiumUsersThree", null, 2131749476, n10.k((TLRPC.User) arrayList.get(0), true), n10.k((TLRPC.User) arrayList.get(1), true), n10.k((TLRPC.User) arrayList.get(2), true)));
                } else {
                    a02 = gd.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749480, gd.a0("GiftPremiumUsersThree", null, 2131749476, n10.k((TLRPC.User) arrayList.get(0), true), n10.k((TLRPC.User) arrayList.get(1), true), n10.k((TLRPC.User) arrayList.get(2), true)));
                }
            } else {
                a02 = gd.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749480, gd.a0("GiftPremiumUsersTwo", null, 2131749475, n10.k((TLRPC.User) arrayList.get(0), true), n10.k((TLRPC.User) arrayList.get(1), true)));
            }
        } else {
            a02 = gd.a0(null, null, 2131749480, gd.a0(null, null, 2131749482, n10.k((TLRPC.User) arrayList.get(0), true)));
        }
        this.L2.setText(org.telegram.messenger.g0.W2(a02));
        this.L2.append("\n");
        this.L2.append("\n");
        if (arrayList.size() == 1) {
            this.L2.append(org.telegram.messenger.g0.W2(gd.a0("GiftPremiumGiftsSentStatusForUser", null, 2131749495, n10.k((TLRPC.User) arrayList.get(0), true))));
        } else {
            this.L2.append(org.telegram.messenger.g0.W2(gd.N0(2131749496, "GiftPremiumGiftsSentStatus")));
        }
    }

    @Override
    public final void l1() {
        this.f58797b2 = 1;
        this.f58798c2 = 0;
        this.f58800f2 = 1;
        int size = this.T1.size();
        int i7 = 1 + size;
        this.f58801g2 = i7;
        this.f58797b2 = size + 2;
        this.f58804j2 = i7;
    }
}
