package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d6 implements View.OnClickListener {
    public final int f52624a = 1;
    public final boolean[] f52625b;
    public final Utilities.Callback2 f52626c;
    public final ci.d d;
    public final EditTextBoldCursor f52627e;
    public final org.telegram.ui.ActionBar.e3[] f52628f;

    public d6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f52625b = zArr;
        this.f52626c = callback2;
        this.d = dVar;
        this.f52627e = editTextBoldCursor;
        this.f52628f = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f52624a) {
            case 0:
                boolean[] zArr = this.f52625b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f52627e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f52626c.run(Long.valueOf(parseLong), new e6(editTextBoldCursor, this.f52628f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f52625b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f52626c.run(0L, new pi.i(zArr2, this.f52627e, this.f52628f, 27));
                    return;
                }
                return;
        }
    }

    public d6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f52625b = zArr;
        this.f52626c = callback2;
        this.f52627e = editTextBoldCursor;
        this.d = dVar;
        this.f52628f = e3VarArr;
    }
}
