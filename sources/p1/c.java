package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.i0;
import u7.s;
public abstract class c {
    public int f46518a;
    public int f46519b;
    public int f46520c;
    public Object d;

    public c() {
        if (s.f49650c == null) {
            s.f49650c = new s(17);
        }
    }

    public int a(int i10) {
        if (i10 < this.f46520c) {
            return ((ByteBuffer) this.d).getShort(this.f46519b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f46519b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f46519b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f46518a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f47107a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            i0.k(view, bVar);
            view.setTag(this.f46518a, obj);
            i0.g(this.f46520c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
