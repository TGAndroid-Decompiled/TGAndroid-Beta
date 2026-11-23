package zi;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
public final class k0 implements j6.n {
    public final Object f62193a;

    public k0(Object obj) {
        this.f62193a = obj;
    }

    @Override
    public void g(String str, long j3, long j10, long j11) {
        h6.o oVar = (h6.o) this.f62193a;
        try {
            oVar.a(new h6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            j6.b bVar = h6.h.f13913k;
            Log.e(bVar.f17235a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = oVar.f13937q.f13920i.iterator();
        while (it.hasNext()) {
            ((h6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    @Override
    public void j(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: zi.k0.j(java.lang.String, long, int, java.lang.Object, long, long):void");
    }
}
