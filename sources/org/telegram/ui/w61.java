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
public final class w61 extends FrameLayout {
    public final int f53180a;
    public final Object f53181b;
    public final Object f53182c;

    public w61(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f53180a = i7;
        this.f53181b = obj;
        this.f53182c = obj2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f53180a) {
            case 2:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.Wallet.o6) this.f53181b).getClass();
                return;
            case 3:
            case 5:
            default:
                super.dispatchDraw(canvas);
                return;
            case 4:
                bg.d0 d0Var = (bg.d0) this.f53181b;
                d0Var.b(org.telegram.ui.ActionBar.n6.r1(0.65f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, (org.telegram.ui.ActionBar.i6) this.f53182c)));
                d0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 6:
                ((ug.a1) this.f53182c).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, org.telegram.messenger.g0.L(2.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                ug.a1 a1Var = (ug.a1) this.f53182c;
                a1Var.f58727f.setAlpha(((ug.y0) this.f53181b).F1);
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(24.0f) - 1, org.telegram.messenger.g0.L(24.0f) - 1, a1Var.f58727f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f53180a) {
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
        switch (this.f53180a) {
            case 2:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) this.f53181b;
                if (view == o6Var.f44818v0 && o6Var.G) {
                    int save = canvas.save();
                    canvas.concat(o6Var.J);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    canvas.restoreToCount(save);
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            case 5:
                Path path = (Path) this.f53182c;
                tg.k0 k0Var = (tg.k0) this.f53181b;
                if (k0Var.h != null && (((z10 = k0Var.f58015f) && view == k0Var.d) || (!z10 && view == k0Var.f58013c))) {
                    if (z10) {
                        f10 = k0Var.f58014e;
                    } else {
                        f10 = 1.0f - k0Var.f58014e;
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
        switch (this.f53180a) {
            case 1:
                super.invalidate();
                ai.i0 i0Var = ((v71) this.f53181b).f52903v0;
                if (i0Var != null) {
                    i0Var.invalidate();
                    return;
                }
                return;
            case 2:
            default:
                super.invalidate();
                return;
            case 3:
                super.invalidate();
                ((pg.i) this.f53181b).invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f53180a) {
            case 2:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.b6) this.f53182c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f53180a) {
            case 2:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.b6) this.f53182c);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f53180a) {
            case 0:
                int intrinsicHeight = org.telegram.ui.ActionBar.n6.f29540i3.getIntrinsicHeight();
                org.telegram.ui.ActionBar.n6.f29540i3.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                org.telegram.ui.ActionBar.n6.f29540i3.draw(canvas);
                Paint paint = (Paint) this.f53182c;
                paint.setColor(((v71) this.f53181b).getThemedColor(org.telegram.ui.ActionBar.n6.Je));
                canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), paint);
                return;
            case 1:
                int[] iArr = (int[]) this.f53182c;
                v71 v71Var = (v71) this.f53181b;
                if (!org.telegram.messenger.g0.D) {
                    getLocationInWindow(iArr);
                    float translationY = v71Var.f52901u0.getTranslationY();
                    int i7 = iArr[1];
                    if (translationY != i7) {
                        v71Var.f52901u0.setTranslationY(-i7);
                        v71Var.f52903v0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < v71Var.R) {
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
        switch (this.f53180a) {
            case 6:
                super.onMeasure(i7, org.telegram.messenger.m10.C(2.0f, ((ug.y0) this.f53181b).f59085u1, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f53180a) {
            case 4:
                super.onSizeChanged(i7, i10, i11, i12);
                bg.d0 d0Var = (bg.d0) this.f53181b;
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
        switch (this.f53180a) {
            case 3:
                pg.i iVar = (pg.i) this.f53181b;
                pg.d dVar = iVar.f55745r;
                boolean onTouchEvent = ((GestureDetector) ((org.telegram.ui.Components.nd0) this.f53182c).f37766b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    org.telegram.messenger.g0.h3(dVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.r(dVar);
                    if (!iVar.h) {
                        r1.h hVar = iVar.f55741c.f56446m;
                        if (((float) hVar.f56454i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.1474836E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.1474836E9f;
                        }
                        hVar.f56454i = pg.i.a(displayMetrics, f10);
                        iVar.d.f56446m.f56454i = pg.i.b(getResources().getDisplayMetrics(), (float) iVar.d.f56446m.f56454i);
                        iVar.f55741c.h();
                        iVar.d.h();
                    }
                    iVar.f55744n = false;
                    iVar.f55743f = false;
                    iVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f53180a) {
            case 3:
                super.setTranslationX(f10);
                ((pg.i) this.f53181b).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f53180a) {
            case 3:
                super.setTranslationY(f10);
                ((pg.i) this.f53181b).invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    public w61(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f53180a = 4;
        this.f53181b = new bg.d0(8);
        this.f53182c = i6Var;
    }

    public w61(org.telegram.ui.Wallet.o6 o6Var, Context context) {
        super(context);
        this.f53180a = 2;
        this.f53181b = o6Var;
        this.f53182c = new org.telegram.ui.Wallet.b6(0, this);
    }

    public w61(v71 v71Var, Context context, int i7) {
        super(context);
        this.f53180a = i7;
        switch (i7) {
            case 1:
                this.f53181b = v71Var;
                super(context);
                this.f53182c = new int[2];
                return;
            default:
                this.f53181b = v71Var;
                this.f53182c = new Paint();
                return;
        }
    }

    public w61(tg.k0 k0Var, Context context) {
        super(context);
        this.f53180a = 5;
        this.f53181b = k0Var;
        this.f53182c = new Path();
    }
}
