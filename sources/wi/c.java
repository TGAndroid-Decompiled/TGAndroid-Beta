package wi;

import org.telegram.ui.Components.qt;
public final class c {
    public final int f57827a;
    public final qt f57828b;

    public c(qt qtVar, int i7) {
        this.f57827a = i7;
        this.f57828b = qtVar;
    }

    public void a(Exception exc) {
        switch (this.f57827a) {
            case 0:
                qt qtVar = this.f57828b;
                ((u0) qtVar.f37389b).f58110i.post(new k0(qtVar, exc, 1));
                return;
            default:
                qt qtVar2 = this.f57828b;
                ((u0) qtVar2.f37389b).f58110i.post(new k0(qtVar2, exc, 0));
                return;
        }
    }
}
