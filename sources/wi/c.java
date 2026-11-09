package wi;

import org.telegram.ui.Components.rt;
public final class c {
    public final int f57936a;
    public final rt f57937b;

    public c(rt rtVar, int i7) {
        this.f57936a = i7;
        this.f57937b = rtVar;
    }

    public void a(Exception exc) {
        switch (this.f57936a) {
            case 0:
                rt rtVar = this.f57937b;
                ((t0) rtVar.f37805b).f58209i.post(new j0(rtVar, exc, 1));
                return;
            default:
                rt rtVar2 = this.f57937b;
                ((t0) rtVar2.f37805b).f58209i.post(new j0(rtVar2, exc, 0));
                return;
        }
    }
}
