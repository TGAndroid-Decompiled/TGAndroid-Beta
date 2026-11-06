package zd;
public final class u {
    public final Object f59992a;
    public final k f59993b;
    public final rd.q f59994c;
    public final Object d;
    public final Throwable f59995e;

    public u(Object obj, k kVar, rd.q qVar, Object obj2, Throwable th2) {
        this.f59992a = obj;
        this.f59993b = kVar;
        this.f59994c = qVar;
        this.d = obj2;
        this.f59995e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i7) {
        Object obj = uVar.f59992a;
        if ((i7 & 2) != 0) {
            kVar = uVar.f59993b;
        }
        k kVar2 = kVar;
        rd.q qVar = uVar.f59994c;
        Object obj2 = uVar.d;
        if ((i7 & 16) != 0) {
            th2 = uVar.f59995e;
        }
        return new u(obj, kVar2, qVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (kotlin.jvm.internal.j.a(this.f59992a, uVar.f59992a) && kotlin.jvm.internal.j.a(this.f59993b, uVar.f59993b) && kotlin.jvm.internal.j.a(this.f59994c, uVar.f59994c) && kotlin.jvm.internal.j.a(this.d, uVar.d) && kotlin.jvm.internal.j.a(this.f59995e, uVar.f59995e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i7 = 0;
        Object obj = this.f59992a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        k kVar = this.f59993b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        rd.q qVar = this.f59994c;
        if (qVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = qVar.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Throwable th2 = this.f59995e;
        if (th2 != null) {
            i7 = th2.hashCode();
        }
        return i13 + i7;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f59992a + ", cancelHandler=" + this.f59993b + ", onCancellation=" + this.f59994c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f59995e + ')';
    }

    public u(Object obj, k kVar, rd.q qVar, Throwable th2, int i7) {
        this(obj, (i7 & 2) != 0 ? null : kVar, (i7 & 4) != 0 ? null : qVar, (Object) null, (i7 & 16) != 0 ? null : th2);
    }
}
