package zf;

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
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yj0;

public final class c2 extends j {
    public final int m0;

    public boolean f50360n0;

    public final y5 f50361o0;

    public final tu0 f50362p0;

    public final TextureView f50363q0;

    public final Bitmap f50364r0;

    public final Rect f50365s0;

    public final Rect f50366t0;

    public float f50367u0;

    public final Path f50368v0;

    public boolean f50369w0;

    public boolean f50370x0;

    public final y5 f50371y0;

    public c2(Context context, PointF pointF, tu0 tu0Var, String str) {
        super(context, pointF);
        this.m0 = -1;
        this.f50360n0 = false;
        Rect rect = new Rect();
        this.f50365s0 = rect;
        this.f50366t0 = new Rect();
        this.f50367u0 = 1.0f;
        this.f50368v0 = new Path();
        this.f50369w0 = true;
        this.f50370x0 = true;
        er erVar = er.h;
        this.f50371y0 = new y5(this, 0L, 350L, erVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f50362p0 = tu0Var;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        this.f50364r0 = bitmapDecodeFile;
        if (bitmapDecodeFile != null) {
            this.f50367u0 = bitmapDecodeFile.getWidth() / bitmapDecodeFile.getHeight();
            rect.set(0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f50363q0 = textureView;
        addView(textureView, z5.c(-1.0f, -1));
        this.f50361o0 = new y5(this, 0L, 500L, erVar);
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
        if (!this.f50369w0) {
            return false;
        }
        if (view != this.f50363q0) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float fE = this.f50361o0.e(this.f50360n0);
        canvas.scale(1.0f - (fE * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
        canvas.skew(0.0f, org.telegram.messenger.y1.z(1.0f, fE, 4.0f * fE, 0.25f));
        float fE2 = this.f50371y0.e(this.f50370x0);
        float width = (view.getWidth() / 2.0f) + view.getX();
        float height = (view.getHeight() / 2.0f) + view.getY();
        float fMin = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        Rect rect2 = this.f50365s0;
        Rect rect3 = this.f50366t0;
        Bitmap bitmap2 = this.f50364r0;
        Path path2 = this.f50368v0;
        if (fE2 < 1.0f) {
            rect = rect3;
            bitmap = bitmap2;
            canvas.saveLayerAlpha(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight(), 128, 31);
            path2.rewind();
            path = path2;
            path.addCircle(width, height, fMin, Path.Direction.CW);
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
        path.addCircle(width, height, fMin * fE2, Path.Direction.CW);
        canvas.clipPath(path);
        if (bitmap != null) {
            rect.set(0, 0, view.getWidth(), view.getHeight());
            canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
        }
        boolean zDrawChild = ((getParent() instanceof d) && ((d) getParent()).f50372a) ? true : super.drawChild(canvas, view, j10);
        canvas.restore();
        canvas.restore();
        return zDrawChild;
    }

    public int getAnchor() {
        return this.m0;
    }

    public tu0 getBaseSize() {
        return this.f50362p0;
    }

    @Override
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float fDp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float fDp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float fT = rl.t(fDp, 2.0f, getPositionX(), scaleX);
        return new yj0(fT, rl.t(fDp2, 2.0f, getPositionY(), scaleX), ((fDp * scaleX) + fT) - fT, fDp2 * scaleX);
    }

    @Override
    public final void k() {
        tu0 tu0Var = this.f50362p0;
        float f10 = tu0Var.f32893a / 2.0f;
        float f11 = tu0Var.f32894b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.f50363q0;
        if (textureView != null) {
            int measuredHeight = ((i13 - i11) - textureView.getMeasuredHeight()) / 2;
            int measuredWidth = ((i12 - i10) - textureView.getMeasuredWidth()) / 2;
            textureView.layout(measuredWidth, measuredHeight, textureView.getMeasuredWidth() + measuredWidth, textureView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        tu0 tu0Var = this.f50362p0;
        int i12 = (int) tu0Var.f32893a;
        int i13 = (int) tu0Var.f32894b;
        TextureView textureView = this.f50363q0;
        if (textureView != null) {
            float f10 = this.f50367u0;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f10 >= 1.0f ? (int) (f10 * i13) : i12, 1073741824);
            float f11 = this.f50367u0;
            textureView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(f11 >= 1.0f ? i13 : (int) (i12 / f11), 1073741824));
        }
        setMeasuredDimension(i12, i13);
    }

    public void setDraw(boolean z10) {
        if (this.f50369w0 != z10) {
            this.f50369w0 = z10;
            invalidate();
        }
    }
}
