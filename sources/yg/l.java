package yg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Wallet.i9;
public final class l extends LinearLayout {
    public final ot f61283a;
    public final TextView f61284b;
    public k f61285c;

    public l(Context context, h6 h6Var) {
        super(context);
        setOrientation(0);
        ot otVar = new ot(context, h6Var);
        this.f61283a = otVar;
        otVar.setLines(1);
        otVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        otVar.setInputType(16384);
        otVar.setFilters(inputFilterArr);
        otVar.setTextSize(1, 16.0f);
        t6.U(otVar, m6.Le, h6Var);
        t6.G(otVar, m6.Yc, h6Var);
        t6.C(otVar, m6.f29534lg, h6Var);
        int i7 = m6.Me;
        t6.l(otVar, 34, i7, h6Var);
        t6.D(otVar, i7, h6Var);
        t6.l(otVar, 30, m6.Ne, h6Var);
        t6.l(otVar, 36, m6.f29551mg, h6Var);
        otVar.setBackground(null);
        otVar.setHint(gd.N0(2131753474, null));
        otVar.addTextChangedListener(new i9(this, 7));
        otVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f61284b = textView;
        textView.setTextSize(1, 16.0f);
        t6.U(textView, m6.f29486j5, h6Var);
        if (gd.f24241a0) {
            LinearLayout.LayoutParams t6 = ma.t(-1, -2, 16, 20, 0, 36, 0);
            t6.weight = 1.0f;
            addView(otVar, t6);
            addView(textView, ma.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, ma.t(-2, -2, 16, 20, 0, 0, 0));
        addView(otVar, ma.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f61285c = kVar;
    }

    public void setCount(int i7) {
        this.f61284b.setText(String.valueOf(i7));
    }
}
