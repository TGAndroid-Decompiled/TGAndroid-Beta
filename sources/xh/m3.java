package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.oq;
import w7.b6;
public final class m3 extends TextView {
    public final oq f46312a;

    public m3(Context context, f6 f6Var) {
        super(context);
        int v02 = j6.v0(j6.f19479y8, f6Var);
        setTextColor(v02);
        setBackground(j6.Z(j6.l1(0.08f, v02), j6.l1(0.15f, v02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        b6.a(this);
        oq oqVar = new oq(R.drawable.arrows_select, 0);
        this.f46312a = oqVar;
        oqVar.spaceScaleX = 0.8f;
        oqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public void setSorting(u3 u3Var) {
        oq oqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (u3Var == u3.BY_DATE) {
            oqVar = new oq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (u3Var == u3.BY_PRICE) {
            oqVar = new oq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (u3Var == u3.BY_NUMBER) {
            oqVar = new oq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            oqVar = null;
        }
        if (oqVar != null) {
            oqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f46312a, append.length() - 1, length, 33);
        setText(append);
    }
}
