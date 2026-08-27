package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.y1;
import org.telegram.ui.Components.tu0;
import zf.o2;
import zf.t2;
import zf.x1;

public final class f extends FrameLayout {

    public final int f46536a;

    public final KeyEvent.Callback f46537b;

    public f(KeyEvent.Callback callback, Context context, int i10) {
        super(context);
        this.f46536a = i10;
        this.f46537b = callback;
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f46536a) {
            case 0:
                super.addView(view, i10, i11);
                ((g) this.f46537b).e();
                break;
            default:
                super.addView(view, i10, i11);
                break;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f46536a) {
            case 3:
                t2 t2Var = (t2) this.f46537b;
                if (t2Var.f50715y <= 0.0f || t2Var.f50712s == null) {
                    canvas2 = canvas;
                } else {
                    t2Var.v.reset();
                    float width = getWidth() / t2Var.f50710n.getWidth();
                    t2Var.v.postScale(width, width);
                    t2Var.f50711r.setLocalMatrix(t2Var.v);
                    t2Var.f50712s.setAlpha((int) (t2Var.f50715y * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t2Var.f50712s);
                }
                super.dispatchDraw(canvas2);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f46536a) {
            case 3:
                if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                ((t2) this.f46537b).onBackPressed();
                return true;
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f46536a) {
            case 1:
                x1 x1Var = (x1) this.f46537b;
                Rect rect = x1Var.A0;
                Rect rect2 = x1Var.f50775z0;
                Paint paint = x1Var.B0;
                tu0 tu0Var = x1Var.f50767r0;
                Bitmap bitmap = x1Var.f50772w0;
                f fVar = x1Var.f50771v0;
                if (fVar != null) {
                    canvas.save();
                    float fE = x1Var.f50766q0.e(x1Var.f50765p0);
                    canvas.scale(1.0f - (fE * 2.0f), 1.0f, tu0Var.f32893a / 2.0f, 0.0f);
                    canvas.skew(0.0f, y1.z(1.0f, fE, 4.0f * fE, 0.25f));
                    float fE2 = x1Var.f50770u0.e(x1Var.f50769t0);
                    if (!x1Var.f50769t0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - fE2) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(fVar.getWidth() / 2.0f, fVar.getHeight() / 2.0f);
                            canvas.rotate(x1Var.f50768s0);
                            float fMax = Math.max(tu0Var.f32893a / bitmap.getWidth(), tu0Var.f32894b / bitmap.getHeight());
                            canvas.scale(fMax, fMax);
                            if (x1Var.C0 != null) {
                                canvas.rotate(-x1Var.getOrientation());
                                int contentWidth = x1Var.getContentWidth();
                                int contentHeight = x1Var.getContentHeight();
                                if (((x1Var.getOrientation() + x1Var.C0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = x1Var.getContentHeight();
                                    contentHeight = x1Var.getContentWidth();
                                }
                                MediaController.CropState cropState = x1Var.C0;
                                float f10 = cropState.cropPw;
                                float f11 = cropState.cropPh;
                                float f12 = contentWidth;
                                float f13 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f10) / 2.0f, ((-contentHeight) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                                float f14 = x1Var.C0.cropScale;
                                canvas.scale(f14, f14);
                                MediaController.CropState cropState2 = x1Var.C0;
                                canvas.translate(cropState2.cropPx * f12, cropState2.cropPy * f13);
                                MediaController.CropState cropState3 = x1Var.C0;
                                canvas.rotate(cropState3.cropRotate + cropState3.transformRotation);
                                if (x1Var.C0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(x1Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    break;
                }
                break;
            case 2:
                o2 o2Var = (o2) this.f46537b;
                ImageReceiver imageReceiver = o2Var.f50651t0;
                tu0 tu0Var2 = o2Var.f50649r0;
                if (o2Var.f50650s0 != null) {
                    canvas.save();
                    float fE3 = o2Var.f50648q0.e(o2Var.f50647p0);
                    canvas.scale(1.0f - (fE3 * 2.0f), 1.0f, tu0Var2.f32893a / 2.0f, 0.0f);
                    canvas.skew(0.0f, y1.z(1.0f, fE3, 4.0f * fE3, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) tu0Var2.f32893a, (int) tu0Var2.f32894b);
                    imageReceiver.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    public f(o2 o2Var, Context context) {
        super(context);
        this.f46536a = 2;
        this.f46537b = o2Var;
        setWillNotDraw(false);
    }

    public f(x1 x1Var, Context context) {
        super(context);
        this.f46536a = 1;
        this.f46537b = x1Var;
        setWillNotDraw(false);
    }
}
