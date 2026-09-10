package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.xc;
public class w6 extends View {
    public boolean E;
    public long F;
    public final Path G;
    public final k5 H;
    public final org.telegram.ui.Components.d6 f49012a;
    public final TL_stories.MediaArea f49013b;
    public final Paint f49014c;
    public final Paint d;
    public LinearGradient e;
    public LinearGradient f49015f;
    public final Matrix h;
    public final org.telegram.ui.Cells.z f49016n;
    public final xc f49017r;
    public final boolean f49018s;
    public final boolean v;
    public final boolean f49019w;
    public final boolean f49020x;
    public final boolean f49021y;

    public w6(Context context, View view, TL_stories.MediaArea mediaArea) {
        super(context);
        boolean z10;
        boolean z11;
        boolean z12 = true;
        this.f49014c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = new Matrix();
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(1174405119, 2, -1);
        this.f49016n = f02;
        this.f49017r = new xc(this);
        this.f49018s = false;
        this.v = false;
        this.E = false;
        this.G = new Path();
        this.H = new k5(this, 7);
        this.f49013b = mediaArea;
        boolean z13 = mediaArea instanceof TL_stories.TL_mediaAreaGeoPoint;
        if (!z13 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && !(mediaArea instanceof TL_stories.TL_mediaAreaUrl)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f49018s = z10;
        if (!z13 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.v = z11;
        if (!z13 && !(mediaArea instanceof TL_stories.TL_mediaAreaVenue) && (mediaArea.coordinates.flags & 1) == 0) {
            z12 = false;
        }
        this.f49019w = z12;
        this.f49021y = z12;
        this.f49020x = z12;
        this.f49012a = new org.telegram.ui.Components.d6(view, 0L, 120L, new LinearInterpolator());
        paint.setStyle(Paint.Style.STROKE);
        f02.setCallback(this);
    }

    public final void b(Canvas canvas) {
        if (!this.f49021y) {
            return;
        }
        float innerRadius = getInnerRadius();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.G;
        path.rewind();
        path.addRoundRect(rectF, innerRadius, innerRadius, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.f49016n;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f49016n;
        xc xcVar = this.f49017r;
        if (action == 0) {
            if (getParent() instanceof View) {
                View view = (View) getParent();
                Objects.requireNonNull(view);
                xcVar.f29006f = new ru(1, view);
            }
            xcVar.c(true);
            zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            zVar.setState(new int[]{16842919, 16842910});
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            xcVar.c(false);
            zVar.setState(new int[0]);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public float getInnerRadius() {
        TL_stories.MediaArea mediaArea;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        if ((getParent() instanceof View) && (mediaArea = this.f49013b) != null && (mediaAreaCoordinates = mediaArea.coordinates) != null) {
            if ((mediaAreaCoordinates.flags & 1) != 0) {
                return (float) (((mediaAreaCoordinates.radius / 100.0d) * getWidth()) / getScaleX());
            }
            return getMeasuredHeight() * 0.2f;
        }
        return getMeasuredHeight() * 0.2f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float innerRadius = getInnerRadius();
        b(canvas);
        if (this.v && this.E && this.e != null) {
            float measuredWidth = getMeasuredWidth() * 0.7f;
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.F)) / 600.0f;
            float measuredWidth2 = ((getMeasuredWidth() + measuredWidth) * currentTimeMillis) - measuredWidth;
            if (currentTimeMillis >= 1.0f) {
                this.E = false;
                return;
            }
            Matrix matrix = this.h;
            matrix.reset();
            matrix.postScale(measuredWidth / 40.0f, 1.0f);
            matrix.postTranslate(measuredWidth2, 0.0f);
            this.e.setLocalMatrix(matrix);
            LinearGradient linearGradient = this.e;
            Paint paint = this.f49014c;
            paint.setShader(linearGradient);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, innerRadius, innerRadius, paint);
            this.f49015f.setLocalMatrix(matrix);
            LinearGradient linearGradient2 = this.f49015f;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient2);
            float dpf2 = AndroidUtilities.dpf2(1.5f);
            paint2.setStrokeWidth(dpf2);
            float f7 = dpf2 / 2.0f;
            rectF.inset(f7, f7);
            float f10 = innerRadius - f7;
            canvas.drawRoundRect(rectF, f10, f10, paint2);
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f49016n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void a(Canvas canvas) {
    }
}
