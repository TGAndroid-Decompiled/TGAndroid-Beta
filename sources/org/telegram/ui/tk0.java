package org.telegram.ui;

import j$.util.Objects;
public final class tk0 extends pg.a {
    public int f40404c;
    public int d;
    public CharSequence e;
    public CharSequence f40405f;
    public al0 f40406g;
    public int h;
    public boolean f40407i;

    public static tk0 b(int i10, String str, boolean z10) {
        ?? aVar = new pg.a(1, true);
        aVar.f40404c = i10;
        aVar.e = str;
        aVar.f40407i = z10;
        return aVar;
    }

    public static tk0 c(int i10, String str, String str2) {
        ?? aVar = new pg.a(5, true);
        aVar.f40404c = i10;
        aVar.e = str;
        aVar.f40405f = str2;
        return aVar;
    }

    public static tk0 d(int i10, String str) {
        ?? aVar = new pg.a(4, true);
        aVar.f40404c = i10;
        aVar.e = str;
        return aVar;
    }

    @Override
    public final boolean a(pg.a aVar) {
        if (this != aVar) {
            if (tk0.class == aVar.getClass()) {
                tk0 tk0Var = (tk0) aVar;
                if (this.f40404c == tk0Var.f40404c && this.d == tk0Var.d && this.h == tk0Var.h && this.f40407i == tk0Var.f40407i && Objects.equals(this.e, tk0Var.e) && Objects.equals(this.f40405f, tk0Var.f40405f) && this.f40406g == tk0Var.f40406g) {
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
        if (obj != null && tk0.class == obj.getClass()) {
            tk0 tk0Var = (tk0) obj;
            if (this.f40404c == tk0Var.f40404c && this.h == tk0Var.h && ((this.f43203a == 8 || (this.d == tk0Var.d && Objects.equals(this.e, tk0Var.e) && (this.f43203a == 6 || Objects.equals(this.f40405f, tk0Var.f40405f)))) && this.f40406g == tk0Var.f40406g)) {
                return true;
            }
        }
        return false;
    }
}
