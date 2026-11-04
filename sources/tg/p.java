package tg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.i2;
import org.telegram.ui.v4;
import org.telegram.ui.xi0;
public final class p extends LinearLayout {
    public final v4 f55278a;
    public final v4 f55279b;
    public final v4 f55280c;
    public final EditTextBoldCursor d;
    public boolean f55281e;
    public final q f55282f;

    public p(q qVar, Context context) {
        super(context);
        this.f55282f = qVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        v4 v4Var = new v4(qVar, context);
        this.f55278a = v4Var;
        v4Var.a(0);
        addView(v4Var, mf.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        v4 v4Var2 = new v4(qVar, context);
        this.f55279b = v4Var2;
        v4Var2.a(1);
        addView(v4Var2, mf.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        v4 v4Var3 = new v4(qVar, context);
        this.f55280c = v4Var3;
        v4Var3.a(2);
        addView(v4Var3, mf.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, mf.c(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(bd.M0(2131747673, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView, mf.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(k6.d0(org.telegram.messenger.g0.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(bd.M0(2131751355, null), 6);
        editTextBoldCursor.setTypeface(org.telegram.messenger.g0.o());
        editTextBoldCursor.addTextChangedListener(new xi0(this));
        editTextBoldCursor.setOnFocusChangeListener(new ci.m(this, 7));
        editTextBoldCursor.setOnEditorActionListener(new i2(5));
        linearLayout.addView(editTextBoldCursor, mf.o(72, 36));
    }
}
