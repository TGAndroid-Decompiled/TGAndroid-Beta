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
public final class y31 extends FrameLayout {
    public final org.telegram.ui.Components.c6 f39782a;
    public float f39783b;
    public final Path f39784c;
    public Boolean d;
    public final d41 e;

    public y31(d41 d41Var, Context context) {
        super(context);
        this.e = d41Var;
        this.f39782a = new org.telegram.ui.Components.c6(this, 250L, org.telegram.ui.Components.qr.h);
        this.f39784c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.x51 x51Var;
        View[] viewArr;
        org.telegram.ui.Components.j51 G;
        d41 d41Var = this.e;
        View[] viewPages = d41Var.f32995b.getViewPages();
        float f10 = 0.0f;
        this.f39783b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                c41 c41Var = (c41) view;
                FrameLayout frameLayout = c41Var.e;
                org.telegram.ui.Components.f61 f61Var = c41Var.f32663f;
                float clamp = Utilities.clamp(1.0f - Math.abs(c41Var.getTranslationX() / c41Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.f39783b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = f61Var.getChildCount();
                    x51Var = f61Var.Y2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = f61Var.getChildAt(i13);
                    f61Var.X2.getClass();
                    int H = s4.o0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < x51Var.f29854x.size() && (G = x51Var.G(H)) != null && G.f15543a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f39783b = (paddingTop * clamp) + f11;
                if (c41Var.getVisibility() == 0) {
                    t5 t5Var = c41Var.h;
                    float f12 = -t5Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= f61Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = f61Var.getChildAt(i14);
                        f61Var.X2.getClass();
                        if (x51Var.G(s4.o0.H(childAt2)).f15543a == 28) {
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
        if (this.f39783b <= AndroidUtilities.statusBarHeight) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f39782a.d(f7, false);
        float f13 = AndroidUtilities.statusBarHeight;
        float f14 = f13 * d;
        this.f39783b = Math.max(f13, this.f39783b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.g3) d41Var).backgroundPaddingLeft;
        float f15 = this.f39783b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.g3) d41Var).backgroundPaddingLeft;
        rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, d41Var.f32996c);
        canvas.save();
        Path path = this.f39784c;
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
        if (AndroidUtilities.computePerceivedBrightness(d41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18933h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(d41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19139s8), 855638016)) > 0.721f) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.d = Boolean.valueOf(z10);
        if (!z10) {
            z11 = z12;
        }
        AndroidUtilities.setLightStatusBar(d41Var.getWindow(), z11);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f39783b) {
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
