package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class g implements c, Serializable {
    public dd.a f47270a;
    public volatile Object f47271b;
    public final Object f47272c;

    public g(dd.a initializer) {
        j.e(initializer, "initializer");
        this.f47270a = initializer;
        this.f47271b = h.f47273a;
        this.f47272c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f47271b;
        h hVar = h.f47273a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f47272c) {
            obj = this.f47271b;
            if (obj == hVar) {
                dd.a aVar = this.f47270a;
                j.b(aVar);
                obj = aVar.invoke();
                this.f47271b = obj;
                this.f47270a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f47271b != h.f47273a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
