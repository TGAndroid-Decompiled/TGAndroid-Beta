package wi;

import java.util.ArrayList;
public final class f implements r1.c {
    public final ArrayList f59940a;
    public final og.b f59941b;

    public f(og.b bVar, ArrayList arrayList) {
        this.f59941b = bVar;
        this.f59940a = arrayList;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        ArrayList arrayList = gVar.f56321k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        ArrayList arrayList2 = this.f59940a;
        arrayList2.add(gVar);
        if (arrayList2.size() == 2) {
            this.f59941b.b();
        }
    }
}
