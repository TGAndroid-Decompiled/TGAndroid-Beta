package ph;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.m5;
import org.telegram.messenger.r20;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wy0;
import rh.u5;
import rh.v5;
import w7.b6;
public abstract class j2 extends FrameLayout implements vs {
    public static final HashMap U = new HashMap();
    public final LinearLayout D;
    public final TextView E;
    public final ep F;
    public final FrameLayout G;
    public int H;
    public z60 I;
    public SpannableStringBuilder J;
    public int K;
    public int L;
    public int M;
    public ei.r N;
    public boolean O;
    public int P;
    public final m1 Q;
    public final fe.b R;
    public int S;
    public int T;
    public final org.telegram.ui.ActionBar.k2 f45139a;
    public final int f45140b;
    public final long f45141c;
    public final v5 d;
    public final u5 e;
    public final p6 f45142f;
    public final wy0 h;
    public final w71 f45143n;
    public final FrameLayout f45144r;
    public final SpannableStringBuilder f45145s;
    public final SpannableStringBuilder f45146w;
    public final vh.d f45147x;
    public int f45148y;

    public j2(org.telegram.ui.ActionBar.k2 r27, android.content.Context r28, int r29, long r30, org.telegram.ui.ActionBar.p6 r32, tg.b r33) {
        throw new UnsupportedOperationException("Method not decompiled: ph.j2.<init>(org.telegram.ui.ActionBar.k2, android.content.Context, int, long, org.telegram.ui.ActionBar.p6, tg.b):void");
    }

    public static void j(org.telegram.ui.ActionBar.b1 b1Var, v5 v5Var, Runnable runnable, int i10) {
        b1Var.setOnClickListener(new jg.w1(v5Var, i10, runnable, 22));
        b1Var.setOnLongClickListener(new sa(v5Var, i10, runnable));
    }

    public final void a() {
        v5 v5Var;
        f2 currentPage = getCurrentPage();
        if (currentPage != null && (v5Var = currentPage.e) != null && currentPage.d) {
            int i10 = v5Var.d;
            new t3(this.f45139a, this.f45141c, i10, new jg.o2(this, i10, currentPage, 4)).show();
        }
    }

    public final boolean b() {
        u5 u5Var = this.e;
        if (!u5Var.h() || u5Var.d().size() >= ((org.telegram.messenger.l0) wp.r1(this.f45140b).f19300y7.f18046t.f10701a).f16855c) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long j10 = this.f45141c;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f45140b;
        if (i10 >= 0) {
            if (i10 != 0 && j10 != e20.i(i11).e()) {
                return false;
            }
            return true;
        }
        return org.telegram.messenger.w3.w(5, wp.r1(i11).L0(Long.valueOf(-j10)));
    }

    public final boolean d() {
        if (this.f45141c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = at.G3;
        LinearLayout linearLayout = this.D;
        vh.d dVar = this.f45147x;
        long j10 = this.f45141c;
        int i15 = 8;
        if (i10 == i14) {
            if (((Long) objArr[0]).longValue() == j10) {
                if (d()) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                dVar.setVisibility(i13);
                if (d()) {
                    i15 = 0;
                }
                linearLayout.setVisibility(i15);
                this.f45148y = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.F.a(bool.booleanValue(), true);
                }
            }
        } else if (i10 == at.H3) {
            if (((Long) objArr[0]).longValue() == j10) {
                f(true);
                o();
            }
        } else if (i10 == at.f14772r) {
            if (d()) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            dVar.setVisibility(i12);
            if (d()) {
                i15 = 0;
            }
            linearLayout.setVisibility(i15);
            this.f45148y = 60;
            setVisibleHeight(this.T);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.P > 0) {
            ArrayList d = this.e.d();
            int i10 = 0;
            while (true) {
                if (i10 < d.size()) {
                    if (((TL_stars.TL_starGiftCollection) d.get(i10)).collection_id == this.P) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            if (i10 >= 0 && tL_starGiftCollection != null) {
                this.P = 0;
                this.f45143n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        wy0 wy0Var = this.h;
        if (wy0Var != null && this.f45143n != null) {
            wy0Var.o(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.O) {
            return true;
        }
        f2 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.h) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f45144r;
        float translationY = frameLayout.getTranslationY() - m5.z(this.f45148y, Math.max(org.telegram.messenger.i0.L(240.0f), this.T) + (-frameLayout.getTop()), 1);
        if (this.T < org.telegram.messenger.i0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.i0.L(240.0f) - this.T, org.telegram.messenger.i0.L(this.f45148y));
        }
        return (int) (org.telegram.messenger.i0.L(this.f45148y) - translationY);
    }

    public v5 getCurrentList() {
        f2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.e;
        }
        return this.d;
    }

    public uk0 getCurrentListView() {
        f2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f45056f;
        }
        return null;
    }

    public f2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (f2) currentView;
    }

    public int getGiftsCount() {
        int i10;
        v5 v5Var;
        int i11;
        f2 currentPage = getCurrentPage();
        v5 v5Var2 = this.d;
        if (currentPage != null && (v5Var = currentPage.e) != v5Var2) {
            if (v5Var != null && (i11 = v5Var.f47598n) > 0) {
                return i11;
            }
        } else if (v5Var2 != null && (i10 = v5Var2.f47598n) > 0) {
            return i10;
        }
        long j10 = this.f45141c;
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i13 = this.f45140b;
        if (i12 >= 0) {
            TLRPC.UserFull a2 = wp.r1(i13).a2(j10);
            if (a2 == null) {
                return 0;
            }
            return a2.stargifts_count;
        }
        TLRPC.ChatFull M0 = wp.r1(i13).M0(-j10);
        if (M0 == null) {
            return 0;
        }
        return M0.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j10 = 0;
        v5 v5Var = this.d;
        if (v5Var != null && !v5Var.f47596l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < v5Var.f47596l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) v5Var.f47596l.get(i11)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.f19800id))) {
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.f19800id));
                    i10++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        View[] viewPages;
        wy0 wy0Var = this.h;
        float f7 = 0.0f;
        if (wy0Var.getViewPages() != null) {
            for (View view : wy0Var.getViewPages()) {
                if (view instanceof f2) {
                    f7 = (((f2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f7;
                }
            }
        }
        return f7;
    }

    public float getTabsVisibility() {
        w71 w71Var = this.f45143n;
        if (w71Var != null) {
            return w71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, r20 r20Var) {
        View view;
        int i10;
        u60 u60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.i0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        p6 p6Var = this.f45142f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        if (str != null) {
            x1Var.R = dd.L0(2131750224, null);
        } else {
            x1Var.R = dd.L0(2131750104, null);
            x1Var.T = dd.L0(2131750105, null);
        }
        t1 t1Var = new t1(this, context, p6Var);
        t1Var.f24015r0 = true;
        t1Var.setOnEditorActionListener(new org.telegram.ui.web.q0(t1Var, r20Var, x1VarArr, view, 1));
        vi.b0(this.f45140b).M(org.telegram.messenger.i0.G0(), true);
        t1Var.setTextSize(1, 18.0f);
        a7.V(t1Var, t6.f21038j5, p6Var);
        a7.m(t1Var, 34, t6.Li, p6Var);
        t1Var.setHintText(dd.L0(2131750106, null));
        t1Var.setFocusable(true);
        t1Var.setInputType(147457);
        a7.G(t1Var, t6.f21059k6, t6.f21077l6, t6.f21154p7, p6Var);
        t1Var.setImeOptions(6);
        t1Var.setBackgroundDrawable(null);
        t1Var.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f));
        t1Var.addTextChangedListener(new jg.f3(3, t1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        t1Var.setText(str);
        linearLayout.addView(t1Var, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        x1Var.f21469a = org.telegram.messenger.i0.L(292.0f);
        if (str != null) {
            i10 = 2131751336;
        } else {
            i10 = 2131751753;
        }
        alertDialog$Builder.k(dd.L0(i10, null), new org.telegram.ui.web.k0(3, t1Var, r20Var));
        alertDialog$Builder.h(dd.L0(2131752589, null), new org.telegram.utils.twidget.t(7));
        x1VarArr[0] = x1Var;
        z60 z60Var = this.I;
        if (z60Var != null && (u60Var = z60Var.f33034m) != null) {
            u60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.i0.Y2(W, this.f45139a.getClassGuid());
        x1VarArr[0].setOnDismissListener(new org.telegram.ui.Components.z1(this, t1Var, W, 4));
        x1VarArr[0].setOnShowListener(new ag.d0(t1Var, 3));
        x1VarArr[0].show();
        org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr[0];
        x1Var2.f21491j0 = false;
        x1Var2.d(-1);
        t1Var.setSelection(t1Var.getText().length());
    }

    public final void i() {
        f2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i10) {
        v5 v5Var;
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            u5 u5Var = this.e;
            if (i11 < u5Var.d().size()) {
                if (i11 >= 0 && i11 < u5Var.d().size()) {
                    v5Var = u5Var.e(((TL_stars.TL_starGiftCollection) u5Var.d().get(i11)).collection_id);
                } else {
                    v5Var = null;
                }
                if (v5Var != null) {
                    return v5Var.f47596l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float f7;
        float f10;
        float nextPositionAlpha;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        bb bbVar;
        wy0 wy0Var = this.h;
        if (wy0Var != null) {
            if (wy0Var.getCurrentPosition() == wy0Var.getNextPosition()) {
                if (k(wy0Var.getCurrentPosition())) {
                    nextPositionAlpha = 1.0f;
                } else {
                    nextPositionAlpha = 0.0f;
                }
            } else {
                if (k(wy0Var.getCurrentPosition())) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float currentPositionAlpha = wy0Var.getCurrentPositionAlpha() * f7;
                if (k(wy0Var.getNextPosition())) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                nextPositionAlpha = (wy0Var.getNextPositionAlpha() * f10) + currentPositionAlpha;
            }
            FrameLayout frameLayout = this.f45144r;
            float z11 = m5.z(this.f45148y, (-frameLayout.getTop()) + this.T, 1);
            float L = ((org.telegram.messenger.i0.L(68.0f) + 2) * nextPositionAlpha) + z11;
            int i10 = 0;
            if (this.T > org.telegram.messenger.i0.L(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            fe.b bVar = this.R;
            bVar.a(z10, true);
            float f11 = bVar.e;
            float T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(60.0f) + z11, (org.telegram.messenger.i0.L(16.0f) * nextPositionAlpha) + z11, f11);
            float f12 = (1.0f - nextPositionAlpha) * f11;
            this.G.setTranslationY(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(60.0f) + L, L, f11) - org.telegram.messenger.i0.L(200.0f));
            frameLayout.setTranslationY(T1 - this.S);
            frameLayout.setAlpha(f12);
            if (f12 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            if (this.e.h() && wy0Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.f45146w;
            } else {
                spannableStringBuilder = this.f45145s;
            }
            this.f45147x.i(spannableStringBuilder, true, true);
            wb wbVar = wb.f32194w;
            if (wbVar != null && (bbVar = wbVar.e) != null) {
                bbVar.updatePosition();
            }
        }
    }

    public final void m() {
        vh.d dVar = this.f45147x;
        dVar.updateColors();
        int i10 = t6.Ci;
        p6 p6Var = this.f45142f;
        int d12 = ((wq0) this).V.d1(t6.w0(i10, p6Var));
        if (dVar.getBackground() instanceof ShapeDrawable) {
            if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != d12) {
                t6.C1(d12, dVar.getBackground());
                dVar.invalidate();
            }
        } else {
            dVar.setBackground(t6.d0(org.telegram.messenger.i0.L(19.0f), d12));
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    f2 f2Var = (f2) view;
                    p6 p6Var2 = f2Var.f45055c;
                    if (f2Var.f45058r != null) {
                        f2Var.f45060w.setTextColor(t6.w0(t6.G6, p6Var2));
                        f2Var.f45061x.setTextColor(t6.w0(t6.Ci, p6Var2));
                    } else {
                        f2Var.E.setTextColor(t6.w0(t6.G6, p6Var2));
                        f2Var.F.setTextColor(t6.w0(t6.f21312y6, p6Var2));
                        f2Var.G.updateColors();
                    }
                }
            }
        }
        this.E.setTextColor(t6.w0(t6.f21038j5, p6Var));
    }

    public final void n() {
        View[] viewPages;
        for (View view : this.h.getViewPages()) {
            if (view instanceof f2) {
                f2 f2Var = (f2) view;
                ii iiVar = f2Var.f45056f;
                int paddingTop = iiVar.getPaddingTop();
                f2Var.g();
                int paddingTop2 = paddingTop - iiVar.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.i0.J(iiVar, new p1(f2Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z10;
        View[] viewPages;
        if (this.e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        wy0 wy0Var = this.h;
        if (wy0Var.getViewPages() != null) {
            for (View view : wy0Var.getViewPages()) {
                if (view instanceof f2) {
                    ((f2) view).setHasTabs(z10);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f45140b;
        at.f(i10).c(this, at.G3);
        at.f(i10).c(this, at.H3);
        at.f(i10).c(this, at.f14772r);
        f2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        v5 v5Var = this.d;
        if (v5Var != null) {
            v5Var.f47599o = true;
            v5Var.b();
        }
        u5 u5Var = this.e;
        if (u5Var != null) {
            u5Var.f47558j = true;
            u5Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        f2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.f45140b;
        at.f(i10).n(this, at.G3);
        at.f(i10).n(this, at.H3);
        at.f(i10).n(this, at.f14772r);
        v5 v5Var = this.d;
        if (v5Var != null) {
            v5Var.f47599o = false;
        }
        u5 u5Var = this.e;
        if (u5Var != null) {
            u5Var.f47558j = false;
        }
    }

    public final void p() {
        float f7;
        View[] viewPages;
        float f10;
        w71 w71Var = this.f45143n;
        if (w71Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - org.telegram.messenger.i0.L(42.0f));
        float l4 = Utilities.l(org.telegram.messenger.i0.z1(min - this.K, -org.telegram.messenger.i0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.i0.T1(0.9f, 1.0f, l4);
        w71Var.setTranslationY(min);
        w71Var.setScaleX(T1);
        w71Var.setScaleY(T1);
        wy0 wy0Var = this.h;
        if (wy0Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : wy0Var.getViewPages()) {
                if (view instanceof f2) {
                    if (((f2) view).H) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    f7 += f10;
                }
            }
        } else {
            f7 = 0.0f;
        }
        w71Var.setAlpha(w7.u.a(f7, 0.0f, 1.0f) * l4);
    }

    public abstract void q(boolean z10);

    public void setButtonOffset(int i10) {
        if (this.S != i10) {
            this.S = i10;
            l();
        }
    }

    public void setGlassEngine(ei.r rVar) {
        View[] viewPages;
        this.N = rVar;
        wy0 wy0Var = this.h;
        rVar.c(wy0Var);
        for (View view : wy0Var.getViewPages()) {
            if (view instanceof f2) {
                rVar.b(((f2) view).f45056f);
            }
        }
    }

    public void setPaddingTop(int i10) {
        if (this.K != i10) {
            this.K = i10;
            n();
            p();
            l();
        }
    }

    public void setReordering(boolean z10) {
        f2 currentPage = getCurrentPage();
        if (currentPage != null) {
            f2.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            q(g());
            this.f45143n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.U4(false);
                    org.telegram.messenger.i0.g3(new q1(profileActivity, 0));
                }
            }
            if (!z10) {
                m1 m1Var = this.Q;
                org.telegram.messenger.i0.r(m1Var);
                org.telegram.messenger.i0.g3(m1Var);
            }
        }
    }

    public void setVisibleHeight(int i10) {
        View[] viewPages;
        this.T = i10;
        l();
        wy0 wy0Var = this.h;
        if (wy0Var != null) {
            for (View view : wy0Var.getViewPages()) {
                if (view instanceof f2) {
                    ((f2) view).setVisibleHeight(this.T);
                }
            }
        }
    }
}
