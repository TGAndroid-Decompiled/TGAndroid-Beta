package qe;

import c8.l1;
public final class j {
    public static final j f55551c;
    public static final j d;
    public static final j f55552e;
    public static final j f55553f;
    public static final j[] h;
    public static final ld.b f55554n;
    public final char f55555a;
    public final char f55556b;

    static {
        j jVar = new j("OBJ", 0, '{', '}');
        f55551c = jVar;
        j jVar2 = new j("LIST", 1, '[', ']');
        d = jVar2;
        j jVar3 = new j("MAP", 2, '{', '}');
        f55552e = jVar3;
        j jVar4 = new j("POLY_OBJ", 3, '[', ']');
        f55553f = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        h = jVarArr;
        f55554n = l1.a(jVarArr);
    }

    public j(String str, int i7, char c10, char c11) {
        this.f55555a = c10;
        this.f55556b = c11;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) h.clone();
    }
}
