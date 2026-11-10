package ti;

import java.util.ArrayList;
public final class g implements r1.c {
    public final ArrayList f56088a;
    public final og.b f56089b;

    public g(og.b bVar, ArrayList arrayList) {
        this.f56089b = bVar;
        this.f56088a = arrayList;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        ArrayList arrayList = gVar.f54277k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        ArrayList arrayList2 = this.f56088a;
        arrayList2.add(gVar);
        if (arrayList2.size() == 2) {
            this.f56089b.b();
        }
    }
}
