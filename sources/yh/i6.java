package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i6 implements View.OnClickListener {
    public final int f47579a = 1;
    public final boolean[] f47580b;
    public final Utilities.Callback2 f47581c;
    public final ci.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.g3[] f47582f;

    public i6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f47580b = zArr;
        this.f47581c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f47582f = g3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f47579a) {
            case 0:
                boolean[] zArr = this.f47580b;
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
                    this.f47581c.run(Long.valueOf(parseLong), new j6(editTextBoldCursor, this.f47582f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f47580b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f47581c.run(0L, new tg.r(zArr2, this.e, this.f47582f, 20));
                    return;
                }
                return;
        }
    }

    public i6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.f47580b = zArr;
        this.f47581c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f47582f = g3VarArr;
    }
}
