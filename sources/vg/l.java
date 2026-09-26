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
import org.telegram.ui.Components.du;
import w7.y5;
public final class l extends LinearLayout {
    public final du f44612a;
    public final TextView f44613b;
    public k f44614c;

    public l(Context context, d6 d6Var) {
        super(context);
        setOrientation(0);
        du duVar = new du(context, d6Var);
        this.f44612a = duVar;
        duVar.setLines(1);
        duVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        duVar.setInputType(16384);
        duVar.setFilters(inputFilterArr);
        duVar.setTextSize(1, 16.0f);
        duVar.setTextColor(h6.v0(h6.Ud, d6Var));
        duVar.setLinkTextColor(h6.v0(h6.f19135hc, d6Var));
        duVar.setHighlightColor(h6.v0(h6.f19381uf, d6Var));
        int i10 = h6.Vd;
        duVar.setHintColor(h6.v0(i10, d6Var));
        duVar.setHintTextColor(h6.v0(i10, d6Var));
        duVar.setCursorColor(h6.v0(h6.Wd, d6Var));
        duVar.setHandlesColor(h6.v0(h6.f19398vf, d6Var));
        duVar.setBackground(null);
        duVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        duVar.addTextChangedListener(new i2(this, 18));
        duVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f44613b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(h6.v0(h6.f19165j5, d6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = y5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(duVar, t10);
            addView(textView, y5.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, y5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(duVar, y5.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f44614c = kVar;
    }

    public void setCount(int i10) {
        this.f44613b.setText(String.valueOf(i10));
    }
}
