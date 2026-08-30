package s4;

import java.util.Arrays;
import k7.a7;
public final class b {
    public final String f43983a;
    public final String f43984b;
    public final int f43985c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f43983a = str;
        this.f43984b = str2;
        this.f43985c = i10;
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
        if (this.f43985c == bVar.f43985c && this.d == bVar.d && a7.a(this.f43983a, bVar.f43983a) && a7.a(this.f43984b, bVar.f43984b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43983a, this.f43984b, Integer.valueOf(this.f43985c), Integer.valueOf(this.d)});
    }
}
