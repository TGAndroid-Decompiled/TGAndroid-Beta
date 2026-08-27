package yf;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import gh.n4;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.o2;

public final class v extends FrameLayout {

    public final TextView f50097a;

    public final r f50098b;

    public final EditTextBoldCursor f50099c;
    public int d;

    public boolean f50100e;

    public final x f50101f;

    public v(x xVar, Context context) {
        super(context);
        this.f50101f = xVar;
        TextView textView = new TextView(context);
        this.f50097a = textView;
        y1.s(textView, -1711276033, 1, 14.0f);
        addView(textView, z5.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        r rVar = new r(xVar, context);
        this.f50098b = rVar;
        addView(rVar, z5.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f50099c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(g6.b0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new n4(this));
        editTextBoldCursor.setOnFocusChangeListener(new hh.j(this, 6));
        editTextBoldCursor.setOnEditorActionListener(new o2(4));
        addView(editTextBoldCursor, z5.e(72, 36, 85));
    }

    public final void a(int i10) {
        this.d = i10;
        this.f50098b.f50046c = i10;
        TextView textView = this.f50097a;
        if (i10 == 0) {
            textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersRed).toUpperCase());
        } else if (i10 == 1) {
            textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersGreen).toUpperCase());
        } else if (i10 == 2) {
            textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersBlue).toUpperCase());
        }
        b();
    }

    public final void b() {
        this.f50100e = true;
        r rVar = this.f50098b;
        rVar.d = i0.b.k(rVar.f50047e.f50115f, 255);
        rVar.a();
        rVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.f50099c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i10 = this.d;
        x xVar = this.f50101f;
        if (i10 == 0) {
            editTextBoldCursor.setText(String.valueOf(Color.red(xVar.f50115f)));
        } else if (i10 == 1) {
            editTextBoldCursor.setText(String.valueOf(Color.green(xVar.f50115f)));
        } else if (i10 == 2) {
            editTextBoldCursor.setText(String.valueOf(Color.blue(xVar.f50115f)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.f50100e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
