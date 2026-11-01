package qh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import w7.b6;
public final class n extends FrameLayout {
    public final TextView f45708a;
    public final TextView f45709b;
    public final g0 f45710c;

    public n(g0 g0Var, Context context) {
        super(context);
        this.f45710c = g0Var;
        TextView textView = new TextView(context);
        this.f45708a = textView;
        textView.setTextColor(g0Var.f45739y);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        addView(textView, b6.d(-1, -1.0f, 51, 15.0f, 8.0f, 15.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f45709b = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setGravity(17);
        textView2.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        textView2.setText(dd.L0(2131743901, null));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(620756991);
        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(13.0f));
        textView2.setBackground(gradientDrawable);
        textView2.setOnClickListener(new ag.g(this, 29));
        addView(textView2, b6.d(-2, 26.0f, 21, 0.0f, 4.0f, 12.0f, 0.0f));
    }
}
