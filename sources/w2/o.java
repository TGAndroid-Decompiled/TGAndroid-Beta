package w2;

import java.util.Set;
public final class o implements t2.f {
    public final Set f48466a;
    public final i f48467b;
    public final q f48468c;

    public o(Set set, i iVar, q qVar) {
        this.f48466a = set;
        this.f48467b = iVar;
        this.f48468c = qVar;
    }

    public final p a(String str, t2.c cVar, t2.e eVar) {
        Set set = this.f48466a;
        if (set.contains(cVar)) {
            return new p(this.f48467b, str, cVar, eVar, this.f48468c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
