package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.gr;
public final class o0 extends View {
    public final Paint f51601a;
    public final TextPaint f51602b;
    public final StaticLayout f51603c;
    public final float d;
    public final float e;
    public final Path f51604f;
    public d0 h;
    public boolean f51605n;
    public final org.telegram.ui.Components.t5 f51606r;

    public o0(Context context) {
        super(context);
        Point point;
        float f7;
        float f10;
        Paint paint = new Paint(1);
        this.f51601a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f51602b = textPaint;
        this.f51604f = new Path();
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(this);
        this.f51606r = t5Var;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(6.0f)));
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(dd.M0("StoryDraftSaved"), textPaint, point.x, TextUtils.TruncateAt.END), textPaint, org.telegram.messenger.i0.f16172q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f51603c = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineWidth(0);
        } else {
            f7 = 0.0f;
        }
        this.d = f7;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.e = f10;
        t5Var.e(true, 0.0f);
    }

    public final void a(boolean z10) {
        d0 d0Var;
        if (!z10 && (d0Var = this.h) != null) {
            org.telegram.messenger.i0.r(d0Var);
            this.h = null;
        }
        this.f51605n = z10;
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float d = this.f51606r.d(this.f51605n);
        if (d <= 0.0f) {
            return;
        }
        canvas.save();
        if (this.f51605n) {
            f7 = gr.f26527k.getInterpolation(d);
        } else {
            f7 = 1.0f;
        }
        canvas.translate(0.0f, f7 * org.telegram.messenger.i0.L(12.0f));
        float interpolation = gr.h.getInterpolation(d);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float L = org.telegram.messenger.i0.L(22.0f) + this.d;
        float min = (measuredWidth / 2.0f) - Math.min(org.telegram.messenger.i0.L(135.0f), 0.35f * measuredWidth);
        float max = Math.max(org.telegram.messenger.i0.L(8.0f), min - (L / 2.0f));
        Path path = this.f51604f;
        path.rewind();
        path.moveTo(max, 0.0f);
        float f10 = L + max;
        path.lineTo(f10, 0.0f);
        path.lineTo(f10, measuredHeight - org.telegram.messenger.i0.L(18.0f));
        path.lineTo(org.telegram.messenger.i0.L(7.0f) + min, measuredHeight - org.telegram.messenger.i0.L(18.0f));
        path.lineTo(org.telegram.messenger.i0.L(1.0f) + min, measuredHeight - org.telegram.messenger.i0.L(12.0f));
        path.lineTo(min - org.telegram.messenger.i0.L(1.0f), measuredHeight - org.telegram.messenger.i0.L(12.0f));
        path.lineTo(min - org.telegram.messenger.i0.L(7.0f), measuredHeight - org.telegram.messenger.i0.L(18.0f));
        path.lineTo(max, measuredHeight - org.telegram.messenger.i0.L(18.0f));
        path.close();
        Paint paint = this.f51601a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        StaticLayout staticLayout = this.f51603c;
        canvas.translate((max + org.telegram.messenger.i0.L(11.0f)) - this.e, ((measuredHeight - org.telegram.messenger.i0.L(18.0f)) - staticLayout.getHeight()) / 2.0f);
        this.f51602b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f));
    }
}
