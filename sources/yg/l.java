package yg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Wallet.na;
public final class l extends LinearLayout {
    public final ys f59364a;
    public final TextView f59365b;
    public k f59366c;

    public l(Context context, f6 f6Var) {
        super(context);
        setOrientation(0);
        ys ysVar = new ys(context, f6Var);
        this.f59364a = ysVar;
        ysVar.setLines(1);
        ysVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        ysVar.setInputType(16384);
        ysVar.setFilters(inputFilterArr);
        ysVar.setTextSize(1, 16.0f);
        r6.V(ysVar, k6.Ie, f6Var);
        r6.H(ysVar, k6.Vc, f6Var);
        r6.D(ysVar, k6.f27949ig, f6Var);
        int i7 = k6.Je;
        r6.m(ysVar, 34, i7, f6Var);
        r6.E(ysVar, i7, f6Var);
        r6.m(ysVar, 30, k6.Ke, f6Var);
        r6.m(ysVar, 36, k6.f27968jg, f6Var);
        ysVar.setBackground(null);
        ysVar.setHint(hd.M0(2131753477, null));
        ysVar.addTextChangedListener(new na(this, 4));
        ysVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f59365b = textView;
        textView.setTextSize(1, 16.0f);
        r6.V(textView, k6.f27957j5, f6Var);
        if (hd.f22878a0) {
            LinearLayout.LayoutParams t6 = ha.t(-1, -2, 16, 20, 0, 36, 0);
            t6.weight = 1.0f;
            addView(ysVar, t6);
            addView(textView, ha.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, ha.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ysVar, ha.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f59366c = kVar;
    }

    public void setCount(int i7) {
        this.f59365b.setText(String.valueOf(i7));
    }
}
