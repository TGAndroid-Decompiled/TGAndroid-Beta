package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.i0;
public abstract class c {
    public int f40663a;
    public int f40664b;
    public int f40665c;
    public Object d;

    public c() {
        if (rb.a.f42476c == null) {
            rb.a.f42476c = new rb.a(18);
        }
    }

    public int a(int i10) {
        if (i10 < this.f40665c) {
            return ((ByteBuffer) this.d).getShort(this.f40664b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f40664b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f40664b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f40663a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f42095a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            i0.k(view, bVar);
            view.setTag(this.f40663a, obj);
            i0.g(this.f40665c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
