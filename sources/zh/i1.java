package zh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.w70;
public final class i1 implements View.OnLongClickListener {
    public final int f48487a;
    public final a3 f48488b;

    public i1(a3 a3Var, int i10) {
        this.f48487a = i10;
        this.f48488b = a3Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f48487a) {
            case 0:
                a3 a3Var = this.f48488b;
                boolean z10 = false;
                if (a3Var.D0(true)) {
                    return false;
                }
                w70 F = w70.F(a3Var.J0.v, a3Var.B0, view);
                F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new j1(a3Var, 6), false);
                if (a3Var.L3 > 0) {
                    z10 = true;
                }
                F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new j1(a3Var, 7), z10);
                F.V(5);
                F.U = true;
                F.Z();
                return true;
            default:
                a3 a3Var2 = this.f48488b;
                a3Var2.L0.k(a3Var2.D0(false));
                return true;
        }
    }
}
