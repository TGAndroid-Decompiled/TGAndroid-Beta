package sg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.t2;
import org.telegram.ui.gj0;
import org.telegram.ui.t4;
public final class p extends LinearLayout {
    public final t4 f57355a;
    public final t4 f57356b;
    public final t4 f57357c;
    public final EditTextBoldCursor d;
    public boolean f57358e;
    public final q f57359f;

    public p(q qVar, Context context) {
        super(context);
        this.f57359f = qVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        t4 t4Var = new t4(qVar, context);
        this.f57355a = t4Var;
        t4Var.a(0);
        addView(t4Var, ma.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        t4 t4Var2 = new t4(qVar, context);
        this.f57356b = t4Var2;
        t4Var2.a(1);
        addView(t4Var2, ma.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        t4 t4Var3 = new t4(qVar, context);
        this.f57357c = t4Var3;
        t4Var3.a(2);
        addView(t4Var3, ma.q(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, ma.c(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.N0(2131747471, null).toUpperCase());
        textView.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView, ma.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(m6.d0(org.telegram.messenger.g0.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(hd.N0(2131751342, null), 6);
        editTextBoldCursor.setTypeface(org.telegram.messenger.g0.o());
        editTextBoldCursor.addTextChangedListener(new gj0(this));
        editTextBoldCursor.setOnFocusChangeListener(new ch.c0(this, 6));
        editTextBoldCursor.setOnEditorActionListener(new t2(5));
        linearLayout.addView(editTextBoldCursor, ma.o(72, 36));
    }
}
