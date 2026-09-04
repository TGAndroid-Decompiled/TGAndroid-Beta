package qg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.s2;
import org.telegram.ui.lm0;
import w7.x5;
public final class w extends LinearLayout {
    public final v f44608a;
    public final v f44609b;
    public final v f44610c;
    public final EditTextBoldCursor d;
    public boolean f44611e;
    public final x f44612f;

    public w(x xVar, Context context) {
        super(context);
        this.f44612f = xVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        v vVar = new v(xVar, context);
        this.f44608a = vVar;
        vVar.a(0);
        addView(vVar, x5.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        v vVar2 = new v(xVar, context);
        this.f44609b = vVar2;
        vVar2.a(1);
        addView(vVar2, x5.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        v vVar3 = new v(xVar, context);
        this.f44610c = vVar3;
        vVar3.a(2);
        addView(vVar3, x5.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, x5.c(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersHexColor).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, x5.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(j6.b0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new lm0(this));
        editTextBoldCursor.setOnFocusChangeListener(new ah.v0(this, 3));
        editTextBoldCursor.setOnEditorActionListener(new s2(5));
        linearLayout.addView(editTextBoldCursor, x5.n(72, 36));
    }
}
