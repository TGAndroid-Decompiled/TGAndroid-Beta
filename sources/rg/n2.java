package rg;

import ai.yd;
import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.dw0;
public final class n2 extends FrameLayout {
    public final int f45567a;
    public final Object f45568b;

    public n2(Object obj, Context context, int i10) {
        super(context);
        this.f45567a = i10;
        this.f45568b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f45567a) {
            case 1:
                t2 t2Var = (t2) this.f45568b;
                if (t2Var.f45679y > 0.0f && t2Var.f45676s != null) {
                    t2Var.v.reset();
                    float width = getWidth() / t2Var.f45674n.getWidth();
                    t2Var.v.postScale(width, width);
                    t2Var.f45675r.setLocalMatrix(t2Var.v);
                    t2Var.f45676s.setAlpha((int) (t2Var.f45679y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t2Var.f45676s);
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
        switch (this.f45567a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((t2) this.f45568b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f45567a) {
            case 0:
                o2 o2Var = (o2) this.f45568b;
                ImageReceiver imageReceiver = o2Var.f45614x0;
                dw0 dw0Var = o2Var.f45612v0;
                if (o2Var.f45613w0 != null) {
                    canvas.save();
                    float e = o2Var.f45611u0.e(o2Var.f45610t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, dw0Var.f25720a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e, 4.0f * e, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) dw0Var.f25720a, (int) dw0Var.f25721b);
                    imageReceiver.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        sg.o0 o0Var;
        sg.o0 o0Var2;
        switch (this.f45567a) {
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                sg.p0 p0Var = (sg.p0) this.f45568b;
                if (p0Var.h && (o0Var2 = p0Var.e) != null) {
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
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f7;
        float top;
        int measuredHeight;
        gi.f fVar;
        switch (this.f45567a) {
            case 3:
                sg.x0 x0Var = (sg.x0) this.f45568b;
                z10 = ((f3) x0Var).isPortrait;
                if (z10) {
                    x0Var.f46510s = View.MeasureSpec.getSize(i10);
                } else {
                    x0Var.f46510s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 4:
                super.onMeasure(i10, i11);
                sg.l1 l1Var = ((sg.k1) this.f45568b).f46312c;
                yd ydVar = l1Var.f46339r0;
                if (ydVar != null) {
                    top = ydVar.getTop();
                    measuredHeight = l1Var.f46339r0.getMeasuredHeight();
                } else {
                    View view = l1Var.B0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = l1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        l1Var.f46338q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                l1Var.f46338q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            case 5:
                super.onMeasure(i10, i11);
                ((yh.h1) this.f45568b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public n2(o2 o2Var, Context context) {
        super(context);
        this.f45567a = 0;
        this.f45568b = o2Var;
        setWillNotDraw(false);
    }
}
