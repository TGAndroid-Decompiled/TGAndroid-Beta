package y2;

import java.util.Set;
public final class o implements v2.f {
    public final Set f50705a;
    public final i f50706b;
    public final q f50707c;

    public o(Set set, i iVar, q qVar) {
        this.f50705a = set;
        this.f50706b = iVar;
        this.f50707c = qVar;
    }

    public final p a(String str, v2.c cVar, v2.e eVar) {
        Set set = this.f50705a;
        if (set.contains(cVar)) {
            return new p(this.f50706b, str, cVar, eVar, this.f50707c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
