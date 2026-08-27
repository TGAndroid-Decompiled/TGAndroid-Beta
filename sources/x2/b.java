package x2;

import a9.p;
import android.content.Context;

public final class b extends c {

    public final Context f49332a;

    public final f3.a f49333b;

    public final f3.a f49334c;
    public final String d;

    public b(Context context, f3.a aVar, f3.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f49332a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f49333b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f49334c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f49332a.equals(bVar.f49332a) && this.f49333b.equals(bVar.f49333b) && this.f49334c.equals(bVar.f49334c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f49332a.hashCode() ^ 1000003) * 1000003) ^ this.f49333b.hashCode()) * 1000003) ^ this.f49334c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f49332a);
        sb2.append(", wallClock=");
        sb2.append(this.f49333b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f49334c);
        sb2.append(", backendName=");
        return p.p(sb2, this.d, "}");
    }
}
