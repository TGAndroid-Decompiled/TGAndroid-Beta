package y2;

import java.util.Set;
public final class o implements v2.f {
    public final Set f50742a;
    public final i f50743b;
    public final q f50744c;

    public o(Set set, i iVar, q qVar) {
        this.f50742a = set;
        this.f50743b = iVar;
        this.f50744c = qVar;
    }

    public final p a(String str, v2.c cVar, v2.e eVar) {
        Set set = this.f50742a;
        if (set.contains(cVar)) {
            return new p(this.f50743b, str, cVar, eVar, this.f50744c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
