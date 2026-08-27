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
import org.telegram.messenger.AndroidUtilities;

public final class ut0 extends org.telegram.ui.Components.av0 {
    public final PhotoViewer A0;

    public final Paint f43285w0;

    public boolean f43286x0;

    public boolean f43287y0;

    public ArrayList f43288z0;

    public ut0(PhotoViewer photoViewer, Activity activity, Activity activity2) {
        super(activity, activity2);
        this.A0 = photoViewer;
        Paint paint = new Paint();
        this.f43285w0 = paint;
        setWillNotDraw(false);
        paint.setColor(855638016);
        setLayerType(2, null);
    }

    @Override
    public final void S() {
        super.S();
        PhotoViewer photoViewer = this.A0;
        if (photoViewer.f35702n1) {
            photoViewer.S0[0].e(2, getKeyboardHeight() <= AndroidUtilities.dp(20.0f) ? 1.0f : 0.0f, true);
        }
    }

    public final void Z() {
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f43288z0 == null) {
                this.f43288z0 = new ArrayList();
            }
            this.f43288z0.clear();
            PhotoViewer photoViewer = this.A0;
            if (photoViewer.f35731q4 == 1 || photoViewer.f35681k6 == 1) {
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = getMeasuredWidth();
                this.f43288z0.add(new Rect(0, org.telegram.messenger.rl.x(200.0f, measuredHeight, 2), AndroidUtilities.dp(100.0f), (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
                this.f43288z0.add(new Rect(measuredWidth - AndroidUtilities.dp(100.0f), org.telegram.messenger.rl.x(200.0f, measuredHeight, 2), measuredWidth, (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
            }
            setSystemGestureExclusionRects(this.f43288z0);
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        PhotoViewer photoViewer = this.A0;
        photoViewer.M.o(photoViewer.f35601c0.getContext()).draw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PhotoViewer photoViewer = this.A0;
        org.telegram.ui.Cells.v9 v9VarO = photoViewer.M.o(getContext());
        org.telegram.ui.Cells.w9 w9Var = v9VarO.f25826r;
        if (motionEvent.getAction() == 0) {
            v9VarO.h = motionEvent.getX();
            v9VarO.f25825n = motionEvent.getY();
            w9Var.f25865e = w9Var.y();
        } else if (w9Var.f25865e && Math.abs(motionEvent.getX() - v9VarO.h) < AndroidUtilities.touchSlop && Math.abs(motionEvent.getY() - v9VarO.f25825n) < AndroidUtilities.touchSlop && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            motionEvent.getX();
            motionEvent.getY();
            org.telegram.ui.Cells.w9 w9Var2 = v9VarO.f25826r;
            if (!w9Var2.f25872i && w9Var2.f25865e) {
                w9Var2.f(false);
            }
        }
        if (!photoViewer.M.y()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        photoViewer.M.o(getContext()).onTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        PhotoViewer photoViewer = this.A0;
        ht0 ht0Var = photoViewer.f35591b0;
        if (ht0Var == null || !ht0Var.f27746x) {
            return;
        }
        int measuredHeight = ((int) ((photoViewer.W5 - 1.0f) * ht0Var.getWebView().getMeasuredHeight())) / 2;
        org.telegram.ui.Components.c61 c61Var = photoViewer.f35774v1;
        if (c61Var != null && c61Var.f27337j) {
            c61Var.setBounds(photoViewer.f35591b0.getLeft(), (photoViewer.f35591b0.getWebView().getTop() - measuredHeight) + ((int) (photoViewer.U5 / photoViewer.W5)), photoViewer.f35591b0.getRight(), photoViewer.f35591b0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.U5 / photoViewer.W5)));
            photoViewer.f35774v1.draw(canvas);
        }
        org.telegram.ui.Components.un0 un0Var = photoViewer.f35783w1;
        if (un0Var == null || !un0Var.a()) {
            return;
        }
        photoViewer.f35783w1.setBounds(photoViewer.f35591b0.getLeft(), (int) ((photoViewer.B.getAlpha() * AndroidUtilities.dp(90.0f)) + AndroidUtilities.statusBarHeight), photoViewer.f35591b0.getRight(), photoViewer.f35591b0.getWebView().getBottom() + measuredHeight + ((int) (photoViewer.U5 / photoViewer.W5)));
        photoViewer.f35783w1.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        PhotoViewer photoViewer = this.A0;
        if (view == photoViewer.M.o(photoViewer.f35601c0.getContext()) || view == photoViewer.f35715o5 || view == photoViewer.v4 || view == photoViewer.f35786w4 || view == photoViewer.T0) {
            return false;
        }
        FrameLayout frameLayout = photoViewer.M7;
        if (view != frameLayout || frameLayout.getTranslationY() <= 0.0f || photoViewer.L0.getTranslationY() != 0.0f) {
            try {
                return (view == photoViewer.f35766u2 || view == photoViewer.f35768u4 || !super.drawChild(canvas, view, j10)) ? false : true;
            } catch (Throwable unused) {
                return true;
            }
        }
        canvas.save();
        canvas.clipRect(photoViewer.M7.getX(), photoViewer.M7.getY(), photoViewer.M7.getX() + photoViewer.M7.getMeasuredWidth(), photoViewer.M7.getBottom());
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final int getBottomPadding() {
        return this.A0.L0.getHeight();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.Components.ec.a(this, new y8(this, 6));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.ec.h(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ag.d2 d2Var;
        Canvas canvas2;
        Drawable[] drawableArr = PhotoViewer.P8;
        PhotoViewer photoViewer = this.A0;
        photoViewer.U1(canvas);
        if (AndroidUtilities.statusBarHeight == 0 || (d2Var = photoViewer.B) == null) {
            return;
        }
        int alpha = (int) (d2Var.getAlpha() * 255.0f * 0.498f);
        Paint paint = this.f43285w0;
        paint.setAlpha(alpha);
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
            float alpha2 = (1.0f - photoViewer.B.getAlpha()) * AndroidUtilities.dpf2(24.0f);
            canvas2.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + alpha2, getMeasuredWidth(), getMeasuredHeight() + alpha2, paint);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int paddingBottom;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int measuredHeight;
        zr0 zr0Var;
        int i19;
        int top;
        int iDp;
        int measuredHeight2;
        int iDp2;
        PhotoViewer photoViewer = this.A0;
        if (photoViewer.f35732q5 != null && photoViewer.f35760t5 != null) {
            int iDp3 = (i12 - i10) - AndroidUtilities.dp(20.0f);
            photoViewer.f35760t5.setTranslationY(((-iDp3) / 2.0f) - AndroidUtilities.dp(47.0f));
            float f10 = iDp3 / 2.0f;
            photoViewer.f35732q5.setTranslationY(AndroidUtilities.dp(47.0f) + f10);
            photoViewer.f35724p5.setTranslationY(AndroidUtilities.dp(47.0f) + f10);
            photoViewer.f35769u5.setTranslationY(f10 + AndroidUtilities.dp(95.0f));
        }
        int childCount = getChildCount();
        R();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                if (childAt == photoViewer.f35766u2) {
                    paddingLeft = i10;
                    paddingRight = i12;
                    paddingBottom = i13;
                } else {
                    paddingLeft = getPaddingLeft() + i10;
                    paddingRight = i12 - getPaddingRight();
                    paddingBottom = i13 - getPaddingBottom();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & 7;
                int i23 = i21 & 112;
                if (i22 != 1) {
                    if (i22 != 5) {
                        i16 = layoutParams.leftMargin;
                    } else {
                        i14 = (paddingRight - paddingLeft) - measuredWidth;
                        i15 = layoutParams.rightMargin;
                    }
                    if (i23 != 16) {
                        if (i23 != 80) {
                            measuredHeight = layoutParams.topMargin;
                        } else {
                            i17 = (paddingBottom - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        zr0Var = photoViewer.Q1;
                        if (childAt != zr0Var.I) {
                            if (childAt == photoViewer.R1.I) {
                                measuredHeight += photoViewer.B.getMeasuredHeight();
                            } else if (!zr0Var.f16338f.l(childAt) || photoViewer.R1.f16338f.l(childAt)) {
                                int i24 = (i13 - i11) - measuredHeight3;
                                if (!photoViewer.f35745s || AndroidUtilities.isInMultiwindow) {
                                    i19 = 0;
                                } else {
                                    i19 = AndroidUtilities.navigationBarHeight;
                                }
                                measuredHeight = i24 + i19;
                            } else if (childAt == photoViewer.f35676k1) {
                                measuredHeight = AndroidUtilities.dp(5.0f) + photoViewer.B.getMeasuredHeight();
                            } else {
                                float f11 = 40.0f;
                                if (childAt == photoViewer.f35584a1 || childAt == photoViewer.f35592b1 || childAt == photoViewer.f35602c1) {
                                    FrameLayout frameLayout = photoViewer.M7;
                                    if (frameLayout == null || frameLayout.getVisibility() != 0) {
                                        top = photoViewer.L0.getTop();
                                        if (childAt == photoViewer.f35592b1) {
                                            top -= AndroidUtilities.dp(50.0f);
                                        }
                                    } else {
                                        top = photoViewer.M7.getTop();
                                    }
                                    int i25 = photoViewer.Y1;
                                    if (i25 != 4 && i25 != 5) {
                                        f11 = 15.0f;
                                    }
                                    iDp = AndroidUtilities.dp(12.0f) + (top - AndroidUtilities.dp(f11));
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    ArrayList arrayList = photoViewer.f35621e1;
                                    if (arrayList == null || !arrayList.contains(childAt)) {
                                        ArrayList arrayList2 = photoViewer.f35611d1;
                                        if (arrayList2 != null && arrayList2.contains(childAt)) {
                                            FrameLayout frameLayout2 = photoViewer.M7;
                                            int top2 = (frameLayout2 == null || frameLayout2.getVisibility() != 0) ? photoViewer.L0.getTop() : photoViewer.M7.getTop();
                                            int i26 = photoViewer.Y1;
                                            if (i26 != 4 && i26 != 5) {
                                                f11 = 15.0f;
                                            }
                                            iDp = (AndroidUtilities.dp(12.0f) + (top2 - AndroidUtilities.dp(f11))) - AndroidUtilities.dp(36.0f);
                                            measuredHeight2 = childAt.getMeasuredHeight();
                                        } else if (childAt == photoViewer.M7) {
                                            measuredHeight -= photoViewer.L0.getHeight();
                                            if (photoViewer.Y1 == 1) {
                                                iDp2 = AndroidUtilities.dp(52.0f);
                                            } else if (photoViewer.Q1.getVisibility() == 0) {
                                                iDp2 = AndroidUtilities.dp(56.0f);
                                            }
                                            measuredHeight -= iDp2;
                                        } else if (childAt == photoViewer.T1) {
                                            iDp = ((paddingBottom - i11) - measuredHeight3) - layoutParams.bottomMargin;
                                            measuredHeight2 = photoViewer.L0.getHeight();
                                        } else if (childAt == photoViewer.U1 || childAt == photoViewer.M0) {
                                            measuredHeight = photoViewer.B.getMeasuredHeight();
                                        } else if (childAt == photoViewer.N0) {
                                            iDp = ((paddingBottom - i11) - measuredHeight3) - layoutParams.bottomMargin;
                                            measuredHeight2 = photoViewer.L0.getHeight();
                                        } else if (childAt == photoViewer.O7) {
                                            measuredHeight = org.telegram.messenger.rl.u(31.0f, photoViewer.L0.getHeight(), measuredHeight);
                                        }
                                    } else {
                                        FrameLayout frameLayout3 = photoViewer.M7;
                                        int top3 = (frameLayout3 == null || frameLayout3.getVisibility() != 0) ? photoViewer.L0.getTop() - AndroidUtilities.dp(50.0f) : photoViewer.M7.getTop();
                                        int i27 = photoViewer.Y1;
                                        if (i27 != 4 && i27 != 5) {
                                            f11 = 15.0f;
                                        }
                                        iDp = (AndroidUtilities.dp(12.0f) + (top3 - AndroidUtilities.dp(f11))) - AndroidUtilities.dp(36.0f);
                                        measuredHeight2 = childAt.getMeasuredHeight();
                                    }
                                }
                                measuredHeight = iDp - measuredHeight2;
                            }
                        }
                        childAt.layout(i16 + paddingLeft, measuredHeight, i16 + measuredWidth + paddingLeft, measuredHeight3 + measuredHeight);
                    } else {
                        i17 = (((paddingBottom - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    measuredHeight = i17 - i18;
                    zr0Var = photoViewer.Q1;
                    if (childAt != zr0Var.I) {
                        if (childAt == photoViewer.R1.I) {
                            measuredHeight += photoViewer.B.getMeasuredHeight();
                        } else if (zr0Var.f16338f.l(childAt)) {
                            int i28 = (i13 - i11) - measuredHeight3;
                            if (photoViewer.f35745s) {
                                i19 = 0;
                            } else {
                                i19 = 0;
                            }
                            measuredHeight = i28 + i19;
                        } else {
                            int i29 = (i13 - i11) - measuredHeight3;
                            if (photoViewer.f35745s) {
                                i19 = 0;
                            } else {
                                i19 = 0;
                            }
                            measuredHeight = i29 + i19;
                        }
                    }
                    childAt.layout(i16 + paddingLeft, measuredHeight, i16 + measuredWidth + paddingLeft, measuredHeight3 + measuredHeight);
                } else {
                    i14 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i23 != 16) {
                    if (i23 != 80) {
                        measuredHeight = layoutParams.topMargin;
                    } else {
                        i17 = (paddingBottom - i11) - measuredHeight3;
                        i18 = layoutParams.bottomMargin;
                    }
                    zr0Var = photoViewer.Q1;
                    if (childAt != zr0Var.I) {
                        if (childAt == photoViewer.R1.I) {
                            measuredHeight += photoViewer.B.getMeasuredHeight();
                        } else if (zr0Var.f16338f.l(childAt)) {
                            int i210 = (i13 - i11) - measuredHeight3;
                            if (photoViewer.f35745s) {
                                i19 = 0;
                            } else {
                                i19 = 0;
                            }
                            measuredHeight = i210 + i19;
                        } else {
                            int i211 = (i13 - i11) - measuredHeight3;
                            if (photoViewer.f35745s) {
                                i19 = 0;
                            } else {
                                i19 = 0;
                            }
                            measuredHeight = i211 + i19;
                        }
                    }
                    childAt.layout(i16 + paddingLeft, measuredHeight, i16 + measuredWidth + paddingLeft, measuredHeight3 + measuredHeight);
                } else {
                    i17 = (((paddingBottom - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                    i18 = layoutParams.bottomMargin;
                }
                measuredHeight = i17 - i18;
                zr0Var = photoViewer.Q1;
                if (childAt != zr0Var.I) {
                    if (childAt == photoViewer.R1.I) {
                        measuredHeight += photoViewer.B.getMeasuredHeight();
                    } else if (zr0Var.f16338f.l(childAt)) {
                        int i212 = (i13 - i11) - measuredHeight3;
                        if (photoViewer.f35745s) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                        }
                        measuredHeight = i212 + i19;
                    } else {
                        int i213 = (i13 - i11) - measuredHeight3;
                        if (photoViewer.f35745s) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                        }
                        measuredHeight = i213 + i19;
                    }
                }
                childAt.layout(i16 + paddingLeft, measuredHeight, i16 + measuredWidth + paddingLeft, measuredHeight3 + measuredHeight);
            }
        }
        S();
        Z();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int bitmapWidth;
        int bitmapHeight;
        ut0 ut0Var = this;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (ut0Var.getLayoutParams().height > 0) {
            size2 = ut0Var.getLayoutParams().height;
        }
        int i15 = size2;
        ut0Var.setMeasuredDimension(size, i15);
        PhotoViewer photoViewer = ut0Var.A0;
        boolean z10 = true;
        if (!photoViewer.f35702n1) {
            ut0Var.f43286x0 = true;
            if (photoViewer.f35622e2) {
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x > point.y ? 5 : 10;
                photoViewer.M1.getCurrentView().setMaxLines(i16);
                photoViewer.M1.getNextView().setMaxLines(i16);
            } else {
                photoViewer.M1.getCurrentView().setMaxLines(Integer.MAX_VALUE);
                photoViewer.M1.getNextView().setMaxLines(Integer.MAX_VALUE);
            }
            ut0Var.f43286x0 = false;
        }
        int iDp = photoViewer.f35620e0.getVisibility() != 8 ? AndroidUtilities.dp(48.0f) : 0;
        org.telegram.ui.Components.k30 k30Var = photoViewer.f35649h1;
        if (k30Var == null || k30Var.getVisibility() == 8) {
            i12 = i10;
            i13 = 0;
        } else {
            ((ViewGroup.MarginLayoutParams) photoViewer.f35649h1.getLayoutParams()).bottomMargin = iDp;
            i12 = i10;
            ut0Var.measureChildWithMargins(photoViewer.f35649h1, i12, 0, i11, 0);
            int measuredHeight = photoViewer.f35649h1.getMeasuredHeight();
            ut0Var.f43286x0 = true;
            if (AndroidUtilities.isTablet() || i15 >= size) {
                if (photoViewer.f35649h1.getVisibility() != 0) {
                    photoViewer.f35649h1.setVisibility(0);
                }
            } else if (photoViewer.f35649h1.getVisibility() != 4) {
                photoViewer.f35649h1.setVisibility(4);
            }
            ut0Var.f43286x0 = false;
            i13 = measuredHeight;
        }
        ju0 ju0Var = photoViewer.f35623e3;
        if (ju0Var != null) {
            ju0Var.f39505e = size;
            ju0Var.f39506f = i15;
        }
        int paddingLeft = size - (ut0Var.getPaddingLeft() + ut0Var.getPaddingRight());
        int paddingBottom = i15 - ut0Var.getPaddingBottom();
        int childCount = ut0Var.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = ut0Var.getChildAt(i17);
            if (childAt.getVisibility() != 8 && childAt != photoViewer.f35649h1) {
                qs0 qs0Var = photoViewer.f35766u2;
                if (childAt == qs0Var) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight, 1073741824));
                } else if (childAt == photoViewer.f35768u4) {
                    if (qs0Var == null || qs0Var.getVisibility() != 0) {
                        bitmapWidth = photoViewer.f35805y4.getBitmapWidth();
                        bitmapHeight = photoViewer.f35805y4.getBitmapHeight();
                    } else {
                        View view = photoViewer.f35812z2 ? photoViewer.f35803y2 : photoViewer.f35794x2;
                        bitmapWidth = view.getMeasuredWidth();
                        bitmapHeight = view.getMeasuredHeight();
                    }
                    if (bitmapWidth == 0 || bitmapHeight == 0) {
                        bitmapWidth = paddingLeft;
                        bitmapHeight = paddingBottom;
                    }
                    photoViewer.f35768u4.measure(View.MeasureSpec.makeMeasureSpec(bitmapWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(bitmapHeight, 1073741824));
                } else if (photoViewer.Q1.f16338f.l(childAt) || photoViewer.R1.f16338f.l(childAt)) {
                    if (photoViewer.f35745s) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
                    } else if (!AndroidUtilities.isInMultiwindow) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height + AndroidUtilities.navigationBarHeight, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), paddingBottom - AndroidUtilities.statusBarHeight), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom - AndroidUtilities.statusBarHeight, 1073741824));
                    }
                } else if (childAt == photoViewer.P1) {
                    if (photoViewer.f35659i2) {
                        i14 = ut0Var.f43287y0 ? iDp + i13 : iDp;
                    } else if (!photoViewer.f35649h1.c() || (!AndroidUtilities.isTablet() && paddingBottom <= paddingLeft)) {
                        ut0Var.f43287y0 = false;
                    } else {
                        i14 = iDp + i13;
                        ut0Var.f43287y0 = z10;
                    }
                    int currentActionBarHeight = (paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) - i14;
                    ((ViewGroup.MarginLayoutParams) photoViewer.P1.getLayoutParams()).bottomMargin = i14;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
                } else if (childAt == photoViewer.U1 || childAt == photoViewer.M0) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), 1073741824));
                } else if (childAt == photoViewer.R1.I) {
                    childAt.measure(i12, View.MeasureSpec.makeMeasureSpec(paddingBottom - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight), 1073741824));
                } else {
                    ut0Var.measureChildWithMargins(childAt, i12, 0, i11, 0);
                }
            }
            i17++;
            z10 = true;
            ut0Var = this;
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f43286x0) {
            return;
        }
        super.requestLayout();
    }
}
