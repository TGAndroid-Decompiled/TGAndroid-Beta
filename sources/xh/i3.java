package xh;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import org.telegram.messenger.m9;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.za;
public abstract class i3 extends FrameLayout {
    public static final pu0 f53818b0 = new pu0(new xg.a(20), new xg.a(21));
    public Runnable D;
    public Runnable E;
    public h3 F;
    public o1.j G;
    public int H;
    public m9 I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public float Q;
    public float R;
    public boolean S;
    public final float T;
    public final boolean U;
    public long V;
    public float W;
    public Object f53819a;
    public float f53820a0;
    public final m2.t f53821b;
    public boolean f53822c;
    public boolean d;
    public float e;
    public float f53823f;
    public float h;
    public float f53824n;
    public float f53825r;
    public boolean f53826s;
    public o1.j f53827w;
    public boolean f53828x;
    public org.telegram.ui.web.v0 f53829y;

    public i3(Context context) {
        super(context);
        float f7;
        this.e = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.f53823f = 0.0f;
        this.h = -1.0f;
        this.f53824n = -2.1474836E9f;
        this.I = new xg.a(22);
        this.M = true;
        this.R = 0.0f;
        this.S = false;
        this.T = org.telegram.messenger.i0.L(60.0f);
        this.U = true;
        this.f53821b = new m2.t(context, new jr(this, ViewConfiguration.get(context).getScaledTouchSlop(), 2));
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            f7 = 8.0f;
        } else {
            f7 = 64.0f;
        }
        this.H = org.telegram.messenger.i0.L(f7);
    }

    public final void a(boolean z10, boolean z11) {
        this.O = z10;
        this.P = z11;
    }

    public final boolean b(boolean z10) {
        org.telegram.ui.web.v0 v0Var = this.f53829y;
        if (v0Var != null && v0Var.N) {
            if (z10) {
                if (!this.O) {
                    return false;
                }
                return true;
            } else if (!this.P) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final void c() {
        setTranslationY(Math.max(this.e, this.f53823f + this.f53825r));
        org.telegram.messenger.i0.r(new d0(this, 7));
        org.telegram.messenger.i0.g3(new d0(this, 7));
        Runnable runnable = this.D;
        if (runnable != null) {
            runnable.run();
        }
        wb wbVar = wb.f32194w;
        if (wbVar != null) {
            wbVar.l();
        }
    }

    public final boolean d() {
        return this.f53822c;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        if (canvas.isHardwareAccelerated()) {
            Object obj = this.f53819a;
            if (obj != null) {
                RenderNode b10 = m4.v0.b(obj);
                b10.setPosition(0, 0, getWidth(), getHeight());
                recordingCanvas = b10.beginRecording();
            } else {
                recordingCanvas = canvas;
            }
            super.dispatchDraw(recordingCanvas);
            Object obj2 = this.f53819a;
            if (obj2 != null) {
                RenderNode b11 = m4.v0.b(obj2);
                b11.endRecording();
                canvas.drawRenderNode(b11);
                return;
            }
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f53822c || motionEvent.getActionIndex() == 0) {
            if (motionEvent.getAction() == 0) {
                this.V = motionEvent.getEventTime();
                this.W = motionEvent.getX();
                this.f53820a0 = motionEvent.getY();
                this.S = false;
                this.R = 0.0f;
                if (this.N) {
                    this.O = false;
                    this.P = false;
                }
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionIndex = motionEvent.getActionIndex();
            if (Build.VERSION.SDK_INT >= 29) {
                obtain.setLocation(motionEvent.getRawX(actionIndex), motionEvent.getRawY(actionIndex));
            } else {
                obtain.setLocation(motionEvent.getX(actionIndex) + (motionEvent.getRawX() - motionEvent.getX()), motionEvent.getY(actionIndex) + (motionEvent.getRawY() - motionEvent.getY()));
            }
            boolean onTouchEvent = ((GestureDetector) this.f53821b.f12685b).onTouchEvent(obtain);
            obtain.recycle();
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z10 = this.f53822c;
                this.d = false;
                this.f53822c = false;
                if (!this.J || this.L) {
                    if (this.f53828x) {
                        this.f53828x = false;
                    } else if (this.M && (!this.N || (this.f53825r != (-this.f53823f) + this.e && b(false)))) {
                        float f7 = this.f53825r;
                        int i10 = this.H;
                        float f10 = -i10;
                        int i11 = (f7 > f10 ? 1 : (f7 == f10 ? 0 : -1));
                        boolean z11 = this.U;
                        if (i11 <= 0) {
                            if (z11) {
                                e((-this.f53823f) + this.e);
                            }
                        } else if (f7 > f10 && f7 <= i10) {
                            if (z11) {
                                e(0.0f);
                            }
                        } else {
                            float x10 = motionEvent.getX();
                            float y3 = motionEvent.getY();
                            float f11 = this.W;
                            float f12 = this.f53820a0;
                            Typeface typeface = org.telegram.messenger.i0.f16145a;
                            float f13 = f11 - x10;
                            float f14 = f12 - y3;
                            float sqrt = (float) Math.sqrt((f14 * f14) + (f13 * f13));
                            long eventTime = motionEvent.getEventTime() - this.V;
                            if (this.F != null && (eventTime > 250 || sqrt > org.telegram.messenger.i0.L(200.0f))) {
                                this.F.a(!z10);
                            } else if (z11) {
                                e((-this.f53823f) + this.e);
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

    public final void e(float f7) {
        f(f7, false, null);
    }

    public final void f(float f7, boolean z10, Runnable runnable) {
        o1.j jVar;
        if (this.J && !z10) {
            f7 = (-getOffsetY()) + getTopActionBarOffsetY();
        }
        if (this.f53825r != f7 && ((jVar = this.G) == null || ((float) jVar.f13958m.f13965i) != f7)) {
            this.f53824n = f7;
            o1.j jVar2 = this.f53827w;
            if (jVar2 != null) {
                jVar2.d();
            }
            o1.j jVar3 = this.G;
            if (jVar3 != null) {
                jVar3.d();
            }
            o1.j jVar4 = new o1.j(this, f53818b0, f7);
            jVar4.f13958m = org.telegram.ui.Cells.f1.p(f7, 1200.0f, 1.0f);
            jVar4.a(new za(4, this, runnable));
            this.G = jVar4;
            jVar4.h();
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        Runnable runnable2 = this.E;
        if (runnable2 != null) {
            runnable2.run();
        }
    }

    public float getOffsetY() {
        return this.f53823f;
    }

    public Object getRenderNode() {
        if (this.f53819a == null && Build.VERSION.SDK_INT >= 31) {
            this.f53819a = android.support.v4.media.session.w.o();
        }
        return this.f53819a;
    }

    public float getSwipeOffsetY() {
        return this.f53825r;
    }

    public float getTopActionBarOffsetY() {
        return this.e;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f7;
        super.onConfigurationChanged(configuration);
        Point point = org.telegram.messenger.i0.f16172q;
        if (point.x > point.y) {
            f7 = 8.0f;
        } else {
            f7 = 64.0f;
        }
        this.H = org.telegram.messenger.i0.L(f7);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            this.d = true;
            this.f53822c = false;
        }
    }

    public void setAllowFullSizeSwipe(boolean z10) {
        this.L = z10;
    }

    public void setAllowSwipes(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
        }
    }

    public void setDelegate(h3 h3Var) {
        this.F = h3Var;
    }

    public void setForceOffsetY(float f7) {
        this.f53823f = f7;
        c();
    }

    public void setFullSize(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            if (z10) {
                if (this.K) {
                    e(getTopActionBarOffsetY() + (-getOffsetY()));
                    return;
                }
                return;
            }
            e(0.0f);
        }
    }

    public void setIsKeyboardVisible(m9 m9Var) {
        this.I = m9Var;
    }

    public void setOffsetY(final float f7) {
        boolean z10;
        if (this.f53824n != -2.1474836E9f) {
            this.h = f7;
            return;
        }
        o1.j jVar = this.f53827w;
        if (jVar != null) {
            jVar.d();
        }
        final float f10 = this.f53823f;
        final float f11 = f7 - f10;
        if (Math.abs((this.f53825r + f10) - this.e) <= org.telegram.messenger.i0.L(1.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        final boolean z11 = z10;
        if (!this.f53826s) {
            o1.j jVar2 = this.f53827w;
            if (jVar2 != null) {
                jVar2.d();
            }
            o1.j jVar3 = new o1.j(new o1.i(f10));
            jVar3.f13958m = org.telegram.ui.Cells.f1.p(f7, 1400.0f, 1.0f);
            jVar3.b(new o1.g() {
                @Override
                public final void a(o1.j jVar4, float f12, float f13) {
                    float f14;
                    i3 i3Var = i3.this;
                    i3Var.f53823f = f12;
                    float f15 = f11;
                    int i10 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
                    float f16 = f10;
                    if (i10 == 0) {
                        f14 = 1.0f;
                    } else {
                        f14 = (f12 - f16) / f15;
                    }
                    if (z11) {
                        i3Var.f53825r = w7.u.a(i3Var.f53825r - (Math.max(0.0f, f15) * f14), (-i3Var.f53823f) + i3Var.e, (i3Var.getHeight() - i3Var.f53823f) + i3Var.e);
                    }
                    o1.j jVar5 = i3Var.G;
                    if (jVar5 != null) {
                        o1.k kVar = jVar5.f13958m;
                        float f17 = i3Var.e;
                        if (((float) kVar.f13965i) == (-f16) + f17) {
                            kVar.f13965i = (-f7) + f17;
                        }
                    }
                    i3Var.c();
                }
            });
            jVar3.a(new gf0(this, f7, 2));
            this.f53827w = jVar3;
            jVar3.h();
            return;
        }
        this.f53823f = f7;
        if (z11) {
            this.f53825r = w7.u.a(this.f53825r - Math.max(0.0f, f11), (-this.f53823f) + this.e, (getHeight() - this.f53823f) + this.e);
        }
        c();
    }

    public void setScrollEndListener(Runnable runnable) {
        this.E = runnable;
    }

    public void setScrollListener(Runnable runnable) {
        this.D = runnable;
    }

    public void setShouldWaitWebViewScroll(boolean z10) {
        this.N = z10;
    }

    public void setSwipeOffsetAnimationDisallowed(boolean z10) {
        this.f53826s = z10;
    }

    public void setSwipeOffsetY(float f7) {
        this.f53825r = f7;
        c();
    }

    public void setTopActionBarOffsetY(float f7) {
        this.e = f7;
        c();
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
    }

    public void setWebView(org.telegram.ui.web.v0 v0Var) {
        this.f53829y = v0Var;
    }
}
