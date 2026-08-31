package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class g implements c, Serializable {
    public dd.a f47239a;
    public volatile Object f47240b;
    public final Object f47241c;

    public g(dd.a initializer) {
        j.e(initializer, "initializer");
        this.f47239a = initializer;
        this.f47240b = h.f47242a;
        this.f47241c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f47240b;
        h hVar = h.f47242a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f47241c) {
            obj = this.f47240b;
            if (obj == hVar) {
                dd.a aVar = this.f47239a;
                j.b(aVar);
                obj = aVar.invoke();
                this.f47240b = obj;
                this.f47239a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f47240b != h.f47242a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
