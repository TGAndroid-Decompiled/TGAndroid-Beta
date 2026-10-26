package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l1 implements Utilities.Callback {
    public final int f53099a;
    public final Object f53100b;

    public l1(Object obj, int i10) {
        this.f53099a = i10;
        this.f53100b = obj;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f53099a) {
            case 0:
                Boolean bool = (Boolean) obj;
                ((m1) this.f53100b).a();
                return;
            case 1:
                ((h4) this.f53100b).f0(((Boolean) obj).booleanValue());
                return;
            case 2:
                ((Boolean) obj).getClass();
                y3 y3Var = ((f4) this.f53100b).d;
                if (y3Var != null) {
                    y3Var.run();
                    return;
                }
                return;
            default:
                vg.j.j(((y4) this.f53100b).getContext(), (TLRPC.TL_error) obj);
                return;
        }
    }
}
