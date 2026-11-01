package vh;

import android.app.Activity;
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
import org.telegram.ui.Components.gr;
public final class b9 extends View implements y1 {
    public final Drawable f51023a;
    public final int f51024b;
    public Bitmap f51025c;
    public final Paint d;
    public final Paint e;
    public float f51026f;
    public final org.telegram.ui.Components.t5 h;
    public final Path f51027n;

    public b9(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(3);
        this.e = paint2;
        this.h = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
        this.f51027n = new Path();
        this.f51023a = activity.getResources().getDrawable(2131231740).mutate();
        this.f51024b = 2131231739;
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f51025c == null) {
            this.f51025c = BitmapFactory.decodeResource(getResources(), this.f51024b);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f51025c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f51025c = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.h.e(false, this.f51026f);
        Drawable drawable = this.f51023a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Rect rect = org.telegram.messenger.i0.Q;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (e <= 0.0f) {
            drawable.setBounds(rect);
            drawable.draw(canvas);
        } else if (e < 1.0f) {
            canvas.save();
            Path path = this.f51027n;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f) * e, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            drawable.setBounds(rect);
            drawable.draw(canvas);
            canvas.restore();
        }
        if (e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(16.0f) * e, this.d);
            canvas.save();
            Bitmap bitmap = this.f51025c;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.e);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override
    public void setInvert(float f7) {
        this.f51023a.setColorFilter(new PorterDuffColorFilter(i0.b.f(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.d.setColor(i0.b.f(f7, -1, -16777216));
    }

    public void setValue(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f51026f = f7;
        invalidate();
    }
}
