package vh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.mb0;
public final class g1 extends h1 implements vs {
    public final mb0 f51199b;
    public final e1 f51200c;
    public final p1 d;
    public final f1 e;
    public final d1 f51201f;
    public final ArrayList h;
    public final ArrayList f51202n;
    public final u1 f51203r;

    public g1(u1 u1Var, Context context) {
        super(context);
        this.f51203r = u1Var;
        this.f51201f = new Object();
        this.h = new ArrayList();
        this.f51202n = new ArrayList();
        mb0 mb0Var = new mb0(this, context, 5);
        this.f51199b = mb0Var;
        e1 e1Var = new e1(this);
        this.f51200c = e1Var;
        mb0Var.setAdapter(e1Var);
        f1 f1Var = new f1(this);
        this.e = f1Var;
        mb0Var.setLayoutManager(f1Var);
        mb0Var.i(new mg.u1(this, 9));
        mb0Var.setClipToPadding(true);
        mb0Var.setVerticalScrollBarEnabled(false);
        ag.y0 y0Var = new ag.y0(this, 19);
        mb0Var.setOnTouchListener(new org.telegram.ui.ActionBar.d1(7, this, y0Var));
        mb0Var.setOnItemClickListener(y0Var);
        mb0Var.setOnScrollListener(new cu0(this, 24));
        addView(mb0Var, w7.b6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        int i10 = u1.f52000y1;
        p1 p1Var = new p1(context, u1Var.I0);
        this.d = p1Var;
        p1Var.f51739x = new qh.d(this, 16);
        p1Var.a(2, false);
        addView(p1Var, w7.b6.e(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        e1 e1Var = this.f51200c;
        e1.E(e1Var, false);
        if (this.f51202n.isEmpty() && TextUtils.isEmpty(this.f51203r.f52001i1)) {
            e1Var.G();
        }
        e1Var.H(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i10 = 0;
        while (true) {
            mb0 mb0Var = this.f51199b;
            if (i10 < mb0Var.getChildCount()) {
                Object tag = mb0Var.getChildAt(i10).getTag();
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
        if (i10 == at.X0) {
            e1.E(this.f51200c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = u1.f52000y1;
        at.f(this.f51203r.f21584a).c(this, at.X0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = u1.f52000y1;
        at.f(this.f51203r.f21584a).n(this, at.X0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = u1.f52000y1;
        int i13 = this.f51203r.f21616t0;
        setPadding(i13, 0, i13, org.telegram.messenger.i0.f16167n);
        super.onMeasure(i10, i11);
    }
}
