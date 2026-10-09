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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ru;
import w7.x5;
public final class l extends LinearLayout {
    public final ru f49600a;
    public final TextView f49601b;
    public k f49602c;

    public l(Context context, e6 e6Var) {
        super(context);
        setOrientation(0);
        ru ruVar = new ru(context, e6Var);
        this.f49600a = ruVar;
        ruVar.setLines(1);
        ruVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        ruVar.setInputType(16384);
        ruVar.setFilters(inputFilterArr);
        ruVar.setTextSize(1, 16.0f);
        ruVar.setTextColor(i6.w0(i6.Ud, e6Var));
        ruVar.setLinkTextColor(i6.w0(i6.f20874hc, e6Var));
        ruVar.setHighlightColor(i6.w0(i6.f21119uf, e6Var));
        int i10 = i6.Vd;
        ruVar.setHintColor(i6.w0(i10, e6Var));
        ruVar.setHintTextColor(i6.w0(i10, e6Var));
        ruVar.setCursorColor(i6.w0(i6.Wd, e6Var));
        ruVar.setHandlesColor(i6.w0(i6.f21136vf, e6Var));
        ruVar.setBackground(null);
        ruVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        ruVar.addTextChangedListener(new h2(this, 21));
        ruVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f49601b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i6.w0(i6.f20905j5, e6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = x5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(ruVar, t10);
            addView(textView, x5.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, x5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ruVar, x5.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f49602c = kVar;
    }

    public void setCount(int i10) {
        this.f49601b.setText(String.valueOf(i10));
    }
}
