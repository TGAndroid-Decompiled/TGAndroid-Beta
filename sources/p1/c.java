package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import oa.d;
import r0.j0;
public abstract class c {
    public int f42830a;
    public int f42831b;
    public int f42832c;
    public Object d;

    public c() {
        if (d.f16628b == null) {
            d.f16628b = new d(19);
        }
    }

    public int a(int i10) {
        if (i10 < this.f42832c) {
            return ((ByteBuffer) this.d).getShort(this.f42831b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f42831b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f42831b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f42830a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = j0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f43692a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            j0.j(view, bVar);
            view.setTag(this.f42830a, obj);
            j0.f(this.f42832c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
