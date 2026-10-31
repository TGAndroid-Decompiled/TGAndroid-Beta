package th;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.Components.hm0;
public final class k3 extends hm0 {
    public o0 f49143f;
    public final y3 h;

    public k3(y3 y3Var, Context context, b bVar) {
        super(context, 13.0f, bVar);
        this.h = y3Var;
    }

    @Override
    public final void a(String str) {
        o0 o0Var = this.f49143f;
        if (o0Var != null) {
            org.telegram.messenger.i0.r(o0Var);
        }
        this.f49143f = new o0(4, this, str);
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.i0.h3(this.f49143f, 300L);
        } else {
            this.f49143f.run();
        }
        if (this.f49143f != null) {
            y3 y3Var = this.h;
            if (!y3Var.Q) {
                y3Var.Q = true;
                y3Var.f49678x.E();
                y3Var.f49679y.h1(0, -y3Var.f49675r.getPaddingTop());
            }
        }
    }
}
