package rh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.k20;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class u6 implements View.OnClickListener {
    public final int f47560a = 0;
    public final boolean[] f47561b;
    public final k20 f47562c;
    public final vh.d d;
    public final EditTextBoldCursor e;
    public final org.telegram.ui.ActionBar.z2[] f47563f;

    public u6(boolean[] zArr, k20 k20Var, EditTextBoldCursor editTextBoldCursor, vh.d dVar, org.telegram.ui.ActionBar.z2[] z2VarArr) {
        this.f47561b = zArr;
        this.f47562c = k20Var;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f47563f = z2VarArr;
    }

    @Override
    public final void onClick(View view) {
        long parseLong;
        switch (this.f47560a) {
            case 0:
                boolean[] zArr = this.f47561b;
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
                    this.f47562c.a(Long.valueOf(parseLong), new w6(editTextBoldCursor, this.f47563f, 2));
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f47561b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.f47562c.a(0L, new l5(zArr2, this.e, this.f47563f, 2));
                    return;
                }
                return;
        }
    }

    public u6(boolean[] zArr, k20 k20Var, vh.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.z2[] z2VarArr) {
        this.f47561b = zArr;
        this.f47562c = k20Var;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f47563f = z2VarArr;
    }
}
