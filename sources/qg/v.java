package qg;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.t2;
import w7.z5;
public final class v extends FrameLayout {
    public final TextView f44674a;
    public final r f44675b;
    public final EditTextBoldCursor f44676c;
    public int d;
    public boolean e;
    public final x f44677f;

    public v(x xVar, Context context) {
        super(context);
        this.f44677f = xVar;
        TextView textView = new TextView(context);
        this.f44674a = textView;
        org.telegram.messenger.g0.m(14.0f, -1711276033, 1, textView);
        addView(textView, z5.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        r rVar = new r(xVar, context);
        this.f44675b = rVar;
        addView(rVar, z5.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f44676c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(h6.c0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new ao(this));
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 6));
        editTextBoldCursor.setOnEditorActionListener(new t2(4));
        addView(editTextBoldCursor, z5.e(72, 36, 85));
    }

    public final void a(int i10) {
        this.d = i10;
        this.f44675b.f44602c = i10;
        TextView textView = this.f44674a;
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
        this.e = true;
        r rVar = this.f44675b;
        rVar.d = i0.a.o(rVar.e.f44696f, 255);
        rVar.a();
        rVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.f44676c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i10 = this.d;
        x xVar = this.f44677f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(xVar.f44696f)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(xVar.f44696f)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(xVar.f44696f)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
