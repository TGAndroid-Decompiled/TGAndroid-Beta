package sh;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
public final class e3 extends FrameLayout {
    public Path f47441a;
    public float f47442b;
    public int f47443c;
    public int d;
    public int f47444e;
    public z f47445f;

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - AndroidUtilities.dp(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f47444e) - AndroidUtilities.dp(4.0f), getHeight()) * this.f47442b;
        float dp = AndroidUtilities.dp(16.0f) + max;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(14.0f) - max, (AndroidUtilities.dp(4.0f) + height) - max, AndroidUtilities.dp(6.0f) + this.f47444e + max, (getHeight() - AndroidUtilities.dp(12.0f)) + max);
        Path path = this.f47441a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.d);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f47442b) / 0.5f)) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(10.0f), height);
        z zVar = this.f47445f;
        if (zVar != null) {
            zVar.setDrawBackgroundDrawable(false);
            this.f47445f.draw(canvas);
            this.f47445f.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f47442b) * (-AndroidUtilities.dp(8.0f)), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        if (getParent() instanceof View) {
            i12 = ((View) getParent()).getHeight();
        } else {
            i12 = 0;
        }
        if (i12 > 0) {
            size = Math.min(size, i12);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
    }

    public void setBotMenuButton(z zVar) {
        this.f47445f = zVar;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i10) {
        this.f47444e = i10;
        invalidate();
    }

    public void setProgress(float f10) {
        this.f47442b = f10;
        this.d = i0.a.d(f10, k6.w0(null, k6.f21652cf, false), this.f47443c);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).setAlpha(f10);
        }
        invalidate();
    }
}
