package zh;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gn0;
public final class l3 extends gn0 {
    public yg.q h;
    public final z3 f48640n;

    public l3(z3 z3Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.f48640n = z3Var;
    }

    @Override
    public final void a(String str) {
        yg.q qVar = this.h;
        if (qVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qVar);
        }
        this.h = new yg.q(12, this, str);
        if (!TextUtils.isEmpty(str)) {
            AndroidUtilities.runOnUIThread(this.h, 300L);
        } else {
            this.h.run();
        }
        if (this.h != null) {
            z3 z3Var = this.f48640n;
            if (!z3Var.Q) {
                z3Var.Q = true;
                z3Var.f49144w.E();
                z3Var.f49145x.h1(0, -z3Var.f49142r.getPaddingTop());
            }
        }
    }
}
