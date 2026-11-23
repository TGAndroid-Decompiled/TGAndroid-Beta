package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import c8.ma;
import org.telegram.messenger.f3;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.yt0;
public final class t1 extends j {
    public final Path A0;
    public boolean B0;
    public boolean C0;
    public final d6 D0;
    public final int f58177r0;
    public boolean f58178s0;
    public final d6 f58179t0;
    public final yt0 f58180u0;
    public final TextureView f58181v0;
    public final Bitmap f58182w0;
    public final Rect f58183x0;
    public final Rect f58184y0;
    public float f58185z0;

    public t1(Context context, PointF pointF, yt0 yt0Var, String str) {
        super(context, pointF);
        this.f58177r0 = -1;
        this.f58178s0 = false;
        Rect rect = new Rect();
        this.f58183x0 = rect;
        this.f58184y0 = new Rect();
        this.f58185z0 = 1.0f;
        this.A0 = new Path();
        this.B0 = true;
        this.C0 = true;
        nr nrVar = nr.h;
        this.D0 = new d6(this, 0L, 350L, nrVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f58180u0 = yt0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f58182w0 = decodeFile;
        if (decodeFile != null) {
            this.f58185z0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f58181v0 = textureView;
        addView(textureView, ma.c(-1.0f, -1));
        this.f58179t0 = new d6(this, 0L, 500L, nrVar);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final i a() {
        return new r1(this, getContext());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        boolean drawChild;
        if (!this.B0) {
            return false;
        }
        if (view == this.f58181v0) {
            canvas.save();
            float d = this.f58179t0.d(this.f58178s0);
            canvas.scale(1.0f - (d * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, f3.A(1.0f, d, 4.0f * d, 0.25f));
            float d2 = this.D0.d(this.C0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            int i7 = (d2 > 1.0f ? 1 : (d2 == 1.0f ? 0 : -1));
            Rect rect2 = this.f58183x0;
            Rect rect3 = this.f58184y0;
            Bitmap bitmap2 = this.f58182w0;
            Path path2 = this.A0;
            if (i7 < 0) {
                rect = rect3;
                bitmap = bitmap2;
                canvas.saveLayerAlpha(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight(), 128, 31);
                path2.rewind();
                path = path2;
                path.addCircle(width, height, min, Path.Direction.CW);
                canvas.clipPath(path);
                if (bitmap != null) {
                    rect.set(0, 0, view.getWidth(), view.getHeight());
                    canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
                }
                super.drawChild(canvas, view, j3);
                canvas.restore();
            } else {
                rect = rect3;
                bitmap = bitmap2;
                path = path2;
            }
            canvas.save();
            path.rewind();
            path.addCircle(width, height, min * d2, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            if ((getParent() instanceof d) && ((d) getParent()).f57807a) {
                drawChild = true;
            } else {
                drawChild = super.drawChild(canvas, view, j3);
            }
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public int getAnchor() {
        return this.f58177r0;
    }

    public yt0 getBaseSize() {
        return this.f58180u0;
    }

    @Override
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float y10 = o10.y(L, 2.0f, getPositionX(), scaleX);
        return new aj0(y10, o10.y(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override
    public final void k() {
        yt0 yt0Var = this.f58180u0;
        setX(getPositionX() - (yt0Var.f42545a / 2.0f));
        setY(getPositionY() - (yt0Var.f42546b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        TextureView textureView = this.f58181v0;
        if (textureView != null) {
            int measuredHeight = ((i12 - i10) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i11 - i7) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        yt0 yt0Var = this.f58180u0;
        int i13 = (int) yt0Var.f42545a;
        int i14 = (int) yt0Var.f42546b;
        TextureView textureView = this.f58181v0;
        if (textureView != null) {
            float f10 = this.f58185z0;
            if (f10 >= 1.0f) {
                i11 = (int) (f10 * i14);
            } else {
                i11 = i13;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            float f11 = this.f58185z0;
            if (f11 >= 1.0f) {
                i12 = i14;
            } else {
                i12 = (int) (i13 / f11);
            }
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        }
        setMeasuredDimension(i13, i14);
    }

    public void setDraw(boolean z10) {
        if (this.B0 != z10) {
            this.B0 = z10;
            invalidate();
        }
    }
}
