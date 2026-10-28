package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.u2;
import org.telegram.ui.gm0;
public final class x extends LinearLayout {
    public final w f47622a;
    public final w f47623b;
    public final w f47624c;
    public final EditTextBoldCursor d;
    public boolean e;
    public final y f47625f;

    public x(y yVar, Context context) {
        super(context);
        this.f47625f = yVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        w wVar = new w(yVar, context);
        this.f47622a = wVar;
        wVar.a(0);
        addView(wVar, kb1.t(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        w wVar2 = new w(yVar, context);
        this.f47623b = wVar2;
        wVar2.a(1);
        addView(wVar2, kb1.t(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        w wVar3 = new w(yVar, context);
        this.f47624c = wVar3;
        wVar3.a(2);
        addView(wVar3, kb1.t(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, kb1.g(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersHexColor).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, kb1.o(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(y6.c0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new gm0(this));
        editTextBoldCursor.setOnFocusChangeListener(new bh.j0(this, 7));
        editTextBoldCursor.setOnEditorActionListener(new u2(5));
        linearLayout.addView(editTextBoldCursor, kb1.r(72, 36));
    }
}
