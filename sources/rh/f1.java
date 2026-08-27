package rh;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.yy;
import org.telegram.ui.ib0;
import org.telegram.ui.ni0;

public final class f1 implements View.OnClickListener {

    public final int f47135a;

    public final x1 f47136b;

    public f1(x1 x1Var, int i10) {
        this.f47135a = i10;
        this.f47136b = x1Var;
    }

    @Override
    public final void onClick(View view) {
        g5 g5VarR2;
        j5 j5VarO;
        switch (this.f47135a) {
            case 0:
                this.f47136b.r0();
                break;
            case 1:
                x1 x1Var = this.f47136b;
                if (!x1Var.L.F2()) {
                    x1Var.finishFragment();
                }
                break;
            case 2:
                b2 b2Var = this.f47136b.L.F3;
                if (b2Var != null) {
                    b2Var.k();
                }
                break;
            case 3:
                b2 b2Var2 = this.f47136b.L.F3;
                if (b2Var2 != null) {
                    b2Var2.i();
                }
                break;
            case 4:
                x1.U(this.f47136b);
                break;
            case 5:
                x1 x1Var2 = this.f47136b;
                if (!x1Var2.f47579x0) {
                    if (x1Var2.f47577w0 == null) {
                        yy yyVar = new yy(x1Var2, true, false, false, x1Var2.getParentActivity(), true, null, x1Var2.K, true, x1Var2.getResourceProvider(), false, false);
                        x1Var2.f47577w0 = yyVar;
                        yyVar.setVisibility(8);
                        yy yyVar2 = x1Var2.f47577w0;
                        yyVar2.f35040t2 = false;
                        yyVar2.setDelegate(new p1(x1Var2));
                        int iIndexOfChild = x1Var2.K.indexOfChild(x1Var2.W);
                        if (iIndexOfChild < 0) {
                            iIndexOfChild = x1Var2.K.getChildCount();
                        }
                        FrameLayout.LayoutParams layoutParamsE = z5.e(-1, x1Var2.j0(), 87);
                        layoutParamsE.bottomMargin = x1Var2.P0;
                        x1Var2.K.addView(x1Var2.f47577w0, iIndexOfChild, layoutParamsE);
                    }
                    int iJ0 = x1Var2.j0();
                    FrameLayout.LayoutParams layoutParamsE2 = (FrameLayout.LayoutParams) x1Var2.f47577w0.getLayoutParams();
                    if (layoutParamsE2 == null) {
                        layoutParamsE2 = z5.e(-1, iJ0, 87);
                    } else {
                        layoutParamsE2.height = iJ0;
                    }
                    layoutParamsE2.bottomMargin = x1Var2.P0;
                    x1Var2.f47577w0.setLayoutParams(layoutParamsE2);
                    x1Var2.f47577w0.setVisibility(0);
                    x1Var2.f47579x0 = true;
                    x1Var2.f47582z0 = iJ0 + x1Var2.P0;
                    d1 d1VarP2 = x1Var2.L.P2();
                    if (d1VarP2 != null) {
                        AndroidUtilities.hideKeyboard(d1VarP2);
                    }
                    x1Var2.h0();
                    x1Var2.X.j(kg.d, true);
                } else {
                    x1Var2.k0(true);
                    d1 d1VarP3 = x1Var2.L.P2();
                    if (d1VarP3 != null) {
                        d1VarP3.r();
                        AndroidUtilities.showKeyboard(d1VarP3);
                    }
                }
                break;
            case 6:
                final x1 x1Var3 = this.f47136b;
                b70 b70Var = x1Var3.f47573t0;
                if (b70Var != null) {
                    b70Var.u();
                    x1Var3.f47573t0 = null;
                }
                final b70 b70VarH = b70.H(x1Var3, view);
                b70VarH.Q = true;
                a aVarQ2 = x1Var3.L.Q2();
                b70VarH.j(aVarQ2 == null || !aVarQ2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new i1(x1Var3, aVarQ2, 5));
                b70VarH.j((aVarQ2 == null || !aVarQ2.b() || aVarQ2.a() || aVarQ2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new i1(x1Var3, aVarQ2, 6));
                b70VarH.j(aVarQ2 != null && aVarQ2.b() && !aVarQ2.a() && aVarQ2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new i1(x1Var3, aVarQ2, 7));
                b70VarH.j(aVarQ2 != null && aVarQ2.b() && aVarQ2.a() && !aVarQ2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new i1(x1Var3, aVarQ2, 8));
                boolean z10 = aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockDetails);
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                p3 p3Var = x1Var3.L;
                Objects.requireNonNull(p3Var);
                b70VarH.j(z10, i10, null, string, new b(p3Var, 1));
                boolean zM2 = x1Var3.L.m2();
                boolean zP2 = x1Var3.L.p2();
                if (zM2 || zP2) {
                    b70VarH.k();
                    if (zM2) {
                        final int i11 = 0;
                        b70VarH.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        x1Var3.L.r3(false);
                                        b70VarH.u();
                                        break;
                                    default:
                                        x1Var3.L.r3(true);
                                        b70VarH.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                    if (zP2) {
                        final int i12 = 1;
                        b70VarH.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        x1Var3.L.r3(false);
                                        b70VarH.u();
                                        break;
                                    default:
                                        x1Var3.L.r3(true);
                                        b70VarH.u();
                                        break;
                                }
                            }
                        }, false);
                    }
                }
                b70VarH.U = true;
                b70VarH.Z();
                x1Var3.f47573t0 = b70VarH;
                break;
            case 7:
                x1 x1Var4 = this.f47136b;
                b70 b70Var2 = x1Var4.f47573t0;
                TL_iv.pageTableCell pagetablecell = null;
                if (b70Var2 != null) {
                    b70Var2.u();
                    x1Var4.f47573t0 = null;
                }
                p3 p3Var2 = x1Var4.L;
                g5 g5Var = p3Var2.f47343e4;
                if (g5Var == null && (g5VarR2 = p3Var2.R2()) != null && g5VarR2.getModel() != null) {
                    View viewFindFocus = x1Var4.L.findFocus();
                    if ((viewFindFocus instanceof d1) && (j5VarO = g5VarR2.o((d1) viewFindFocus)) != null) {
                        pagetablecell = j5VarO.f47227b;
                    }
                    if (pagetablecell != null) {
                        x1Var4.L.g2(g5VarR2);
                        if (g5VarR2.D.add(pagetablecell)) {
                            g5VarR2.v.invalidate();
                            g5VarR2.t();
                        }
                        g5Var = g5VarR2;
                    }
                }
                if (g5Var == null || g5Var.getModel() == null || g5Var.D.isEmpty()) {
                    x1Var4.L.R1(t5.u(2, 2));
                } else {
                    x1Var4.L.F4(g5Var);
                }
                break;
            case 8:
                x1 x1Var5 = this.f47136b;
                b70 b70Var3 = x1Var5.f47573t0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (b70Var3 != null) {
                    b70Var3.u();
                    x1Var5.f47573t0 = null;
                }
                a aVarQ3 = x1Var5.L.Q2();
                if (aVarQ3 != null) {
                    TL_iv.PageBlock pageBlock = aVarQ3.f47028b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                p.U(x1Var5.getParentActivity(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ib0(22, x1Var5, pageblockmath), x1Var5.getResourceProvider());
                break;
            case 9:
                x1 x1Var6 = this.f47136b;
                x1Var6.L.X3 = null;
                x1Var6.o0(90, 0);
                break;
            case 10:
                x1 x1Var7 = this.f47136b;
                x1Var7.r0();
                ni0 ni0Var = x1Var7.K0;
                if (ni0Var != null) {
                    ni0Var.h(true);
                    x1Var7.K0 = null;
                }
                break;
            case 11:
                x1 x1Var8 = this.f47136b;
                x1Var8.L.Q4();
                x1Var8.y0();
                break;
            case 12:
                this.f47136b.L.Z3(view);
                break;
            case 13:
                this.f47136b.L.a4();
                break;
            case 14:
                this.f47136b.L.X3();
                break;
            case 15:
                this.f47136b.L.b4();
                break;
            default:
                this.f47136b.n0();
                break;
        }
    }
}
