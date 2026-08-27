package rc;

import ad.p;
import java.io.Serializable;
import kotlin.jvm.internal.j;

public final class b implements h, Serializable {

    public final h f46896a;

    public final f f46897b;

    public b(f element, h left) {
        j.e(left, "left");
        j.e(element, "element");
        this.f46896a = left;
        this.f46897b = element;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i10 = 2;
            b bVar2 = bVar;
            int i11 = 2;
            while (true) {
                h hVar = bVar2.f46896a;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i11++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.f46896a;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 == i10) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.f46897b;
                    if (!j.a(bVar.get(fVar.getKey()), fVar)) {
                        zA = false;
                        break;
                    }
                    h hVar3 = bVar4.f46896a;
                    if (!(hVar3 instanceof b)) {
                        j.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        zA = j.a(bVar.get(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(this.f46896a.fold(obj, pVar), this.f46897b);
    }

    @Override
    public final f get(g key) {
        j.e(key, "key");
        b bVar = this;
        while (true) {
            f fVar = bVar.f46897b.get(key);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.f46896a;
            if (!(hVar instanceof b)) {
                return hVar.get(key);
            }
            bVar = (b) hVar;
        }
    }

    public final int hashCode() {
        return this.f46897b.hashCode() + this.f46896a.hashCode();
    }

    @Override
    public final h minusKey(g key) {
        j.e(key, "key");
        f fVar = this.f46897b;
        f fVar2 = fVar.get(key);
        h hVar = this.f46896a;
        if (fVar2 != null) {
            return hVar;
        }
        h hVarMinusKey = hVar.minusKey(key);
        if (hVarMinusKey == hVar) {
            return this;
        }
        return hVarMinusKey == i.f46899a ? fVar : new b(fVar, hVarMinusKey);
    }

    @Override
    public final h plus(h context) {
        j.e(context, "context");
        return context == i.f46899a ? this : (h) context.fold(this, new b1.e(5));
    }

    public final String toString() {
        return "[" + ((String) fold("", new b1.e(4))) + ']';
    }
}
