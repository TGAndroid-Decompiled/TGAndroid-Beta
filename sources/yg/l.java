package yg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.zs;
import org.telegram.ui.Wallet.ma;
public final class l extends LinearLayout {
    public final zs f59463a;
    public final TextView f59464b;
    public k f59465c;

    public l(Context context, f6 f6Var) {
        super(context);
        setOrientation(0);
        zs zsVar = new zs(context, f6Var);
        this.f59463a = zsVar;
        zsVar.setLines(1);
        zsVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        zsVar.setInputType(16384);
        zsVar.setFilters(inputFilterArr);
        zsVar.setTextSize(1, 16.0f);
        r6.V(zsVar, k6.Ie, f6Var);
        r6.H(zsVar, k6.Vc, f6Var);
        r6.D(zsVar, k6.f27952ig, f6Var);
        int i7 = k6.Je;
        r6.m(zsVar, 34, i7, f6Var);
        r6.E(zsVar, i7, f6Var);
        r6.m(zsVar, 30, k6.Ke, f6Var);
        r6.m(zsVar, 36, k6.f27971jg, f6Var);
        zsVar.setBackground(null);
        zsVar.setHint(id.M0(2131753477, null));
        zsVar.addTextChangedListener(new ma(this, 4));
        zsVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f59464b = textView;
        textView.setTextSize(1, 16.0f);
        r6.V(textView, k6.f27960j5, f6Var);
        if (id.f23157a0) {
            LinearLayout.LayoutParams t6 = ha.t(-1, -2, 16, 20, 0, 36, 0);
            t6.weight = 1.0f;
            addView(zsVar, t6);
            addView(textView, ha.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, ha.t(-2, -2, 16, 20, 0, 0, 0));
        addView(zsVar, ha.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f59465c = kVar;
    }

    public void setCount(int i7) {
        this.f59464b.setText(String.valueOf(i7));
    }
}
