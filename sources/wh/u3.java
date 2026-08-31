package wh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.q70;
public final class u3 implements View.OnClickListener {
    public final int f50070a;
    public final v3 f50071b;
    public final int f50072c;

    public u3(v3 v3Var, int i10, int i11) {
        this.f50070a = i11;
        this.f50071b = v3Var;
        this.f50072c = i10;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
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
        i5 R2;
        l5 o10;
        String str;
        switch (this.f50070a) {
            case 0:
                this.f50071b.f50098a.f49845a.f49929r.Y3(this.f50072c);
                return;
            default:
                final q qVar = this.f50071b.f50098a.f49845a;
                g6 g6Var = qVar.f26545a;
                r3 r3Var = qVar.f49929r;
                a Q2 = r3Var.Q2();
                int i10 = this.f50072c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        TL_iv.pageTableCell pagetablecell = null;
                        r7 = null;
                        TL_iv.pageBlockMath pageblockmath = null;
                        pagetablecell = null;
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 == 9) {
                                    r3Var.t3();
                                    return;
                                }
                                return;
                            }
                            if (Q2 != null) {
                                TL_iv.PageBlock pageBlock = Q2.f49616b;
                                if (pageBlock instanceof TL_iv.pageBlockMath) {
                                    pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                                }
                            }
                            Context context = qVar.getContext();
                            if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                                str = pageblockmath.source;
                            } else {
                                str = "";
                            }
                            q.U(context, str, new org.telegram.ui.web.v1(20, qVar, pageblockmath), g6Var);
                            return;
                        }
                        i5 i5Var = r3Var.f49982f4;
                        if (i5Var == null && (R2 = r3Var.R2()) != null && R2.getModel() != null) {
                            View findFocus = r3Var.findFocus();
                            if ((findFocus instanceof e1) && (o10 = R2.o((e1) findFocus)) != null) {
                                pagetablecell = o10.f49867b;
                            }
                            if (pagetablecell != null) {
                                r3Var.g2(R2);
                                if (R2.E.add(pagetablecell)) {
                                    R2.v.invalidate();
                                    R2.t();
                                }
                                i5Var = R2;
                            }
                        }
                        if (i5Var != null && i5Var.getModel() != null && !i5Var.E.isEmpty()) {
                            r3Var.F4(i5Var);
                            return;
                        } else {
                            r3Var.R1(v5.u(2, 2));
                            return;
                        }
                    }
                    q70 q70Var = qVar.E;
                    if (q70Var != null) {
                        q70Var.u();
                    }
                    final q70 F = q70.F(qVar, g6Var, view);
                    F.Q = true;
                    if (Q2 != null && Q2.b()) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    F.j(z16, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new g(qVar, Q2, 1));
                    if (Q2 != null && Q2.b() && !Q2.a() && !Q2.c()) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    F.j(z17, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new g(qVar, Q2, 2));
                    if (Q2 != null && Q2.b() && !Q2.a() && Q2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new g(qVar, Q2, 3));
                    if (Q2 != null && Q2.b() && Q2.a() && !Q2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new g(qVar, Q2, 4));
                    if (Q2 != null && (Q2.f49616b instanceof TL_iv.pageBlockDetails)) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(r3Var, 1));
                    boolean m22 = r3Var.m2();
                    boolean p22 = r3Var.p2();
                    if (m22 || p22) {
                        F.k();
                        if (m22) {
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            qVar.f49929r.r3(false);
                                            F.u();
                                            return;
                                        default:
                                            qVar.f49929r.r3(true);
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
                                            qVar.f49929r.r3(false);
                                            F.u();
                                            return;
                                        default:
                                            qVar.f49929r.r3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                    }
                    F.U = true;
                    F.Z();
                    qVar.E = F;
                    return;
                }
                int i11 = qVar.f49928n;
                q70 q70Var2 = qVar.E;
                if (q70Var2 != null) {
                    q70Var2.u();
                }
                q70 G = q70.G(qVar, g6Var, view, true);
                G.Q = true;
                q70 J = G.J();
                if (!MessagesController.getInstance(i11).richEditorAllowed() && !UserConfig.getInstance(i11).isPremium()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new lh.g3(G, 7), false);
                J.k();
                qVar.P(J, Q2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                qVar.P(J, Q2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                qVar.P(J, Q2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                qVar.P(J, Q2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                qVar.P(J, Q2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                qVar.P(J, Q2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                if (Q2 != null && r3.C3(Q2.f49616b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x1 x1Var = new x1(qVar.getContext(), R.drawable.iv_h1);
                x1Var.a(z4);
                G.j(z10, 0, x1Var, LocaleController.getString(R.string.ArticleHeading), new lh.y2(G, J, 10));
                if (Q2 != null && (Q2.f49616b instanceof TL_iv.pageBlockParagraph)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                G.j(z11, R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new g(qVar, Q2, 5));
                if (Q2 != null && (Q2.f49616b instanceof TL_iv.pageBlockBlockquote)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new g(qVar, Q2, 6));
                if (Q2 != null && (Q2.f49616b instanceof TL_iv.pageBlockPullquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                x1 x1Var2 = new x1(qVar.getContext(), R.drawable.iv_pullquote);
                x1Var2.a(z4);
                G.j(z13, 0, x1Var2, LocaleController.getString(R.string.ArticlePullquote), new g(qVar, Q2, 7));
                if (Q2 != null && (Q2.f49616b instanceof TL_iv.pageBlockPreformatted)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                G.j(z14, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new g(qVar, Q2, 8));
                if (Q2 != null && (Q2.f49616b instanceof TL_iv.pageBlockFooter)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                x1 x1Var3 = new x1(qVar.getContext(), R.drawable.iv_footer);
                x1Var3.a(z4);
                G.j(z15, 0, x1Var3, LocaleController.getString(R.string.ArticleFooter), new g(qVar, Q2, 9));
                G.Z();
                qVar.E = G;
                return;
        }
    }
}
