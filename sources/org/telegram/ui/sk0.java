package org.telegram.ui;

import j$.util.Objects;
public final class sk0 extends pg.a {
    public int f39839c;
    public int d;
    public CharSequence e;
    public CharSequence f39840f;
    public zk0 f39841g;
    public int h;
    public boolean f39842i;

    public static sk0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f39839c = i10;
        aVar.e = str;
        aVar.f39842i = z10;
        return aVar;
    }

    public static sk0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f39839c = i10;
        aVar.e = str;
        aVar.f39840f = str2;
        return aVar;
    }

    public static sk0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f39839c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (sk0.class == aVar.getClass()) {
                sk0 sk0Var = (sk0) aVar;
                if (this.f39839c == sk0Var.f39839c && this.d == sk0Var.d && this.h == sk0Var.h && this.f39842i == sk0Var.f39842i && Objects.equals(this.e, sk0Var.e) && Objects.equals(this.f39840f, sk0Var.f39840f) && this.f39841g == sk0Var.f39841g) {
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
        if (obj != null && sk0.class == obj.getClass()) {
            sk0 sk0Var = (sk0) obj;
            if (this.f39839c == sk0Var.f39839c && this.h == sk0Var.h && ((this.f42904a == 8 || (this.d == sk0Var.d && Objects.equals(this.e, sk0Var.e) && (this.f42904a == 6 || Objects.equals(this.f39840f, sk0Var.f39840f)))) && this.f39841g == sk0Var.f39841g)) {
                return true;
            }
        }
        return false;
    }
}
