package zh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d6 implements View.OnClickListener {
    public final int f50384a = 1;
    public final boolean[] f50385b;
    public final Utilities.Callback2 f50386c;
    public final di.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.e3[] f50387f;

    public d6(boolean[] zArr, Utilities.Callback2 callback2, di.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f50385b = zArr;
        this.f50386c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f50387f = e3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f50384a) {
            case 0:
                boolean[] zArr = this.f50385b;
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
                    this.f50386c.run(Long.valueOf(parseLong), new e6(editTextBoldCursor, this.f50387f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f50385b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f50386c.run(0L, new s4(zArr2, this.e, this.f50387f, 1));
                    return;
                }
                return;
        }
    }

    public d6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, di.d dVar, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f50385b = zArr;
        this.f50386c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f50387f = e3VarArr;
    }
}
