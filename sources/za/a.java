package za;

import a1.g;
public final class a {
    public final String f52896a;
    public final String f52897b;

    public a(String str, String str2) {
        this.f52896a = str;
        if (str2 != null) {
            this.f52897b = str2;
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
            if (this.f52896a.equals(aVar.f52896a) && this.f52897b.equals(aVar.f52897b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f52896a.hashCode() ^ 1000003) * 1000003) ^ this.f52897b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f52896a);
        sb2.append(", version=");
        return g.s(sb2, this.f52897b, "}");
    }
}
