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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bu;
import w7.x5;
public final class l extends LinearLayout {
    public final bu f44360a;
    public final TextView f44361b;
    public k f44362c;

    public l(Context context, f6 f6Var) {
        super(context);
        setOrientation(0);
        bu buVar = new bu(context, f6Var);
        this.f44360a = buVar;
        buVar.setLines(1);
        buVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        buVar.setInputType(16384);
        buVar.setFilters(inputFilterArr);
        buVar.setTextSize(1, 16.0f);
        buVar.setTextColor(j6.v0(j6.Ud, f6Var));
        buVar.setLinkTextColor(j6.v0(j6.f18940hc, f6Var));
        buVar.setHighlightColor(j6.v0(j6.f19184uf, f6Var));
        int i10 = j6.Vd;
        buVar.setHintColor(j6.v0(i10, f6Var));
        buVar.setHintTextColor(j6.v0(i10, f6Var));
        buVar.setCursorColor(j6.v0(j6.Wd, f6Var));
        buVar.setHandlesColor(j6.v0(j6.f19201vf, f6Var));
        buVar.setBackground(null);
        buVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        buVar.addTextChangedListener(new i2(this, 18));
        buVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f44361b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.v0(j6.f18970j5, f6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = x5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(buVar, t10);
            addView(textView, x5.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, x5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(buVar, x5.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f44362c = kVar;
    }

    public void setCount(int i10) {
        this.f44361b.setText(String.valueOf(i10));
    }
}
