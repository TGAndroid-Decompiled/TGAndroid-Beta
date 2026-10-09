package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d6 implements View.OnClickListener {
    public final int f52392a = 1;
    public final boolean[] f52393b;
    public final Utilities.Callback2 f52394c;
    public final ci.d d;
    public final EditTextBoldCursor f52395e;
    public final org.telegram.ui.ActionBar.f3[] f52396f;

    public d6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52393b = zArr;
        this.f52394c = callback2;
        this.d = dVar;
        this.f52395e = editTextBoldCursor;
        this.f52396f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f52392a) {
            case 0:
                boolean[] zArr = this.f52393b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f52395e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f52394c.run(Long.valueOf(parseLong), new e6(editTextBoldCursor, this.f52396f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f52393b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f52394c.run(0L, new tg.q(zArr2, this.f52395e, this.f52396f, 22));
                    return;
                }
                return;
        }
    }

    public d6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52393b = zArr;
        this.f52394c = callback2;
        this.f52395e = editTextBoldCursor;
        this.d = dVar;
        this.f52396f = f3VarArr;
    }
}
