package ti;

import java.util.ArrayList;
public final class g implements r1.c {
    public final ArrayList f56076a;
    public final og.b f56077b;

    public g(og.b bVar, ArrayList arrayList) {
        this.f56077b = bVar;
        this.f56076a = arrayList;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        ArrayList arrayList = gVar.f54265k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        ArrayList arrayList2 = this.f56076a;
        arrayList2.add(gVar);
        if (arrayList2.size() == 2) {
            this.f56077b.b();
        }
    }
}
