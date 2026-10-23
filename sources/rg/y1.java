package rg;

import ai.ae;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.iw0;
public final class y1 extends FrameLayout {
    public final int f46146a;
    public final Object f46147b;

    public y1(Object obj, Context context, int i10) {
        super(context);
        this.f46146a = i10;
        this.f46147b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f46146a) {
            case 2:
                u2 u2Var = (u2) this.f46147b;
                if (u2Var.f46093y > 0.0f && u2Var.f46090s != null) {
                    u2Var.v.reset();
                    float width = getWidth() / u2Var.f46088n.getWidth();
                    u2Var.v.postScale(width, width);
                    u2Var.f46089r.setLocalMatrix(u2Var.v);
                    u2Var.f46090s.setAlpha((int) (u2Var.f46093y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), u2Var.f46090s);
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
        switch (this.f46146a) {
            case 2:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((u2) this.f46147b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        y1 y1Var;
        MediaController.CropState cropState;
        switch (this.f46146a) {
            case 0:
                z1 z1Var = (z1) this.f46147b;
                Rect rect = z1Var.E0;
                Rect rect2 = z1Var.D0;
                Paint paint = z1Var.F0;
                iw0 iw0Var = z1Var.f46154v0;
                Bitmap bitmap = z1Var.A0;
                if (z1Var.f46158z0 != null) {
                    canvas.save();
                    float e = z1Var.f46153u0.e(z1Var.f46152t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, iw0Var.f27465a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.v0.A(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = z1Var.f46157y0.e(z1Var.f46156x0);
                    if (!z1Var.f46156x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(y1Var.getWidth() / 2.0f, y1Var.getHeight() / 2.0f);
                            canvas.rotate(z1Var.f46155w0);
                            float max = Math.max(iw0Var.f27465a / bitmap.getWidth(), iw0Var.f27466b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (z1Var.G0 != null) {
                                canvas.rotate(-z1Var.getOrientation());
                                int contentWidth = z1Var.getContentWidth();
                                int contentHeight = z1Var.getContentHeight();
                                if (((z1Var.getOrientation() + z1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = z1Var.getContentHeight();
                                    contentHeight = z1Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = z1Var.G0;
                                float f7 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = z1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = z1Var.G0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(z1Var.G0.cropRotate + cropState.transformRotation);
                                if (z1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(z1Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                p2 p2Var = (p2) this.f46147b;
                ImageReceiver imageReceiver = p2Var.f46033x0;
                iw0 iw0Var2 = p2Var.f46031v0;
                if (p2Var.f46032w0 != null) {
                    canvas.save();
                    float e10 = p2Var.f46030u0.e(p2Var.f46029t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, iw0Var2.f27465a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.v0.A(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) iw0Var2.f27465a, (int) iw0Var2.f27466b);
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
        switch (this.f46146a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                sg.p0 p0Var = (sg.p0) this.f46147b;
                if (p0Var.f46805r && (o0Var2 = p0Var.h) != null) {
                    charSequence = o0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (o0Var = p0Var.f46803f) != null) {
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
        switch (this.f46146a) {
            case 4:
                sg.y0 y0Var = (sg.y0) this.f46147b;
                z10 = ((h3) y0Var).isPortrait;
                if (z10) {
                    y0Var.f46952s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.f46952s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 5:
                super.onMeasure(i10, i11);
                sg.m1 m1Var = ((sg.l1) this.f46147b).f46752c;
                ae aeVar = m1Var.f46771r0;
                if (aeVar != null) {
                    top = aeVar.getTop();
                    measuredHeight = m1Var.f46771r0.getMeasuredHeight();
                } else {
                    View view = m1Var.B0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        m1Var.f46770q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.f46770q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            case 6:
                super.onMeasure(i10, i11);
                ((yh.g1) this.f46147b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public y1(p2 p2Var, Context context) {
        super(context);
        this.f46146a = 1;
        this.f46147b = p2Var;
        setWillNotDraw(false);
    }

    public y1(z1 z1Var, Context context) {
        super(context);
        this.f46146a = 0;
        this.f46147b = z1Var;
        setWillNotDraw(false);
    }
}
