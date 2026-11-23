package p5;

import a8.p0;
import android.content.Context;
public final class b extends d {
    public final Context f55590a;
    public final x5.a f55591b;
    public final x5.a f55592c;
    public final String d;

    public b(Context context, x5.a aVar, x5.a aVar2, String str) {
        if (context != null) {
            this.f55590a = context;
            if (aVar != null) {
                this.f55591b = aVar;
                if (aVar2 != null) {
                    this.f55592c = aVar2;
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
        if (obj instanceof d) {
            b bVar = (b) ((d) obj);
            if (this.f55590a.equals(bVar.f55590a) && this.f55591b.equals(bVar.f55591b) && this.f55592c.equals(bVar.f55592c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f55590a.hashCode() ^ 1000003) * 1000003) ^ this.f55591b.hashCode()) * 1000003) ^ this.f55592c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f55590a);
        sb2.append(", wallClock=");
        sb2.append(this.f55591b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f55592c);
        sb2.append(", backendName=");
        return p0.s(sb2, this.d, "}");
    }
}
