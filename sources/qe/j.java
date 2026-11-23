package qe;

import c8.h9;
public final class j {
    public static final j f56248c;
    public static final j d;
    public static final j f56249e;
    public static final j f56250f;
    public static final j[] h;
    public static final ld.b f56251n;
    public final char f56252a;
    public final char f56253b;

    static {
        j jVar = new j("OBJ", 0, '{', '}');
        f56248c = jVar;
        j jVar2 = new j("LIST", 1, '[', ']');
        d = jVar2;
        j jVar3 = new j("MAP", 2, '{', '}');
        f56249e = jVar3;
        j jVar4 = new j("POLY_OBJ", 3, '[', ']');
        f56250f = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        h = jVarArr;
        f56251n = h9.a(jVarArr);
    }

    public j(String str, int i7, char c10, char c11) {
        this.f56252a = c10;
        this.f56253b = c11;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) h.clone();
    }
}
