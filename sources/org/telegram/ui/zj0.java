package org.telegram.ui;

import j$.util.Objects;

public final class zj0 extends xf.a {

    public int f45190c;
    public int d;

    public CharSequence f45191e;

    public CharSequence f45192f;

    public fk0 f45193g;
    public int h;

    public boolean f45194i;

    public static zj0 b(int i10, String str, boolean z10) {
        zj0 zj0Var = new zj0(1, true);
        zj0Var.f45190c = i10;
        zj0Var.f45191e = str;
        zj0Var.f45194i = z10;
        return zj0Var;
    }

    public static zj0 c(int i10, String str, String str2) {
        zj0 zj0Var = new zj0(5, true);
        zj0Var.f45190c = i10;
        zj0Var.f45191e = str;
        zj0Var.f45192f = str2;
        return zj0Var;
    }

    public static zj0 d(int i10, String str) {
        zj0 zj0Var = new zj0(4, true);
        zj0Var.f45190c = i10;
        zj0Var.f45191e = str;
        return zj0Var;
    }

    @Override
    public final boolean a(xf.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (zj0.class != aVar.getClass()) {
            return false;
        }
        zj0 zj0Var = (zj0) aVar;
        return this.f45190c == zj0Var.f45190c && this.d == zj0Var.d && this.h == zj0Var.h && this.f45194i == zj0Var.f45194i && Objects.equals(this.f45191e, zj0Var.f45191e) && Objects.equals(this.f45192f, zj0Var.f45192f) && this.f45193g == zj0Var.f45193g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zj0.class == obj.getClass()) {
            zj0 zj0Var = (zj0) obj;
            if (this.f45190c == zj0Var.f45190c && this.h == zj0Var.h && ((this.f49413a == 8 || (this.d == zj0Var.d && Objects.equals(this.f45191e, zj0Var.f45191e) && (this.f49413a == 6 || Objects.equals(this.f45192f, zj0Var.f45192f)))) && this.f45193g == zj0Var.f45193g)) {
                return true;
            }
        }
        return false;
    }
}
