package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.tw;
public final class l extends FrameLayout {
    public org.telegram.ui.ActionBar.u5 D;
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    public final t5 O;
    public float P;
    public float Q;
    public gi0 R;
    public e S;
    public final float T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f49163a;
    public final org.telegram.ui.Components.t5 f49164a0;
    public int f49165b;
    public final tw f49166b0;
    public boolean f49167c;
    public boolean d;
    public org.telegram.ui.web.x0 e;
    public TLRPC.User f49168f;
    public TLRPC.Chat h;
    public final r8 f49169n;
    public final ImageReceiver f49170r;
    public final ImageReceiver f49171s;
    public final r8 f49172w;
    public boolean f49173x;
    public final FrameLayout f49174y;

    public l(tw twVar, Context context) {
        super(context);
        boolean z10;
        this.f49166b0 = twVar;
        this.f49169n = new r8((org.telegram.ui.ActionBar.p6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f49170r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f49171s = imageReceiver2;
        this.f49172w = new r8((org.telegram.ui.ActionBar.p6) null);
        this.f49173x = true;
        t5 t5Var = new t5(null, true);
        this.O = t5Var;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.T = 1.0f;
        this.f49164a0 = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        if (twVar.f49211b == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        t5Var.f49490o = z10;
        t5Var.D = true;
        imageReceiver.J0 = true;
        imageReceiver.f14425z1 = true;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f49174y = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.N) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, w7.b6.c(-2.0f, -1));
        imageReceiver.J0(org.telegram.messenger.i0.L(48.0f) / 2);
        imageReceiver2.J0(org.telegram.messenger.i0.L(48.0f) / 2);
    }

    public void setClipInParent(boolean z10) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z10);
        }
        if (getParent() != null && getParent().getParent() != null && getParent().getParent().getParent() != null) {
            ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z10);
        }
    }

    public final void b() {
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
        this.D = u5Var;
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        this.D.setGravity(17);
        this.D.setTextSize(11);
        this.D.setTextColor(m.a(this.f49166b0));
        at.i(this.D);
        this.D.setMaxLines(1);
        this.f49174y.addView(this.D, w7.b6.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f49170r.J0(org.telegram.messenger.i0.L(48.0f) / 2);
        this.f49171s.J0(org.telegram.messenger.i0.L(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f7, float f10, float f11) {
        int i10;
        tw twVar = this.f49166b0;
        int i11 = twVar.f49211b;
        Paint paint = twVar.G;
        e5 e5Var = twVar.f49232s;
        Paint paint2 = twVar.H;
        Drawable drawable = twVar.f49213c;
        if (this.F && !e5Var.K(this.E) && Utilities.x(e5Var.F(this.E))) {
            float L = f7 + org.telegram.messenger.i0.L(16.0f);
            float L2 = f10 + org.telegram.messenger.i0.L(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(f11, twVar.f(org.telegram.ui.ActionBar.t6.Vl)));
            if (i11 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.t6.r1(f11, twVar.f(org.telegram.ui.ActionBar.t6.f21207s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.t6.r1(f11, twVar.f(org.telegram.ui.ActionBar.t6.M8)));
            }
            canvas.drawCircle(L, L2, org.telegram.messenger.i0.L(11.0f), paint2);
            canvas.drawCircle(L, L2, org.telegram.messenger.i0.L(9.0f), paint);
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.t6.f21207s8;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.M8;
            }
            int f12 = twVar.f(i10);
            if (f12 != twVar.e) {
                twVar.e = f12;
                drawable.setColorFilter(new PorterDuffColorFilter(f12, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.setBounds((int) (L - (drawable.getIntrinsicWidth() / 2.0f)), (int) (L2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + L), (int) ((drawable.getIntrinsicHeight() / 2.0f) + L2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f7, float f10, float f11, boolean z10) {
        float i10;
        int i11;
        int i12 = (this.J > f7 ? 1 : (this.J == f7 ? 0 : -1));
        tw twVar = this.f49166b0;
        if (i12 != 0 || this.K != f10 || 0.0f != f11 || this.V != z10) {
            this.V = z10;
            this.J = f7;
            this.K = f10;
            invalidate();
            twVar.h.invalidate();
        }
        if (this.N) {
            i10 = 0.0f;
        } else {
            i10 = 1.0f - Utilities.i(twVar.N / twVar.B0, 1.0f, 0.0f);
        }
        this.Q = i10;
        float f12 = i10 * this.P;
        FrameLayout frameLayout = this.f49174y;
        frameLayout.setAlpha(f12);
        if (f12 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        frameLayout.setVisibility(i11);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: th.l.dispatchDraw(android.graphics.Canvas):void");
    }

    public float getCy() {
        float L = org.telegram.messenger.i0.L(26.33f);
        return org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(5.0f), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - L) / 2.0f, this.f49166b0.f49214c0) + (org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(48.0f), L, this.J) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.N || (this.f49163a && getParent() != null)) {
            ViewParent parent = getParent();
            tw twVar = this.f49166b0;
            g gVar = twVar.f49230r;
            if (parent == gVar) {
                gVar.invalidate();
            } else {
                twVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49170r.P();
        this.f49171s.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49170r.R();
        this.f49171s.R();
        this.O.g();
        org.telegram.ui.web.x0 x0Var = this.e;
        if (x0Var != null) {
            x0Var.a();
            this.e = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.N) {
            i12 = org.telegram.messenger.i0.L(70.0f);
        } else {
            i12 = this.f49166b0.M;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j10) {
        boolean z10;
        TLRPC.User user;
        int i10 = this.f49166b0.f49217f;
        if (this.I != j10) {
            this.I = j10;
            if (j10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.H = z10;
            ImageReceiver imageReceiver = this.f49171s;
            if (z10) {
                if (j10 > 0) {
                    TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(j10));
                    this.f49168f = Z1;
                    this.h = null;
                    user = Z1;
                } else {
                    TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(-j10));
                    this.h = L0;
                    this.f49168f = null;
                    user = L0;
                }
                if (user != null) {
                    r8 r8Var = this.f49172w;
                    r8Var.p(user);
                    imageReceiver.i0(user, r8Var, null);
                    return;
                }
                return;
            }
            imageReceiver.f();
        }
    }

    public void setDialogId(long r11) {
        throw new UnsupportedOperationException("Method not decompiled: th.l.setDialogId(long):void");
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        t5 t5Var = this.O;
        if (z10 && t5Var.H == null) {
            t5Var.H = new dc(this, 1.5f, 5.0f);
        }
        dc dcVar = t5Var.H;
        if (dcVar != null) {
            dcVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.N || (this.f49163a && getParent() != null)) {
            ViewParent parent = getParent();
            tw twVar = this.f49166b0;
            g gVar = twVar.f49230r;
            if (parent == gVar) {
                gVar.invalidate();
            }
            twVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
