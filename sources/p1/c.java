package p1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import r0.j0;

public abstract class c {

    public int f45341a;

    public int f45342b;

    public int f45343c;
    public Object d;

    public c() {
        if (xa.a.f49382c == null) {
            xa.a.f49382c = new xa.a(20);
        }
    }

    public int a(int i10) {
        if (i10 < this.f45343c) {
            return ((ByteBuffer) this.d).getShort(this.f45342b + i10);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        r0.b bVar;
        if (Build.VERSION.SDK_INT >= this.f45342b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f45342b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f45341a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = j0.d(view);
            if (accessibilityDelegateD == null) {
                bVar = null;
            } else {
                bVar = accessibilityDelegateD instanceof r0.a ? ((r0.a) accessibilityDelegateD).f46563a : new r0.b(accessibilityDelegateD);
            }
            if (bVar == null) {
                bVar = new r0.b();
            }
            j0.k(view, bVar);
            view.setTag(this.f45341a, obj);
            j0.g(this.f45343c, view);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
