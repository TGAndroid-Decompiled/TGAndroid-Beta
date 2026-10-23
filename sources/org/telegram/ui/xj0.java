package org.telegram.ui;

import j$.util.Objects;
public final class xj0 extends pg.a {
    public int f43227c;
    public int d;
    public CharSequence e;
    public CharSequence f43228f;
    public ek0 f43229g;
    public int h;
    public boolean f43230i;

    public static xj0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f43227c = i10;
        aVar.e = str;
        aVar.f43230i = z10;
        return aVar;
    }

    public static xj0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f43227c = i10;
        aVar.e = str;
        aVar.f43228f = str2;
        return aVar;
    }

    public static xj0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f43227c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (xj0.class == aVar.getClass()) {
                xj0 xj0Var = (xj0) aVar;
                if (this.f43227c == xj0Var.f43227c && this.d == xj0Var.d && this.h == xj0Var.h && this.f43230i == xj0Var.f43230i && Objects.equals(this.e, xj0Var.e) && Objects.equals(this.f43228f, xj0Var.f43228f) && this.f43229g == xj0Var.f43229g) {
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
            if (this.f43227c == xj0Var.f43227c && this.h == xj0Var.h && ((this.f44300a == 8 || (this.d == xj0Var.d && Objects.equals(this.e, xj0Var.e) && (this.f44300a == 6 || Objects.equals(this.f43228f, xj0Var.f43228f)))) && this.f43229g == xj0Var.f43229g)) {
                return true;
            }
        }
        return false;
    }
}
