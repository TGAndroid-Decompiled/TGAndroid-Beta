package org.telegram.ui;

import j$.util.Objects;
public final class xj0 extends pg.a {
    public int f43217c;
    public int d;
    public CharSequence e;
    public CharSequence f43218f;
    public ek0 f43219g;
    public int h;
    public boolean f43220i;

    public static xj0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f43217c = i10;
        aVar.e = str;
        aVar.f43220i = z10;
        return aVar;
    }

    public static xj0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f43217c = i10;
        aVar.e = str;
        aVar.f43218f = str2;
        return aVar;
    }

    public static xj0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f43217c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (xj0.class == aVar.getClass()) {
                xj0 xj0Var = (xj0) aVar;
                if (this.f43217c == xj0Var.f43217c && this.d == xj0Var.d && this.h == xj0Var.h && this.f43220i == xj0Var.f43220i && Objects.equals(this.e, xj0Var.e) && Objects.equals(this.f43218f, xj0Var.f43218f) && this.f43219g == xj0Var.f43219g) {
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
            if (this.f43217c == xj0Var.f43217c && this.h == xj0Var.h && ((this.f44288a == 8 || (this.d == xj0Var.d && Objects.equals(this.e, xj0Var.e) && (this.f44288a == 6 || Objects.equals(this.f43218f, xj0Var.f43218f)))) && this.f43219g == xj0Var.f43219g)) {
                return true;
            }
        }
        return false;
    }
}
