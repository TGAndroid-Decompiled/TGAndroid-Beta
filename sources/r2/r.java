package r2;

import android.text.TextUtils;
import e2.n0;
import e2.p0;
import e2.u;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class r implements p0 {
    public final String f56486a;
    public final String f56487b;
    public final List f56488c;

    public r(String str, String str2, List list) {
        this.f56486a = str;
        this.f56487b = str2;
        this.f56488c = DesugarCollections.unmodifiableList(new ArrayList(list));
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
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (TextUtils.equals(this.f56486a, rVar.f56486a) && TextUtils.equals(this.f56487b, rVar.f56487b) && this.f56488c.equals(rVar.f56488c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = 0;
        String str = this.f56486a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = i7 * 31;
        String str2 = this.f56487b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.f56488c.hashCode() + ((i11 + i10) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f56486a;
        if (str2 != null) {
            str = a8.p0.s(a8.p0.u(" [", str2, ", "), this.f56487b, "]");
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
