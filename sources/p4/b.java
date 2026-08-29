package p4;

import i7.o6;
import java.util.Arrays;
public final class b {
    public final String f45536a;
    public final String f45537b;
    public final int f45538c;
    public final int d;

    public b(int i10, int i11, String str, String str2) {
        this.f45536a = str;
        this.f45537b = str2;
        this.f45538c = i10;
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
        if (this.f45538c == bVar.f45538c && this.d == bVar.d && o6.a(this.f45536a, bVar.f45536a) && o6.a(this.f45537b, bVar.f45537b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45536a, this.f45537b, Integer.valueOf(this.f45538c), Integer.valueOf(this.d)});
    }
}
