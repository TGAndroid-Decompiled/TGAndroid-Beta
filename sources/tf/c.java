package tf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.TextView;
import h7.z5;
import java.text.SimpleDateFormat;
import java.util.Date;
import lh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;

public class c extends FrameLayout {

    public final TextView f48171a;

    public final TextView f48172b;

    public final TextView f48173c;
    public final TextView d;

    public boolean f48174e;

    public boolean f48175f;
    public final Drawable h;

    public final int f48176n;

    public final c6 f48177r;

    public c(Context context, c6 c6Var) {
        super(context);
        this.f48174e = true;
        new SimpleDateFormat("d MMM yyyy");
        this.f48177r = c6Var;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(14.0f);
        textPaint.setTypeface(AndroidUtilities.bold());
        int iMeasureText = (int) textPaint.measureText("00 MMM 0000 - 00 MMM 000");
        this.f48176n = iMeasureText;
        TextView textView = new TextView(context);
        this.f48171a = textView;
        pa.m(15.0f, 1, textView);
        addView(textView, z5.d(-2, -2.0f, 8388627, 16.0f, 0.0f, iMeasureText, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setGravity(8388627);
        addView(textView2, z5.d(-2, -2.0f, 8388627, 8.0f, 0.0f, 8.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f48172b = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(8388629);
        addView(textView3, z5.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.f48173c = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setGravity(8388629);
        addView(textView4, z5.d(-2, -2.0f, 8388629, 16.0f, 0.0f, 16.0f, 0.0f));
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.ZoomOut));
        Drawable drawable = getContext().getDrawable(R.drawable.msg_zoomout_stats);
        this.h = drawable;
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
        textView2.setBackground(g6.G0(AndroidUtilities.dp(3.0f), g6.v0(g6.Rh, c6Var)));
        textView4.addOnLayoutChangeListener(new x3(this, 1));
        a();
    }

    public final void a() {
        int i10 = g6.f23161j5;
        c6 c6Var = this.f48177r;
        this.f48171a.setTextColor(g6.v0(i10, c6Var));
        this.f48172b.setTextColor(g6.v0(i10, c6Var));
        this.f48173c.setTextColor(g6.v0(i10, c6Var));
        int i11 = g6.fj;
        this.d.setTextColor(g6.v0(i11, c6Var));
        this.h.setColorFilter(g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN);
    }

    public final void b(long j10, long j11) {
        String str;
        boolean z10 = this.f48174e;
        TextView textView = this.f48172b;
        if (!z10) {
            textView.setVisibility(8);
            this.f48173c.setVisibility(8);
            return;
        }
        if (this.f48175f) {
            j11 += 604800000;
        }
        if (j11 - j10 >= 86400000) {
            str = LocaleController.getInstance().getFormatterYear().format(new Date(j10)) + " — " + LocaleController.getInstance().getFormatterYear().format(new Date(j11));
        } else {
            str = LocaleController.getInstance().getFormatterYear().format(new Date(j10));
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    public final void c(boolean z10) {
        this.f48174e = z10;
        TextView textView = this.f48171a;
        if (z10) {
            textView.setLayoutParams(z5.d(-2, -2.0f, 8388627, 16.0f, 0.0f, this.f48176n, 0.0f));
            return;
        }
        this.f48173c.setVisibility(8);
        this.f48172b.setVisibility(8);
        textView.setLayoutParams(z5.d(-2, -2.0f, 8388627, 16.0f, 0.0f, 16.0f, 0.0f));
        textView.requestLayout();
    }

    public final void d(long j10, boolean z10) {
        b(j10, j10);
        TextView textView = this.d;
        textView.setVisibility(0);
        TextView textView2 = this.f48171a;
        if (!z10) {
            textView.setAlpha(1.0f);
            textView.setTranslationX(0.0f);
            textView.setTranslationY(0.0f);
            textView.setScaleX(1.0f);
            textView.setScaleY(1.0f);
            textView2.setAlpha(0.0f);
            return;
        }
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
    }

    public void setTitle(String str) {
        this.f48171a.setText(str);
    }

    public void setUseWeekInterval(boolean z10) {
        this.f48175f = z10;
    }
}
