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
import org.telegram.messenger.ok;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.uk0;
import w7.z5;
public final class b2 extends j {
    public boolean A0;
    public boolean B0;
    public final e6 C0;
    public final int f44977q0;
    public boolean f44978r0;
    public final e6 f44979s0;
    public final fw0 f44980t0;
    public final TextureView f44981u0;
    public final Bitmap f44982v0;
    public final Rect f44983w0;
    public final Rect f44984x0;
    public float f44985y0;
    public final Path f44986z0;

    public b2(Context context, PointF pointF, fw0 fw0Var, String str) {
        super(context, pointF);
        this.f44977q0 = -1;
        this.f44978r0 = false;
        Rect rect = new Rect();
        this.f44983w0 = rect;
        this.f44984x0 = new Rect();
        this.f44985y0 = 1.0f;
        this.f44986z0 = new Path();
        this.A0 = true;
        this.B0 = true;
        tr trVar = tr.h;
        this.C0 = new e6(this, 0L, 350L, trVar);
        new Paint(1).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        setRotation(0.0f);
        setScale(1.0f);
        this.f44980t0 = fw0Var;
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        this.f44982v0 = decodeFile;
        if (decodeFile != null) {
            this.f44985y0 = decodeFile.getWidth() / decodeFile.getHeight();
            rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        }
        TextureView textureView = new TextureView(context);
        this.f44981u0 = textureView;
        addView(textureView, z5.c(-1.0f, -1));
        this.f44979s0 = new e6(this, 0L, 500L, trVar);
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
        if (view == this.f44981u0) {
            canvas.save();
            float e7 = this.f44979s0.e(this.f44978r0);
            canvas.scale(1.0f - (e7 * 2.0f), 1.0f, getMeasuredWidth() / 2.0f, 0.0f);
            canvas.skew(0.0f, org.telegram.messenger.f0.z(1.0f, e7, 4.0f * e7, 0.25f));
            float e10 = this.C0.e(this.B0);
            float width = (view.getWidth() / 2.0f) + view.getX();
            float height = (view.getHeight() / 2.0f) + view.getY();
            float min = Math.min(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
            Rect rect2 = this.f44983w0;
            Rect rect3 = this.f44984x0;
            Bitmap bitmap2 = this.f44982v0;
            Path path2 = this.f44986z0;
            if (e10 < 1.0f) {
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
            path.addCircle(width, height, min * e10, Path.Direction.CW);
            canvas.clipPath(path);
            if (bitmap != null) {
                rect.set(0, 0, view.getWidth(), view.getHeight());
                canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
            }
            if ((getParent() instanceof d) && ((d) getParent()).f44994a) {
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
        return this.f44977q0;
    }

    public fw0 getBaseSize() {
        return this.f44980t0;
    }

    @Override
    public uk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = ok.x(dp, 2.0f, getPositionX(), scaleX);
        return new uk0(x10, ok.x(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + x10) - x10, dp2 * scaleX);
    }

    @Override
    public final void k() {
        fw0 fw0Var = this.f44980t0;
        setX(getPositionX() - (fw0Var.f26585a / 2.0f));
        setY(getPositionY() - (fw0Var.f26586b / 2.0f));
        m();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextureView textureView = this.f44981u0;
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
        fw0 fw0Var = this.f44980t0;
        int i14 = (int) fw0Var.f26585a;
        int i15 = (int) fw0Var.f26586b;
        TextureView textureView = this.f44981u0;
        if (textureView != null) {
            float f7 = this.f44985y0;
            if (f7 >= 1.0f) {
                i12 = (int) (f7 * i15);
            } else {
                i12 = i14;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            float f10 = this.f44985y0;
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
