package wi;

import org.telegram.ui.Components.nh;
public final class c {
    public final int f57793a;
    public final nh f57794b;

    public c(nh nhVar, int i3) {
        this.f57793a = i3;
        this.f57794b = nhVar;
    }

    public void a(Exception exc) {
        switch (this.f57793a) {
            case 0:
                nh nhVar = this.f57794b;
                ((t0) nhVar.f36540b).f58060i.post(new j0(nhVar, exc, 1));
                return;
            default:
                nh nhVar2 = this.f57794b;
                ((t0) nhVar2.f36540b).f58060i.post(new j0(nhVar2, exc, 0));
                return;
        }
    }
}
