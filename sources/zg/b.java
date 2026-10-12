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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public final class b extends ReplacementSpan {
    public final TextPaint f54704a;
    public final RectF f54705b;
    public StaticLayout f54706c;
    public float d;
    public float f54707e;
    public int f54708f;

    public b(c6 c6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f54704a = textPaint;
        this.f54705b = new RectF();
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(h6.w0(h6.C6, c6Var));
    }

    public final void a() {
        Layout.Alignment alignment;
        if (this.f54706c == null) {
            String string = LocaleController.getString(R.string.ReactionAddReactionsHint);
            int i10 = AndroidUtilities.displaySize.x;
            if (LocaleController.isRTL) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            StaticLayout staticLayout = new StaticLayout(string, this.f54704a, i10, alignment, 1.0f, 0.0f, false);
            this.f54706c = staticLayout;
            this.d = staticLayout.getLineWidth(0);
            this.f54707e = this.f54706c.getHeight();
        }
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        a();
        Rect clipBounds = canvas.getClipBounds();
        RectF rectF = this.f54705b;
        rectF.set(clipBounds);
        canvas.saveLayerAlpha(rectF, this.f54708f, 31);
        canvas.translate(f7 + AndroidUtilities.dp(4.0f), (((i14 - i12) / 2.0f) + i12) - (this.f54707e / 2.0f));
        this.f54706c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        a();
        return (int) (AndroidUtilities.dp(8.0f) + this.d);
    }
}
