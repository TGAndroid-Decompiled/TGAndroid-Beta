package wi;

import org.telegram.ui.Components.qt;
public final class c {
    public final int f57807a;
    public final qt f57808b;

    public c(qt qtVar, int i7) {
        this.f57807a = i7;
        this.f57808b = qtVar;
    }

    public void a(Exception exc) {
        switch (this.f57807a) {
            case 0:
                qt qtVar = this.f57808b;
                ((t0) qtVar.f37504b).f58080i.post(new j0(qtVar, exc, 1));
                return;
            default:
                qt qtVar2 = this.f57808b;
                ((t0) qtVar2.f37504b).f58080i.post(new j0(qtVar2, exc, 0));
                return;
        }
    }
}
