package xa;

import a1.g;
public final class a {
    public final String f51100a;
    public final String f51101b;

    public a(String str, String str2) {
        this.f51100a = str;
        if (str2 != null) {
            this.f51101b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f51100a.equals(aVar.f51100a) && this.f51101b.equals(aVar.f51101b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51100a.hashCode() ^ 1000003) * 1000003) ^ this.f51101b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f51100a);
        sb2.append(", version=");
        return g.t(sb2, this.f51101b, "}");
    }
}
