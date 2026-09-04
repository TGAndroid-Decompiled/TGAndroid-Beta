package rg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zc;
import v7.z6;
public abstract class k extends FrameLayout {
    public static final List f45237p0 = Arrays.asList(-90, 0, 90, 180);
    public boolean E;
    public i F;
    public PointF G;
    public j H;
    public final e I;
    public final UUID J;
    public boolean K;
    public int L;
    public int M;
    public f N;
    public float O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public int R;
    public int S;
    public final e T;
    public final e U;
    public int V;
    public int W;
    public final zc f45238a;
    public ValueAnimator f45239a0;
    public float f45240b;
    public ValueAnimator f45241b0;
    public float f45242c;
    public boolean f45243c0;
    public float d;
    public boolean f45244d0;
    public float f45245e;
    public final float[] f45246e0;
    public float f45247f;
    public final float[] f45248f0;
    public final float[] f45249g0;
    public float h;
    public float f45250h0;
    public float f45251i0;
    public float f45252j0;
    public ValueAnimator f45253k0;
    public boolean f45254l0;
    public ViewGroup m0;
    public boolean f45255n;
    public float f45256n0;
    public ValueAnimator f45257o0;
    public boolean f45258r;
    public boolean f45259s;
    public boolean v;
    public boolean f45260w;
    public boolean f45261x;
    public boolean f45262y;

    public k(Context context, PointF pointF) {
        super(context);
        this.f45238a = new zc(this);
        this.f45255n = false;
        this.f45258r = false;
        this.f45259s = false;
        this.v = false;
        this.f45260w = false;
        this.f45261x = false;
        this.f45262y = false;
        this.E = false;
        this.I = new Runnable(this) {
            public final k f45171b;

            {
                this.f45171b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k kVar = this.f45171b;
                        kVar.E = true;
                        if (kVar.F != null) {
                            try {
                                kVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            kVar.F.h(kVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f45171b.n();
                        return;
                    default:
                        this.f45171b.o();
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
            public final k f45171b;

            {
                this.f45171b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k kVar = this.f45171b;
                        kVar.E = true;
                        if (kVar.F != null) {
                            try {
                                kVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            kVar.F.h(kVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f45171b.n();
                        return;
                    default:
                        this.f45171b.o();
                        return;
                }
            }
        };
        this.U = new Runnable(this) {
            public final k f45171b;

            {
                this.f45171b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k kVar = this.f45171b;
                        kVar.E = true;
                        if (kVar.F != null) {
                            try {
                                kVar.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                            kVar.F.h(kVar);
                            return;
                        }
                        return;
                    case 1:
                        this.f45171b.n();
                        return;
                    default:
                        this.f45171b.o();
                        return;
                }
            }
        };
        this.f45246e0 = new float[2];
        this.f45248f0 = new float[2];
        this.f45249g0 = new float[2];
        this.f45250h0 = 1.0f;
        this.f45254l0 = false;
        this.f45256n0 = 1.0f;
        this.J = UUID.randomUUID();
        this.G = pointF;
    }

    public abstract j a();

    public final float b() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()));
    }

    public final boolean c(float f7, float f10, boolean z10, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        boolean z11;
        float f16;
        boolean z12;
        boolean z13;
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        if (getParent() != null) {
            float scaleX = ((View) getParent()).getScaleX();
            if (z10) {
                f13 = (f7 + f11) / 2.0f;
            } else {
                f13 = f7;
            }
            if (z10) {
                f14 = (f10 + f12) / 2.0f;
            } else {
                f14 = f10;
            }
            float f17 = (f13 - this.f45247f) / scaleX;
            float f18 = (f14 - this.h) / scaleX;
            float hypot = (float) Math.hypot(f17, f18);
            if (this.f45255n) {
                f15 = 6.0f;
            } else {
                f15 = 16.0f;
            }
            if (hypot > f15 || z10) {
                AndroidUtilities.cancelRunOnUIThread(this.I);
                e(f17, f18);
                if (z10) {
                    float a2 = z6.a(f7, f10, f11, f12);
                    float a10 = z6.a(this.f45240b, this.f45242c, this.d, this.f45245e);
                    if (a10 > 0.0f) {
                        j(a2 / a10);
                    }
                    f(this.f45251i0 + ((float) Math.toDegrees(Math.atan2(f10 - f12, f7 - f11) - Math.atan2(this.f45242c - this.f45245e, this.f45240b - this.d))));
                }
                this.f45240b = f7;
                this.f45242c = f10;
                this.f45247f = f13;
                this.h = f14;
                if (z10) {
                    this.d = f11;
                    this.f45245e = f12;
                }
                this.f45255n = true;
                if ((getParent() instanceof d) && (this.R != 0 || this.S != 0)) {
                    ((d) getParent()).invalidate();
                }
                if (!this.v && (iVar4 = this.F) != null) {
                    this.v = true;
                    iVar4.C();
                }
                if (!this.f45260w && z10 && (iVar3 = this.F) != null) {
                    this.f45260w = true;
                    iVar3.k();
                }
                if (this.f45260w && !z10 && (iVar2 = this.F) != null) {
                    this.f45260w = false;
                    iVar2.j();
                }
                if (!this.f45254l0 && !this.f45261x && (iVar = this.F) != null) {
                    iVar.v(this);
                    this.f45261x = true;
                }
                i iVar5 = this.F;
                if (iVar5 != null) {
                    if (wl.c(getHeight(), 2.0f, scaleX, this.G.y) < AndroidUtilities.dp(66.0f)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    iVar5.B(z12);
                    i iVar6 = this.F;
                    if (a4.a.e(getHeight(), 2.0f, scaleX, this.G.y) > ((View) getParent()).getHeight() - AndroidUtilities.dp(114.0f)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    iVar6.f(z13);
                }
                i iVar7 = this.F;
                if ((iVar7 == null || iVar7.q()) && !z10 && z6.a(f13, f14, ((View) getParent()).getWidth() / 2.0f, ((View) getParent()).getHeight() - AndroidUtilities.dp(76.0f)) < AndroidUtilities.dp(32.0f)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f45262y != z11) {
                    ValueAnimator valueAnimator = this.f45257o0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f45257o0 = null;
                    }
                    float f19 = this.f45256n0;
                    if (z11) {
                        f16 = 0.5f;
                    } else {
                        f16 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f19, f16);
                    this.f45257o0 = ofFloat;
                    ofFloat.addUpdateListener(new g(this, 1));
                    this.f45257o0.setInterpolator(pr.h);
                    this.f45257o0.setDuration(280L);
                    this.f45257o0.start();
                    this.f45262y = z11;
                    i iVar8 = this.F;
                    if (iVar8 != null) {
                        iVar8.m(z11);
                    }
                }
                this.f45238a.c(false);
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        i iVar;
        i iVar2;
        if (this.v) {
            this.F.g(this.f45262y);
            this.v = false;
        }
        this.f45260w = false;
        if (!z10 && !this.E && !this.f45255n && !this.f45259s && !this.f45261x && (iVar2 = this.F) != null) {
            iVar2.v(this);
        }
        if (this.f45255n && (iVar = this.F) != null) {
            iVar.B(false);
            this.F.f(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.I);
        this.E = false;
        this.f45255n = false;
        this.f45259s = false;
        this.f45258r = true;
        this.f45261x = false;
        this.M = this.L;
        f fVar = this.N;
        if (fVar != null) {
            AndroidUtilities.cancelRunOnUIThread(fVar);
            this.N = null;
        }
        this.V = this.R;
        AndroidUtilities.cancelRunOnUIThread(this.T);
        this.W = this.S;
        AndroidUtilities.cancelRunOnUIThread(this.U);
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float a2 = this.f45238a.a(getBounceScale());
        canvas.save();
        canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof d2) {
                float f7 = this.f45256n0;
                canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - AndroidUtilities.dp(76.0f)) - getY();
                float f10 = this.f45256n0;
                canvas.scale(f10, f10, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: rg.k.e(float, float):void");
    }

    public final void f(float f7) {
        if (this.R != 0) {
            this.V = 0;
            n();
        }
        if (this.S != 0) {
            this.W = 0;
            o();
        }
        this.f45251i0 = f7;
        boolean z10 = this.K;
        if (!z10 && !this.f45243c0) {
            Iterator it = f45237p0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it.next()).intValue();
                if (Math.abs(intValue - f7) < 4.0f) {
                    if (this.M != intValue) {
                        this.M = intValue;
                        f fVar = this.N;
                        if (fVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(fVar);
                        }
                        f fVar2 = new f(this, intValue, 0);
                        this.N = fVar2;
                        AndroidUtilities.runOnUIThread(fVar2, 250L);
                    }
                }
            }
        } else if (z10) {
            if (Math.abs(this.L - f7) < 12.0f && !this.f45243c0) {
                if (this.P != null) {
                    f7 = this.O;
                } else {
                    f7 = this.L;
                }
            } else {
                this.M = -1;
                f fVar3 = this.N;
                if (fVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(fVar3);
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
                duration.setInterpolator(pr.f29466f);
                this.Q.addUpdateListener(new g(this, 0));
                this.Q.addListener(new h(this, 3));
                this.Q.start();
                this.K = false;
            }
        }
        ValueAnimator valueAnimator3 = this.Q;
        if (valueAnimator3 != null) {
            f7 = AndroidUtilities.lerpAngle(0.0f, f7, valueAnimator3.getAnimatedFraction());
        }
        g(f7);
    }

    public final void g(float f7) {
        setRotation(f7);
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
        float f7;
        float f10 = this.G.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.R;
            if (i10 == 1) {
                f7 = (getScaleX() * ((p() / 2.0f) - getStickyPaddingLeft())) + AndroidUtilities.dp(8.0f);
            } else if (i10 == 2) {
                f7 = view.getMeasuredWidth() / 2.0f;
            } else if (i10 == 3) {
                f7 = (view.getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (p() / 2.0f)));
            } else {
                f7 = f10;
            }
            ValueAnimator valueAnimator = this.f45239a0;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f10, f7, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f7 != 0.0f) {
                return f7;
            }
        }
        return f10;
    }

    public float getPositionY() {
        float f7;
        float f10 = this.G.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i10 = this.S;
            if (i10 == 1) {
                f7 = (getScaleY() * ((b() / 2.0f) - getStickyPaddingTop())) + AndroidUtilities.dp(64.0f);
            } else if (i10 == 2) {
                f7 = view.getMeasuredHeight() / 2.0f;
            } else if (i10 == 3) {
                f7 = (view.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (b() / 2.0f)));
            } else {
                f7 = f10;
            }
            ValueAnimator valueAnimator = this.f45241b0;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f10, f7, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (f7 != 0.0f) {
                return f7;
            }
        }
        return f10;
    }

    public float getScale() {
        return getScaleX();
    }

    public hk0 getSelectionBounds() {
        return new hk0(0.0f, 0.0f, 0.0f, 0.0f);
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
        ValueAnimator valueAnimator = this.f45239a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.f45239a0 = duration;
        duration.setInterpolator(pr.f29466f);
        this.f45239a0.addUpdateListener(new g(this, 3));
        this.f45239a0.addListener(new h(this, 0));
        this.f45239a0.start();
    }

    public final void i(float... fArr) {
        ValueAnimator valueAnimator = this.f45241b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.f45241b0 = duration;
        duration.setInterpolator(pr.f29466f);
        this.f45241b0.addUpdateListener(new g(this, 4));
        this.f45241b0.addListener(new h(this, 1));
        this.f45241b0.start();
    }

    @Override
    public final boolean isSelected() {
        return this.f45254l0;
    }

    public final void j(float f7) {
        boolean z10;
        float f10 = this.f45250h0;
        float f11 = f7 * f10;
        this.f45250h0 = f11;
        float clamp = Utilities.clamp(Math.max(f11, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof c2)) {
            boolean z11 = false;
            if (clamp < getMaxScale() && clamp > getMinScale()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != ((f10 >= getMaxScale() || f10 <= getMinScale()) ? true : true)) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(clamp);
        setScaleY(clamp);
    }

    public void k() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        m();
    }

    public final void l(ViewGroup viewGroup, boolean z10) {
        if (this.f45254l0 != z10) {
            this.f45254l0 = z10;
            ValueAnimator valueAnimator = this.f45253k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f45253k0 = null;
            }
            float f7 = 0.0f;
            if (this.H == null) {
                if (z10 || viewGroup != null) {
                    j a2 = a();
                    this.H = a2;
                    a2.f45223f = !this.f45243c0;
                    a2.invalidate();
                    viewGroup.addView(this.H);
                    this.f45252j0 = 0.0f;
                } else {
                    return;
                }
            }
            this.H.b();
            float f10 = this.f45252j0;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f45253k0 = ofFloat;
            ofFloat.addUpdateListener(new g(this, 2));
            this.f45253k0.addListener(new h(this, 4));
            this.f45253k0.setDuration(280L);
            this.f45253k0.setInterpolator(pr.h);
            this.f45253k0.start();
        }
    }

    public final void m() {
        j jVar = this.H;
        if (jVar != null) {
            jVar.b();
        }
    }

    public final void n() {
        AndroidUtilities.cancelRunOnUIThread(this.T);
        int i10 = this.R;
        int i11 = this.V;
        if (i10 == i11) {
            return;
        }
        this.R = i11;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.f45239a0;
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
        AndroidUtilities.cancelRunOnUIThread(this.U);
        int i10 = this.S;
        int i11 = this.W;
        if (i10 == i11) {
            return;
        }
        this.S = i11;
        if (getParent() instanceof d) {
            ((d) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.f45241b0;
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
        return this.F.r();
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: rg.k.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float p() {
        return (float) ((Math.abs(Math.sin((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredHeight()) + (Math.abs(Math.cos((getRotation() / 180.0f) * 3.141592653589793d)) * getMeasuredWidth()));
    }

    public void setDelegate(i iVar) {
        this.F = iVar;
    }

    public void setPosition(PointF pointF) {
        this.G = pointF;
        k();
    }

    public void setScale(float f7) {
        this.f45250h0 = f7;
        setScaleX(f7);
        setScaleY(f7);
    }

    public void setSelectionVisibility(boolean z10) {
        int i10;
        j jVar = this.H;
        if (jVar == null) {
            return;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        jVar.setVisibility(i10);
    }

    public void setStickyX(int i10) {
        this.V = i10;
        this.R = i10;
    }

    public void setStickyY(int i10) {
        this.W = i10;
        this.S = i10;
    }

    public void setIsVideo(boolean z10) {
    }
}
