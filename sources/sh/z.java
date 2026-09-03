package sh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kw0;
public final class z extends View {
    public boolean B;
    public int C;
    public final RectF f47840a;
    public final Paint f47841b;
    public final TextPaint f47842c;
    public final w d;
    public final hj0 f47843e;
    public boolean f47844f;
    public float h;
    public String f47845n;
    public StaticLayout f47846r;
    public float f47847s;
    public boolean v;
    public boolean f47848w;
    public boolean f47849x;
    public final org.telegram.ui.Cells.z f47850y;

    public z(Context context) {
        super(context);
        this.f47840a = new RectF();
        Paint paint = new Paint(1);
        this.f47841b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f47842c = textPaint;
        w wVar = new w(this);
        this.d = wVar;
        hj0 hj0Var = new hj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f47843e = hj0Var;
        this.f47845n = LocaleController.getString(R.string.BotsMenuTitle);
        this.B = true;
        paint.setColor(k6.w0(null, k6.f21652cf, false));
        int w02 = k6.w0(null, k6.f21688ef, false);
        wVar.f21398k = w02;
        wVar.f21397j = w02;
        hj0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        wVar.f21401n = true;
        wVar.h = false;
        wVar.a(0.0f, false);
        wVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        wVar.f21390a.setStrokeCap(Paint.Cap.ROUND);
        wVar.f21399l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = k6.w0(null, k6.Qh, false);
        org.telegram.ui.Cells.z i02 = k6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f47850y = i02;
        i02.setCallback(this);
        hj0Var.setCallback(this);
        hj0Var.f27542s0 = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: sh.z.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f47850y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f47850y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.C != size || this.f47846r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f47842c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.C = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f47845n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c3 = kw0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f47846r = c3;
            if (c3.getLineCount() > 0) {
                f10 = this.f47846r.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f47847s = f10;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f47844f) {
            dp = org.telegram.messenger.y3.C(4.0f, (int) this.f47847s, dp);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z4) {
        this.B = z4;
        invalidate();
    }

    public void setOpened(boolean z4) {
        float f10;
        if (this.v != z4) {
            this.v = z4;
        }
        int i10 = 1;
        if (this.f47848w) {
            if (this.f47849x != z4) {
                hj0 hj0Var = this.f47843e;
                hj0Var.stop();
                hj0Var.h = true;
                if (z4) {
                    i10 = hj0Var.f27524e[0];
                }
                hj0Var.N(i10);
                hj0Var.start();
                this.f47849x = z4;
                return;
            }
            return;
        }
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d.a(f10, true);
    }

    public void setWebView(boolean z4) {
        this.f47848w = z4;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f47850y != drawable) {
            return false;
        }
        return true;
    }
}
