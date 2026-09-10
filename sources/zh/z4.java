package zh;

import java.util.List;
import org.telegram.messenger.Utilities;
public final class z4 implements Utilities.CallbackReturn {
    public final a5 f49147a;
    public final boolean f49148b;
    public final int f49149c;
    public final List d;

    public z4(a5 a5Var, boolean z10, int i10, List list) {
        this.f49147a = a5Var;
        this.f49148b = z10;
        this.f49149c = i10;
        this.d = list;
    }

    @Override
    public final Object run(Object obj) {
        Integer num = (Integer) obj;
        return Boolean.valueOf(this.f49147a.q(this.f49149c, this.d, this.f49148b));
    }
}
