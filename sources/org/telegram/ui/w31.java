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
    public final org.telegram.ui.Components.g6 f43194a;
    public float f43195b;
    public final Path f43196c;
    public Boolean d;
    public final b41 f43197e;

    public w31(b41 b41Var, Context context) {
        super(context);
        this.f43197e = b41Var;
        this.f43194a = new org.telegram.ui.Components.g6(this, 250L, org.telegram.ui.Components.is.h);
        this.f43196c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.e71 e71Var;
        View[] viewArr;
        org.telegram.ui.Components.r61 G;
        b41 b41Var = this.f43197e;
        View[] viewPages = b41Var.f36258b.getViewPages();
        float f10 = 0.0f;
        this.f43195b = 0.0f;
        int length = viewPages.length;
        int i12 = 0;
        while (i12 < length) {
            View view = viewPages[i12];
            if (view == null) {
                viewArr = viewPages;
            } else {
                a41 a41Var = (a41) view;
                FrameLayout frameLayout = a41Var.f35879e;
                org.telegram.ui.Components.m71 m71Var = a41Var.f35880f;
                float clamp = Utilities.clamp(1.0f - Math.abs(a41Var.getTranslationX() / a41Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.f43195b;
                float paddingTop = frameLayout.getPaddingTop();
                int i13 = 0;
                while (true) {
                    int childCount = m71Var.getChildCount();
                    e71Var = m71Var.W2;
                    if (i13 >= childCount) {
                        break;
                    }
                    View childAt = m71Var.getChildAt(i13);
                    m71Var.V2.getClass();
                    int H = s4.p0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (H >= 0 && H < e71Var.f25893x.size() && (G = e71Var.G(H)) != null && G.f17175a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i13++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f43195b = (paddingTop * clamp) + f11;
                if (a41Var.getVisibility() == 0) {
                    s5 s5Var = a41Var.h;
                    float f12 = -s5Var.getHeight();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= m71Var.getChildCount()) {
                            break;
                        }
                        View childAt2 = m71Var.getChildAt(i14);
                        m71Var.V2.getClass();
                        if (e71Var.G(s4.p0.H(childAt2)).f17175a == 28) {
                            f12 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                        i14++;
                    }
                    s5Var.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, f12));
                }
            }
            i12++;
            viewPages = viewArr;
            f10 = 0.0f;
        }
        if (this.f43195b <= AndroidUtilities.statusBarHeight) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f43194a.d(f7, false);
        float f13 = AndroidUtilities.statusBarHeight;
        float f14 = f13 * d;
        this.f43195b = Math.max(f13, this.f43195b) - (AndroidUtilities.statusBarHeight * d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.e3) b41Var).backgroundPaddingLeft;
        float f15 = this.f43195b;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.e3) b41Var).backgroundPaddingLeft;
        rectF.set(i10, f15, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, d);
        canvas.drawRoundRect(rectF, lerp, lerp, b41Var.f36259c);
        canvas.save();
        Path path = this.f43196c;
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
        if (AndroidUtilities.computePerceivedBrightness(b41Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20857h5)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(b41Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21065s8), 855638016)) > 0.721f) {
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
        if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f43195b) {
            this.f43197e.dismiss();
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
