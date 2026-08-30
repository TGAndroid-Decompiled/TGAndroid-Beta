package vh;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.og;
import org.telegram.ui.si0;
public final class f1 implements View.OnClickListener {
    public final int f45890a;
    public final y1 f45891b;

    public f1(y1 y1Var, int i10) {
        this.f45890a = i10;
        this.f45891b = y1Var;
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
        switch (this.f45890a) {
            case 0:
                this.f45891b.r0();
                return;
            case 1:
                y1 y1Var = this.f45891b;
                if (!y1Var.M.F2()) {
                    y1Var.finishFragment();
                    return;
                }
                return;
            case 2:
                c2 c2Var = this.f45891b.M.G3;
                if (c2Var != null) {
                    c2Var.k();
                    return;
                }
                return;
            case 3:
                c2 c2Var2 = this.f45891b.M.G3;
                if (c2Var2 != null) {
                    c2Var2.i();
                    return;
                }
                return;
            case 4:
                y1.U(this.f45891b);
                return;
            case 5:
                y1 y1Var2 = this.f45891b;
                if (y1Var2.f46322y0) {
                    y1Var2.k0(true);
                    d1 P2 = y1Var2.M.P2();
                    if (P2 != null) {
                        P2.r();
                        AndroidUtilities.showKeyboard(P2);
                        return;
                    }
                    return;
                }
                if (y1Var2.f46320x0 == null) {
                    kz kzVar = new kz(y1Var2, true, false, false, y1Var2.getParentActivity(), true, null, y1Var2.L, true, y1Var2.getResourceProvider(), false, false);
                    y1Var2.f46320x0 = kzVar;
                    kzVar.setVisibility(8);
                    kz kzVar2 = y1Var2.f46320x0;
                    kzVar2.f26475u2 = false;
                    kzVar2.setDelegate(new q1(y1Var2));
                    int indexOfChild = y1Var2.L.indexOfChild(y1Var2.X);
                    if (indexOfChild < 0) {
                        indexOfChild = y1Var2.L.getChildCount();
                    }
                    FrameLayout.LayoutParams e = b6.e(-1, y1Var2.j0(), 87);
                    e.bottomMargin = y1Var2.Q0;
                    y1Var2.L.addView(y1Var2.f46320x0, indexOfChild, e);
                }
                int j02 = y1Var2.j0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1Var2.f46320x0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = b6.e(-1, j02, 87);
                } else {
                    layoutParams.height = j02;
                }
                layoutParams.bottomMargin = y1Var2.Q0;
                y1Var2.f46320x0.setLayoutParams(layoutParams);
                y1Var2.f46320x0.setVisibility(0);
                y1Var2.f46322y0 = true;
                y1Var2.A0 = j02 + y1Var2.Q0;
                d1 P22 = y1Var2.M.P2();
                if (P22 != null) {
                    AndroidUtilities.hideKeyboard(P22);
                }
                y1Var2.h0();
                y1Var2.Y.j(og.d, true);
                return;
            case 6:
                final y1 y1Var3 = this.f45891b;
                o70 o70Var = y1Var3.f46315u0;
                if (o70Var != null) {
                    o70Var.u();
                    y1Var3.f46315u0 = null;
                }
                final o70 H = o70.H(y1Var3, view);
                H.Q = true;
                a Q2 = y1Var3.M.Q2();
                if (Q2 != null && Q2.b()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                H.j(z4, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new i1(y1Var3, Q2, 5));
                if (Q2 != null && Q2.b() && !Q2.a() && !Q2.c()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.j(z10, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new i1(y1Var3, Q2, 6));
                if (Q2 != null && Q2.b() && !Q2.a() && Q2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new i1(y1Var3, Q2, 7));
                if (Q2 != null && Q2.b() && Q2.a() && !Q2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new i1(y1Var3, Q2, 8));
                if (Q2 != null && (Q2.f45775b instanceof TL_iv.pageBlockDetails)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                r3 r3Var = y1Var3.M;
                Objects.requireNonNull(r3Var);
                H.j(z13, i10, null, string, new b(r3Var, 1));
                boolean m22 = y1Var3.M.m2();
                boolean p22 = y1Var3.M.p2();
                if (m22 || p22) {
                    H.k();
                    if (m22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        y1Var3.M.r3(false);
                                        H.u();
                                        return;
                                    default:
                                        y1Var3.M.r3(true);
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
                                        y1Var3.M.r3(false);
                                        H.u();
                                        return;
                                    default:
                                        y1Var3.M.r3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                y1Var3.f46315u0 = H;
                return;
            case 7:
                y1 y1Var4 = this.f45891b;
                o70 o70Var2 = y1Var4.f46315u0;
                TL_iv.pageTableCell pagetablecell = null;
                if (o70Var2 != null) {
                    o70Var2.u();
                    y1Var4.f46315u0 = null;
                }
                r3 r3Var2 = y1Var4.M;
                i5 i5Var = r3Var2.f46115f4;
                if (i5Var == null && (R2 = r3Var2.R2()) != null && R2.getModel() != null) {
                    View findFocus = y1Var4.M.findFocus();
                    if ((findFocus instanceof d1) && (o10 = R2.o((d1) findFocus)) != null) {
                        pagetablecell = o10.f46007b;
                    }
                    if (pagetablecell != null) {
                        y1Var4.M.g2(R2);
                        if (R2.E.add(pagetablecell)) {
                            R2.v.invalidate();
                            R2.t();
                        }
                        i5Var = R2;
                    }
                }
                if (i5Var != null && i5Var.getModel() != null && !i5Var.E.isEmpty()) {
                    y1Var4.M.F4(i5Var);
                    return;
                } else {
                    y1Var4.M.R1(v5.u(2, 2));
                    return;
                }
            case 8:
                y1 y1Var5 = this.f45891b;
                o70 o70Var3 = y1Var5.f46315u0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (o70Var3 != null) {
                    o70Var3.u();
                    y1Var5.f46315u0 = null;
                }
                a Q22 = y1Var5.M.Q2();
                if (Q22 != null) {
                    TL_iv.PageBlock pageBlock = Q22.f45775b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = y1Var5.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                p.U(parentActivity, str, new org.telegram.ui.web.u1(22, y1Var5, pageblockmath), y1Var5.getResourceProvider());
                return;
            case 9:
                y1 y1Var6 = this.f45891b;
                y1Var6.M.Y3 = null;
                y1Var6.o0(90, 0);
                return;
            case 10:
                y1 y1Var7 = this.f45891b;
                y1Var7.r0();
                si0 si0Var = y1Var7.L0;
                if (si0Var != null) {
                    si0Var.h(true);
                    y1Var7.L0 = null;
                    return;
                }
                return;
            case 11:
                y1 y1Var8 = this.f45891b;
                y1Var8.M.Q4();
                y1Var8.y0();
                return;
            case 12:
                this.f45891b.M.Z3(view);
                return;
            case 13:
                this.f45891b.M.a4();
                return;
            case 14:
                this.f45891b.M.X3();
                return;
            case 15:
                this.f45891b.M.b4();
                return;
            default:
                this.f45891b.n0();
                return;
        }
    }
}
