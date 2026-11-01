package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class zr0 extends org.telegram.ui.Components.wu0 {
    public final Paint f44046j0;
    public boolean f44047k0;
    public boolean f44048l0;
    public ArrayList m0;
    public final PhotoViewer f44049n0;

    public zr0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.f44049n0 = photoViewer;
        Paint paint = new Paint();
        this.f44046j0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void R() {
        float f7;
        super.R();
        PhotoViewer photoViewer = this.f44049n0;
        if (photoViewer.f33591r1) {
            dq0 dq0Var = photoViewer.W0[0];
            if (getKeyboardHeight() <= org.telegram.messenger.i0.L(20.0f)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            dq0Var.e(2, f7, true);
        }
    }

    public final void X() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.m0 == null) {
                this.m0 = new ArrayList();
            }
            this.m0.clear();
            PhotoViewer photoViewer = this.f44049n0;
            if (photoViewer.f33622u4 == 1 || photoViewer.f33570o6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.m0.add(new Rect(0, org.telegram.messenger.a30.y(200.0f, measuredHeight, 2), org.telegram.messenger.i0.L(100.0f), (org.telegram.messenger.i0.L(200.0f) + measuredHeight) / 2));
                this.m0.add(new Rect(measuredWidth - org.telegram.messenger.i0.L(100.0f), org.telegram.messenger.a30.y(200.0f, measuredHeight, 2), measuredWidth, (org.telegram.messenger.i0.L(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.m0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.f44049n0;
        photoViewer.Q.n(photoViewer.f33494g0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.f44049n0;
        org.telegram.ui.Cells.v9 n10 = photoViewer.Q.n(getContext());
        org.telegram.ui.Cells.w9 w9Var = n10.f23340r;
        if (motionEvent.getAction() == 0) {
            n10.h = motionEvent.getX();
            n10.f23339n = motionEvent.getY();
            w9Var.e = w9Var.x();
        } else if (w9Var.e && Math.abs(motionEvent.getX() - n10.h) < org.telegram.messenger.i0.e && Math.abs(motionEvent.getY() - n10.f23339n) < org.telegram.messenger.i0.e && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.w9 w9Var2 = n10.f23340r;
            if (!w9Var2.f23426i && w9Var2.e) {
                w9Var2.f(false);
            }
        }
        if (photoViewer.Q.x()) {
            photoViewer.Q.n(getContext()).onTouchEvent(motionEvent);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.f44049n0;
        lr0 lr0Var = photoViewer.f33486f0;
        if (lr0Var != null && lr0Var.f31278y) {
            int measuredHeight = ((int) ((photoViewer.f33445a6 - 1.0f) * lr0Var.getWebView().getMeasuredHeight())) / 2;
            org.telegram.ui.Components.n61 n61Var = photoViewer.f33666z1;
            if (n61Var != null && n61Var.f28686j) {
                n61Var.setBounds(photoViewer.f33486f0.getLeft(), (photoViewer.f33486f0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.Y5 / photoViewer.f33445a6)), photoViewer.f33486f0.getRight(), photoViewer.f33486f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.f33445a6)));
                photoViewer.f33666z1.draw(canvas);
            }
            org.telegram.ui.Components.sn0 sn0Var = photoViewer.A1;
            if (sn0Var != null && sn0Var.a()) {
                photoViewer.A1.setBounds(photoViewer.f33486f0.getLeft(), (int) ((photoViewer.F.getAlpha() * org.telegram.messenger.i0.L(90.0f)) + org.telegram.messenger.i0.f16166m), photoViewer.f33486f0.getRight(), photoViewer.f33486f0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.Y5 / photoViewer.f33445a6)));
                photoViewer.A1.draw(canvas);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.f44049n0;
        if (view != photoViewer.Q.n(photoViewer.f33494g0.getContext()) && view != photoViewer.f33605s5 && view != photoViewer.f33669z4 && view != photoViewer.A4 && view != photoViewer.X0) {
            FrameLayout frameLayout = photoViewer.R7;
            if (view == frameLayout && frameLayout.getTranslationY() > 0.0f && photoViewer.P0.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(photoViewer.R7.getX(), photoViewer.R7.getY(), photoViewer.R7.getX() + photoViewer.R7.getMeasuredWidth(), photoViewer.R7.getBottom());
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
            try {
                if (view != photoViewer.f33659y2 && view != photoViewer.f33660y4) {
                    if (super.drawChild(canvas, view, j10)) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int getBottomPadding() {
        return this.f44049n0.P0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(2131296351, new z8(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(2131296351, null);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        kg.g1 g1Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.U8;
        PhotoViewer photoViewer = this.f44049n0;
        photoViewer.Y1(canvas);
        if (org.telegram.messenger.i0.f16166m != 0 && (g1Var = photoViewer.F) != null) {
            Paint paint = this.f44046j0;
            paint.setAlpha((int) (g1Var.getAlpha() * 255.0f * 0.498f));
            if (getPaddingRight() > 0) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() - getPaddingRight(), 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            } else {
                canvas2 = canvas;
            }
            if (getPaddingLeft() > 0) {
                canvas2.drawRect(0.0f, 0.0f, getPaddingLeft(), getMeasuredHeight(), paint);
            }
            if (getPaddingBottom() > 0) {
                float alpha = (1.0f - photoViewer.F.getAlpha()) * org.telegram.messenger.i0.N(24.0f);
                canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha, getMeasuredWidth(), getMeasuredHeight() + alpha, paint);
            }
        }
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zr0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int q6;
        int o10;
        View view;
        int i16;
        zr0 zr0Var = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (zr0Var.getLayoutParams().height > 0) {
            size2 = zr0Var.getLayoutParams().height;
        }
        int i17 = size2;
        zr0Var.setMeasuredDimension(size, i17);
        PhotoViewer photoViewer = zr0Var.f44049n0;
        boolean z10 = true;
        if (!photoViewer.f33591r1) {
            zr0Var.f44047k0 = true;
            if (photoViewer.f33514i2) {
                Point point = org.telegram.messenger.i0.f16172q;
                if (point.x > point.y) {
                    i16 = 5;
                } else {
                    i16 = 10;
                }
                photoViewer.Q1.getCurrentView().setMaxLines(i16);
                photoViewer.Q1.getNextView().setMaxLines(i16);
            } else {
                photoViewer.Q1.getCurrentView().setMaxLines(Integer.MAX_VALUE);
                photoViewer.Q1.getNextView().setMaxLines(Integer.MAX_VALUE);
            }
            zr0Var.f44047k0 = false;
        }
        if (photoViewer.f33512i0.getVisibility() != 8) {
            i12 = org.telegram.messenger.i0.L(48.0f);
        } else {
            i12 = 0;
        }
        org.telegram.ui.Components.d30 d30Var = photoViewer.l1;
        if (d30Var != null && d30Var.getVisibility() != 8) {
            ((ViewGroup.MarginLayoutParams) photoViewer.l1.getLayoutParams()).bottomMargin = i12;
            i13 = i10;
            zr0Var.measureChildWithMargins(photoViewer.l1, i13, 0, i11, 0);
            int measuredHeight = photoViewer.l1.getMeasuredHeight();
            zr0Var.f44047k0 = true;
            if (!org.telegram.messenger.i0.Q1() && i17 < size) {
                if (photoViewer.l1.getVisibility() != 4) {
                    photoViewer.l1.setVisibility(4);
                }
            } else if (photoViewer.l1.getVisibility() != 0) {
                photoViewer.l1.setVisibility(0);
            }
            zr0Var.f44047k0 = false;
            i14 = measuredHeight;
        } else {
            i13 = i10;
            i14 = 0;
        }
        ls0 ls0Var = photoViewer.f33515i3;
        if (ls0Var != null) {
            ls0Var.e = size;
            ls0Var.f39369f = i17;
        }
        int paddingLeft = size - (zr0Var.getPaddingLeft() + zr0Var.getPaddingRight());
        int paddingBottom = i17 - zr0Var.getPaddingBottom();
        int childCount = zr0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount) {
            View childAt = zr0Var.getChildAt(i18);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.l1) {
                org.telegram.ui.Components.af0 af0Var = photoViewer.f33659y2;
                if (childAt == af0Var) {
                    childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(zr0Var.getMeasuredHeight(), 1073741824));
                } else if (childAt == photoViewer.f33660y4) {
                    if (af0Var != null && af0Var.getVisibility() == 0) {
                        if (photoViewer.D2) {
                            view = photoViewer.C2;
                        } else {
                            view = photoViewer.B2;
                        }
                        q6 = view.getMeasuredWidth();
                        o10 = view.getMeasuredHeight();
                    } else {
                        q6 = photoViewer.C4.q();
                        o10 = photoViewer.C4.o();
                    }
                    if (q6 == 0 || o10 == 0) {
                        q6 = paddingLeft;
                        o10 = paddingBottom;
                    }
                    photoViewer.f33660y4.measure(View.MeasureSpec.makeMeasureSpec(q6, 1073741824), View.MeasureSpec.makeMeasureSpec(o10, 1073741824));
                } else if (!photoViewer.U1.f51355f.l(childAt) && !photoViewer.V1.f51355f.l(childAt)) {
                    if (childAt == photoViewer.T1) {
                        if (photoViewer.f33547m2) {
                            if (zr0Var.f44048l0) {
                                i15 = i12 + i14;
                                int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m)) - i15;
                                ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                            }
                            i15 = i12;
                            int currentActionBarHeight2 = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight2, 1073741824));
                        } else if (photoViewer.l1.c() && (org.telegram.messenger.i0.Q1() || paddingBottom > paddingLeft)) {
                            i15 = i12 + i14;
                            zr0Var.f44048l0 = z10;
                            int currentActionBarHeight22 = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight22, 1073741824));
                        } else {
                            zr0Var.f44048l0 = false;
                            i15 = i12;
                            int currentActionBarHeight222 = (paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m)) - i15;
                            ((ViewGroup.MarginLayoutParams) photoViewer.T1.getLayoutParams()).bottomMargin = i15;
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight222, 1073741824));
                        }
                    } else if (childAt != photoViewer.Y1 && childAt != photoViewer.Q0) {
                        if (childAt == photoViewer.V1.M) {
                            childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m), 1073741824));
                        } else {
                            zr0Var.measureChildWithMargins(childAt, i13, 0, i11, 0);
                        }
                    } else {
                        childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16166m), 1073741824));
                    }
                } else if (photoViewer.f33599s) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                } else if (org.telegram.messenger.i0.E) {
                    if (org.telegram.messenger.i0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(320.0f), paddingBottom - org.telegram.messenger.i0.f16166m), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom - org.telegram.messenger.i0.f16166m, 1073741824));
                    }
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + org.telegram.messenger.i0.f16167n, 1073741824));
                }
            }
            i18++;
            z10 = true;
            zr0Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f44047k0) {
            return;
        }
        super.requestLayout();
    }
}
