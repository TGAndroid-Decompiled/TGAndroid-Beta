package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import oa.d;
import r0.i0;
public abstract class c {
    public int f43917a;
    public int f43918b;
    public int f43919c;
    public Object d;

    public c() {
        if (d.f17718b == null) {
            d.f17718b = new d(19);
        }
    }

    public int a(int i10) {
        if (i10 < this.f43919c) {
            return ((ByteBuffer) this.d).getShort(this.f43918b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f43918b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f43918b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f43917a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f44782a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            i0.j(view, bVar);
            view.setTag(this.f43917a, obj);
            i0.f(this.f43919c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
