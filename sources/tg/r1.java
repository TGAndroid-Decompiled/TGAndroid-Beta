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
import c8.ha;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public final class r1 extends j {
    public boolean A0;
    public boolean B0;
    public final w5 C0;
    public final int f55940q0;
    public boolean f55941r0;
    public final w5 f55942s0;
    public final ot0 f55943t0;
    public final TextureView f55944u0;
    public final Bitmap f55945v0;
    public final Rect f55946w0;
    public final Rect f55947x0;
    public float f55948y0;
    public final Path f55949z0;

    public r1(Context context, PointF pointF, ot0 ot0Var, String str) {
        super(context, pointF);
        this.f55940q0 = -1;
        this.f55941r0 = false;
        Rect rect = new Rect();
        this.f55946w0 = rect;
        this.f55947x0 = new Rect();
        this.f55948y0 = 1.0f;
        this.f55949z0 = new Path();
        this.A0 = true;
        this.B0 = true;
        xq xqVar = xq.h;
        this.C0 = new w5(this, 0L, 350L, xqVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f55943t0 = ot0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f55945v0 = decodeFile;
        if (decodeFile != null) {
            this.f55948y0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f55944u0 = textureView;
        addView(textureView, ha.c(-1.0f, -1));
        this.f55942s0 = new w5(this, 0L, 500L, xqVar);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final i a() {
        return new p1(this, getContext());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        boolean drawChild;
        if (!this.A0) {
            return false;
        }
        if (view == this.f55944u0) {
            canvas.save();
            float d = this.f55942s0.d(this.f55941r0);
            canvas.scale(1.0f - (d * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, k5.A(1.0f, d, 4.0f * d, 0.25f));
            float d2 = this.C0.d(this.B0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            int i7 = (d2 > 1.0f ? 1 : (d2 == 1.0f ? 0 : -1));
            Rect rect2 = this.f55946w0;
            Rect rect3 = this.f55947x0;
            Bitmap bitmap2 = this.f55945v0;
            Path path2 = this.f55949z0;
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
            if ((getParent() instanceof d) && ((d) getParent()).f55628a) {
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
        return this.f55940q0;
    }

    public ot0 getBaseSize() {
        return this.f55943t0;
    }

    @Override
    public li0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        return new li0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public final void k() {
        ot0 ot0Var = this.f55943t0;
        setX(getPositionX() - (ot0Var.f36801a / 2.0f));
        setY(getPositionY() - (ot0Var.f36802b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        TextureView textureView = this.f55944u0;
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
        ot0 ot0Var = this.f55943t0;
        int i13 = (int) ot0Var.f36801a;
        int i14 = (int) ot0Var.f36802b;
        TextureView textureView = this.f55944u0;
        if (textureView != null) {
            float f10 = this.f55948y0;
            if (f10 >= 1.0f) {
                i11 = (int) (f10 * i14);
            } else {
                i11 = i13;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            float f11 = this.f55948y0;
            if (f11 >= 1.0f) {
                i12 = i14;
            } else {
                i12 = (int) (i13 / f11);
            }
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        }
        setMeasuredDimension(i13, i14);
    }

    public void setDraw(boolean z9) {
        if (this.A0 != z9) {
            this.A0 = z9;
            invalidate();
        }
    }
}
