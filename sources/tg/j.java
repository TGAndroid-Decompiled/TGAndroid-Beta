package tg;

import a8.r9;
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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.xq;
public abstract class j extends FrameLayout {
    public static final List f55675p0 = Arrays.asList(-90, 0, 90, 180);
    public boolean D;
    public boolean E;
    public h F;
    public PointF G;
    public i H;
    public final e I;
    public final UUID J;
    public boolean K;
    public int L;
    public int M;
    public org.telegram.ui.Wallet.h2 N;
    public float O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public int R;
    public int S;
    public final e T;
    public final e U;
    public int V;
    public int W;
    public final ic f55676a;
    public ValueAnimator f55677a0;
    public float f55678b;
    public ValueAnimator f55679b0;
    public float f55680c;
    public boolean f55681c0;
    public float d;
    public boolean f55682d0;
    public float f55683e;
    public final float[] f55684e0;
    public float f55685f;
    public final float[] f55686f0;
    public final float[] f55687g0;
    public float h;
    public float f55688h0;
    public float f55689i0;
    public float f55690j0;
    public ValueAnimator f55691k0;
    public boolean f55692l0;
    public ViewGroup m0;
    public boolean f55693n;
    public float f55694n0;
    public ValueAnimator f55695o0;
    public boolean f55696r;
    public boolean f55697s;
    public boolean f55698w;
    public boolean f55699x;
    public boolean f55700y;

    public j(Context context, PointF pointF) {
        super(context);
        this.f55676a = new ic(this);
        this.f55693n = false;
        this.f55696r = false;
        this.f55697s = false;
        this.f55698w = false;
        this.f55699x = false;
        this.f55700y = false;
        this.D = false;
        this.E = false;
        this.I = new Runnable(this) {
            public final j f55542b;

            {
                this.f55542b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f55542b;
                        jVar.E = true;
                        if (jVar.F != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.F.f(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f55542b.n();
                        return;
                    default:
                        this.f55542b.o();
                        return;
                }
            }
        };
        this.K = true;
        this.L = 0;
        this.M = -1;
        this.R = 0;
        this.S = 0;
        this.T = new Runnable(this) {
            public final j f55542b;

            {
                this.f55542b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f55542b;
                        jVar.E = true;
                        if (jVar.F != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.F.f(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f55542b.n();
                        return;
                    default:
                        this.f55542b.o();
                        return;
                }
            }
        };
        this.U = new Runnable(this) {
            public final j f55542b;

            {
                this.f55542b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j jVar = this.f55542b;
                        jVar.E = true;
                        if (jVar.F != null) {
                            try {
                                jVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            jVar.F.f(jVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f55542b.n();
                        return;
                    default:
                        this.f55542b.o();
                        return;
                }
            }
        };
        this.f55684e0 = new float[2];
        this.f55686f0 = new float[2];
        this.f55687g0 = new float[2];
        this.f55688h0 = 1.0f;
        this.f55692l0 = false;
        this.f55694n0 = 1.0f;
        this.J = UUID.randomUUID();
        this.G = pointF;
    }

    public abstract i a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f10, float f11, float f12, float f13, boolean z9) {
        float f14;
        float f15;
        float f16;
        boolean z10;
        float f17;
        boolean z11;
        boolean z12;
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            if (z9) {
                f14 = (f10 + f12) / 2.0f;
            } else {
                f14 = f10;
            }
            if (z9) {
                f15 = (f11 + f13) / 2.0f;
            } else {
                f15 = f11;
            }
            float f18 = (f14 - this.f55685f) / scaleX;
            float f19 = (f15 - this.h) / scaleX;
            float hypot = (float) Math.hypot(f18, f19);
            if (this.f55693n) {
                f16 = 6.0f;
            } else {
                f16 = 16.0f;
            }
            if (hypot > f16 || z9) {
                org.telegram.messenger.g0.r(this.I);
                e(f18, f19);
                if (z9) {
                    float a10 = r9.a(f10, f11, f12, f13);
                    float a11 = r9.a(this.f55678b, this.f55680c, this.d, this.f55683e);
                    if (a11 > 0.0f) {
                        j(a10 / a11);
                    }
                    f(this.f55689i0 + ((float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12) - Math.atan2(this.f55680c - this.f55683e, this.f55678b - this.d))));
                }
                this.f55678b = f10;
                this.f55680c = f11;
                this.f55685f = f14;
                this.h = f15;
                if (z9) {
                    this.d = f12;
                    this.f55683e = f13;
                }
                this.f55693n = true;
                if ((getParent() instanceof d) && (this.R != 0 || this.S != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.f55698w && (hVar4 = this.F) != null) {
                    this.f55698w = true;
                    hVar4.C();
                }
                if (!this.f55699x && z9 && (hVar3 = this.F) != null) {
                    this.f55699x = true;
                    hVar3.h();
                }
                if (this.f55699x && !z9 && (hVar2 = this.F) != null) {
                    this.f55699x = false;
                    hVar2.g();
                }
                if (!this.f55692l0 && !this.f55700y && (hVar = this.F) != null) {
                    hVar.u(this);
                    this.f55700y = true;
                }
                h hVar5 = this.F;
                if (hVar5 != null) {
                    if (org.telegram.messenger.camera.q.v(getHeight(), 2.0f, scaleX, this.G.y) < org.telegram.messenger.g0.L(66.0f)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    hVar5.B(z11);
                    h hVar6 = this.F;
                    if (com.google.android.recaptcha.internal.a.c(getHeight(), 2.0f, scaleX, this.G.y) > ((View) getParent()).getHeight() - org.telegram.messenger.g0.L(114.0f)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    hVar6.d(z12);
                }
                h hVar7 = this.F;
                if ((hVar7 == null || hVar7.p()) && !z9 && r9.a(f14, f15, ((View) getParent()).getWidth() / 2.0f, ((View) getParent()).getHeight() - org.telegram.messenger.g0.L(76.0f)) < org.telegram.messenger.g0.L(32.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.D != z10) {
                    ValueAnimator valueAnimator = this.f55695o0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f55695o0 = null;
                    }
                    float f20 = this.f55694n0;
                    if (z10) {
                        f17 = 0.5f;
                    } else {
                        f17 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f20, f17);
                    this.f55695o0 = ofFloat;
                    ofFloat.addUpdateListener(new f(this, 1));
                    this.f55695o0.setInterpolator(xq.h);
                    this.f55695o0.setDuration(280L);
                    this.f55695o0.start();
                    this.D = z10;
                    h hVar8 = this.F;
                    if (hVar8 != null) {
                        hVar8.j(z10);
                    }
                }
                this.f55676a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z9) {
        h hVar;
        h hVar2;
        if (this.f55698w) {
            this.F.e(this.D);
            this.f55698w = false;
        }
        this.f55699x = false;
        if (!z9 && !this.E && !this.f55693n && !this.f55697s && !this.f55700y && (hVar2 = this.F) != null) {
            hVar2.u(this);
        }
        if (this.f55693n && (hVar = this.F) != null) {
            hVar.B(false);
            this.F.d(false);
        }
        org.telegram.messenger.g0.r(this.I);
        this.E = false;
        this.f55693n = false;
        this.f55697s = false;
        this.f55696r = true;
        this.f55700y = false;
        this.M = this.L;
        org.telegram.ui.Wallet.h2 h2Var = this.N;
        if (h2Var != null) {
            org.telegram.messenger.g0.r(h2Var);
            this.N = null;
        }
        this.V = this.R;
        org.telegram.messenger.g0.r(this.T);
        this.W = this.S;
        org.telegram.messenger.g0.r(this.U);
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float a10 = this.f55676a.a(getBounceScale());
        canvas.save();
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof r1) {
                float f10 = this.f55694n0;
                canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - org.telegram.messenger.g0.L(76.0f)) - getY();
                float f11 = this.f55694n0;
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
        if (this.R != 0) {
            this.V = 0;
            n();
        }
        if (this.S != 0) {
            this.W = 0;
            o();
        }
        this.f55689i0 = f10;
        boolean z9 = this.K;
        if (!z9 && !this.f55681c0) {
            Iterator it = f55675p0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f10) < 4.0f) {
                    if (this.M != intValue) {
                        this.M = intValue;
                        org.telegram.ui.Wallet.h2 h2Var = this.N;
                        if (h2Var != null) {
                            org.telegram.messenger.g0.r(h2Var);
                        }
                        org.telegram.ui.Wallet.h2 h2Var2 = new org.telegram.ui.Wallet.h2(this, intValue, 7);
                        this.N = h2Var2;
                        org.telegram.messenger.g0.i3(h2Var2, 250L);
                    }
                }
            }
        } else if (z9) {
            if (Math.abs(this.L - f10) < 12.0f && !this.f55681c0) {
                if (this.P != null) {
                    f10 = this.O;
                } else {
                    f10 = this.L;
                }
            } else {
                this.M = -1;
                org.telegram.ui.Wallet.h2 h2Var3 = this.N;
                if (h2Var3 != null) {
                    org.telegram.messenger.g0.r(h2Var3);
                    this.N = null;
                }
                ValueAnimator valueAnimator = this.P;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.Q;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.Q = duration;
                duration.setInterpolator(xq.f40329f);
                this.Q.addUpdateListener(new f(this, 0));
                this.Q.addListener(new g(this, 3));
                this.Q.start();
                this.K = false;
            }
        }
        ValueAnimator valueAnimator3 = this.Q;
        if (valueAnimator3 != null) {
            f10 = org.telegram.messenger.g0.b2(0.0f, f10, valueAnimator3.getAnimatedFraction());
        }
        g(f10);
    }

    public final void g(float f10) {
        setRotation(f10);
        if (this.R != 0 || this.S != 0) {
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
        return this.G;
    }

    public float getPositionX() {
        float f10;
        float f11 = this.G.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i7 = this.R;
            if (i7 == 1) {
                f10 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + org.telegram.messenger.g0.L(8.0f);
            } else if (i7 == 2) {
                f10 = view.getMeasuredWidth() / 2.0f;
            } else if (i7 == 3) {
                f10 = (view.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.f55677a0;
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
        float f11 = this.G.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i7 = this.S;
            if (i7 == 1) {
                f10 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + org.telegram.messenger.g0.L(64.0f);
            } else if (i7 == 2) {
                f10 = view.getMeasuredHeight() / 2.0f;
            } else if (i7 == 3) {
                f10 = (view.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.f55679b0;
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

    public ki0 getSelectionBounds() {
        return new ki0(0.0f, 0.0f, 0.0f, 0.0f);
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
        return this.R;
    }

    public final int getStickyY() {
        return this.S;
    }

    public UUID getUUID() {
        return this.J;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.f55677a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.f55677a0 = duration;
        duration.setInterpolator(xq.f40329f);
        this.f55677a0.addUpdateListener(new f(this, 3));
        this.f55677a0.addListener(new g(this, 0));
        this.f55677a0.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.f55679b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.f55679b0 = duration;
        duration.setInterpolator(xq.f40329f);
        this.f55679b0.addUpdateListener(new f(this, 4));
        this.f55679b0.addListener(new g(this, 1));
        this.f55679b0.start();
    }

    @Override
    public final boolean isSelected() {
        return this.f55692l0;
    }

    public final void j(float f10) {
        boolean z9;
        float f11 = this.f55688h0;
        float f12 = f10 * f11;
        this.f55688h0 = f12;
        float i7 = Utilities.i(Math.max(f12, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof q1)) {
            boolean z10 = false;
            if (i7 < getMaxScale() && i7 > getMinScale()) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (f11 >= getMaxScale() || f11 <= getMinScale()) {
                z10 = true;
            }
            if (z9 != z10) {
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

    public final void l(ViewGroup viewGroup, boolean z9) {
        if (this.f55692l0 != z9) {
            this.f55692l0 = z9;
            ValueAnimator valueAnimator = this.f55691k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f55691k0 = null;
            }
            float f10 = 0.0f;
            if (this.H == null) {
                if (z9 || viewGroup != null) {
                    i a10 = a();
                    this.H = a10;
                    a10.f55634f = !this.f55681c0;
                    a10.invalidate();
                    viewGroup.addView(this.H);
                    this.f55690j0 = 0.0f;
                } else {
                    return;
                }
            }
            this.H.b();
            float f11 = this.f55690j0;
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f55691k0 = ofFloat;
            ofFloat.addUpdateListener(new f(this, 2));
            this.f55691k0.addListener(new g(this, 4));
            this.f55691k0.setDuration(280L);
            this.f55691k0.setInterpolator(xq.h);
            this.f55691k0.start();
        }
    }

    public final void m() {
        i iVar = this.H;
        if (iVar != null) {
            iVar.b();
        }
    }

    public final void n() {
        org.telegram.messenger.g0.r(this.T);
        int i7 = this.R;
        int i10 = this.V;
        if (i7 == i10) {
            return;
        }
        this.R = i10;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.f55677a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.V == 0) {
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
        ValueAnimator valueAnimator = this.f55679b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.W == 0) {
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
        return this.F.q();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: tg.j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(h hVar) {
        this.F = hVar;
    }

    public void setPosition(PointF pointF) {
        this.G = pointF;
        k();
    }

    public void setScale(float f10) {
        this.f55688h0 = f10;
        setScaleX(f10);
        setScaleY(f10);
    }

    public void setSelectionVisibility(boolean z9) {
        int i7;
        i iVar = this.H;
        if (iVar == null) {
            return;
        }
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        iVar.setVisibility(i7);
    }

    public void setStickyX(int i7) {
        this.V = i7;
        this.R = i7;
    }

    public void setStickyY(int i7) {
        this.W = i7;
        this.S = i7;
    }

    public void setIsVideo(boolean z9) {
    }
}
