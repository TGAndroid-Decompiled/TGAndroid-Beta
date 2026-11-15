package tg;

import a8.t9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.nb1;
public abstract class j extends FrameLayout {
    public static final List f57373q0 = Arrays.asList(-90, 0, 90, 180);
    public boolean E;
    public boolean F;
    public h G;
    public PointF H;
    public i I;
    public final e J;
    public final UUID K;
    public boolean L;
    public int M;
    public int N;
    public nb1 O;
    public float P;
    public ValueAnimator Q;
    public ValueAnimator R;
    public int S;
    public int T;
    public final e U;
    public final e V;
    public int W;
    public final dc f57374a;
    public int f57375a0;
    public float f57376b;
    public ValueAnimator f57377b0;
    public float f57378c;
    public ValueAnimator f57379c0;
    public float d;
    public boolean f57380d0;
    public float f57381e;
    public boolean f57382e0;
    public float f57383f;
    public final float[] f57384f0;
    public final float[] f57385g0;
    public float h;
    public final float[] f57386h0;
    public float f57387i0;
    public float f57388j0;
    public float f57389k0;
    public ValueAnimator f57390l0;
    public boolean m0;
    public boolean f57391n;
    public ViewGroup f57392n0;
    public float f57393o0;
    public ValueAnimator f57394p0;
    public boolean f57395r;
    public boolean f57396s;
    public boolean f57397w;
    public boolean f57398x;
    public boolean f57399y;

    public j(Context context, PointF pointF) {
        super(context);
        this.f57374a = new dc(this);
        this.f57391n = false;
        this.f57395r = false;
        this.f57396s = false;
        this.f57397w = false;
        this.f57398x = false;
        this.f57399y = false;
        this.E = false;
        this.F = false;
        this.J = new Runnable(this) {
            public final j f57214b;

            {
                this.f57214b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f57214b;
                        jVar.F = true;
                        if (jVar.G != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.G.f(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f57214b.n();
                        return;
                    default:
                        this.f57214b.o();
                        return;
                }
            }
        };
        this.L = true;
        this.M = 0;
        this.N = -1;
        this.S = 0;
        this.T = 0;
        this.U = new Runnable(this) {
            public final j f57214b;

            {
                this.f57214b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f57214b;
                        jVar.F = true;
                        if (jVar.G != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.G.f(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f57214b.n();
                        return;
                    default:
                        this.f57214b.o();
                        return;
                }
            }
        };
        this.V = new Runnable(this) {
            public final j f57214b;

            {
                this.f57214b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f57214b;
                        jVar.F = true;
                        if (jVar.G != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.G.f(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f57214b.n();
                        return;
                    default:
                        this.f57214b.o();
                        return;
                }
            }
        };
        this.f57384f0 = new float[2];
        this.f57385g0 = new float[2];
        this.f57386h0 = new float[2];
        this.f57387i0 = 1.0f;
        this.m0 = false;
        this.f57393o0 = 1.0f;
        this.K = UUID.randomUUID();
        this.H = pointF;
    }

    public abstract i a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f10, float f11, float f12, float f13, boolean z10) {
        float f14;
        float f15;
        float f16;
        boolean z11;
        float f17;
        boolean z12;
        boolean z13;
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            if (z10) {
                f14 = (f10 + f12) / 2.0f;
            } else {
                f14 = f10;
            }
            if (z10) {
                f15 = (f11 + f13) / 2.0f;
            } else {
                f15 = f11;
            }
            float f18 = (f14 - this.f57383f) / scaleX;
            float f19 = (f15 - this.h) / scaleX;
            float hypot = (float) Math.hypot(f18, f19);
            if (this.f57391n) {
                f16 = 6.0f;
            } else {
                f16 = 16.0f;
            }
            if (hypot > f16 || z10) {
                org.telegram.messenger.g0.r(this.J);
                e(f18, f19);
                if (z10) {
                    float a10 = t9.a(f10, f11, f12, f13);
                    float a11 = t9.a(this.f57376b, this.f57378c, this.d, this.f57381e);
                    if (a11 > 0.0f) {
                        j(a10 / a11);
                    }
                    f(this.f57388j0 + ((float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12) - Math.atan2(this.f57378c - this.f57381e, this.f57376b - this.d))));
                }
                this.f57376b = f10;
                this.f57378c = f11;
                this.f57383f = f14;
                this.h = f15;
                if (z10) {
                    this.d = f12;
                    this.f57381e = f13;
                }
                this.f57391n = true;
                if ((getParent() instanceof d) && (this.S != 0 || this.T != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.f57397w && (hVar4 = this.G) != null) {
                    this.f57397w = true;
                    hVar4.C();
                }
                if (!this.f57398x && z10 && (hVar3 = this.G) != null) {
                    this.f57398x = true;
                    hVar3.h();
                }
                if (this.f57398x && !z10 && (hVar2 = this.G) != null) {
                    this.f57398x = false;
                    hVar2.g();
                }
                if (!this.m0 && !this.f57399y && (hVar = this.G) != null) {
                    hVar.u(this);
                    this.f57399y = true;
                }
                h hVar5 = this.G;
                if (hVar5 != null) {
                    if (i20.v(getHeight(), 2.0f, scaleX, this.H.y) < org.telegram.messenger.g0.L(66.0f)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    hVar5.B(z12);
                    h hVar6 = this.G;
                    if (com.google.android.gms.internal.vision.e2.c(getHeight(), 2.0f, scaleX, this.H.y) > ((View) getParent()).getHeight() - org.telegram.messenger.g0.L(114.0f)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    hVar6.d(z13);
                }
                h hVar7 = this.G;
                if ((hVar7 == null || hVar7.p()) && !z10 && t9.a(f14, f15, ((View) getParent()).getWidth() / 2.0f, ((View) getParent()).getHeight() - org.telegram.messenger.g0.L(76.0f)) < org.telegram.messenger.g0.L(32.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.E != z11) {
                    ValueAnimator valueAnimator = this.f57394p0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f57394p0 = null;
                    }
                    float f20 = this.f57393o0;
                    if (z11) {
                        f17 = 0.5f;
                    } else {
                        f17 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f20, f17);
                    this.f57394p0 = ofFloat;
                    ofFloat.addUpdateListener(new f(this, 1));
                    this.f57394p0.setInterpolator(er.h);
                    this.f57394p0.setDuration(280L);
                    this.f57394p0.start();
                    this.E = z11;
                    h hVar8 = this.G;
                    if (hVar8 != null) {
                        hVar8.j(z11);
                    }
                }
                this.f57374a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        h hVar;
        h hVar2;
        if (this.f57397w) {
            this.G.e(this.E);
            this.f57397w = false;
        }
        this.f57398x = false;
        if (!z10 && !this.F && !this.f57391n && !this.f57396s && !this.f57399y && (hVar2 = this.G) != null) {
            hVar2.u(this);
        }
        if (this.f57391n && (hVar = this.G) != null) {
            hVar.B(false);
            this.G.d(false);
        }
        org.telegram.messenger.g0.r(this.J);
        this.F = false;
        this.f57391n = false;
        this.f57396s = false;
        this.f57395r = true;
        this.f57399y = false;
        this.N = this.M;
        nb1 nb1Var = this.O;
        if (nb1Var != null) {
            org.telegram.messenger.g0.r(nb1Var);
            this.O = null;
        }
        this.W = this.S;
        org.telegram.messenger.g0.r(this.U);
        this.f57375a0 = this.T;
        org.telegram.messenger.g0.r(this.V);
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float a10 = this.f57374a.a(getBounceScale());
        canvas.save();
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof r1) {
                float f10 = this.f57393o0;
                canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - org.telegram.messenger.g0.L(76.0f)) - getY();
                float f11 = this.f57393o0;
                canvas.scale(f11, f11, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: tg.j.e(float, float):void");
    }

    public final void f(float f10) {
        if (this.S != 0) {
            this.W = 0;
            n();
        }
        if (this.T != 0) {
            this.f57375a0 = 0;
            o();
        }
        this.f57388j0 = f10;
        boolean z10 = this.L;
        if (!z10 && !this.f57380d0) {
            Iterator it = f57373q0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f10) < 4.0f) {
                    if (this.N != intValue) {
                        this.N = intValue;
                        nb1 nb1Var = this.O;
                        if (nb1Var != null) {
                            org.telegram.messenger.g0.r(nb1Var);
                        }
                        nb1 nb1Var2 = new nb1(this, intValue, 9);
                        this.O = nb1Var2;
                        org.telegram.messenger.g0.i3(nb1Var2, 250L);
                    }
                }
            }
        } else if (z10) {
            if (Math.abs(this.M - f10) < 12.0f && !this.f57380d0) {
                if (this.Q != null) {
                    f10 = this.P;
                } else {
                    f10 = this.M;
                }
            } else {
                this.N = -1;
                nb1 nb1Var3 = this.O;
                if (nb1Var3 != null) {
                    org.telegram.messenger.g0.r(nb1Var3);
                    this.O = null;
                }
                ValueAnimator valueAnimator = this.Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.R;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.R = duration;
                duration.setInterpolator(er.f34419f);
                this.R.addUpdateListener(new f(this, 0));
                this.R.addListener(new g(this, 3));
                this.R.start();
                this.L = false;
            }
        }
        ValueAnimator valueAnimator3 = this.R;
        if (valueAnimator3 != null) {
            f10 = org.telegram.messenger.g0.b2(0.0f, f10, valueAnimator3.getAnimatedFraction());
        }
        g(f10);
    }

    public final void g(float f10) {
        setRotation(f10);
        if (this.S != 0 || this.T != 0) {
            k();
        }
        m();
    }

    public float getBounceScale() {
        return 0.04f;
    }

    public float getMaxScale() {
        return 100.0f;
    }

    public float getMinScale() {
        return 0.0f;
    }

    public PointF getPosition() {
        return this.H;
    }

    public float getPositionX() {
        float f10;
        float f11 = this.H.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i7 = this.S;
            if (i7 == 1) {
                f10 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + org.telegram.messenger.g0.L(8.0f);
            } else if (i7 == 2) {
                f10 = view.getMeasuredWidth() / 2.0f;
            } else if (i7 == 3) {
                f10 = (view.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.f57377b0;
            if (valueAnimator != null) {
                return org.telegram.messenger.g0.T1(f11, f10, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f10 != 0.0f) {
                return f10;
            }
        }
        return f11;
    }

    public float getPositionY() {
        float f10;
        float f11 = this.H.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i7 = this.T;
            if (i7 == 1) {
                f10 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + org.telegram.messenger.g0.L(64.0f);
            } else if (i7 == 2) {
                f10 = view.getMeasuredHeight() / 2.0f;
            } else if (i7 == 3) {
                f10 = (view.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.f57379c0;
            if (valueAnimator != null) {
                return org.telegram.messenger.g0.T1(f11, f10, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f10 != 0.0f) {
                return f10;
            }
        }
        return f11;
    }

    public float getScale() {
        return getScaleX();
    }

    public pi0 getSelectionBounds() {
        return new pi0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public float getStickyPaddingBottom() {
        return 0.0f;
    }

    public float getStickyPaddingLeft() {
        return 0.0f;
    }

    public float getStickyPaddingRight() {
        return 0.0f;
    }

    public float getStickyPaddingTop() {
        return 0.0f;
    }

    public final int getStickyX() {
        return this.S;
    }

    public final int getStickyY() {
        return this.T;
    }

    public UUID getUUID() {
        return this.K;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.f57377b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.f57377b0 = duration;
        duration.setInterpolator(er.f34419f);
        this.f57377b0.addUpdateListener(new f(this, 3));
        this.f57377b0.addListener(new g(this, 0));
        this.f57377b0.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.f57379c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.f57379c0 = duration;
        duration.setInterpolator(er.f34419f);
        this.f57379c0.addUpdateListener(new f(this, 4));
        this.f57379c0.addListener(new g(this, 1));
        this.f57379c0.start();
    }

    @Override
    public final boolean isSelected() {
        return this.m0;
    }

    public final void j(float f10) {
        boolean z10;
        float f11 = this.f57387i0;
        float f12 = f10 * f11;
        this.f57387i0 = f12;
        float i7 = Utilities.i(Math.max(f12, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof q1)) {
            boolean z11 = false;
            if (i7 < getMaxScale() && i7 > getMinScale()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (f11 >= getMaxScale() || f11 <= getMinScale()) {
                z11 = true;
            }
            if (z10 != z11) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(i7);
        setScaleY(i7);
    }

    public void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
    }

    public final void l(ViewGroup viewGroup, boolean z10) {
        if (this.m0 != z10) {
            this.m0 = z10;
            ValueAnimator valueAnimator = this.f57390l0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f57390l0 = null;
            }
            float f10 = 0.0f;
            if (this.I == null) {
                if (z10 || viewGroup != null) {
                    i a10 = a();
                    this.I = a10;
                    a10.f57339f = !this.f57380d0;
                    a10.invalidate();
                    viewGroup.addView(this.I);
                    this.f57389k0 = 0.0f;
                } else {
                    return;
                }
            }
            this.I.b();
            float f11 = this.f57389k0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f57390l0 = ofFloat;
            ofFloat.addUpdateListener(new f(this, 2));
            this.f57390l0.addListener(new g(this, 4));
            this.f57390l0.setDuration(280L);
            this.f57390l0.setInterpolator(er.h);
            this.f57390l0.start();
        }
    }

    public final void m() {
        i iVar = this.I;
        if (iVar != null) {
            iVar.b();
        }
    }

    public final void n() {
        org.telegram.messenger.g0.r(this.U);
        int i7 = this.S;
        int i10 = this.W;
        if (i7 == i10) {
            return;
        }
        this.S = i10;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.f57377b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.W == 0) {
            h(1.0f, 0.0f);
            return;
        }
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        h(0.0f, 1.0f);
    }

    public final void o() {
        org.telegram.messenger.g0.r(this.V);
        int i7 = this.T;
        int i10 = this.f57375a0;
        if (i7 == i10) {
            return;
        }
        this.T = i10;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.f57379c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f57375a0 == 0) {
            i(1.0f, 0.0f);
            return;
        }
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        i(0.0f, 1.0f);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.G.q();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: tg.j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(h hVar) {
        this.G = hVar;
    }

    public void setPosition(PointF pointF) {
        this.H = pointF;
        k();
    }

    public void setScale(float f10) {
        this.f57387i0 = f10;
        setScaleX(f10);
        setScaleY(f10);
    }

    public void setSelectionVisibility(boolean z10) {
        int i7;
        i iVar = this.I;
        if (iVar == null) {
            return;
        }
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        iVar.setVisibility(i7);
    }

    public void setStickyX(int i7) {
        this.W = i7;
        this.S = i7;
    }

    public void setStickyY(int i7) {
        this.f57375a0 = i7;
        this.T = i7;
    }

    public void setIsVideo(boolean z10) {
    }
}
