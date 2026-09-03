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
public final class z extends View {
    public boolean B;
    public int C;
    public final RectF f43934a;
    public final Paint f43935b;
    public final TextPaint f43936c;
    public final w d;
    public final gj0 e;
    public boolean f43937f;
    public float h;
    public String f43938n;
    public StaticLayout f43939r;
    public float f43940s;
    public boolean v;
    public boolean f43941w;
    public boolean f43942x;
    public final org.telegram.ui.Cells.z f43943y;

    public z(Context context) {
        super(context);
        this.f43934a = new RectF();
        Paint paint = new Paint(1);
        this.f43935b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f43936c = textPaint;
        w wVar = new w(this);
        this.d = wVar;
        gj0 gj0Var = new gj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = gj0Var;
        this.f43938n = LocaleController.getString(R.string.BotsMenuTitle);
        this.B = true;
        paint.setColor(j6.w0(null, j6.f19872cf, false));
        int w02 = j6.w0(null, j6.f19907ef, false);
        wVar.f19666k = w02;
        wVar.f19665j = w02;
        gj0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        wVar.f19669n = true;
        wVar.h = false;
        wVar.a(0.0f, false);
        wVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        wVar.f19659a.setStrokeCap(Paint.Cap.ROUND);
        wVar.f19667l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = j6.w0(null, j6.Qh, false);
        org.telegram.ui.Cells.z i02 = j6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f43943y = i02;
        i02.setCallback(this);
        gj0Var.setCallback(this);
        gj0Var.f25176s0 = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: rh.z.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f43943y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f43943y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.C != size || this.f43939r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f43936c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.C = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f43938n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c3 = kw0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f43939r = c3;
            if (c3.getLineCount() > 0) {
                f10 = this.f43939r.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f43940s = f10;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f43937f) {
            dp = org.telegram.messenger.y3.C(4.0f, (int) this.f43940s, dp);
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
        if (this.f43941w) {
            if (this.f43942x != z4) {
                gj0 gj0Var = this.e;
                gj0Var.stop();
                gj0Var.h = true;
                if (z4) {
                    i10 = gj0Var.e[0];
                }
                gj0Var.N(i10);
                gj0Var.start();
                this.f43942x = z4;
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
        this.f43941w = z4;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f43943y != drawable) {
            return false;
        }
        return true;
    }
}
