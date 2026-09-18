package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j6 implements View.OnClickListener {
    public final int f47565a = 1;
    public final boolean[] f47566b;
    public final Utilities.Callback2 f47567c;
    public final ci.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.f3[] f47568f;

    public j6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f47566b = zArr;
        this.f47567c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f47568f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f47565a) {
            case 0:
                boolean[] zArr = this.f47566b;
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
                    this.f47567c.run(Long.valueOf(parseLong), new k6(editTextBoldCursor, this.f47568f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f47566b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f47567c.run(0L, new tg.r(zArr2, this.e, this.f47568f, 20));
                    return;
                }
                return;
        }
    }

    public j6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f47566b = zArr;
        this.f47567c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f47568f = f3VarArr;
    }
}
