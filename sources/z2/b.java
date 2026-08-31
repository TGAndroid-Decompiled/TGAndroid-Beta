package z2;

import android.content.Context;
public final class b extends c {
    public final Context f50959a;
    public final h3.a f50960b;
    public final h3.a f50961c;
    public final String d;

    public b(Context context, h3.a aVar, h3.a aVar2, String str) {
        if (context != null) {
            this.f50959a = context;
            if (aVar != null) {
                this.f50960b = aVar;
                if (aVar2 != null) {
                    this.f50961c = aVar2;
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
            if (this.f50959a.equals(bVar.f50959a) && this.f50960b.equals(bVar.f50960b) && this.f50961c.equals(bVar.f50961c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f50959a.hashCode() ^ 1000003) * 1000003) ^ this.f50960b.hashCode()) * 1000003) ^ this.f50961c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f50959a);
        sb.append(", wallClock=");
        sb.append(this.f50960b);
        sb.append(", monotonicClock=");
        sb.append(this.f50961c);
        sb.append(", backendName=");
        return android.support.v4.media.a.r(sb, this.d, "}");
    }
}
