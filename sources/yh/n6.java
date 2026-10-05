package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class n6 implements View.OnClickListener {
    public final int f51704a = 1;
    public final boolean[] f51705b;
    public final Utilities.Callback2 f51706c;
    public final ci.d d;
    public final EditTextBoldCursor f51707e;
    public final org.telegram.ui.ActionBar.f3[] f51708f;

    public n6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f51705b = zArr;
        this.f51706c = callback2;
        this.d = dVar;
        this.f51707e = editTextBoldCursor;
        this.f51708f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f51704a) {
            case 0:
                boolean[] zArr = this.f51705b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f51707e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f51706c.run(Long.valueOf(parseLong), new o6(editTextBoldCursor, this.f51708f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f51705b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f51706c.run(0L, new tg.q(zArr2, this.f51707e, this.f51708f, 20));
                    return;
                }
                return;
        }
    }

    public n6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f51705b = zArr;
        this.f51706c = callback2;
        this.f51707e = editTextBoldCursor;
        this.d = dVar;
        this.f51708f = f3VarArr;
    }
}
