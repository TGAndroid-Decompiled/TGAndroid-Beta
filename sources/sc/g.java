package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class g implements c, Serializable {
    public dd.a f44314a;
    public volatile Object f44315b;
    public final Object f44316c;

    public g(dd.a initializer) {
        j.e(initializer, "initializer");
        this.f44314a = initializer;
        this.f44315b = h.f44317a;
        this.f44316c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f44315b;
        h hVar = h.f44317a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f44316c) {
            obj = this.f44315b;
            if (obj == hVar) {
                dd.a aVar = this.f44314a;
                j.b(aVar);
                obj = aVar.invoke();
                this.f44315b = obj;
                this.f44314a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f44315b != h.f44317a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
