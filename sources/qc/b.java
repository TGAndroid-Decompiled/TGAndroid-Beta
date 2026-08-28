package qc;

import java.io.Serializable;
import zc.p;
public final class b implements h, Serializable {
    public final h f46137a;
    public final f f46138b;

    public b(f element, h left) {
        kotlin.jvm.internal.i.e(left, "left");
        kotlin.jvm.internal.i.e(element, "element");
        this.f46137a = left;
        this.f46138b = element;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i9 = 2;
                b bVar2 = bVar;
                int i10 = 2;
                while (true) {
                    h hVar = bVar2.f46137a;
                    if (hVar instanceof b) {
                        bVar2 = (b) hVar;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        break;
                    }
                    i10++;
                }
                b bVar3 = this;
                while (true) {
                    h hVar2 = bVar3.f46137a;
                    if (hVar2 instanceof b) {
                        bVar3 = (b) hVar2;
                    } else {
                        bVar3 = null;
                    }
                    if (bVar3 == null) {
                        break;
                    }
                    i9++;
                }
                if (i10 == i9) {
                    b bVar4 = this;
                    while (true) {
                        f fVar = bVar4.f46138b;
                        if (!kotlin.jvm.internal.i.a(bVar.get(fVar.getKey()), fVar)) {
                            z10 = false;
                            break;
                        }
                        h hVar3 = bVar4.f46137a;
                        if (hVar3 instanceof b) {
                            bVar4 = (b) hVar3;
                        } else {
                            kotlin.jvm.internal.i.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            f fVar2 = (f) hVar3;
                            z10 = kotlin.jvm.internal.i.a(bVar.get(fVar2.getKey()), fVar2);
                            break;
                        }
                    }
                    if (z10) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(this.f46137a.fold(obj, pVar), this.f46138b);
    }

    @Override
    public final f get(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        b bVar = this;
        while (true) {
            f fVar = bVar.f46138b.get(key);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.f46137a;
            if (hVar instanceof b) {
                bVar = (b) hVar;
            } else {
                return hVar.get(key);
            }
        }
    }

    public final int hashCode() {
        return this.f46138b.hashCode() + this.f46137a.hashCode();
    }

    @Override
    public final h minusKey(g key) {
        kotlin.jvm.internal.i.e(key, "key");
        f fVar = this.f46138b;
        f fVar2 = fVar.get(key);
        h hVar = this.f46137a;
        if (fVar2 != null) {
            return hVar;
        }
        h minusKey = hVar.minusKey(key);
        if (minusKey == hVar) {
            return this;
        }
        if (minusKey == i.f46140a) {
            return fVar;
        }
        return new b(fVar, minusKey);
    }

    @Override
    public final h plus(h context) {
        kotlin.jvm.internal.i.e(context, "context");
        if (context == i.f46140a) {
            return this;
        }
        return (h) context.fold(this, new b1.e(5));
    }

    public final String toString() {
        return "[" + ((String) fold("", new b1.e(4))) + ']';
    }
}
