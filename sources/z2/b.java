package z2;

import android.content.Context;
public final class b extends c {
    public final Context f47272a;
    public final h3.a f47273b;
    public final h3.a f47274c;
    public final String d;

    public b(Context context, h3.a aVar, h3.a aVar2, String str) {
        if (context != null) {
            this.f47272a = context;
            if (aVar != null) {
                this.f47273b = aVar;
                if (aVar2 != null) {
                    this.f47274c = aVar2;
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
            if (this.f47272a.equals(bVar.f47272a) && this.f47273b.equals(bVar.f47273b) && this.f47274c.equals(bVar.f47274c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f47272a.hashCode() ^ 1000003) * 1000003) ^ this.f47273b.hashCode()) * 1000003) ^ this.f47274c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f47272a);
        sb.append(", wallClock=");
        sb.append(this.f47273b);
        sb.append(", monotonicClock=");
        sb.append(this.f47274c);
        sb.append(", backendName=");
        return android.support.v4.media.a.r(sb, this.d, "}");
    }
}
