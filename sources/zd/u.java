package zd;
public final class u {
    public final Object f51600a;
    public final k f51601b;
    public final rd.l f51602c;
    public final Object d;
    public final Throwable f51603e;

    public u(Object obj, k kVar, rd.l lVar, Object obj2, Throwable th2) {
        this.f51600a = obj;
        this.f51601b = kVar;
        this.f51602c = lVar;
        this.d = obj2;
        this.f51603e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i10) {
        Object obj = uVar.f51600a;
        if ((i10 & 2) != 0) {
            kVar = uVar.f51601b;
        }
        k kVar2 = kVar;
        rd.l lVar = uVar.f51602c;
        Object obj2 = uVar.d;
        if ((i10 & 16) != 0) {
            th2 = uVar.f51603e;
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
        if (kotlin.jvm.internal.i.a(this.f51600a, uVar.f51600a) && kotlin.jvm.internal.i.a(this.f51601b, uVar.f51601b) && kotlin.jvm.internal.i.a(this.f51602c, uVar.f51602c) && kotlin.jvm.internal.i.a(this.d, uVar.d) && kotlin.jvm.internal.i.a(this.f51603e, uVar.f51603e)) {
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
        Object obj = this.f51600a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        k kVar = this.f51601b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        rd.l lVar = this.f51602c;
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
        Throwable th2 = this.f51603e;
        if (th2 != null) {
            i10 = th2.hashCode();
        }
        return i14 + i10;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f51600a + ", cancelHandler=" + this.f51601b + ", onCancellation=" + this.f51602c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f51603e + ')';
    }

    public u(Object obj, k kVar, rd.l lVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? null : lVar, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
