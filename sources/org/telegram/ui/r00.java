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
public abstract class r00 extends org.telegram.ui.ActionBar.f2 {
    public ah.a D;
    public int E;
    public v4.b0 F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final Paint K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final n00 f49187a;
    public final n00 f49188b;
    public org.telegram.ui.Components.pj0 f49189c;
    public Drawable d;
    public ug.q1 f49190e;
    public boolean f49191f;
    public boolean h;
    public float f49192n;
    public int f49193r;
    public q00 f49194s;
    public float f49195w;
    public final Canvas f49196x;
    public float f49197y;

    public r00() {
        super(null);
        int i7 = org.telegram.ui.ActionBar.m6.Dk;
        int i10 = org.telegram.ui.ActionBar.m6.Ek;
        int i11 = org.telegram.ui.ActionBar.m6.Fk;
        int i12 = org.telegram.ui.ActionBar.m6.Gk;
        this.f49187a = new n00(i7, i10, i11, i12, null, 0);
        n00 n00Var = new n00(i7, i10, i11, i12, null, 1);
        this.f49188b = n00Var;
        this.f49196x = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));
        this.E = -1;
        this.G = true;
        this.K = new Paint();
        n00Var.f56884n = true;
        this.P = -1;
    }

    @Override
    public View createView(Context context) {
        int i7;
        this.hasOwnBackground = true;
        Rect rect = new Rect();
        Drawable mutate = context.getDrawable(2131232728).mutate();
        this.d = mutate;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.f27963h5);
        this.O = themedColor;
        mutate.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        this.d.getPadding(rect);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).S0) {
            i7 = 0;
        } else {
            i7 = org.telegram.messenger.g0.f22561m;
        }
        this.I = i7;
        this.f49194s = new q00(this, getParentActivity());
        if (this.simpleActionBar == null) {
            org.telegram.ui.ActionBar.r4 r4Var2 = this.parentLayout;
            if (r4Var2 != null && ((ActionBarLayout) r4Var2).S0) {
                this.actionBar.setOccupyStatusBar(false);
            }
            this.actionBar.setAddToContainer(false);
        }
        this.f49189c = new org.telegram.ui.Components.pj0(context, null);
        v4.b0 l02 = l0(context);
        this.F = l02;
        this.f49189c.setLayoutManager(l02);
        v4.b0 b0Var = this.F;
        if (b0Var instanceof org.telegram.ui.Components.ly) {
            ((org.telegram.ui.Components.ly) b0Var).R = true;
        }
        v4.g0 k02 = k0();
        this.f49189c.setAdapter(k02);
        if (k02 instanceof org.telegram.ui.Components.m41) {
            org.telegram.ui.Components.pj0 pj0Var = this.f49189c;
            m00 m00Var = new m00(this, 0);
            int L = org.telegram.messenger.g0.L(12.0f);
            float L2 = org.telegram.messenger.g0.L(16.0f);
            pj0Var.getClass();
            SparseIntArray sparseIntArray = new SparseIntArray();
            Pair pair = new Pair(new fi.u4(pj0Var, m00Var, sparseIntArray, 3), new org.telegram.ui.Components.ei(sparseIntArray, 2));
            pj0Var.t1((org.telegram.messenger.d20) pair.first, (org.telegram.messenger.d20) pair.second, L, L2, true);
        } else {
            this.f49189c.setSections(true);
        }
        this.f49189c.setClipToPadding(false);
        this.f49189c.j(new g3(this, 12));
        this.D = new ah.a(context);
        q00 q00Var = this.f49194s;
        ug.q1 m0 = m0();
        this.f49190e = m0;
        q00Var.addView(m0, c8.ha.c(-2.0f, -1));
        this.f49194s.addView(this.D, c8.ha.c(-2.0f, -1));
        i0();
        this.f49194s.addView(p0());
        this.fragmentView = this.f49194s;
        xx xxVar = new xx(this, 3);
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            z4Var.setBackground(null);
            this.simpleActionBar.setBackButtonImage(2131231240);
            this.simpleActionBar.setActionBarMenuOnItemClick(xxVar);
            this.simpleActionBar.setForceSkipTouches(true);
        } else {
            this.actionBar.setBackground(null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setBackButtonImage(2131231240);
            this.actionBar.setActionBarMenuOnItemClick(xxVar);
            this.actionBar.setForceSkipTouches(true);
        }
        x0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(9, this), org.telegram.ui.ActionBar.m6.zk, org.telegram.ui.ActionBar.m6.Ak, org.telegram.ui.ActionBar.m6.Bk, org.telegram.ui.ActionBar.m6.Ck, org.telegram.ui.ActionBar.m6.Dk, org.telegram.ui.ActionBar.m6.Ek, org.telegram.ui.ActionBar.m6.Fk, org.telegram.ui.ActionBar.m6.Gk, org.telegram.ui.ActionBar.m6.Hk, org.telegram.ui.ActionBar.m6.Jk, org.telegram.ui.ActionBar.m6.Kk, org.telegram.ui.ActionBar.m6.Ik, org.telegram.ui.ActionBar.m6.Nk);
    }

    public void h0() {
        org.telegram.ui.Components.pj0 pj0Var = this.f49189c;
        if (pj0Var != null && this.F != null && this.P >= 0) {
            int i7 = this.Q;
            pj0Var.K(0);
            this.F.h1(this.P, i7);
            this.P = -1;
        }
    }

    public void i0() {
        this.f49194s.addView(this.f49189c, c8.ha.c(-1.0f, -1));
    }

    @Override
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (this.M && !org.telegram.ui.ActionBar.m6.I.q()) {
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
        ah.a aVar = this.D;
        FrameLayout frameLayout2 = (FrameLayout) aVar.f1059e;
        FrameLayout frameLayout3 = (FrameLayout) aVar.d;
        ((TextView) aVar.f1057b).setText(str);
        org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) aVar.f1058c;
        w70Var.setText(charSequence);
        w70Var.setMaxWidth(fi.m3.a(w70Var.getText(), w70Var.getPaint()));
        if (frameLayout != null) {
            frameLayout3.removeAllViews();
            frameLayout3.addView(frameLayout, c8.ha.e(-1, -2, 1));
            frameLayout3.setClickable(frameLayout.isClickable());
        } else {
            frameLayout3.setClickable(false);
        }
        if (r5Var != null) {
            frameLayout2.removeAllViews();
            frameLayout2.addView(r5Var, c8.ha.e(-1, -2, 1));
            frameLayout2.setClickable(r5Var.isClickable());
        } else {
            frameLayout2.setClickable(false);
        }
        aVar.requestLayout();
    }

    public abstract v4.g0 k0();

    public v4.b0 l0(Context context) {
        if (this.G) {
            return new org.telegram.ui.Components.ly((org.telegram.messenger.g0.L(68.0f) + this.I) - org.telegram.messenger.g0.L(16.0f), this.f49189c);
        }
        return new v4.b0();
    }

    public ug.q1 m0() {
        return new hi.e(getParentActivity(), 2);
    }

    public boolean n0() {
        return !(this instanceof bi.dd);
    }

    public View o0(Context context) {
        o00 o00Var = new o00(0, context, this);
        o00Var.setTag(-33024);
        return o00Var;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        y0(false);
    }

    @Override
    public void onInsets(int i7, int i10, int i11, int i12) {
        this.f49189c.setPadding(0, 0, 0, i12);
    }

    @Override
    public void onPause() {
        super.onPause();
        ug.q1 q1Var = this.f49190e;
        if (q1Var != null) {
            q1Var.setPaused(true);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f49190e.setPaused(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.f27963h5);
            Drawable drawable = this.d;
            if (drawable != null && themedColor != this.O) {
                this.O = themedColor;
                drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            ug.q1 q1Var = this.f49190e;
            if (q1Var != null && q1Var.f56805a != null && this.f49194s != null) {
                x0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final FrameLayout p0() {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null) {
            return z4Var;
        }
        return this.actionBar;
    }

    public float q0() {
        return 0.0f;
    }

    public View r0() {
        return this.f49189c;
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        boolean z9;
        Dialog showDialog = super.showDialog(dialog);
        if (showDialog != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        y0(z9);
        return showDialog;
    }

    public void u0() {
        View view;
        int i7;
        org.telegram.ui.Components.pj0 pj0Var = this.f49189c;
        if (pj0Var != null && pj0Var.getChildCount() > 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f49189c.getChildCount()) {
                    view = this.f49189c.getChildAt(i10);
                    this.f49189c.getClass();
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
                this.P = i7;
                this.Q = view.getTop();
            }
        }
    }

    public final Paint v0(float f10, float f11) {
        int measuredWidth = this.f49194s.getMeasuredWidth();
        int measuredHeight = this.f49194s.getMeasuredHeight();
        n00 n00Var = this.f49188b;
        n00Var.d(0, (-f10) - ((this.f49194s.getMeasuredWidth() * 0.1f) * this.f49192n), 0, measuredWidth, -f11, measuredHeight);
        return n00Var.f56877f;
    }

    public final void w0() {
        if (this.f49194s.getMeasuredWidth() != 0 && this.f49194s.getMeasuredHeight() != 0 && this.D != null) {
            int measuredWidth = this.f49194s.getMeasuredWidth();
            int measuredHeight = this.f49194s.getMeasuredHeight();
            n00 n00Var = this.f49187a;
            n00Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.f49196x;
            canvas.save();
            canvas.scale(100.0f / this.f49194s.getMeasuredWidth(), 100.0f / this.f49194s.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.f49194s.getMeasuredWidth(), this.f49194s.getMeasuredHeight(), n00Var.f56877f);
            canvas.restore();
        }
    }

    public final void x0() {
        if (this.D != null) {
            if (this.actionBar != null || this.simpleActionBar != null) {
                this.K.setColor(getThemedColor(org.telegram.ui.ActionBar.m6.f27963h5));
                if (this.actionBar != null) {
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Hk, false);
                    if (x02 != this.N) {
                        this.N = x02;
                        this.actionBar.G(x02, false);
                    }
                    int o4 = i0.a.o(x02, 60);
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (lVar.f27694p0 != o4) {
                        lVar.E(o4, false);
                    }
                }
                this.f49190e.f56805a.g();
                ah.a aVar = this.D;
                if (aVar != null) {
                    TextView textView = (TextView) aVar.f1057b;
                    if (this.M) {
                        int i7 = org.telegram.ui.ActionBar.m6.G6;
                        textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
                        ((org.telegram.ui.Components.w70) this.D.f1058c).setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
                        ((org.telegram.ui.Components.w70) this.D.f1058c).setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Uc, false));
                    } else {
                        int i10 = org.telegram.ui.ActionBar.m6.Hk;
                        textView.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
                        ((org.telegram.ui.Components.w70) this.D.f1058c).setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
                        ((org.telegram.ui.Components.w70) this.D.f1058c).setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Uc, false));
                    }
                }
                w0();
            }
        }
    }

    public final void y0(boolean z9) {
        if (z9 != this.f49191f) {
            this.f49191f = z9;
            this.f49190e.setPaused(z9);
            this.f49194s.invalidate();
        }
    }

    public boolean z0() {
        return this instanceof bi.dd;
    }

    public void s0(boolean z9) {
    }

    public void t0(float f10) {
    }
}
