package uc;

import dd.p;
import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class i implements h, Serializable {
    public static final i f45219a = new Object();

    @Override
    public final f get(g key) {
        j.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override
    public final h minusKey(g key) {
        j.e(key, "key");
        return this;
    }

    @Override
    public final h plus(h context) {
        j.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
