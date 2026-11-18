package yg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Wallet.i9;
public final class l extends LinearLayout {
    public final mt f61241a;
    public final TextView f61242b;
    public k f61243c;

    public l(Context context, i6 i6Var) {
        super(context);
        setOrientation(0);
        mt mtVar = new mt(context, i6Var);
        this.f61241a = mtVar;
        mtVar.setLines(1);
        mtVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        mtVar.setInputType(16384);
        mtVar.setFilters(inputFilterArr);
        mtVar.setTextSize(1, 16.0f);
        u6.U(mtVar, n6.Le, i6Var);
        u6.G(mtVar, n6.Yc, i6Var);
        u6.C(mtVar, n6.f29552lg, i6Var);
        int i7 = n6.Me;
        u6.l(mtVar, 34, i7, i6Var);
        u6.D(mtVar, i7, i6Var);
        u6.l(mtVar, 30, n6.Ne, i6Var);
        u6.l(mtVar, 36, n6.f29569mg, i6Var);
        mtVar.setBackground(null);
        mtVar.setHint(gd.M0(2131753475, null));
        mtVar.addTextChangedListener(new i9(this, 7));
        mtVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f61242b = textView;
        textView.setTextSize(1, 16.0f);
        u6.U(textView, n6.f29504j5, i6Var);
        if (gd.f24216a0) {
            LinearLayout.LayoutParams t6 = ma.t(-1, -2, 16, 20, 0, 36, 0);
            t6.weight = 1.0f;
            addView(mtVar, t6);
            addView(textView, ma.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, ma.t(-2, -2, 16, 20, 0, 0, 0));
        addView(mtVar, ma.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f61243c = kVar;
    }

    public void setCount(int i7) {
        this.f61242b.setText(String.valueOf(i7));
    }
}
