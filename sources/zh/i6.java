package zh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i6 implements View.OnClickListener {
    public final int f52073a = 1;
    public final boolean[] f52074b;
    public final Utilities.Callback2 f52075c;
    public final di.d d;
    public final EditTextBoldCursor f52076e;
    public final org.telegram.ui.ActionBar.f3[] f52077f;

    public i6(boolean[] zArr, Utilities.Callback2 callback2, di.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52074b = zArr;
        this.f52075c = callback2;
        this.d = dVar;
        this.f52076e = editTextBoldCursor;
        this.f52077f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f52073a) {
            case 0:
                boolean[] zArr = this.f52074b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f52076e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f52075c.run(Long.valueOf(parseLong), new j6(editTextBoldCursor, this.f52077f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f52074b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f52075c.run(0L, new wh.n(zArr2, this.f52076e, this.f52077f, 17));
                    return;
                }
                return;
        }
    }

    public i6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, di.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52074b = zArr;
        this.f52075c = callback2;
        this.f52076e = editTextBoldCursor;
        this.d = dVar;
        this.f52077f = f3VarArr;
    }
}
