package pg;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ii.w5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.r2;
import org.telegram.ui.Components.rn;
import w7.y5;
public final class v extends FrameLayout {
    public final TextView f41271a;
    public final r f41272b;
    public final EditTextBoldCursor f41273c;
    public int d;
    public boolean e;
    public final x f41274f;

    public v(x xVar, Context context) {
        super(context);
        this.f41274f = xVar;
        TextView textView = new TextView(context);
        this.f41271a = textView;
        org.telegram.messenger.f0.q(textView, -1711276033, 1, 14.0f);
        addView(textView, y5.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        r rVar = new r(xVar, context);
        this.f41272b = rVar;
        addView(rVar, y5.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f41273c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(h6.b0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new rn(this));
        editTextBoldCursor.setOnFocusChangeListener(new w5(this, 1));
        editTextBoldCursor.setOnEditorActionListener(new r2(4));
        addView(editTextBoldCursor, y5.e(72, 36, 85));
    }

    public final void a(int i10) {
        this.d = i10;
        this.f41272b.f41196c = i10;
        TextView textView = this.f41271a;
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
        r rVar = this.f41272b;
        rVar.d = i0.a.k(rVar.e.f41293f, 255);
        rVar.a();
        rVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.f41273c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i10 = this.d;
        x xVar = this.f41274f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(xVar.f41293f)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(xVar.f41293f)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(xVar.f41293f)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
