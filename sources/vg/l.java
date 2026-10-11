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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.su;
import w7.x5;
public final class l extends LinearLayout {
    public final su f49687a;
    public final TextView f49688b;
    public k f49689c;

    public l(Context context, d6 d6Var) {
        super(context);
        setOrientation(0);
        su suVar = new su(context, d6Var);
        this.f49687a = suVar;
        suVar.setLines(1);
        suVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        suVar.setInputType(16384);
        suVar.setFilters(inputFilterArr);
        suVar.setTextSize(1, 16.0f);
        suVar.setTextColor(h6.w0(h6.Ud, d6Var));
        suVar.setLinkTextColor(h6.w0(h6.f20863hc, d6Var));
        suVar.setHighlightColor(h6.w0(h6.f21109uf, d6Var));
        int i10 = h6.Vd;
        suVar.setHintColor(h6.w0(i10, d6Var));
        suVar.setHintTextColor(h6.w0(i10, d6Var));
        suVar.setCursorColor(h6.w0(h6.Wd, d6Var));
        suVar.setHandlesColor(h6.w0(h6.f21126vf, d6Var));
        suVar.setBackground(null);
        suVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        suVar.addTextChangedListener(new h2(this, 21));
        suVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f49688b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(h6.w0(h6.f20894j5, d6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = x5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(suVar, t10);
            addView(textView, x5.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, x5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(suVar, x5.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f49689c = kVar;
    }

    public void setCount(int i10) {
        this.f49688b.setText(String.valueOf(i10));
    }
}
