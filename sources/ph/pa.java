package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.mr;
public class pa extends View implements c2 {
    public final Path f42220a;
    public final Paint f42221b;
    public final Paint f42222c;
    public boolean d;
    public final org.telegram.ui.Components.z5 e;
    public Drawable f42223f;
    public Bitmap h;
    public int f42224n;
    public ValueAnimator f42225r;

    public pa(Context context) {
        super(context);
        this.f42220a = new Path();
        Paint paint = new Paint(1);
        this.f42221b = paint;
        Paint paint2 = new Paint(3);
        this.f42222c = paint2;
        this.e = new org.telegram.ui.Components.z5(this, 0L, 380L, mr.h);
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void a(kc0 kc0Var, boolean z4) {
        if (this.f42223f == kc0Var) {
            return;
        }
        ValueAnimator valueAnimator = this.f42225r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42225r = null;
        }
        if (z4) {
            this.f42225r = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.f42225r.addUpdateListener(new dg.r(this, new AtomicBoolean(), kc0Var, 3));
            this.f42225r.start();
            return;
        }
        setDrawable(kc0Var);
    }

    public final void b(boolean z4, boolean z10) {
        float f10;
        this.d = z4;
        if (!z10) {
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.e.d(f10, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f42223f != null) {
            float e = this.e.e(this.d);
            int intrinsicWidth = this.f42223f.getIntrinsicWidth();
            int intrinsicHeight = this.f42223f.getIntrinsicHeight();
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
            if (e <= 0.0f) {
                this.f42223f.setBounds(rect);
                this.f42223f.draw(canvas);
            } else if (e < 1.0f) {
                canvas.save();
                Path path = this.f42220a;
                path.rewind();
                path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e, Path.Direction.CW);
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                this.f42223f.setBounds(rect);
                this.f42223f.draw(canvas);
                canvas.restore();
            }
            if (e > 0.0f) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f) * e, this.f42221b);
                canvas.save();
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, this.f42222c);
                }
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == null && this.f42224n != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), this.f42224n);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
    }

    public void setDrawable(int i10) {
        this.f42223f = getContext().getResources().getDrawable(i10).mutate();
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && i10 != 0) {
            this.h = BitmapFactory.decodeResource(getResources(), i10);
        }
        invalidate();
    }

    @Override
    public void setInvert(float f10) {
        Drawable drawable = this.f42223f;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        }
        this.f42221b.setColor(i0.a.d(f10, -1, -16777216));
        invalidate();
    }

    @Override
    public void setSelected(boolean z4) {
        this.d = z4;
        invalidate();
    }

    public void setDrawable(Drawable drawable) {
        this.f42223f = drawable;
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            bitmap.recycle();
            this.h = null;
        }
        if (this.h == null && drawable != null && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            this.h = createBitmap;
            drawable.setBounds(0, 0, createBitmap.getWidth(), this.h.getHeight());
            drawable.draw(new Canvas(this.h));
        }
        invalidate();
    }
}
