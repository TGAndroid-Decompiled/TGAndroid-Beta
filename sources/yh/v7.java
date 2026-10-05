package yh;

import android.util.Log;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h61;
public final class v7 implements Utilities.Callback5, e2.h, i5.e {
    public final int f52178a;
    public final Object f52179b;

    public v7(Object obj, int i10) {
        this.f52178a = i10;
        this.f52179b = obj;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f52178a) {
            case 1:
                z3.h hVar = (z3.h) this.f52179b;
                z3.a aVar = (z3.a) obj;
                z3.g gVar = new z3.g(aVar.f52383b, ob.a.C2(aVar.f52382a, aVar.f52384c));
                hVar.f52393c.add(gVar);
                long j3 = hVar.f52398j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    hVar.a(gVar);
                    return;
                }
                return;
            default:
                ((e9.f0) this.f52179b).b((z3.a) obj);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        ((k2.e) this.f52179b).getClass();
        String c10 = za.b0.f53086b.c((za.a0) obj);
        kotlin.jvm.internal.i.d(c10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(c10));
        byte[] bytes = c10.getBytes(xd.a.f49833a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w7 w7Var = (w7) this.f52179b;
        h61 h61Var = (h61) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        w7Var.getClass();
        if (h61Var.G instanceof TL_stars.StarsTransaction) {
            z7.n1(w7Var.getContext(), false, 0L, w7Var.f52205c, (TL_stars.StarsTransaction) h61Var.G, w7Var.f52204b);
        }
    }
}
