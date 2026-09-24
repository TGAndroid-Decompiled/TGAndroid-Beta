package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.pq;
import w7.a6;
public final class m3 extends TextView {
    public final pq f46278a;

    public m3(Context context, d6 d6Var) {
        super(context);
        int v02 = h6.v0(h6.f19430y8, d6Var);
        setTextColor(v02);
        setBackground(h6.Z(h6.l1(0.08f, v02), h6.l1(0.15f, v02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        a6.a(this);
        pq pqVar = new pq(R.drawable.arrows_select, 0);
        this.f46278a = pqVar;
        pqVar.spaceScaleX = 0.8f;
        pqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public void setSorting(u3 u3Var) {
        pq pqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (u3Var == u3.BY_DATE) {
            pqVar = new pq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (u3Var == u3.BY_PRICE) {
            pqVar = new pq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (u3Var == u3.BY_NUMBER) {
            pqVar = new pq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            pqVar = null;
        }
        if (pqVar != null) {
            pqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f46278a, append.length() - 1, length, 33);
        setText(append);
    }
}
