package sc;

import bd.p;
import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class b implements h, Serializable {
    public final h f47708a;
    public final f f47709b;

    public b(f element, h left) {
        j.e(left, "left");
        j.e(element, "element");
        this.f47708a = left;
        this.f47709b = element;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = 2;
                b bVar2 = bVar;
                int i11 = 2;
                while (true) {
                    h hVar = bVar2.f47708a;
                    if (hVar instanceof b) {
                        bVar2 = (b) hVar;
                    } else {
                        bVar2 = null;
                    }
                    if (bVar2 == null) {
                        break;
                    }
                    i11++;
                }
                b bVar3 = this;
                while (true) {
                    h hVar2 = bVar3.f47708a;
                    if (hVar2 instanceof b) {
                        bVar3 = (b) hVar2;
                    } else {
                        bVar3 = null;
                    }
                    if (bVar3 == null) {
                        break;
                    }
                    i10++;
                }
                if (i11 == i10) {
                    b bVar4 = this;
                    while (true) {
                        f fVar = bVar4.f47709b;
                        if (!j.a(bVar.get(fVar.getKey()), fVar)) {
                            z10 = false;
                            break;
                        }
                        h hVar3 = bVar4.f47708a;
                        if (hVar3 instanceof b) {
                            bVar4 = (b) hVar3;
                        } else {
                            j.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            f fVar2 = (f) hVar3;
                            z10 = j.a(bVar.get(fVar2.getKey()), fVar2);
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
        return pVar.invoke(this.f47708a.fold(obj, pVar), this.f47709b);
    }

    @Override
    public final f get(g key) {
        j.e(key, "key");
        b bVar = this;
        while (true) {
            f fVar = bVar.f47709b.get(key);
            if (fVar != null) {
                return fVar;
            }
            h hVar = bVar.f47708a;
            if (hVar instanceof b) {
                bVar = (b) hVar;
            } else {
                return hVar.get(key);
            }
        }
    }

    public final int hashCode() {
        return this.f47709b.hashCode() + this.f47708a.hashCode();
    }

    @Override
    public final h minusKey(g key) {
        j.e(key, "key");
        f fVar = this.f47709b;
        f fVar2 = fVar.get(key);
        h hVar = this.f47708a;
        if (fVar2 != null) {
            return hVar;
        }
        h minusKey = hVar.minusKey(key);
        if (minusKey == hVar) {
            return this;
        }
        if (minusKey == i.f47711a) {
            return fVar;
        }
        return new b(fVar, minusKey);
    }

    @Override
    public final h plus(h context) {
        j.e(context, "context");
        if (context == i.f47711a) {
            return this;
        }
        return (h) context.fold(this, new b1.e(5));
    }

    public final String toString() {
        return "[" + ((String) fold("", new b1.e(4))) + ']';
    }
}
