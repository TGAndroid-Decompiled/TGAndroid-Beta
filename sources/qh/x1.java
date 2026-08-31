package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class x1 extends View {
    public final RectF B;
    public float C;
    public w0 D;
    public int E;
    public final TextPaint f46258a;
    public final Paint f46259b;
    public StaticLayout f46260c;
    public float d;
    public float f46261e;
    public StaticLayout f46262f;
    public float h;
    public float f46263n;
    public StaticLayout f46264r;
    public float f46265s;
    public float v;
    public final RectF f46266w;
    public final RectF f46267x;
    public final RectF f46268y;

    public x1(Context context) {
        super(context);
        this.f46258a = new TextPaint(1);
        this.f46259b = new Paint(1);
        this.f46266w = new RectF();
        this.f46267x = new RectF();
        this.f46268y = new RectF();
        this.B = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        canvas.drawColor(-14737633);
        Paint paint = this.f46259b;
        paint.setColor(-13224394);
        float f10 = this.C;
        int i10 = (int) f10;
        RectF rectF3 = this.f46268y;
        RectF rectF4 = this.f46267x;
        RectF rectF5 = this.f46266w;
        if (i10 <= 0) {
            rectF = rectF5;
        } else if (i10 == 1) {
            rectF = rectF4;
        } else {
            rectF = rectF3;
        }
        int ceil = (int) Math.ceil(f10);
        if (ceil <= 0) {
            rectF2 = rectF5;
        } else if (ceil == 1) {
            rectF2 = rectF4;
        } else {
            rectF2 = rectF3;
        }
        float f11 = this.C;
        RectF rectF6 = this.B;
        AndroidUtilities.lerp(rectF, rectF2, f11 - ((int) f11), rectF6);
        canvas.drawRoundRect(rectF6, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        StaticLayout staticLayout = this.f46260c;
        TextPaint textPaint = this.f46258a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF5.left + AndroidUtilities.dp(12.0f)) - this.f46261e, e2.c.x(rectF5.height(), this.f46260c.getHeight(), 2.0f, rectF5.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.C - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.f46260c.draw(canvas);
            canvas.restore();
        }
        if (this.f46262f != null) {
            canvas.save();
            canvas.translate((rectF4.left + AndroidUtilities.dp(12.0f)) - this.f46263n, e2.c.x(rectF4.height(), this.f46262f.getHeight(), 2.0f, rectF4.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.C - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f46262f.draw(canvas);
            canvas.restore();
        }
        if (this.f46264r != null) {
            canvas.save();
            canvas.translate((rectF3.left + AndroidUtilities.dp(12.0f)) - this.v, e2.c.x(rectF3.height(), this.f46264r.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.C - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.f46264r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(40.0f) + AndroidUtilities.navigationBarHeight);
        if (getMeasuredWidth() != this.E || this.f46260c == null) {
            TextPaint textPaint = this.f46258a;
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            String string = LocaleController.getString("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(string, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f46260c = staticLayout;
            float f15 = 0.0f;
            if (staticLayout.getLineCount() >= 1) {
                f10 = this.f46260c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f46260c.getLineCount() >= 1) {
                f11 = this.f46260c.getLineLeft(0);
            } else {
                f11 = 0.0f;
            }
            this.f46261e = f11;
            StaticLayout staticLayout2 = new StaticLayout(LocaleController.getString("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f46262f = staticLayout2;
            if (staticLayout2.getLineCount() >= 1) {
                f12 = this.f46262f.getLineWidth(0);
            } else {
                f12 = 0.0f;
            }
            this.h = f12;
            if (this.f46262f.getLineCount() >= 1) {
                f13 = this.f46262f.getLineLeft(0);
            } else {
                f13 = 0.0f;
            }
            this.f46263n = f13;
            StaticLayout staticLayout3 = new StaticLayout(LocaleController.getString(R.string.AccDescrGIFs), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f46264r = staticLayout3;
            if (staticLayout3.getLineCount() >= 1) {
                f14 = this.f46264r.getLineWidth(0);
            } else {
                f14 = 0.0f;
            }
            this.f46265s = f14;
            if (this.f46264r.getLineCount() >= 1) {
                f15 = this.f46264r.getLineLeft(0);
            }
            this.v = f15;
            float dp = AndroidUtilities.dp(14.0f) / 2.0f;
            float dp2 = AndroidUtilities.dp(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((AndroidUtilities.dp(12.0f) + this.d) + AndroidUtilities.dp(36.0f)) + this.h) + AndroidUtilities.dp(36.0f)) + this.f46265s) + AndroidUtilities.dp(12.0f))) / 2.0f;
            this.f46266w.set(measuredWidth2, dp, this.d + measuredWidth2 + AndroidUtilities.dp(24.0f), dp2);
            float dp3 = this.d + AndroidUtilities.dp(36.0f) + measuredWidth2;
            this.f46267x.set(dp3, dp, this.h + dp3 + AndroidUtilities.dp(24.0f), dp2);
            float dp4 = this.h + AndroidUtilities.dp(36.0f) + dp3;
            this.f46268y.set(dp4, dp, this.f46265s + dp4 + AndroidUtilities.dp(24.0f), dp2);
            AndroidUtilities.dp(36.0f);
        }
        this.E = getMeasuredWidth();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() == 1 && this.D != null) {
                if (this.f46266w.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.D.run(0);
                    return true;
                }
                if (this.f46267x.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.D.run(1);
                    return true;
                }
                if (this.f46268y.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.D.run(2);
                }
            } else {
                return super.onTouchEvent(motionEvent);
            }
        }
        return true;
    }
}
