package org.telegram.ui;

import j$.util.Objects;
public final class xj0 extends pg.a {
    public int f43226c;
    public int d;
    public CharSequence e;
    public CharSequence f43227f;
    public ek0 f43228g;
    public int h;
    public boolean f43229i;

    public static xj0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f43226c = i10;
        aVar.e = str;
        aVar.f43229i = z10;
        return aVar;
    }

    public static xj0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f43226c = i10;
        aVar.e = str;
        aVar.f43227f = str2;
        return aVar;
    }

    public static xj0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f43226c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (xj0.class == aVar.getClass()) {
                xj0 xj0Var = (xj0) aVar;
                if (this.f43226c == xj0Var.f43226c && this.d == xj0Var.d && this.h == xj0Var.h && this.f43229i == xj0Var.f43229i && Objects.equals(this.e, xj0Var.e) && Objects.equals(this.f43227f, xj0Var.f43227f) && this.f43228g == xj0Var.f43228g) {
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
            if (this.f43226c == xj0Var.f43226c && this.h == xj0Var.h && ((this.f44299a == 8 || (this.d == xj0Var.d && Objects.equals(this.e, xj0Var.e) && (this.f44299a == 6 || Objects.equals(this.f43227f, xj0Var.f43227f)))) && this.f43228g == xj0Var.f43228g)) {
                return true;
            }
        }
        return false;
    }
}
