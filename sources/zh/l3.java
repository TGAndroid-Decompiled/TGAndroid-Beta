package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.zq;
public final class l3 extends TextView {
    public final zq f53098a;

    public l3(Context context, u6 u6Var) {
        super(context);
        int i10 = y6.f23748y8;
        int w02 = y6.w0(i10, u6Var);
        f7.V(this, i10, u6Var);
        org.telegram.ui.Cells.y a02 = y6.a0(y6.o1(0.08f, w02), y6.o1(0.15f, w02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f));
        b7 L = f7.L(0.08f, i10);
        b7 L2 = f7.L(0.15f, i10);
        setBackground(a02);
        f7.k(this, a02, L, L2, u6Var);
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        gb1.b(this);
        zq zqVar = new zq(R.drawable.arrows_select, 0);
        this.f53098a = zqVar;
        zqVar.spaceScaleX = 0.8f;
        zqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public void setSorting(t3 t3Var) {
        zq zqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (t3Var == t3.BY_DATE) {
            zqVar = new zq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (t3Var == t3.BY_PRICE) {
            zqVar = new zq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (t3Var == t3.BY_NUMBER) {
            zqVar = new zq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            zqVar = null;
        }
        if (zqVar != null) {
            zqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f53098a, append.length() - 1, length, 33);
        setText(append);
    }
}
