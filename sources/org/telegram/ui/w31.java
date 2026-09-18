package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w31 extends FrameLayout {
    public final org.telegram.ui.Components.e6 f38691a;
    public float f38692b;
    public final Path f38693c;
    public Boolean d;
    public final b41 e;

    public w31(b41 b41Var, Context context) {
        super(context);
        this.e = b41Var;
        this.f38691a = new org.telegram.ui.Components.e6(this, 250L, org.telegram.ui.Components.qr.h);
        this.f38693c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.l61 l61Var;
        View[] viewArr;
        org.telegram.ui.Components.x51 G;
        b41 b41Var = this.e;
        View[] viewPages = b41Var.f32233b.getViewPages();
        float f10 = 0.0f;
        this.f38692b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                a41 a41Var = (a41) view;
                FrameLayout frameLayout = a41Var.e;
                org.telegram.ui.Components.t61 t61Var = a41Var.f31948f;
                float clamp = Utilities.clamp(1.0f - Math.abs(a41Var.getTranslationX() / a41Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.f38692b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = t61Var.getChildCount();
                    l61Var = t61Var.Y2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = t61Var.getChildAt(i13);
                    t61Var.X2.getClass();
                    int H = s4.o0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < l61Var.f26045x.size() && (G = l61Var.G(H)) != null && G.f15672a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f38692b = (paddingTop * clamp) + f11;
                if (a41Var.getVisibility() == 0) {
                    t5 t5Var = a41Var.h;
                    float f12 = -t5Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= t61Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = t61Var.getChildAt(i14);
                        t61Var.X2.getClass();
                        if (l61Var.G(s4.o0.H(childAt2)).f15672a == 28) {
                            f12 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    t5Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f12));
                }
            }
            i12++;
            viewPages = viewArr;
            f10 = 0.0f;
        }
        if (this.f38692b <= AndroidUtilities.statusBarHeight) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f38691a.d(f7, false);
        float f13 = AndroidUtilities.statusBarHeight;
        float f14 = f13 * d;
        this.f38692b = Math.max(f13, this.f38692b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) b41Var).backgroundPaddingLeft;
        float f15 = this.f38692b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) b41Var).backgroundPaddingLeft;
        rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, b41Var.f32234c);
        canvas.save();
        Path path = this.f38693c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (f14 > AndroidUtilities.statusBarHeight / 2.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        if (AndroidUtilities.computePerceivedBrightness(b41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19133h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(b41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19340s8), 855638016)) > 0.721f) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(b41Var.getWindow(), z11);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f38692b) {
            this.e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }
}
