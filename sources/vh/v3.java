package vh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.p70;
public final class v3 implements View.OnClickListener {
    public final int f46300a;
    public final w3 f46301b;
    public final int f46302c;

    public v3(w3 w3Var, int i10, int i11) {
        this.f46300a = i11;
        this.f46301b = w3Var;
        this.f46302c = i10;
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
        j5 Q2;
        m5 o10;
        String str;
        switch (this.f46300a) {
            case 0:
                this.f46301b.f46328a.f46058a.f46156r.X3(this.f46302c);
                return;
            default:
                final q qVar = this.f46301b.f46328a.f46058a;
                f6 f6Var = qVar.f24281a;
                s3 s3Var = qVar.f46156r;
                a P2 = s3Var.P2();
                int i10 = this.f46302c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        TL_iv.pageTableCell pagetablecell = null;
                        r7 = null;
                        TL_iv.pageBlockMath pageblockmath = null;
                        pagetablecell = null;
                        if (i10 != 4) {
                            if (i10 != 7) {
                                if (i10 == 9) {
                                    s3Var.s3();
                                    return;
                                }
                                return;
                            }
                            if (P2 != null) {
                                TL_iv.PageBlock pageBlock = P2.f45853b;
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
                            q.U(context, str, new ph.s1(18, qVar, pageblockmath), f6Var);
                            return;
                        }
                        j5 j5Var = s3Var.f46212f4;
                        if (j5Var == null && (Q2 = s3Var.Q2()) != null && Q2.getModel() != null) {
                            View findFocus = s3Var.findFocus();
                            if ((findFocus instanceof e1) && (o10 = Q2.o((e1) findFocus)) != null) {
                                pagetablecell = o10.f46104b;
                            }
                            if (pagetablecell != null) {
                                s3Var.f2(Q2);
                                if (Q2.E.add(pagetablecell)) {
                                    Q2.v.invalidate();
                                    Q2.t();
                                }
                                j5Var = Q2;
                            }
                        }
                        if (j5Var != null && j5Var.getModel() != null && !j5Var.E.isEmpty()) {
                            s3Var.E4(j5Var);
                            return;
                        } else {
                            s3Var.Q1(w5.u(2, 2));
                            return;
                        }
                    }
                    p70 p70Var = qVar.E;
                    if (p70Var != null) {
                        p70Var.u();
                    }
                    final p70 F = p70.F(qVar, f6Var, view);
                    F.Q = true;
                    if (P2 != null && P2.b()) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    F.j(z16, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new g(qVar, P2, 1));
                    if (P2 != null && P2.b() && !P2.a() && !P2.c()) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    F.j(z17, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulleted), new g(qVar, P2, 2));
                    if (P2 != null && P2.b() && !P2.a() && P2.c()) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    F.j(z18, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumbered), new g(qVar, P2, 3));
                    if (P2 != null && P2.b() && P2.a() && !P2.c()) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    F.j(z19, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListTodo), new g(qVar, P2, 4));
                    if (P2 != null && (P2.f45853b instanceof TL_iv.pageBlockDetails)) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    F.j(z20, R.drawable.iv_details, null, LocaleController.getString(R.string.ArticleToggleBlock), new b(s3Var, 1));
                    boolean l22 = s3Var.l2();
                    boolean o22 = s3Var.o2();
                    if (l22 || o22) {
                        F.k();
                        if (l22) {
                            F.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            qVar.f46156r.q3(false);
                                            F.u();
                                            return;
                                        default:
                                            qVar.f46156r.q3(true);
                                            F.u();
                                            return;
                                    }
                                }
                            }, false);
                        }
                        if (o22) {
                            F.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            qVar.f46156r.q3(false);
                                            F.u();
                                            return;
                                        default:
                                            qVar.f46156r.q3(true);
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
                int i11 = qVar.f46155n;
                p70 p70Var2 = qVar.E;
                if (p70Var2 != null) {
                    p70Var2.u();
                }
                p70 G = p70.G(qVar, f6Var, view, true);
                G.Q = true;
                p70 J = G.J();
                if (!MessagesController.getInstance(i11).richEditorAllowed() && !UserConfig.getInstance(i11).isPremium()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new kh.f3(G, 7), false);
                J.k();
                qVar.P(J, P2, new TL_iv.pageBlockHeading1(), R.drawable.iv_h1, LocaleController.getString(R.string.ArticleHeading1), SharedConfig.fontSize + 2, G);
                qVar.P(J, P2, new TL_iv.pageBlockHeading2(), R.drawable.iv_h2, LocaleController.getString(R.string.ArticleHeading2), SharedConfig.fontSize + 1, G);
                qVar.P(J, P2, new TL_iv.pageBlockHeading3(), R.drawable.iv_h3, LocaleController.getString(R.string.ArticleHeading3), SharedConfig.fontSize, G);
                qVar.P(J, P2, new TL_iv.pageBlockHeading4(), R.drawable.iv_h4, LocaleController.getString(R.string.ArticleHeading4), SharedConfig.fontSize - 1, G);
                qVar.P(J, P2, new TL_iv.pageBlockHeading5(), R.drawable.iv_h5, LocaleController.getString(R.string.ArticleHeading5), SharedConfig.fontSize - 2, G);
                qVar.P(J, P2, new TL_iv.pageBlockHeading6(), R.drawable.iv_h6, LocaleController.getString(R.string.ArticleHeading6), SharedConfig.fontSize - 3, G);
                if (P2 != null && s3.B3(P2.f45853b)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w1 w1Var = new w1(qVar.getContext(), R.drawable.iv_h1);
                w1Var.a(z4);
                G.j(z10, 0, w1Var, LocaleController.getString(R.string.ArticleHeading), new kh.y2(G, J, 10));
                if (P2 != null && (P2.f45853b instanceof TL_iv.pageBlockParagraph)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                G.j(z11, R.drawable.iv_text, null, LocaleController.getString(R.string.ArticleText), new g(qVar, P2, 5));
                if (P2 != null && (P2.f45853b instanceof TL_iv.pageBlockBlockquote)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.j(z12, R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new g(qVar, P2, 6));
                if (P2 != null && (P2.f45853b instanceof TL_iv.pageBlockPullquote)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                w1 w1Var2 = new w1(qVar.getContext(), R.drawable.iv_pullquote);
                w1Var2.a(z4);
                G.j(z13, 0, w1Var2, LocaleController.getString(R.string.ArticlePullquote), new g(qVar, P2, 7));
                if (P2 != null && (P2.f45853b instanceof TL_iv.pageBlockPreformatted)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                G.j(z14, R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new g(qVar, P2, 8));
                if (P2 != null && (P2.f45853b instanceof TL_iv.pageBlockFooter)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                w1 w1Var3 = new w1(qVar.getContext(), R.drawable.iv_footer);
                w1Var3.a(z4);
                G.j(z15, 0, w1Var3, LocaleController.getString(R.string.ArticleFooter), new g(qVar, P2, 9));
                G.Z();
                qVar.E = G;
                return;
        }
    }
}
