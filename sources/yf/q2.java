package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.f3;
public final class q2 extends FrameLayout {
    public final int f50073a;
    public final Object f50074b;

    public q2(Object obj, Context context, int i9) {
        super(context);
        this.f50073a = i9;
        this.f50074b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f50073a) {
            case 0:
                t2 t2Var = (t2) this.f50074b;
                if (t2Var.f50120y > 0.0f && t2Var.f50117s != null) {
                    t2Var.v.reset();
                    float width = getWidth() / t2Var.f50115n.getWidth();
                    t2Var.v.postScale(width, width);
                    t2Var.f50116r.setLocalMatrix(t2Var.v);
                    t2Var.f50117s.setAlpha((int) (t2Var.f50120y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t2Var.f50117s);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f50073a) {
            case 0:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((t2) this.f50074b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        zf.o0 o0Var;
        zf.o0 o0Var2;
        switch (this.f50073a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                zf.p0 p0Var = (zf.p0) this.f50074b;
                if (p0Var.h && (o0Var2 = p0Var.f50648e) != null) {
                    charSequence = o0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (o0Var = p0Var.d) != null) {
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
    public void onMeasure(int i9, int i10) {
        boolean z10;
        float f10;
        float top;
        int measuredHeight;
        mh.f fVar;
        switch (this.f50073a) {
            case 2:
                zf.x0 x0Var = (zf.x0) this.f50074b;
                z10 = ((f3) x0Var).isPortrait;
                if (z10) {
                    x0Var.f50778s = View.MeasureSpec.getSize(i9);
                } else {
                    x0Var.f50778s = (int) (Math.min(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10)) * 0.8f);
                }
                super.onMeasure(i9, i10);
                return;
            case 3:
                super.onMeasure(i9, i10);
                zf.k1 k1Var = ((zf.j1) this.f50074b).f50557c;
                dg.q qVar = k1Var.f50579n0;
                if (qVar != null) {
                    top = qVar.getTop();
                    measuredHeight = k1Var.f50579n0.getMeasuredHeight();
                } else {
                    View view = k1Var.f50589x0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = k1Var.f50589x0.getMeasuredHeight();
                    } else {
                        f10 = 0.0f;
                        k1Var.m0.setTranslationY(f10 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f10 = (measuredHeight / 2.0f) + top;
                k1Var.m0.setTranslationY(f10 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }
}
