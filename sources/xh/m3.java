package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.er;
import w7.z5;
public final class m3 extends TextView {
    public final er f51374a;

    public m3(Context context, e6 e6Var) {
        super(context);
        int w02 = i6.w0(i6.f21183y8, e6Var);
        setTextColor(w02);
        setBackground(i6.a0(i6.m1(0.08f, w02), i6.m1(0.15f, w02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        z5.a(this);
        er erVar = new er(R.drawable.arrows_select, 0);
        this.f51374a = erVar;
        erVar.spaceScaleX = 0.8f;
        erVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public void setSorting(u3 u3Var) {
        er erVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (u3Var == u3.BY_DATE) {
            erVar = new er(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(erVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (u3Var == u3.BY_PRICE) {
            erVar = new er(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(erVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (u3Var == u3.BY_NUMBER) {
            erVar = new er(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(erVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            erVar = null;
        }
        if (erVar != null) {
            erVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f51374a, append.length() - 1, length, 33);
        setText(append);
    }
}
