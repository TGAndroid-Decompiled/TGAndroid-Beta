package wd;
public final class u {
    public final Object f57535a;
    public final k f57536b;
    public final od.q f57537c;
    public final Object d;
    public final Throwable f57538e;

    public u(Object obj, k kVar, od.q qVar, Object obj2, Throwable th2) {
        this.f57535a = obj;
        this.f57536b = kVar;
        this.f57537c = qVar;
        this.d = obj2;
        this.f57538e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i3) {
        Object obj = uVar.f57535a;
        if ((i3 & 2) != 0) {
            kVar = uVar.f57536b;
        }
        k kVar2 = kVar;
        od.q qVar = uVar.f57537c;
        Object obj2 = uVar.d;
        if ((i3 & 16) != 0) {
            th2 = uVar.f57538e;
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
        if (kotlin.jvm.internal.j.a(this.f57535a, uVar.f57535a) && kotlin.jvm.internal.j.a(this.f57536b, uVar.f57536b) && kotlin.jvm.internal.j.a(this.f57537c, uVar.f57537c) && kotlin.jvm.internal.j.a(this.d, uVar.d) && kotlin.jvm.internal.j.a(this.f57538e, uVar.f57538e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i3 = 0;
        Object obj = this.f57535a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        k kVar = this.f57536b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        od.q qVar = this.f57537c;
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
        Throwable th2 = this.f57538e;
        if (th2 != null) {
            i3 = th2.hashCode();
        }
        return i13 + i3;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f57535a + ", cancelHandler=" + this.f57536b + ", onCancellation=" + this.f57537c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f57538e + ')';
    }

    public u(Object obj, k kVar, od.q qVar, Throwable th2, int i3) {
        this(obj, (i3 & 2) != 0 ? null : kVar, (i3 & 4) != 0 ? null : qVar, (Object) null, (i3 & 16) != 0 ? null : th2);
    }
}
