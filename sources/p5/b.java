package p5;

import a8.p0;
import android.content.Context;
public final class b extends d {
    public final Context f55508a;
    public final x5.a f55509b;
    public final x5.a f55510c;
    public final String d;

    public b(Context context, x5.a aVar, x5.a aVar2, String str) {
        if (context != null) {
            this.f55508a = context;
            if (aVar != null) {
                this.f55509b = aVar;
                if (aVar2 != null) {
                    this.f55510c = aVar2;
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
            if (this.f55508a.equals(bVar.f55508a) && this.f55509b.equals(bVar.f55509b) && this.f55510c.equals(bVar.f55510c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f55508a.hashCode() ^ 1000003) * 1000003) ^ this.f55509b.hashCode()) * 1000003) ^ this.f55510c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f55508a);
        sb2.append(", wallClock=");
        sb2.append(this.f55509b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f55510c);
        sb2.append(", backendName=");
        return p0.s(sb2, this.d, "}");
    }
}
