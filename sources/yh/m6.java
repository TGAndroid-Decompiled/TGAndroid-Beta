package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class m6 implements View.OnClickListener {
    public final int f51632a = 1;
    public final boolean[] f51633b;
    public final Utilities.Callback2 f51634c;
    public final ci.d d;
    public final EditTextBoldCursor f51635e;
    public final org.telegram.ui.ActionBar.f3[] f51636f;

    public m6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f51633b = zArr;
        this.f51634c = callback2;
        this.d = dVar;
        this.f51635e = editTextBoldCursor;
        this.f51636f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f51632a) {
            case 0:
                boolean[] zArr = this.f51633b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f51635e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f51634c.run(Long.valueOf(parseLong), new n6(editTextBoldCursor, this.f51636f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f51633b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f51634c.run(0L, new tg.q(zArr2, this.f51635e, this.f51636f, 21));
                    return;
                }
                return;
        }
    }

    public m6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f51633b = zArr;
        this.f51634c = callback2;
        this.f51635e = editTextBoldCursor;
        this.d = dVar;
        this.f51636f = f3VarArr;
    }
}
