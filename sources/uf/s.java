package uf;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.wn0;
public final class s extends k1 {
    public final wn0 f48716t;

    public s(wn0 wn0Var) {
        super(false);
        this.f48716t = wn0Var;
    }

    @Override
    public final boolean d(TLObject tLObject) {
        return this.f48716t.F(tLObject);
    }
}
