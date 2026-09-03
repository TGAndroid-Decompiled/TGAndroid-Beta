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
    public final Paint f44911a;
    public final Paint f44912b;
    public final Paint f44913c;
    public Bitmap d;
    public BitmapShader f44914e;
    public Matrix f44915f;
    public final org.telegram.ui.Components.z5 h;
    public final RectF f44916n;
    public Boolean f44917r;
    public final x1 f44918s;

    public a1(x1 x1Var, Context context) {
        super(context);
        this.f44918s = x1Var;
        this.f44911a = new Paint(1);
        this.f44912b = new Paint(3);
        this.f44913c = new Paint(1);
        this.h = new org.telegram.ui.Components.z5(this, 0L, 250L, pr.h);
        this.f44916n = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.g6 g6Var;
        float f10;
        float f11;
        int i10;
        int i11;
        boolean z4;
        int i12 = org.telegram.ui.ActionBar.k6.f21733h5;
        x1 x1Var = this.f44918s;
        ek ekVar = x1Var.f46301f;
        g6Var = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i12, g6Var);
        Paint paint = this.f44911a;
        paint.setColor(v02);
        if (this.d == null) {
            f10 = 1.0f;
        } else {
            f10 = 0.85f;
        }
        paint.setAlpha((int) (f10 * 255.0f));
        View[] viewPages = ekVar.getViewPages();
        x1Var.f46306x = 0.0f;
        boolean z10 = false;
        for (View view : viewPages) {
            if (view instanceof i1) {
                i1 i1Var = (i1) view;
                x1Var.f46306x += Utilities.clamp(1.0f - Math.abs(i1Var.getTranslationX() / i1Var.getMeasuredWidth()), 1.0f, 0.0f) * i1Var.b();
                if (i1Var.getVisibility() == 0) {
                    i1Var.c();
                }
            }
        }
        if (x1Var.f46306x <= 0.0f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d = this.h.d(f11, false);
        float paddingTop = (x1Var.f46306x + ekVar.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), ekVar.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) x1Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) x1Var).backgroundPaddingLeft;
        rectF.set(i10, paddingTop, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f44915f.reset();
            this.f44915f.postScale(16.0f, 16.0f);
            this.f44915f.postTranslate(0.0f, -getY());
            this.f44914e.setLocalMatrix(this.f44915f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f44912b);
        }
        if (rectF.top < AndroidUtilities.statusBarHeight) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean bool = this.f44917r;
        if (bool == null || bool.booleanValue() != z4) {
            this.f44917r = Boolean.valueOf(z4);
            Window window = x1Var.getWindow();
            if (z4 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z10);
        }
        float f12 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f12, AndroidUtilities.dp(14.0f) * f12, paint);
        int width2 = getWidth();
        RectF rectF2 = this.f44916n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + width2) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.f44913c;
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
            x1 x1Var = this.f44918s;
            if (y10 < x1Var.f46306x) {
                x1Var.dismiss();
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
        this.f44912b.setShader(null);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.d == null) {
            x1 x1Var = this.f44918s;
            g6Var = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
            if (g6Var != null) {
                g6Var2 = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
                if (!g6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.k6.I.q()) {
                return;
            }
            if (x1Var.f46305w != null && SharedConfig.getDevicePerformanceClass() > 0 && !LiteMode.isPowerSaverApplied()) {
                Point point = AndroidUtilities.displaySize;
                Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                x1Var.f46305w.run(createBitmap, Float.valueOf(16.0f));
                Utilities.stackBlurBitmap(createBitmap, 8);
                this.d = createBitmap;
                Bitmap bitmap = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.f44914e = bitmapShader;
                this.f44912b.setShader(bitmapShader);
                if (this.f44915f == null) {
                    this.f44915f = new Matrix();
                }
                this.f44915f.postScale(16.0f, 16.0f);
                this.f44914e.setLocalMatrix(this.f44915f);
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        x1 x1Var = this.f44918s;
        x1Var.f46302n = min;
        ek ekVar = x1Var.f46301f;
        ekVar.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        ekVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        w1 w1Var = x1Var.h;
        if (w1Var != null) {
            w1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0);
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }
}
