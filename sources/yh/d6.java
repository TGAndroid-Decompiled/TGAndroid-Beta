package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d6 implements View.OnClickListener {
    public final int f52394a = 1;
    public final boolean[] f52395b;
    public final Utilities.Callback2 f52396c;
    public final ci.d d;
    public final EditTextBoldCursor f52397e;
    public final org.telegram.ui.ActionBar.f3[] f52398f;

    public d6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52395b = zArr;
        this.f52396c = callback2;
        this.d = dVar;
        this.f52397e = editTextBoldCursor;
        this.f52398f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f52394a) {
            case 0:
                boolean[] zArr = this.f52395b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f52397e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f52396c.run(Long.valueOf(parseLong), new e6(editTextBoldCursor, this.f52398f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f52395b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f52396c.run(0L, new tg.q(zArr2, this.f52397e, this.f52398f, 22));
                    return;
                }
                return;
        }
    }

    public d6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52395b = zArr;
        this.f52396c = callback2;
        this.f52397e = editTextBoldCursor;
        this.d = dVar;
        this.f52398f = f3VarArr;
    }
}
