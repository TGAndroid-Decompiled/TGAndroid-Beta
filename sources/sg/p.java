package sg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.k2;
import org.telegram.ui.dj0;
import org.telegram.ui.t4;
public final class p extends LinearLayout {
    public final t4 f55183a;
    public final t4 f55184b;
    public final t4 f55185c;
    public final EditTextBoldCursor d;
    public boolean f55186e;
    public final q f55187f;

    public p(q qVar, Context context) {
        super(context);
        this.f55187f = qVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        t4 t4Var = new t4(qVar, context);
        this.f55183a = t4Var;
        t4Var.a(0);
        addView(t4Var, ha.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        t4 t4Var2 = new t4(qVar, context);
        this.f55184b = t4Var2;
        t4Var2.a(1);
        addView(t4Var2, ha.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        t4 t4Var3 = new t4(qVar, context);
        this.f55185c = t4Var3;
        t4Var3.a(2);
        addView(t4Var3, ha.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, ha.c(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(id.M0(2131747665, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView, ha.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(m6.d0(org.telegram.messenger.g0.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(id.M0(2131751354, null), 6);
        editTextBoldCursor.setTypeface(org.telegram.messenger.g0.o());
        editTextBoldCursor.addTextChangedListener(new dj0(this));
        editTextBoldCursor.setOnFocusChangeListener(new bi.n(this, 7));
        editTextBoldCursor.setOnEditorActionListener(new k2(5));
        linearLayout.addView(editTextBoldCursor, ha.o(72, 36));
    }
}
