package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class w61 extends FrameLayout {
    public final int f52473a;
    public final Object f52474b;
    public final Object f52475c;

    public w61(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f52473a = i7;
        this.f52475c = obj;
        this.f52474b = obj2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f52473a) {
            case 1:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.Wallet.y5) this.f52475c).getClass();
                return;
            case 2:
            case 4:
            default:
                super.dispatchDraw(canvas);
                return;
            case 3:
                bg.c0 c0Var = (bg.c0) this.f52475c;
                c0Var.b(org.telegram.ui.ActionBar.j6.r1(0.65f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, (org.telegram.ui.ActionBar.e6) this.f52474b)));
                c0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 5:
                ((ug.z0) this.f52474b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                ug.z0 z0Var = (ug.z0) this.f52474b;
                z0Var.f58392f.setAlpha(((ug.x0) this.f52475c).F1);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(24.0f) - 1, org.telegram.messenger.g0.L(24.0f) - 1, z0Var.f58392f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f52473a) {
            case 3:
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
        switch (this.f52473a) {
            case 1:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.f52475c;
                if (view == y5Var.f44750t0 && y5Var.G) {
                    int save = canvas.save();
                    canvas.concat(y5Var.J);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    canvas.restoreToCount(save);
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            case 4:
                Path path = (Path) this.f52474b;
                tg.f0 f0Var = (tg.f0) this.f52475c;
                if (f0Var.h != null && (((z10 = f0Var.f57232f) && view == f0Var.d) || (!z10 && view == f0Var.f57230c))) {
                    if (z10) {
                        f10 = f0Var.f57231e;
                    } else {
                        f10 = 1.0f - f0Var.f57231e;
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
        switch (this.f52473a) {
            case 0:
                super.invalidate();
                ai.k0 k0Var = ((t71) this.f52475c).f51466v0;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
            case 1:
            default:
                super.invalidate();
                return;
            case 2:
                super.invalidate();
                ((pg.i) this.f52475c).invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f52473a) {
            case 1:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.l5) this.f52474b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f52473a) {
            case 1:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.l5) this.f52474b);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f52473a) {
            case 0:
                int[] iArr = (int[]) this.f52474b;
                t71 t71Var = (t71) this.f52475c;
                if (!org.telegram.messenger.g0.D) {
                    getLocationInWindow(iArr);
                    float translationY = t71Var.f51464u0.getTranslationY();
                    int i7 = iArr[1];
                    if (translationY != i7) {
                        t71Var.f51464u0.setTranslationY(-i7);
                        t71Var.f51466v0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < t71Var.R) {
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
        switch (this.f52473a) {
            case 5:
                super.onMeasure(i7, org.telegram.messenger.i20.B(2.0f, ((ug.x0) this.f52475c).f58377u1, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f52473a) {
            case 3:
                super.onSizeChanged(i7, i10, i11, i12);
                bg.c0 c0Var = (bg.c0) this.f52475c;
                c0Var.setBounds(0, 0, i7, i10);
                c0Var.c(0, org.telegram.messenger.g0.L(24.0f) + getPaddingBottom());
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
        switch (this.f52473a) {
            case 2:
                pg.i iVar = (pg.i) this.f52475c;
                pg.d dVar = iVar.f55046r;
                boolean onTouchEvent = ((GestureDetector) ((org.telegram.messenger.ou) this.f52474b).f25804b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    org.telegram.messenger.g0.i3(dVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.r(dVar);
                    if (!iVar.h) {
                        r1.h hVar = iVar.f55042c.f55748m;
                        if (((float) hVar.f55756i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.1474836E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.1474836E9f;
                        }
                        hVar.f55756i = pg.i.a(displayMetrics, f10);
                        iVar.d.f55748m.f55756i = pg.i.b(getResources().getDisplayMetrics(), (float) iVar.d.f55748m.f55756i);
                        iVar.f55042c.h();
                        iVar.d.h();
                    }
                    iVar.f55045n = false;
                    iVar.f55044f = false;
                    iVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f52473a) {
            case 2:
                super.setTranslationX(f10);
                ((pg.i) this.f52475c).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f52473a) {
            case 2:
                super.setTranslationY(f10);
                ((pg.i) this.f52475c).invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public w61(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f52473a = 3;
        this.f52475c = new bg.c0(8);
        this.f52474b = e6Var;
    }

    public w61(org.telegram.ui.Wallet.y5 y5Var, Context context) {
        super(context);
        this.f52473a = 1;
        this.f52475c = y5Var;
        this.f52474b = new org.telegram.ui.Wallet.l5(0, this);
    }

    public w61(Context context, t71 t71Var) {
        super(context);
        this.f52473a = 0;
        this.f52475c = t71Var;
        this.f52474b = new int[2];
    }

    public w61(tg.f0 f0Var, Context context) {
        super(context);
        this.f52473a = 4;
        this.f52475c = f0Var;
        this.f52474b = new Path();
    }
}
