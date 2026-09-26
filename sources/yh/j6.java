package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j6 implements View.OnClickListener {
    public final int f47572a = 1;
    public final boolean[] f47573b;
    public final Utilities.Callback2 f47574c;
    public final ci.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.e3[] f47575f;

    public j6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f47573b = zArr;
        this.f47574c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f47575f = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f47572a) {
            case 0:
                boolean[] zArr = this.f47573b;
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
                    this.f47574c.run(Long.valueOf(parseLong), new k6(editTextBoldCursor, this.f47575f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f47573b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f47574c.run(0L, new tg.r(zArr2, this.e, this.f47575f, 20));
                    return;
                }
                return;
        }
    }

    public j6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f47573b = zArr;
        this.f47574c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f47575f = e3VarArr;
    }
}
