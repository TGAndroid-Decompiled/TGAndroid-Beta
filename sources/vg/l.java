package vg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.h2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.uu;
import w7.w5;
public final class l extends LinearLayout {
    public final uu f49828a;
    public final TextView f49829b;
    public k f49830c;

    public l(Context context, c6 c6Var) {
        super(context);
        setOrientation(0);
        uu uuVar = new uu(context, c6Var);
        this.f49828a = uuVar;
        uuVar.setLines(1);
        uuVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        uuVar.setInputType(16384);
        uuVar.setFilters(inputFilterArr);
        uuVar.setTextSize(1, 16.0f);
        uuVar.setTextColor(h6.w0(h6.Ud, c6Var));
        uuVar.setLinkTextColor(h6.w0(h6.f20636hc, c6Var));
        uuVar.setHighlightColor(h6.w0(h6.f20883uf, c6Var));
        int i10 = h6.Vd;
        uuVar.setHintColor(h6.w0(i10, c6Var));
        uuVar.setHintTextColor(h6.w0(i10, c6Var));
        uuVar.setCursorColor(h6.w0(h6.Wd, c6Var));
        uuVar.setHandlesColor(h6.w0(h6.f20900vf, c6Var));
        uuVar.setBackground(null);
        uuVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        uuVar.addTextChangedListener(new h2(this, 22));
        uuVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f49829b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(h6.w0(h6.f20667j5, c6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = w5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(uuVar, t10);
            addView(textView, w5.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, w5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(uuVar, w5.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f49830c = kVar;
    }

    public void setCount(int i10) {
        this.f49829b.setText(String.valueOf(i10));
    }
}
