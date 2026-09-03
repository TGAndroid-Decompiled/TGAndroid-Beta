package yf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.yh;
import qh.f3;
public class c extends FrameLayout {
    public final TextView f50934a;
    public final TextView f50935b;
    public final TextView f50936c;
    public final TextView d;
    public boolean f50937e;
    public boolean f50938f;
    public final Drawable h;
    public final int f50939n;
    public final g6 f50940r;

    public c(Context context, g6 g6Var) {
        super(context);
        this.f50937e = true;
        new SimpleDateFormat("d MMM yyyy");
        this.f50940r = g6Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(AndroidUtilities.bold());
        int measureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.f50939n = measureText;
        TextView textView = new TextView(context);
        this.f50934a = textView;
        yh.p(15.0f, 1, textView);
        addView(textView, c6.d(-2, -2.0f, 8388627, 16.0f, 0.0f, measureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, c6.d(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f50935b = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(8388629);
        addView(textView3, c6.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f50936c = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setGravity(8388629);
        addView(textView4, c6.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.ZoomOut));
        Drawable drawable = getContext().getDrawable(R.drawable.msg_zoomout_stats);
        this.h = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
        textView2.setBackground(k6.G0(AndroidUtilities.dp(3.0f), k6.v0(k6.Rh, g6Var)));
        textView4.addOnLayoutChangeListener(new f3(this, 1));
        a();
    }

    public final void a() {
        int i10 = k6.f21768j5;
        g6 g6Var = this.f50940r;
        this.f50934a.setTextColor(k6.v0(i10, g6Var));
        this.f50935b.setTextColor(k6.v0(i10, g6Var));
        this.f50936c.setTextColor(k6.v0(i10, g6Var));
        int i11 = k6.fj;
        this.d.setTextColor(k6.v0(i11, g6Var));
        this.h.setColorFilter(k6.v0(i11, g6Var), PorterDuff.Mode.SRC_IN);
    }

    public final void b(long j10, long j11) {
        String format;
        boolean z4 = this.f50937e;
        TextView textView = this.f50935b;
        if (!z4) {
            textView.setVisibility(8);
            this.f50936c.setVisibility(8);
            return;
        }
        if (this.f50938f) {
            j11 += 604800000;
        }
        if (j11 - j10 >= 86400000) {
            format = LocaleController.getInstance().getFormatterYear().format(new Date(j10)) + " — " + LocaleController.getInstance().getFormatterYear().format(new Date(j11));
        } else {
            format = LocaleController.getInstance().getFormatterYear().format(new Date(j10));
        }
        textView.setText(format);
        textView.setVisibility(0);
    }

    public final void c(boolean z4) {
        this.f50937e = z4;
        TextView textView = this.f50934a;
        if (!z4) {
            this.f50936c.setVisibility(8);
            this.f50935b.setVisibility(8);
            textView.setLayoutParams(c6.d(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
            textView.requestLayout();
            return;
        }
        textView.setLayoutParams(c6.d(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f50939n, 0.0f));
    }

    public final void d(long j10, boolean z4) {
        b(j10, j10);
        TextView textView = this.d;
        textView.setVisibility(0);
        TextView textView2 = this.f50934a;
        if (z4) {
            textView.setAlpha(0.0f);
            textView.setScaleX(0.3f);
            textView.setScaleY(0.3f);
            textView.setPivotX(0.0f);
            textView.setPivotY(AndroidUtilities.dp(40.0f));
            textView.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).start();
            textView2.setAlpha(1.0f);
            textView2.setTranslationX(0.0f);
            textView2.setTranslationY(0.0f);
            textView2.setScaleX(1.0f);
            textView2.setScaleY(1.0f);
            textView2.setPivotX(0.0f);
            textView2.setPivotY(0.0f);
            textView2.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
            return;
        }
        textView.setAlpha(1.0f);
        textView.setTranslationX(0.0f);
        textView.setTranslationY(0.0f);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView2.setAlpha(0.0f);
    }

    public void setTitle(String str) {
        this.f50934a.setText(str);
    }

    public void setUseWeekInterval(boolean z4) {
        this.f50938f = z4;
    }
}
