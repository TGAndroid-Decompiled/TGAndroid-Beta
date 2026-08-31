package s4;

import java.util.Arrays;
import k7.b7;
public final class b {
    public final String f46945a;
    public final String f46946b;
    public final int f46947c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f46945a = str;
        this.f46946b = str2;
        this.f46947c = i10;
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
        if (this.f46947c == bVar.f46947c && this.d == bVar.d && b7.a(this.f46945a, bVar.f46945a) && b7.a(this.f46946b, bVar.f46946b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46945a, this.f46946b, Integer.valueOf(this.f46947c), Integer.valueOf(this.d)});
    }
}
