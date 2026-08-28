package qh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.x60;
import org.telegram.ui.eb0;
public final class r3 implements View.OnClickListener {
    public final int f46650a;
    public final s3 f46651b;
    public final int f46652c;

    public r3(s3 s3Var, int i9, int i10) {
        this.f46650a = i10;
        this.f46651b = s3Var;
        this.f46652c = i9;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        f5 R2;
        i5 o6;
        String str;
        switch (this.f46650a) {
            case 0:
                this.f46651b.f46689a.f46471a.f46606r.Y3(this.f46652c);
                return;
            default:
                final p pVar = this.f46651b.f46689a.f46471a;
                b6 b6Var = pVar.f27492a;
                o3 o3Var = pVar.f46606r;
                a Q2 = o3Var.Q2();
                int i9 = this.f46652c;
                if (i9 != 1) {
                    if (i9 != 2) {
                        TL_iv.pageTableCell pagetablecell = null;
                        r7 = null;
                        TL_iv.pageBlockMath pageblockmath = null;
                        pagetablecell = null;
                        if (i9 != 4) {
                            if (i9 != 7) {
                                if (i9 == 9) {
                                    o3Var.t3();
                                    return;
                                }
                                return;
                            }
                            if (Q2 != null) {
                                TL_iv.PageBlock pageBlock = Q2.f46269b;
                                if (pageBlock instanceof TL_iv.pageBlockMath) {
                                    pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                }
                            }
                            Context context = pVar.getContext();
                            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                str = pageblockmath.source;
                            } else {
                                str = "";
                            }
                            p.T(context, str, new eb0(20, pVar, pageblockmath), b6Var);
                            return;
                        }
                        f5 f5Var = o3Var.f46568e4;
                        if (f5Var == null && (R2 = o3Var.R2()) != null && R2.getModel() != null) {
                            View findFocus = o3Var.findFocus();
                            if ((findFocus instanceof d1) && (o6 = R2.o((d1) findFocus)) != null) {
                                pagetablecell = o6.f46449b;
                            }
                            if (pagetablecell != null) {
                                o3Var.g2(R2);
                                if (R2.D.add(pagetablecell)) {
                                    R2.v.invalidate();
                                    R2.t();
                                }
                                f5Var = R2;
                            }
                        }
                        if (f5Var != null && f5Var.getModel() != null && !f5Var.D.isEmpty()) {
                            o3Var.F4(f5Var);
                            return;
                        } else {
                            o3Var.R1(s5.u(2, 2));
                            return;
                        }
                    }
                    x60 x60Var = pVar.D;
                    if (x60Var != null) {
                        x60Var.u();
                    }
                    final x60 F = x60.F(pVar, b6Var, view);
                    F.Q = true;
                    if (Q2 != null && Q2.b()) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    F.j(z17, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new f(pVar, Q2, 1));
                    if (Q2 != null && Q2.b() && !Q2.a() && !Q2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new f(pVar, Q2, 2));
                    if (Q2 != null && Q2.b() && !Q2.a() && Q2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new f(pVar, Q2, 3));
                    if (Q2 != null && Q2.b() && Q2.a() && !Q2.c()) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new f(pVar, Q2, 4));
                    if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockDetails)) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    F.j(z21, R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(o3Var, 1));
                    boolean m22 = o3Var.m2();
                    boolean p22 = o3Var.p2();
                    if (m22 || p22) {
                        F.k();
                        if (m22) {
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            pVar.f46606r.r3(false);
                                            F.u();
                                            return;
                                        default:
                                            pVar.f46606r.r3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (p22) {
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            pVar.f46606r.r3(false);
                                            F.u();
                                            return;
                                        default:
                                            pVar.f46606r.r3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    pVar.D = F;
                    return;
                }
                int i10 = pVar.f46605n;
                x60 x60Var2 = pVar.D;
                if (x60Var2 != null) {
                    x60Var2.u();
                }
                x60 G = x60.G(pVar, b6Var, view, true);
                G.Q = true;
                x60 J = G.J();
                if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new fh.r3(G, 7), false);
                J.k();
                pVar.O(J, Q2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                pVar.O(J, Q2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                pVar.O(J, Q2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                pVar.O(J, Q2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                pVar.O(J, Q2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                pVar.O(J, Q2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                if (Q2 != null && o3.C3(Q2.f46269b)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                v1 v1Var = new v1(pVar.getContext(), R.drawable.iv_h1);
                v1Var.a(z10);
                G.j(z11, 0, v1Var, LocaleController.getString(R.string.ArticleHeading), new fh.k3(G, J, 10));
                if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockParagraph)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new f(pVar, Q2, 5));
                if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockBlockquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                G.j(z13, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new f(pVar, Q2, 6));
                if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockPullquote)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                v1 v1Var2 = new v1(pVar.getContext(), R.drawable.iv_pullquote);
                v1Var2.a(z10);
                G.j(z14, 0, v1Var2, LocaleController.getString(R.string.ArticlePullquote), new f(pVar, Q2, 7));
                if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockPreformatted)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.j(z15, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new f(pVar, Q2, 8));
                if (Q2 != null && (Q2.f46269b instanceof TL_iv.pageBlockFooter)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                v1 v1Var3 = new v1(pVar.getContext(), R.drawable.iv_footer);
                v1Var3.a(z10);
                G.j(z16, 0, v1Var3, LocaleController.getString(R.string.ArticleFooter), new f(pVar, Q2, 9));
                G.Z();
                pVar.D = G;
                return;
        }
    }
}
