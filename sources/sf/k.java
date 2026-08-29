package sf;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.o51;
public final class k extends g3 {
    public final int f47830x;
    public final l f47831y;

    public k(l lVar, Context context, String str, int i10, c6 c6Var, int i11) {
        super(context, str, false, false, i10, c6Var);
        this.f47830x = i11;
        switch (i11) {
            case 1:
                this.f47831y = lVar;
                super(context, str, true, false, i10, c6Var);
                return;
            default:
                this.f47831y = lVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        o51 o51Var;
        o51 o51Var2;
        switch (this.f47830x) {
            case 0:
                if (z10 && (o51Var = this.f47831y.f31601a) != null) {
                    o51Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (o51Var2 = this.f47831y.f31601a) != null) {
                    o51Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f47830x) {
            case 0:
                l lVar = this.f47831y;
                lVar.f47843n.d(lVar.f47845s.getText().toString(), lVar.v.getText().toString());
                lVar.e0(true);
                return;
            default:
                l lVar2 = this.f47831y;
                lVar2.f47843n.d(lVar2.f47845s.getText().toString(), lVar2.v.getText().toString());
                lVar2.e0(true);
                return;
        }
    }
}
