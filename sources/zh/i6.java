package zh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class i6 implements View.OnClickListener {
    public final int f52043a = 1;
    public final boolean[] f52044b;
    public final Utilities.Callback2 f52045c;
    public final di.d d;
    public final EditTextBoldCursor f52046e;
    public final org.telegram.ui.ActionBar.f3[] f52047f;

    public i6(boolean[] zArr, Utilities.Callback2 callback2, di.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52044b = zArr;
        this.f52045c = callback2;
        this.d = dVar;
        this.f52046e = editTextBoldCursor;
        this.f52047f = f3VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f52043a) {
            case 0:
                boolean[] zArr = this.f52044b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.f52046e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    if (TextUtils.isEmpty(obj)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(obj);
                    }
                    this.f52045c.run(Long.valueOf(parseLong), new j6(editTextBoldCursor, this.f52047f, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f52044b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f52045c.run(0L, new wh.n(zArr2, this.f52046e, this.f52047f, 17));
                    return;
                }
                return;
        }
    }

    public i6(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, di.d dVar, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.f52044b = zArr;
        this.f52045c = callback2;
        this.f52046e = editTextBoldCursor;
        this.d = dVar;
        this.f52047f = f3VarArr;
    }
}
