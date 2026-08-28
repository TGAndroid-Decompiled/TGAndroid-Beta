package x2;

import android.content.Context;
public final class b extends c {
    public final Context f48852a;
    public final f3.a f48853b;
    public final f3.a f48854c;
    public final String d;

    public b(Context context, f3.a aVar, f3.a aVar2, String str) {
        if (context != null) {
            this.f48852a = context;
            if (aVar != null) {
                this.f48853b = aVar;
                if (aVar2 != null) {
                    this.f48854c = aVar2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f48852a.equals(bVar.f48852a) && this.f48853b.equals(bVar.f48853b) && this.f48854c.equals(bVar.f48854c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f48852a.hashCode() ^ 1000003) * 1000003) ^ this.f48853b.hashCode()) * 1000003) ^ this.f48854c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f48852a);
        sb2.append(", wallClock=");
        sb2.append(this.f48853b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f48854c);
        sb2.append(", backendName=");
        return aa.d.r(sb2, this.d, "}");
    }
}
