package vf;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i3;
import org.telegram.ui.Components.b61;
public final class j extends i3 {
    public final int f49066x;
    public final k f49067y;

    public j(k kVar, Context context, String str, int i10, g6 g6Var, int i11) {
        super(context, str, false, false, i10, g6Var);
        this.f49066x = i11;
        switch (i11) {
            case 1:
                this.f49067y = kVar;
                super(context, str, true, false, i10, g6Var);
                return;
            default:
                this.f49067y = kVar;
                return;
        }
    }

    @Override
    public final void a(boolean z4) {
        b61 b61Var;
        b61 b61Var2;
        switch (this.f49066x) {
            case 0:
                if (z4 && (b61Var = this.f49067y.f25815a) != null) {
                    b61Var.x0(2);
                    return;
                }
                return;
            default:
                if (z4 && (b61Var2 = this.f49067y.f25815a) != null) {
                    b61Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f49066x) {
            case 0:
                k kVar = this.f49067y;
                kVar.f49078n.d(kVar.f49080s.getText().toString(), kVar.v.getText().toString());
                kVar.e0(true);
                return;
            default:
                k kVar2 = this.f49067y;
                kVar2.f49078n.d(kVar2.f49080s.getText().toString(), kVar2.v.getText().toString());
                kVar2.e0(true);
                return;
        }
    }
}
