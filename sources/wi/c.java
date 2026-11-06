package wi;

import org.telegram.ui.Components.qt;
public final class c {
    public final int f57831a;
    public final qt f57832b;

    public c(qt qtVar, int i7) {
        this.f57831a = i7;
        this.f57832b = qtVar;
    }

    public void a(Exception exc) {
        switch (this.f57831a) {
            case 0:
                qt qtVar = this.f57832b;
                ((t0) qtVar.f37389b).f58104i.post(new j0(qtVar, exc, 1));
                return;
            default:
                qt qtVar2 = this.f57832b;
                ((t0) qtVar2.f37389b).f58104i.post(new j0(qtVar2, exc, 0));
                return;
        }
    }
}
