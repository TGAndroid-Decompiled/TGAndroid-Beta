package u7;

import a8.p0;
import android.content.Context;
import android.graphics.Point;
import android.location.Location;
import androidx.lifecycle.m0;
import androidx.lifecycle.s0;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.qa;
import org.telegram.messenger.rd;
import org.telegram.messenger.t0;
import org.telegram.messenger.y9;
public final class i implements com.google.android.gms.common.api.internal.n, v0.g, q5.b, s0 {
    public static i f57879b;
    public Object f57880a;

    public i(Object obj) {
        this.f57880a = obj;
    }

    public static i b() {
        if (f57879b == null) {
            Point point = g0.f23609q;
            int i7 = point.x;
            int i10 = point.y;
            ?? obj = new Object();
            obj.f57880a = t0.f26600b.getSharedPreferences(p0.m(i7, i10, "pip_floating_", "_"), 0);
            f57879b = obj;
        }
        return f57879b;
    }

    @Override
    public void a(Object obj) {
        w0.d e10 = (w0.d) obj;
        kotlin.jvm.internal.j.e(e10, "e");
        zd.m mVar = (zd.m) this.f57880a;
        if (mVar.w()) {
            mVar.resumeWith(af.b.b(e10));
        }
    }

    @Override
    public androidx.lifecycle.p0 d(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public androidx.lifecycle.p0 e(Class cls, y1.b bVar) {
        m0 m0Var = null;
        for (y1.c cVar : (y1.c[]) this.f57880a) {
            if (cVar.f60092a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public void g(Object obj) {
        Location location;
        qa qaVar = ((y9) obj).f27691a;
        List list = ((LocationResult) this.f57880a).f7079a;
        int size = list.size();
        if (size == 0) {
            location = null;
        } else {
            location = (Location) list.get(size - 1);
        }
        ia.d dVar = (ia.d) qaVar;
        if (location == null) {
            dVar.getClass();
        } else {
            ((rd) dVar.f15881b).m(location);
        }
    }

    @Override
    public Object mo24get() {
        String packageName = ((Context) ((fd.a) this.f57880a).mo24get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public void onResult(Object obj) {
        v0.c result = (v0.c) obj;
        kotlin.jvm.internal.j.e(result, "result");
        zd.m mVar = (zd.m) this.f57880a;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }
}
