package sa;

import org.telegram.messenger.FileLog;
public final class x0 implements pa.v {
    public final int f44299a;
    public final Object f44300b;
    public final pa.u f44301c;

    public x0(Object obj, pa.u uVar, int i10) {
        this.f44299a = i10;
        this.f44300b = obj;
        this.f44301c = uVar;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        switch (this.f44299a) {
            case 0:
                if (aVar.f46587a == ((Class) this.f44300b)) {
                    return this.f44301c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f46587a;
                if (!((Class) this.f44300b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((wa.a) this.f44300b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f44301c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f44299a) {
            case 0:
                return "Factory[type=" + ((Class) this.f44300b).getName() + ",adapter=" + this.f44301c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f44300b).getName() + ",adapter=" + this.f44301c + "]";
            default:
                return super.toString();
        }
    }
}
