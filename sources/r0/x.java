package r0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
public abstract class x {
    public int f54061a;
    public int f54062b;
    public int f54063c;
    public Object d;

    public x() {
        if (nb.a.f20316c == null) {
            nb.a.f20316c = new nb.a(22);
        }
    }

    public int a(int i3) {
        if (i3 < this.f54063c) {
            return ((ByteBuffer) this.d).getShort(this.f54062b + i3);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        b bVar;
        if (Build.VERSION.SDK_INT >= this.f54062b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f54062b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f54061a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof a) {
                bVar = ((a) d).f53982a;
            } else {
                bVar = new b(d);
            }
            if (bVar == null) {
                bVar = new b();
            }
            i0.j(view, bVar);
            view.setTag(this.f54061a, obj);
            i0.f(this.f54063c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
