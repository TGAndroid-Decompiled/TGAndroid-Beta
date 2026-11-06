package qe;

import c8.j1;
public final class j {
    public static final j f53987c;
    public static final j d;
    public static final j f53988e;
    public static final j f53989f;
    public static final j[] h;
    public static final ld.b f53990n;
    public final char f53991a;
    public final char f53992b;

    static {
        j jVar = new j("OBJ", 0, '{', '}');
        f53987c = jVar;
        j jVar2 = new j("LIST", 1, '[', ']');
        d = jVar2;
        j jVar3 = new j("MAP", 2, '{', '}');
        f53988e = jVar3;
        j jVar4 = new j("POLY_OBJ", 3, '[', ']');
        f53989f = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        h = jVarArr;
        f53990n = j1.a(jVarArr);
    }

    public j(String str, int i7, char c10, char c11) {
        this.f53991a = c10;
        this.f53992b = c11;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) h.clone();
    }
}
