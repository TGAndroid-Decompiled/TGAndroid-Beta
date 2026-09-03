package ph;

import android.text.Editable;
import android.text.TextWatcher;
public final class w6 implements TextWatcher {
    public final e6 f42542a;
    public final c7 f42543b;

    public w6(c7 c7Var, e6 e6Var) {
        this.f42543b = c7Var;
        this.f42542a = e6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f42542a.run();
        c7 c7Var = this.f42543b;
        org.telegram.ui.Cells.h3 h3Var = c7Var.V;
        if (c7Var.Z) {
            return;
        }
        if (c7Var.f41425a0 && editable != null) {
            String substring = editable.toString().substring(8);
            c7Var.Z = true;
            h3Var.f21132b.setText(substring);
            org.telegram.ui.Cells.f3 f3Var = h3Var.f21132b;
            f3Var.setSelection(0, f3Var.getText().length());
            c7Var.Z = false;
            c7Var.f41425a0 = false;
            c7.S(c7Var, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        c7.S(c7Var, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        c7 c7Var = this.f42543b;
        if (c7Var.Z) {
            return;
        }
        boolean z4 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z4 = true;
        }
        c7Var.f41425a0 = z4;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
