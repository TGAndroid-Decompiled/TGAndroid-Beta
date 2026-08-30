package sc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class g implements c, Serializable {
    public dd.a f44249a;
    public volatile Object f44250b;
    public final Object f44251c;

    public g(dd.a initializer) {
        j.e(initializer, "initializer");
        this.f44249a = initializer;
        this.f44250b = h.f44252a;
        this.f44251c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f44250b;
        h hVar = h.f44252a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f44251c) {
            obj = this.f44250b;
            if (obj == hVar) {
                dd.a aVar = this.f44249a;
                j.b(aVar);
                obj = aVar.invoke();
                this.f44250b = obj;
                this.f44249a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f44250b != h.f44252a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
