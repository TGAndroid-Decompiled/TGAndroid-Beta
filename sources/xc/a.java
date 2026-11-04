package xc;

import java.util.ArrayList;
import java.util.Map;
public final class a extends c {
    public final a f58606e;
    public ArrayList f58607f;

    public a(String str, int i3, Map map, a aVar) {
        super(i3, str, map);
        this.f58606e = aVar;
    }

    @Override
    public final Map a() {
        return this.f58610c;
    }

    public final void b(int i3) {
        if (this.d > -1) {
            return;
        }
        this.d = i3;
        ArrayList arrayList = this.f58607f;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a) obj).b(i3);
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BlockImpl{name='");
        sb2.append(this.f58608a);
        sb2.append("', start=");
        sb2.append(this.f58609b);
        sb2.append(", end=");
        sb2.append(this.d);
        sb2.append(", attributes=");
        sb2.append(this.f58610c);
        sb2.append(", parent=");
        a aVar = this.f58606e;
        if (aVar != null) {
            str = aVar.f58608a;
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(", children=");
        sb2.append(this.f58607f);
        sb2.append('}');
        return sb2.toString();
    }
}
