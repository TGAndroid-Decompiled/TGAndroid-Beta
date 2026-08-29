package th;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.rg;
import org.telegram.ui.ki0;
import org.telegram.ui.yu0;
public final class f1 implements View.OnClickListener {
    public final int f48435a;
    public final x1 f48436b;

    public f1(x1 x1Var, int i10) {
        this.f48435a = i10;
        this.f48436b = x1Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        g5 R2;
        j5 o10;
        String str;
        switch (this.f48435a) {
            case 0:
                this.f48436b.r0();
                return;
            case 1:
                x1 x1Var = this.f48436b;
                if (!x1Var.L.F2()) {
                    x1Var.finishFragment();
                    return;
                }
                return;
            case 2:
                b2 b2Var = this.f48436b.L.F3;
                if (b2Var != null) {
                    b2Var.k();
                    return;
                }
                return;
            case 3:
                b2 b2Var2 = this.f48436b.L.F3;
                if (b2Var2 != null) {
                    b2Var2.i();
                    return;
                }
                return;
            case 4:
                x1.U(this.f48436b);
                return;
            case 5:
                x1 x1Var2 = this.f48436b;
                if (x1Var2.f48877x0) {
                    x1Var2.k0(true);
                    d1 P2 = x1Var2.L.P2();
                    if (P2 != null) {
                        P2.r();
                        AndroidUtilities.showKeyboard(P2);
                        return;
                    }
                    return;
                }
                if (x1Var2.f48875w0 == null) {
                    fz fzVar = new fz(x1Var2, true, false, false, x1Var2.getParentActivity(), true, null, x1Var2.K, true, x1Var2.getResourceProvider(), false, false);
                    x1Var2.f48875w0 = fzVar;
                    fzVar.setVisibility(8);
                    fz fzVar2 = x1Var2.f48875w0;
                    fzVar2.f28638t2 = false;
                    fzVar2.setDelegate(new p1(x1Var2));
                    int indexOfChild = x1Var2.K.indexOfChild(x1Var2.W);
                    if (indexOfChild < 0) {
                        indexOfChild = x1Var2.K.getChildCount();
                    }
                    FrameLayout.LayoutParams e10 = f6.e(-1, x1Var2.j0(), 87);
                    e10.bottomMargin = x1Var2.P0;
                    x1Var2.K.addView(x1Var2.f48875w0, indexOfChild, e10);
                }
                int j02 = x1Var2.j0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x1Var2.f48875w0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = f6.e(-1, j02, 87);
                } else {
                    layoutParams.height = j02;
                }
                layoutParams.bottomMargin = x1Var2.P0;
                x1Var2.f48875w0.setLayoutParams(layoutParams);
                x1Var2.f48875w0.setVisibility(0);
                x1Var2.f48877x0 = true;
                x1Var2.f48880z0 = j02 + x1Var2.P0;
                d1 P22 = x1Var2.L.P2();
                if (P22 != null) {
                    AndroidUtilities.hideKeyboard(P22);
                }
                x1Var2.h0();
                x1Var2.X.j(rg.d, true);
                return;
            case 6:
                final x1 x1Var3 = this.f48436b;
                j70 j70Var = x1Var3.f48871t0;
                if (j70Var != null) {
                    j70Var.u();
                    x1Var3.f48871t0 = null;
                }
                final j70 H = j70.H(x1Var3, view);
                H.Q = true;
                a Q2 = x1Var3.L.Q2();
                if (Q2 != null && Q2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new i1(x1Var3, Q2, 5));
                if (Q2 != null && Q2.b() && !Q2.a() && !Q2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new i1(x1Var3, Q2, 6));
                if (Q2 != null && Q2.b() && !Q2.a() && Q2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new i1(x1Var3, Q2, 7));
                if (Q2 != null && Q2.b() && Q2.a() && !Q2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new i1(x1Var3, Q2, 8));
                if (Q2 != null && (Q2.f48328b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                p3 p3Var = x1Var3.L;
                Objects.requireNonNull(p3Var);
                H.j(z14, i10, null, string, new b(p3Var, 1));
                boolean m22 = x1Var3.L.m2();
                boolean p22 = x1Var3.L.p2();
                if (m22 || p22) {
                    H.k();
                    if (m22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        x1Var3.L.r3(false);
                                        H.u();
                                        return;
                                    default:
                                        x1Var3.L.r3(true);
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
                                        x1Var3.L.r3(false);
                                        H.u();
                                        return;
                                    default:
                                        x1Var3.L.r3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                x1Var3.f48871t0 = H;
                return;
            case 7:
                x1 x1Var4 = this.f48436b;
                j70 j70Var2 = x1Var4.f48871t0;
                TL_iv.pageTableCell pagetablecell = null;
                if (j70Var2 != null) {
                    j70Var2.u();
                    x1Var4.f48871t0 = null;
                }
                p3 p3Var2 = x1Var4.L;
                g5 g5Var = p3Var2.f48641e4;
                if (g5Var == null && (R2 = p3Var2.R2()) != null && R2.getModel() != null) {
                    View findFocus = x1Var4.L.findFocus();
                    if ((findFocus instanceof d1) && (o10 = R2.o((d1) findFocus)) != null) {
                        pagetablecell = o10.f48527b;
                    }
                    if (pagetablecell != null) {
                        x1Var4.L.g2(R2);
                        if (R2.D.add(pagetablecell)) {
                            R2.v.invalidate();
                            R2.t();
                        }
                        g5Var = R2;
                    }
                }
                if (g5Var != null && g5Var.getModel() != null && !g5Var.D.isEmpty()) {
                    x1Var4.L.F4(g5Var);
                    return;
                } else {
                    x1Var4.L.R1(t5.u(2, 2));
                    return;
                }
            case 8:
                x1 x1Var5 = this.f48436b;
                j70 j70Var3 = x1Var5.f48871t0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (j70Var3 != null) {
                    j70Var3.u();
                    x1Var5.f48871t0 = null;
                }
                a Q22 = x1Var5.L.Q2();
                if (Q22 != null) {
                    TL_iv.PageBlock pageBlock = Q22.f48328b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = x1Var5.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                p.U(parentActivity, str, new yu0(22, x1Var5, pageblockmath), x1Var5.getResourceProvider());
                return;
            case 9:
                x1 x1Var6 = this.f48436b;
                x1Var6.L.X3 = null;
                x1Var6.o0(90, 0);
                return;
            case 10:
                x1 x1Var7 = this.f48436b;
                x1Var7.r0();
                ki0 ki0Var = x1Var7.K0;
                if (ki0Var != null) {
                    ki0Var.h(true);
                    x1Var7.K0 = null;
                    return;
                }
                return;
            case 11:
                x1 x1Var8 = this.f48436b;
                x1Var8.L.Q4();
                x1Var8.y0();
                return;
            case 12:
                this.f48436b.L.Z3(view);
                return;
            case 13:
                this.f48436b.L.a4();
                return;
            case 14:
                this.f48436b.L.X3();
                return;
            case 15:
                this.f48436b.L.b4();
                return;
            default:
                this.f48436b.n0();
                return;
        }
    }
}
