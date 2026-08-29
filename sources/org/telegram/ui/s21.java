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
public final class s21 extends FrameLayout {
    public final org.telegram.ui.Components.d6 f42257a;
    public float f42258b;
    public final Path f42259c;
    public Boolean d;
    public final y21 f42260e;

    public s21(y21 y21Var, Context context) {
        super(context);
        this.f42260e = y21Var;
        this.f42257a = new org.telegram.ui.Components.d6(this, 250L, org.telegram.ui.Components.jr.h);
        this.f42259c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.k51 k51Var;
        View[] viewArr;
        org.telegram.ui.Components.w41 G;
        y21 y21Var = this.f42260e;
        View[] viewPages = y21Var.f44710b.getViewPages();
        float f10 = 0.0f;
        this.f42258b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                x21 x21Var = (x21) view;
                FrameLayout frameLayout = x21Var.f44445e;
                org.telegram.ui.Components.u51 u51Var = x21Var.f44446f;
                float clamp = Utilities.clamp(1.0f - Math.abs(x21Var.getTranslationX() / x21Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.f42258b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = u51Var.getChildCount();
                    k51Var = u51Var.U2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = u51Var.getChildAt(i13);
                    u51Var.T2.getClass();
                    int H = f2.w0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < k51Var.f29942x.size() && (G = k51Var.G(H)) != null && G.f50845a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f42258b = (paddingTop * clamp) + f11;
                if (x21Var.getVisibility() == 0) {
                    bg.u1 u1Var = x21Var.h;
                    float f12 = -u1Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= u51Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = u51Var.getChildAt(i14);
                        u51Var.T2.getClass();
                        if (k51Var.G(f2.w0.H(childAt2)).f50845a == 28) {
                            f12 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    u1Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f12));
                }
            }
            i12++;
            viewPages = viewArr;
            f10 = 0.0f;
        }
        if (this.f42258b <= AndroidUtilities.statusBarHeight) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float d = this.f42257a.d(f9, false);
        float f13 = AndroidUtilities.statusBarHeight;
        float f14 = f13 * d;
        this.f42258b = Math.max(f13, this.f42258b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.f3) y21Var).backgroundPaddingLeft;
        float f15 = this.f42258b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.f3) y21Var).backgroundPaddingLeft;
        rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, y21Var.f44711c);
        canvas.save();
        Path path = this.f42259c;
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
        if (AndroidUtilities.computePerceivedBrightness(y21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(y21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23329s8), 855638016)) > 0.721f) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(y21Var.getWindow(), z11);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f42258b) {
            this.f42260e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }
}
