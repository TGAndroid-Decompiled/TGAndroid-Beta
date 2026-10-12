package qg;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.u2;
import w7.a6;
public final class v extends FrameLayout {
    public final TextView f43591a;
    public final r f43592b;
    public final EditTextBoldCursor f43593c;
    public int d;
    public boolean e;
    public final x f43594f;

    public v(x xVar, Context context) {
        super(context);
        this.f43594f = xVar;
        TextView textView = new TextView(context);
        this.f43591a = textView;
        org.telegram.messenger.q.n(14.0f, -1711276033, 1, textView);
        addView(textView, a6.a(-2.0f, 8.0f, 0.0f, 8.0f, 0.0f, -2, 3));
        r rVar = new r(xVar, context);
        this.f43592b = rVar;
        addView(rVar, a6.a(-1.0f, 0.0f, 16.0f, 78.0f, 0.0f, -1, 3));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f43593c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(g6.c0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new eo(this));
        editTextBoldCursor.setOnFocusChangeListener(new ah.u0(this, 2));
        editTextBoldCursor.setOnEditorActionListener(new u2(4));
        addView(editTextBoldCursor, a6.e(72, 36, 85));
    }

    public final void a(int i10) {
        this.d = i10;
        this.f43592b.f43548c = i10;
        TextView textView = this.f43591a;
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
        r rVar = this.f43592b;
        rVar.d = i0.a.k(rVar.e.f43611f, 255);
        rVar.a();
        rVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.f43593c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i10 = this.d;
        x xVar = this.f43594f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(xVar.f43611f)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(xVar.f43611f)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(xVar.f43611f)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
