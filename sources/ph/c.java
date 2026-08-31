package ph;

import android.view.View;
import oh.d6;
import org.telegram.ui.Components.or0;
public final class c implements View.OnClickListener {
    public final int f44376a;
    public final l f44377b;

    public c(l lVar, int i10) {
        this.f44376a = i10;
        this.f44377b = lVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f44376a) {
            case 0:
                l lVar = this.f44377b;
                or0 or0Var = lVar.T;
                d6 d6Var = lVar.f44391a;
                if (d6Var == null) {
                    str = "";
                } else {
                    str = d6Var.E;
                }
                or0Var.a(str);
                return;
            default:
                l lVar2 = this.f44377b;
                lVar2.T.b(lVar2.f44391a.E);
                return;
        }
    }
}
