package rh;

import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_stars;
public final class e1 implements q20 {
    public final int f46789a;
    public final q20 f46790b;

    public e1(q20 q20Var, int i10) {
        this.f46789a = i10;
        this.f46790b = q20Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f46789a) {
            case 0:
                this.f46790b.a((TL_stars.StarGift) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                q20 q20Var = this.f46790b;
                if (q20Var != null) {
                    q20Var.a(bool);
                    return;
                }
                return;
        }
    }
}
