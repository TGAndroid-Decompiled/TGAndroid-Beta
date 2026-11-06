package r2;

import android.text.TextUtils;
import e2.n0;
import e2.p0;
import e2.u;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class s implements p0 {
    public final String f54267a;
    public final String f54268b;
    public final List f54269c;

    public s(String str, String str2, List list) {
        this.f54267a = str;
        this.f54268b = str2;
        this.f54269c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override
    public final u a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (TextUtils.equals(this.f54267a, sVar.f54267a) && TextUtils.equals(this.f54268b, sVar.f54268b) && this.f54269c.equals(sVar.f54269c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = 0;
        String str = this.f54267a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = i7 * 31;
        String str2 = this.f54268b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.f54269c.hashCode() + ((i11 + i10) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f54267a;
        if (str2 != null) {
            str = a8.p0.s(a8.p0.u(" [", str2, ", "), this.f54268b, "]");
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
