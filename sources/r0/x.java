package r0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
public abstract class x {
    public int f56415a;
    public int f56416b;
    public int f56417c;
    public Object d;

    public x() {
        if (nb.a.f21561c == null) {
            nb.a.f21561c = new nb.a(24);
        }
    }

    public int a(int i7) {
        if (i7 < this.f56417c) {
            return ((ByteBuffer) this.d).getShort(this.f56416b + i7);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        b bVar;
        if (Build.VERSION.SDK_INT >= this.f56416b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f56416b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f56415a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof a) {
                bVar = ((a) d).f56335a;
            } else {
                bVar = new b(d);
            }
            if (bVar == null) {
                bVar = new b();
            }
            i0.j(view, bVar);
            view.setTag(this.f56415a, obj);
            i0.f(this.f56417c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
