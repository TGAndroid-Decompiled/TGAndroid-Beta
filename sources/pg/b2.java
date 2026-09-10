package pg;

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
import org.telegram.messenger.em;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.wr;
import w7.a6;
public final class b2 extends j {
    public boolean A0;
    public boolean B0;
    public final d6 C0;
    public final int f39954q0;
    public boolean f39955r0;
    public final d6 f39956s0;
    public final tv0 f39957t0;
    public final TextureView f39958u0;
    public final Bitmap f39959v0;
    public final Rect f39960w0;
    public final Rect f39961x0;
    public float f39962y0;
    public final Path f39963z0;

    public b2(Context context, PointF pointF, tv0 tv0Var, String str) {
        super(context, pointF);
        this.f39954q0 = -1;
        this.f39955r0 = false;
        Rect rect = new Rect();
        this.f39960w0 = rect;
        this.f39961x0 = new Rect();
        this.f39962y0 = 1.0f;
        this.f39963z0 = new Path();
        this.A0 = true;
        this.B0 = true;
        wr wrVar = wr.h;
        this.C0 = new d6(this, 0L, 350L, wrVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f39957t0 = tv0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f39959v0 = decodeFile;
        if (decodeFile != null) {
            this.f39962y0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f39958u0 = textureView;
        addView(textureView, a6.c(-1.0f, -1));
        this.f39956s0 = new d6(this, 0L, 500L, wrVar);
        k();
        setWillNotDraw(false);
    }

    @Override
    public final i a() {
        return new z1(this, getContext());
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
        if (view == this.f39958u0) {
            canvas.save();
            float e = this.f39956s0.e(this.f39955r0);
            canvas.scale(1.0f - (e * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, org.telegram.messenger.a2.A(1.0f, e, 4.0f * e, 0.25f));
            float e7 = this.C0.e(this.B0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            Rect rect2 = this.f39960w0;
            Rect rect3 = this.f39961x0;
            Bitmap bitmap2 = this.f39959v0;
            Path path2 = this.f39963z0;
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
            if ((getParent() instanceof d) && ((d) getParent()).f39971a) {
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
        return this.f39954q0;
    }

    public tv0 getBaseSize() {
        return this.f39957t0;
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
        float u10 = em.u(dp, 2.0f, getPositionX(), scaleX);
        return new rk0(u10, em.u(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + u10) - u10, dp2 * scaleX);
    }

    @Override
    public final void k() {
        tv0 tv0Var = this.f39957t0;
        setX(getPositionX() - (tv0Var.f27499a / 2.0f));
        setY(getPositionY() - (tv0Var.f27500b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.f39958u0;
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
        tv0 tv0Var = this.f39957t0;
        int i14 = (int) tv0Var.f27499a;
        int i15 = (int) tv0Var.f27500b;
        TextureView textureView = this.f39958u0;
        if (textureView != null) {
            float f7 = this.f39962y0;
            if (f7 >= 1.0f) {
                i12 = (int) (f7 * i15);
            } else {
                i12 = i14;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            float f10 = this.f39962y0;
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
