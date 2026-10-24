package wg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.gu;
import w7.z5;
public final class l extends LinearLayout {
    public final gu f49426a;
    public final TextView f49427b;
    public k f49428c;

    public l(Context context, g6 g6Var) {
        super(context);
        setOrientation(0);
        gu guVar = new gu(context, g6Var);
        this.f49426a = guVar;
        guVar.setLines(1);
        guVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        guVar.setInputType(16384);
        guVar.setFilters(inputFilterArr);
        guVar.setTextSize(1, 16.0f);
        r6.W(guVar, k6.Ud, g6Var);
        r6.I(guVar, k6.hc, g6Var);
        r6.E(guVar, k6.f21508uf, g6Var);
        int i10 = k6.Vd;
        r6.m(guVar, 34, i10, g6Var);
        r6.F(guVar, i10, g6Var);
        r6.m(guVar, 30, k6.Wd, g6Var);
        r6.m(guVar, 36, k6.f21526vf, g6Var);
        guVar.setBackground(null);
        guVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        guVar.addTextChangedListener(new ai.u(this, 22));
        guVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f49427b = textView;
        textView.setTextSize(1, 16.0f);
        r6.W(textView, k6.f21290j5, g6Var);
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = z5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(guVar, t10);
            addView(textView, z5.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, z5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(guVar, z5.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f49428c = kVar;
    }

    public void setCount(int i10) {
        this.f49427b.setText(String.valueOf(i10));
    }
}
