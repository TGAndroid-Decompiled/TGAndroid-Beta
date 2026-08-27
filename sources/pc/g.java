package pc;

import java.io.Serializable;
import kotlin.jvm.internal.j;

public final class g implements c, Serializable {

    public ad.a f45692a;

    public volatile Object f45693b;

    public final Object f45694c;

    public g(ad.a initializer) {
        j.e(initializer, "initializer");
        this.f45692a = initializer;
        this.f45693b = h.f45695a;
        this.f45694c = this;
    }

    public final Object a() {
        Object objInvoke;
        Object obj = this.f45693b;
        h hVar = h.f45695a;
        if (obj != hVar) {
            return obj;
        }
        synchronized (this.f45694c) {
            objInvoke = this.f45693b;
            if (objInvoke == hVar) {
                ad.a aVar = this.f45692a;
                j.b(aVar);
                objInvoke = aVar.invoke();
                this.f45693b = objInvoke;
                this.f45692a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f45693b != h.f45695a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
