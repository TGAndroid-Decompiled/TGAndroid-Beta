package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.j0;
public abstract class c {
    public int f45415a;
    public int f45416b;
    public int f45417c;
    public Object d;

    public c() {
        if (bb.a.f2042c == null) {
            bb.a.f2042c = new bb.a(19);
        }
    }

    public int a(int i10) {
        if (i10 < this.f45417c) {
            return ((ByteBuffer) this.d).getShort(this.f45416b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f45416b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f45416b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f45415a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = j0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f46787a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            j0.k(view, bVar);
            view.setTag(this.f45415a, obj);
            j0.g(this.f45417c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
