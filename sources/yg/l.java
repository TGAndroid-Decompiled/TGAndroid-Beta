package yg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Wallet.oa;
public final class l extends LinearLayout {
    public final ys f59470a;
    public final TextView f59471b;
    public k f59472c;

    public l(Context context, h6 h6Var) {
        super(context);
        setOrientation(0);
        ys ysVar = new ys(context, h6Var);
        this.f59470a = ysVar;
        ysVar.setLines(1);
        ysVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        ysVar.setInputType(16384);
        ysVar.setFilters(inputFilterArr);
        ysVar.setTextSize(1, 16.0f);
        t6.U(ysVar, m6.Ie, h6Var);
        t6.G(ysVar, m6.Vc, h6Var);
        t6.C(ysVar, m6.f27990ig, h6Var);
        int i7 = m6.Je;
        t6.l(ysVar, 34, i7, h6Var);
        t6.D(ysVar, i7, h6Var);
        t6.l(ysVar, 30, m6.Ke, h6Var);
        t6.l(ysVar, 36, m6.f28009jg, h6Var);
        ysVar.setBackground(null);
        ysVar.setHint(id.M0(2131753477, null));
        ysVar.addTextChangedListener(new oa(this, 4));
        ysVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f59471b = textView;
        textView.setTextSize(1, 16.0f);
        t6.U(textView, m6.f27998j5, h6Var);
        if (id.f23161a0) {
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
        this.f59472c = kVar;
    }

    public void setCount(int i7) {
        this.f59471b.setText(String.valueOf(i7));
    }
}
