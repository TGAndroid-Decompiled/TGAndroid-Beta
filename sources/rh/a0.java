package rh;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.kw0;
public final class a0 extends View {
    public boolean B;
    public int C;
    public final RectF f43450a;
    public final Paint f43451b;
    public final TextPaint f43452c;
    public final x d;
    public final gj0 e;
    public boolean f43453f;
    public float h;
    public String f43454n;
    public StaticLayout f43455r;
    public float f43456s;
    public boolean v;
    public boolean f43457w;
    public boolean f43458x;
    public final org.telegram.ui.Cells.z f43459y;

    public a0(Context context) {
        super(context);
        this.f43450a = new RectF();
        Paint paint = new Paint(1);
        this.f43451b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f43452c = textPaint;
        x xVar = new x(this);
        this.d = xVar;
        int i10 = R.raw.bot_webview_sheet_to_cross;
        gj0 gj0Var = new gj0(i10, AndroidUtilities.dp(20.0f), String.valueOf(R.raw.bot_webview_sheet_to_cross) + hashCode(), AndroidUtilities.dp(20.0f));
        this.e = gj0Var;
        this.f43454n = LocaleController.getString(R.string.BotsMenuTitle);
        this.B = true;
        paint.setColor(j6.w0(null, j6.f19897cf, false));
        int w02 = j6.w0(null, j6.f19932ef, false);
        xVar.f19691k = w02;
        xVar.f19690j = w02;
        gj0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        xVar.f19694n = true;
        xVar.h = false;
        xVar.a(0.0f, false);
        xVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        xVar.f19684a.setStrokeCap(Paint.Cap.ROUND);
        xVar.f19692l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = j6.w0(null, j6.Qh, false);
        org.telegram.ui.Cells.z i02 = j6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f43459y = i02;
        i02.setCallback(this);
        gj0Var.setCallback(this);
        gj0Var.f25170s0 = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: rh.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f43459y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f43459y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.C != size || this.f43455r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f43452c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.C = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f43454n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c3 = kw0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f43455r = c3;
            if (c3.getLineCount() > 0) {
                f10 = this.f43455r.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f43456s = f10;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f43453f) {
            dp = org.telegram.messenger.y3.C(4.0f, (int) this.f43456s, dp);
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
        if (this.f43457w) {
            if (this.f43458x != z4) {
                gj0 gj0Var = this.e;
                gj0Var.stop();
                gj0Var.h = true;
                if (z4) {
                    i10 = gj0Var.e[0];
                }
                gj0Var.N(i10);
                gj0Var.start();
                this.f43458x = z4;
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
        this.f43457w = z4;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f43459y != drawable) {
            return false;
        }
        return true;
    }
}
