package zh;

import android.content.Context;
public final class m7 extends r {
    public final u7 f48696a;

    public m7(Context context, u7 u7Var) {
        super(context);
        this.f48696a = u7Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        k2.v vVar = this.f48696a.G0;
        if (vVar != null) {
            vVar.b();
        }
    }
}
