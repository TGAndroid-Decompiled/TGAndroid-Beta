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
import org.telegram.ui.Components.iu;
import w7.z5;
public final class l extends LinearLayout {
    public final iu f49427a;
    public final TextView f49428b;
    public k f49429c;

    public l(Context context, g6 g6Var) {
        super(context);
        setOrientation(0);
        iu iuVar = new iu(context, g6Var);
        this.f49427a = iuVar;
        iuVar.setLines(1);
        iuVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        iuVar.setInputType(16384);
        iuVar.setFilters(inputFilterArr);
        iuVar.setTextSize(1, 16.0f);
        r6.W(iuVar, k6.Ud, g6Var);
        r6.I(iuVar, k6.hc, g6Var);
        r6.E(iuVar, k6.f21507uf, g6Var);
        int i10 = k6.Vd;
        r6.m(iuVar, 34, i10, g6Var);
        r6.F(iuVar, i10, g6Var);
        r6.m(iuVar, 30, k6.Wd, g6Var);
        r6.m(iuVar, 36, k6.f21525vf, g6Var);
        iuVar.setBackground(null);
        iuVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        iuVar.addTextChangedListener(new ai.u(this, 22));
        iuVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f49428b = textView;
        textView.setTextSize(1, 16.0f);
        r6.W(textView, k6.f21289j5, g6Var);
        if (LocaleController.isRTL) {
            LinearLayout.LayoutParams t10 = z5.t(-1, -2, 16, 20, 0, 36, 0);
            t10.weight = 1.0f;
            addView(iuVar, t10);
            addView(textView, z5.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, z5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(iuVar, z5.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f49429c = kVar;
    }

    public void setCount(int i10) {
        this.f49428b.setText(String.valueOf(i10));
    }
}
