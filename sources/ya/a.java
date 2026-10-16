package ya;

import a1.g;
public final class a {
    public final String f48725a;
    public final String f48726b;

    public a(String str, String str2) {
        this.f48725a = str;
        if (str2 != null) {
            this.f48726b = str2;
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
            if (this.f48725a.equals(aVar.f48725a) && this.f48726b.equals(aVar.f48726b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f48725a.hashCode() ^ 1000003) * 1000003) ^ this.f48726b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f48725a);
        sb2.append(", version=");
        return g.s(sb2, this.f48726b, "}");
    }
}
