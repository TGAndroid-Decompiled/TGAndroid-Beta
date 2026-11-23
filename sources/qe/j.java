package qe;

import c8.n1;
public final class j {
    public static final j f56170c;
    public static final j d;
    public static final j f56171e;
    public static final j f56172f;
    public static final j[] h;
    public static final ld.b f56173n;
    public final char f56174a;
    public final char f56175b;

    static {
        j jVar = new j("OBJ", 0, '{', '}');
        f56170c = jVar;
        j jVar2 = new j("LIST", 1, '[', ']');
        d = jVar2;
        j jVar3 = new j("MAP", 2, '{', '}');
        f56171e = jVar3;
        j jVar4 = new j("POLY_OBJ", 3, '[', ']');
        f56172f = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        h = jVarArr;
        f56173n = n1.a(jVarArr);
    }

    public j(String str, int i7, char c10, char c11) {
        this.f56174a = c10;
        this.f56175b = c11;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) h.clone();
    }
}
