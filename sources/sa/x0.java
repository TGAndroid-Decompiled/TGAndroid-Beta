package sa;

import org.telegram.messenger.FileLog;
public final class x0 implements pa.v {
    public final int f44234a;
    public final Object f44235b;
    public final pa.u f44236c;

    public x0(Object obj, pa.u uVar, int i10) {
        this.f44234a = i10;
        this.f44235b = obj;
        this.f44236c = uVar;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        switch (this.f44234a) {
            case 0:
                if (aVar.f46505a == ((Class) this.f44235b)) {
                    return this.f44236c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f46505a;
                if (!((Class) this.f44235b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((wa.a) this.f44235b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f44236c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f44234a) {
            case 0:
                return "Factory[type=" + ((Class) this.f44235b).getName() + ",adapter=" + this.f44236c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f44235b).getName() + ",adapter=" + this.f44236c + "]";
            default:
                return super.toString();
        }
    }
}
