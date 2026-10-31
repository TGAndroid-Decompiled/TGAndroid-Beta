package th;

import java.util.List;
import org.telegram.messenger.r20;
public final class w4 implements r20 {
    public final x4 f49570a;
    public final boolean f49571b;
    public final int f49572c;
    public final List d;

    public w4(x4 x4Var, boolean z10, int i10, List list) {
        this.f49570a = x4Var;
        this.f49571b = z10;
        this.f49572c = i10;
        this.d = list;
    }

    @Override
    public final Object a(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f49570a.q(this.f49572c, this.d, this.f49571b));
    }
}
