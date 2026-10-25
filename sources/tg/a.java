package tg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class a extends LinearLayout {
    public a(Context context) {
        super(context);
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        TextView g7 = org.telegram.messenger.t.g(context, 1, 14.0f);
        int i10 = y6.G6;
        f7.V(g7, i10, null);
        g7.setTypeface(AndroidUtilities.bold());
        g7.setText(LocaleController.getString(R.string.AboutPremiumTitle));
        addView(g7);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        f7.V(textView, i10, null);
        org.telegram.messenger.t.n(R.string.AboutPremiumDescription, textView);
        addView(textView, gb1.t(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        f7.V(textView2, i10, null);
        org.telegram.messenger.t.n(R.string.AboutPremiumDescription2, textView2);
        addView(textView2, gb1.t(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
