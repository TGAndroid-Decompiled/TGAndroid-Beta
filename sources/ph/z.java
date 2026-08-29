package ph;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.xi0;
public final class z extends View {
    public boolean A;
    public int B;
    public final RectF f46179a;
    public final Paint f46180b;
    public final TextPaint f46181c;
    public final w d;
    public final xi0 f46182e;
    public boolean f46183f;
    public float h;
    public String f46184n;
    public StaticLayout f46185r;
    public float f46186s;
    public boolean v;
    public boolean f46187w;
    public boolean f46188x;
    public final org.telegram.ui.Cells.z f46189y;

    public z(Context context) {
        super(context);
        this.f46179a = new RectF();
        Paint paint = new Paint(1);
        this.f46180b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f46181c = textPaint;
        w wVar = new w(this);
        this.d = wVar;
        int i10 = R.raw.bot_webview_sheet_to_cross;
        xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(20.0f), String.valueOf(R.raw.bot_webview_sheet_to_cross) + hashCode(), AndroidUtilities.dp(20.0f));
        this.f46182e = xi0Var;
        this.f46184n = LocaleController.getString(R.string.BotsMenuTitle);
        this.A = true;
        paint.setColor(g6.w0(null, g6.f23053cf, false));
        int w02 = g6.w0(null, g6.f23089ef, false);
        wVar.f22825k = w02;
        wVar.f22824j = w02;
        xi0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        wVar.f22828n = true;
        wVar.h = false;
        wVar.a(0.0f, false);
        wVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        wVar.f22817a.setStrokeCap(Paint.Cap.ROUND);
        wVar.f22826l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = g6.w0(null, g6.Qh, false);
        org.telegram.ui.Cells.z i02 = g6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f46189y = i02;
        i02.setCallback(this);
        xi0Var.setCallback(this);
        xi0Var.f34753r0 = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ph.z.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f46189y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f46189y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.B != size || this.f46185r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f46181c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.B = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f46184n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c3 = bw0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f46185r = c3;
            if (c3.getLineCount() > 0) {
                f9 = this.f46185r.getLineWidth(0);
            } else {
                f9 = 0.0f;
            }
            this.f46186s = f9;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f46183f) {
            dp = org.telegram.messenger.x3.C(4.0f, (int) this.f46186s, dp);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.A = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        float f9;
        if (this.v != z10) {
            this.v = z10;
        }
        int i10 = 1;
        if (this.f46187w) {
            if (this.f46188x != z10) {
                xi0 xi0Var = this.f46182e;
                xi0Var.stop();
                xi0Var.h = true;
                if (z10) {
                    i10 = xi0Var.f34737e[0];
                }
                xi0Var.N(i10);
                xi0Var.start();
                this.f46188x = z10;
                return;
            }
            return;
        }
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.d.a(f9, true);
    }

    public void setWebView(boolean z10) {
        this.f46187w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f46189y != drawable) {
            return false;
        }
        return true;
    }
}
