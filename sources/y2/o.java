package y2;

import java.util.Set;
public final class o implements v2.f {
    public final Set f47025a;
    public final i f47026b;
    public final q f47027c;

    public o(Set set, i iVar, q qVar) {
        this.f47025a = set;
        this.f47026b = iVar;
        this.f47027c = qVar;
    }

    public final p a(String str, v2.c cVar, v2.e eVar) {
        Set set = this.f47025a;
        if (set.contains(cVar)) {
            return new p(this.f47026b, str, cVar, eVar, this.f47027c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
