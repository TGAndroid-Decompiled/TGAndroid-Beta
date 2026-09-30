package vg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.i2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.eu;
import w7.y5;
public final class l extends LinearLayout {
    public final eu f44721a;
    public final TextView f44722b;
    public k f44723c;

    public l(Context context, d6 d6Var) {
        super(context);
        setOrientation(0);
        eu euVar = new eu(context, d6Var);
        this.f44721a = euVar;
        euVar.setLines(1);
        euVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        euVar.setInputType(16384);
        euVar.setFilters(inputFilterArr);
        euVar.setTextSize(1, 16.0f);
        euVar.setTextColor(h6.v0(h6.Ud, d6Var));
        euVar.setLinkTextColor(h6.v0(h6.f19152hc, d6Var));
        euVar.setHighlightColor(h6.v0(h6.f19398uf, d6Var));
        int i10 = h6.Vd;
        euVar.setHintColor(h6.v0(i10, d6Var));
        euVar.setHintTextColor(h6.v0(i10, d6Var));
        euVar.setCursorColor(h6.v0(h6.Wd, d6Var));
        euVar.setHandlesColor(h6.v0(h6.f19415vf, d6Var));
        euVar.setBackground(null);
        euVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        euVar.addTextChangedListener(new i2(this, 18));
        euVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f44722b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(h6.v0(h6.f19182j5, d6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = y5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(euVar, t10);
            addView(textView, y5.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, y5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(euVar, y5.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f44723c = kVar;
    }

    public void setCount(int i10) {
        this.f44722b.setText(String.valueOf(i10));
    }
}
