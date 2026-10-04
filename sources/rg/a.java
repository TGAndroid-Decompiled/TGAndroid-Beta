package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import w7.z5;
public final class a extends LinearLayout {
    public a(Context context) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        TextView f7 = org.telegram.messenger.f0.f(context, 1, 14.0f);
        int i10 = i6.G6;
        f7.setTextColor(i6.w0(null, i10, false));
        f7.setTypeface(AndroidUtilities.bold());
        f7.setText(LocaleController.getString(R.string.AboutPremiumTitle));
        addView(f7);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(i6.w0(null, i10, false));
        org.telegram.messenger.f0.m(R.string.AboutPremiumDescription, textView);
        addView(textView, z5.p(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(i6.w0(null, i10, false));
        org.telegram.messenger.f0.m(R.string.AboutPremiumDescription2, textView2);
        addView(textView2, z5.p(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
