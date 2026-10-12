package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d6 implements View.OnClickListener {
    public final int f52618a = 1;
    public final boolean[] f52619b;
    public final Utilities.Callback2 f52620c;
    public final ci.d d;
    public final EditTextBoldCursor f52621e;
    public final org.telegram.ui.ActionBar.e3[] f52622f;

    public d6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f52619b = zArr;
        this.f52620c = callback2;
        this.d = dVar;
        this.f52621e = editTextBoldCursor;
        this.f52622f = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f52618a) {
            case 0:
                boolean[] zArr = this.f52619b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f52621e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f52620c.run(Long.valueOf(parseLong), new e6(editTextBoldCursor, this.f52622f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f52619b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f52620c.run(0L, new pi.h(zArr2, this.f52621e, this.f52622f, 28));
                    return;
                }
                return;
        }
    }

    public d6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f52619b = zArr;
        this.f52620c = callback2;
        this.f52621e = editTextBoldCursor;
        this.d = dVar;
        this.f52622f = e3VarArr;
    }
}
