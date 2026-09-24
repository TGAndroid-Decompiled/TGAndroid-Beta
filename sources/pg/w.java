package pg;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import ii.w5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.r2;
import org.telegram.ui.cm0;
import w7.y5;
public final class w extends LinearLayout {
    public final v f41280a;
    public final v f41281b;
    public final v f41282c;
    public final EditTextBoldCursor d;
    public boolean e;
    public final x f41283f;

    public w(x xVar, Context context) {
        super(context);
        this.f41283f = xVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        v vVar = new v(xVar, context);
        this.f41280a = vVar;
        vVar.a(0);
        addView(vVar, y5.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        v vVar2 = new v(xVar, context);
        this.f41281b = vVar2;
        vVar2.a(1);
        addView(vVar2, y5.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        v vVar3 = new v(xVar, context);
        this.f41282c = vVar3;
        vVar3.a(2);
        addView(vVar3, y5.p(-1, -2, 0.0f, 0, 0, 0, 0, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(21);
        addView(linearLayout, y5.c(64.0f, -1));
        TextView textView = new TextView(context);
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersHexColor).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView, y5.k(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(h6.b0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new cm0(this));
        editTextBoldCursor.setOnFocusChangeListener(new w5(this, 2));
        editTextBoldCursor.setOnEditorActionListener(new r2(5));
        linearLayout.addView(editTextBoldCursor, y5.n(72, 36));
    }
}
