package yh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class m6 implements View.OnClickListener {
    public final int f51633a = 1;
    public final boolean[] f51634b;
    public final Utilities.Callback2 f51635c;
    public final ci.d d;
    public final EditTextBoldCursor f51636e;
    public final org.telegram.ui.ActionBar.f3[] f51637f;

    public m6(boolean[] zArr, Utilities.Callback2 callback2, ci.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f51634b = zArr;
        this.f51635c = callback2;
        this.d = dVar;
        this.f51636e = editTextBoldCursor;
        this.f51637f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f51633a) {
            case 0:
                boolean[] zArr = this.f51634b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f51636e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f51635c.run(Long.valueOf(parseLong), new n6(editTextBoldCursor, this.f51637f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f51634b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f51635c.run(0L, new tg.q(zArr2, this.f51636e, this.f51637f, 21));
                    return;
                }
                return;
        }
    }

    public m6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ci.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f51634b = zArr;
        this.f51635c = callback2;
        this.f51636e = editTextBoldCursor;
        this.d = dVar;
        this.f51637f = f3VarArr;
    }
}
