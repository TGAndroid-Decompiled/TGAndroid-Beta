package qe;

import c8.n1;
public final class j {
    public static final j f56125c;
    public static final j d;
    public static final j f56126e;
    public static final j f56127f;
    public static final j[] h;
    public static final ld.b f56128n;
    public final char f56129a;
    public final char f56130b;

    static {
        j jVar = new j("OBJ", 0, '{', '}');
        f56125c = jVar;
        j jVar2 = new j("LIST", 1, '[', ']');
        d = jVar2;
        j jVar3 = new j("MAP", 2, '{', '}');
        f56126e = jVar3;
        j jVar4 = new j("POLY_OBJ", 3, '[', ']');
        f56127f = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        h = jVarArr;
        f56128n = n1.a(jVarArr);
    }

    public j(String str, int i7, char c10, char c11) {
        this.f56129a = c10;
        this.f56130b = c11;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) h.clone();
    }
}
