package s4;

import java.util.Arrays;
import k7.b7;
public final class b {
    public final String f44048a;
    public final String f44049b;
    public final int f44050c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f44048a = str;
        this.f44049b = str2;
        this.f44050c = i10;
        this.d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f44050c == bVar.f44050c && this.d == bVar.d && b7.a(this.f44048a, bVar.f44048a) && b7.a(this.f44049b, bVar.f44049b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f44048a, this.f44049b, Integer.valueOf(this.f44050c), Integer.valueOf(this.d)});
    }
}
