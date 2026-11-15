package wg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.z51;
import tg.h2;
import ug.g1;
public final class h0 extends g1 {
    public final ArrayList M2;

    public h0(e2 e2Var, int i7, ArrayList arrayList, e6 e6Var) {
        super(e2Var, i7, null, null, null, e6Var);
        ArrayList arrayList2 = new ArrayList();
        this.M2 = arrayList2;
        arrayList2.addAll(arrayList);
        k1();
        this.U0 = false;
        this.f29718v0 = false;
        this.f29716t0 = 0;
        yg.a aVar = new yg.a(getContext(), this.J0);
        aVar.setOnClickListener(new h2(this, 4));
        aVar.setCloseStyle(true);
        this.f29682b.addView(aVar, ja.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        uj0 uj0Var = this.f35931o1;
        int i10 = this.f29717u0;
        uj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(64.0f));
        Context context = getContext();
        int i11 = g0.f59182f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, ja.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            g0 g0Var = new g0(context, 47.0f);
            g0Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            t8 t8Var = g0Var.f59186e;
            t8Var.r(user);
            g0Var.f59183a.f(user, t8Var);
            frameLayout2.addView(g0Var, 0, ja.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, ja.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i13);
                g0 g0Var2 = new g0(context, 41.5f);
                t8 t8Var2 = g0Var2.f59186e;
                t8Var2.r(user2);
                g0Var2.f59183a.f(user2, t8Var2);
                frameLayout2.addView(g0Var2, 0, ja.e(83, 83, 17));
                g0Var2.setTranslationX(org.telegram.messenger.g0.L(29.0f) * (-i13));
                if (i13 == 0 && arrayList2.size() > 3) {
                    f0 f0Var = g0Var2.f59184b;
                    f0Var.setAlpha(1.0f);
                    f0Var.f59181b = arrayList2.size() - 3;
                }
                i12++;
                if (i13 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i12 - 1) * org.telegram.messenger.g0.L(14.5f));
        }
        this.f58109x2 = frameLayout;
        O();
    }

    public static void l1(ArrayList arrayList) {
        e2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        h0 h0Var = new h0(Q, m10.f24940t0, arrayList, Q.getResourceProvider());
        h0Var.F2 = true;
        h0Var.G2 = true;
        h0Var.show();
    }

    @Override
    public final void d1(int i7, View view) {
        if (i7 == 0) {
            view.setOutlineProvider(new bg.p0(22));
            view.setClipToOutline(true);
            q6.h(j6.f28792a7, view, this.J0);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(6.0f);
        }
    }

    @Override
    public final void e1(z51 z51Var) {
        int i7;
        float f10;
        float f11;
        View view = this.f58109x2;
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
        z51Var.addView(view, ja.k(0.0f, f12, 0.0f, f11, -1, i10));
    }

    @Override
    public final void j1(boolean z10) {
        String a02;
        this.K2[0].setTextSize(1, 20.0f);
        this.L2.setPadding(org.telegram.messenger.g0.L(30.0f), 0, org.telegram.messenger.g0.L(30.0f), 0);
        this.L2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        z70 z70Var = this.K2[0];
        ArrayList arrayList = this.M2;
        z70Var.setText(hd.K0(arrayList.size(), "GiftPremiumGiftsSent"));
        ((ViewGroup.MarginLayoutParams) this.L2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
        ((ViewGroup.MarginLayoutParams) this.L2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(4.0f);
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    a02 = hd.G(arrayList.size() - 3, "GiftPremiumUsersPurchasedMany", hd.a0("GiftPremiumUsersThree", null, 2131749649, q10.j((TLRPC.User) arrayList.get(0), true), q10.j((TLRPC.User) arrayList.get(1), true), q10.j((TLRPC.User) arrayList.get(2), true)));
                } else {
                    a02 = hd.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749653, hd.a0("GiftPremiumUsersThree", null, 2131749649, q10.j((TLRPC.User) arrayList.get(0), true), q10.j((TLRPC.User) arrayList.get(1), true), q10.j((TLRPC.User) arrayList.get(2), true)));
                }
            } else {
                a02 = hd.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749653, hd.a0("GiftPremiumUsersTwo", null, 2131749648, q10.j((TLRPC.User) arrayList.get(0), true), q10.j((TLRPC.User) arrayList.get(1), true)));
            }
        } else {
            a02 = hd.a0(null, null, 2131749653, hd.a0(null, null, 2131749655, q10.j((TLRPC.User) arrayList.get(0), true)));
        }
        this.L2.setText(org.telegram.messenger.g0.X2(a02));
        this.L2.append("\n");
        this.L2.append("\n");
        if (arrayList.size() == 1) {
            this.L2.append(org.telegram.messenger.g0.X2(hd.a0("GiftPremiumGiftsSentStatusForUser", null, 2131749668, q10.j((TLRPC.User) arrayList.get(0), true))));
        } else {
            this.L2.append(org.telegram.messenger.g0.X2(hd.M0(2131749669, "GiftPremiumGiftsSentStatus")));
        }
    }

    @Override
    public final void k1() {
        this.f58088b2 = 1;
        this.f58089c2 = 0;
        this.f58091f2 = 1;
        int size = this.T1.size();
        int i7 = 1 + size;
        this.f58092g2 = i7;
        this.f58088b2 = size + 2;
        this.f58095j2 = i7;
    }
}
