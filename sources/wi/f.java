package wi;

import java.util.ArrayList;
public final class f implements r1.c {
    public final ArrayList f59986a;
    public final og.b f59987b;

    public f(og.b bVar, ArrayList arrayList) {
        this.f59987b = bVar;
        this.f59986a = arrayList;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        ArrayList arrayList = gVar.f56366k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        ArrayList arrayList2 = this.f59986a;
        arrayList2.add(gVar);
        if (arrayList2.size() == 2) {
            this.f59987b.b();
        }
    }
}
