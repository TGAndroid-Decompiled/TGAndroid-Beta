package qh;

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
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
public final class c5 extends View {
    public final Paint f45170a;
    public final Paint f45171b;
    public final StaticLayout f45172c;
    public final float d;
    public final float f45173e;
    public final int f45174f;
    public final int h;
    public final boolean f45175n;
    public final org.telegram.ui.Components.z5 f45176r;
    public boolean f45177s;
    public float v;
    public ValueAnimator f45178w;
    public final d5 f45179x;

    public c5(d5 d5Var, Context context, String str, boolean z4) {
        super(context);
        CharSequence upperCase;
        float f10;
        this.f45179x = d5Var;
        TextPaint textPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        this.f45170a = paint;
        Paint paint2 = new Paint(1);
        this.f45171b = paint2;
        this.f45176r = new org.telegram.ui.Components.z5(this, 0L, 220L, pr.h);
        this.f45177s = true;
        this.f45175n = z4;
        paint.setColor(-15098625);
        paint2.setColor(1610612736);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        if (z4) {
            SpannableString spannableString = new SpannableString(">");
            Drawable mutate = getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            mutate.setBounds(0, 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
            if (LocaleController.isRTL) {
                upperCase = new SpannableStringBuilder(spannableString).append((CharSequence) "\u2009").append((CharSequence) str.toUpperCase());
            } else {
                upperCase = new SpannableStringBuilder(str.toUpperCase()).append((CharSequence) "\u2009").append((CharSequence) spannableString);
            }
        } else {
            upperCase = str.toUpperCase();
        }
        StaticLayout staticLayout = new StaticLayout(upperCase, textPaint, AndroidUtilities.dp(180.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f45172c = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        float lineWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.f45173e = lineWidth;
        int dp = AndroidUtilities.dp(48.0f) + ((int) lineWidth);
        this.f45174f = dp;
        if (!z4) {
            this.f45174f = Math.max(AndroidUtilities.dp(80.0f), dp);
        }
        this.h = AndroidUtilities.dp(40.0f);
        setOnClickListener(new org.telegram.ui.Components.voip.o(this, 10));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11 = 0.0f;
        if (isPressed()) {
            float f12 = this.v;
            if (f12 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 80.0f) + f12;
                this.v = min;
                this.v = Utilities.clamp(min, 1.0f, 0.0f);
                invalidate();
            }
        }
        if (this.f45177s) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        float d = this.f45176r.d(f10, false);
        int saveCount = canvas.getSaveCount();
        if (d < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (d * 255.0f), 31);
        }
        float f13 = ((1.0f - this.v) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(f13, f13, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawRect(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(4.0f), getWidth() - AndroidUtilities.dp(25.0f), getHeight() - AndroidUtilities.dp(4.0f), this.f45171b);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), getWidth() - AndroidUtilities.dp(10.0f), getHeight() - AndroidUtilities.dp(4.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), this.f45170a);
        canvas.save();
        float f14 = (this.f45174f - this.f45173e) / 2.0f;
        if (this.f45175n) {
            f11 = 3.0f;
        }
        float dp = (f14 + AndroidUtilities.dp(f11)) - this.d;
        int height = getHeight();
        StaticLayout staticLayout = this.f45172c;
        canvas.translate(dp, (height - staticLayout.getHeight()) / 2.0f);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f45174f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.h, 1073741824));
    }

    @Override
    public final void setPressed(boolean z4) {
        ValueAnimator valueAnimator;
        if (isPressed() != z4) {
            super.setPressed(z4);
            invalidate();
            if (z4 && (valueAnimator = this.f45178w) != null) {
                valueAnimator.removeAllListeners();
                this.f45178w.cancel();
            }
            if (!z4) {
                float f10 = this.v;
                if (f10 != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                    this.f45178w = ofFloat;
                    ofFloat.addUpdateListener(new oh.f5(this, 19));
                    this.f45178w.addListener(new i2(this, 3));
                    this.f45178w.setInterpolator(new OvershootInterpolator(1.5f));
                    this.f45178w.setDuration(350L);
                    this.f45178w.start();
                }
            }
        }
    }
}
