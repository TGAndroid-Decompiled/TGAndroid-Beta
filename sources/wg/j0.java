package wg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ma;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d61;
import ug.h1;
public final class j0 extends h1 {
    public final ArrayList M2;

    public j0(g2 g2Var, int i7, ArrayList arrayList, h6 h6Var) {
        super(g2Var, i7, null, null, null, h6Var);
        ArrayList arrayList2 = new ArrayList();
        this.M2 = arrayList2;
        arrayList2.addAll(arrayList);
        l1();
        this.U0 = false;
        this.f30209v0 = false;
        this.f30207t0 = 0;
        yg.a aVar = new yg.a(getContext(), this.J0);
        aVar.setOnClickListener(new tg.u(this, 5));
        aVar.setCloseStyle(true);
        this.f30173b.addView(aVar, ma.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        ek0 ek0Var = this.f39539o1;
        int i10 = this.f30208u0;
        ek0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(64.0f));
        Context context = getContext();
        int i11 = i0.f59810f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, ma.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            i0 i0Var = new i0(context, 47.0f);
            i0Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            b9 b9Var = i0Var.f59814e;
            b9Var.r(user);
            i0Var.f59811a.f(user, b9Var);
            frameLayout2.addView(i0Var, 0, ma.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, ma.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i13);
                i0 i0Var2 = new i0(context, 41.5f);
                b9 b9Var2 = i0Var2.f59814e;
                b9Var2.r(user2);
                i0Var2.f59811a.f(user2, b9Var2);
                frameLayout2.addView(i0Var2, 0, ma.e(83, 83, 17));
                i0Var2.setTranslationX(org.telegram.messenger.g0.L(29.0f) * (-i13));
                if (i13 == 0 && arrayList2.size() > 3) {
                    h0 h0Var = i0Var2.f59812b;
                    h0Var.setAlpha(1.0f);
                    h0Var.f59807b = arrayList2.size() - 3;
                }
                i12++;
                if (i13 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i12 - 1) * org.telegram.messenger.g0.L(14.5f));
        }
        this.f58734x2 = frameLayout;
        O();
    }

    public static void m1(ArrayList arrayList) {
        g2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        j0 j0Var = new j0(Q, j10.f24798t0, arrayList, Q.getResourceProvider());
        j0Var.F2 = true;
        j0Var.G2 = true;
        j0Var.show();
    }

    @Override
    public final void e1(int i7, View view) {
        if (i7 == 0) {
            view.setOutlineProvider(new bg.q0(22));
            view.setClipToOutline(true);
            t6.h(m6.f29321a7, view, this.J0);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(6.0f);
        }
    }

    @Override
    public final void f1(d61 d61Var) {
        int i7;
        float f10;
        float f11;
        View view = this.f58734x2;
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
        d61Var.addView(view, ma.k(0.0f, f12, 0.0f, f11, -1, i10));
    }

    @Override
    public final void k1(boolean z10) {
        String a02;
        this.K2[0].setTextSize(1, 20.0f);
        this.L2.setPadding(org.telegram.messenger.g0.L(30.0f), 0, org.telegram.messenger.g0.L(30.0f), 0);
        this.L2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        m80 m80Var = this.K2[0];
        ArrayList arrayList = this.M2;
        m80Var.setText(gd.K0(arrayList.size(), "GiftPremiumGiftsSent"));
        ((ViewGroup.MarginLayoutParams) this.L2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
        ((ViewGroup.MarginLayoutParams) this.L2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(4.0f);
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    a02 = gd.G(arrayList.size() - 3, "GiftPremiumUsersPurchasedMany", gd.a0("GiftPremiumUsersThree", null, 2131749476, o10.k((TLRPC.User) arrayList.get(0), true), o10.k((TLRPC.User) arrayList.get(1), true), o10.k((TLRPC.User) arrayList.get(2), true)));
                } else {
                    a02 = gd.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749480, gd.a0("GiftPremiumUsersThree", null, 2131749476, o10.k((TLRPC.User) arrayList.get(0), true), o10.k((TLRPC.User) arrayList.get(1), true), o10.k((TLRPC.User) arrayList.get(2), true)));
                }
            } else {
                a02 = gd.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749480, gd.a0("GiftPremiumUsersTwo", null, 2131749475, o10.k((TLRPC.User) arrayList.get(0), true), o10.k((TLRPC.User) arrayList.get(1), true)));
            }
        } else {
            a02 = gd.a0(null, null, 2131749480, gd.a0(null, null, 2131749482, o10.k((TLRPC.User) arrayList.get(0), true)));
        }
        this.L2.setText(org.telegram.messenger.g0.W2(a02));
        this.L2.append("\n");
        this.L2.append("\n");
        if (arrayList.size() == 1) {
            this.L2.append(org.telegram.messenger.g0.W2(gd.a0("GiftPremiumGiftsSentStatusForUser", null, 2131749495, o10.k((TLRPC.User) arrayList.get(0), true))));
        } else {
            this.L2.append(org.telegram.messenger.g0.W2(gd.N0(2131749496, "GiftPremiumGiftsSentStatus")));
        }
    }

    @Override
    public final void l1() {
        this.f58713b2 = 1;
        this.f58714c2 = 0;
        this.f58716f2 = 1;
        int size = this.T1.size();
        int i7 = 1 + size;
        this.f58717g2 = i7;
        this.f58713b2 = size + 2;
        this.f58720j2 = i7;
    }
}
