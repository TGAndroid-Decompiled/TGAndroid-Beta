package xh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l6 implements View.OnClickListener {
    public final int f45670a = 1;
    public final boolean[] f45671b;
    public final Utilities.Callback2 f45672c;
    public final bi.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.h3[] f45673f;

    public l6(boolean[] zArr, Utilities.Callback2 callback2, bi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f45671b = zArr;
        this.f45672c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f45673f = h3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f45670a) {
            case 0:
                boolean[] zArr = this.f45671b;
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
                    this.f45672c.run(Long.valueOf(parseLong), new m6(editTextBoldCursor, this.f45673f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f45671b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f45672c.run(0L, new n1(zArr2, this.e, this.f45673f, 9));
                    return;
                }
                return;
        }
    }

    public l6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, bi.d dVar, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.f45671b = zArr;
        this.f45672c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f45673f = h3VarArr;
    }
}
