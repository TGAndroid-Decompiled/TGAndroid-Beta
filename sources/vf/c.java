package vf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import java.text.SimpleDateFormat;
import java.util.Date;
import nh.u3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.th;
public class c extends FrameLayout {
    public final TextView f49548a;
    public final TextView f49549b;
    public final TextView f49550c;
    public final TextView d;
    public boolean f49551e;
    public boolean f49552f;
    public final Drawable h;
    public final int f49553n;
    public final c6 f49554r;

    public c(Context context, c6 c6Var) {
        super(context);
        this.f49551e = true;
        new SimpleDateFormat("d MMM yyyy");
        this.f49554r = c6Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(AndroidUtilities.bold());
        int measureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.f49553n = measureText;
        TextView textView = new TextView(context);
        this.f49548a = textView;
        th.n(15.0f, 1, textView);
        addView(textView, f6.d(-2, -2.0f, 8388627, 16.0f, 0.0f, measureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, f6.d(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f49549b = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(8388629);
        addView(textView3, f6.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f49550c = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setGravity(8388629);
        addView(textView4, f6.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.ZoomOut));
        Drawable drawable = getContext().getDrawable(R.drawable.msg_zoomout_stats);
        this.h = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
        textView2.setBackground(g6.G0(AndroidUtilities.dp(3.0f), g6.v0(g6.Rh, c6Var)));
        textView4.addOnLayoutChangeListener(new u3(this, 1));
        a();
    }

    public final void a() {
        int i10 = g6.f23169j5;
        c6 c6Var = this.f49554r;
        this.f49548a.setTextColor(g6.v0(i10, c6Var));
        this.f49549b.setTextColor(g6.v0(i10, c6Var));
        this.f49550c.setTextColor(g6.v0(i10, c6Var));
        int i11 = g6.fj;
        this.d.setTextColor(g6.v0(i11, c6Var));
        this.h.setColorFilter(g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN);
    }

    public final void b(long j10, long j11) {
        String format;
        boolean z10 = this.f49551e;
        TextView textView = this.f49549b;
        if (!z10) {
            textView.setVisibility(8);
            this.f49550c.setVisibility(8);
            return;
        }
        if (this.f49552f) {
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

    public final void c(boolean z10) {
        this.f49551e = z10;
        TextView textView = this.f49548a;
        if (!z10) {
            this.f49550c.setVisibility(8);
            this.f49549b.setVisibility(8);
            textView.setLayoutParams(f6.d(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
            textView.requestLayout();
            return;
        }
        textView.setLayoutParams(f6.d(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f49553n, 0.0f));
    }

    public final void d(long j10, boolean z10) {
        b(j10, j10);
        TextView textView = this.d;
        textView.setVisibility(0);
        TextView textView2 = this.f49548a;
        if (z10) {
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
        this.f49548a.setText(str);
    }

    public void setUseWeekInterval(boolean z10) {
        this.f49552f = z10;
    }
}
