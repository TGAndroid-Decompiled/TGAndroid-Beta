package p5;

import a8.p0;
import android.content.Context;
public final class b extends c {
    public final Context f54891a;
    public final x5.a f54892b;
    public final x5.a f54893c;
    public final String d;

    public b(Context context, x5.a aVar, x5.a aVar2, String str) {
        if (context != null) {
            this.f54891a = context;
            if (aVar != null) {
                this.f54892b = aVar;
                if (aVar2 != null) {
                    this.f54893c = aVar2;
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
            if (this.f54891a.equals(bVar.f54891a) && this.f54892b.equals(bVar.f54892b) && this.f54893c.equals(bVar.f54893c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f54891a.hashCode() ^ 1000003) * 1000003) ^ this.f54892b.hashCode()) * 1000003) ^ this.f54893c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f54891a);
        sb2.append(", wallClock=");
        sb2.append(this.f54892b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f54893c);
        sb2.append(", backendName=");
        return p0.s(sb2, this.d, "}");
    }
}
