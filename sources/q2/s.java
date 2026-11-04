package q2;

import android.text.TextUtils;
import d2.p0;
import d2.r0;
import d2.v;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class s implements r0 {
    public final String f53772a;
    public final String f53773b;
    public final List f53774c;

    public s(String str, String str2, List list) {
        this.f53772a = str;
        this.f53773b = str2;
        this.f53774c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override
    public final v b() {
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
            if (TextUtils.equals(this.f53772a, sVar.f53772a) && TextUtils.equals(this.f53773b, sVar.f53773b) && this.f53774c.equals(sVar.f53774c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i10 = 0;
        String str = this.f53772a;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = i3 * 31;
        String str2 = this.f53773b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.f53774c.hashCode() + ((i11 + i10) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f53772a;
        if (str2 != null) {
            str = a1.g.s(a1.g.u(" [", str2, ", "), this.f53773b, "]");
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void a(p0 p0Var) {
    }
}
