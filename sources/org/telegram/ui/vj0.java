package org.telegram.ui;

import j$.util.Objects;
public final class vj0 extends zf.a {
    public int f43610c;
    public int d;
    public CharSequence f43611e;
    public CharSequence f43612f;
    public bk0 f43613g;
    public int h;
    public boolean f43614i;

    public static vj0 b(int i10, String str, boolean z10) {
        ?? aVar = new zf.a(1, true);
        aVar.f43610c = i10;
        aVar.f43611e = str;
        aVar.f43614i = z10;
        return aVar;
    }

    public static vj0 c(int i10, String str, String str2) {
        ?? aVar = new zf.a(5, true);
        aVar.f43610c = i10;
        aVar.f43611e = str;
        aVar.f43612f = str2;
        return aVar;
    }

    public static vj0 d(int i10, String str) {
        ?? aVar = new zf.a(4, true);
        aVar.f43610c = i10;
        aVar.f43611e = str;
        return aVar;
    }

    @Override
    public final boolean a(zf.a aVar) {
        if (this != aVar) {
            if (vj0.class == aVar.getClass()) {
                vj0 vj0Var = (vj0) aVar;
                if (this.f43610c == vj0Var.f43610c && this.d == vj0Var.d && this.h == vj0Var.h && this.f43614i == vj0Var.f43614i && Objects.equals(this.f43611e, vj0Var.f43611e) && Objects.equals(this.f43612f, vj0Var.f43612f) && this.f43613g == vj0Var.f43613g) {
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
        if (obj != null && vj0.class == obj.getClass()) {
            vj0 vj0Var = (vj0) obj;
            if (this.f43610c == vj0Var.f43610c && this.h == vj0Var.h && ((this.f50845a == 8 || (this.d == vj0Var.d && Objects.equals(this.f43611e, vj0Var.f43611e) && (this.f50845a == 6 || Objects.equals(this.f43612f, vj0Var.f43612f)))) && this.f43613g == vj0Var.f43613g)) {
                return true;
            }
        }
        return false;
    }
}
