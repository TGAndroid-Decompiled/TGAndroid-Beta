package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import oa.d;
import r0.i0;
public abstract class c {
    public int f43957a;
    public int f43958b;
    public int f43959c;
    public Object d;

    public c() {
        if (d.f17722b == null) {
            d.f17722b = new d(19);
        }
    }

    public int a(int i10) {
        if (i10 < this.f43959c) {
            return ((ByteBuffer) this.d).getShort(this.f43958b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f43958b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f43958b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f43957a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f44828a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            i0.j(view, bVar);
            view.setTag(this.f43957a, obj);
            i0.f(this.f43959c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
