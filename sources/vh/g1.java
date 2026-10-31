package vh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.nb0;
public final class g1 extends h1 implements us {
    public final nb0 f51184b;
    public final e1 f51185c;
    public final p1 d;
    public final f1 e;
    public final c1 f51186f;
    public final ArrayList h;
    public final ArrayList f51187n;
    public final u1 f51188r;

    public g1(u1 u1Var, Context context) {
        super(context);
        this.f51188r = u1Var;
        this.f51186f = new Object();
        this.h = new ArrayList();
        this.f51187n = new ArrayList();
        nb0 nb0Var = new nb0(this, context, 5);
        this.f51184b = nb0Var;
        e1 e1Var = new e1(this);
        this.f51185c = e1Var;
        nb0Var.setAdapter(e1Var);
        f1 f1Var = new f1(this);
        this.e = f1Var;
        nb0Var.setLayoutManager(f1Var);
        nb0Var.i(new mg.u1(this, 9));
        nb0Var.setClipToPadding(true);
        nb0Var.setVerticalScrollBarEnabled(false);
        ag.y0 y0Var = new ag.y0(this, 19);
        nb0Var.setOnTouchListener(new org.telegram.ui.ActionBar.d1(7, this, y0Var));
        nb0Var.setOnItemClickListener(y0Var);
        nb0Var.setOnScrollListener(new bu0(this, 24));
        addView(nb0Var, w7.b6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        int i10 = u1.f51993y1;
        p1 p1Var = new p1(context, u1Var.I0);
        this.d = p1Var;
        p1Var.f51724x = new qh.d(this, 16);
        p1Var.a(2, false);
        addView(p1Var, w7.b6.e(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        e1 e1Var = this.f51185c;
        e1.E(e1Var, false);
        if (this.f51187n.isEmpty() && TextUtils.isEmpty(this.f51188r.f51994i1)) {
            e1Var.G();
        }
        e1Var.H(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i10 = 0;
        while (true) {
            nb0 nb0Var = this.f51184b;
            if (i10 < nb0Var.getChildCount()) {
                Object tag = nb0Var.getChildAt(i10).getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                    return Math.max(0, childAt.getBottom());
                }
                i10++;
            } else {
                return 0.0f;
            }
        }
    }

    @Override
    public final void c() {
        this.d.setTranslationY(org.telegram.messenger.i0.L(10.0f) + Math.max(0.0f, b()));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.X0) {
            e1.E(this.f51185c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = u1.f51993y1;
        zs.f(this.f51188r.f21583a).c(this, zs.X0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = u1.f51993y1;
        zs.f(this.f51188r.f21583a).n(this, zs.X0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = u1.f51993y1;
        int i13 = this.f51188r.f21615t0;
        setPadding(i13, 0, i13, org.telegram.messenger.i0.f16021n);
        super.onMeasure(i10, i11);
    }
}
