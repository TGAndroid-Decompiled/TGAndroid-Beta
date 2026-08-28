package qh;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.eb0;
import org.telegram.ui.li0;
public final class f1 implements View.OnClickListener {
    public final int f46376a;
    public final x1 f46377b;

    public f1(x1 x1Var, int i9) {
        this.f46376a = i9;
        this.f46377b = x1Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        f5 R2;
        i5 o6;
        String str;
        switch (this.f46376a) {
            case 0:
                this.f46377b.q0();
                return;
            case 1:
                x1 x1Var = this.f46377b;
                if (!x1Var.L.F2()) {
                    x1Var.finishFragment();
                    return;
                }
                return;
            case 2:
                b2 b2Var = this.f46377b.L.F3;
                if (b2Var != null) {
                    b2Var.k();
                    return;
                }
                return;
            case 3:
                b2 b2Var2 = this.f46377b.L.F3;
                if (b2Var2 != null) {
                    b2Var2.i();
                    return;
                }
                return;
            case 4:
                x1.T(this.f46377b);
                return;
            case 5:
                x1 x1Var2 = this.f46377b;
                if (x1Var2.f46823x0) {
                    x1Var2.j0(true);
                    d1 P2 = x1Var2.L.P2();
                    if (P2 != null) {
                        P2.r();
                        AndroidUtilities.showKeyboard(P2);
                        return;
                    }
                    return;
                }
                if (x1Var2.f46821w0 == null) {
                    wy wyVar = new wy(x1Var2, true, false, false, x1Var2.getParentActivity(), true, null, x1Var2.K, true, x1Var2.getResourceProvider(), false, false);
                    x1Var2.f46821w0 = wyVar;
                    wyVar.setVisibility(8);
                    wy wyVar2 = x1Var2.f46821w0;
                    wyVar2.f34447t2 = false;
                    wyVar2.setDelegate(new p1(x1Var2));
                    int indexOfChild = x1Var2.K.indexOfChild(x1Var2.W);
                    if (indexOfChild < 0) {
                        indexOfChild = x1Var2.K.getChildCount();
                    }
                    FrameLayout.LayoutParams e10 = e6.e(-1, x1Var2.i0(), 87);
                    e10.bottomMargin = x1Var2.P0;
                    x1Var2.K.addView(x1Var2.f46821w0, indexOfChild, e10);
                }
                int i02 = x1Var2.i0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x1Var2.f46821w0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = e6.e(-1, i02, 87);
                } else {
                    layoutParams.height = i02;
                }
                layoutParams.bottomMargin = x1Var2.P0;
                x1Var2.f46821w0.setLayoutParams(layoutParams);
                x1Var2.f46821w0.setVisibility(0);
                x1Var2.f46823x0 = true;
                x1Var2.f46826z0 = i02 + x1Var2.P0;
                d1 P22 = x1Var2.L.P2();
                if (P22 != null) {
                    AndroidUtilities.hideKeyboard(P22);
                }
                x1Var2.g0();
                x1Var2.X.j(og.d, true);
                return;
            case 6:
                final x1 x1Var3 = this.f46377b;
                x60 x60Var = x1Var3.f46817t0;
                if (x60Var != null) {
                    x60Var.u();
                    x1Var3.f46817t0 = null;
                }
                final x60 H = x60.H(x1Var3, view);
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
                if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i9 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                o3 o3Var = x1Var3.L;
                Objects.requireNonNull(o3Var);
                H.j(z14, i9, null, string, new b(o3Var, 1));
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
                x1Var3.f46817t0 = H;
                return;
            case 7:
                x1 x1Var4 = this.f46377b;
                x60 x60Var2 = x1Var4.f46817t0;
                TL_iv.pageTableCell pagetablecell = null;
                if (x60Var2 != null) {
                    x60Var2.u();
                    x1Var4.f46817t0 = null;
                }
                o3 o3Var2 = x1Var4.L;
                f5 f5Var = o3Var2.f46568e4;
                if (f5Var == null && (R2 = o3Var2.R2()) != null && R2.getModel() != null) {
                    View findFocus = x1Var4.L.findFocus();
                    if ((findFocus instanceof d1) && (o6 = R2.o((d1) findFocus)) != null) {
                        pagetablecell = o6.f46449b;
                    }
                    if (pagetablecell != null) {
                        x1Var4.L.g2(R2);
                        if (R2.D.add(pagetablecell)) {
                            R2.v.invalidate();
                            R2.t();
                        }
                        f5Var = R2;
                    }
                }
                if (f5Var != null && f5Var.getModel() != null && !f5Var.D.isEmpty()) {
                    x1Var4.L.F4(f5Var);
                    return;
                } else {
                    x1Var4.L.R1(s5.u(2, 2));
                    return;
                }
            case 8:
                x1 x1Var5 = this.f46377b;
                x60 x60Var3 = x1Var5.f46817t0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (x60Var3 != null) {
                    x60Var3.u();
                    x1Var5.f46817t0 = null;
                }
                a Q22 = x1Var5.L.Q2();
                if (Q22 != null) {
                    TL_iv.PageBlock pageBlock = Q22.f46269b;
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
                p.T(parentActivity, str, new eb0(22, x1Var5, pageblockmath), x1Var5.getResourceProvider());
                return;
            case 9:
                x1 x1Var6 = this.f46377b;
                x1Var6.L.X3 = null;
                x1Var6.n0(90, 0);
                return;
            case 10:
                x1 x1Var7 = this.f46377b;
                x1Var7.q0();
                li0 li0Var = x1Var7.K0;
                if (li0Var != null) {
                    li0Var.h(true);
                    x1Var7.K0 = null;
                    return;
                }
                return;
            case 11:
                x1 x1Var8 = this.f46377b;
                x1Var8.L.Q4();
                x1Var8.x0();
                return;
            case 12:
                this.f46377b.L.Z3(view);
                return;
            case 13:
                this.f46377b.L.a4();
                return;
            case 14:
                this.f46377b.L.X3();
                return;
            case 15:
                this.f46377b.L.b4();
                return;
            default:
                this.f46377b.m0();
                return;
        }
    }
}
