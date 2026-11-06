package wi;

import org.telegram.ui.Components.qt;
public final class c {
    public final int f57832a;
    public final qt f57833b;

    public c(qt qtVar, int i7) {
        this.f57832a = i7;
        this.f57833b = qtVar;
    }

    public void a(Exception exc) {
        switch (this.f57832a) {
            case 0:
                qt qtVar = this.f57833b;
                ((t0) qtVar.f37394b).f58105i.post(new j0(qtVar, exc, 1));
                return;
            default:
                qt qtVar2 = this.f57833b;
                ((t0) qtVar2.f37394b).f58105i.post(new j0(qtVar2, exc, 0));
                return;
        }
    }
}
