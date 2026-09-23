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
import org.telegram.ui.Components.cu;
import w7.x5;
public final class l extends LinearLayout {
    public final cu f44282a;
    public final TextView f44283b;
    public k f44284c;

    public l(Context context, d6 d6Var) {
        super(context);
        setOrientation(0);
        cu cuVar = new cu(context, d6Var);
        this.f44282a = cuVar;
        cuVar.setLines(1);
        cuVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        cuVar.setInputType(16384);
        cuVar.setFilters(inputFilterArr);
        cuVar.setTextSize(1, 16.0f);
        cuVar.setTextColor(h6.v0(h6.Ud, d6Var));
        cuVar.setLinkTextColor(h6.v0(h6.f18865hc, d6Var));
        cuVar.setHighlightColor(h6.v0(h6.f19109uf, d6Var));
        int i10 = h6.Vd;
        cuVar.setHintColor(h6.v0(i10, d6Var));
        cuVar.setHintTextColor(h6.v0(i10, d6Var));
        cuVar.setCursorColor(h6.v0(h6.Wd, d6Var));
        cuVar.setHandlesColor(h6.v0(h6.f19126vf, d6Var));
        cuVar.setBackground(null);
        cuVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        cuVar.addTextChangedListener(new i2(this, 18));
        cuVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f44283b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(h6.v0(h6.f18895j5, d6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = x5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(cuVar, t10);
            addView(textView, x5.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, x5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(cuVar, x5.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f44284c = kVar;
    }

    public void setCount(int i10) {
        this.f44283b.setText(String.valueOf(i10));
    }
}
