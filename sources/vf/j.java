package vf;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.a61;
public final class j extends i3 {
    public final int f49101x;
    public final k f49102y;

    public j(k kVar, Context context, String str, int i10, g6 g6Var, int i11) {
        super(context, str, false, false, i10, g6Var);
        this.f49101x = i11;
        switch (i11) {
            case 1:
                this.f49102y = kVar;
                super(context, str, true, false, i10, g6Var);
                return;
            default:
                this.f49102y = kVar;
                return;
        }
    }

    @Override
    public final void a(boolean z4) {
        a61 a61Var;
        a61 a61Var2;
        switch (this.f49101x) {
            case 0:
                if (z4 && (a61Var = this.f49102y.f25523a) != null) {
                    a61Var.x0(2);
                    return;
                }
                return;
            default:
                if (z4 && (a61Var2 = this.f49102y.f25523a) != null) {
                    a61Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f49101x) {
            case 0:
                k kVar = this.f49102y;
                kVar.f49114n.d(kVar.f49116s.getText().toString(), kVar.v.getText().toString());
                kVar.e0(true);
                return;
            default:
                k kVar2 = this.f49102y;
                kVar2.f49114n.d(kVar2.f49116s.getText().toString(), kVar2.v.getText().toString());
                kVar2.e0(true);
                return;
        }
    }
}
