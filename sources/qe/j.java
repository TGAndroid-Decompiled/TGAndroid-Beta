package qe;

import c8.n1;
public final class j {
    public static final j f56166c;
    public static final j d;
    public static final j f56167e;
    public static final j f56168f;
    public static final j[] h;
    public static final ld.b f56169n;
    public final char f56170a;
    public final char f56171b;

    static {
        j jVar = new j("OBJ", 0, '{', '}');
        f56166c = jVar;
        j jVar2 = new j("LIST", 1, '[', ']');
        d = jVar2;
        j jVar3 = new j("MAP", 2, '{', '}');
        f56167e = jVar3;
        j jVar4 = new j("POLY_OBJ", 3, '[', ']');
        f56168f = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        h = jVarArr;
        f56169n = n1.a(jVarArr);
    }

    public j(String str, int i7, char c10, char c11) {
        this.f56170a = c10;
        this.f56171b = c11;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) h.clone();
    }
}
