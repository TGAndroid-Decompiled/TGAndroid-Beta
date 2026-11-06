package zh;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.la;
import bi.t9;
import bi.v9;
import bi.w8;
import c8.ha;
import c8.j9;
import hi.d4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tb0;
public abstract class f2 extends FrameLayout implements ls {
    public static final HashMap U = new HashMap();
    public final LinearLayout D;
    public final TextView E;
    public final wo F;
    public final FrameLayout G;
    public int H;
    public k60 I;
    public SpannableStringBuilder J;
    public int K;
    public int L;
    public int M;
    public oi.q N;
    public boolean O;
    public int P;
    public final i1 Q;
    public final te.a R;
    public int S;
    public int T;
    public final org.telegram.ui.ActionBar.f2 f60212a;
    public final int f60213b;
    public final long f60214c;
    public final v9 d;
    public final t9 f60215e;
    public final f6 f60216f;
    public final ei.a h;
    public final t61 f60217n;
    public final FrameLayout f60218r;
    public final SpannableStringBuilder f60219s;
    public final SpannableStringBuilder f60220w;
    public final fi.d f60221x;
    public int f60222y;

    public f2(org.telegram.ui.ActionBar.f2 r27, android.content.Context r28, int r29, long r30, org.telegram.ui.ActionBar.f6 r32, dh.c r33) {
        throw new UnsupportedOperationException("Method not decompiled: zh.f2.<init>(org.telegram.ui.ActionBar.f2, android.content.Context, int, long, org.telegram.ui.ActionBar.f6, dh.c):void");
    }

    public static void j(org.telegram.ui.ActionBar.z0 z0Var, v9 v9Var, Runnable runnable, int i7) {
        z0Var.setOnClickListener(new la(v9Var, i7, runnable, 23));
        z0Var.setOnLongClickListener(new sa(v9Var, i7, runnable));
    }

    public final void a() {
        v9 v9Var;
        a2 currentPage = getCurrentPage();
        if (currentPage != null && (v9Var = currentPage.f60109e) != null && currentPage.d) {
            int i7 = v9Var.d;
            new o3(this.f60212a, this.f60214c, i7, new d4(this, i7, currentPage, 6)).show();
        }
    }

    public final boolean b() {
        t9 t9Var = this.f60215e;
        if (!t9Var.h() || t9Var.d().size() >= ((org.telegram.messenger.j0) qp.s1(this.f60213b).f24927x7.f24448t.f13555b).f23432c) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        long j3 = this.f60214c;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i10 = this.f60213b;
        if (i7 >= 0) {
            if (i7 != 0 && j3 != p10.i(i10).e()) {
                return false;
            }
            return true;
        }
        return org.telegram.messenger.t3.w(5, qp.s1(i10).M0(Long.valueOf(-j3)));
    }

    public final boolean d() {
        if (this.f60214c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11;
        int i12;
        int i13 = qs.G3;
        LinearLayout linearLayout = this.D;
        fi.d dVar = this.f60221x;
        long j3 = this.f60214c;
        int i14 = 8;
        if (i7 == i13) {
            if (((Long) objArr[0]).longValue() == j3) {
                if (d()) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                dVar.setVisibility(i12);
                if (d()) {
                    i14 = 0;
                }
                linearLayout.setVisibility(i14);
                this.f60222y = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.F.a(bool.booleanValue(), true);
                }
            }
        } else if (i7 == qs.H3) {
            if (((Long) objArr[0]).longValue() == j3) {
                f(true);
                o();
            }
        } else if (i7 == qs.f25046r) {
            if (d()) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            dVar.setVisibility(i11);
            if (d()) {
                i14 = 0;
            }
            linearLayout.setVisibility(i14);
            this.f60222y = 60;
            setVisibleHeight(this.T);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.P > 0) {
            ArrayList d = this.f60215e.d();
            int i7 = 0;
            while (true) {
                if (i7 < d.size()) {
                    if (((TL_stars.TL_starGiftCollection) d.get(i7)).collection_id == this.P) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i7);
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            if (i7 >= 0 && tL_starGiftCollection != null) {
                this.P = 0;
                this.f60217n.d(tL_starGiftCollection.collection_id, i7 + 1);
            }
        }
    }

    public final void f(boolean z9) {
        ei.a aVar = this.h;
        if (aVar != null && this.f60217n != null) {
            aVar.o(z9);
            e();
        }
    }

    public final boolean g() {
        if (this.O) {
            return true;
        }
        a2 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.h) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f60218r;
        float translationY = frameLayout.getTranslationY() - k5.z(this.f60222y, Math.max(org.telegram.messenger.g0.L(240.0f), this.T) + (-frameLayout.getTop()), 1);
        if (this.T < org.telegram.messenger.g0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.g0.L(240.0f) - this.T, org.telegram.messenger.g0.L(this.f60222y));
        }
        return (int) (org.telegram.messenger.g0.L(this.f60222y) - translationY);
    }

    public v9 getCurrentList() {
        a2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f60109e;
        }
        return this.d;
    }

    public pj0 getCurrentListView() {
        a2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f60110f;
        }
        return null;
    }

    public a2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (a2) currentView;
    }

    public int getGiftsCount() {
        int i7;
        v9 v9Var;
        int i10;
        a2 currentPage = getCurrentPage();
        v9 v9Var2 = this.d;
        if (currentPage != null && (v9Var = currentPage.f60109e) != v9Var2) {
            if (v9Var != null && (i10 = v9Var.f4917n) > 0) {
                return i10;
            }
        } else if (v9Var2 != null && (i7 = v9Var2.f4917n) > 0) {
            return i7;
        }
        long j3 = this.f60214c;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i12 = this.f60213b;
        if (i11 >= 0) {
            TLRPC.UserFull b22 = qp.s1(i12).b2(j3);
            if (b22 == null) {
                return 0;
            }
            return b22.stargifts_count;
        }
        TLRPC.ChatFull N0 = qp.s1(i12).N0(-j3);
        if (N0 == null) {
            return 0;
        }
        return N0.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j3 = 0;
        v9 v9Var = this.d;
        if (v9Var != null && !v9Var.f4915l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i7 = 0;
            for (int i10 = 0; i7 < 3 && i10 < v9Var.f4915l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) v9Var.f4915l.get(i10)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.f26958id))) {
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.f26958id));
                    i7++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        View[] viewPages;
        ei.a aVar = this.h;
        float f10 = 0.0f;
        if (aVar.getViewPages() != null) {
            for (View view : aVar.getViewPages()) {
                if (view instanceof a2) {
                    f10 = (((a2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        t61 t61Var = this.f60217n;
        if (t61Var != null) {
            return t61Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, c20 c20Var) {
        View view;
        int i7;
        f60 f60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        f6 f6Var = this.f60216f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        if (str != null) {
            u1Var.R = hd.M0(2131750214, null);
        } else {
            u1Var.R = hd.M0(2131750094, null);
            u1Var.T = hd.M0(2131750095, null);
        }
        o1 o1Var = new o1(this, context, f6Var);
        o1Var.f31356r0 = true;
        o1Var.setOnEditorActionListener(new org.telegram.ui.web.p0(o1Var, c20Var, u1VarArr, view, 1));
        ui.b0(this.f60213b).M(org.telegram.messenger.g0.G0(), true);
        o1Var.setTextSize(1, 18.0f);
        r6.V(o1Var, k6.f27956j5, f6Var);
        r6.m(o1Var, 34, k6.Li, f6Var);
        o1Var.setHintText(hd.M0(2131750096, null));
        o1Var.setFocusable(true);
        o1Var.setInputType(147457);
        r6.G(o1Var, k6.f27977k6, k6.f27995l6, k6.f28069p7, f6Var);
        o1Var.setImeOptions(6);
        o1Var.setBackgroundDrawable(null);
        o1Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        o1Var.addTextChangedListener(new tb0(3, o1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        o1Var.setText(str);
        linearLayout.addView(o1Var, ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        u1Var.f28547a = org.telegram.messenger.g0.L(292.0f);
        if (str != null) {
            i7 = 2131751336;
        } else {
            i7 = 2131751753;
        }
        alertDialog$Builder.k(hd.M0(i7, null), new org.telegram.ui.web.a0(28, o1Var, c20Var));
        alertDialog$Builder.h(hd.M0(2131752589, null), new h(1));
        u1VarArr[0] = u1Var;
        k60 k60Var = this.I;
        if (k60Var != null && (f60Var = k60Var.f35170m) != null) {
            f60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.g0.Z2(W, this.f60212a.getClassGuid());
        u1VarArr[0].setOnDismissListener(new hi.o0(this, o1Var, W, 6));
        u1VarArr[0].setOnShowListener(new kg.r(o1Var, 3));
        u1VarArr[0].show();
        org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
        u1Var2.f28570j0 = false;
        u1Var2.d(-1);
        o1Var.setSelection(o1Var.getText().length());
    }

    public final void i() {
        a2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i7) {
        v9 v9Var;
        if (i7 == 0) {
            return false;
        }
        int i10 = i7 - 1;
        if (i10 >= 0) {
            t9 t9Var = this.f60215e;
            if (i10 < t9Var.d().size()) {
                if (i10 >= 0 && i10 < t9Var.d().size()) {
                    v9Var = t9Var.e(((TL_stars.TL_starGiftCollection) t9Var.d().get(i10)).collection_id);
                } else {
                    v9Var = null;
                }
                if (v9Var != null) {
                    return v9Var.f4915l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float f10;
        float f11;
        float nextPositionAlpha;
        boolean z9;
        SpannableStringBuilder spannableStringBuilder;
        gb gbVar;
        ei.a aVar = this.h;
        if (aVar != null) {
            if (aVar.getCurrentPosition() == aVar.getNextPosition()) {
                if (k(aVar.getCurrentPosition())) {
                    nextPositionAlpha = 1.0f;
                } else {
                    nextPositionAlpha = 0.0f;
                }
            } else {
                if (k(aVar.getCurrentPosition())) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float currentPositionAlpha = aVar.getCurrentPositionAlpha() * f10;
                if (k(aVar.getNextPosition())) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                nextPositionAlpha = (aVar.getNextPositionAlpha() * f11) + currentPositionAlpha;
            }
            FrameLayout frameLayout = this.f60218r;
            float z10 = k5.z(this.f60222y, (-frameLayout.getTop()) + this.T, 1);
            float L = ((org.telegram.messenger.g0.L(68.0f) + 2) * nextPositionAlpha) + z10;
            int i7 = 0;
            if (this.T > org.telegram.messenger.g0.L(184.0f)) {
                z9 = true;
            } else {
                z9 = false;
            }
            te.a aVar2 = this.R;
            aVar2.a(z9, true);
            float f12 = aVar2.f55395e;
            float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + z10, (org.telegram.messenger.g0.L(16.0f) * nextPositionAlpha) + z10, f12);
            float f13 = (1.0f - nextPositionAlpha) * f12;
            this.G.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + L, L, f12) - org.telegram.messenger.g0.L(200.0f));
            frameLayout.setTranslationY(T1 - this.S);
            frameLayout.setAlpha(f13);
            if (f13 <= 0.0f) {
                i7 = 4;
            }
            frameLayout.setVisibility(i7);
            if (this.f60215e.h() && aVar.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.f60220w;
            } else {
                spannableStringBuilder = this.f60219s;
            }
            this.f60221x.i(spannableStringBuilder, true, true);
            cc ccVar = cc.f32519w;
            if (ccVar != null && (gbVar = ccVar.f32523e) != null) {
                gbVar.updatePosition();
            }
        }
    }

    public final void m() {
        fi.d dVar = this.f60221x;
        dVar.updateColors();
        int i7 = k6.Ci;
        f6 f6Var = this.f60216f;
        int f12 = ((up0) this).V.f1(k6.w0(i7, f6Var));
        if (dVar.getBackground() instanceof ShapeDrawable) {
            if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != f12) {
                k6.C1(f12, dVar.getBackground());
                dVar.invalidate();
            }
        } else {
            dVar.setBackground(k6.d0(org.telegram.messenger.g0.L(19.0f), f12));
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    a2 a2Var = (a2) view;
                    f6 f6Var2 = a2Var.f60108c;
                    if (a2Var.f60112r != null) {
                        a2Var.f60114w.setTextColor(k6.w0(k6.G6, f6Var2));
                        a2Var.f60115x.setTextColor(k6.w0(k6.Ci, f6Var2));
                    } else {
                        a2Var.E.setTextColor(k6.w0(k6.G6, f6Var2));
                        a2Var.F.setTextColor(k6.w0(k6.f28240y6, f6Var2));
                        a2Var.G.updateColors();
                    }
                }
            }
        }
        this.E.setTextColor(k6.w0(k6.f27956j5, f6Var));
    }

    public final void n() {
        View[] viewPages;
        for (View view : this.h.getViewPages()) {
            if (view instanceof a2) {
                a2 a2Var = (a2) view;
                fi.w3 w3Var = a2Var.f60110f;
                int paddingTop = w3Var.getPaddingTop();
                a2Var.g();
                int paddingTop2 = paddingTop - w3Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(w3Var, new l1(a2Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z9;
        View[] viewPages;
        if (this.f60215e.d().isEmpty() && !b()) {
            z9 = false;
        } else {
            z9 = true;
        }
        ei.a aVar = this.h;
        if (aVar.getViewPages() != null) {
            for (View view : aVar.getViewPages()) {
                if (view instanceof a2) {
                    ((a2) view).setHasTabs(z9);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f60213b;
        qs.f(i7).c(this, qs.G3);
        qs.f(i7).c(this, qs.H3);
        qs.f(i7).c(this, qs.f25046r);
        a2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        v9 v9Var = this.d;
        if (v9Var != null) {
            v9Var.f4918o = true;
            v9Var.a();
        }
        t9 t9Var = this.f60215e;
        if (t9Var != null) {
            t9Var.f4764j = true;
            t9Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        a2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i7 = this.f60213b;
        qs.f(i7).n(this, qs.G3);
        qs.f(i7).n(this, qs.H3);
        qs.f(i7).n(this, qs.f25046r);
        v9 v9Var = this.d;
        if (v9Var != null) {
            v9Var.f4918o = false;
        }
        t9 t9Var = this.f60215e;
        if (t9Var != null) {
            t9Var.f4764j = false;
        }
    }

    public final void p() {
        float f10;
        View[] viewPages;
        float f11;
        t61 t61Var = this.f60217n;
        if (t61Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - org.telegram.messenger.g0.L(42.0f));
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(min - this.K, -org.telegram.messenger.g0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
        t61Var.setTranslationY(min);
        t61Var.setScaleX(T1);
        t61Var.setScaleY(T1);
        ei.a aVar = this.h;
        if (aVar.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : aVar.getViewPages()) {
                if (view instanceof a2) {
                    if (((a2) view).H) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    f10 += f11;
                }
            }
        } else {
            f10 = 0.0f;
        }
        t61Var.setAlpha(j9.a(f10, 0.0f, 1.0f) * l10);
    }

    public abstract void q(boolean z9);

    public void setButtonOffset(int i7) {
        if (this.S != i7) {
            this.S = i7;
            l();
        }
    }

    public void setGlassEngine(oi.q qVar) {
        View[] viewPages;
        this.N = qVar;
        ei.a aVar = this.h;
        qVar.c(aVar);
        for (View view : aVar.getViewPages()) {
            if (view instanceof a2) {
                qVar.b(((a2) view).f60110f);
            }
        }
    }

    public void setPaddingTop(int i7) {
        if (this.K != i7) {
            this.K = i7;
            n();
            p();
            l();
        }
    }

    public void setReordering(boolean z9) {
        a2 currentPage = getCurrentPage();
        if (currentPage != null) {
            a2.d(currentPage, z9);
        }
    }

    public void setReorderingCollections(boolean z9) {
        if (this.O != z9) {
            this.O = z9;
            q(g());
            this.f60217n.setReordering(z9);
            if (z9) {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.U4(false);
                    org.telegram.messenger.g0.h3(new w8(profileActivity, 1));
                }
            }
            if (!z9) {
                i1 i1Var = this.Q;
                org.telegram.messenger.g0.r(i1Var);
                org.telegram.messenger.g0.h3(i1Var);
            }
        }
    }

    public void setVisibleHeight(int i7) {
        View[] viewPages;
        this.T = i7;
        l();
        ei.a aVar = this.h;
        if (aVar != null) {
            for (View view : aVar.getViewPages()) {
                if (view instanceof a2) {
                    ((a2) view).setVisibleHeight(this.T);
                }
            }
        }
    }
}
