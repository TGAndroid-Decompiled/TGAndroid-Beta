package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import w7.y5;
public final class a extends LinearLayout {
    public a(Context context) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        TextView f7 = org.telegram.messenger.f0.f(context, 1, 14.0f);
        int i10 = h6.G6;
        f7.setTextColor(h6.w0(null, i10, false));
        f7.setTypeface(AndroidUtilities.bold());
        f7.setText(LocaleController.getString(R.string.AboutPremiumTitle));
        addView(f7);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(h6.w0(null, i10, false));
        org.telegram.messenger.f0.m(R.string.AboutPremiumDescription, textView);
        addView(textView, y5.p(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(h6.w0(null, i10, false));
        org.telegram.messenger.f0.m(R.string.AboutPremiumDescription2, textView2);
        addView(textView2, y5.p(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
