package rh;

import org.telegram.messenger.r20;
import org.telegram.tgnet.tl.TL_stars;
public final class e1 implements r20 {
    public final int f46803a;
    public final r20 f46804b;

    public e1(r20 r20Var, int i10) {
        this.f46803a = i10;
        this.f46804b = r20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f46803a) {
            case 0:
                this.f46804b.a((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                r20 r20Var = this.f46804b;
                if (r20Var != null) {
                    r20Var.a(bool);
                    return;
                }
                return;
        }
    }
}
