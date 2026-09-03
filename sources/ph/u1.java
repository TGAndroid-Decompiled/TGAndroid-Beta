package ph;

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
public final class u1 extends t1 {
    public Drawable f42462i;
    public Drawable f42463j;
    public StaticLayout f42464k;
    public float f42465l;
    public float f42466m;
    public Paint f42467n;
    public final w1 f42468o;

    public u1(w1 w1Var, int i10, int i11, String str) {
        super(w1Var);
        this.f42468o = w1Var;
        this.f42388a = i10;
        Drawable mutate = w1Var.getContext().getResources().getDrawable(i11).mutate();
        this.f42462i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = w1Var.f42530b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f42464k = staticLayout;
        this.f42465l = staticLayout.getLineCount() > 0 ? this.f42464k.getLineWidth(0) : 0.0f;
        this.f42466m = this.f42464k.getLineCount() > 0 ? this.f42464k.getLineLeft(0) : 0.0f;
        this.f42389b = AndroidUtilities.dpf2(45.6f) + this.f42465l;
        this.f42390c = AndroidUtilities.dpf2(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        RectF rectF = this.f42391f;
        rectF.set(f10, f11, this.f42389b + f10, this.f42390c + f11);
        float a2 = this.f42392g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f42468o.f42529a);
        if (this.f42463j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f42462i == null) {
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(null);
            this.f42462i = emojiBigDrawable;
            if (emojiBigDrawable instanceof Emoji.EmojiDrawable) {
                ((Emoji.EmojiDrawable) emojiBigDrawable).fullSize = false;
            }
        }
        if (this.f42462i != null) {
            float dp = AndroidUtilities.dp(24.0f) / 2;
            this.f42462i.setBounds((int) ((rectF.left + AndroidUtilities.dp(18.0f)) - dp), (int) (((this.f42390c / 2.0f) + rectF.top) - dp), (int) (rectF.left + AndroidUtilities.dp(18.0f) + dp), (int) ((this.f42390c / 2.0f) + rectF.top + dp));
            this.f42462i.draw(canvas);
        }
        if (this.f42463j != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(rectF.left + AndroidUtilities.dp(18.55f), ((rectF.top + this.f42390c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.55f), rectF.left + AndroidUtilities.dp(29.45f), rectF.left + AndroidUtilities.dp(31.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.f42467n);
            this.f42463j.setBounds((int) (rectF.left + AndroidUtilities.dp(18.0f)), (int) (((rectF.top + this.f42390c) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(12.0f)), (int) (rectF.left + AndroidUtilities.dp(30.0f)), (int) ((rectF.top + this.f42390c) - AndroidUtilities.dp(5.0f)));
            this.f42463j.draw(canvas);
            canvas.restore();
        }
        float f12 = rectF.left;
        if (this.f42462i != null) {
            i10 = 28;
        }
        canvas.translate((f12 + AndroidUtilities.dp(i10 + 6)) - this.f42466m, ((this.f42390c / 2.0f) + rectF.top) - (this.f42464k.getHeight() / 2.0f));
        this.f42464k.draw(canvas);
        canvas.restore();
    }

    public u1(w1 w1Var, CharSequence charSequence) {
        super(w1Var);
        this.f42468o = w1Var;
        this.f42388a = 5;
        TextPaint textPaint = w1Var.f42530b;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f42464k = staticLayout;
        this.f42465l = staticLayout.getLineCount() > 0 ? this.f42464k.getLineWidth(0) : 0.0f;
        this.f42466m = this.f42464k.getLineCount() > 0 ? this.f42464k.getLineLeft(0) : 0.0f;
        this.f42389b = AndroidUtilities.dpf2(12.0f) + this.f42465l;
        this.f42390c = AndroidUtilities.dpf2(36.0f);
    }
}
