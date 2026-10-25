package vd;

import com.google.android.gms.common.api.internal.m1;
import java.util.Random;
import kotlin.jvm.internal.i;
public final class b extends a {
    public final m1 f50104b = new m1(2);

    @Override
    public final Random a() {
        Object obj = this.f50104b.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
