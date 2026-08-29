package qa;

import org.telegram.messenger.FileLog;
public final class x0 implements na.v {
    public final int f46584a;
    public final Object f46585b;
    public final na.u f46586c;

    public x0(Object obj, na.u uVar, int i10) {
        this.f46584a = i10;
        this.f46585b = obj;
        this.f46586c = uVar;
    }

    @Override
    public final na.u create(na.g gVar, ua.a aVar) {
        switch (this.f46584a) {
            case 0:
                if (aVar.f49163a == ((Class) this.f46585b)) {
                    return this.f46586c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f49163a;
                if (!((Class) this.f46585b).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (aVar.equals((ua.a) this.f46585b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f46586c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f46584a) {
            case 0:
                return "Factory[type=" + ((Class) this.f46585b).getName() + ",adapter=" + this.f46586c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f46585b).getName() + ",adapter=" + this.f46586c + "]";
            default:
                return super.toString();
        }
    }
}
