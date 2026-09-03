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
import org.telegram.ui.Components.mr;
import org.telegram.ui.gk;
public final class a1 extends FrameLayout {
    public final Paint f41271a;
    public final Paint f41272b;
    public final Paint f41273c;
    public Bitmap d;
    public BitmapShader e;
    public Matrix f41274f;
    public final org.telegram.ui.Components.z5 h;
    public final RectF f41275n;
    public Boolean f41276r;
    public final y1 f41277s;

    public a1(y1 y1Var, Context context) {
        super(context);
        this.f41277s = y1Var;
        this.f41271a = new Paint(1);
        this.f41272b = new Paint(3);
        this.f41273c = new Paint(1);
        this.h = new org.telegram.ui.Components.z5(this, 0L, 250L, mr.h);
        this.f41275n = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f10;
        float f11;
        int i10;
        int i11;
        boolean z4;
        int i12 = org.telegram.ui.ActionBar.j6.f19952h5;
        y1 y1Var = this.f41277s;
        gk gkVar = y1Var.f42642f;
        f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i12, f6Var);
        Paint paint = this.f41271a;
        paint.setColor(v02);
        if (this.d == null) {
            f10 = 1.0f;
        } else {
            f10 = 0.85f;
        }
        paint.setAlpha((int) (f10 * 255.0f));
        View[] viewPages = gkVar.getViewPages();
        y1Var.f42647x = 0.0f;
        boolean z10 = false;
        for (View view : viewPages) {
            if (view instanceof i1) {
                i1 i1Var = (i1) view;
                y1Var.f42647x += Utilities.clamp(1.0f - Math.abs(i1Var.getTranslationX() / i1Var.getMeasuredWidth()), 1.0f, 0.0f) * i1Var.b();
                if (i1Var.getVisibility() == 0) {
                    i1Var.c();
                }
            }
        }
        if (y1Var.f42647x <= 0.0f) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float d = this.h.d(f11, false);
        float paddingTop = (y1Var.f42647x + gkVar.getPaddingTop()) - AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), gkVar.getPaddingTop(), d);
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        rectF.set(i10, paddingTop, width - i11, AndroidUtilities.dp(8.0f) + getHeight());
        if (this.d != null) {
            this.f41274f.reset();
            this.f41274f.postScale(16.0f, 16.0f);
            this.f41274f.postTranslate(0.0f, -getY());
            this.e.setLocalMatrix(this.f41274f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f41272b);
        }
        if (rectF.top < AndroidUtilities.statusBarHeight) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean bool = this.f41276r;
        if (bool == null || bool.booleanValue() != z4) {
            this.f41276r = Boolean.valueOf(z4);
            Window window = y1Var.getWindow();
            if (z4 && AndroidUtilities.computePerceivedBrightness(paint.getColor()) >= 0.721f) {
                z10 = true;
            }
            AndroidUtilities.setLightStatusBar(window, z10);
        }
        float f12 = 1.0f - d;
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f) * f12, AndroidUtilities.dp(14.0f) * f12, paint);
        int width2 = getWidth();
        RectF rectF2 = this.f41275n;
        rectF2.set((getWidth() - AndroidUtilities.dp(36.0f)) / 2.0f, AndroidUtilities.dp(9.66f) + paddingTop, (AndroidUtilities.dp(36.0f) + width2) / 2.0f, paddingTop + AndroidUtilities.dp(13.66f));
        Paint paint2 = this.f41273c;
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
            y1 y1Var = this.f41277s;
            if (y10 < y1Var.f42647x) {
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
        this.f41272b.setShader(null);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.d == null) {
            y1 y1Var = this.f41277s;
            f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
            if (f6Var != null) {
                f6Var2 = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
                if (!f6Var2.a()) {
                    return;
                }
            } else if (!org.telegram.ui.ActionBar.j6.I.q()) {
                return;
            }
            if (y1Var.f42646w != null && SharedConfig.getDevicePerformanceClass() > 0 && !LiteMode.isPowerSaverApplied()) {
                Point point = AndroidUtilities.displaySize;
                Bitmap createBitmap = Bitmap.createBitmap(point.x / 16, point.y / 16, Bitmap.Config.ARGB_8888);
                y1Var.f42646w.run(createBitmap, Float.valueOf(16.0f));
                Utilities.stackBlurBitmap(createBitmap, 8);
                this.d = createBitmap;
                Bitmap bitmap = this.d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.e = bitmapShader;
                this.f41272b.setShader(bitmapShader);
                if (this.f41274f == null) {
                    this.f41274f = new Matrix();
                }
                this.f41274f.postScale(16.0f, 16.0f);
                this.e.setLocalMatrix(this.f41274f);
                invalidate();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float min = Math.min(size2 * 0.45f, (AndroidUtilities.dp(350.0f) / 0.55f) * 0.45f);
        y1 y1Var = this.f41277s;
        y1Var.f42643n = min;
        gk gkVar = y1Var.f42642f;
        gkVar.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        gkVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
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
