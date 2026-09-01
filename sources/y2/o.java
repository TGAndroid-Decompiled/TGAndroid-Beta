package y2;

import java.util.Set;
public final class o implements v2.f {
    public final Set f50706a;
    public final i f50707b;
    public final q f50708c;

    public o(Set set, i iVar, q qVar) {
        this.f50706a = set;
        this.f50707b = iVar;
        this.f50708c = qVar;
    }

    public final p a(String str, v2.c cVar, v2.e eVar) {
        Set set = this.f50706a;
        if (set.contains(cVar)) {
            return new p(this.f50707b, str, cVar, eVar, this.f50708c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
