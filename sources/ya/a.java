package ya;

import a1.g;
public final class a {
    public final String f50109a;
    public final String f50110b;

    public a(String str, String str2) {
        this.f50109a = str;
        if (str2 != null) {
            this.f50110b = str2;
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
            if (this.f50109a.equals(aVar.f50109a) && this.f50110b.equals(aVar.f50110b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50109a.hashCode() ^ 1000003) * 1000003) ^ this.f50110b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f50109a);
        sb2.append(", version=");
        return g.s(sb2, this.f50110b, "}");
    }
}
