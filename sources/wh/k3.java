package wh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.uq;
import w7.c6;
public final class k3 extends TextView {
    public final uq f44175a;

    public k3(Context context, f6 f6Var) {
        super(context);
        int v02 = j6.v0(j6.f18308y8, f6Var);
        setTextColor(v02);
        setBackground(j6.Z(j6.l1(0.08f, v02), j6.l1(0.15f, v02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        c6.a(this);
        uq uqVar = new uq(R.drawable.arrows_select, 0);
        this.f44175a = uqVar;
        uqVar.spaceScaleX = 0.8f;
        uqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public void setSorting(t3 t3Var) {
        uq uqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (t3Var == t3.BY_DATE) {
            uqVar = new uq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (t3Var == t3.BY_PRICE) {
            uqVar = new uq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (t3Var == t3.BY_NUMBER) {
            uqVar = new uq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            uqVar = null;
        }
        if (uqVar != null) {
            uqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f44175a, append.length() - 1, length, 33);
        setText(append);
    }
}
