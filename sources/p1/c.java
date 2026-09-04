package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.i0;
import t7.u;
public abstract class c {
    public int f43637a;
    public int f43638b;
    public int f43639c;
    public Object d;

    public c() {
        if (u.d == null) {
            u.d = new u(18);
        }
    }

    public int a(int i10) {
        if (i10 < this.f43639c) {
            return ((ByteBuffer) this.d).getShort(this.f43638b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f43638b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f43638b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f43637a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f44660a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            i0.k(view, bVar);
            view.setTag(this.f43637a, obj);
            i0.g(this.f43639c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
