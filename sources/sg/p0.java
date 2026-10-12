package sg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.jg0;
import zh.e2;
import zh.p7;
import zh.r3;
public final class p0 extends FrameLayout {
    public final int f45297a;
    public final Object f45298b;

    public p0(Object obj, Context context, int i10) {
        super(context);
        this.f45297a = i10;
        this.f45298b = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f45297a) {
            case 5:
                if (((p7) this.f45298b).f50997f0) {
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
        switch (this.f45297a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                q0 q0Var = (q0) this.f45298b;
                if (q0Var.h && (o0Var2 = q0Var.e) != null) {
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
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        float top;
        int measuredHeight;
        fi.f fVar;
        switch (this.f45297a) {
            case 1:
                y0 y0Var = (y0) this.f45298b;
                z10 = ((e3) y0Var).isPortrait;
                if (z10) {
                    y0Var.f45440s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.f45440s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 2:
                super.onMeasure(i10, i11);
                m1 m1Var = ((l1) this.f45298b).f45249c;
                jg0 jg0Var = m1Var.f45268r0;
                if (jg0Var != null) {
                    top = jg0Var.getTop();
                    measuredHeight = m1Var.f45268r0.getMeasuredHeight();
                } else {
                    View view = m1Var.B0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        m1Var.f45267q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.f45267q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            case 3:
                super.onMeasure(i10, i11);
                ((yh.h1) this.f45298b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f45297a) {
            case 4:
                super.setTranslationY(f7);
                r3 r3Var = (r3) this.f45298b;
                e2 e2Var = r3Var.f51076e0;
                if (e2Var != null && e2Var.getVisibility() == 0) {
                    r3Var.f51076e0.invalidate();
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }
}
