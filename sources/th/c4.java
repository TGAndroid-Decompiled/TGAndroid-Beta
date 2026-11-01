package th;

import android.content.Context;
import android.view.View;
public final class c4 extends z4.a {
    public final o7 f48855c;
    public final Context d;
    public final f4 e;

    public c4(Context context, f4 f4Var, o7 o7Var) {
        this.e = f4Var;
        this.f48855c = o7Var;
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
        f4 f4Var = this.e;
        b4 b4Var = new b4(this, this.f48855c, this.d, f4Var.H, new ph.h1(this, 16));
        b4Var.setTag(Integer.valueOf(i10));
        b4Var.setShadowDrawable(f4Var.f48981s);
        b4Var.setPadding(0, org.telegram.messenger.i0.L(16.0f), 0, 0);
        b4Var.g(f4Var.D, (e4) f4Var.F.get(i10));
        b4Var.setListBottomPadding(f4Var.d);
        gVar.addView(b4Var);
        f4Var.G.add(b4Var);
        return b4Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
