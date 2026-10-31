package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.h0;
public abstract class c {
    public int f44530a;
    public int f44531b;
    public int f44532c;
    public Object d;

    public c() {
        if (hb.a.f7647b == null) {
            hb.a.f7647b = new hb.a(17);
        }
    }

    public int a(int i10) {
        if (i10 < this.f44532c) {
            return ((ByteBuffer) this.d).getShort(this.f44531b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f44531b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f44531b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f44530a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = h0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f46094a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            h0.j(view, bVar);
            view.setTag(this.f44530a, obj);
            h0.f(this.f44532c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
