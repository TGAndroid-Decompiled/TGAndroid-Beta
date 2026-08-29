package qc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class g implements c, Serializable {
    public bd.a f46599a;
    public volatile Object f46600b;
    public final Object f46601c;

    public g(bd.a initializer) {
        j.e(initializer, "initializer");
        this.f46599a = initializer;
        this.f46600b = h.f46602a;
        this.f46601c = this;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f46600b;
        h hVar = h.f46602a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f46601c) {
            obj = this.f46600b;
            if (obj == hVar) {
                bd.a aVar = this.f46599a;
                j.b(aVar);
                obj = aVar.invoke();
                this.f46600b = obj;
                this.f46599a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f46600b != h.f46602a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
