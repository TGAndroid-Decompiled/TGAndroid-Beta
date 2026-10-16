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
public abstract class v20 extends org.telegram.ui.ActionBar.m2 {
    public int E;
    public s4.b0 F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final Paint K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public final r20 f40546a;
    public final r20 f40547b;
    public org.telegram.ui.Components.mm0 f40548c;
    public Drawable d;
    public sg.x1 e;
    public boolean f40549f;
    public boolean h;
    public float f40550n;
    public int f40551r;
    public u20 f40552s;
    public float v;
    public final Canvas f40553w;
    public float f40554x;
    public s20 f40555y;

    public v20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.g6.Pj;
        int i11 = org.telegram.ui.ActionBar.g6.Qj;
        int i12 = org.telegram.ui.ActionBar.g6.Rj;
        int i13 = org.telegram.ui.ActionBar.g6.Sj;
        this.f40546a = new r20(i10, i11, i12, i13, null, 0);
        r20 r20Var = new r20(i10, i11, i12, i13, null, 1);
        this.f40547b = r20Var;
        this.f40553w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        r20Var.f45124n = true;
        this.N = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.I = i10;
        this.f40552s = o0();
        org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
        if (b5Var2 != null && ((ActionBarLayout) b5Var2).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f40548c = new org.telegram.ui.Components.mm0(context, null);
        if (this.G) {
            this.F = new org.telegram.ui.Components.b00(this.f40548c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        } else {
            this.F = new s4.b0();
        }
        this.f40548c.setLayoutManager(this.F);
        s4.b0 b0Var = this.F;
        if (b0Var instanceof org.telegram.ui.Components.b00) {
            ((org.telegram.ui.Components.b00) b0Var).R = true;
        }
        s4.g0 n02 = n0();
        this.f40548c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.a71) {
            org.telegram.ui.Components.mm0 mm0Var = this.f40548c;
            q20 q20Var = new q20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.mm0 mm0Var2 = this.f40548c;
            Objects.requireNonNull(mm0Var2);
            mm0Var.r1(q20Var, dp, dp2, new mu(mm0Var2, 10), true);
        } else {
            this.f40548c.setSections(true);
        }
        this.f40548c.setClipToPadding(false);
        this.f40548c.j(new k3(this, 11));
        this.f40555y = new s20(context);
        u20 u20Var = this.f40552s;
        sg.x1 p02 = p0();
        this.e = p02;
        u20Var.addView(p02, w7.z5.d(-2.0f, -1));
        this.f40552s.addView(this.f40555y, w7.z5.d(-2.0f, -1));
        this.f40552s.addView(this.f40548c, w7.z5.d(-1.0f, -1));
        this.f40552s.addView(this.actionBar);
        this.fragmentView = this.f40552s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 27));
        this.actionBar.setForceSkipTouches(true);
        w0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 15), org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, org.telegram.ui.ActionBar.g6.Nj, org.telegram.ui.ActionBar.g6.Oj, org.telegram.ui.ActionBar.g6.Pj, org.telegram.ui.ActionBar.g6.Qj, org.telegram.ui.ActionBar.g6.Rj, org.telegram.ui.ActionBar.g6.Sj, org.telegram.ui.ActionBar.g6.Tj, org.telegram.ui.ActionBar.g6.Vj, org.telegram.ui.ActionBar.g6.Wj, org.telegram.ui.ActionBar.g6.Uj, org.telegram.ui.ActionBar.g6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.M && !org.telegram.ui.ActionBar.g6.I.q()) {
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
        org.telegram.ui.Components.mm0 mm0Var = this.f40548c;
        if (mm0Var != null && this.F != null && this.N >= 0) {
            int i10 = this.O;
            mm0Var.K(0);
            this.F.h1(this.N, i10);
            this.N = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, w5 w5Var) {
        s20 s20Var = this.f40555y;
        FrameLayout frameLayout2 = (FrameLayout) s20Var.e;
        FrameLayout frameLayout3 = (FrameLayout) s20Var.d;
        ((TextView) s20Var.f39665b).setText(str);
        org.telegram.ui.Components.da0 da0Var = (org.telegram.ui.Components.da0) s20Var.f39666c;
        da0Var.setText(charSequence);
        da0Var.setMaxWidth(di.d4.a(da0Var.getText(), da0Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.z5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (w5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(w5Var, w7.z5.e(-1, -2, 1));
            frameLayout2.setClickable(w5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        s20Var.requestLayout();
    }

    public abstract s4.g0 n0();

    public u20 o0() {
        return new u20(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        x0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f40548c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        sg.x1 x1Var = this.e;
        if (x1Var != null) {
            x1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    public sg.x1 p0() {
        return new fi.f(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        di.ab abVar = new di.ab(this, context, 29);
        abVar.setTag(-33024);
        return abVar;
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
        org.telegram.ui.Components.mm0 mm0Var = this.f40548c;
        if (mm0Var != null && mm0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f40548c.getChildCount()) {
                    view = this.f40548c.getChildAt(i11);
                    this.f40548c.getClass();
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
        int measuredWidth = this.f40552s.getMeasuredWidth();
        int measuredHeight = this.f40552s.getMeasuredHeight();
        r20 r20Var = this.f40547b;
        r20Var.d(0, (-f7) - ((this.f40552s.getMeasuredWidth() * 0.1f) * this.f40550n), 0, measuredWidth, -f10, measuredHeight);
        return r20Var.f45117f;
    }

    public final void v0() {
        if (this.f40552s.getMeasuredWidth() != 0 && this.f40552s.getMeasuredHeight() != 0 && this.f40555y != null) {
            int measuredWidth = this.f40552s.getMeasuredWidth();
            int measuredHeight = this.f40552s.getMeasuredHeight();
            r20 r20Var = this.f40546a;
            r20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f40553w;
            canvas.save();
            canvas.scale(100.0f / this.f40552s.getMeasuredWidth(), 100.0f / this.f40552s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f40552s.getMeasuredWidth(), this.f40552s.getMeasuredHeight(), r20Var.f45117f);
            canvas.restore();
        }
    }

    public final void w0() {
        if (this.f40555y != null && this.actionBar != null) {
            this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.g6.Tj;
            kVar.D(org.telegram.ui.ActionBar.g6.x0(null, i10, false), false);
            this.actionBar.C(i0.a.k(org.telegram.ui.ActionBar.g6.x0(null, i10, false), 60), false);
            this.e.f45428a.g();
            s20 s20Var = this.f40555y;
            if (s20Var != null) {
                TextView textView = (TextView) s20Var.f39665b;
                if (this.M) {
                    int i11 = org.telegram.ui.ActionBar.g6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
                    ((org.telegram.ui.Components.da0) this.f40555y.f39666c).setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
                    ((org.telegram.ui.Components.da0) this.f40555y.f39666c).setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19660gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
                    ((org.telegram.ui.Components.da0) this.f40555y.f39666c).setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
                    ((org.telegram.ui.Components.da0) this.f40555y.f39666c).setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19660gc, false));
                }
            }
            v0();
        }
    }

    public final void x0(boolean z10) {
        if (z10 != this.f40549f) {
            this.f40549f = z10;
            this.e.setPaused(z10);
            this.f40552s.invalidate();
        }
    }

    public void s0(float f7) {
    }
}
