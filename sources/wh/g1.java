package wh;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.q70;
import org.telegram.ui.ti0;
public final class g1 implements View.OnClickListener {
    public final int f49752a;
    public final z1 f49753b;

    public g1(z1 z1Var, int i10) {
        this.f49752a = i10;
        this.f49753b = z1Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        i5 R2;
        l5 o10;
        String str;
        switch (this.f49752a) {
            case 0:
                this.f49753b.r0();
                return;
            case 1:
                z1 z1Var = this.f49753b;
                if (!z1Var.M.F2()) {
                    z1Var.finishFragment();
                    return;
                }
                return;
            case 2:
                d2 d2Var = this.f49753b.M.G3;
                if (d2Var != null) {
                    d2Var.k();
                    return;
                }
                return;
            case 3:
                d2 d2Var2 = this.f49753b.M.G3;
                if (d2Var2 != null) {
                    d2Var2.i();
                    return;
                }
                return;
            case 4:
                z1.U(this.f49753b);
                return;
            case 5:
                z1 z1Var2 = this.f49753b;
                if (z1Var2.f50215y0) {
                    z1Var2.k0(true);
                    e1 P2 = z1Var2.M.P2();
                    if (P2 != null) {
                        P2.r();
                        AndroidUtilities.showKeyboard(P2);
                        return;
                    }
                    return;
                }
                if (z1Var2.f50213x0 == null) {
                    mz mzVar = new mz(z1Var2, true, false, false, z1Var2.getParentActivity(), true, null, z1Var2.L, true, z1Var2.getResourceProvider(), false, false);
                    z1Var2.f50213x0 = mzVar;
                    mzVar.setVisibility(8);
                    mz mzVar2 = z1Var2.f50213x0;
                    mzVar2.f29330u2 = false;
                    mzVar2.setDelegate(new q1(z1Var2));
                    int indexOfChild = z1Var2.L.indexOfChild(z1Var2.X);
                    if (indexOfChild < 0) {
                        indexOfChild = z1Var2.L.getChildCount();
                    }
                    FrameLayout.LayoutParams e6 = c6.e(-1, z1Var2.j0(), 87);
                    e6.bottomMargin = z1Var2.Q0;
                    z1Var2.L.addView(z1Var2.f50213x0, indexOfChild, e6);
                }
                int j02 = z1Var2.j0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1Var2.f50213x0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = c6.e(-1, j02, 87);
                } else {
                    layoutParams.height = j02;
                }
                layoutParams.bottomMargin = z1Var2.Q0;
                z1Var2.f50213x0.setLayoutParams(layoutParams);
                z1Var2.f50213x0.setVisibility(0);
                z1Var2.f50215y0 = true;
                z1Var2.A0 = j02 + z1Var2.Q0;
                e1 P22 = z1Var2.M.P2();
                if (P22 != null) {
                    AndroidUtilities.hideKeyboard(P22);
                }
                z1Var2.h0();
                z1Var2.Y.j(og.d, true);
                return;
            case 6:
                final z1 z1Var3 = this.f49753b;
                q70 q70Var = z1Var3.f50208u0;
                if (q70Var != null) {
                    q70Var.u();
                    z1Var3.f50208u0 = null;
                }
                final q70 H = q70.H(z1Var3, view);
                H.Q = true;
                a Q2 = z1Var3.M.Q2();
                if (Q2 != null && Q2.b()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                H.j(z4, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new j1(z1Var3, Q2, 5));
                if (Q2 != null && Q2.b() && !Q2.a() && !Q2.c()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.j(z10, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new j1(z1Var3, Q2, 6));
                if (Q2 != null && Q2.b() && !Q2.a() && Q2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new j1(z1Var3, Q2, 7));
                if (Q2 != null && Q2.b() && Q2.a() && !Q2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new j1(z1Var3, Q2, 8));
                if (Q2 != null && (Q2.f49616b instanceof TL_iv.pageBlockDetails)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                r3 r3Var = z1Var3.M;
                Objects.requireNonNull(r3Var);
                H.j(z13, i10, null, string, new b(r3Var, 1));
                boolean m22 = z1Var3.M.m2();
                boolean p22 = z1Var3.M.p2();
                if (m22 || p22) {
                    H.k();
                    if (m22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        z1Var3.M.r3(false);
                                        H.u();
                                        return;
                                    default:
                                        z1Var3.M.r3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (p22) {
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        z1Var3.M.r3(false);
                                        H.u();
                                        return;
                                    default:
                                        z1Var3.M.r3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                z1Var3.f50208u0 = H;
                return;
            case 7:
                z1 z1Var4 = this.f49753b;
                q70 q70Var2 = z1Var4.f50208u0;
                TL_iv.pageTableCell pagetablecell = null;
                if (q70Var2 != null) {
                    q70Var2.u();
                    z1Var4.f50208u0 = null;
                }
                r3 r3Var2 = z1Var4.M;
                i5 i5Var = r3Var2.f49982f4;
                if (i5Var == null && (R2 = r3Var2.R2()) != null && R2.getModel() != null) {
                    View findFocus = z1Var4.M.findFocus();
                    if ((findFocus instanceof e1) && (o10 = R2.o((e1) findFocus)) != null) {
                        pagetablecell = o10.f49867b;
                    }
                    if (pagetablecell != null) {
                        z1Var4.M.g2(R2);
                        if (R2.E.add(pagetablecell)) {
                            R2.v.invalidate();
                            R2.t();
                        }
                        i5Var = R2;
                    }
                }
                if (i5Var != null && i5Var.getModel() != null && !i5Var.E.isEmpty()) {
                    z1Var4.M.F4(i5Var);
                    return;
                } else {
                    z1Var4.M.R1(v5.u(2, 2));
                    return;
                }
            case 8:
                z1 z1Var5 = this.f49753b;
                q70 q70Var3 = z1Var5.f50208u0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (q70Var3 != null) {
                    q70Var3.u();
                    z1Var5.f50208u0 = null;
                }
                a Q22 = z1Var5.M.Q2();
                if (Q22 != null) {
                    TL_iv.PageBlock pageBlock = Q22.f49616b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = z1Var5.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                q.U(parentActivity, str, new org.telegram.ui.web.v1(22, z1Var5, pageblockmath), z1Var5.getResourceProvider());
                return;
            case 9:
                z1 z1Var6 = this.f49753b;
                z1Var6.M.Y3 = null;
                z1Var6.o0(90, 0);
                return;
            case 10:
                z1 z1Var7 = this.f49753b;
                z1Var7.r0();
                ti0 ti0Var = z1Var7.L0;
                if (ti0Var != null) {
                    ti0Var.h(true);
                    z1Var7.L0 = null;
                    return;
                }
                return;
            case 11:
                z1 z1Var8 = this.f49753b;
                z1Var8.M.Q4();
                z1Var8.y0();
                return;
            case 12:
                this.f49753b.M.Z3(view);
                return;
            case 13:
                this.f49753b.M.a4();
                return;
            case 14:
                this.f49753b.M.X3();
                return;
            case 15:
                this.f49753b.M.b4();
                return;
            default:
                this.f49753b.n0();
                return;
        }
    }
}
