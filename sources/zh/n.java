package zh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import w7.z5;
public final class n extends FrameLayout {
    public final TextView f51809a;
    public final TextView f51810b;
    public final d0 f51811c;

    public n(d0 d0Var, Context context) {
        super(context);
        this.f51811c = d0Var;
        TextView textView = new TextView(context);
        this.f51809a = textView;
        textView.setTextColor(d0Var.f51866x);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        addView(textView, z5.a(-1.0f, 15.0f, 8.0f, 15.0f, 0.0f, -1, 51));
        TextView textView2 = new TextView(context);
        this.f51810b = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(17);
        textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView2.setText(LocaleController.getString(R.string.Unlock));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(620756991);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(13.0f));
        textView2.setBackground(gradientDrawable);
        textView2.setOnClickListener(new hg.r0(this, 29));
        addView(textView2, z5.a(26.0f, 0.0f, 4.0f, 12.0f, 0.0f, -2, 21));
    }
}
