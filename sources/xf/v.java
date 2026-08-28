package xf;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import fh.t4;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.o2;
public final class v extends FrameLayout {
    public final TextView f49387a;
    public final r f49388b;
    public final EditTextBoldCursor f49389c;
    public int d;
    public boolean f49390e;
    public final x f49391f;

    public v(x xVar, Context context) {
        super(context);
        this.f49391f = xVar;
        TextView textView = new TextView(context);
        this.f49387a = textView;
        org.telegram.messenger.l0.q(textView, -1711276033, 1, 14.0f);
        addView(textView, e6.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        r rVar = new r(xVar, context);
        this.f49388b = rVar;
        addView(rVar, e6.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f49389c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(f6.b0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new t4(this));
        editTextBoldCursor.setOnFocusChangeListener(new gh.j(this, 6));
        editTextBoldCursor.setOnEditorActionListener(new o2(4));
        addView(editTextBoldCursor, e6.e(72, 36, 85));
    }

    public final void a(int i9) {
        this.d = i9;
        this.f49388b.f49338c = i9;
        TextView textView = this.f49387a;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
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
        this.f49390e = true;
        r rVar = this.f49388b;
        rVar.d = i0.a.k(rVar.f49339e.f49411f, 255);
        rVar.a();
        rVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.f49389c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i9 = this.d;
        x xVar = this.f49391f;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(xVar.f49411f)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(xVar.f49411f)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(xVar.f49411f)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.f49390e = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
