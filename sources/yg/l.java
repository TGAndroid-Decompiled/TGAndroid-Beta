package yg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.zs;
import org.telegram.ui.Wallet.la;
public final class l extends LinearLayout {
    public final zs f59472a;
    public final TextView f59473b;
    public k f59474c;

    public l(Context context, g6 g6Var) {
        super(context);
        setOrientation(0);
        zs zsVar = new zs(context, g6Var);
        this.f59472a = zsVar;
        zsVar.setLines(1);
        zsVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        zsVar.setInputType(16384);
        zsVar.setFilters(inputFilterArr);
        zsVar.setTextSize(1, 16.0f);
        s6.U(zsVar, l6.Ie, g6Var);
        s6.G(zsVar, l6.Vc, g6Var);
        s6.C(zsVar, l6.f27965ig, g6Var);
        int i7 = l6.Je;
        s6.l(zsVar, 34, i7, g6Var);
        s6.D(zsVar, i7, g6Var);
        s6.l(zsVar, 30, l6.Ke, g6Var);
        s6.l(zsVar, 36, l6.f27984jg, g6Var);
        zsVar.setBackground(null);
        zsVar.setHint(id.M0(2131753477, null));
        zsVar.addTextChangedListener(new la(this, 4));
        zsVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f59473b = textView;
        textView.setTextSize(1, 16.0f);
        s6.U(textView, l6.f27973j5, g6Var);
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
        this.f59474c = kVar;
    }

    public void setCount(int i7) {
        this.f59473b.setText(String.valueOf(i7));
    }
}
