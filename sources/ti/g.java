package ti;

import java.util.ArrayList;
public final class g implements r1.c {
    public final ArrayList f56089a;
    public final og.b f56090b;

    public g(og.b bVar, ArrayList arrayList) {
        this.f56090b = bVar;
        this.f56089a = arrayList;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        ArrayList arrayList = gVar.f54278k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        ArrayList arrayList2 = this.f56089a;
        arrayList2.add(gVar);
        if (arrayList2.size() == 2) {
            this.f56090b.b();
        }
    }
}
