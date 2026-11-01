package zf;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.an0;
public final class t extends m1 {
    public final an0 f55645t;

    public t(an0 an0Var) {
        super(false);
        this.f55645t = an0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f55645t.F(tLObject);
    }
}
