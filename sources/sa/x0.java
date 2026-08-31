package sa;

import org.telegram.messenger.FileLog;
public final class x0 implements pa.v {
    public final int f47224a;
    public final Object f47225b;
    public final pa.u f47226c;

    public x0(Object obj, pa.u uVar, int i10) {
        this.f47224a = i10;
        this.f47225b = obj;
        this.f47226c = uVar;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        switch (this.f47224a) {
            case 0:
                if (aVar.f49483a == ((Class) this.f47225b)) {
                    return this.f47226c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f49483a;
                if (!((Class) this.f47225b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((wa.a) this.f47225b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f47226c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f47224a) {
            case 0:
                return "Factory[type=" + ((Class) this.f47225b).getName() + ",adapter=" + this.f47226c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f47225b).getName() + ",adapter=" + this.f47226c + "]";
            default:
                return super.toString();
        }
    }
}
