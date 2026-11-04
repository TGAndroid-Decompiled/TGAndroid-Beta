package ug;

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
import b8.mf;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
public final class r1 extends j {
    public final Path A0;
    public boolean B0;
    public boolean C0;
    public final u5 D0;
    public final int f56236r0;
    public boolean f56237s0;
    public final u5 f56238t0;
    public final lt0 f56239u0;
    public final TextureView f56240v0;
    public final Bitmap f56241w0;
    public final Rect f56242x0;
    public final Rect f56243y0;
    public float f56244z0;

    public r1(Context context, PointF pointF, lt0 lt0Var, String str) {
        super(context, pointF);
        this.f56236r0 = -1;
        this.f56237s0 = false;
        Rect rect = new Rect();
        this.f56242x0 = rect;
        this.f56243y0 = new Rect();
        this.f56244z0 = 1.0f;
        this.A0 = new Path();
        this.B0 = true;
        this.C0 = true;
        xq xqVar = xq.h;
        this.D0 = new u5(this, 0L, 350L, xqVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f56239u0 = lt0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f56241w0 = decodeFile;
        if (decodeFile != null) {
            this.f56244z0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f56240v0 = textureView;
        addView(textureView, mf.c(-1.0f, -1));
        this.f56238t0 = new u5(this, 0L, 500L, xqVar);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final i a() {
        return new p1(this, getContext());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        boolean drawChild;
        if (!this.B0) {
            return false;
        }
        if (view == this.f56240v0) {
            canvas.save();
            float d = this.f56238t0.d(this.f56237s0);
            canvas.scale(1.0f - (d * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, k5.A(1.0f, d, 4.0f * d, 0.25f));
            float d10 = this.D0.d(this.C0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            int i3 = (d10 > 1.0f ? 1 : (d10 == 1.0f ? 0 : -1));
            Rect rect2 = this.f56242x0;
            Rect rect3 = this.f56243y0;
            Bitmap bitmap2 = this.f56241w0;
            Path path2 = this.A0;
            if (i3 < 0) {
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
                super.drawChild(canvas, view, j10);
                canvas.restore();
            } else {
                rect = rect3;
                bitmap = bitmap2;
                path = path2;
            }
            canvas.save();
            path.rewind();
            path.addCircle(width, height, min * d10, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            if ((getParent() instanceof d) && ((d) getParent()).f55923a) {
                drawChild = true;
            } else {
                drawChild = super.drawChild(canvas, view, j10);
            }
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getAnchor() {
        return this.f56236r0;
    }

    public lt0 getBaseSize() {
        return this.f56239u0;
    }

    @Override
    public ni0 getSelectionBounds() {
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
        return new ni0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public final void k() {
        lt0 lt0Var = this.f56239u0;
        setX(getPositionX() - (lt0Var.f35877a / 2.0f));
        setY(getPositionY() - (lt0Var.f35878b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        TextureView textureView = this.f56240v0;
        if (textureView != null) {
            int measuredHeight = ((i12 - i10) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i11 - i3) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        lt0 lt0Var = this.f56239u0;
        int i13 = (int) lt0Var.f35877a;
        int i14 = (int) lt0Var.f35878b;
        TextureView textureView = this.f56240v0;
        if (textureView != null) {
            float f10 = this.f56244z0;
            if (f10 >= 1.0f) {
                i11 = (int) (f10 * i14);
            } else {
                i11 = i13;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            float f11 = this.f56244z0;
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
