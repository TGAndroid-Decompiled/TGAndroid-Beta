package sh;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.sr;
import org.telegram.ui.yh;
import qh.v9;
public abstract class m3 extends FrameLayout {
    public static final jv0 V = new jv0(new sg.a(6), new sg.a(7));
    public Runnable B;
    public l3 C;
    public o1.j D;
    public int E;
    public GenericProvider F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public boolean P;
    public final float Q;
    public final boolean R;
    public long S;
    public float T;
    public float U;
    public Object f47527a;
    public final org.telegram.ui.Cells.f1 f47528b;
    public boolean f47529c;
    public boolean d;
    public float f47530e;
    public float f47531f;
    public float h;
    public float f47532n;
    public float f47533r;
    public boolean f47534s;
    public o1.j v;
    public boolean f47535w;
    public org.telegram.ui.web.x0 f47536x;
    public Runnable f47537y;

    public m3(Context context) {
        super(context);
        float f10;
        this.f47530e = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.f47531f = 0.0f;
        this.h = -1.0f;
        this.f47532n = -2.1474836E9f;
        this.F = new sg.a(8);
        this.J = true;
        this.O = 0.0f;
        this.P = false;
        this.Q = AndroidUtilities.dp(60.0f);
        this.R = true;
        this.f47528b = new org.telegram.ui.Cells.f1(context, new sr(this, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            f10 = 8.0f;
        } else {
            f10 = 64.0f;
        }
        this.E = AndroidUtilities.dp(f10);
    }

    public final void a(boolean z4, boolean z10) {
        this.L = z4;
        this.M = z10;
    }

    public final boolean b(boolean z4) {
        org.telegram.ui.web.x0 x0Var = this.f47536x;
        if (x0Var != null && x0Var.K) {
            if (z4) {
                if (!this.L) {
                    return false;
                }
                return true;
            } else if (!this.M) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void c() {
        setTranslationY(Math.max(this.f47530e, this.f47531f + this.f47533r));
        AndroidUtilities.cancelRunOnUIThread(new v9(this, 15));
        AndroidUtilities.runOnUIThread(new v9(this, 15));
        Runnable runnable = this.f47537y;
        if (runnable != null) {
            runnable.run();
        }
        ic icVar = ic.f27737w;
        if (icVar != null) {
            icVar.l();
        }
    }

    public final boolean d() {
        return this.f47529c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.f47527a;
            if (obj != null) {
                RenderNode c3 = org.telegram.messenger.b.c(obj);
                c3.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = c3.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.f47527a;
            if (obj2 != null) {
                RenderNode c10 = org.telegram.messenger.b.c(obj2);
                c10.endRecording();
                canvas.drawRenderNode(c10);
                return;
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f47529c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.S = motionEvent.getEventTime();
                this.T = motionEvent.getX();
                this.U = motionEvent.getY();
                this.P = false;
                this.O = 0.0f;
                if (this.K) {
                    this.L = false;
                    this.M = false;
                }
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionIndex = motionEvent.getActionIndex();
            if (Build.VERSION.SDK_INT >= 29) {
                obtain.setLocation(motionEvent.getRawX(actionIndex), motionEvent.getRawY(actionIndex));
            } else {
                obtain.setLocation(motionEvent.getX(actionIndex) + (motionEvent.getRawX() - motionEvent.getX()), motionEvent.getY(actionIndex) + (motionEvent.getRawY() - motionEvent.getY()));
            }
            boolean onTouchEvent = ((GestureDetector) this.f47528b.f22788b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z4 = this.f47529c;
                this.d = false;
                this.f47529c = false;
                if (!this.G || this.I) {
                    if (this.f47535w) {
                        this.f47535w = false;
                    } else if (this.J && (!this.K || (this.f47533r != (-this.f47531f) + this.f47530e && b(false)))) {
                        float f10 = this.f47533r;
                        int i10 = this.E;
                        float f11 = -i10;
                        boolean z10 = this.R;
                        if (f10 <= f11) {
                            if (z10) {
                                e((-this.f47531f) + this.f47530e);
                            }
                        } else if (f10 > f11 && f10 <= i10) {
                            if (z10) {
                                e(0.0f);
                            }
                        } else {
                            float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), this.T, this.U);
                            long eventTime = motionEvent.getEventTime() - this.S;
                            if (this.C != null && (eventTime > 250 || distance > AndroidUtilities.dp(200.0f))) {
                                this.C.g(!z4);
                            } else if (z10) {
                                e((-this.f47531f) + this.f47530e);
                            }
                        }
                    }
                }
            }
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if ((!dispatchTouchEvent && !onTouchEvent && motionEvent.getAction() == 0) || dispatchTouchEvent || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    public final void e(float f10) {
        f(f10, false, null);
    }

    public final void f(float f10, boolean z4, Runnable runnable) {
        o1.j jVar;
        if (this.G && !z4) {
            f10 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.f47533r != f10 && ((jVar = this.D) == null || ((float) jVar.f16336u.f16343i) != f10)) {
            this.f47532n = f10;
            o1.j jVar2 = this.v;
            if (jVar2 != null) {
                jVar2.c();
            }
            o1.j jVar3 = this.D;
            if (jVar3 != null) {
                jVar3.c();
            }
            o1.j jVar4 = new o1.j(this, V, f10);
            jVar4.f16336u = yh.n(f10, 1200.0f, 1.0f);
            jVar4.a(new lb(4, this, runnable));
            this.D = jVar4;
            jVar4.f();
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.B;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public float getOffsetY() {
        return this.f47531f;
    }

    public Object getRenderNode() {
        if (this.f47527a == null && Build.VERSION.SDK_INT >= 31) {
            this.f47527a = android.support.v4.media.session.y.j();
        }
        return this.f47527a;
    }

    public float getSwipeOffsetY() {
        return this.f47533r;
    }

    public float getTopActionBarOffsetY() {
        return this.f47530e;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            f10 = 8.0f;
        } else {
            f10 = 64.0f;
        }
        this.E = AndroidUtilities.dp(f10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (z4) {
            this.d = true;
            this.f47529c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z4) {
        this.I = z4;
    }

    public void setAllowSwipes(boolean z4) {
        if (this.J != z4) {
            this.J = z4;
        }
    }

    public void setDelegate(l3 l3Var) {
        this.C = l3Var;
    }

    public void setForceOffsetY(float f10) {
        this.f47531f = f10;
        c();
    }

    public void setFullSize(boolean z4) {
        if (this.G != z4) {
            this.G = z4;
            if (z4) {
                if (this.H) {
                    e(getTopActionBarOffsetY() + (-getOffsetY()));
                    return;
                }
                return;
            }
            e(0.0f);
        }
    }

    public void setIsKeyboardVisible(GenericProvider<Void, Boolean> genericProvider) {
        this.F = genericProvider;
    }

    public void setOffsetY(final float f10) {
        final boolean z4;
        if (this.f47532n != -2.1474836E9f) {
            this.h = f10;
            return;
        }
        o1.j jVar = this.v;
        if (jVar != null) {
            jVar.c();
        }
        final float f11 = this.f47531f;
        final float f12 = f10 - f11;
        if (Math.abs((this.f47533r + f11) - this.f47530e) <= AndroidUtilities.dp(1.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!this.f47534s) {
            o1.j jVar2 = this.v;
            if (jVar2 != null) {
                jVar2.c();
            }
            o1.j jVar3 = new o1.j(new kb.a(f11));
            jVar3.f16336u = yh.n(f10, 1400.0f, 1.0f);
            jVar3.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f13, float f14) {
                    float f15;
                    m3 m3Var = m3.this;
                    m3Var.f47531f = f13;
                    float f16 = f12;
                    float f17 = f11;
                    if (f16 == 0.0f) {
                        f15 = 1.0f;
                    } else {
                        f15 = (f13 - f17) / f16;
                    }
                    if (z4) {
                        m3Var.f47533r = k7.o.a(m3Var.f47533r - (Math.max(0.0f, f16) * f15), (-m3Var.f47531f) + m3Var.f47530e, (m3Var.getHeight() - m3Var.f47531f) + m3Var.f47530e);
                    }
                    o1.j jVar4 = m3Var.D;
                    if (jVar4 != null) {
                        o1.k kVar = jVar4.f16336u;
                        float f18 = (float) kVar.f16343i;
                        float f19 = m3Var.f47530e;
                        if (f18 == (-f17) + f19) {
                            kVar.f16343i = (-f10) + f19;
                        }
                    }
                    m3Var.c();
                }
            });
            jVar3.a(new kg0(this, f10, 2));
            this.v = jVar3;
            jVar3.f();
            return;
        }
        this.f47531f = f10;
        if (z4) {
            this.f47533r = k7.o.a(this.f47533r - Math.max(0.0f, f12), (-this.f47531f) + this.f47530e, (getHeight() - this.f47531f) + this.f47530e);
        }
        c();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.B = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.f47537y = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z4) {
        this.K = z4;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z4) {
        this.f47534s = z4;
    }

    public void setSwipeOffsetY(float f10) {
        this.f47533r = f10;
        c();
    }

    public void setTopActionBarOffsetY(float f10) {
        this.f47530e = f10;
        c();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
    }

    public void setWebView(org.telegram.ui.web.x0 x0Var) {
        this.f47536x = x0Var;
    }
}
