package z2;

import android.content.Context;
public final class b extends c {
    public final Context f47336a;
    public final h3.a f47337b;
    public final h3.a f47338c;
    public final String d;

    public b(Context context, h3.a aVar, h3.a aVar2, String str) {
        if (context != null) {
            this.f47336a = context;
            if (aVar != null) {
                this.f47337b = aVar;
                if (aVar2 != null) {
                    this.f47338c = aVar2;
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
            if (this.f47336a.equals(bVar.f47336a) && this.f47337b.equals(bVar.f47337b) && this.f47338c.equals(bVar.f47338c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f47336a.hashCode() ^ 1000003) * 1000003) ^ this.f47337b.hashCode()) * 1000003) ^ this.f47338c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f47336a);
        sb.append(", wallClock=");
        sb.append(this.f47337b);
        sb.append(", monotonicClock=");
        sb.append(this.f47338c);
        sb.append(", backendName=");
        return android.support.v4.media.a.r(sb, this.d, "}");
    }
}
