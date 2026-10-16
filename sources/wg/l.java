package wg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.h2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.nu;
import w7.z5;
public final class l extends LinearLayout {
    public final nu f47588a;
    public final TextView f47589b;
    public k f47590c;

    public l(Context context, c6 c6Var) {
        super(context);
        setOrientation(0);
        nu nuVar = new nu(context, c6Var);
        this.f47588a = nuVar;
        nuVar.setLines(1);
        nuVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        nuVar.setInputType(16384);
        nuVar.setFilters(inputFilterArr);
        nuVar.setTextSize(1, 16.0f);
        nuVar.setTextColor(g6.w0(g6.Ud, c6Var));
        nuVar.setLinkTextColor(g6.w0(g6.hc, c6Var));
        nuVar.setHighlightColor(g6.w0(g6.f19924uf, c6Var));
        int i10 = g6.Vd;
        nuVar.setHintColor(g6.w0(i10, c6Var));
        nuVar.setHintTextColor(g6.w0(i10, c6Var));
        nuVar.setCursorColor(g6.w0(g6.Wd, c6Var));
        nuVar.setHandlesColor(g6.w0(g6.f19942vf, c6Var));
        nuVar.setBackground(null);
        nuVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        nuVar.addTextChangedListener(new h2(this, 21));
        nuVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f47589b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.w0(g6.f19707j5, c6Var));
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = z5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(nuVar, t10);
            addView(textView, z5.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, z5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(nuVar, z5.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f47590c = kVar;
    }

    public void setCount(int i10) {
        this.f47589b.setText(String.valueOf(i10));
    }
}
