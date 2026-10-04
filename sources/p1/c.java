package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.i0;
public abstract class c {
    public int f43986a;
    public int f43987b;
    public int f43988c;
    public Object d;

    public c() {
        if (rb.a.f45985c == null) {
            rb.a.f45985c = new rb.a(18);
        }
    }

    public int a(int i10) {
        if (i10 < this.f43988c) {
            return ((ByteBuffer) this.d).getShort(this.f43987b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f43987b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f43987b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f43986a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof r0.a) {
                bVar = ((r0.a) d).f45566a;
            } else {
                bVar = new r0.b(d);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            i0.k(view, bVar);
            view.setTag(this.f43986a, obj);
            i0.g(this.f43988c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
