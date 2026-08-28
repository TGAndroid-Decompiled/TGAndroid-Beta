package zf;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
public final class a extends LinearLayout {
    public a(Context context) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        TextView g10 = org.telegram.messenger.l0.g(context, 1, 14.0f);
        int i9 = f6.G6;
        g10.setTextColor(f6.w0(null, i9, false));
        g10.setTypeface(AndroidUtilities.bold());
        g10.setText(LocaleController.getString(R.string.AboutPremiumTitle));
        addView(g10);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(f6.w0(null, i9, false));
        org.telegram.messenger.l0.m(R.string.AboutPremiumDescription, textView);
        addView(textView, e6.p(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(f6.w0(null, i9, false));
        org.telegram.messenger.l0.m(R.string.AboutPremiumDescription2, textView2);
        addView(textView2, e6.p(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
