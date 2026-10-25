package rg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.u2;
import org.telegram.ui.em0;
public final class x extends LinearLayout {
    public final w f47584a;
    public final w f47585b;
    public final w f47586c;
    public final EditTextBoldCursor d;
    public boolean e;
    public final y f47587f;

    public x(y yVar, Context context) {
        super(context);
        this.f47587f = yVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        w wVar = new w(yVar, context);
        this.f47584a = wVar;
        wVar.a(0);
        addView(wVar, gb1.t(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        w wVar2 = new w(yVar, context);
        this.f47585b = wVar2;
        wVar2.a(1);
        addView(wVar2, gb1.t(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        w wVar3 = new w(yVar, context);
        this.f47586c = wVar3;
        wVar3.a(2);
        addView(wVar3, gb1.t(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, gb1.g(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersHexColor).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, gb1.o(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
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
        editTextBoldCursor.addTextChangedListener(new em0(this));
        editTextBoldCursor.setOnFocusChangeListener(new bh.j0(this, 7));
        editTextBoldCursor.setOnEditorActionListener(new u2(5));
        linearLayout.addView(editTextBoldCursor, gb1.r(72, 36));
    }
}
