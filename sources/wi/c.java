package wi;

import org.telegram.ui.Components.rt;
public final class c {
    public final int f57923a;
    public final rt f57924b;

    public c(rt rtVar, int i7) {
        this.f57923a = i7;
        this.f57924b = rtVar;
    }

    public void a(Exception exc) {
        switch (this.f57923a) {
            case 0:
                rt rtVar = this.f57924b;
                ((t0) rtVar.f37758b).f58199i.post(new j0(rtVar, exc, 1));
                return;
            default:
                rt rtVar2 = this.f57924b;
                ((t0) rtVar2.f37758b).f58199i.post(new j0(rtVar2, exc, 0));
                return;
        }
    }
}
