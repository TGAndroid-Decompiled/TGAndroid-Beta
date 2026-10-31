package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
public final class t1 extends View {
    public final RectF D;
    public final RectF E;
    public float F;
    public v0 G;
    public int H;
    public final TextPaint f51951a;
    public final Paint f51952b;
    public StaticLayout f51953c;
    public float d;
    public float e;
    public StaticLayout f51954f;
    public float h;
    public float f51955n;
    public StaticLayout f51956r;
    public float f51957s;
    public float f51958w;
    public final RectF f51959x;
    public final RectF f51960y;

    public t1(Context context) {
        super(context);
        this.f51951a = new TextPaint(1);
        this.f51952b = new Paint(1);
        this.f51959x = new RectF();
        this.f51960y = new RectF();
        this.D = new RectF();
        this.E = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        canvas.drawColor(-14737633);
        Paint paint = this.f51952b;
        paint.setColor(-13224394);
        float f7 = this.F;
        int i10 = (int) f7;
        RectF rectF3 = this.D;
        RectF rectF4 = this.f51960y;
        RectF rectF5 = this.f51959x;
        if (i10 <= 0) {
            rectF = rectF5;
        } else if (i10 == 1) {
            rectF = rectF4;
        } else {
            rectF = rectF3;
        }
        int ceil = (int) Math.ceil(f7);
        if (ceil <= 0) {
            rectF2 = rectF5;
        } else if (ceil == 1) {
            rectF2 = rectF4;
        } else {
            rectF2 = rectF3;
        }
        float f10 = this.F;
        RectF rectF6 = this.E;
        org.telegram.messenger.i0.Z1(rectF, rectF2, f10 - ((int) f10), rectF6);
        canvas.drawRoundRect(rectF6, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f), paint);
        StaticLayout staticLayout = this.f51953c;
        TextPaint textPaint = this.f51951a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF5.left + org.telegram.messenger.i0.L(12.0f)) - this.e, c3.i0.B(rectF5.height(), this.f51953c.getHeight(), 2.0f, rectF5.top));
            textPaint.setColor(i0.b.f(Utilities.i(1.0f - Math.abs(this.F - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.f51953c.draw(canvas);
            canvas.restore();
        }
        if (this.f51954f != null) {
            canvas.save();
            canvas.translate((rectF4.left + org.telegram.messenger.i0.L(12.0f)) - this.f51955n, c3.i0.B(rectF4.height(), this.f51954f.getHeight(), 2.0f, rectF4.top));
            textPaint.setColor(i0.b.f(Utilities.i(1.0f - Math.abs(this.F - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f51954f.draw(canvas);
            canvas.restore();
        }
        if (this.f51956r != null) {
            canvas.save();
            canvas.translate((rectF3.left + org.telegram.messenger.i0.L(12.0f)) - this.f51958w, c3.i0.B(rectF3.height(), this.f51956r.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.b.f(Utilities.i(1.0f - Math.abs(this.F - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.f51956r.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(40.0f) + org.telegram.messenger.i0.f16021n);
        if (getMeasuredWidth() != this.H || this.f51953c == null) {
            TextPaint textPaint = this.f51951a;
            textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
            textPaint.setTypeface(org.telegram.messenger.i0.o());
            String M0 = cd.M0("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(M0, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f51953c = staticLayout;
            float f14 = 0.0f;
            if (staticLayout.getLineCount() >= 1) {
                f7 = this.f51953c.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.d = f7;
            if (this.f51953c.getLineCount() >= 1) {
                f10 = this.f51953c.getLineLeft(0);
            } else {
                f10 = 0.0f;
            }
            this.e = f10;
            StaticLayout staticLayout2 = new StaticLayout(cd.M0("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f51954f = staticLayout2;
            if (staticLayout2.getLineCount() >= 1) {
                f11 = this.f51954f.getLineWidth(0);
            } else {
                f11 = 0.0f;
            }
            this.h = f11;
            if (this.f51954f.getLineCount() >= 1) {
                f12 = this.f51954f.getLineLeft(0);
            } else {
                f12 = 0.0f;
            }
            this.f51955n = f12;
            StaticLayout staticLayout3 = new StaticLayout(cd.L0(2131754879, null), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f51956r = staticLayout3;
            if (staticLayout3.getLineCount() >= 1) {
                f13 = this.f51956r.getLineWidth(0);
            } else {
                f13 = 0.0f;
            }
            this.f51957s = f13;
            if (this.f51956r.getLineCount() >= 1) {
                f14 = this.f51956r.getLineLeft(0);
            }
            this.f51958w = f14;
            float L = org.telegram.messenger.i0.L(14.0f) / 2.0f;
            float L2 = org.telegram.messenger.i0.L(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((org.telegram.messenger.i0.L(12.0f) + this.d) + org.telegram.messenger.i0.L(36.0f)) + this.h) + org.telegram.messenger.i0.L(36.0f)) + this.f51957s) + org.telegram.messenger.i0.L(12.0f))) / 2.0f;
            this.f51959x.set(measuredWidth2, L, this.d + measuredWidth2 + org.telegram.messenger.i0.L(24.0f), L2);
            float L3 = this.d + org.telegram.messenger.i0.L(36.0f) + measuredWidth2;
            this.f51960y.set(L3, L, this.h + L3 + org.telegram.messenger.i0.L(24.0f), L2);
            float L4 = this.h + org.telegram.messenger.i0.L(36.0f) + L3;
            this.D.set(L4, L, this.f51957s + L4 + org.telegram.messenger.i0.L(24.0f), L2);
            org.telegram.messenger.i0.L(36.0f);
        }
        this.H = getMeasuredWidth();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() == 1 && this.G != null) {
                if (this.f51959x.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.G.a(0);
                    return true;
                }
                if (this.f51960y.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.G.a(1);
                    return true;
                }
                if (this.D.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.G.a(2);
                }
            } else {
                return super.onTouchEvent(motionEvent);
            }
        }
        return true;
    }
}
