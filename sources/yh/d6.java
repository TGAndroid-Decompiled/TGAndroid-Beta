package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d6 implements View.OnClickListener {
    public final int f52481a = 1;
    public final boolean[] f52482b;
    public final Utilities.Callback2 f52483c;
    public final ci.d d;
    public final EditTextBoldCursor f52484e;
    public final org.telegram.ui.ActionBar.e3[] f52485f;

    public d6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f52482b = zArr;
        this.f52483c = callback2;
        this.d = dVar;
        this.f52484e = editTextBoldCursor;
        this.f52485f = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f52481a) {
            case 0:
                boolean[] zArr = this.f52482b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f52484e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f52483c.run(Long.valueOf(parseLong), new e6(editTextBoldCursor, this.f52485f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f52482b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f52483c.run(0L, new pi.h(zArr2, this.f52484e, this.f52485f, 24));
                    return;
                }
                return;
        }
    }

    public d6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f52482b = zArr;
        this.f52483c = callback2;
        this.f52484e = editTextBoldCursor;
        this.d = dVar;
        this.f52485f = e3VarArr;
    }
}
