package yg;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Wallet.i9;
public final class l extends LinearLayout {
    public final ft f60674a;
    public final TextView f60675b;
    public k f60676c;

    public l(Context context, e6 e6Var) {
        super(context);
        setOrientation(0);
        ft ftVar = new ft(context, e6Var);
        this.f60674a = ftVar;
        ftVar.setLines(1);
        ftVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new j(this)};
        ftVar.setInputType(16384);
        ftVar.setFilters(inputFilterArr);
        ftVar.setTextSize(1, 16.0f);
        q6.U(ftVar, j6.Le, e6Var);
        q6.G(ftVar, j6.Yc, e6Var);
        q6.C(ftVar, j6.f29005lg, e6Var);
        int i7 = j6.Me;
        q6.l(ftVar, 34, i7, e6Var);
        q6.D(ftVar, i7, e6Var);
        q6.l(ftVar, 30, j6.Ne, e6Var);
        q6.l(ftVar, 36, j6.f29022mg, e6Var);
        ftVar.setBackground(null);
        ftVar.setHint(hd.M0(2131753477, null));
        ftVar.addTextChangedListener(new i9(this, 6));
        ftVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.f60675b = textView;
        textView.setTextSize(1, 16.0f);
        q6.U(textView, j6.f28957j5, e6Var);
        if (hd.f24101a0) {
            LinearLayout.LayoutParams t6 = ja.t(-1, -2, 16, 20, 0, 36, 0);
            t6.weight = 1.0f;
            addView(ftVar, t6);
            addView(textView, ja.t(-2, -2, 16, 0, 0, 20, 0));
            return;
        }
        addView(textView, ja.t(-2, -2, 16, 20, 0, 0, 0));
        addView(ftVar, ja.t(-1, -2, 16, 36, 0, 20, 0));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
    }

    public void setAfterTextChangedListener(k kVar) {
        this.f60676c = kVar;
    }

    public void setCount(int i7) {
        this.f60675b.setText(String.valueOf(i7));
    }
}
