package org.telegram.ui;

import j$.util.Objects;
public final class xj0 extends pg.a {
    public int f43213c;
    public int d;
    public CharSequence e;
    public CharSequence f43214f;
    public ek0 f43215g;
    public int h;
    public boolean f43216i;

    public static xj0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f43213c = i10;
        aVar.e = str;
        aVar.f43216i = z10;
        return aVar;
    }

    public static xj0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f43213c = i10;
        aVar.e = str;
        aVar.f43214f = str2;
        return aVar;
    }

    public static xj0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f43213c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (xj0.class == aVar.getClass()) {
                xj0 xj0Var = (xj0) aVar;
                if (this.f43213c == xj0Var.f43213c && this.d == xj0Var.d && this.h == xj0Var.h && this.f43216i == xj0Var.f43216i && Objects.equals(this.e, xj0Var.e) && Objects.equals(this.f43214f, xj0Var.f43214f) && this.f43215g == xj0Var.f43215g) {
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
            if (this.f43213c == xj0Var.f43213c && this.h == xj0Var.h && ((this.f44286a == 8 || (this.d == xj0Var.d && Objects.equals(this.e, xj0Var.e) && (this.f44286a == 6 || Objects.equals(this.f43214f, xj0Var.f43214f)))) && this.f43215g == xj0Var.f43215g)) {
                return true;
            }
        }
        return false;
    }
}
