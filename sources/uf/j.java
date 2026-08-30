package uf;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.a61;
public final class j extends i3 {
    public final int f45321x;
    public final k f45322y;

    public j(k kVar, Context context, String str, int i10, f6 f6Var, int i11) {
        super(context, str, false, false, i10, f6Var);
        this.f45321x = i11;
        switch (i11) {
            case 1:
                this.f45322y = kVar;
                super(context, str, true, false, i10, f6Var);
                return;
            default:
                this.f45322y = kVar;
                return;
        }
    }

    @Override
    public final void a(boolean z4) {
        a61 a61Var;
        a61 a61Var2;
        switch (this.f45321x) {
            case 0:
                if (z4 && (a61Var = this.f45322y.f23580a) != null) {
                    a61Var.x0(2);
                    return;
                }
                return;
            default:
                if (z4 && (a61Var2 = this.f45322y.f23580a) != null) {
                    a61Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f45321x) {
            case 0:
                k kVar = this.f45322y;
                kVar.f45332n.d(kVar.f45334s.getText().toString(), kVar.v.getText().toString());
                kVar.e0(true);
                return;
            default:
                k kVar2 = this.f45322y;
                kVar2.f45332n.d(kVar2.f45334s.getText().toString(), kVar2.v.getText().toString());
                kVar2.e0(true);
                return;
        }
    }
}
