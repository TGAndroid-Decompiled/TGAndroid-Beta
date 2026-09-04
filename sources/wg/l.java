package wg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.i2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.zt;
import w7.x5;
public final class l extends LinearLayout {
    public final zt f48532a;
    public final TextView f48533b;
    public k f48534c;

    public l(Context context, f6 f6Var) {
        super(context);
        setOrientation(0);
        zt ztVar = new zt(context, f6Var);
        this.f48532a = ztVar;
        ztVar.setLines(1);
        ztVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        ztVar.setInputType(16384);
        ztVar.setFilters(inputFilterArr);
        ztVar.setTextSize(1, 16.0f);
        ztVar.setTextColor(j6.v0(j6.Ud, f6Var));
        ztVar.setLinkTextColor(j6.v0(j6.f20740hc, f6Var));
        ztVar.setHighlightColor(j6.v0(j6.f20981uf, f6Var));
        int i10 = j6.Vd;
        ztVar.setHintColor(j6.v0(i10, f6Var));
        ztVar.setHintTextColor(j6.v0(i10, f6Var));
        ztVar.setCursorColor(j6.v0(j6.Wd, f6Var));
        ztVar.setHandlesColor(j6.v0(j6.f20998vf, f6Var));
        ztVar.setBackground(null);
        ztVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        ztVar.addTextChangedListener(new i2(this, 18));
        ztVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f48533b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.v0(j6.f20770j5, f6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = x5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(ztVar, t10);
            addView(textView, x5.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, x5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ztVar, x5.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f48534c = kVar;
    }

    public void setCount(int i10) {
        this.f48533b.setText(String.valueOf(i10));
    }
}
