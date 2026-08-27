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

public final class r21 extends FrameLayout {

    public final org.telegram.ui.Components.y5 f41786a;

    public float f41787b;

    public final Path f41788c;
    public Boolean d;

    public final x21 f41789e;

    public r21(x21 x21Var, Context context) {
        super(context);
        this.f41789e = x21Var;
        this.f41786a = new org.telegram.ui.Components.y5(this, 250L, org.telegram.ui.Components.er.h);
        this.f41788c = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.b51 b51Var;
        View[] viewArr;
        org.telegram.ui.Components.n41 n41VarG;
        x21 x21Var = this.f41789e;
        View[] viewPages = x21Var.f44262b.getViewPages();
        float f10 = 0.0f;
        this.f41787b = 0.0f;
        int length = viewPages.length;
        int i10 = 0;
        while (i10 < length) {
            View view = viewPages[i10];
            if (view == null) {
                viewArr = viewPages;
            } else {
                w21 w21Var = (w21) view;
                FrameLayout frameLayout = w21Var.f43584e;
                org.telegram.ui.Components.k51 k51Var = w21Var.f43585f;
                float fClamp = Utilities.clamp(1.0f - Math.abs(w21Var.getTranslationX() / w21Var.getMeasuredWidth()), 1.0f, f10);
                float f11 = this.f41787b;
                float paddingTop = frameLayout.getPaddingTop();
                int i11 = 0;
                while (true) {
                    int childCount = k51Var.getChildCount();
                    b51Var = k51Var.U2;
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = k51Var.getChildAt(i11);
                    k51Var.T2.getClass();
                    int iH = f2.x0.H(childAt);
                    View[] viewArr2 = viewPages;
                    if (iH >= 0 && iH < b51Var.f26945x.size() && (n41VarG = b51Var.G(iH)) != null && n41VarG.f49413a == 28) {
                        paddingTop = childAt.getY() + frameLayout.getPaddingTop();
                    }
                    i11++;
                    viewPages = viewArr2;
                }
                viewArr = viewPages;
                this.f41787b = (paddingTop * fClamp) + f11;
                if (w21Var.getVisibility() == 0) {
                    ag.w wVar = w21Var.h;
                    float y10 = -wVar.getHeight();
                    for (int i12 = 0; i12 < k51Var.getChildCount(); i12++) {
                        View childAt2 = k51Var.getChildAt(i12);
                        k51Var.T2.getClass();
                        if (b51Var.G(f2.x0.H(childAt2)).f49413a == 28) {
                            y10 = childAt2.getY() + frameLayout.getPaddingTop();
                            break;
                        }
                    }
                    wVar.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, y10));
                }
            }
            i10++;
            viewPages = viewArr;
            f10 = 0.0f;
        }
        float fD = this.f41786a.d(this.f41787b <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
        float f12 = AndroidUtilities.statusBarHeight;
        float f13 = f12 * fD;
        this.f41787b = Math.max(f12, this.f41787b) - (AndroidUtilities.statusBarHeight * fD);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((org.telegram.ui.ActionBar.e3) x21Var).backgroundPaddingLeft, this.f41787b, getWidth() - ((org.telegram.ui.ActionBar.e3) x21Var).backgroundPaddingLeft, AndroidUtilities.dp(8.0f) + getHeight());
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, fD);
        canvas.drawRoundRect(rectF, fLerp, fLerp, x21Var.f44263c);
        canvas.save();
        Path path = this.f41788c;
        path.rewind();
        path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        boolean z10 = f13 > ((float) AndroidUtilities.statusBarHeight) / 2.0f;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            boolean z11 = AndroidUtilities.computePerceivedBrightness(x21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5)) > 0.721f;
            boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v(x21Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23322s8), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            AndroidUtilities.setLightStatusBar(x21Var.getWindow(), z11);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.f41787b) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.f41789e.dismiss();
        return true;
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
