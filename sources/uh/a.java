package uh;

import android.view.View;
import org.telegram.ui.Components.vq0;
import th.q4;
public final class a implements View.OnClickListener {
    public final int f50246a;
    public final i f50247b;

    public a(i iVar, int i10) {
        this.f50246a = i10;
        this.f50247b = iVar;
    }

    @Override
    public final void onClick(View view) {
        String str;
        switch (this.f50246a) {
            case 0:
                i iVar = this.f50247b;
                vq0 vq0Var = iVar.W;
                q4 q4Var = iVar.f50259a;
                if (q4Var == null) {
                    str = "";
                } else {
                    str = q4Var.E;
                }
                vq0Var.a(str);
                return;
            default:
                i iVar2 = this.f50247b;
                iVar2.W.b(iVar2.f50259a.E);
                return;
        }
    }
}
