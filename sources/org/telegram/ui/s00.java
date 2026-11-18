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
import org.telegram.ui.ActionBar.ActionBarLayout;
public abstract class s00 extends org.telegram.ui.ActionBar.h2 {
    public ah.a E;
    public int F;
    public v4.c0 G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public final Paint L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final p00 f51832a;
    public final p00 f51833b;
    public org.telegram.ui.Components.ck0 f51834c;
    public Drawable d;
    public ug.u1 f51835e;
    public boolean f51836f;
    public boolean h;
    public float f51837n;
    public int f51838r;
    public r00 f51839s;
    public float f51840w;
    public final Canvas f51841x;
    public float f51842y;

    public s00() {
        super(null);
        int i7 = org.telegram.ui.ActionBar.n6.Gk;
        int i10 = org.telegram.ui.ActionBar.n6.Hk;
        int i11 = org.telegram.ui.ActionBar.n6.Ik;
        int i12 = org.telegram.ui.ActionBar.n6.Jk;
        this.f51832a = new p00(i7, i10, i11, i12, null, 0);
        p00 p00Var = new p00(i7, i10, i11, i12, null, 1);
        this.f51833b = p00Var;
        this.f51841x = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.F = -1;
        this.H = true;
        this.L = new Paint();
        p00Var.f58613n = true;
        this.Q = -1;
    }

    @Override
    public View createView(Context context) {
        int i7;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(2131232730).mutate();
        this.d = mutate;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29469h5);
        this.P = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).T0) {
            i7 = 0;
        } else {
            i7 = org.telegram.messenger.g0.f24115m;
        }
        this.J = i7;
        this.f51839s = new r00(this, getParentActivity());
        if (this.simpleActionBar == null) {
            org.telegram.ui.ActionBar.s4 s4Var2 = this.parentLayout;
            if (s4Var2 != null && ((ActionBarLayout) s4Var2).T0) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.actionBar.setAddToContainer(false);
        }
        this.f51834c = new org.telegram.ui.Components.ck0(context, null);
        v4.c0 l02 = l0(context);
        this.G = l02;
        this.f51834c.setLayoutManager(l02);
        v4.c0 c0Var = this.G;
        if (c0Var instanceof org.telegram.ui.Components.wy) {
            ((org.telegram.ui.Components.wy) c0Var).R = true;
        }
        v4.i0 k02 = k0();
        this.f51834c.setAdapter(k02);
        if (k02 instanceof org.telegram.ui.Components.z41) {
            org.telegram.ui.Components.ck0 ck0Var = this.f51834c;
            o00 o00Var = new o00(this, 0);
            int L = org.telegram.messenger.g0.L(12.0f);
            float L2 = org.telegram.messenger.g0.L(16.0f);
            ck0Var.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            Pair pair = new Pair(new hi.q4(ck0Var, o00Var, sparseIntArray, 3), new org.telegram.ui.Components.ui(sparseIntArray, 2));
            ck0Var.t1((org.telegram.messenger.y10) pair.first, (org.telegram.messenger.y10) pair.second, L, L2, true);
        } else {
            this.f51834c.setSections(true);
        }
        this.f51834c.setClipToPadding(false);
        this.f51834c.j(new g3(this, 12));
        this.E = new ah.a(context);
        r00 r00Var = this.f51839s;
        ug.u1 m0 = m0();
        this.f51835e = m0;
        r00Var.addView(m0, c8.ma.c(-2.0f, -1));
        this.f51839s.addView(this.E, c8.ma.c(-2.0f, -1));
        i0();
        this.f51839s.addView(p0());
        this.fragmentView = this.f51839s;
        dv dvVar = new dv(this, 6);
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        if (a5Var != null) {
            a5Var.setBackground(null);
            this.simpleActionBar.setBackButtonImage(2131231240);
            this.simpleActionBar.setActionBarMenuOnItemClick(dvVar);
            this.simpleActionBar.setForceSkipTouches(true);
        } else {
            this.actionBar.setBackground(null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setBackButtonImage(2131231240);
            this.actionBar.setActionBarMenuOnItemClick(dvVar);
            this.actionBar.setForceSkipTouches(true);
        }
        x0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.sa.a(new f6(9, this), org.telegram.ui.ActionBar.n6.Ck, org.telegram.ui.ActionBar.n6.Dk, org.telegram.ui.ActionBar.n6.Ek, org.telegram.ui.ActionBar.n6.Fk, org.telegram.ui.ActionBar.n6.Gk, org.telegram.ui.ActionBar.n6.Hk, org.telegram.ui.ActionBar.n6.Ik, org.telegram.ui.ActionBar.n6.Jk, org.telegram.ui.ActionBar.n6.Kk, org.telegram.ui.ActionBar.n6.Mk, org.telegram.ui.ActionBar.n6.Nk, org.telegram.ui.ActionBar.n6.Lk, org.telegram.ui.ActionBar.n6.Qk);
    }

    public void h0() {
        org.telegram.ui.Components.ck0 ck0Var = this.f51834c;
        if (ck0Var != null && this.G != null && this.Q >= 0) {
            int i7 = this.R;
            ck0Var.K(0);
            this.G.h1(this.Q, i7);
            this.Q = -1;
        }
    }

    public void i0() {
        this.f51839s.addView(this.f51834c, c8.ma.c(-1.0f, -1));
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.N && !org.telegram.ui.ActionBar.n6.I.q()) {
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

    public final void j0(String str, CharSequence charSequence, FrameLayout frameLayout, r5 r5Var) {
        ah.a aVar = this.E;
        FrameLayout frameLayout2 = (FrameLayout) aVar.f1056e;
        FrameLayout frameLayout3 = (FrameLayout) aVar.d;
        ((TextView) aVar.f1054b).setText(str);
        org.telegram.ui.Components.k80 k80Var = (org.telegram.ui.Components.k80) aVar.f1055c;
        k80Var.setText(charSequence);
        k80Var.setMaxWidth(hi.m3.a(k80Var.getText(), k80Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, c8.ma.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (r5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(r5Var, c8.ma.e(-1, -2, 1));
            frameLayout2.setClickable(r5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        aVar.requestLayout();
    }

    public abstract v4.i0 k0();

    public v4.c0 l0(Context context) {
        if (this.H) {
            return new org.telegram.ui.Components.wy((org.telegram.messenger.g0.L(68.0f) + this.J) - org.telegram.messenger.g0.L(16.0f), this.f51834c);
        }
        return new v4.c0();
    }

    public ug.u1 m0() {
        return new ki.f(getParentActivity(), 2);
    }

    public boolean n0() {
        return !(this instanceof di.pb);
    }

    public View o0(Context context) {
        uv uvVar = new uv(1, context, this);
        uvVar.setTag(-33024);
        return uvVar;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        y0(false);
    }

    @Override
    public void onInsets(int i7, int i10, int i11, int i12) {
        this.f51834c.setPadding(0, 0, 0, i12);
    }

    @Override
    public void onPause() {
        super.onPause();
        ug.u1 u1Var = this.f51835e;
        if (u1Var != null) {
            u1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f51835e.setPaused(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.f29469h5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.P) {
                this.P = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            ug.u1 u1Var = this.f51835e;
            if (u1Var != null && u1Var.f58919a != null && this.f51839s != null) {
                x0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final FrameLayout p0() {
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        if (a5Var != null) {
            return a5Var;
        }
        return this.actionBar;
    }

    public float q0() {
        return 0.0f;
    }

    public View r0() {
        return this.f51834c;
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
        y0(z10);
        return showDialog;
    }

    public void u0() {
        View view;
        int i7;
        org.telegram.ui.Components.ck0 ck0Var = this.f51834c;
        if (ck0Var != null && ck0Var.getChildCount() > 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f51834c.getChildCount()) {
                    view = this.f51834c.getChildAt(i10);
                    this.f51834c.getClass();
                    i7 = RecyclerView.R(view);
                    if (i7 >= 0 && view.getTop() < Integer.MAX_VALUE) {
                        view.getTop();
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    i7 = -1;
                    break;
                }
            }
            if (view != null) {
                this.Q = i7;
                this.R = view.getTop();
            }
        }
    }

    public final Paint v0(float f10, float f11) {
        int measuredWidth = this.f51839s.getMeasuredWidth();
        int measuredHeight = this.f51839s.getMeasuredHeight();
        p00 p00Var = this.f51833b;
        p00Var.d(0, (-f10) - ((this.f51839s.getMeasuredWidth() * 0.1f) * this.f51837n), 0, measuredWidth, -f11, measuredHeight);
        return p00Var.f58606f;
    }

    public final void w0() {
        if (this.f51839s.getMeasuredWidth() != 0 && this.f51839s.getMeasuredHeight() != 0 && this.E != null) {
            this.f51832a.d(0, 0.0f, 0, this.f51839s.getMeasuredWidth(), 0.0f, this.f51839s.getMeasuredHeight());
            Canvas canvas = this.f51841x;
            canvas.save();
            canvas.scale(100.0f / this.f51839s.getMeasuredWidth(), 100.0f / this.f51839s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f51839s.getMeasuredWidth(), this.f51839s.getMeasuredHeight(), this.f51832a.f58606f);
            canvas.restore();
        }
    }

    public final void x0() {
        if (this.E != null) {
            if (this.actionBar != null || this.simpleActionBar != null) {
                this.L.setColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29469h5));
                if (this.actionBar != null) {
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Kk, false);
                    if (x02 != this.O) {
                        this.O = x02;
                        this.actionBar.I(x02, false);
                    }
                    int o4 = i0.a.o(x02, 60);
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (kVar.f29092q0 != o4) {
                        kVar.G(o4, false);
                    }
                }
                this.f51835e.f58919a.g();
                ah.a aVar = this.E;
                if (aVar != null) {
                    TextView textView = (TextView) aVar.f1054b;
                    if (this.N) {
                        int i7 = org.telegram.ui.ActionBar.n6.G6;
                        textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
                        ((org.telegram.ui.Components.k80) this.E.f1055c).setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
                        ((org.telegram.ui.Components.k80) this.E.f1055c).setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
                    } else {
                        int i10 = org.telegram.ui.ActionBar.n6.Kk;
                        textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                        ((org.telegram.ui.Components.k80) this.E.f1055c).setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
                        ((org.telegram.ui.Components.k80) this.E.f1055c).setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
                    }
                }
                w0();
            }
        }
    }

    public final void y0(boolean z10) {
        if (z10 != this.f51836f) {
            this.f51836f = z10;
            this.f51835e.setPaused(z10);
            this.f51839s.invalidate();
        }
    }

    public boolean z0() {
        return this instanceof di.pb;
    }

    public void s0(boolean z10) {
    }

    public void t0(float f10) {
    }
}
