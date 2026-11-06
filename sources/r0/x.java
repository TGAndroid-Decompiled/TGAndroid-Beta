package r0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
public abstract class x {
    public int f54143a;
    public int f54144b;
    public int f54145c;
    public Object d;

    public x() {
        if (qb.a.f53967c == null) {
            qb.a.f53967c = new qb.a(23);
        }
    }

    public int a(int i7) {
        if (i7 < this.f54145c) {
            return ((ByteBuffer) this.d).getShort(this.f54144b + i7);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        b bVar;
        if (Build.VERSION.SDK_INT >= this.f54144b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f54144b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f54143a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof a) {
                bVar = ((a) d).f54064a;
            } else {
                bVar = new b(d);
            }
            if (bVar == null) {
                bVar = new b();
            }
            i0.j(view, bVar);
            view.setTag(this.f54143a, obj);
            i0.f(this.f54145c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
