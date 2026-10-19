package rg;

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
import org.telegram.messenger.kk;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.f6;
import w7.z5;
public final class c2 extends j {
    public boolean A0;
    public boolean B0;
    public final f6 C0;
    public final int f45301q0;
    public boolean f45302r0;
    public final f6 f45303s0;
    public final ew0 f45304t0;
    public final TextureView f45305u0;
    public final Bitmap f45306v0;
    public final Rect f45307w0;
    public final Rect f45308x0;
    public float f45309y0;
    public final Path f45310z0;

    public c2(Context context, PointF pointF, ew0 ew0Var, String str) {
        super(context, pointF);
        this.f45301q0 = -1;
        this.f45302r0 = false;
        Rect rect = new Rect();
        this.f45307w0 = rect;
        this.f45308x0 = new Rect();
        this.f45309y0 = 1.0f;
        this.f45310z0 = new Path();
        this.A0 = true;
        this.B0 = true;
        bs bsVar = bs.h;
        this.C0 = new f6(this, 0L, 350L, bsVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f45304t0 = ew0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f45306v0 = decodeFile;
        if (decodeFile != null) {
            this.f45309y0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f45305u0 = textureView;
        addView(textureView, z5.c(-1.0f, -1));
        this.f45303s0 = new f6(this, 0L, 500L, bsVar);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final i a() {
        return new a2(this, getContext());
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        Rect rect;
        Bitmap bitmap;
        Path path;
        boolean drawChild;
        if (!this.A0) {
            return false;
        }
        if (view == this.f45305u0) {
            canvas.save();
            float e = this.f45303s0.e(this.f45302r0);
            canvas.scale(1.0f - (e * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, org.telegram.messenger.g0.z(1.0f, e, 4.0f * e, 0.25f));
            float e7 = this.C0.e(this.B0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            int i10 = (e7 > 1.0f ? 1 : (e7 == 1.0f ? 0 : -1));
            Rect rect2 = this.f45307w0;
            Rect rect3 = this.f45308x0;
            Bitmap bitmap2 = this.f45306v0;
            Path path2 = this.f45310z0;
            if (i10 < 0) {
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
            path.addCircle(width, height, min * e7, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            if ((getParent() instanceof d) && ((d) getParent()).f45311a) {
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
        return this.f45301q0;
    }

    public ew0 getBaseSize() {
        return this.f45304t0;
    }

    @Override
    public el0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float z10 = kk.z(dp, 2.0f, getPositionX(), scaleX);
        return new el0(z10, kk.z(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + z10) - z10, dp2 * scaleX);
    }

    @Override
    public final void k() {
        ew0 ew0Var = this.f45304t0;
        setX(getPositionX() - (ew0Var.f26038a / 2.0f));
        setY(getPositionY() - (ew0Var.f26039b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.f45305u0;
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
        ew0 ew0Var = this.f45304t0;
        int i14 = (int) ew0Var.f26038a;
        int i15 = (int) ew0Var.f26039b;
        TextureView textureView = this.f45305u0;
        if (textureView != null) {
            float f7 = this.f45309y0;
            if (f7 >= 1.0f) {
                i12 = (int) (f7 * i15);
            } else {
                i12 = i14;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            float f10 = this.f45309y0;
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
