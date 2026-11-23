package tg;

import a8.x9;
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
import org.telegram.messenger.m10;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ao0;
public abstract class n extends FrameLayout {
    public static final List f58086r0 = Arrays.asList(-90, 0, 90, 180);
    public boolean E;
    public boolean F;
    public boolean G;
    public l H;
    public PointF I;
    public m J;
    public final i K;
    public final UUID L;
    public boolean M;
    public int N;
    public int O;
    public ao0 P;
    public float Q;
    public ValueAnimator R;
    public ValueAnimator S;
    public int T;
    public int U;
    public final i V;
    public final i W;
    public final lc f58087a;
    public int f58088a0;
    public float f58089b;
    public int f58090b0;
    public float f58091c;
    public ValueAnimator f58092c0;
    public float d;
    public ValueAnimator f58093d0;
    public float f58094e;
    public boolean f58095e0;
    public float f58096f;
    public boolean f58097f0;
    public final float[] f58098g0;
    public float h;
    public final float[] f58099h0;
    public final float[] f58100i0;
    public float f58101j0;
    public float f58102k0;
    public float f58103l0;
    public ValueAnimator m0;
    public boolean f58104n;
    public boolean f58105n0;
    public ViewGroup f58106o0;
    public float f58107p0;
    public ValueAnimator f58108q0;
    public boolean f58109r;
    public boolean f58110s;
    public boolean f58111w;
    public boolean f58112x;
    public boolean f58113y;

    public n(Context context, PointF pointF) {
        super(context);
        this.f58087a = new lc(this);
        this.f58104n = false;
        this.f58109r = false;
        this.f58111w = false;
        this.f58112x = false;
        this.f58113y = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.K = new Runnable(this) {
            public final n f57952b;

            {
                this.f57952b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n nVar = this.f57952b;
                        nVar.G = true;
                        if (nVar.H != null) {
                            try {
                                nVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            nVar.H.f(nVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f57952b.n();
                        return;
                    default:
                        this.f57952b.o();
                        return;
                }
            }
        };
        this.M = true;
        this.N = 0;
        this.O = -1;
        this.T = 0;
        this.U = 0;
        this.V = new Runnable(this) {
            public final n f57952b;

            {
                this.f57952b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n nVar = this.f57952b;
                        nVar.G = true;
                        if (nVar.H != null) {
                            try {
                                nVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            nVar.H.f(nVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f57952b.n();
                        return;
                    default:
                        this.f57952b.o();
                        return;
                }
            }
        };
        this.W = new Runnable(this) {
            public final n f57952b;

            {
                this.f57952b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        n nVar = this.f57952b;
                        nVar.G = true;
                        if (nVar.H != null) {
                            try {
                                nVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            nVar.H.f(nVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f57952b.n();
                        return;
                    default:
                        this.f57952b.o();
                        return;
                }
            }
        };
        this.f58098g0 = new float[2];
        this.f58099h0 = new float[2];
        this.f58100i0 = new float[2];
        this.f58101j0 = 1.0f;
        this.f58105n0 = false;
        this.f58107p0 = 1.0f;
        this.L = UUID.randomUUID();
        this.I = pointF;
    }

    public abstract m a();

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
        l lVar;
        l lVar2;
        l lVar3;
        l lVar4;
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
            float f18 = (f14 - this.f58096f) / scaleX;
            float f19 = (f15 - this.h) / scaleX;
            float hypot = (float) Math.hypot(f18, f19);
            if (this.f58104n) {
                f16 = 6.0f;
            } else {
                f16 = 16.0f;
            }
            if (hypot > f16 || z10) {
                org.telegram.messenger.g0.r(this.K);
                e(f18, f19);
                if (z10) {
                    float a10 = x9.a(f10, f11, f12, f13);
                    float a11 = x9.a(this.f58089b, this.f58091c, this.d, this.f58094e);
                    if (a11 > 0.0f) {
                        j(a10 / a11);
                    }
                    f(this.f58102k0 + ((float) Math.toDegrees(Math.atan2(f11 - f13, f10 - f12) - Math.atan2(this.f58091c - this.f58094e, this.f58089b - this.d))));
                }
                this.f58089b = f10;
                this.f58091c = f11;
                this.f58096f = f14;
                this.h = f15;
                if (z10) {
                    this.d = f12;
                    this.f58094e = f13;
                }
                this.f58104n = true;
                if ((getParent() instanceof h) && (this.T != 0 || this.U != 0)) {
                    ((h) getParent()).invalidate();
                }
                if (!this.f58112x && (lVar4 = this.H) != null) {
                    this.f58112x = true;
                    lVar4.C();
                }
                if (!this.f58113y && z10 && (lVar3 = this.H) != null) {
                    this.f58113y = true;
                    lVar3.h();
                }
                if (this.f58113y && !z10 && (lVar2 = this.H) != null) {
                    this.f58113y = false;
                    lVar2.g();
                }
                if (!this.f58105n0 && !this.E && (lVar = this.H) != null) {
                    lVar.u(this);
                    this.E = true;
                }
                l lVar5 = this.H;
                if (lVar5 != null) {
                    if (m10.w(getHeight(), 2.0f, scaleX, this.I.y) < org.telegram.messenger.g0.L(66.0f)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    lVar5.B(z12);
                    l lVar6 = this.H;
                    if (com.google.android.gms.internal.vision.e2.c(getHeight(), 2.0f, scaleX, this.I.y) > ((View) getParent()).getHeight() - org.telegram.messenger.g0.L(114.0f)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    lVar6.d(z13);
                }
                l lVar7 = this.H;
                if ((lVar7 == null || lVar7.p()) && !z10 && x9.a(f14, f15, ((View) getParent()).getWidth() / 2.0f, ((View) getParent()).getHeight() - org.telegram.messenger.g0.L(76.0f)) < org.telegram.messenger.g0.L(32.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.F != z11) {
                    ValueAnimator valueAnimator = this.f58108q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f58108q0 = null;
                    }
                    float f20 = this.f58107p0;
                    if (z11) {
                        f17 = 0.5f;
                    } else {
                        f17 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f20, f17);
                    this.f58108q0 = ofFloat;
                    ofFloat.addUpdateListener(new j(this, 1));
                    this.f58108q0.setInterpolator(kr.h);
                    this.f58108q0.setDuration(280L);
                    this.f58108q0.start();
                    this.F = z11;
                    l lVar8 = this.H;
                    if (lVar8 != null) {
                        lVar8.j(z11);
                    }
                }
                this.f58087a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        l lVar;
        l lVar2;
        if (this.f58112x) {
            this.H.e(this.F);
            this.f58112x = false;
        }
        this.f58113y = false;
        if (!z10 && !this.G && !this.f58104n && !this.f58111w && !this.E && (lVar2 = this.H) != null) {
            lVar2.u(this);
        }
        if (this.f58104n && (lVar = this.H) != null) {
            lVar.B(false);
            this.H.d(false);
        }
        org.telegram.messenger.g0.r(this.K);
        this.G = false;
        this.f58104n = false;
        this.f58111w = false;
        this.f58109r = true;
        this.f58110s = false;
        this.E = false;
        this.O = this.N;
        ao0 ao0Var = this.P;
        if (ao0Var != null) {
            org.telegram.messenger.g0.r(ao0Var);
            this.P = null;
        }
        this.f58088a0 = this.T;
        org.telegram.messenger.g0.r(this.V);
        this.f58090b0 = this.U;
        org.telegram.messenger.g0.r(this.W);
        if (getParent() instanceof h) {
            ((h) getParent()).invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float a10 = this.f58087a.a(getBounceScale());
        canvas.save();
        canvas.scale(a10, a10, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof w1) {
                float f10 = this.f58107p0;
                canvas.scale(f10, f10, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - org.telegram.messenger.g0.L(76.0f)) - getY();
                float f11 = this.f58107p0;
                canvas.scale(f11, f11, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: tg.n.e(float, float):void");
    }

    public final void f(float f10) {
        if (this.T != 0) {
            this.f58088a0 = 0;
            n();
        }
        if (this.U != 0) {
            this.f58090b0 = 0;
            o();
        }
        this.f58102k0 = f10;
        boolean z10 = this.M;
        if (!z10 && !this.f58095e0) {
            Iterator it = f58086r0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f10) < 4.0f) {
                    if (this.O != intValue) {
                        this.O = intValue;
                        ao0 ao0Var = this.P;
                        if (ao0Var != null) {
                            org.telegram.messenger.g0.r(ao0Var);
                        }
                        ao0 ao0Var2 = new ao0(this, intValue, 14);
                        this.P = ao0Var2;
                        org.telegram.messenger.g0.h3(ao0Var2, 250L);
                    }
                }
            }
        } else if (z10) {
            if (Math.abs(this.N - f10) < 12.0f && !this.f58095e0) {
                if (this.R != null) {
                    f10 = this.Q;
                } else {
                    f10 = this.N;
                }
            } else {
                this.O = -1;
                ao0 ao0Var3 = this.P;
                if (ao0Var3 != null) {
                    org.telegram.messenger.g0.r(ao0Var3);
                    this.P = null;
                }
                ValueAnimator valueAnimator = this.R;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.S;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.S = duration;
                duration.setInterpolator(kr.f36858f);
                this.S.addUpdateListener(new j(this, 0));
                this.S.addListener(new k(this, 3));
                this.S.start();
                this.M = false;
            }
        }
        ValueAnimator valueAnimator3 = this.S;
        if (valueAnimator3 != null) {
            f10 = org.telegram.messenger.g0.b2(0.0f, f10, valueAnimator3.getAnimatedFraction());
        }
        g(f10);
    }

    public final void g(float f10) {
        setRotation(f10);
        if (this.T != 0 || this.U != 0) {
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
        return this.I;
    }

    public float getPositionX() {
        float f10;
        float f11 = this.I.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i7 = this.T;
            if (i7 == 1) {
                f10 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + org.telegram.messenger.g0.L(8.0f);
            } else if (i7 == 2) {
                f10 = view.getMeasuredWidth() / 2.0f;
            } else if (i7 == 3) {
                f10 = (view.getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.f58092c0;
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
        float f11 = this.I.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i7 = this.U;
            if (i7 == 1) {
                f10 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + org.telegram.messenger.g0.L(64.0f);
            } else if (i7 == 2) {
                f10 = view.getMeasuredHeight() / 2.0f;
            } else if (i7 == 3) {
                f10 = (view.getMeasuredHeight() - org.telegram.messenger.g0.L(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f10 = f11;
            }
            ValueAnimator valueAnimator = this.f58093d0;
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

    public aj0 getSelectionBounds() {
        return new aj0(0.0f, 0.0f, 0.0f, 0.0f);
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
        return this.T;
    }

    public final int getStickyY() {
        return this.U;
    }

    public UUID getUUID() {
        return this.L;
    }

    public final void h(float... fArr) {
        ValueAnimator valueAnimator = this.f58092c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.f58092c0 = duration;
        duration.setInterpolator(kr.f36858f);
        this.f58092c0.addUpdateListener(new j(this, 3));
        this.f58092c0.addListener(new k(this, 0));
        this.f58092c0.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.f58093d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.f58093d0 = duration;
        duration.setInterpolator(kr.f36858f);
        this.f58093d0.addUpdateListener(new j(this, 4));
        this.f58093d0.addListener(new k(this, 1));
        this.f58093d0.start();
    }

    @Override
    public final boolean isSelected() {
        return this.f58105n0;
    }

    public final void j(float f10) {
        boolean z10;
        float f11 = this.f58101j0;
        float f12 = f10 * f11;
        this.f58101j0 = f12;
        float i7 = Utilities.i(Math.max(f12, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof v1)) {
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
        if (this.f58105n0 != z10) {
            this.f58105n0 = z10;
            ValueAnimator valueAnimator = this.m0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.m0 = null;
            }
            float f10 = 0.0f;
            if (this.J == null) {
                if (z10 || viewGroup != null) {
                    m a10 = a();
                    this.J = a10;
                    a10.f58070f = !this.f58095e0;
                    a10.invalidate();
                    viewGroup.addView(this.J);
                    this.f58103l0 = 0.0f;
                } else {
                    return;
                }
            }
            this.J.b();
            float f11 = this.f58103l0;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.m0 = ofFloat;
            ofFloat.addUpdateListener(new j(this, 2));
            this.m0.addListener(new k(this, 4));
            this.m0.setDuration(280L);
            this.m0.setInterpolator(kr.h);
            this.m0.start();
        }
    }

    public final void m() {
        m mVar = this.J;
        if (mVar != null) {
            mVar.b();
        }
    }

    public final void n() {
        org.telegram.messenger.g0.r(this.V);
        int i7 = this.T;
        int i10 = this.f58088a0;
        if (i7 == i10) {
            return;
        }
        this.T = i10;
        if (getParent() instanceof h) {
            ((h) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.f58092c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f58088a0 == 0) {
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
        org.telegram.messenger.g0.r(this.W);
        int i7 = this.U;
        int i10 = this.f58090b0;
        if (i7 == i10) {
            return;
        }
        this.U = i10;
        if (getParent() instanceof h) {
            ((h) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.f58093d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f58090b0 == 0) {
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
        return this.H.q();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: tg.n.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(l lVar) {
        this.H = lVar;
    }

    public void setPosition(PointF pointF) {
        this.I = pointF;
        k();
    }

    public void setScale(float f10) {
        this.f58101j0 = f10;
        setScaleX(f10);
        setScaleY(f10);
    }

    public void setSelectionVisibility(boolean z10) {
        int i7;
        m mVar = this.J;
        if (mVar == null) {
            return;
        }
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        mVar.setVisibility(i7);
    }

    public void setStickyX(int i7) {
        this.f58088a0 = i7;
        this.T = i7;
    }

    public void setStickyY(int i7) {
        this.f58090b0 = i7;
        this.U = i7;
    }

    public void setIsVideo(boolean z10) {
    }
}
