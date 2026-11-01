package th;

import java.util.List;
import org.telegram.messenger.s20;
public final class w4 implements s20 {
    public final x4 f49584a;
    public final boolean f49585b;
    public final int f49586c;
    public final List d;

    public w4(x4 x4Var, boolean z10, int i10, List list) {
        this.f49584a = x4Var;
        this.f49585b = z10;
        this.f49586c = i10;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f49584a.q(this.f49586c, this.d, this.f49585b));
    }
}
