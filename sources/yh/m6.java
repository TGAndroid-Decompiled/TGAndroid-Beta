package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class m6 implements View.OnClickListener {
    public final int f51638a = 1;
    public final boolean[] f51639b;
    public final Utilities.Callback2 f51640c;
    public final ci.d d;
    public final EditTextBoldCursor f51641e;
    public final org.telegram.ui.ActionBar.f3[] f51642f;

    public m6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f51639b = zArr;
        this.f51640c = callback2;
        this.d = dVar;
        this.f51641e = editTextBoldCursor;
        this.f51642f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f51638a) {
            case 0:
                boolean[] zArr = this.f51639b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f51641e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f51640c.run(Long.valueOf(parseLong), new n6(editTextBoldCursor, this.f51642f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f51639b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f51640c.run(0L, new tg.q(zArr2, this.f51641e, this.f51642f, 21));
                    return;
                }
                return;
        }
    }

    public m6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f51639b = zArr;
        this.f51640c = callback2;
        this.f51641e = editTextBoldCursor;
        this.d = dVar;
        this.f51642f = f3VarArr;
    }
}
