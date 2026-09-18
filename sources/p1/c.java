package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.i0;
public abstract class c {
    public int f40419a;
    public int f40420b;
    public int f40421c;
    public Object d;

    public c() {
        if (rb.a.f42218c == null) {
            rb.a.f42218c = new rb.a(18);
        }
    }

    public int a(int i10) {
        if (i10 < this.f40421c) {
            return ((ByteBuffer) this.d).getShort(this.f40420b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f40420b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f40420b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f40419a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f41836a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            i0.k(view, bVar);
            view.setTag(this.f40419a, obj);
            i0.g(this.f40421c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
