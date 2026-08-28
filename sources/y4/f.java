package y4;

import android.text.Layout;
public final class f {
    public String f49593a;
    public int f49594b;
    public boolean f49595c;
    public int d;
    public boolean f49596e;
    public float f49601k;
    public String f49602l;
    public Layout.Alignment f49605o;
    public Layout.Alignment f49606p;
    public b f49608r;
    public int f49597f = -1;
    public int f49598g = -1;
    public int h = -1;
    public int f49599i = -1;
    public int f49600j = -1;
    public int f49603m = -1;
    public int f49604n = -1;
    public int f49607q = -1;
    public float f49609s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i9;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f49595c && fVar.f49595c) {
                this.f49594b = fVar.f49594b;
                this.f49595c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f49599i == -1) {
                this.f49599i = fVar.f49599i;
            }
            if (this.f49593a == null && (str = fVar.f49593a) != null) {
                this.f49593a = str;
            }
            if (this.f49597f == -1) {
                this.f49597f = fVar.f49597f;
            }
            if (this.f49598g == -1) {
                this.f49598g = fVar.f49598g;
            }
            if (this.f49604n == -1) {
                this.f49604n = fVar.f49604n;
            }
            if (this.f49605o == null && (alignment2 = fVar.f49605o) != null) {
                this.f49605o = alignment2;
            }
            if (this.f49606p == null && (alignment = fVar.f49606p) != null) {
                this.f49606p = alignment;
            }
            if (this.f49607q == -1) {
                this.f49607q = fVar.f49607q;
            }
            if (this.f49600j == -1) {
                this.f49600j = fVar.f49600j;
                this.f49601k = fVar.f49601k;
            }
            if (this.f49608r == null) {
                this.f49608r = fVar.f49608r;
            }
            if (this.f49609s == Float.MAX_VALUE) {
                this.f49609s = fVar.f49609s;
            }
            if (!this.f49596e && fVar.f49596e) {
                this.d = fVar.d;
                this.f49596e = true;
            }
            if (this.f49603m == -1 && (i9 = fVar.f49603m) != -1) {
                this.f49603m = i9;
            }
        }
    }
}
