package sa;

import org.telegram.messenger.FileLog;
public final class x0 implements pa.v {
    public final int f47255a;
    public final Object f47256b;
    public final pa.u f47257c;

    public x0(Object obj, pa.u uVar, int i10) {
        this.f47255a = i10;
        this.f47256b = obj;
        this.f47257c = uVar;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        switch (this.f47255a) {
            case 0:
                if (aVar.f49520a == ((Class) this.f47256b)) {
                    return this.f47257c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f49520a;
                if (!((Class) this.f47256b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((wa.a) this.f47256b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f47257c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f47255a) {
            case 0:
                return "Factory[type=" + ((Class) this.f47256b).getName() + ",adapter=" + this.f47257c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f47256b).getName() + ",adapter=" + this.f47257c + "]";
            default:
                return super.toString();
        }
    }
}
