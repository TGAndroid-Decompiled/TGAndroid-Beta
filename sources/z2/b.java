package z2;

import a4.w;
import android.content.Context;
public final class b extends c {
    public final Context f50552a;
    public final h3.a f50553b;
    public final h3.a f50554c;
    public final String d;

    public b(Context context, h3.a aVar, h3.a aVar2, String str) {
        if (context != null) {
            this.f50552a = context;
            if (aVar != null) {
                this.f50553b = aVar;
                if (aVar2 != null) {
                    this.f50554c = aVar2;
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
            if (this.f50552a.equals(bVar.f50552a) && this.f50553b.equals(bVar.f50553b) && this.f50554c.equals(bVar.f50554c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f50552a.hashCode() ^ 1000003) * 1000003) ^ this.f50553b.hashCode()) * 1000003) ^ this.f50554c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f50552a);
        sb2.append(", wallClock=");
        sb2.append(this.f50553b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f50554c);
        sb2.append(", backendName=");
        return w.q(sb2, this.d, "}");
    }
}
