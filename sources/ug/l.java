package ug;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.u2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fu;
import w7.a6;
public final class l extends LinearLayout {
    public final fu f42700a;
    public final TextView f42701b;
    public k f42702c;

    public l(Context context, f6 f6Var) {
        super(context);
        setOrientation(0);
        fu fuVar = new fu(context, f6Var);
        this.f42700a = fuVar;
        fuVar.setLines(1);
        fuVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        fuVar.setInputType(16384);
        fuVar.setFilters(inputFilterArr);
        fuVar.setTextSize(1, 16.0f);
        fuVar.setTextColor(j6.v0(j6.Ud, f6Var));
        fuVar.setLinkTextColor(j6.v0(j6.f18004hc, f6Var));
        fuVar.setHighlightColor(j6.v0(j6.f18245uf, f6Var));
        int i10 = j6.Vd;
        fuVar.setHintColor(j6.v0(i10, f6Var));
        fuVar.setHintTextColor(j6.v0(i10, f6Var));
        fuVar.setCursorColor(j6.v0(j6.Wd, f6Var));
        fuVar.setHandlesColor(j6.v0(j6.vf, f6Var));
        fuVar.setBackground(null);
        fuVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        fuVar.addTextChangedListener(new u2(this, 18));
        fuVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f42701b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.v0(j6.f18034j5, f6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = a6.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(fuVar, t10);
            addView(textView, a6.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, a6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(fuVar, a6.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f42702c = kVar;
    }

    public void setCount(int i10) {
        this.f42701b.setText(String.valueOf(i10));
    }
}
