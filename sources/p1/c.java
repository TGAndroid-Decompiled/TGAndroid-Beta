package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import oa.d;
import r0.i0;
public abstract class c {
    public int f44337a;
    public int f44338b;
    public int f44339c;
    public Object d;

    public c() {
        if (d.f17782b == null) {
            d.f17782b = new d(19);
        }
    }

    public int a(int i10) {
        if (i10 < this.f44339c) {
            return ((ByteBuffer) this.d).getShort(this.f44338b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f44338b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f44338b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f44337a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f45205a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            i0.j(view, bVar);
            view.setTag(this.f44337a, obj);
            i0.f(this.f44339c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
