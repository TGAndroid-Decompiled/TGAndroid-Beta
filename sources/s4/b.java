package s4;

import java.util.Arrays;
import k7.b7;
public final class b {
    public final String f46976a;
    public final String f46977b;
    public final int f46978c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f46976a = str;
        this.f46977b = str2;
        this.f46978c = i10;
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
        if (this.f46978c == bVar.f46978c && this.d == bVar.d && b7.a(this.f46976a, bVar.f46976a) && b7.a(this.f46977b, bVar.f46977b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46976a, this.f46977b, Integer.valueOf(this.f46978c), Integer.valueOf(this.d)});
    }
}
