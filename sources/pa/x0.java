package pa;

import org.telegram.messenger.FileLog;

public final class x0 implements ma.v {

    public final int f45677a;

    public final Object f45678b;

    public final ma.u f45679c;

    public x0(Object obj, ma.u uVar, int i10) {
        this.f45677a = i10;
        this.f45678b = obj;
        this.f45679c = uVar;
    }

    @Override
    public final ma.u create(ma.g gVar, ta.a aVar) {
        switch (this.f45677a) {
            case 0:
                if (aVar.f48151a == ((Class) this.f45678b)) {
                    return this.f45679c;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f48151a;
                if (((Class) this.f45678b).isAssignableFrom(cls)) {
                    return new c(this, cls);
                }
                return null;
            default:
                if (aVar.equals((ta.a) this.f45678b)) {
                    return (FileLog.ByteArrayHexAdapter) this.f45679c;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f45677a) {
            case 0:
                return "Factory[type=" + ((Class) this.f45678b).getName() + ",adapter=" + this.f45679c + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f45678b).getName() + ",adapter=" + this.f45679c + "]";
            default:
                return super.toString();
        }
    }
}
