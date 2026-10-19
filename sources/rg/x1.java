package rg;

import ai.zd;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.ew0;
public final class x1 extends FrameLayout {
    public final int f45699a;
    public final Object f45700b;

    public x1(Object obj, Context context, int i10) {
        super(context);
        this.f45699a = i10;
        this.f45700b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f45699a) {
            case 2:
                t2 t2Var = (t2) this.f45700b;
                if (t2Var.f45653y > 0.0f && t2Var.f45650s != null) {
                    t2Var.v.reset();
                    float width = getWidth() / t2Var.f45648n.getWidth();
                    t2Var.v.postScale(width, width);
                    t2Var.f45649r.setLocalMatrix(t2Var.v);
                    t2Var.f45650s.setAlpha((int) (t2Var.f45653y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t2Var.f45650s);
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
        switch (this.f45699a) {
            case 2:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((t2) this.f45700b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        x1 x1Var;
        MediaController.CropState cropState;
        switch (this.f45699a) {
            case 0:
                y1 y1Var = (y1) this.f45700b;
                Rect rect = y1Var.E0;
                Rect rect2 = y1Var.D0;
                Paint paint = y1Var.F0;
                ew0 ew0Var = y1Var.f45710v0;
                Bitmap bitmap = y1Var.A0;
                if (y1Var.f45714z0 != null) {
                    canvas.save();
                    float e = y1Var.f45709u0.e(y1Var.f45708t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, ew0Var.f26038a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.g0.z(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = y1Var.f45713y0.e(y1Var.f45712x0);
                    if (!y1Var.f45712x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(x1Var.getWidth() / 2.0f, x1Var.getHeight() / 2.0f);
                            canvas.rotate(y1Var.f45711w0);
                            float max = Math.max(ew0Var.f26038a / bitmap.getWidth(), ew0Var.f26039b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (y1Var.G0 != null) {
                                canvas.rotate(-y1Var.getOrientation());
                                int contentWidth = y1Var.getContentWidth();
                                int contentHeight = y1Var.getContentHeight();
                                if (((y1Var.getOrientation() + y1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = y1Var.getContentHeight();
                                    contentHeight = y1Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = y1Var.G0;
                                float f7 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = y1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = y1Var.G0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(y1Var.G0.cropRotate + cropState.transformRotation);
                                if (y1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(y1Var.getOrientation());
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
                o2 o2Var = (o2) this.f45700b;
                ImageReceiver imageReceiver = o2Var.f45588x0;
                ew0 ew0Var2 = o2Var.f45586v0;
                if (o2Var.f45587w0 != null) {
                    canvas.save();
                    float e10 = o2Var.f45585u0.e(o2Var.f45584t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, ew0Var2.f26038a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.g0.z(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) ew0Var2.f26038a, (int) ew0Var2.f26039b);
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
        sg.p0 p0Var;
        sg.p0 p0Var2;
        switch (this.f45699a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                sg.q0 q0Var = (sg.q0) this.f45700b;
                if (q0Var.h && (p0Var2 = q0Var.e) != null) {
                    charSequence = p0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (p0Var = q0Var.d) != null) {
                    charSequence = p0Var.getText();
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
        switch (this.f45699a) {
            case 4:
                sg.y0 y0Var = (sg.y0) this.f45700b;
                z10 = ((f3) y0Var).isPortrait;
                if (z10) {
                    y0Var.f46509s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.f46509s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 5:
                super.onMeasure(i10, i11);
                sg.m1 m1Var = ((sg.l1) this.f45700b).f46320c;
                zd zdVar = m1Var.f46338r0;
                if (zdVar != null) {
                    top = zdVar.getTop();
                    measuredHeight = m1Var.f46338r0.getMeasuredHeight();
                } else {
                    View view = m1Var.B0;
                    if (view != null) {
                        top = view.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        m1Var.f46337q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.f46337q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            case 6:
                super.onMeasure(i10, i11);
                ((yh.g1) this.f45700b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public x1(o2 o2Var, Context context) {
        super(context);
        this.f45699a = 1;
        this.f45700b = o2Var;
        setWillNotDraw(false);
    }

    public x1(y1 y1Var, Context context) {
        super(context);
        this.f45699a = 0;
        this.f45700b = y1Var;
        setWillNotDraw(false);
    }
}
