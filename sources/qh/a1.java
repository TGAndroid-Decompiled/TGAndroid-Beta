package qh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ek;
public final class a1 extends FrameLayout {
    public final Paint f44880a;
    public final Paint f44881b;
    public final Paint f44882c;
    public Bitmap d;
    public BitmapShader f44883e;
    public Matrix f44884f;
    public final org.telegram.ui.Components.z5 h;
    public final RectF f44885n;
    public Boolean f44886r;
    public final y1 f44887s;

    public a1(y1 y1Var, Context context) {
        super(context);
        this.f44887s = y1Var;
        this.f44880a = new Paint(1);
        this.f44881b = new Paint(3);
        this.f44882c = new Paint(1);
        this.h = new org.telegram.ui.Components.z5(this, 0L, 250L, pr.h);
        this.f44885n = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.g6 g6Var;
        float f10;
        float f11;
        int i10;
        int i11;
        boolean z4;
        int i12 = org.telegram.ui.ActionBar.k6.f21731h5;
        y1 y1Var = this.f44887s;
        ek ekVar = y1Var.f46345f;
        g6Var = ((org.telegram.ui.ActionBar.h3) y1Var).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i12, g6Var);
        Paint paint = this.f44880a;
        paint.setColor(v02);
        if (this.d == null) {
            f10 = 1.0f;
        } else {
            f10 = 0.85f;
        }
        paint.setAlpha((int) (f10 * 255.0f));
        View[] viewPages = ekVar.getViewPages();
        y1Var.f46350x = 0.0f;
        boolean z10 = false;
        for (View view : viewPages) {
            if (view instanceof j1) {
                j1 j1Var = (j1) view;
                y1Var.f46350x += Utilities.clamp(1.0f - Math.abs(j1Var.getTranslationX() / j1Var.getMeasuredWidth()), 1.0f, 0.0f) * j1Var.b();
                if (j1Var.getVisibility() == 0) {
                    j1Var.c();
                }
            }
        }
        if (y1Var.f46350x <= 0.0f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d = this.h.d(f11, false);
        float paddingTop = (y1Var.f46350x + ekVar.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ekVar.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) y1Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) y1Var).backgroundPaddingLeft;
        rectF.set(i10, paddingTop, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f44884f.reset();
            this.f44884f.postScale(16.0f, 16.0f);
            this.f44884f.postTranslate(0.0f, -getY());
            this.f44883e.setLocalMatrix(this.f44884f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f44881b);
        }
        if (rectF.top < AndroidUtilities.statusBarHeight) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean bool = this.f44886r;
        if (bool == null || bool.booleanValue() != z4) {
            this.f44886r = Boolean.valueOf(z4);
            Window window = y1Var.getWindow();
            if (z4 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z10);
        }
        float f12 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f12, AndroidUtilities.dp(14.0f) * f12, paint);
        int width2 = getWidth();
        RectF rectF2 = this.f44885n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + width2) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.f44882c;
        paint2.setColor(1367573379);
        paint2.setAlpha((int) (f12 * 81.0f));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            y1 y1Var = this.f44887s;
            if (y10 < y1Var.f46350x) {
                y1Var.dismiss();
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f44881b.setShader(null);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.d == null) {
            y1 y1Var = this.f44887s;
            g6Var = ((org.telegram.ui.ActionBar.h3) y1Var).resourcesProvider;
            if (g6Var != null) {
                g6Var2 = ((org.telegram.ui.ActionBar.h3) y1Var).resourcesProvider;
                if (!g6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.k6.I.q()) {
                return;
            }
            if (y1Var.f46349w != null && SharedConfig.getDevicePerformanceClass() > 0 && !LiteMode.isPowerSaverApplied()) {
                Point point = AndroidUtilities.displaySize;
                Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                y1Var.f46349w.run(createBitmap, Float.valueOf(16.0f));
                Utilities.stackBlurBitmap(createBitmap, 8);
                this.d = createBitmap;
                Bitmap bitmap = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f44883e = bitmapShader;
                this.f44881b.setShader(bitmapShader);
                if (this.f44884f == null) {
                    this.f44884f = new Matrix();
                }
                this.f44884f.postScale(16.0f, 16.0f);
                this.f44883e.setLocalMatrix(this.f44884f);
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        y1 y1Var = this.f44887s;
        y1Var.f46346n = min;
        ek ekVar = y1Var.f46345f;
        ekVar.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        ekVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        x1 x1Var = y1Var.h;
        if (x1Var != null) {
            x1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }
}
