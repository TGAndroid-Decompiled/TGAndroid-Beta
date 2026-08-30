package pa;

import sa.y;
public class f extends y {
    public u f41078a = null;

    @Override
    public final u a() {
        u uVar = this.f41078a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final Object read(xa.a aVar) {
        u uVar = this.f41078a;
        if (uVar != null) {
            return uVar.read(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        u uVar = this.f41078a;
        if (uVar != null) {
            uVar.write(bVar, obj);
            return;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
