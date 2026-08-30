package ph;

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
import org.telegram.ui.Components.nr;
import org.telegram.ui.ek;
public final class a1 extends FrameLayout {
    public final Paint f41244a;
    public final Paint f41245b;
    public final Paint f41246c;
    public Bitmap d;
    public BitmapShader e;
    public Matrix f41247f;
    public final org.telegram.ui.Components.z5 h;
    public final RectF f41248n;
    public Boolean f41249r;
    public final y1 f41250s;

    public a1(y1 y1Var, Context context) {
        super(context);
        this.f41250s = y1Var;
        this.f41244a = new Paint(1);
        this.f41245b = new Paint(3);
        this.f41246c = new Paint(1);
        this.h = new org.telegram.ui.Components.z5(this, 0L, 250L, nr.h);
        this.f41248n = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f10;
        float f11;
        int i10;
        int i11;
        boolean z4;
        int i12 = org.telegram.ui.ActionBar.j6.f19977h5;
        y1 y1Var = this.f41250s;
        ek ekVar = y1Var.f42605f;
        f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        Paint paint = this.f41244a;
        paint.setColor(v02);
        if (this.d == null) {
            f10 = 1.0f;
        } else {
            f10 = 0.85f;
        }
        paint.setAlpha((int) (f10 * 255.0f));
        View[] viewPages = ekVar.getViewPages();
        y1Var.f42610x = 0.0f;
        boolean z10 = false;
        for (View view : viewPages) {
            if (view instanceof j1) {
                j1 j1Var = (j1) view;
                y1Var.f42610x += Utilities.clamp(1.0f - Math.abs(j1Var.getTranslationX() / j1Var.getMeasuredWidth()), 1.0f, 0.0f) * j1Var.b();
                if (j1Var.getVisibility() == 0) {
                    j1Var.c();
                }
            }
        }
        if (y1Var.f42610x <= 0.0f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d = this.h.d(f11, false);
        float paddingTop = (y1Var.f42610x + ekVar.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ekVar.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        rectF.set(i10, paddingTop, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f41247f.reset();
            this.f41247f.postScale(16.0f, 16.0f);
            this.f41247f.postTranslate(0.0f, -getY());
            this.e.setLocalMatrix(this.f41247f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f41245b);
        }
        if (rectF.top < AndroidUtilities.statusBarHeight) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean bool = this.f41249r;
        if (bool == null || bool.booleanValue() != z4) {
            this.f41249r = Boolean.valueOf(z4);
            Window window = y1Var.getWindow();
            if (z4 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z10);
        }
        float f12 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f12, AndroidUtilities.dp(14.0f) * f12, paint);
        int width2 = getWidth();
        RectF rectF2 = this.f41248n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + width2) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.f41246c;
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
            y1 y1Var = this.f41250s;
            if (y10 < y1Var.f42610x) {
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
        this.f41245b.setShader(null);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.d == null) {
            y1 y1Var = this.f41250s;
            f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
            if (f6Var != null) {
                f6Var2 = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
                if (!f6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.j6.I.q()) {
                return;
            }
            if (y1Var.f42609w != null && SharedConfig.getDevicePerformanceClass() > 0 && !LiteMode.isPowerSaverApplied()) {
                Point point = AndroidUtilities.displaySize;
                Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                y1Var.f42609w.run(createBitmap, Float.valueOf(16.0f));
                Utilities.stackBlurBitmap(createBitmap, 8);
                this.d = createBitmap;
                Bitmap bitmap = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.e = bitmapShader;
                this.f41245b.setShader(bitmapShader);
                if (this.f41247f == null) {
                    this.f41247f = new Matrix();
                }
                this.f41247f.postScale(16.0f, 16.0f);
                this.e.setLocalMatrix(this.f41247f);
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        y1 y1Var = this.f41250s;
        y1Var.f42606n = min;
        ek ekVar = y1Var.f42605f;
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
