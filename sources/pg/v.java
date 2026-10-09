package pg;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.t2;
import w7.x5;
public final class v extends FrameLayout {
    public final TextView f45808a;
    public final r f45809b;
    public final EditTextBoldCursor f45810c;
    public int d;
    public boolean f45811e;
    public final x f45812f;

    public v(x xVar, Context context) {
        super(context);
        this.f45812f = xVar;
        TextView textView = new TextView(context);
        this.f45808a = textView;
        org.telegram.messenger.q.m(14.0f, -1711276033, 1, textView);
        addView(textView, x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 0.0f, -2, 3));
        r rVar = new r(xVar, context);
        this.f45809b = rVar;
        addView(rVar, x5.a(-1.0f, 0.0f, 16.0f, 78.0f, 0.0f, -1, 3));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f45810c = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(i6.c0(AndroidUtilities.dp(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(AndroidUtilities.bold());
        editTextBoldCursor.addTextChangedListener(new ho(this));
        editTextBoldCursor.setOnFocusChangeListener(new ii.x5(this, 1));
        editTextBoldCursor.setOnEditorActionListener(new t2(4));
        addView(editTextBoldCursor, x5.e(72, 36, 85));
    }

    public final void a(int i10) {
        this.d = i10;
        this.f45809b.f45729c = i10;
        TextView textView = this.f45808a;
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
        this.f45811e = true;
        r rVar = this.f45809b;
        rVar.d = i0.a.k(rVar.f45730e.f45834f, 255);
        rVar.a();
        rVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = this.f45810c;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i10 = this.d;
        x xVar = this.f45812f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(xVar.f45834f)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(xVar.f45834f)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(xVar.f45834f)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.f45811e = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
    }
}
