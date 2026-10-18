package qg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.t2;
import org.telegram.ui.ul0;
import w7.z5;
public final class x extends LinearLayout {
    public final w f44736a;
    public final w f44737b;
    public final w f44738c;
    public final EditTextBoldCursor d;
    public boolean e;
    public final y f44739f;

    public x(y yVar, Context context) {
        super(context);
        this.f44739f = yVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        w wVar = new w(yVar, context);
        this.f44736a = wVar;
        wVar.a(0);
        addView(wVar, z5.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        w wVar2 = new w(yVar, context);
        this.f44737b = wVar2;
        wVar2.a(1);
        addView(wVar2, z5.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        w wVar3 = new w(yVar, context);
        this.f44738c = wVar3;
        wVar3.a(2);
        addView(wVar3, z5.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, z5.d(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersHexColor).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, z5.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(h6.c0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new ul0(this));
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 7));
        editTextBoldCursor.setOnEditorActionListener(new t2(5));
        linearLayout.addView(editTextBoldCursor, z5.n(72, 36));
    }
}
