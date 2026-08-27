package rh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b70;
import org.telegram.ui.ib0;

public final class s3 implements View.OnClickListener {

    public final int f47435a;

    public final t3 f47436b;

    public final int f47437c;

    public s3(t3 t3Var, int i10, int i11) {
        this.f47435a = i11;
        this.f47436b = t3Var;
        this.f47437c = i10;
    }

    @Override
    public final void onClick(View view) {
        g5 g5VarR2;
        j5 j5VarO;
        switch (this.f47435a) {
            case 0:
                this.f47436b.f47467a.f47228a.f47324r.Y3(this.f47437c);
                break;
            default:
                final p pVar = this.f47436b.f47467a.f47228a;
                c6 c6Var = pVar.f34899a;
                p3 p3Var = pVar.f47324r;
                a aVarQ2 = p3Var.Q2();
                int i10 = this.f47437c;
                if (i10 == 1) {
                    int i11 = pVar.f47323n;
                    b70 b70Var = pVar.D;
                    if (b70Var != null) {
                        b70Var.u();
                    }
                    b70 b70VarG = b70.G(pVar, c6Var, view, true);
                    b70VarG.Q = true;
                    b70 b70VarJ = b70VarG.J();
                    boolean z10 = (MessagesController.getInstance(i11).richEditorAllowed() || UserConfig.getInstance(i11).isPremium()) ? false : true;
                    b70VarJ.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new gh.m3(b70VarG, 7), false);
                    b70VarJ.k();
                    pVar.P(b70VarJ, aVarQ2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, b70VarG);
                    pVar.P(b70VarJ, aVarQ2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, b70VarG);
                    pVar.P(b70VarJ, aVarQ2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, b70VarG);
                    pVar.P(b70VarJ, aVarQ2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, b70VarG);
                    pVar.P(b70VarJ, aVarQ2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, b70VarG);
                    pVar.P(b70VarJ, aVarQ2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, b70VarG);
                    boolean z11 = aVarQ2 != null && p3.C3(aVarQ2.f47028b);
                    v1 v1Var = new v1(pVar.getContext(), R.drawable.iv_h1);
                    v1Var.a(z10);
                    b70VarG.j(z11, 0, v1Var, LocaleController.getString(R.string.ArticleHeading), new gh.f3(b70VarG, b70VarJ, 10));
                    b70VarG.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(pVar, aVarQ2, 5));
                    b70VarG.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(pVar, aVarQ2, 6));
                    boolean z12 = aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockPullquote);
                    v1 v1Var2 = new v1(pVar.getContext(), R.drawable.iv_pullquote);
                    v1Var2.a(z10);
                    b70VarG.j(z12, 0, v1Var2, LocaleController.getString(R.string.ArticlePullquote), new f(pVar, aVarQ2, 7));
                    b70VarG.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(pVar, aVarQ2, 8));
                    boolean z13 = aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockFooter);
                    v1 v1Var3 = new v1(pVar.getContext(), R.drawable.iv_footer);
                    v1Var3.a(z10);
                    b70VarG.j(z13, 0, v1Var3, LocaleController.getString(R.string.ArticleFooter), new f(pVar, aVarQ2, 9));
                    b70VarG.Z();
                    pVar.D = b70VarG;
                    break;
                } else if (i10 == 2) {
                    b70 b70Var2 = pVar.D;
                    if (b70Var2 != null) {
                        b70Var2.u();
                    }
                    final b70 b70VarF = b70.F(pVar, c6Var, view);
                    b70VarF.Q = true;
                    b70VarF.j(aVarQ2 == null || !aVarQ2.b(), R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(pVar, aVarQ2, 1));
                    b70VarF.j((aVarQ2 == null || !aVarQ2.b() || aVarQ2.a() || aVarQ2.c()) ? false : true, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(pVar, aVarQ2, 2));
                    b70VarF.j(aVarQ2 != null && aVarQ2.b() && !aVarQ2.a() && aVarQ2.c(), R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(pVar, aVarQ2, 3));
                    b70VarF.j(aVarQ2 != null && aVarQ2.b() && aVarQ2.a() && !aVarQ2.c(), R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(pVar, aVarQ2, 4));
                    b70VarF.j(aVarQ2 != null && (aVarQ2.f47028b instanceof TL_iv.pageBlockDetails), R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(p3Var, 1));
                    boolean zM2 = p3Var.m2();
                    boolean zP2 = p3Var.p2();
                    if (zM2 || zP2) {
                        b70VarF.k();
                        if (zM2) {
                            final int i12 = 0;
                            b70VarF.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            pVar.f47324r.r3(false);
                                            b70VarF.u();
                                            break;
                                        default:
                                            pVar.f47324r.r3(true);
                                            b70VarF.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (zP2) {
                            final int i13 = 1;
                            b70VarF.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            pVar.f47324r.r3(false);
                                            b70VarF.u();
                                            break;
                                        default:
                                            pVar.f47324r.r3(true);
                                            b70VarF.u();
                                            break;
                                    }
                                }
                            }, false);
                        }
                    }
                    b70VarF.U = true;
                    b70VarF.Z();
                    pVar.D = b70VarF;
                    break;
                } else {
                    TL_iv.pageTableCell pagetablecell = null;
                    pageblockmath = null;
                    TL_iv.pageBlockMath pageblockmath = null;
                    pagetablecell = null;
                    if (i10 == 4) {
                        g5 g5Var = p3Var.f47343e4;
                        if (g5Var == null && (g5VarR2 = p3Var.R2()) != null && g5VarR2.getModel() != null) {
                            View viewFindFocus = p3Var.findFocus();
                            if ((viewFindFocus instanceof d1) && (j5VarO = g5VarR2.o((d1) viewFindFocus)) != null) {
                                pagetablecell = j5VarO.f47227b;
                            }
                            if (pagetablecell != null) {
                                p3Var.g2(g5VarR2);
                                if (g5VarR2.D.add(pagetablecell)) {
                                    g5VarR2.v.invalidate();
                                    g5VarR2.t();
                                }
                                g5Var = g5VarR2;
                            }
                        }
                        if (g5Var == null || g5Var.getModel() == null || g5Var.D.isEmpty()) {
                            p3Var.R1(t5.u(2, 2));
                        } else {
                            p3Var.F4(g5Var);
                        }
                        break;
                    } else if (i10 == 7) {
                        if (aVarQ2 != null) {
                            TL_iv.PageBlock pageBlock = aVarQ2.f47028b;
                            if (pageBlock instanceof TL_iv.pageBlockMath) {
                                pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                            }
                        }
                        p.U(pVar.getContext(), (pageblockmath == null || TextUtils.isEmpty(pageblockmath.source)) ? "" : pageblockmath.source, new ib0(20, pVar, pageblockmath), c6Var);
                        break;
                    } else if (i10 == 9) {
                        p3Var.t3();
                        break;
                    }
                }
                break;
        }
    }
}
