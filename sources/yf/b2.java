package yf;

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
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.y5;
public final class b2 extends j {
    public final int m0;
    public boolean f49760n0;
    public final y5 f49761o0;
    public final qu0 f49762p0;
    public final TextureView f49763q0;
    public final Bitmap f49764r0;
    public final Rect f49765s0;
    public final Rect f49766t0;
    public float f49767u0;
    public final Path f49768v0;
    public boolean f49769w0;
    public boolean f49770x0;
    public final y5 f49771y0;

    public b2(Context context, PointF pointF, qu0 qu0Var, String str) {
        super(context, pointF);
        this.m0 = -1;
        this.f49760n0 = false;
        Rect rect = new Rect();
        this.f49765s0 = rect;
        this.f49766t0 = new Rect();
        this.f49767u0 = 1.0f;
        this.f49768v0 = new Path();
        this.f49769w0 = true;
        this.f49770x0 = true;
        gr grVar = gr.h;
        this.f49771y0 = new y5(this, 0L, 350L, grVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f49762p0 = qu0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f49764r0 = decodeFile;
        if (decodeFile != null) {
            this.f49767u0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f49763q0 = textureView;
        addView(textureView, e6.c(-1.0f, -1));
        this.f49761o0 = new y5(this, 0L, 500L, grVar);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final i a() {
        return new z1(this, getContext());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        boolean drawChild;
        if (!this.f49769w0) {
            return false;
        }
        if (view == this.f49763q0) {
            canvas.save();
            float e10 = this.f49761o0.e(this.f49760n0);
            canvas.scale(1.0f - (e10 * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, org.telegram.messenger.l0.y(1.0f, e10, 4.0f * e10, 0.25f));
            float e11 = this.f49771y0.e(this.f49770x0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            Rect rect2 = this.f49765s0;
            Rect rect3 = this.f49766t0;
            Bitmap bitmap2 = this.f49764r0;
            Path path2 = this.f49768v0;
            if (e11 < 1.0f) {
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
            path.addCircle(width, height, min * e11, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            if ((getParent() instanceof d) && ((d) getParent()).f49782a) {
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
        return this.m0;
    }

    public qu0 getBaseSize() {
        return this.f49762p0;
    }

    @Override
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float v = ll.v(dp, 2.0f, getPositionX(), scaleX);
        return new wj0(v, ll.v(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + v) - v, dp2 * scaleX);
    }

    @Override
    public final void k() {
        qu0 qu0Var = this.f49762p0;
        setX(getPositionX() - (qu0Var.f32026a / 2.0f));
        setY(getPositionY() - (qu0Var.f32027b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        TextureView textureView = this.f49763q0;
        if (textureView != null) {
            int measuredHeight = ((i12 - i10) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i11 - i9) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        qu0 qu0Var = this.f49762p0;
        int i13 = (int) qu0Var.f32026a;
        int i14 = (int) qu0Var.f32027b;
        TextureView textureView = this.f49763q0;
        if (textureView != null) {
            float f10 = this.f49767u0;
            if (f10 >= 1.0f) {
                i11 = (int) (f10 * i14);
            } else {
                i11 = i13;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            float f11 = this.f49767u0;
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
        if (this.f49769w0 != z10) {
            this.f49769w0 = z10;
            invalidate();
        }
    }
}
