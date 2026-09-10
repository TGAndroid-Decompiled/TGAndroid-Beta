package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d4 extends z4.a {
    public final u7 f48347c;
    public final Context d;
    public final g4 e;

    public d4(Context context, g4 g4Var, u7 u7Var) {
        this.e = g4Var;
        this.f48347c = u7Var;
        this.d = context;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
        this.e.G.remove(obj);
    }

    @Override
    public final int b() {
        return this.e.F.size();
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        g4 g4Var = this.e;
        c4 c4Var = new c4(this, this.f48347c, this.d, g4Var.H, new bi.i5(this, 10));
        c4Var.setTag(Integer.valueOf(i10));
        c4Var.setShadowDrawable(g4Var.f48446s);
        c4Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        c4Var.g(g4Var.f48449y, (f4) g4Var.F.get(i10));
        c4Var.setListBottomPadding(g4Var.d);
        gVar.addView(c4Var);
        g4Var.G.add(c4Var);
        return c4Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
