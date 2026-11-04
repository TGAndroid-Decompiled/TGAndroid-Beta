package xg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s51;
import vg.h1;
public final class j0 extends h1 {
    public final ArrayList J2;

    public j0(d2 d2Var, int i3, ArrayList arrayList, e6 e6Var) {
        super(d2Var, i3, null, null, null, e6Var);
        ArrayList arrayList2 = new ArrayList();
        this.J2 = arrayList2;
        arrayList2.addAll(arrayList);
        k1();
        this.U0 = false;
        this.f28619v0 = false;
        this.f28617t0 = 0;
        zg.a aVar = new zg.a(getContext(), this.J0);
        aVar.setOnClickListener(new vg.b1(this, 2));
        aVar.setCloseStyle(true);
        this.f28586b.addView(aVar, mf.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        tj0 tj0Var = this.f36102l1;
        int i10 = this.f28618u0;
        tj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(64.0f));
        Context context = getContext();
        int i11 = i0.f58711f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, mf.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            i0 i0Var = new i0(context, 47.0f);
            i0Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            u8 u8Var = i0Var.f58715e;
            u8Var.r(user);
            i0Var.f58712a.e(user, u8Var);
            frameLayout2.addView(i0Var, 0, mf.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, mf.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i13);
                i0 i0Var2 = new i0(context, 41.5f);
                u8 u8Var2 = i0Var2.f58715e;
                u8Var2.r(user2);
                i0Var2.f58712a.e(user2, u8Var2);
                frameLayout2.addView(i0Var2, 0, mf.e(83, 83, 17));
                i0Var2.setTranslationX(org.telegram.messenger.g0.L(29.0f) * (-i13));
                if (i13 == 0 && arrayList2.size() > 3) {
                    h0 h0Var = i0Var2.f58713b;
                    h0Var.setAlpha(1.0f);
                    h0Var.f58710b = arrayList2.size() - 3;
                }
                i12++;
                if (i13 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i12 - 1) * org.telegram.messenger.g0.L(14.5f));
        }
        this.f56643u2 = frameLayout;
        N();
    }

    public static void l1(ArrayList arrayList) {
        d2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        j0 j0Var = new j0(Q, h10.f22829t0, arrayList, Q.getResourceProvider());
        j0Var.C2 = true;
        j0Var.D2 = true;
        j0Var.show();
    }

    @Override
    public final void d1(int i3, View view) {
        if (i3 == 0) {
            view.setOutlineProvider(new cg.p0(25));
            view.setClipToOutline(true);
            r6.i(k6.f27824a7, view, this.J0);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(6.0f);
        }
    }

    @Override
    public final void e1(s51 s51Var) {
        int i3;
        float f10;
        float f11;
        View view = this.f56643u2;
        ArrayList arrayList = this.J2;
        if (arrayList.size() == 1) {
            i3 = 94;
        } else {
            i3 = 83;
        }
        int i10 = i3;
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
        s51Var.addView(view, mf.k(0.0f, f12, 0.0f, f11, -1, i10));
    }

    @Override
    public final void j1(boolean z10) {
        String a02;
        this.H2[0].setTextSize(1, 20.0f);
        this.I2.setPadding(org.telegram.messenger.g0.L(30.0f), 0, org.telegram.messenger.g0.L(30.0f), 0);
        this.I2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        s70 s70Var = this.H2[0];
        ArrayList arrayList = this.J2;
        s70Var.setText(bd.K0(arrayList.size(), "GiftPremiumGiftsSent"));
        ((ViewGroup.MarginLayoutParams) this.I2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
        ((ViewGroup.MarginLayoutParams) this.I2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(4.0f);
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    a02 = bd.G(arrayList.size() - 3, "GiftPremiumUsersPurchasedMany", bd.a0("GiftPremiumUsersThree", null, 2131749657, l10.j((TLRPC.User) arrayList.get(0), true), l10.j((TLRPC.User) arrayList.get(1), true), l10.j((TLRPC.User) arrayList.get(2), true)));
                } else {
                    a02 = bd.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749661, bd.a0("GiftPremiumUsersThree", null, 2131749657, l10.j((TLRPC.User) arrayList.get(0), true), l10.j((TLRPC.User) arrayList.get(1), true), l10.j((TLRPC.User) arrayList.get(2), true)));
                }
            } else {
                a02 = bd.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749661, bd.a0("GiftPremiumUsersTwo", null, 2131749656, l10.j((TLRPC.User) arrayList.get(0), true), l10.j((TLRPC.User) arrayList.get(1), true)));
            }
        } else {
            a02 = bd.a0(null, null, 2131749661, bd.a0(null, null, 2131749663, l10.j((TLRPC.User) arrayList.get(0), true)));
        }
        this.I2.setText(org.telegram.messenger.g0.X2(a02));
        this.I2.append("\n");
        this.I2.append("\n");
        if (arrayList.size() == 1) {
            this.I2.append(org.telegram.messenger.g0.X2(bd.a0("GiftPremiumGiftsSentStatusForUser", null, 2131749676, l10.j((TLRPC.User) arrayList.get(0), true))));
        } else {
            this.I2.append(org.telegram.messenger.g0.X2(bd.M0(2131749677, "GiftPremiumGiftsSentStatus")));
        }
    }

    @Override
    public final void k1() {
        this.Y1 = 1;
        this.Z1 = 0;
        this.c2 = 1;
        int size = this.Q1.size();
        int i3 = 1 + size;
        this.f56626d2 = i3;
        this.Y1 = size + 2;
        this.f56629g2 = i3;
    }
}
