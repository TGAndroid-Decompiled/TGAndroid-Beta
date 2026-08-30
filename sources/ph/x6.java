package ph;

import android.text.Editable;
import android.text.TextWatcher;
public final class x6 implements TextWatcher {
    public final f6 f42560a;
    public final d7 f42561b;

    public x6(d7 d7Var, f6 f6Var) {
        this.f42561b = d7Var;
        this.f42560a = f6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.f42560a.run();
        d7 d7Var = this.f42561b;
        org.telegram.ui.Cells.i3 i3Var = d7Var.V;
        if (d7Var.Z) {
            return;
        }
        if (d7Var.f41454a0 && editable != null) {
            String substring = editable.toString().substring(8);
            d7Var.Z = true;
            i3Var.f21199b.setText(substring);
            org.telegram.ui.Cells.g3 g3Var = i3Var.f21199b;
            g3Var.setSelection(0, g3Var.getText().length());
            d7Var.Z = false;
            d7Var.f41454a0 = false;
            d7.S(d7Var, substring);
            return;
        }
        if (editable == null) {
            obj = null;
        } else {
            obj = editable.toString();
        }
        d7.S(d7Var, obj);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        d7 d7Var = this.f42561b;
        if (d7Var.Z) {
            return;
        }
        boolean z4 = false;
        if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
            z4 = true;
        }
        d7Var.f41454a0 = z4;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
