package org.telegram.ui;

import j$.util.Objects;
public final class xj0 extends pg.a {
    public int f43223c;
    public int d;
    public CharSequence e;
    public CharSequence f43224f;
    public ek0 f43225g;
    public int h;
    public boolean f43226i;

    public static xj0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f43223c = i10;
        aVar.e = str;
        aVar.f43226i = z10;
        return aVar;
    }

    public static xj0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f43223c = i10;
        aVar.e = str;
        aVar.f43224f = str2;
        return aVar;
    }

    public static xj0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f43223c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (xj0.class == aVar.getClass()) {
                xj0 xj0Var = (xj0) aVar;
                if (this.f43223c == xj0Var.f43223c && this.d == xj0Var.d && this.h == xj0Var.h && this.f43226i == xj0Var.f43226i && Objects.equals(this.e, xj0Var.e) && Objects.equals(this.f43224f, xj0Var.f43224f) && this.f43225g == xj0Var.f43225g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xj0.class == obj.getClass()) {
            xj0 xj0Var = (xj0) obj;
            if (this.f43223c == xj0Var.f43223c && this.h == xj0Var.h && ((this.f44296a == 8 || (this.d == xj0Var.d && Objects.equals(this.e, xj0Var.e) && (this.f44296a == 6 || Objects.equals(this.f43224f, xj0Var.f43224f)))) && this.f43225g == xj0Var.f43225g)) {
                return true;
            }
        }
        return false;
    }
}
