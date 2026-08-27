package w2;

import java.util.Set;

public final class o implements t2.f {

    public final Set f48969a;

    public final i f48970b;

    public final q f48971c;

    public o(Set set, i iVar, q qVar) {
        this.f48969a = set;
        this.f48970b = iVar;
        this.f48971c = qVar;
    }

    public final p a(String str, t2.c cVar, t2.e eVar) {
        Set set = this.f48969a;
        if (set.contains(cVar)) {
            return new p(this.f48970b, str, cVar, eVar, this.f48971c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
