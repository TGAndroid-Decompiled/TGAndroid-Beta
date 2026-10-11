package zg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
public final class b extends ReplacementSpan {
    public final TextPaint f54593a;
    public final RectF f54594b;
    public StaticLayout f54595c;
    public float d;
    public float f54596e;
    public int f54597f;

    public b(d6 d6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f54593a = textPaint;
        this.f54594b = new RectF();
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(h6.w0(h6.C6, d6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f54595c == null) {
            String string = LocaleController.getString(R.string.ReactionAddReactionsHint);
            int i10 = AndroidUtilities.displaySize.x;
            if (LocaleController.isRTL) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(string, this.f54593a, i10, alignment, 1.0f, 0.0f, false);
            this.f54595c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f54596e = this.f54595c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        a();
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f54594b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f54597f, 31);
        canvas.translate(f7 + AndroidUtilities.dp(4.0f), (((i14 - i12) / 2.0f) + i12) - (this.f54596e / 2.0f));
        this.f54595c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(8.0f) + this.d);
    }
}
