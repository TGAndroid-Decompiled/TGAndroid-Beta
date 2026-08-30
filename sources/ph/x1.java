package ph;

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
    public final TextPaint f42531a;
    public final Paint f42532b;
    public StaticLayout f42533c;
    public float d;
    public float e;
    public StaticLayout f42534f;
    public float h;
    public float f42535n;
    public StaticLayout f42536r;
    public float f42537s;
    public float v;
    public final RectF f42538w;
    public final RectF f42539x;
    public final RectF f42540y;

    public x1(Context context) {
        super(context);
        this.f42531a = new TextPaint(1);
        this.f42532b = new Paint(1);
        this.f42538w = new RectF();
        this.f42539x = new RectF();
        this.f42540y = new RectF();
        this.B = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        canvas.drawColor(-14737633);
        Paint paint = this.f42532b;
        paint.setColor(-13224394);
        float f10 = this.C;
        int i10 = (int) f10;
        RectF rectF3 = this.f42540y;
        RectF rectF4 = this.f42539x;
        RectF rectF5 = this.f42538w;
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
        StaticLayout staticLayout = this.f42533c;
        TextPaint textPaint = this.f42531a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF5.left + AndroidUtilities.dp(12.0f)) - this.e, e2.c.x(rectF5.height(), this.f42533c.getHeight(), 2.0f, rectF5.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.C - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.f42533c.draw(canvas);
            canvas.restore();
        }
        if (this.f42534f != null) {
            canvas.save();
            canvas.translate((rectF4.left + AndroidUtilities.dp(12.0f)) - this.f42535n, e2.c.x(rectF4.height(), this.f42534f.getHeight(), 2.0f, rectF4.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.C - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f42534f.draw(canvas);
            canvas.restore();
        }
        if (this.f42536r != null) {
            canvas.save();
            canvas.translate((rectF3.left + AndroidUtilities.dp(12.0f)) - this.v, e2.c.x(rectF3.height(), this.f42536r.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.C - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.f42536r.draw(canvas);
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
        if (getMeasuredWidth() != this.E || this.f42533c == null) {
            TextPaint textPaint = this.f42531a;
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            String string = LocaleController.getString("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(string, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f42533c = staticLayout;
            float f15 = 0.0f;
            if (staticLayout.getLineCount() >= 1) {
                f10 = this.f42533c.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.d = f10;
            if (this.f42533c.getLineCount() >= 1) {
                f11 = this.f42533c.getLineLeft(0);
            } else {
                f11 = 0.0f;
            }
            this.e = f11;
            StaticLayout staticLayout2 = new StaticLayout(LocaleController.getString("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f42534f = staticLayout2;
            if (staticLayout2.getLineCount() >= 1) {
                f12 = this.f42534f.getLineWidth(0);
            } else {
                f12 = 0.0f;
            }
            this.h = f12;
            if (this.f42534f.getLineCount() >= 1) {
                f13 = this.f42534f.getLineLeft(0);
            } else {
                f13 = 0.0f;
            }
            this.f42535n = f13;
            StaticLayout staticLayout3 = new StaticLayout(LocaleController.getString(R.string.AccDescrGIFs), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f42536r = staticLayout3;
            if (staticLayout3.getLineCount() >= 1) {
                f14 = this.f42536r.getLineWidth(0);
            } else {
                f14 = 0.0f;
            }
            this.f42537s = f14;
            if (this.f42536r.getLineCount() >= 1) {
                f15 = this.f42536r.getLineLeft(0);
            }
            this.v = f15;
            float dp = AndroidUtilities.dp(14.0f) / 2.0f;
            float dp2 = AndroidUtilities.dp(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((AndroidUtilities.dp(12.0f) + this.d) + AndroidUtilities.dp(36.0f)) + this.h) + AndroidUtilities.dp(36.0f)) + this.f42537s) + AndroidUtilities.dp(12.0f))) / 2.0f;
            this.f42538w.set(measuredWidth2, dp, this.d + measuredWidth2 + AndroidUtilities.dp(24.0f), dp2);
            float dp3 = this.d + AndroidUtilities.dp(36.0f) + measuredWidth2;
            this.f42539x.set(dp3, dp, this.h + dp3 + AndroidUtilities.dp(24.0f), dp2);
            float dp4 = this.h + AndroidUtilities.dp(36.0f) + dp3;
            this.f42540y.set(dp4, dp, this.f42537s + dp4 + AndroidUtilities.dp(24.0f), dp2);
            AndroidUtilities.dp(36.0f);
        }
        this.E = getMeasuredWidth();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() == 1 && this.D != null) {
                if (this.f42538w.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.D.run(0);
                    return true;
                }
                if (this.f42539x.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.D.run(1);
                    return true;
                }
                if (this.f42540y.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.D.run(2);
                }
            } else {
                return super.onTouchEvent(motionEvent);
            }
        }
        return true;
    }
}
