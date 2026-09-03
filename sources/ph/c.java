package ph;

import android.view.View;
import oh.d6;
import org.telegram.ui.Components.nr0;
public final class c implements View.OnClickListener {
    public final int f44407a;
    public final l f44408b;

    public c(l lVar, int i10) {
        this.f44407a = i10;
        this.f44408b = lVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f44407a) {
            case 0:
                l lVar = this.f44408b;
                nr0 nr0Var = lVar.T;
                d6 d6Var = lVar.f44422a;
                if (d6Var == null) {
                    str = "";
                } else {
                    str = d6Var.E;
                }
                nr0Var.a(str);
                return;
            default:
                l lVar2 = this.f44408b;
                lVar2.T.b(lVar2.f44422a.E);
                return;
        }
    }
}
