package sh;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
public final class e3 extends FrameLayout {
    public Path f47405a;
    public float f47406b;
    public int f47407c;
    public int d;
    public int f47408e;
    public z f47409f;

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - AndroidUtilities.dp(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f47408e) - AndroidUtilities.dp(4.0f), getHeight()) * this.f47406b;
        float dp = AndroidUtilities.dp(16.0f) + max;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(14.0f) - max, (AndroidUtilities.dp(4.0f) + height) - max, AndroidUtilities.dp(6.0f) + this.f47408e + max, (getHeight() - AndroidUtilities.dp(12.0f)) + max);
        Path path = this.f47405a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.d);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f47406b) / 0.5f)) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(10.0f), height);
        z zVar = this.f47409f;
        if (zVar != null) {
            zVar.setDrawBackgroundDrawable(false);
            this.f47409f.draw(canvas);
            this.f47409f.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f47406b) * (-AndroidUtilities.dp(8.0f)), 0.0f);
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
        this.f47409f = zVar;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i10) {
        this.f47408e = i10;
        invalidate();
    }

    public void setProgress(float f10) {
        this.f47406b = f10;
        this.d = i0.a.d(f10, k6.w0(null, k6.f21650cf, false), this.f47407c);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).setAlpha(f10);
        }
        invalidate();
    }
}
