package uh;

import android.view.View;
import org.telegram.ui.Components.uq0;
import th.q4;
public final class a implements View.OnClickListener {
    public final int f50232a;
    public final i f50233b;

    public a(i iVar, int i10) {
        this.f50232a = i10;
        this.f50233b = iVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f50232a) {
            case 0:
                i iVar = this.f50233b;
                uq0 uq0Var = iVar.W;
                q4 q4Var = iVar.f50245a;
                if (q4Var == null) {
                    str = "";
                } else {
                    str = q4Var.E;
                }
                uq0Var.a(str);
                return;
            default:
                i iVar2 = this.f50233b;
                iVar2.W.b(iVar2.f50245a.E);
                return;
        }
    }
}
