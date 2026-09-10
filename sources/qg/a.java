package qg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import w7.a6;
public final class a extends LinearLayout {
    public a(Context context) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        TextView g10 = org.telegram.messenger.a2.g(context, 1, 14.0f);
        int i10 = j6.G6;
        g10.setTextColor(j6.w0(null, i10, false));
        g10.setTypeface(AndroidUtilities.bold());
        g10.setText(LocaleController.getString(R.string.AboutPremiumTitle));
        addView(g10);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(j6.w0(null, i10, false));
        org.telegram.messenger.a2.n(R.string.AboutPremiumDescription, textView);
        addView(textView, a6.p(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(j6.w0(null, i10, false));
        org.telegram.messenger.a2.n(R.string.AboutPremiumDescription2, textView2);
        addView(textView2, a6.p(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
