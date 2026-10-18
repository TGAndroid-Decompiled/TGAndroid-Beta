package org.telegram.ui;

import j$.util.Objects;
public final class zj0 extends pg.a {
    public int f43778c;
    public int d;
    public CharSequence e;
    public CharSequence f43779f;
    public gk0 f43780g;
    public int h;
    public boolean f43781i;

    public static zj0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f43778c = i10;
        aVar.e = str;
        aVar.f43781i = z10;
        return aVar;
    }

    public static zj0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f43778c = i10;
        aVar.e = str;
        aVar.f43779f = str2;
        return aVar;
    }

    public static zj0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f43778c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (zj0.class == aVar.getClass()) {
                zj0 zj0Var = (zj0) aVar;
                if (this.f43778c == zj0Var.f43778c && this.d == zj0Var.d && this.h == zj0Var.h && this.f43781i == zj0Var.f43781i && Objects.equals(this.e, zj0Var.e) && Objects.equals(this.f43779f, zj0Var.f43779f) && this.f43780g == zj0Var.f43780g) {
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
        if (obj != null && zj0.class == obj.getClass()) {
            zj0 zj0Var = (zj0) obj;
            if (this.f43778c == zj0Var.f43778c && this.h == zj0Var.h && ((this.f44334a == 8 || (this.d == zj0Var.d && Objects.equals(this.e, zj0Var.e) && (this.f44334a == 6 || Objects.equals(this.f43779f, zj0Var.f43779f)))) && this.f43780g == zj0Var.f43780g)) {
                return true;
            }
        }
        return false;
    }
}
