package qe;

import c8.j1;
public final class j {
    public static final j f54104c;
    public static final j d;
    public static final j f54105e;
    public static final j f54106f;
    public static final j[] h;
    public static final ld.b f54107n;
    public final char f54108a;
    public final char f54109b;

    static {
        j jVar = new j("OBJ", 0, '{', '}');
        f54104c = jVar;
        j jVar2 = new j("LIST", 1, '[', ']');
        d = jVar2;
        j jVar3 = new j("MAP", 2, '{', '}');
        f54105e = jVar3;
        j jVar4 = new j("POLY_OBJ", 3, '[', ']');
        f54106f = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        h = jVarArr;
        f54107n = j1.a(jVarArr);
    }

    public j(String str, int i7, char c10, char c11) {
        this.f54108a = c10;
        this.f54109b = c11;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) h.clone();
    }
}
