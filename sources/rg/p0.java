package rg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.fg0;
import yh.f2;
import yh.p7;
import yh.s3;
public final class p0 extends FrameLayout {
    public final int f47601a;
    public final Object f47602b;

    public p0(Object obj, Context context, int i10) {
        super(context);
        this.f47601a = i10;
        this.f47602b = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f47601a) {
            case 5:
                if (((p7) this.f47602b).f53287f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        o0 o0Var;
        o0 o0Var2;
        switch (this.f47601a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                q0 q0Var = (q0) this.f47602b;
                if (q0Var.h && (o0Var2 = q0Var.f47620e) != null) {
                    charSequence = o0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (o0Var = q0Var.d) != null) {
                    charSequence = o0Var.getText();
                }
                if (charSequence != null) {
                    accessibilityNodeInfo.setText(charSequence);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(charSequence);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f47601a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                zg.q qVar = (zg.q) this.f47602b;
                if (qVar.K && z10) {
                    qVar.f54887w.setTranslationY(-qVar.f54881c.getMeasuredHeight());
                    int measuredHeight = qVar.f54881c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f54889y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    qVar.f54889y.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        float top;
        int measuredHeight;
        ei.f fVar;
        switch (this.f47601a) {
            case 1:
                y0 y0Var = (y0) this.f47602b;
                z10 = ((e3) y0Var).isPortrait;
                if (z10) {
                    y0Var.f47749s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.f47749s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 2:
                super.onMeasure(i10, i11);
                l1 l1Var = ((k1) this.f47602b).f47531c;
                fg0 fg0Var = l1Var.f47559r0;
                if (fg0Var != null) {
                    top = fg0Var.getTop();
                    measuredHeight = l1Var.f47559r0.getMeasuredHeight();
                } else {
                    View view = l1Var.B0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = l1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        l1Var.f47558q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                l1Var.f47558q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            case 3:
                super.onMeasure(i10, i11);
                ((xh.i1) this.f47602b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f47601a) {
            case 4:
                super.setTranslationY(f7);
                s3 s3Var = (s3) this.f47602b;
                f2 f2Var = s3Var.f53403e0;
                if (f2Var != null && f2Var.getVisibility() == 0) {
                    s3Var.f53403e0.invalidate();
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
