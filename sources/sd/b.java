package sd;

import com.google.android.gms.common.api.internal.n1;
import java.util.Random;
import kotlin.jvm.internal.i;
public final class b extends a {
    public final n1 f46016b = new n1(2);

    @Override
    public final Random a() {
        Object obj = this.f46016b.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
