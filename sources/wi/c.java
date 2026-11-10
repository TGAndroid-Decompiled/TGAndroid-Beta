package wi;

import org.telegram.ui.Components.qt;
public final class c {
    public final int f57940a;
    public final qt f57941b;

    public c(qt qtVar, int i7) {
        this.f57940a = i7;
        this.f57941b = qtVar;
    }

    public void a(Exception exc) {
        switch (this.f57940a) {
            case 0:
                qt qtVar = this.f57941b;
                ((t0) qtVar.f37395b).f58213i.post(new j0(qtVar, exc, 1));
                return;
            default:
                qt qtVar2 = this.f57941b;
                ((t0) qtVar2.f37395b).f58213i.post(new j0(qtVar2, exc, 0));
                return;
        }
    }
}
