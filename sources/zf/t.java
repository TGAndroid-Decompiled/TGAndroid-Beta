package zf;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.zm0;
public final class t extends m1 {
    public final zm0 f55627t;

    public t(zm0 zm0Var) {
        super(false);
        this.f55627t = zm0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f55627t.F(tLObject);
    }
}
