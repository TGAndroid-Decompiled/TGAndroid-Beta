package q0;

import j$.util.Objects;
public final class b {
    public final Object f44100a;
    public final Object f44101b;

    public b(Object obj, Object obj2) {
        this.f44100a = obj;
        this.f44101b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f44100a, this.f44100a) || !Objects.equals(bVar.f44101b, this.f44101b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f44100a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.f44101b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i10 ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f44100a + " " + this.f44101b + "}";
    }
}
