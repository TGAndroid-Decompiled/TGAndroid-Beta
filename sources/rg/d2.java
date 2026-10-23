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
import org.telegram.messenger.sl;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iw0;
import w7.z5;
public final class d2 extends j {
    public boolean A0;
    public boolean B0;
    public final f6 C0;
    public final int f45740q0;
    public boolean f45741r0;
    public final f6 f45742s0;
    public final iw0 f45743t0;
    public final TextureView f45744u0;
    public final Bitmap f45745v0;
    public final Rect f45746w0;
    public final Rect f45747x0;
    public float f45748y0;
    public final Path f45749z0;

    public d2(Context context, PointF pointF, iw0 iw0Var, String str) {
        super(context, pointF);
        this.f45740q0 = -1;
        this.f45741r0 = false;
        Rect rect = new Rect();
        this.f45746w0 = rect;
        this.f45747x0 = new Rect();
        this.f45748y0 = 1.0f;
        this.f45749z0 = new Path();
        this.A0 = true;
        this.B0 = true;
        bs bsVar = bs.h;
        this.C0 = new f6(this, 0L, 350L, bsVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f45743t0 = iw0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f45745v0 = decodeFile;
        if (decodeFile != null) {
            this.f45748y0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f45744u0 = textureView;
        addView(textureView, z5.c(-1.0f, -1));
        this.f45742s0 = new f6(this, 0L, 500L, bsVar);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final i a() {
        return new b2(this, getContext());
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
        if (view == this.f45744u0) {
            canvas.save();
            float e = this.f45742s0.e(this.f45741r0);
            canvas.scale(1.0f - (e * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, org.telegram.messenger.v0.A(1.0f, e, 4.0f * e, 0.25f));
            float e7 = this.C0.e(this.B0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            int i10 = (e7 > 1.0f ? 1 : (e7 == 1.0f ? 0 : -1));
            Rect rect2 = this.f45746w0;
            Rect rect3 = this.f45747x0;
            Bitmap bitmap2 = this.f45745v0;
            Path path2 = this.f45749z0;
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
            if ((getParent() instanceof d) && ((d) getParent()).f45734a) {
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
        return this.f45740q0;
    }

    public iw0 getBaseSize() {
        return this.f45743t0;
    }

    @Override
    public il0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float z10 = sl.z(dp, 2.0f, getPositionX(), scaleX);
        return new il0(z10, sl.z(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + z10) - z10, dp2 * scaleX);
    }

    @Override
    public final void k() {
        iw0 iw0Var = this.f45743t0;
        setX(getPositionX() - (iw0Var.f27465a / 2.0f));
        setY(getPositionY() - (iw0Var.f27466b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.f45744u0;
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
        iw0 iw0Var = this.f45743t0;
        int i14 = (int) iw0Var.f27465a;
        int i15 = (int) iw0Var.f27466b;
        TextureView textureView = this.f45744u0;
        if (textureView != null) {
            float f7 = this.f45748y0;
            if (f7 >= 1.0f) {
                i12 = (int) (f7 * i15);
            } else {
                i12 = i14;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            float f10 = this.f45748y0;
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
