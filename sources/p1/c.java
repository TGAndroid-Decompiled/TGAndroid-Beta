package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.i0;
public abstract class c {
    public int f45157a;
    public int f45158b;
    public int f45159c;
    public Object d;

    public c() {
        if (rb.a.f47142c == null) {
            rb.a.f47142c = new rb.a(18);
        }
    }

    public int a(int i10) {
        if (i10 < this.f45159c) {
            return ((ByteBuffer) this.d).getShort(this.f45158b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f45158b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f45158b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f45157a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f46725a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            i0.j(view, bVar);
            view.setTag(this.f45157a, obj);
            i0.f(this.f45159c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
