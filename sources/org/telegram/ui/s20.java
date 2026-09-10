package org.telegram.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public abstract class s20 extends org.telegram.ui.ActionBar.p2 {
    public int E;
    public s4.c0 F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final Paint K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public final o20 f36525a;
    public final o20 f36526b;
    public org.telegram.ui.Components.vl0 f36527c;
    public Drawable d;
    public qg.x1 e;
    public boolean f36528f;
    public boolean h;
    public float f36529n;
    public int f36530r;
    public r20 f36531s;
    public float v;
    public final Canvas f36532w;
    public float f36533x;
    public p20 f36534y;

    public s20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.j6.Pj;
        int i11 = org.telegram.ui.ActionBar.j6.Qj;
        int i12 = org.telegram.ui.ActionBar.j6.Rj;
        int i13 = org.telegram.ui.ActionBar.j6.Sj;
        this.f36525a = new o20(i10, i11, i12, i13, null, 0);
        o20 o20Var = new o20(i10, i11, i12, i13, null, 1);
        this.f36526b = o20Var;
        this.f36532w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        o20Var.f40697n = true;
        this.N = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).M0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.I = i10;
        this.f36531s = o0();
        org.telegram.ui.ActionBar.f5 f5Var2 = this.parentLayout;
        if (f5Var2 != null && ((ActionBarLayout) f5Var2).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f36527c = new org.telegram.ui.Components.vl0(context, null);
        if (this.G) {
            this.F = new org.telegram.ui.Components.wz(this.f36527c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        } else {
            this.F = new s4.c0();
        }
        this.f36527c.setLayoutManager(this.F);
        s4.c0 c0Var = this.F;
        if (c0Var instanceof org.telegram.ui.Components.wz) {
            ((org.telegram.ui.Components.wz) c0Var).R = true;
        }
        s4.h0 n02 = n0();
        this.f36527c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.j61) {
            org.telegram.ui.Components.vl0 vl0Var = this.f36527c;
            n20 n20Var = new n20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.vl0 vl0Var2 = this.f36527c;
            Objects.requireNonNull(vl0Var2);
            vl0Var.q1(n20Var, dp, dp2, new iu(vl0Var2, 10), true);
        } else {
            this.f36527c.setSections(true);
        }
        this.f36527c.setClipToPadding(false);
        this.f36527c.j(new j3(this, 11));
        this.f36534y = new p20(context);
        r20 r20Var = this.f36531s;
        qg.x1 p02 = p0();
        this.e = p02;
        r20Var.addView(p02, w7.a6.c(-2.0f, -1));
        this.f36531s.addView(this.f36534y, w7.a6.c(-2.0f, -1));
        this.f36531s.addView(this.f36527c, w7.a6.c(-1.0f, -1));
        this.f36531s.addView(this.actionBar);
        this.fragmentView = this.f36531s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 25));
        this.actionBar.setForceSkipTouches(true);
        v0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.d6.a(new e(this, 15), org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, org.telegram.ui.ActionBar.j6.Nj, org.telegram.ui.ActionBar.j6.Oj, org.telegram.ui.ActionBar.j6.Pj, org.telegram.ui.ActionBar.j6.Qj, org.telegram.ui.ActionBar.j6.Rj, org.telegram.ui.ActionBar.j6.Sj, org.telegram.ui.ActionBar.j6.Tj, org.telegram.ui.ActionBar.j6.Vj, org.telegram.ui.ActionBar.j6.Wj, org.telegram.ui.ActionBar.j6.Uj, org.telegram.ui.ActionBar.j6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.M && !org.telegram.ui.ActionBar.j6.I.q()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void l0() {
        org.telegram.ui.Components.vl0 vl0Var = this.f36527c;
        if (vl0Var != null && this.F != null && this.N >= 0) {
            int i10 = this.O;
            vl0Var.K(0);
            this.F.h1(this.N, i10);
            this.N = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, t5 t5Var) {
        p20 p20Var = this.f36534y;
        FrameLayout frameLayout2 = (FrameLayout) p20Var.e;
        FrameLayout frameLayout3 = (FrameLayout) p20Var.d;
        ((TextView) p20Var.f35672b).setText(str);
        org.telegram.ui.Components.m90 m90Var = (org.telegram.ui.Components.m90) p20Var.f35673c;
        m90Var.setText(charSequence);
        m90Var.setMaxWidth(bi.x4.a(m90Var.getText(), m90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.a6.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (t5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(t5Var, w7.a6.e(-1, -2, 1));
            frameLayout2.setClickable(t5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        p20Var.requestLayout();
    }

    public abstract s4.h0 n0();

    public r20 o0() {
        return new r20(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f36527c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        qg.x1 x1Var = this.e;
        if (x1Var != null) {
            x1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    public qg.x1 p0() {
        return new di.f(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        bi.nc ncVar = new bi.nc(this, context, 29);
        ncVar.setTag(-33024);
        return ncVar;
    }

    public final void s0() {
        View view;
        int i10;
        org.telegram.ui.Components.vl0 vl0Var = this.f36527c;
        if (vl0Var != null && vl0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f36527c.getChildCount()) {
                    view = this.f36527c.getChildAt(i11);
                    this.f36527c.getClass();
                    i10 = RecyclerView.R(view);
                    if (i10 >= 0 && view.getTop() < Integer.MAX_VALUE) {
                        view.getTop();
                        break;
                    }
                    i11++;
                } else {
                    view = null;
                    i10 = -1;
                    break;
                }
            }
            if (view != null) {
                this.N = i10;
                this.O = view.getTop();
            }
        }
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        boolean z10;
        Dialog showDialog = super.showDialog(dialog);
        if (showDialog != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        w0(z10);
        return showDialog;
    }

    public final Paint t0(float f7, float f10) {
        int measuredWidth = this.f36531s.getMeasuredWidth();
        int measuredHeight = this.f36531s.getMeasuredHeight();
        o20 o20Var = this.f36526b;
        o20Var.d(0, (-f7) - ((this.f36531s.getMeasuredWidth() * 0.1f) * this.f36529n), 0, measuredWidth, -f10, measuredHeight);
        return o20Var.f40690f;
    }

    public final void u0() {
        if (this.f36531s.getMeasuredWidth() != 0 && this.f36531s.getMeasuredHeight() != 0 && this.f36534y != null) {
            int measuredWidth = this.f36531s.getMeasuredWidth();
            int measuredHeight = this.f36531s.getMeasuredHeight();
            o20 o20Var = this.f36525a;
            o20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f36532w;
            canvas.save();
            canvas.scale(100.0f / this.f36531s.getMeasuredWidth(), 100.0f / this.f36531s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f36531s.getMeasuredWidth(), this.f36531s.getMeasuredHeight(), o20Var.f40690f);
            canvas.restore();
        }
    }

    public final void v0() {
        if (this.f36534y != null && this.actionBar != null) {
            this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5));
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.j6.Tj;
            lVar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
            this.actionBar.A(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 60), false);
            this.e.f40983a.g();
            p20 p20Var = this.f36534y;
            if (p20Var != null) {
                TextView textView = (TextView) p20Var.f35672b;
                if (this.M) {
                    int i11 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    ((org.telegram.ui.Components.m90) this.f36534y.f35673c).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    ((org.telegram.ui.Components.m90) this.f36534y.f35673c).setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    ((org.telegram.ui.Components.m90) this.f36534y.f35673c).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    ((org.telegram.ui.Components.m90) this.f36534y.f35673c).setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
                }
            }
            u0();
        }
    }

    public final void w0(boolean z10) {
        if (z10 != this.f36528f) {
            this.f36528f = z10;
            this.e.setPaused(z10);
            this.f36531s.invalidate();
        }
    }
}
