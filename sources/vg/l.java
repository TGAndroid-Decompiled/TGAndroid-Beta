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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.du;
import w7.y5;
public final class l extends LinearLayout {
    public final du f44659a;
    public final TextView f44660b;
    public k f44661c;

    public l(Context context, e6 e6Var) {
        super(context);
        setOrientation(0);
        du duVar = new du(context, e6Var);
        this.f44659a = duVar;
        duVar.setLines(1);
        duVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        duVar.setInputType(16384);
        duVar.setFilters(inputFilterArr);
        duVar.setTextSize(1, 16.0f);
        duVar.setTextColor(i6.v0(i6.Ud, e6Var));
        duVar.setLinkTextColor(i6.v0(i6.f19134hc, e6Var));
        duVar.setHighlightColor(i6.v0(i6.f19381uf, e6Var));
        int i10 = i6.Vd;
        duVar.setHintColor(i6.v0(i10, e6Var));
        duVar.setHintTextColor(i6.v0(i10, e6Var));
        duVar.setCursorColor(i6.v0(i6.Wd, e6Var));
        duVar.setHandlesColor(i6.v0(i6.f19398vf, e6Var));
        duVar.setBackground(null);
        duVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        duVar.addTextChangedListener(new i2(this, 18));
        duVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f44660b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i6.v0(i6.f19164j5, e6Var));
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
        this.f44661c = kVar;
    }

    public void setCount(int i10) {
        this.f44660b.setText(String.valueOf(i10));
    }
}
