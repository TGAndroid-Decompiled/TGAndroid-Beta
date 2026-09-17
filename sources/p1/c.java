package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.i0;
public abstract class c {
    public int f40414a;
    public int f40415b;
    public int f40416c;
    public Object d;

    public c() {
        if (rb.a.f42213c == null) {
            rb.a.f42213c = new rb.a(18);
        }
    }

    public int a(int i10) {
        if (i10 < this.f40416c) {
            return ((ByteBuffer) this.d).getShort(this.f40415b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f40415b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f40415b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f40414a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f41831a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            i0.k(view, bVar);
            view.setTag(this.f40414a, obj);
            i0.g(this.f40416c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
