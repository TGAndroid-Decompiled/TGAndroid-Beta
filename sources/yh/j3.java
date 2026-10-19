package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.yq;
import w7.b6;
public final class j3 extends TextView {
    public final yq f50327a;

    public j3(Context context, d6 d6Var) {
        super(context);
        int w02 = h6.w0(h6.f21377y8, d6Var);
        setTextColor(w02);
        setBackground(h6.a0(h6.m1(0.08f, w02), h6.m1(0.15f, w02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        b6.a(this);
        yq yqVar = new yq(R.drawable.arrows_select, 0);
        this.f50327a = yqVar;
        yqVar.spaceScaleX = 0.8f;
        yqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public void setSorting(r3 r3Var) {
        yq yqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (r3Var == r3.BY_DATE) {
            yqVar = new yq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (r3Var == r3.BY_PRICE) {
            yqVar = new yq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (r3Var == r3.BY_NUMBER) {
            yqVar = new yq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            yqVar = null;
        }
        if (yqVar != null) {
            yqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f50327a, append.length() - 1, length, 33);
        setText(append);
    }
}
