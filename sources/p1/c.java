package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.j0;
public abstract class c {
    public int f45335a;
    public int f45336b;
    public int f45337c;
    public Object d;

    public c() {
        if (wa.a.f48782b == null) {
            wa.a.f48782b = new wa.a(20);
        }
    }

    public int a(int i9) {
        if (i9 < this.f45337c) {
            return ((ByteBuffer) this.d).getShort(this.f45336b + i9);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f45336b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f45336b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f45335a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = j0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f46873a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            j0.k(view, bVar);
            view.setTag(this.f45335a, obj);
            j0.g(this.f45337c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
