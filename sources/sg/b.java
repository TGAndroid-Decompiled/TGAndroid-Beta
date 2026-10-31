package sg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public final class b extends ReplacementSpan {
    public final TextPaint f48271a;
    public final RectF f48272b;
    public StaticLayout f48273c;
    public float d;
    public float e;
    public int f48274f;
    public final p6 h;

    public b(p6 p6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f48271a = textPaint;
        this.f48272b = new RectF();
        this.h = p6Var;
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint.setColor(t6.w0(t6.C6, p6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f48273c == null) {
            String L0 = cd.L0(2131746423, null);
            int i10 = org.telegram.messenger.i0.f16026q.x;
            if (cd.X) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(L0, this.f48271a, i10, alignment, 1.0f, 0.0f, false);
            this.f48273c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.e = this.f48273c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        a();
        this.f48271a.setColor(t6.w0(t6.C6, this.h));
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f48272b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f48274f, 31);
        canvas.translate(f7 + org.telegram.messenger.i0.L(4.0f), (((i14 - i12) / 2.0f) + i12) - (this.e / 2.0f));
        this.f48273c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (org.telegram.messenger.i0.L(8.0f) + this.d);
    }
}
