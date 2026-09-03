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
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.p70;
import org.telegram.ui.ui0;
public final class g1 implements View.OnClickListener {
    public final int f45987a;
    public final y1 f45988b;

    public g1(y1 y1Var, int i10) {
        this.f45987a = i10;
        this.f45988b = y1Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        j5 Q2;
        m5 o10;
        String str;
        switch (this.f45987a) {
            case 0:
                this.f45988b.r0();
                return;
            case 1:
                y1 y1Var = this.f45988b;
                if (!y1Var.M.E2()) {
                    y1Var.finishFragment();
                    return;
                }
                return;
            case 2:
                d2 d2Var = this.f45988b.M.G3;
                if (d2Var != null) {
                    d2Var.k();
                    return;
                }
                return;
            case 3:
                d2 d2Var2 = this.f45988b.M.G3;
                if (d2Var2 != null) {
                    d2Var2.i();
                    return;
                }
                return;
            case 4:
                y1.U(this.f45988b);
                return;
            case 5:
                y1 y1Var2 = this.f45988b;
                if (y1Var2.f46407y0) {
                    y1Var2.k0(true);
                    e1 O2 = y1Var2.M.O2();
                    if (O2 != null) {
                        O2.r();
                        AndroidUtilities.showKeyboard(O2);
                        return;
                    }
                    return;
                }
                if (y1Var2.f46405x0 == null) {
                    kz kzVar = new kz(y1Var2, true, false, false, y1Var2.getParentActivity(), true, null, y1Var2.L, true, y1Var2.getResourceProvider(), false, false);
                    y1Var2.f46405x0 = kzVar;
                    kzVar.setVisibility(8);
                    kz kzVar2 = y1Var2.f46405x0;
                    kzVar2.f26487u2 = false;
                    kzVar2.setDelegate(new q1(y1Var2));
                    int indexOfChild = y1Var2.L.indexOfChild(y1Var2.X);
                    if (indexOfChild < 0) {
                        indexOfChild = y1Var2.L.getChildCount();
                    }
                    FrameLayout.LayoutParams e = b6.e(-1, y1Var2.j0(), 87);
                    e.bottomMargin = y1Var2.Q0;
                    y1Var2.L.addView(y1Var2.f46405x0, indexOfChild, e);
                }
                int j02 = y1Var2.j0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1Var2.f46405x0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = b6.e(-1, j02, 87);
                } else {
                    layoutParams.height = j02;
                }
                layoutParams.bottomMargin = y1Var2.Q0;
                y1Var2.f46405x0.setLayoutParams(layoutParams);
                y1Var2.f46405x0.setVisibility(0);
                y1Var2.f46407y0 = true;
                y1Var2.A0 = j02 + y1Var2.Q0;
                e1 O22 = y1Var2.M.O2();
                if (O22 != null) {
                    AndroidUtilities.hideKeyboard(O22);
                }
                y1Var2.h0();
                y1Var2.Y.j(og.d, true);
                return;
            case 6:
                final y1 y1Var3 = this.f45988b;
                p70 p70Var = y1Var3.f46400u0;
                if (p70Var != null) {
                    p70Var.u();
                    y1Var3.f46400u0 = null;
                }
                final p70 H = p70.H(y1Var3, view);
                H.Q = true;
                a P2 = y1Var3.M.P2();
                if (P2 != null && P2.b()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                H.j(z4, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new j1(y1Var3, P2, 5));
                if (P2 != null && P2.b() && !P2.a() && !P2.c()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.j(z10, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new j1(y1Var3, P2, 6));
                if (P2 != null && P2.b() && !P2.a() && P2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new j1(y1Var3, P2, 7));
                if (P2 != null && P2.b() && P2.a() && !P2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new j1(y1Var3, P2, 8));
                if (P2 != null && (P2.f45853b instanceof TL_iv.pageBlockDetails)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                s3 s3Var = y1Var3.M;
                Objects.requireNonNull(s3Var);
                H.j(z13, i10, null, string, new b(s3Var, 1));
                boolean l22 = y1Var3.M.l2();
                boolean o22 = y1Var3.M.o2();
                if (l22 || o22) {
                    H.k();
                    if (l22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        y1Var3.M.q3(false);
                                        H.u();
                                        return;
                                    default:
                                        y1Var3.M.q3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (o22) {
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        y1Var3.M.q3(false);
                                        H.u();
                                        return;
                                    default:
                                        y1Var3.M.q3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                y1Var3.f46400u0 = H;
                return;
            case 7:
                y1 y1Var4 = this.f45988b;
                p70 p70Var2 = y1Var4.f46400u0;
                TL_iv.pageTableCell pagetablecell = null;
                if (p70Var2 != null) {
                    p70Var2.u();
                    y1Var4.f46400u0 = null;
                }
                s3 s3Var2 = y1Var4.M;
                j5 j5Var = s3Var2.f46212f4;
                if (j5Var == null && (Q2 = s3Var2.Q2()) != null && Q2.getModel() != null) {
                    View findFocus = y1Var4.M.findFocus();
                    if ((findFocus instanceof e1) && (o10 = Q2.o((e1) findFocus)) != null) {
                        pagetablecell = o10.f46104b;
                    }
                    if (pagetablecell != null) {
                        y1Var4.M.f2(Q2);
                        if (Q2.E.add(pagetablecell)) {
                            Q2.v.invalidate();
                            Q2.t();
                        }
                        j5Var = Q2;
                    }
                }
                if (j5Var != null && j5Var.getModel() != null && !j5Var.E.isEmpty()) {
                    y1Var4.M.E4(j5Var);
                    return;
                } else {
                    y1Var4.M.Q1(w5.u(2, 2));
                    return;
                }
            case 8:
                y1 y1Var5 = this.f45988b;
                p70 p70Var3 = y1Var5.f46400u0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (p70Var3 != null) {
                    p70Var3.u();
                    y1Var5.f46400u0 = null;
                }
                a P22 = y1Var5.M.P2();
                if (P22 != null) {
                    TL_iv.PageBlock pageBlock = P22.f45853b;
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
                q.U(parentActivity, str, new ph.s1(20, y1Var5, pageblockmath), y1Var5.getResourceProvider());
                return;
            case 9:
                y1 y1Var6 = this.f45988b;
                y1Var6.M.Y3 = null;
                y1Var6.o0(90, 0);
                return;
            case 10:
                y1 y1Var7 = this.f45988b;
                y1Var7.r0();
                ui0 ui0Var = y1Var7.L0;
                if (ui0Var != null) {
                    ui0Var.h(true);
                    y1Var7.L0 = null;
                    return;
                }
                return;
            case 11:
                y1 y1Var8 = this.f45988b;
                y1Var8.M.P4();
                y1Var8.y0();
                return;
            case 12:
                this.f45988b.M.Y3(view);
                return;
            case 13:
                this.f45988b.M.Z3();
                return;
            case 14:
                this.f45988b.M.W3();
                return;
            case 15:
                this.f45988b.M.a4();
                return;
            default:
                this.f45988b.n0();
                return;
        }
    }
}
