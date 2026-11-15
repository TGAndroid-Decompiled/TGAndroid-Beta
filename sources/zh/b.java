package zh;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import bi.b6;
import bi.w3;
import c8.ja;
import di.c1;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import v4.t0;
public final class b extends e51 {
    public final int O1;
    public final y80 P1;
    public final pz Q1;
    public final cv0 R1;
    public final cv0 S1;
    public float T1;
    public boolean U1;
    public int V1;
    public final d W1;

    public b(d dVar, e2 e2Var, long j3) {
        super(e2Var.getCurrentAccount(), e2Var.getParentActivity(), e2Var.getResourceProvider());
        this.W1 = dVar;
        this.O1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i7 = j6.f28792a7;
        v0(j6.w0(i7, this.J0));
        this.G1 = i7;
        this.F1 = i7;
        M0(0.0f);
        Q(i7);
        this.B1 = false;
        this.C1 = false;
        y80 y80Var = new y80(this, e2Var, this.f29685c, j3);
        this.P1 = y80Var;
        y80Var.B = false;
        this.f29711q0 = 75;
        this.f34212w1.K.setHint(hd.M0(2131745758, null));
        g gVar = y80Var.f61446f;
        this.f34206q1 = gVar;
        this.f34205p1 = gVar;
        this.f34204o1.setAdapter(gVar);
        this.f34204o1.r1();
        c1 c1Var = this.f34204o1;
        y80Var.f61455p = c1Var;
        c1Var.setOnItemClickListener(new b6(y80Var, 24));
        t0 onScrollListener = c1Var.getOnScrollListener();
        if (onScrollListener == null) {
            c1Var.setOnScrollListener(y80Var.D);
        } else {
            c1Var.setOnScrollListener(new w3(11, y80Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.f34204o1.getParent()).indexOfChild(this.f34204o1);
        pz b10 = y80Var.b();
        this.Q1 = b10;
        this.f29682b.addView(b10, indexOfChild, ja.c(-1.0f, -1));
        cv0 a10 = y80Var.a();
        this.R1 = a10;
        this.f29682b.addView(a10, indexOfChild, ja.c(-1.0f, -1));
        cv0 c10 = y80Var.c();
        this.S1 = c10;
        this.f29682b.addView(c10, indexOfChild, ja.c(-1.0f, -1));
        y80Var.e();
    }

    @Override
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        e2 e2Var;
        long j3;
        int action = motionEvent.getAction();
        y80 y80Var = this.P1;
        if (action == 0) {
            this.T1 = this.f34214y1;
            y80Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f34214y1 - this.T1) < this.O1 && !this.U1) {
            Activity W = g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                e2Var = (e2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                e2Var = null;
            }
            if (e2Var instanceof an) {
                boolean sa2 = ((an) e2Var).sa();
                this.U1 = true;
                vs vsVar = new vs(24, this, iVar);
                if (sa2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                g0.i3(vsVar, j3);
            } else {
                this.U1 = true;
                A0(true);
                iVar.requestFocus();
                g0.h3(new ht(iVar, 5));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        y80Var.i(true);
    }

    @Override
    public final void L0(String str) {
        this.P1.j(str);
    }

    @Override
    public final void N0(int i7) {
        super.N0(i7);
        this.Q1.setTranslationY(this.n1.getMeasuredHeight() + i7);
        float f10 = i7;
        this.R1.setTranslationY(f10);
        this.S1.setTranslationY(f10);
    }

    @Override
    public final void Q0() {
        int i7;
        c1 c1Var = this.f34204o1;
        if (c1Var.getChildCount() <= 0) {
            if (c1Var.getVisibility() == 0) {
                i7 = c1Var.getPaddingTop() - g0.L(8.0f);
            } else {
                i7 = 0;
            }
            if (this.f34214y1 != i7) {
                this.f34214y1 = i7;
                N0(i7);
                return;
            }
            return;
        }
        super.Q0();
    }

    @Override
    public final void dismiss() {
        d dVar = this.W1;
        b bVar = dVar.f61416i;
        if (bVar != null && !bVar.P1.f61443b) {
            dVar.f61416i = null;
        }
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        k kVar = this.P1.f61458s;
        if (kVar != null) {
            kVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = j6.w0(j6.f28792a7, this.J0);
        if (w02 != this.V1) {
            this.V1 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        y80 y80Var = this.P1;
        if (y80Var.f61443b && this.f34214y1 == 0) {
            this.f34214y1 = g0.L(8.0f);
        }
        super.show();
        y80Var.f61443b = false;
    }
}
