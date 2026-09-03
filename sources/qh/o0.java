package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.pr;
public final class o0 extends View {
    public final Paint f45826a;
    public final TextPaint f45827b;
    public final StaticLayout f45828c;
    public final float d;
    public final float f45829e;
    public final Path f45830f;
    public org.telegram.ui.web.s0 h;
    public boolean f45831n;
    public final org.telegram.ui.Components.z5 f45832r;

    public o0(Context context) {
        super(context);
        float f10;
        float f11;
        Paint paint = new Paint(1);
        this.f45826a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f45827b = textPaint;
        this.f45830f = new Path();
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(this);
        this.f45832r = z5Var;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(6.0f)));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(LocaleController.getString("StoryDraftSaved"), textPaint, AndroidUtilities.displaySize.x, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f45828c = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineWidth(0);
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        if (staticLayout.getLineCount() > 0) {
            f11 = staticLayout.getLineLeft(0);
        } else {
            f11 = 0.0f;
        }
        this.f45829e = f11;
        z5Var.d(0.0f, true);
    }

    public final void a(boolean z4) {
        org.telegram.ui.web.s0 s0Var;
        if (!z4 && (s0Var = this.h) != null) {
            AndroidUtilities.cancelRunOnUIThread(s0Var);
            this.h = null;
        }
        this.f45831n = z4;
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float e6 = this.f45832r.e(this.f45831n);
        if (e6 <= 0.0f) {
            return;
        }
        canvas.save();
        if (this.f45831n) {
            f10 = pr.f30172k.getInterpolation(e6);
        } else {
            f10 = 1.0f;
        }
        canvas.translate(0.0f, f10 * AndroidUtilities.dp(12.0f));
        float interpolation = pr.h.getInterpolation(e6);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float dp = AndroidUtilities.dp(22.0f) + this.d;
        float min = (measuredWidth / 2.0f) - Math.min(AndroidUtilities.dp(135.0f), 0.35f * measuredWidth);
        float max = Math.max(AndroidUtilities.dp(8.0f), min - (dp / 2.0f));
        Path path = this.f45830f;
        path.rewind();
        path.moveTo(max, 0.0f);
        float f11 = dp + max;
        path.lineTo(f11, 0.0f);
        path.lineTo(f11, measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(AndroidUtilities.dp(7.0f) + min, measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(AndroidUtilities.dp(1.0f) + min, measuredHeight - AndroidUtilities.dp(12.0f));
        path.lineTo(min - AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(12.0f));
        path.lineTo(min - AndroidUtilities.dp(7.0f), measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(max, measuredHeight - AndroidUtilities.dp(18.0f));
        path.close();
        Paint paint = this.f45826a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        StaticLayout staticLayout = this.f45828c;
        canvas.translate((max + AndroidUtilities.dp(11.0f)) - this.f45829e, ((measuredHeight - AndroidUtilities.dp(18.0f)) - staticLayout.getHeight()) / 2.0f);
        this.f45827b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f));
    }
}
