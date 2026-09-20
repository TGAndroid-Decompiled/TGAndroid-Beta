package qg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rk;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.uv0;
import w7.y5;
public final class c2 extends j {
    public boolean A0;
    public boolean B0;
    public final d6 C0;
    public final int f41613q0;
    public boolean f41614r0;
    public final d6 f41615s0;
    public final uv0 f41616t0;
    public final TextureView f41617u0;
    public final Bitmap f41618v0;
    public final Rect f41619w0;
    public final Rect f41620x0;
    public float f41621y0;
    public final Path f41622z0;

    public c2(Context context, PointF pointF, uv0 uv0Var, String str) {
        super(context, pointF);
        this.f41613q0 = -1;
        this.f41614r0 = false;
        Rect rect = new Rect();
        this.f41619w0 = rect;
        this.f41620x0 = new Rect();
        this.f41621y0 = 1.0f;
        this.f41622z0 = new Path();
        this.A0 = true;
        this.B0 = true;
        qr qrVar = qr.h;
        this.C0 = new d6(this, 0L, 350L, qrVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f41616t0 = uv0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f41618v0 = decodeFile;
        if (decodeFile != null) {
            this.f41621y0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f41617u0 = textureView;
        addView(textureView, y5.c(-1.0f, -1));
        this.f41615s0 = new d6(this, 0L, 500L, qrVar);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final i a() {
        return new a2(this, getContext());
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
        if (view == this.f41617u0) {
            canvas.save();
            float e = this.f41615s0.e(this.f41614r0);
            canvas.scale(1.0f - (e * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, org.telegram.messenger.l0.z(1.0f, e, 4.0f * e, 0.25f));
            float e7 = this.C0.e(this.B0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            Rect rect2 = this.f41619w0;
            Rect rect3 = this.f41620x0;
            Bitmap bitmap2 = this.f41618v0;
            Path path2 = this.f41622z0;
            if (e7 < 1.0f) {
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
            path.addCircle(width, height, min * e7, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            if ((getParent() instanceof d) && ((d) getParent()).f41623a) {
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
        return this.f41613q0;
    }

    public uv0 getBaseSize() {
        return this.f41616t0;
    }

    @Override
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float w10 = rk.w(dp, 2.0f, getPositionX(), scaleX);
        return new rk0(w10, rk.w(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + w10) - w10, dp2 * scaleX);
    }

    @Override
    public final void k() {
        uv0 uv0Var = this.f41616t0;
        setX(getPositionX() - (uv0Var.f28868a / 2.0f));
        setY(getPositionY() - (uv0Var.f28869b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.f41617u0;
        if (textureView != null) {
            int measuredHeight = ((i13 - i11) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i12 - i10) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        uv0 uv0Var = this.f41616t0;
        int i14 = (int) uv0Var.f28868a;
        int i15 = (int) uv0Var.f28869b;
        TextureView textureView = this.f41617u0;
        if (textureView != null) {
            float f7 = this.f41621y0;
            if (f7 >= 1.0f) {
                i12 = (int) (f7 * i15);
            } else {
                i12 = i14;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            float f10 = this.f41621y0;
            if (f10 >= 1.0f) {
                i13 = i15;
            } else {
                i13 = (int) (i14 / f10);
            }
            textureView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        }
        setMeasuredDimension(i14, i15);
    }

    public void setDraw(boolean z10) {
        if (this.A0 != z10) {
            this.A0 = z10;
            invalidate();
        }
    }
}
