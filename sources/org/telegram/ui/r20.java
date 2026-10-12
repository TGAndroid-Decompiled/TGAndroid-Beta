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
public abstract class r20 extends org.telegram.ui.ActionBar.m2 {
    public int E;
    public s4.d0 F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final Paint K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public final n20 f41483a;
    public final n20 f41484b;
    public org.telegram.ui.Components.wm0 f41485c;
    public Drawable d;
    public rg.w1 f41486e;
    public boolean f41487f;
    public boolean h;
    public float f41488n;
    public int f41489r;
    public q20 f41490s;
    public float v;
    public final Canvas f41491w;
    public float f41492x;
    public o20 f41493y;

    public r20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.h6.Pj;
        int i11 = org.telegram.ui.ActionBar.h6.Qj;
        int i12 = org.telegram.ui.ActionBar.h6.Rj;
        int i13 = org.telegram.ui.ActionBar.h6.Sj;
        this.f41483a = new n20(i10, i11, i12, i13, null, 0);
        n20 n20Var = new n20(i10, i11, i12, i13, null, 1);
        this.f41484b = n20Var;
        this.f41491w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        n20Var.f47408n = true;
        this.N = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f20631h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.I = i10;
        this.f41490s = o0();
        org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
        if (b5Var2 != null && ((ActionBarLayout) b5Var2).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f41485c = new org.telegram.ui.Components.wm0(context, null);
        if (this.G) {
            this.F = new org.telegram.ui.Components.i00(this.f41485c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        } else {
            this.F = new s4.d0();
        }
        this.f41485c.setLayoutManager(this.F);
        s4.d0 d0Var = this.F;
        if (d0Var instanceof org.telegram.ui.Components.i00) {
            ((org.telegram.ui.Components.i00) d0Var).R = true;
        }
        s4.i0 n02 = n0();
        this.f41485c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.h71) {
            org.telegram.ui.Components.wm0 wm0Var = this.f41485c;
            m20 m20Var = new m20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.wm0 wm0Var2 = this.f41485c;
            Objects.requireNonNull(wm0Var2);
            wm0Var.r1(m20Var, dp, dp2, new ju(wm0Var2, 10), true);
        } else {
            this.f41485c.setSections(true);
        }
        this.f41485c.setClipToPadding(false);
        this.f41485c.j(new i3(this, 11));
        this.f41493y = new o20(context);
        q20 q20Var = this.f41490s;
        rg.w1 p02 = p0();
        this.f41486e = p02;
        q20Var.addView(p02, w7.w5.d(-2.0f, -1));
        this.f41490s.addView(this.f41493y, w7.w5.d(-2.0f, -1));
        this.f41490s.addView(this.f41485c, w7.w5.d(-1.0f, -1));
        this.f41490s.addView(this.actionBar);
        this.fragmentView = this.f41490s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new lc(this, 26));
        this.actionBar.setForceSkipTouches(true);
        w0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.z5.a(new e(this, 15), org.telegram.ui.ActionBar.h6.Lj, org.telegram.ui.ActionBar.h6.Mj, org.telegram.ui.ActionBar.h6.Nj, org.telegram.ui.ActionBar.h6.Oj, org.telegram.ui.ActionBar.h6.Pj, org.telegram.ui.ActionBar.h6.Qj, org.telegram.ui.ActionBar.h6.Rj, org.telegram.ui.ActionBar.h6.Sj, org.telegram.ui.ActionBar.h6.Tj, org.telegram.ui.ActionBar.h6.Vj, org.telegram.ui.ActionBar.h6.Wj, org.telegram.ui.ActionBar.h6.Uj, org.telegram.ui.ActionBar.h6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.M && !org.telegram.ui.ActionBar.h6.I.q()) {
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
        org.telegram.ui.Components.wm0 wm0Var = this.f41485c;
        if (wm0Var != null && this.F != null && this.N >= 0) {
            int i10 = this.O;
            wm0Var.K(0);
            this.F.h1(this.N, i10);
            this.N = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, v5 v5Var) {
        o20 o20Var = this.f41493y;
        FrameLayout frameLayout2 = (FrameLayout) o20Var.f40547e;
        FrameLayout frameLayout3 = (FrameLayout) o20Var.d;
        ((TextView) o20Var.f40545b).setText(str);
        org.telegram.ui.Components.ia0 ia0Var = (org.telegram.ui.Components.ia0) o20Var.f40546c;
        ia0Var.setText(charSequence);
        ia0Var.setMaxWidth(ci.d4.a(ia0Var.getText(), ia0Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.w5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (v5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(v5Var, w7.w5.e(-1, -2, 1));
            frameLayout2.setClickable(v5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        o20Var.requestLayout();
    }

    public abstract s4.i0 n0();

    public q20 o0() {
        return new q20(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        x0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f41485c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        rg.w1 w1Var = this.f41486e;
        if (w1Var != null) {
            w1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f41486e.setPaused(false);
    }

    public rg.w1 p0() {
        return new ei.f(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        ci.bb bbVar = new ci.bb(this, context, 29);
        bbVar.setTag(-33024);
        return bbVar;
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
        x0(z10);
        return showDialog;
    }

    public final void t0() {
        View view;
        int i10;
        org.telegram.ui.Components.wm0 wm0Var = this.f41485c;
        if (wm0Var != null && wm0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f41485c.getChildCount()) {
                    view = this.f41485c.getChildAt(i11);
                    this.f41485c.getClass();
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

    public final Paint u0(float f7, float f10) {
        int measuredWidth = this.f41490s.getMeasuredWidth();
        int measuredHeight = this.f41490s.getMeasuredHeight();
        n20 n20Var = this.f41484b;
        n20Var.d(0, (-f7) - ((this.f41490s.getMeasuredWidth() * 0.1f) * this.f41488n), 0, measuredWidth, -f10, measuredHeight);
        return n20Var.f47401f;
    }

    public final void v0() {
        if (this.f41490s.getMeasuredWidth() != 0 && this.f41490s.getMeasuredHeight() != 0 && this.f41493y != null) {
            int measuredWidth = this.f41490s.getMeasuredWidth();
            int measuredHeight = this.f41490s.getMeasuredHeight();
            n20 n20Var = this.f41483a;
            n20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f41491w;
            canvas.save();
            canvas.scale(100.0f / this.f41490s.getMeasuredWidth(), 100.0f / this.f41490s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f41490s.getMeasuredWidth(), this.f41490s.getMeasuredHeight(), n20Var.f47401f);
            canvas.restore();
        }
    }

    public final void w0() {
        if (this.f41493y != null && this.actionBar != null) {
            this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20631h5));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.h6.Tj;
            kVar.E(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
            this.actionBar.D(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 60), false);
            this.f41486e.f47725a.g();
            o20 o20Var = this.f41493y;
            if (o20Var != null) {
                TextView textView = (TextView) o20Var.f40545b;
                if (this.M) {
                    int i11 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    ((org.telegram.ui.Components.ia0) this.f41493y.f40546c).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    ((org.telegram.ui.Components.ia0) this.f41493y.f40546c).setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    ((org.telegram.ui.Components.ia0) this.f41493y.f40546c).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    ((org.telegram.ui.Components.ia0) this.f41493y.f40546c).setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
                }
            }
            v0();
        }
    }

    public final void x0(boolean z10) {
        if (z10 != this.f41487f) {
            this.f41487f = z10;
            this.f41486e.setPaused(z10);
            this.f41490s.invalidate();
        }
    }

    public void s0(float f7) {
    }
}
