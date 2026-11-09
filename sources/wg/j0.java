package wg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.x70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d61;
public final class j0 extends ug.f1 {
    public final ArrayList I2;

    public j0(f2 f2Var, int i7, ArrayList arrayList, g6 g6Var) {
        super(f2Var, i7, null, null, null, g6Var);
        ArrayList arrayList2 = new ArrayList();
        this.I2 = arrayList2;
        arrayList2.addAll(arrayList);
        k1();
        this.T0 = false;
        this.f28655u0 = false;
        this.f28653s0 = 0;
        yg.a aVar = new yg.a(getContext(), this.I0);
        aVar.setOnClickListener(new ii.g(this, 28));
        aVar.setCloseStyle(true);
        this.f28624b.addView(aVar, ha.d(-1, 64.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        qj0 qj0Var = this.f36303k1;
        int i10 = this.f28654t0;
        qj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(64.0f));
        Context context = getContext();
        int i11 = i0.f57755f;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        if (arrayList2.size() == 1) {
            frameLayout.addView(frameLayout2, ha.d(-1, 94.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            i0 i0Var = new i0(context, 47.0f);
            i0Var.d = false;
            TLRPC.User user = (TLRPC.User) arrayList2.get(0);
            w8 w8Var = i0Var.f57759e;
            w8Var.r(user);
            i0Var.f57756a.e(user, w8Var);
            frameLayout2.addView(i0Var, 0, ha.e(94, 94, 17));
        } else {
            frameLayout.addView(frameLayout2, ha.d(-1, 83.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                TLRPC.User user2 = (TLRPC.User) arrayList2.get(i13);
                i0 i0Var2 = new i0(context, 41.5f);
                w8 w8Var2 = i0Var2.f57759e;
                w8Var2.r(user2);
                i0Var2.f57756a.e(user2, w8Var2);
                frameLayout2.addView(i0Var2, 0, ha.e(83, 83, 17));
                i0Var2.setTranslationX(org.telegram.messenger.g0.L(29.0f) * (-i13));
                if (i13 == 0 && arrayList2.size() > 3) {
                    h0 h0Var = i0Var2.f57757b;
                    h0Var.setAlpha(1.0f);
                    h0Var.f57752b = arrayList2.size() - 3;
                }
                i12++;
                if (i13 == 2) {
                    break;
                }
            }
            frameLayout.setTranslationX((i12 - 1) * org.telegram.messenger.g0.L(14.5f));
        }
        this.f56593t2 = frameLayout;
        N();
    }

    public static void l1(ArrayList arrayList) {
        f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        j0 j0Var = new j0(Q, p10.f24470s0, arrayList, Q.getResourceProvider());
        j0Var.B2 = true;
        j0Var.C2 = true;
        j0Var.show();
    }

    @Override
    public final void d1(int i7, View view) {
        if (i7 == 0) {
            view.setOutlineProvider(new bg.q0(22));
            view.setClipToOutline(true);
            s6.h(l6.f27809a7, view, this.I0);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(6.0f);
        }
    }

    @Override
    public final void e1(d61 d61Var) {
        int i7;
        float f10;
        float f11;
        View view = this.f56593t2;
        ArrayList arrayList = this.I2;
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
        d61Var.addView(view, ha.k(0.0f, f12, 0.0f, f11, -1, i10));
    }

    @Override
    public final void j1(boolean z9) {
        String a02;
        this.G2[0].setTextSize(1, 20.0f);
        this.H2.setPadding(org.telegram.messenger.g0.L(30.0f), 0, org.telegram.messenger.g0.L(30.0f), 0);
        this.H2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        x70 x70Var = this.G2[0];
        ArrayList arrayList = this.I2;
        x70Var.setText(id.K0(arrayList.size(), "GiftPremiumGiftsSent"));
        ((ViewGroup.MarginLayoutParams) this.H2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(16.0f);
        ((ViewGroup.MarginLayoutParams) this.H2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(4.0f);
        int size = arrayList.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    a02 = id.G(arrayList.size() - 3, "GiftPremiumUsersPurchasedMany", id.a0("GiftPremiumUsersThree", null, 2131749649, t10.j((TLRPC.User) arrayList.get(0), true), t10.j((TLRPC.User) arrayList.get(1), true), t10.j((TLRPC.User) arrayList.get(2), true)));
                } else {
                    a02 = id.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749653, id.a0("GiftPremiumUsersThree", null, 2131749649, t10.j((TLRPC.User) arrayList.get(0), true), t10.j((TLRPC.User) arrayList.get(1), true), t10.j((TLRPC.User) arrayList.get(2), true)));
                }
            } else {
                a02 = id.a0("GiftPremiumUsersPurchasedManyZero", null, 2131749653, id.a0("GiftPremiumUsersTwo", null, 2131749648, t10.j((TLRPC.User) arrayList.get(0), true), t10.j((TLRPC.User) arrayList.get(1), true)));
            }
        } else {
            a02 = id.a0(null, null, 2131749653, id.a0(null, null, 2131749655, t10.j((TLRPC.User) arrayList.get(0), true)));
        }
        this.H2.setText(org.telegram.messenger.g0.X2(a02));
        this.H2.append("\n");
        this.H2.append("\n");
        if (arrayList.size() == 1) {
            this.H2.append(org.telegram.messenger.g0.X2(id.a0("GiftPremiumGiftsSentStatusForUser", null, 2131749668, t10.j((TLRPC.User) arrayList.get(0), true))));
        } else {
            this.H2.append(org.telegram.messenger.g0.X2(id.M0(2131749669, "GiftPremiumGiftsSentStatus")));
        }
    }

    @Override
    public final void k1() {
        this.X1 = 1;
        this.Y1 = 0;
        this.f56576b2 = 1;
        int size = this.P1.size();
        int i7 = 1 + size;
        this.f56577c2 = i7;
        this.X1 = size + 2;
        this.f56579f2 = i7;
    }
}
