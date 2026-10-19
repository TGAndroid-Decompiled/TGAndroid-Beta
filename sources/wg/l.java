package wg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.iu;
import w7.z5;
public final class l extends LinearLayout {
    public final iu f48974a;
    public final TextView f48975b;
    public k f48976c;

    public l(Context context, d6 d6Var) {
        super(context);
        setOrientation(0);
        iu iuVar = new iu(context, d6Var);
        this.f48974a = iuVar;
        iuVar.setLines(1);
        iuVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        iuVar.setInputType(16384);
        iuVar.setFilters(inputFilterArr);
        iuVar.setTextSize(1, 16.0f);
        iuVar.setTextColor(h6.w0(h6.Ud, d6Var));
        iuVar.setLinkTextColor(h6.w0(h6.hc, d6Var));
        iuVar.setHighlightColor(h6.w0(h6.f21313uf, d6Var));
        int i10 = h6.Vd;
        iuVar.setHintColor(h6.w0(i10, d6Var));
        iuVar.setHintTextColor(h6.w0(i10, d6Var));
        iuVar.setCursorColor(h6.w0(h6.Wd, d6Var));
        iuVar.setHandlesColor(h6.w0(h6.f21331vf, d6Var));
        iuVar.setBackground(null);
        iuVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        iuVar.addTextChangedListener(new ai.u(this, 22));
        iuVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f48975b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(h6.w0(h6.f21095j5, d6Var));
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
        this.f48976c = kVar;
    }

    public void setCount(int i10) {
        this.f48975b.setText(String.valueOf(i10));
    }
}
