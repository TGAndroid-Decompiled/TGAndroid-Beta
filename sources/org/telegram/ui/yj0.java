package org.telegram.ui;

import j$.util.Objects;
public final class yj0 extends wf.a {
    public int f44886c;
    public int d;
    public CharSequence f44887e;
    public CharSequence f44888f;
    public ek0 f44889g;
    public int h;
    public boolean f44890i;

    public static yj0 b(int i9, String str, boolean z10) {
        ?? aVar = new wf.a(1, true);
        aVar.f44886c = i9;
        aVar.f44887e = str;
        aVar.f44890i = z10;
        return aVar;
    }

    public static yj0 c(int i9, String str, String str2) {
        ?? aVar = new wf.a(5, true);
        aVar.f44886c = i9;
        aVar.f44887e = str;
        aVar.f44888f = str2;
        return aVar;
    }

    public static yj0 d(int i9, String str) {
        ?? aVar = new wf.a(4, true);
        aVar.f44886c = i9;
        aVar.f44887e = str;
        return aVar;
    }

    @Override
    public final boolean a(wf.a aVar) {
        if (this != aVar) {
            if (yj0.class == aVar.getClass()) {
                yj0 yj0Var = (yj0) aVar;
                if (this.f44886c == yj0Var.f44886c && this.d == yj0Var.d && this.h == yj0Var.h && this.f44890i == yj0Var.f44890i && Objects.equals(this.f44887e, yj0Var.f44887e) && Objects.equals(this.f44888f, yj0Var.f44888f) && this.f44889g == yj0Var.f44889g) {
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
        if (obj != null && yj0.class == obj.getClass()) {
            yj0 yj0Var = (yj0) obj;
            if (this.f44886c == yj0Var.f44886c && this.h == yj0Var.h && ((this.f48814a == 8 || (this.d == yj0Var.d && Objects.equals(this.f44887e, yj0Var.f44887e) && (this.f48814a == 6 || Objects.equals(this.f44888f, yj0Var.f44888f)))) && this.f44889g == yj0Var.f44889g)) {
                return true;
            }
        }
        return false;
    }
}
