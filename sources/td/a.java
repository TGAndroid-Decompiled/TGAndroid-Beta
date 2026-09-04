package td;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.i;
public final class a extends sd.a {
    @Override
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "current(...)");
        return current;
    }
}
