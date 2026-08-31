package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.j0;
public abstract class c {
    public int f44086a;
    public int f44087b;
    public int f44088c;
    public Object d;

    public c() {
        if (ab.a.f160b == null) {
            ab.a.f160b = new ab.a(18);
        }
    }

    public int a(int i10) {
        if (i10 < this.f44088c) {
            return ((ByteBuffer) this.d).getShort(this.f44087b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f44087b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f44087b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f44086a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = j0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f46396a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            j0.k(view, bVar);
            view.setTag(this.f44086a, obj);
            j0.g(this.f44088c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
