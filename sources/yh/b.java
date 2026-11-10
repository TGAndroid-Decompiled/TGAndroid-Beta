package yh;

import ai.o0;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import bi.q1;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.w80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import v4.s0;
public final class b extends c51 {
    public final int N1;
    public final w80 O1;
    public final lz P1;
    public final bv0 Q1;
    public final bv0 R1;
    public float S1;
    public boolean T1;
    public int U1;
    public final d V1;

    public b(d dVar, f2 f2Var, long j3) {
        super(f2Var.getCurrentAccount(), f2Var.getParentActivity(), f2Var.getResourceProvider());
        this.V1 = dVar;
        this.N1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i7 = m6.f27834a7;
        v0(m6.w0(i7, this.I0));
        this.F1 = i7;
        this.E1 = i7;
        M0(0.0f);
        P(i7);
        this.A1 = false;
        this.B1 = false;
        w80 w80Var = new w80(this, f2Var, this.f28675c, j3);
        this.O1 = w80Var;
        w80Var.B = false;
        this.f28699p0 = 75;
        this.f32471v1.J.setHint(id.M0(2131745758, null));
        h hVar = w80Var.f59554f;
        this.f32465p1 = hVar;
        this.f32464o1 = hVar;
        this.n1.setAdapter(hVar);
        this.n1.r1();
        q1 q1Var = this.n1;
        w80Var.f59563p = q1Var;
        q1Var.setOnItemClickListener(new ai.k(w80Var, 23));
        s0 onScrollListener = q1Var.getOnScrollListener();
        if (onScrollListener == null) {
            q1Var.setOnScrollListener(w80Var.D);
        } else {
            q1Var.setOnScrollListener(new o0(10, w80Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.n1.getParent()).indexOfChild(this.n1);
        lz b10 = w80Var.b();
        this.P1 = b10;
        this.f28672b.addView(b10, indexOfChild, ha.c(-1.0f, -1));
        bv0 a10 = w80Var.a();
        this.Q1 = a10;
        this.f28672b.addView(a10, indexOfChild, ha.c(-1.0f, -1));
        bv0 c10 = w80Var.c();
        this.R1 = c10;
        this.f28672b.addView(c10, indexOfChild, ha.c(-1.0f, -1));
        w80Var.e();
    }

    @Override
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        f2 f2Var;
        long j3;
        int action = motionEvent.getAction();
        w80 w80Var = this.O1;
        if (action == 0) {
            this.S1 = this.f32473x1;
            w80Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f32473x1 - this.S1) < this.N1 && !this.T1) {
            Activity W = g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                f2Var = (f2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                f2Var = null;
            }
            if (f2Var instanceof cn) {
                boolean ra2 = ((cn) f2Var).ra();
                this.T1 = true;
                r80 r80Var = new r80(1, this, iVar);
                if (ra2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                g0.i3(r80Var, j3);
            } else {
                this.T1 = true;
                A0(true);
                iVar.requestFocus();
                g0.h3(new at(iVar, 5));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        w80Var.i(true);
    }

    @Override
    public final void L0(String str) {
        this.O1.j(str);
    }

    @Override
    public final void N0(int i7) {
        super.N0(i7);
        this.P1.setTranslationY(this.f32463m1.getMeasuredHeight() + i7);
        float f10 = i7;
        this.Q1.setTranslationY(f10);
        this.R1.setTranslationY(f10);
    }

    @Override
    public final void Q0() {
        int i7;
        q1 q1Var = this.n1;
        if (q1Var.getChildCount() <= 0) {
            if (q1Var.getVisibility() == 0) {
                i7 = q1Var.getPaddingTop() - g0.L(8.0f);
            } else {
                i7 = 0;
            }
            if (this.f32473x1 != i7) {
                this.f32473x1 = i7;
                N0(i7);
                return;
            }
            return;
        }
        super.Q0();
    }

    @Override
    public final void dismiss() {
        d dVar = this.V1;
        b bVar = dVar.f59522i;
        if (bVar != null && !bVar.O1.f59551b) {
            dVar.f59522i = null;
        }
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        l lVar = this.O1.f59566s;
        if (lVar != null) {
            lVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = m6.w0(m6.f27834a7, this.I0);
        if (w02 != this.U1) {
            this.U1 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        w80 w80Var = this.O1;
        if (w80Var.f59551b && this.f32473x1 == 0) {
            this.f32473x1 = g0.L(8.0f);
        }
        super.show();
        w80Var.f59551b = false;
    }
}
