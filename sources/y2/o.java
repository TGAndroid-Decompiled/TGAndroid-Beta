package y2;

import java.util.Set;
public final class o implements v2.f {
    public final Set f47119a;
    public final i f47120b;
    public final q f47121c;

    public o(Set set, i iVar, q qVar) {
        this.f47119a = set;
        this.f47120b = iVar;
        this.f47121c = qVar;
    }

    public final p a(String str, v2.c cVar, v2.e eVar) {
        Set set = this.f47119a;
        if (set.contains(cVar)) {
            return new p(this.f47120b, str, cVar, eVar, this.f47121c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
