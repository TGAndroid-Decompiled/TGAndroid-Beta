package p1;

import android.os.Build;
import android.view.View;
import h7.u;
import java.nio.ByteBuffer;
import r0.j0;
public abstract class c {
    public int f40959a;
    public int f40960b;
    public int f40961c;
    public Object d;

    public c() {
        if (u.f7023c == null) {
            u.f7023c = new u(18);
        }
    }

    public int a(int i10) {
        if (i10 < this.f40961c) {
            return ((ByteBuffer) this.d).getShort(this.f40960b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f40960b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f40960b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f40959a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = j0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f43103a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            j0.k(view, bVar);
            view.setTag(this.f40959a, obj);
            j0.g(this.f40961c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
