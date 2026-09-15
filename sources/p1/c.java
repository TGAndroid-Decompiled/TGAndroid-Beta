package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.i0;
public abstract class c {
    public int f40392a;
    public int f40393b;
    public int f40394c;
    public Object d;

    public c() {
        if (rb.a.f42191c == null) {
            rb.a.f42191c = new rb.a(18);
        }
    }

    public int a(int i10) {
        if (i10 < this.f40394c) {
            return ((ByteBuffer) this.d).getShort(this.f40393b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f40393b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f40393b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f40392a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f41809a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            i0.k(view, bVar);
            view.setTag(this.f40392a, obj);
            i0.g(this.f40394c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
