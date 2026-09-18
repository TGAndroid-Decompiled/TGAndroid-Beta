package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l6 implements View.OnClickListener {
    public final int f47442a = 1;
    public final boolean[] f47443b;
    public final Utilities.Callback2 f47444c;
    public final ci.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.g3[] f47445f;

    public l6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f47443b = zArr;
        this.f47444c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f47445f = g3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f47442a) {
            case 0:
                boolean[] zArr = this.f47443b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f47444c.run(Long.valueOf(parseLong), new m6(editTextBoldCursor, this.f47445f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f47443b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f47444c.run(0L, new w9.v(zArr2, this.e, this.f47445f, 17));
                    return;
                }
                return;
        }
    }

    public l6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f47443b = zArr;
        this.f47444c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f47445f = g3VarArr;
    }
}
