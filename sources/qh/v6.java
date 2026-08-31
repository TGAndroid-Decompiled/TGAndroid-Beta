package qh;

import android.text.Editable;
import android.text.TextWatcher;
public final class v6 implements TextWatcher {
    public final d6 f46195a;
    public final b7 f46196b;

    public v6(b7 b7Var, d6 d6Var) {
        this.f46196b = b7Var;
        this.f46195a = d6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f46195a.run();
        b7 b7Var = this.f46196b;
        org.telegram.ui.Cells.i3 i3Var = b7Var.V;
        if (b7Var.Z) {
            return;
        }
        if (b7Var.f45005a0 && editable != null) {
            String substring = editable.toString().substring(8);
            b7Var.Z = true;
            i3Var.f22955b.setText(substring);
            org.telegram.ui.Cells.g3 g3Var = i3Var.f22955b;
            g3Var.setSelection(0, g3Var.getText().length());
            b7Var.Z = false;
            b7Var.f45005a0 = false;
            b7.S(b7Var, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        b7.S(b7Var, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        b7 b7Var = this.f46196b;
        if (b7Var.Z) {
            return;
        }
        boolean z4 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z4 = true;
        }
        b7Var.f45005a0 = z4;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
