package zd;
public final class u {
    public final Object f53272a;
    public final k f53273b;
    public final rd.l f53274c;
    public final Object d;
    public final Throwable f53275e;

    public u(Object obj, k kVar, rd.l lVar, Object obj2, Throwable th2) {
        this.f53272a = obj;
        this.f53273b = kVar;
        this.f53274c = lVar;
        this.d = obj2;
        this.f53275e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i10) {
        Object obj = uVar.f53272a;
        if ((i10 & 2) != 0) {
            kVar = uVar.f53273b;
        }
        k kVar2 = kVar;
        rd.l lVar = uVar.f53274c;
        Object obj2 = uVar.d;
        if ((i10 & 16) != 0) {
            th2 = uVar.f53275e;
        }
        return new u(obj, kVar2, lVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (kotlin.jvm.internal.i.a(this.f53272a, uVar.f53272a) && kotlin.jvm.internal.i.a(this.f53273b, uVar.f53273b) && kotlin.jvm.internal.i.a(this.f53274c, uVar.f53274c) && kotlin.jvm.internal.i.a(this.d, uVar.d) && kotlin.jvm.internal.i.a(this.f53275e, uVar.f53275e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i10 = 0;
        Object obj = this.f53272a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        k kVar = this.f53273b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        rd.l lVar = this.f53274c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Throwable th2 = this.f53275e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f53272a + ", cancelHandler=" + this.f53273b + ", onCancellation=" + this.f53274c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f53275e + ')';
    }

    public u(Object obj, k kVar, rd.l lVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
