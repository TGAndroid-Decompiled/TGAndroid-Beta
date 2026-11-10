package zd;
public final class u {
    public final Object f60123a;
    public final k f60124b;
    public final rd.q f60125c;
    public final Object d;
    public final Throwable f60126e;

    public u(Object obj, k kVar, rd.q qVar, Object obj2, Throwable th2) {
        this.f60123a = obj;
        this.f60124b = kVar;
        this.f60125c = qVar;
        this.d = obj2;
        this.f60126e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i7) {
        Object obj = uVar.f60123a;
        if ((i7 & 2) != 0) {
            kVar = uVar.f60124b;
        }
        k kVar2 = kVar;
        rd.q qVar = uVar.f60125c;
        Object obj2 = uVar.d;
        if ((i7 & 16) != 0) {
            th2 = uVar.f60126e;
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
        if (kotlin.jvm.internal.j.a(this.f60123a, uVar.f60123a) && kotlin.jvm.internal.j.a(this.f60124b, uVar.f60124b) && kotlin.jvm.internal.j.a(this.f60125c, uVar.f60125c) && kotlin.jvm.internal.j.a(this.d, uVar.d) && kotlin.jvm.internal.j.a(this.f60126e, uVar.f60126e)) {
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
        Object obj = this.f60123a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        k kVar = this.f60124b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        rd.q qVar = this.f60125c;
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
        Throwable th2 = this.f60126e;
        if (th2 != null) {
            i7 = th2.hashCode();
        }
        return i13 + i7;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f60123a + ", cancelHandler=" + this.f60124b + ", onCancellation=" + this.f60125c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f60126e + ')';
    }

    public u(Object obj, k kVar, rd.q qVar, Throwable th2, int i7) {
        this(obj, (i7 & 2) != 0 ? null : kVar, (i7 & 4) != 0 ? null : qVar, (Object) null, (i7 & 16) != 0 ? null : th2);
    }
}
