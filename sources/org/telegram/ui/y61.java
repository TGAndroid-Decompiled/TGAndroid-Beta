package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class y61 extends FrameLayout {
    public final int f54079a;
    public final Object f54080b;
    public final Object f54081c;

    public y61(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f54079a = i7;
        this.f54080b = obj;
        this.f54081c = obj2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f54079a) {
            case 2:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.Wallet.n6) this.f54080b).getClass();
                return;
            case 3:
            case 5:
            default:
                super.dispatchDraw(canvas);
                return;
            case 4:
                bg.d0 d0Var = (bg.d0) this.f54080b;
                d0Var.b(org.telegram.ui.ActionBar.n6.r1(0.65f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29396d6, (org.telegram.ui.ActionBar.i6) this.f54081c)));
                d0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 6:
                ((ug.b1) this.f54081c).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                ug.b1 b1Var = (ug.b1) this.f54081c;
                b1Var.f58606f.setAlpha(((ug.z0) this.f54080b).F1);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(24.0f) - 1, org.telegram.messenger.g0.L(24.0f) - 1, b1Var.f58606f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f54079a) {
            case 4:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        float f10;
        switch (this.f54079a) {
            case 2:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.f54080b;
                if (view == n6Var.f44646v0 && n6Var.G) {
                    int save = canvas.save();
                    canvas.concat(n6Var.J);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    canvas.restoreToCount(save);
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            case 5:
                Path path = (Path) this.f54081c;
                tg.f0 f0Var = (tg.f0) this.f54080b;
                if (f0Var.h != null && (((z10 = f0Var.f57835f) && view == f0Var.d) || (!z10 && view == f0Var.f57833c))) {
                    if (z10) {
                        f10 = f0Var.f57834e;
                    } else {
                        f10 = 1.0f - f0Var.f57834e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild2 = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild2;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f54079a) {
            case 1:
                super.invalidate();
                ai.l0 l0Var = ((x71) this.f54080b).f53740v0;
                if (l0Var != null) {
                    l0Var.invalidate();
                    return;
                }
                return;
            case 2:
            default:
                super.invalidate();
                return;
            case 3:
                super.invalidate();
                ((pg.i) this.f54080b).invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f54079a) {
            case 2:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.a6) this.f54081c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f54079a) {
            case 2:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.a6) this.f54081c);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f54079a) {
            case 0:
                int intrinsicHeight = org.telegram.ui.ActionBar.n6.f29485i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.n6.f29485i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.n6.f29485i3.draw(canvas);
                Paint paint = (Paint) this.f54081c;
                paint.setColor(((x71) this.f54080b).getThemedColor(org.telegram.ui.ActionBar.n6.Je));
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
                return;
            case 1:
                int[] iArr = (int[]) this.f54081c;
                x71 x71Var = (x71) this.f54080b;
                if (!org.telegram.messenger.g0.D) {
                    getLocationInWindow(iArr);
                    float translationY = x71Var.f53738u0.getTranslationY();
                    int i7 = iArr[1];
                    if (translationY != i7) {
                        x71Var.f53738u0.setTranslationY(-i7);
                        x71Var.f53740v0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < x71Var.R) {
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f54079a) {
            case 6:
                super.onMeasure(i7, org.telegram.messenger.n10.C(2.0f, ((ug.z0) this.f54080b).f58964u1, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f54079a) {
            case 4:
                super.onSizeChanged(i7, i10, i11, i12);
                bg.d0 d0Var = (bg.d0) this.f54080b;
                d0Var.setBounds(0, 0, i7, i10);
                d0Var.c(0, org.telegram.messenger.g0.L(24.0f) + getPaddingBottom());
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f10;
        switch (this.f54079a) {
            case 3:
                pg.i iVar = (pg.i) this.f54080b;
                pg.d dVar = iVar.f55622r;
                boolean onTouchEvent = ((GestureDetector) ((org.telegram.ui.Components.hn) this.f54081c).f35933b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    org.telegram.messenger.g0.h3(dVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.r(dVar);
                    if (!iVar.h) {
                        r1.h hVar = iVar.f55618c.f56323m;
                        if (((float) hVar.f56331i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.1474836E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.1474836E9f;
                        }
                        hVar.f56331i = pg.i.a(displayMetrics, f10);
                        iVar.d.f56323m.f56331i = pg.i.b(getResources().getDisplayMetrics(), (float) iVar.d.f56323m.f56331i);
                        iVar.f55618c.h();
                        iVar.d.h();
                    }
                    iVar.f55621n = false;
                    iVar.f55620f = false;
                    iVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f54079a) {
            case 3:
                super.setTranslationX(f10);
                ((pg.i) this.f54080b).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f54079a) {
            case 3:
                super.setTranslationY(f10);
                ((pg.i) this.f54080b).invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public y61(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f54079a = 4;
        this.f54080b = new bg.d0(8);
        this.f54081c = i6Var;
    }

    public y61(org.telegram.ui.Wallet.n6 n6Var, Context context) {
        super(context);
        this.f54079a = 2;
        this.f54080b = n6Var;
        this.f54081c = new org.telegram.ui.Wallet.a6(0, this);
    }

    public y61(x71 x71Var, Context context, int i7) {
        super(context);
        this.f54079a = i7;
        switch (i7) {
            case 1:
                this.f54080b = x71Var;
                super(context);
                this.f54081c = new int[2];
                return;
            default:
                this.f54080b = x71Var;
                this.f54081c = new Paint();
                return;
        }
    }

    public y61(tg.f0 f0Var, Context context) {
        super(context);
        this.f54079a = 5;
        this.f54080b = f0Var;
        this.f54081c = new Path();
    }
}
