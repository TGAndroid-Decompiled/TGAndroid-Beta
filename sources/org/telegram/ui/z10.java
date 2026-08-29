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
public abstract class z10 extends org.telegram.ui.ActionBar.o2 {
    public int A;
    public f2.j0 B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public final Paint G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public final w10 f45013a;
    public final w10 f45014b;
    public org.telegram.ui.Components.jl0 f45015c;
    public Drawable d;
    public cg.s2 f45016e;
    public boolean f45017f;
    public boolean h;
    public float f45018n;
    public int f45019r;
    public y10 f45020s;
    public float v;
    public final Canvas f45021w;
    public float f45022x;
    public ig.a f45023y;

    public z10() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.g6.Pj;
        int i11 = org.telegram.ui.ActionBar.g6.Qj;
        int i12 = org.telegram.ui.ActionBar.g6.Rj;
        int i13 = org.telegram.ui.ActionBar.g6.Sj;
        this.f45013a = new w10(i10, i11, i12, i13, null, 0);
        w10 w10Var = new w10(i10, i11, i12, i13, null, 1);
        this.f45014b = w10Var;
        this.f45021w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.A = -1;
        this.C = true;
        this.G = new Paint();
        w10Var.f3326n = true;
        this.J = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).I0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.E = i10;
        this.f45020s = o0();
        org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
        if (b5Var2 != null && ((ActionBarLayout) b5Var2).I0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f45015c = new org.telegram.ui.Components.jl0(context, null);
        if (this.C) {
            this.B = new org.telegram.ui.Components.kz(this.f45015c, (AndroidUtilities.dp(68.0f) + this.E) - AndroidUtilities.dp(16.0f));
        } else {
            this.B = new f2.j0();
        }
        this.f45015c.setLayoutManager(this.B);
        f2.j0 j0Var = this.B;
        if (j0Var instanceof org.telegram.ui.Components.kz) {
            ((org.telegram.ui.Components.kz) j0Var).R = true;
        }
        f2.p0 n02 = n0();
        this.f45015c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.k51) {
            org.telegram.ui.Components.jl0 jl0Var = this.f45015c;
            v10 v10Var = new v10(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.jl0 jl0Var2 = this.f45015c;
            Objects.requireNonNull(jl0Var2);
            jl0Var.r1(v10Var, dp, dp2, new xt(jl0Var2, 10), true);
        } else {
            this.f45015c.setSections(true);
        }
        this.f45015c.setClipToPadding(false);
        this.f45015c.j(new m3(this, 11));
        this.f45023y = new ig.a(context);
        y10 y10Var = this.f45020s;
        cg.s2 p02 = p0();
        this.f45016e = p02;
        y10Var.addView(p02, i7.f6.c(-2.0f, -1));
        this.f45020s.addView(this.f45023y, i7.f6.c(-2.0f, -1));
        this.f45020s.addView(this.f45015c, i7.f6.c(-1.0f, -1));
        this.f45020s.addView(this.actionBar);
        this.fragmentView = this.f45020s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 12));
        this.actionBar.setForceSkipTouches(true);
        v0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return i7.i6.a(new f(this, 15), org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, org.telegram.ui.ActionBar.g6.Nj, org.telegram.ui.ActionBar.g6.Oj, org.telegram.ui.ActionBar.g6.Pj, org.telegram.ui.ActionBar.g6.Qj, org.telegram.ui.ActionBar.g6.Rj, org.telegram.ui.ActionBar.g6.Sj, org.telegram.ui.ActionBar.g6.Tj, org.telegram.ui.ActionBar.g6.Vj, org.telegram.ui.ActionBar.g6.Wj, org.telegram.ui.ActionBar.g6.Uj, org.telegram.ui.ActionBar.g6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.I && !org.telegram.ui.ActionBar.g6.I.q()) {
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
        org.telegram.ui.Components.jl0 jl0Var = this.f45015c;
        if (jl0Var != null && this.B != null && this.J >= 0) {
            int i10 = this.K;
            jl0Var.K(0);
            this.B.h1(this.J, i10);
            this.J = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, t5 t5Var) {
        ig.a aVar = this.f45023y;
        FrameLayout frameLayout2 = (FrameLayout) aVar.f8966e;
        FrameLayout frameLayout3 = (FrameLayout) aVar.d;
        ((TextView) aVar.f8964b).setText(str);
        org.telegram.ui.Components.y80 y80Var = (org.telegram.ui.Components.y80) aVar.f8965c;
        y80Var.setText(charSequence);
        y80Var.setMaxWidth(nh.t3.a(y80Var.getText(), y80Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, i7.f6.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (t5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(t5Var, i7.f6.e(-1, -2, 1));
            frameLayout2.setClickable(t5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        aVar.requestLayout();
    }

    public abstract f2.p0 n0();

    public y10 o0() {
        return new y10(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f45015c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        cg.s2 s2Var = this.f45016e;
        if (s2Var != null) {
            s2Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f45016e.setPaused(false);
    }

    public cg.s2 p0() {
        return new cg.h(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        cg.h0 h0Var = new cg.h0(this, context, 26);
        h0Var.setTag(-33024);
        return h0Var;
    }

    public final void s0() {
        View view;
        int i10;
        org.telegram.ui.Components.jl0 jl0Var = this.f45015c;
        if (jl0Var != null && jl0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f45015c.getChildCount()) {
                    view = this.f45015c.getChildAt(i11);
                    this.f45015c.getClass();
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
                this.J = i10;
                this.K = view.getTop();
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

    public final Paint t0(float f9, float f10) {
        int measuredWidth = this.f45020s.getMeasuredWidth();
        int measuredHeight = this.f45020s.getMeasuredHeight();
        w10 w10Var = this.f45014b;
        w10Var.d(0, (-f9) - ((this.f45020s.getMeasuredWidth() * 0.1f) * this.f45018n), 0, measuredWidth, -f10, measuredHeight);
        return w10Var.f3319f;
    }

    public final void u0() {
        if (this.f45020s.getMeasuredWidth() != 0 && this.f45020s.getMeasuredHeight() != 0 && this.f45023y != null) {
            int measuredWidth = this.f45020s.getMeasuredWidth();
            int measuredHeight = this.f45020s.getMeasuredHeight();
            w10 w10Var = this.f45013a;
            w10Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f45021w;
            canvas.save();
            canvas.scale(100.0f / this.f45020s.getMeasuredWidth(), 100.0f / this.f45020s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f45020s.getMeasuredWidth(), this.f45020s.getMeasuredHeight(), w10Var.f3319f);
            canvas.restore();
        }
    }

    public final void v0() {
        if (this.f45023y != null && this.actionBar != null) {
            this.G.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.g6.Tj;
            lVar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
            this.actionBar.B(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 60), false);
            this.f45016e.f3367a.g();
            ig.a aVar = this.f45023y;
            if (aVar != null) {
                TextView textView = (TextView) aVar.f8964b;
                if (this.I) {
                    int i11 = org.telegram.ui.ActionBar.g6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                    ((org.telegram.ui.Components.y80) this.f45023y.f8965c).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
                    ((org.telegram.ui.Components.y80) this.f45023y.f8965c).setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                    ((org.telegram.ui.Components.y80) this.f45023y.f8965c).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
                    ((org.telegram.ui.Components.y80) this.f45023y.f8965c).setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
                }
            }
            u0();
        }
    }

    public final void w0(boolean z10) {
        if (z10 != this.f45017f) {
            this.f45017f = z10;
            this.f45016e.setPaused(z10);
            this.f45020s.invalidate();
        }
    }
}
