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
import org.telegram.ui.Components.su;
import w7.x5;
public final class l extends LinearLayout {
    public final su f49644a;
    public final TextView f49645b;
    public k f49646c;

    public l(Context context, e6 e6Var) {
        super(context);
        setOrientation(0);
        su suVar = new su(context, e6Var);
        this.f49644a = suVar;
        suVar.setLines(1);
        suVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        suVar.setInputType(16384);
        suVar.setFilters(inputFilterArr);
        suVar.setTextSize(1, 16.0f);
        suVar.setTextColor(i6.w0(i6.Ud, e6Var));
        suVar.setLinkTextColor(i6.w0(i6.f20878hc, e6Var));
        suVar.setHighlightColor(i6.w0(i6.f21123uf, e6Var));
        int i10 = i6.Vd;
        suVar.setHintColor(i6.w0(i10, e6Var));
        suVar.setHintTextColor(i6.w0(i10, e6Var));
        suVar.setCursorColor(i6.w0(i6.Wd, e6Var));
        suVar.setHandlesColor(i6.w0(i6.f21140vf, e6Var));
        suVar.setBackground(null);
        suVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        suVar.addTextChangedListener(new h2(this, 21));
        suVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f49645b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i6.w0(i6.f20909j5, e6Var));
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
        this.f49646c = kVar;
    }

    public void setCount(int i10) {
        this.f49645b.setText(String.valueOf(i10));
    }
}
