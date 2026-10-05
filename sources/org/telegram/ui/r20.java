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
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
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
    public final m20 f39948a;
    public final m20 f39949b;
    public org.telegram.ui.Components.zl0 f39950c;
    public Drawable d;
    public rg.y1 f39951e;
    public boolean f39952f;
    public boolean h;
    public float f39953n;
    public int f39954r;
    public q20 f39955s;
    public float v;
    public final Canvas f39956w;
    public float f39957x;
    public o20 f39958y;

    public r20() {
        super(null);
        int i10 = org.telegram.ui.ActionBar.i6.Pj;
        int i11 = org.telegram.ui.ActionBar.i6.Qj;
        int i12 = org.telegram.ui.ActionBar.i6.Rj;
        int i13 = org.telegram.ui.ActionBar.i6.Sj;
        this.f39948a = new m20(i10, i11, i12, i13, null, 0);
        m20 m20Var = new m20(i10, i11, i12, i13, null, 1);
        this.f39949b = m20Var;
        this.f39956w = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        m20Var.f46059n = true;
        this.N = -1;
    }

    public final void A0(boolean z10) {
        if (z10 != this.f39952f) {
            this.f39952f = z10;
            this.f39951e.setPaused(z10);
            this.f39955s.invalidate();
        }
    }

    public boolean B0() {
        return this instanceof yh.z7;
    }

    @Override
    public View createView(Context context) {
        int i10;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5), PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && ((ActionBarLayout) c5Var).M0) {
            i10 = 0;
        } else {
            i10 = AndroidUtilities.statusBarHeight;
        }
        this.I = i10;
        this.f39955s = new q20(this, getParentActivity());
        org.telegram.ui.ActionBar.c5 c5Var2 = this.parentLayout;
        if (c5Var2 != null && ((ActionBarLayout) c5Var2).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.f39950c = new org.telegram.ui.Components.zl0(context, null);
        s4.c0 p02 = p0(context);
        this.F = p02;
        this.f39950c.setLayoutManager(p02);
        s4.c0 c0Var = this.F;
        if (c0Var instanceof org.telegram.ui.Components.sz) {
            ((org.telegram.ui.Components.sz) c0Var).R = true;
        }
        s4.h0 o02 = o0();
        this.f39950c.setAdapter(o02);
        if (o02 instanceof org.telegram.ui.Components.w61) {
            org.telegram.ui.Components.zl0 zl0Var = this.f39950c;
            l20 l20Var = new l20(this, 0);
            int dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(16.0f);
            zl0Var.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            Pair pair = new Pair(new ci.o5(zl0Var, l20Var, sparseIntArray, 3), new org.telegram.ui.Components.zi(sparseIntArray, 2));
            zl0Var.t1((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, dp, dp2, true);
        } else {
            this.f39950c.setSections(true);
        }
        this.f39950c.setClipToPadding(false);
        this.f39950c.j(new i3(this, 12));
        this.f39958y = new o20(context);
        q20 q20Var = this.f39955s;
        rg.y1 q02 = q0();
        this.f39951e = q02;
        q20Var.addView(q02, w7.z5.c(-2.0f, -1));
        this.f39955s.addView(this.f39958y, w7.z5.c(-2.0f, -1));
        m0();
        this.f39955s.addView(this.actionBar);
        this.fragmentView = this.f39955s;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 25));
        this.actionBar.setForceSkipTouches(true);
        z0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new e(this, 15), org.telegram.ui.ActionBar.i6.Lj, org.telegram.ui.ActionBar.i6.Mj, org.telegram.ui.ActionBar.i6.Nj, org.telegram.ui.ActionBar.i6.Oj, org.telegram.ui.ActionBar.i6.Pj, org.telegram.ui.ActionBar.i6.Qj, org.telegram.ui.ActionBar.i6.Rj, org.telegram.ui.ActionBar.i6.Sj, org.telegram.ui.ActionBar.i6.Tj, org.telegram.ui.ActionBar.i6.Vj, org.telegram.ui.ActionBar.i6.Wj, org.telegram.ui.ActionBar.i6.Uj, org.telegram.ui.ActionBar.i6.Zj);
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.M && !org.telegram.ui.ActionBar.i6.I.q()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public void l0() {
        org.telegram.ui.Components.zl0 zl0Var = this.f39950c;
        if (zl0Var != null && this.F != null && this.N >= 0) {
            int i10 = this.O;
            zl0Var.K(0);
            this.F.h1(this.N, i10);
            this.N = -1;
        }
    }

    public void m0() {
        this.f39955s.addView(this.f39950c, w7.z5.c(-1.0f, -1));
    }

    public final void n0(String str, CharSequence charSequence, FrameLayout frameLayout, t5 t5Var) {
        o20 o20Var = this.f39958y;
        FrameLayout frameLayout2 = (FrameLayout) o20Var.f39087e;
        FrameLayout frameLayout3 = (FrameLayout) o20Var.d;
        ((TextView) o20Var.f39085b).setText(str);
        org.telegram.ui.Components.q90 q90Var = (org.telegram.ui.Components.q90) o20Var.f39086c;
        q90Var.setText(charSequence);
        q90Var.setMaxWidth(ci.e4.a(q90Var.getText(), q90Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, w7.z5.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (t5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(t5Var, w7.z5.e(-1, -2, 1));
            frameLayout2.setClickable(t5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        o20Var.requestLayout();
    }

    public abstract s4.h0 o0();

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        A0(false);
    }

    @Override
    public void onInsets(int i10, int i11, int i12, int i13) {
        this.f39950c.setPadding(0, 0, 0, i13);
    }

    @Override
    public void onPause() {
        super.onPause();
        rg.y1 y1Var = this.f39951e;
        if (y1Var != null) {
            y1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f39951e.setPaused(false);
    }

    public s4.c0 p0(Context context) {
        if (this.G) {
            return new org.telegram.ui.Components.sz(this.f39950c, (AndroidUtilities.dp(68.0f) + this.I) - AndroidUtilities.dp(16.0f));
        }
        return new s4.c0();
    }

    public rg.y1 q0() {
        return new ei.g(getParentActivity(), 2);
    }

    public boolean r0() {
        return !(this instanceof yh.z7);
    }

    public View s0(Context context) {
        n20 n20Var = new n20(this, context, 0);
        n20Var.setTag(-33024);
        return n20Var;
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
        A0(z10);
        return showDialog;
    }

    public float t0() {
        return 0.0f;
    }

    public View u0() {
        return this.f39950c;
    }

    public void w0() {
        View view;
        int i10;
        org.telegram.ui.Components.zl0 zl0Var = this.f39950c;
        if (zl0Var != null && zl0Var.getChildCount() > 0) {
            int i11 = 0;
            while (true) {
                if (i11 < this.f39950c.getChildCount()) {
                    view = this.f39950c.getChildAt(i11);
                    this.f39950c.getClass();
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

    public final Paint x0(float f7, float f10) {
        int measuredWidth = this.f39955s.getMeasuredWidth();
        int measuredHeight = this.f39955s.getMeasuredHeight();
        m20 m20Var = this.f39949b;
        m20Var.d(0, (-f7) - ((this.f39955s.getMeasuredWidth() * 0.1f) * this.f39953n), 0, measuredWidth, -f10, measuredHeight);
        return m20Var.f46052f;
    }

    public final void y0() {
        if (this.f39955s.getMeasuredWidth() != 0 && this.f39955s.getMeasuredHeight() != 0 && this.f39958y != null) {
            int measuredWidth = this.f39955s.getMeasuredWidth();
            int measuredHeight = this.f39955s.getMeasuredHeight();
            m20 m20Var = this.f39948a;
            m20Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f39956w;
            canvas.save();
            canvas.scale(100.0f / this.f39955s.getMeasuredWidth(), 100.0f / this.f39955s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f39955s.getMeasuredWidth(), this.f39955s.getMeasuredHeight(), m20Var.f46052f);
            canvas.restore();
        }
    }

    public final void z0() {
        if (this.f39958y != null && this.actionBar != null) {
            this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20899h5));
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.i6.Tj;
            kVar.A(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
            this.actionBar.z(i0.a.k(org.telegram.ui.ActionBar.i6.w0(null, i10, false), 60), false);
            this.f39951e.f46407a.g();
            o20 o20Var = this.f39958y;
            if (o20Var != null) {
                TextView textView = (TextView) o20Var.f39085b;
                if (this.M) {
                    int i11 = org.telegram.ui.ActionBar.i6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                    ((org.telegram.ui.Components.q90) this.f39958y.f39086c).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                    ((org.telegram.ui.Components.q90) this.f39958y.f39086c).setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
                } else {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                    ((org.telegram.ui.Components.q90) this.f39958y.f39086c).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                    ((org.telegram.ui.Components.q90) this.f39958y.f39086c).setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.gc, false));
                }
            }
            y0();
        }
    }

    public void v0(boolean z10) {
    }
}
