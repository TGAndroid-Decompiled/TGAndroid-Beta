package vh;

import android.text.TextUtils;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.dw0;
public final class e2 extends j2 {
    public final k2 f51098y;

    public e2(k2 k2Var) {
        super(k2Var);
        this.f51098y = k2Var;
    }

    @Override
    public final void F(boolean z10) {
        k2 k2Var = this.f51098y;
        org.telegram.ui.ActionBar.t0 t0Var = k2Var.G;
        if (t0Var != null) {
            t0Var.setShowSearchProgress(z10);
        }
        k2Var.f51395s.e(z10, true);
    }

    @Override
    public final void f() {
        dw0 dw0Var = this.f51098y.f51395s;
        super.f();
        if (TextUtils.isEmpty(this.f51305f)) {
            dw0Var.setStickerType(11);
            dw0Var.d.setText(cd.L0(2131745777, null));
            return;
        }
        dw0Var.setStickerType(1);
        dw0Var.d.setText(cd.a0(null, null, 2131748182, this.f51305f));
    }
}
