package xg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ju;
public final class l extends LinearLayout {
    public final ju f51786a;
    public final TextView f51787b;
    public k f51788c;

    public l(Context context, u6 u6Var) {
        super(context);
        setOrientation(0);
        ju juVar = new ju(context, u6Var);
        this.f51786a = juVar;
        juVar.setLines(1);
        juVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        juVar.setInputType(16384);
        juVar.setFilters(inputFilterArr);
        juVar.setTextSize(1, 16.0f);
        f7.V(juVar, y6.Ud, u6Var);
        f7.H(juVar, y6.f23432hc, u6Var);
        f7.D(juVar, y6.f23680uf, u6Var);
        int i10 = y6.Vd;
        f7.m(juVar, 34, i10, u6Var);
        f7.E(juVar, i10, u6Var);
        f7.m(juVar, 30, y6.Wd, u6Var);
        f7.m(juVar, 36, y6.f23698vf, u6Var);
        juVar.setBackground(null);
        juVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        juVar.addTextChangedListener(new bi.u(this, 22));
        juVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f51787b = textView;
        textView.setTextSize(1, 16.0f);
        f7.V(textView, y6.f23462j5, u6Var);
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams x9 = gb1.x(-1, -2, 16, 20, 0, 36, 0);
            x9.weight = 1.0f;
            addView(juVar, x9);
            addView(textView, gb1.x(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, gb1.x(-2, -2, 16, 20, 0, 0, 0));
        addView(juVar, gb1.x(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f51788c = kVar;
    }

    public void setCount(int i10) {
        this.f51787b.setText(String.valueOf(i10));
    }
}
