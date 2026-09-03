package qh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
public final class t1 extends s1 {
    public Drawable f46121i;
    public Drawable f46122j;
    public StaticLayout f46123k;
    public float f46124l;
    public float f46125m;
    public Paint f46126n;
    public final v1 f46127o;

    public t1(v1 v1Var, int i10, int i11, String str) {
        super(v1Var);
        this.f46127o = v1Var;
        this.f46088a = i10;
        Drawable mutate = v1Var.getContext().getResources().getDrawable(i11).mutate();
        this.f46121i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = v1Var.f46199b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f46123k = staticLayout;
        this.f46124l = staticLayout.getLineCount() > 0 ? this.f46123k.getLineWidth(0) : 0.0f;
        this.f46125m = this.f46123k.getLineCount() > 0 ? this.f46123k.getLineLeft(0) : 0.0f;
        this.f46089b = AndroidUtilities.dpf2(45.6f) + this.f46124l;
        this.f46090c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        RectF rectF = this.f46092f;
        rectF.set(f10, f11, this.f46089b + f10, this.f46090c + f11);
        float a2 = this.f46093g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f46127o.f46198a);
        if (this.f46122j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f46121i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f46121i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f46121i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.f46121i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.f46090c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.f46090c / 2.0f) + rectF.top + dp));
            this.f46121i.draw(canvas);
        }
        if (this.f46122j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f46090c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f46126n);
            this.f46122j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f46090c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f46090c) - AndroidUtilities.dp(5.0f)));
            this.f46122j.draw(canvas);
            canvas.restore();
        }
        float f12 = rectF.left;
        if (this.f46121i != null) {
            i10 = 28;
        }
        canvas.translate((f12 + AndroidUtilities.dp(i10 + 6)) - this.f46125m, ((this.f46090c / 2.0f) + rectF.top) - (this.f46123k.getHeight() / 2.0f));
        this.f46123k.draw(canvas);
        canvas.restore();
    }

    public t1(v1 v1Var, CharSequence charSequence) {
        super(v1Var);
        this.f46127o = v1Var;
        this.f46088a = 5;
        TextPaint textPaint = v1Var.f46199b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f46123k = staticLayout;
        this.f46124l = staticLayout.getLineCount() > 0 ? this.f46123k.getLineWidth(0) : 0.0f;
        this.f46125m = this.f46123k.getLineCount() > 0 ? this.f46123k.getLineLeft(0) : 0.0f;
        this.f46089b = AndroidUtilities.dpf2(12.0f) + this.f46124l;
        this.f46090c = AndroidUtilities.dpf2(36.0f);
    }
}
