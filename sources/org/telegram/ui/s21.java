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
    public final org.telegram.ui.Components.y5 f42540a;
    public float f42541b;
    public final Path f42542c;
    public Boolean d;
    public final y21 f42543e;

    public s21(y21 y21Var, Context context) {
        super(context);
        this.f42543e = y21Var;
        this.f42540a = new org.telegram.ui.Components.y5(this, 250L, org.telegram.ui.Components.gr.h);
        this.f42542c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i9;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.z41 z41Var;
        View[] viewArr;
        org.telegram.ui.Components.l41 G;
        y21 y21Var = this.f42543e;
        View[] viewPages = y21Var.f44691b.getViewPages();
        float f11 = 0.0f;
        this.f42541b = 0.0f;
        int length = viewPages.length;
        int i11 = 0;
        while (i11 < length) {
            View view = viewPages[i11];
            if (view == null) {
                viewArr = viewPages;
            } else {
                x21 x21Var = (x21) view;
                FrameLayout frameLayout = x21Var.f44339e;
                org.telegram.ui.Components.i51 i51Var = x21Var.f44340f;
                float clamp = Utilities.clamp(1.0f - Math.abs(x21Var.getTranslationX() / x21Var.getMeasuredWidth()), 1.0f, f11);
                float f12 = this.f42541b;
                float paddingTop = frameLayout.getPaddingTop();
                int i12 = 0;
                while (true) {
                    int childCount = i51Var.getChildCount();
                    z41Var = i51Var.U2;
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = i51Var.getChildAt(i12);
                    i51Var.T2.getClass();
                    int H = f2.z0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < z41Var.f35191x.size() && (G = z41Var.G(H)) != null && G.f48814a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i12++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f42541b = (paddingTop * clamp) + f12;
                if (x21Var.getVisibility() == 0) {
                    bh.g gVar = x21Var.h;
                    float f13 = -gVar.getHeight();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i51Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = i51Var.getChildAt(i13);
                        i51Var.T2.getClass();
                        if (z41Var.G(f2.z0.H(childAt2)).f48814a == 28) {
                            f13 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i13++;
                    }
                    gVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f13));
                }
            }
            i11++;
            viewPages = viewArr;
            f11 = 0.0f;
        }
        if (this.f42541b <= AndroidUtilities.statusBarHeight) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.f42540a.d(f10, false);
        float f14 = AndroidUtilities.statusBarHeight;
        float f15 = f14 * d;
        this.f42541b = Math.max(f14, this.f42541b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i9 = ((org.telegram.ui.ActionBar.f3) y21Var).backgroundPaddingLeft;
        float f16 = this.f42541b;
        int width = getWidth();
        i10 = ((org.telegram.ui.ActionBar.f3) y21Var).backgroundPaddingLeft;
        rectF.set(i9, f16, width - i10, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, y21Var.f44692c);
        canvas.save();
        Path path = this.f42542c;
        path.rewind();
        path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (f15 > AndroidUtilities.statusBarHeight / 2.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        if (AndroidUtilities.computePerceivedBrightness(y21Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(y21Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23269s8), 855638016)) > 0.721f) {
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
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f42541b) {
            this.f42543e.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }
}
