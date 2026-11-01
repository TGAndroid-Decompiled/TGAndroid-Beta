package vh;

import android.text.TextUtils;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.ew0;
public final class e2 extends j2 {
    public final k2 f51113y;

    public e2(k2 k2Var) {
        super(k2Var);
        this.f51113y = k2Var;
    }

    @Override
    public final void F(boolean z10) {
        k2 k2Var = this.f51113y;
        org.telegram.ui.ActionBar.t0 t0Var = k2Var.G;
        if (t0Var != null) {
            t0Var.setShowSearchProgress(z10);
        }
        k2Var.f51410s.e(z10, true);
    }

    @Override
    public final void f() {
        ew0 ew0Var = this.f51113y.f51410s;
        super.f();
        if (TextUtils.isEmpty(this.f51320f)) {
            ew0Var.setStickerType(11);
            ew0Var.d.setText(dd.L0(2131745777, null));
            return;
        }
        ew0Var.setStickerType(1);
        ew0Var.d.setText(dd.a0(null, null, 2131748182, this.f51320f));
    }
}
