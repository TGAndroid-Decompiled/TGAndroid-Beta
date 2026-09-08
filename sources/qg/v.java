package qg;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.w1;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.s2;
import w7.x5;
public final class v extends FrameLayout {
    public final TextView f44623a;
    public final r f44624b;
    public final EditTextBoldCursor f44625c;
    public int d;
    public boolean f44626e;
    public final x f44627f;

    public v(x xVar, Context context) {
        super(context);
        this.f44627f = xVar;
        TextView textView = new TextView(context);
        this.f44623a = textView;
        w1.q(textView, -1711276033, 1, 14.0f);
        addView(textView, x5.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        r rVar = new r(xVar, context);
        this.f44624b = rVar;
        addView(rVar, x5.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f44625c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(j6.b0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new pn(this));
        editTextBoldCursor.setOnFocusChangeListener(new ah.v0(this, 2));
        editTextBoldCursor.setOnEditorActionListener(new s2(4));
        addView(editTextBoldCursor, x5.e(72, 36, 85));
    }

    public final void a(int i10) {
        this.d = i10;
        this.f44624b.f44574c = i10;
        TextView textView = this.f44623a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersBlue).toUpperCase());
                }
            } else {
                textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersGreen).toUpperCase());
            }
        } else {
            textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersRed).toUpperCase());
        }
        b();
    }

    public final void b() {
        this.f44626e = true;
        r rVar = this.f44624b;
        rVar.d = i0.a.k(rVar.f44575e.f44647f, 255);
        rVar.a();
        rVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.f44625c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i10 = this.d;
        x xVar = this.f44627f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(xVar.f44647f)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(xVar.f44647f)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(xVar.f44647f)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.f44626e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
