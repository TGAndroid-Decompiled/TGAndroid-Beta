package p5;

import a8.p0;
import android.content.Context;
public final class b extends c {
    public final Context f53473a;
    public final x5.a f53474b;
    public final x5.a f53475c;
    public final String d;

    public b(Context context, x5.a aVar, x5.a aVar2, String str) {
        if (context != null) {
            this.f53473a = context;
            if (aVar != null) {
                this.f53474b = aVar;
                if (aVar2 != null) {
                    this.f53475c = aVar2;
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
            if (this.f53473a.equals(bVar.f53473a) && this.f53474b.equals(bVar.f53474b) && this.f53475c.equals(bVar.f53475c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f53473a.hashCode() ^ 1000003) * 1000003) ^ this.f53474b.hashCode()) * 1000003) ^ this.f53475c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f53473a);
        sb2.append(", wallClock=");
        sb2.append(this.f53474b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f53475c);
        sb2.append(", backendName=");
        return p0.s(sb2, this.d, "}");
    }
}
