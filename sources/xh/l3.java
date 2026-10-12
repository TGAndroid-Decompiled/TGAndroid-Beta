package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gr;
import w7.y5;
public final class l3 extends TextView {
    public final gr f51569a;

    public l3(Context context, c6 c6Var) {
        super(context);
        int w02 = h6.w0(h6.f20947y8, c6Var);
        setTextColor(w02);
        setBackground(h6.a0(h6.m1(0.08f, w02), h6.m1(0.15f, w02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        y5.a(this);
        gr grVar = new gr(R.drawable.arrows_select, 0);
        this.f51569a = grVar;
        grVar.spaceScaleX = 0.8f;
        grVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public void setSorting(t3 t3Var) {
        gr grVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (t3Var == t3.BY_DATE) {
            grVar = new gr(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(grVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (t3Var == t3.BY_PRICE) {
            grVar = new gr(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(grVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (t3Var == t3.BY_NUMBER) {
            grVar = new gr(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(grVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            grVar = null;
        }
        if (grVar != null) {
            grVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f51569a, append.length() - 1, length, 33);
        setText(append);
    }
}
