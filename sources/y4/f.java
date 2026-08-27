package y4;

import android.text.Layout;

public final class f {

    public String f49583a;

    public int f49584b;

    public boolean f49585c;
    public int d;

    public boolean f49586e;

    public float f49591k;

    public String f49592l;

    public Layout.Alignment f49595o;

    public Layout.Alignment f49596p;

    public b f49598r;

    public int f49587f = -1;

    public int f49588g = -1;
    public int h = -1;

    public int f49589i = -1;

    public int f49590j = -1;

    public int f49593m = -1;

    public int f49594n = -1;

    public int f49597q = -1;

    public float f49599s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f49585c && fVar.f49585c) {
                this.f49584b = fVar.f49584b;
                this.f49585c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.f49589i == -1) {
                this.f49589i = fVar.f49589i;
            }
            if (this.f49583a == null && (str = fVar.f49583a) != null) {
                this.f49583a = str;
            }
            if (this.f49587f == -1) {
                this.f49587f = fVar.f49587f;
            }
            if (this.f49588g == -1) {
                this.f49588g = fVar.f49588g;
            }
            if (this.f49594n == -1) {
                this.f49594n = fVar.f49594n;
            }
            if (this.f49595o == null && (alignment2 = fVar.f49595o) != null) {
                this.f49595o = alignment2;
            }
            if (this.f49596p == null && (alignment = fVar.f49596p) != null) {
                this.f49596p = alignment;
            }
            if (this.f49597q == -1) {
                this.f49597q = fVar.f49597q;
            }
            if (this.f49590j == -1) {
                this.f49590j = fVar.f49590j;
                this.f49591k = fVar.f49591k;
            }
            if (this.f49598r == null) {
                this.f49598r = fVar.f49598r;
            }
            if (this.f49599s == Float.MAX_VALUE) {
                this.f49599s = fVar.f49599s;
            }
            if (!this.f49586e && fVar.f49586e) {
                this.d = fVar.d;
                this.f49586e = true;
            }
            if (this.f49593m != -1 || (i10 = fVar.f49593m) == -1) {
                return;
            }
            this.f49593m = i10;
        }
    }
}
