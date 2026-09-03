package qh;

import android.text.Editable;
import android.text.TextWatcher;
public final class u6 implements TextWatcher {
    public final l6 f46171a;
    public final a7 f46172b;

    public u6(a7 a7Var, l6 l6Var) {
        this.f46172b = a7Var;
        this.f46171a = l6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f46171a.run();
        a7 a7Var = this.f46172b;
        org.telegram.ui.Cells.i3 i3Var = a7Var.V;
        if (a7Var.Z) {
            return;
        }
        if (a7Var.f44982a0 && editable != null) {
            String substring = editable.toString().substring(8);
            a7Var.Z = true;
            i3Var.f22957b.setText(substring);
            org.telegram.ui.Cells.g3 g3Var = i3Var.f22957b;
            g3Var.setSelection(0, g3Var.getText().length());
            a7Var.Z = false;
            a7Var.f44982a0 = false;
            a7.S(a7Var, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        a7.S(a7Var, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        a7 a7Var = this.f46172b;
        if (a7Var.Z) {
            return;
        }
        boolean z4 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z4 = true;
        }
        a7Var.f44982a0 = z4;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
