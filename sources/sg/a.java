package sg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public final class a extends LinearLayout {
    public a(Context context) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        TextView g10 = org.telegram.messenger.v0.g(context, 1, 14.0f);
        int i10 = k6.G6;
        r6.W(g10, i10, null);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setText(LocaleController.getString(R.string.AboutPremiumTitle));
        addView(g10);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        r6.W(textView, i10, null);
        org.telegram.messenger.v0.m(R.string.AboutPremiumDescription, textView);
        addView(textView, z5.p(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        r6.W(textView2, i10, null);
        org.telegram.messenger.v0.m(R.string.AboutPremiumDescription2, textView2);
        addView(textView2, z5.p(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
