package r0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
public abstract class x {
    public int f54249a;
    public int f54250b;
    public int f54251c;
    public Object d;

    public x() {
        if (qb.a.f54073c == null) {
            qb.a.f54073c = new qb.a(23);
        }
    }

    public int a(int i7) {
        if (i7 < this.f54251c) {
            return ((ByteBuffer) this.d).getShort(this.f54250b + i7);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        b bVar;
        if (Build.VERSION.SDK_INT >= this.f54250b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f54250b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f54249a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate d = i0.d(view);
            if (d == null) {
                bVar = null;
            } else if (d instanceof a) {
                bVar = ((a) d).f54170a;
            } else {
                bVar = new b(d);
            }
            if (bVar == null) {
                bVar = new b();
            }
            i0.j(view, bVar);
            view.setTag(this.f54249a, obj);
            i0.f(this.f54251c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
