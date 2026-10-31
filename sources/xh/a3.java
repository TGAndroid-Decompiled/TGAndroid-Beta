package xh;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
public final class a3 extends FrameLayout implements k6 {
    public Path f53688a;
    public float f53689b;
    public int f53690c;
    public boolean d;
    public int e;
    public int f53691f;
    public View h;
    public w f53692n;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.Rf));
        hashSet.add(Integer.valueOf(t6.Ci));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - org.telegram.messenger.i0.L(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f53691f) - org.telegram.messenger.i0.L(4.0f), getHeight()) * this.f53689b;
        float L = org.telegram.messenger.i0.L(16.0f) + max;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(org.telegram.messenger.i0.L(14.0f) - max, (org.telegram.messenger.i0.L(4.0f) + height) - max, org.telegram.messenger.i0.L(6.0f) + this.f53691f + max, (getHeight() - org.telegram.messenger.i0.L(12.0f)) + max);
        Path path = this.f53688a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.e);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.f53689b) / 0.5f)) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.i0.L(10.0f), height);
        w wVar = this.f53692n;
        if (wVar != null) {
            wVar.setDrawBackgroundDrawable(false);
            this.f53692n.draw(canvas);
            this.f53692n.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.f53689b) * (-org.telegram.messenger.i0.L(8.0f)), 0.0f);
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

    public void setBotMenuButton(w wVar) {
        this.f53692n = wVar;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i10) {
        this.f53691f = i10;
        invalidate();
    }

    public void setProgress(float f7) {
        this.f53689b = f7;
        this.e = i0.b.f(f7, t6.x0(null, t6.Rf, false), this.f53690c);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).setAlpha(f7);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d) {
                this.f53690c = t6.x0(null, t6.Ci, false);
            }
            if (this.e != 0) {
                this.e = i0.b.f(this.f53689b, t6.x0(null, t6.Rf, false), this.f53690c);
                invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
