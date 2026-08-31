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
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lw0;
public final class z extends View {
    public boolean B;
    public int C;
    public final RectF f47804a;
    public final Paint f47805b;
    public final TextPaint f47806c;
    public final w d;
    public final ij0 f47807e;
    public boolean f47808f;
    public float h;
    public String f47809n;
    public StaticLayout f47810r;
    public float f47811s;
    public boolean v;
    public boolean f47812w;
    public boolean f47813x;
    public final org.telegram.ui.Cells.z f47814y;

    public z(Context context) {
        super(context);
        this.f47804a = new RectF();
        Paint paint = new Paint(1);
        this.f47805b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f47806c = textPaint;
        w wVar = new w(this);
        this.d = wVar;
        int i10 = R.raw.bot_webview_sheet_to_cross;
        ij0 ij0Var = new ij0(i10, AndroidUtilities.dp(20.0f), String.valueOf(R.raw.bot_webview_sheet_to_cross) + hashCode(), AndroidUtilities.dp(20.0f));
        this.f47807e = ij0Var;
        this.f47809n = LocaleController.getString(R.string.BotsMenuTitle);
        this.B = true;
        paint.setColor(k6.w0(null, k6.f21650cf, false));
        int w02 = k6.w0(null, k6.f21686ef, false);
        wVar.f21396k = w02;
        wVar.f21395j = w02;
        ij0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        wVar.f21399n = true;
        wVar.h = false;
        wVar.a(0.0f, false);
        wVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        wVar.f21388a.setStrokeCap(Paint.Cap.ROUND);
        wVar.f21397l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = k6.w0(null, k6.Qh, false);
        org.telegram.ui.Cells.z i02 = k6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f47814y = i02;
        i02.setCallback(this);
        ij0Var.setCallback(this);
        ij0Var.f27835s0 = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: sh.z.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f47814y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f47814y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.C != size || this.f47810r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f47806c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.C = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f47809n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c3 = lw0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f47810r = c3;
            if (c3.getLineCount() > 0) {
                f10 = this.f47810r.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f47811s = f10;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f47808f) {
            dp = org.telegram.messenger.y3.C(4.0f, (int) this.f47811s, dp);
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
        if (this.f47812w) {
            if (this.f47813x != z4) {
                ij0 ij0Var = this.f47807e;
                ij0Var.stop();
                ij0Var.h = true;
                if (z4) {
                    i10 = ij0Var.f27817e[0];
                }
                ij0Var.N(i10);
                ij0Var.start();
                this.f47813x = z4;
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
        this.f47812w = z4;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f47814y != drawable) {
            return false;
        }
        return true;
    }
}
