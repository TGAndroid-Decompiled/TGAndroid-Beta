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
public abstract class r20 extends org.telegram.ui.ActionBar.n2 {
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
    public final n20 f37045a;
    public final n20 f37046b;
    public org.telegram.ui.Components.yl0 f37047c;
    public Drawable d;
    public rg.w1 e;
    public boolean f37048f;
    public boolean h;
    public float f37049n;
    public int f37050r;
    public q20 f37051s;
    public float v;
    public final Canvas f37052w;
    public float f37053x;
    public o20 f37054y;

    public r20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.j6.Pj;
        int i11 = org.telegram.ui.ActionBar.j6.Qj;
        int i12 = org.telegram.ui.ActionBar.j6.Rj;
        int i13 = org.telegram.ui.ActionBar.j6.Sj;
        this.f37045a = new n20(i10, i11, i12, i13, null, 0);
        n20 n20Var = new n20(i10, i11, i12, i13, null, 1);
        this.f37046b = n20Var;
        this.f37052w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        n20Var.f42882n = true;
        this.N = -1;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.f19180h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.I = i10;
        this.f37051s = o0();
        org.telegram.ui.ActionBar.d5 d5Var2 = this.parentLayout;
        if (d5Var2 != null && ((ActionBarLayout) d5Var2).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f37047c = new org.telegram.ui.Components.yl0(context, null);
        if (this.G) {
            this.F = new org.telegram.ui.Components.pz(this.f37047c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        } else {
            this.F = new s4.c0();
        }
        this.f37047c.setLayoutManager(this.F);
        s4.c0 c0Var = this.F;
        if (c0Var instanceof org.telegram.ui.Components.pz) {
            ((org.telegram.ui.Components.pz) c0Var).R = true;
        }
        s4.h0 n02 = n0();
        this.f37047c.setAdapter(n02);
        if (n02 instanceof org.telegram.ui.Components.m61) {
            org.telegram.ui.Components.yl0 yl0Var = this.f37047c;
            m20 m20Var = new m20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            org.telegram.ui.Components.yl0 yl0Var2 = this.f37047c;
            Objects.requireNonNull(yl0Var2);
            yl0Var.s1(m20Var, dp, dp2, new fu(yl0Var2, 11), true);
        } else {
            this.f37047c.setSections(true);
        }
        this.f37047c.setClipToPadding(false);
        this.f37047c.j(new h3(this, 11));
        this.f37054y = new o20(context);
        q20 q20Var = this.f37051s;
        rg.w1 p02 = p0();
        this.e = p02;
        q20Var.addView(p02, w7.y5.c(-2.0f, -1));
        this.f37051s.addView(this.f37054y, w7.y5.c(-2.0f, -1));
        this.f37051s.addView(this.f37047c, w7.y5.c(-1.0f, -1));
        this.f37051s.addView(this.actionBar);
        this.fragmentView = this.f37051s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 25));
        this.actionBar.setForceSkipTouches(true);
        v0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.b6.a(new e(this, 15), org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, org.telegram.ui.ActionBar.j6.Nj, org.telegram.ui.ActionBar.j6.Oj, org.telegram.ui.ActionBar.j6.Pj, org.telegram.ui.ActionBar.j6.Qj, org.telegram.ui.ActionBar.j6.Rj, org.telegram.ui.ActionBar.j6.Sj, org.telegram.ui.ActionBar.j6.Tj, org.telegram.ui.ActionBar.j6.Vj, org.telegram.ui.ActionBar.j6.Wj, org.telegram.ui.ActionBar.j6.Uj, org.telegram.ui.ActionBar.j6.Zj);
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
        org.telegram.ui.Components.yl0 yl0Var = this.f37047c;
        if (yl0Var != null && this.F != null && this.N >= 0) {
            int i10 = this.O;
            yl0Var.L(0);
            this.F.h1(this.N, i10);
            this.N = -1;
        }
    }

    public final void m0(String str, CharSequence charSequence, FrameLayout frameLayout, s5 s5Var) {
        o20 o20Var = this.f37054y;
        FrameLayout frameLayout2 = (FrameLayout) o20Var.e;
        FrameLayout frameLayout3 = (FrameLayout) o20Var.d;
        ((TextView) o20Var.f36187b).setText(str);
        org.telegram.ui.Components.n90 n90Var = (org.telegram.ui.Components.n90) o20Var.f36188c;
        n90Var.setText(charSequence);
        n90Var.setMaxWidth(ci.f4.a(n90Var.getText(), n90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.y5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (s5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(s5Var, w7.y5.e(-1, -2, 1));
            frameLayout2.setClickable(s5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        o20Var.requestLayout();
    }

    public abstract s4.h0 n0();

    public q20 o0() {
        return new q20(this, getParentActivity());
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f37047c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        rg.w1 w1Var = this.e;
        if (w1Var != null) {
            w1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.e.setPaused(false);
    }

    public rg.w1 p0() {
        return new ei.f(getParentActivity(), 2);
    }

    public boolean q0() {
        return true;
    }

    public View r0(Context context) {
        ci.eb ebVar = new ci.eb(this, context, 29);
        ebVar.setTag(-33024);
        return ebVar;
    }

    public final void s0() {
        View view;
        int i10;
        org.telegram.ui.Components.yl0 yl0Var = this.f37047c;
        if (yl0Var != null && yl0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f37047c.getChildCount()) {
                    view = this.f37047c.getChildAt(i11);
                    this.f37047c.getClass();
                    i10 = RecyclerView.S(view);
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
        int measuredWidth = this.f37051s.getMeasuredWidth();
        int measuredHeight = this.f37051s.getMeasuredHeight();
        n20 n20Var = this.f37046b;
        n20Var.d(0, (-f7) - ((this.f37051s.getMeasuredWidth() * 0.1f) * this.f37049n), 0, measuredWidth, -f10, measuredHeight);
        return n20Var.f42875f;
    }

    public final void u0() {
        if (this.f37051s.getMeasuredWidth() != 0 && this.f37051s.getMeasuredHeight() != 0 && this.f37054y != null) {
            int measuredWidth = this.f37051s.getMeasuredWidth();
            int measuredHeight = this.f37051s.getMeasuredHeight();
            n20 n20Var = this.f37045a;
            n20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f37052w;
            canvas.save();
            canvas.scale(100.0f / this.f37051s.getMeasuredWidth(), 100.0f / this.f37051s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f37051s.getMeasuredWidth(), this.f37051s.getMeasuredHeight(), n20Var.f42875f);
            canvas.restore();
        }
    }

    public final void v0() {
        if (this.f37054y != null && this.actionBar != null) {
            this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19180h5));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.j6.Tj;
            kVar.B(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
            this.actionBar.A(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 60), false);
            this.e.f42850a.g();
            o20 o20Var = this.f37054y;
            if (o20Var != null) {
                TextView textView = (TextView) o20Var.f36187b;
                if (this.M) {
                    int i11 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    ((org.telegram.ui.Components.n90) this.f37054y.f36188c).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    ((org.telegram.ui.Components.n90) this.f37054y.f36188c).setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    ((org.telegram.ui.Components.n90) this.f37054y.f36188c).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    ((org.telegram.ui.Components.n90) this.f37054y.f36188c).setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
                }
            }
            u0();
        }
    }

    public final void w0(boolean z10) {
        if (z10 != this.f37048f) {
            this.f37048f = z10;
            this.e.setPaused(z10);
            this.f37051s.invalidate();
        }
    }
}
