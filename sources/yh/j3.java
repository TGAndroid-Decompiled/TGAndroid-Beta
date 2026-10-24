package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.vq;
import w7.b6;
public final class j3 extends TextView {
    public final vq f50787a;

    public j3(Context context, g6 g6Var) {
        super(context);
        int i10 = k6.f21574y8;
        int w02 = k6.w0(i10, g6Var);
        r6.W(this, i10, g6Var);
        org.telegram.ui.Cells.y a02 = k6.a0(k6.o1(0.08f, w02), k6.o1(0.15f, w02), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f));
        n6 M = r6.M(0.08f, i10);
        n6 M2 = r6.M(0.15f, i10);
        setBackground(a02);
        r6.k(this, a02, M, M2, g6Var);
        setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        setGravity(17);
        setTypeface(AndroidUtilities.bold());
        b6.a(this);
        vq vqVar = new vq(R.drawable.arrows_select, 0);
        this.f50787a = vqVar;
        vqVar.spaceScaleX = 0.8f;
        vqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public void setSorting(r3 r3Var) {
        vq vqVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
        if (r3Var == r3.BY_DATE) {
            vqVar = new vq(R.drawable.mini_gift_sorting_date, 0);
            spannableStringBuilder.setSpan(vqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
        } else if (r3Var == r3.BY_PRICE) {
            vqVar = new vq(R.drawable.mini_gift_sorting_price, 0);
            spannableStringBuilder.setSpan(vqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
        } else if (r3Var == r3.BY_NUMBER) {
            vqVar = new vq(R.drawable.mini_gift_sorting_num, 0);
            spannableStringBuilder.setSpan(vqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
        } else {
            vqVar = null;
        }
        if (vqVar != null) {
            vqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
        }
        setText(spannableStringBuilder);
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f50787a, append.length() - 1, length, 33);
        setText(append);
    }
}
