package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.gr;
public final class e4 extends View {
    public final Paint f51117a;
    public final Paint f51118b;
    public final StaticLayout f51119c;
    public final float d;
    public final float e;
    public final int f51120f;
    public final int h;
    public final boolean f51121n;
    public final org.telegram.ui.Components.t5 f51122r;
    public boolean f51123s;
    public float f51124w;
    public ValueAnimator f51125x;
    public final f4 f51126y;

    public e4(f4 f4Var, Context context, String str, boolean z10) {
        super(context);
        CharSequence upperCase;
        float f7;
        this.f51126y = f4Var;
        TextPaint textPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f51117a = paint;
        Paint paint2 = new Paint(1);
        this.f51118b = paint2;
        this.f51122r = new org.telegram.ui.Components.t5(this, 0L, 220L, gr.h);
        this.f51123s = true;
        this.f51121n = z10;
        paint.setColor(-15098625);
        paint2.setColor(1610612736);
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        if (z10) {
            SpannableString spannableString = new SpannableString(">");
            Drawable mutate = getResources().getDrawable(2131230875).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            mutate.setBounds(0, 0, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
            spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
            if (dd.X) {
                upperCase = new SpannableStringBuilder(spannableString).append((CharSequence) "\u2009").append((CharSequence) str.toUpperCase());
            } else {
                upperCase = new SpannableStringBuilder(str.toUpperCase()).append((CharSequence) "\u2009").append((CharSequence) spannableString);
            }
        } else {
            upperCase = str.toUpperCase();
        }
        StaticLayout staticLayout = new StaticLayout(upperCase, textPaint, org.telegram.messenger.i0.L(180.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f51119c = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineLeft(0);
        } else {
            f7 = 0.0f;
        }
        this.d = f7;
        float lineWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.e = lineWidth;
        int L = org.telegram.messenger.i0.L(48.0f) + ((int) lineWidth);
        this.f51120f = L;
        if (!z10) {
            this.f51120f = Math.max(org.telegram.messenger.i0.L(80.0f), L);
        }
        this.h = org.telegram.messenger.i0.L(40.0f);
        setOnClickListener(new rh.s(this, 21));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10 = 0.0f;
        if (isPressed()) {
            float f11 = this.f51124w;
            if (f11 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.i0.f16173r) / 80.0f) + f11;
                this.f51124w = min;
                this.f51124w = Utilities.i(min, 1.0f, 0.0f);
                invalidate();
            }
        }
        if (this.f51123s) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        float e = this.f51122r.e(false, f7);
        int saveCount = canvas.getSaveCount();
        if (e < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e * 255.0f), 31);
        }
        float f12 = ((1.0f - this.f51124w) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(f12, f12, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawRect(org.telegram.messenger.i0.L(25.0f), org.telegram.messenger.i0.L(4.0f), getWidth() - org.telegram.messenger.i0.L(25.0f), getHeight() - org.telegram.messenger.i0.L(4.0f), this.f51118b);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(4.0f), getWidth() - org.telegram.messenger.i0.L(10.0f), getHeight() - org.telegram.messenger.i0.L(4.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f), this.f51117a);
        canvas.save();
        float f13 = (this.f51120f - this.e) / 2.0f;
        if (this.f51121n) {
            f10 = 3.0f;
        }
        float L = (f13 + org.telegram.messenger.i0.L(f10)) - this.d;
        int height = getHeight();
        StaticLayout staticLayout = this.f51119c;
        canvas.translate(L, (height - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restoreToCount(saveCount);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f51120f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
    }

    @Override
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.f51125x) != null) {
                valueAnimator.removeAllListeners();
                this.f51125x.cancel();
            }
            if (!z10) {
                float f7 = this.f51124w;
                if (f7 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.f51125x = ofFloat;
                    ofFloat.addUpdateListener(new c4(1, this));
                    this.f51125x.addListener(new sg.r(this, 19));
                    a30.j(1.5f, this.f51125x);
                    this.f51125x.setDuration(350L);
                    this.f51125x.start();
                }
            }
        }
    }
}
