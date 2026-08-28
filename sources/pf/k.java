package pf;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.j3;
import org.telegram.ui.Components.c51;
public final class k extends j3 {
    public final int f45657x;
    public final l f45658y;

    public k(l lVar, Context context, String str, int i9, b6 b6Var, int i10) {
        super(context, str, false, false, i9, b6Var);
        this.f45657x = i10;
        switch (i10) {
            case 1:
                this.f45658y = lVar;
                super(context, str, true, false, i9, b6Var);
                return;
            default:
                this.f45658y = lVar;
                return;
        }
    }

    @Override
    public final void a(boolean z10) {
        c51 c51Var;
        c51 c51Var2;
        switch (this.f45657x) {
            case 0:
                if (z10 && (c51Var = this.f45658y.f27658a) != null) {
                    c51Var.x0(2);
                    return;
                }
                return;
            default:
                if (z10 && (c51Var2 = this.f45658y.f27658a) != null) {
                    c51Var2.x0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        switch (this.f45657x) {
            case 0:
                l lVar = this.f45658y;
                lVar.f45669n.d(lVar.f45671s.getText().toString(), lVar.v.getText().toString());
                lVar.d0(true);
                return;
            default:
                l lVar2 = this.f45658y;
                lVar2.f45669n.d(lVar2.f45671s.getText().toString(), lVar2.v.getText().toString());
                lVar2.d0(true);
                return;
        }
    }
}
