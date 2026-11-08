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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.w80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import v4.s0;
public final class b extends b51 {
    public final int K1;
    public final w80 L1;
    public final mz M1;
    public final av0 N1;
    public final av0 O1;
    public float P1;
    public boolean Q1;
    public int R1;
    public final d S1;

    public b(d dVar, f2 f2Var, long j3) {
        super(f2Var.getCurrentAccount(), f2Var.getParentActivity(), f2Var.getResourceProvider());
        this.S1 = dVar;
        this.K1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i7 = k6.f27796a7;
        v0(k6.w0(i7, this.I0));
        this.C1 = i7;
        this.B1 = i7;
        M0(0.0f);
        P(i7);
        this.f32054x1 = false;
        this.f32055y1 = false;
        w80 w80Var = new w80(this, f2Var, this.f28622c, j3);
        this.L1 = w80Var;
        w80Var.B = false;
        this.f28643p0 = 75;
        this.f32049s1.J.setHint(id.M0(2131745761, null));
        h hVar = w80Var.f59547f;
        this.f32044m1 = hVar;
        this.l1 = hVar;
        this.f32043k1.setAdapter(hVar);
        this.f32043k1.r1();
        q1 q1Var = this.f32043k1;
        w80Var.f59556p = q1Var;
        q1Var.setOnItemClickListener(new ai.k(w80Var, 23));
        s0 onScrollListener = q1Var.getOnScrollListener();
        if (onScrollListener == null) {
            q1Var.setOnScrollListener(w80Var.D);
        } else {
            q1Var.setOnScrollListener(new o0(10, w80Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.f32043k1.getParent()).indexOfChild(this.f32043k1);
        mz b10 = w80Var.b();
        this.M1 = b10;
        this.f28619b.addView(b10, indexOfChild, ha.c(-1.0f, -1));
        av0 a10 = w80Var.a();
        this.N1 = a10;
        this.f28619b.addView(a10, indexOfChild, ha.c(-1.0f, -1));
        av0 c10 = w80Var.c();
        this.O1 = c10;
        this.f28619b.addView(c10, indexOfChild, ha.c(-1.0f, -1));
        w80Var.e();
    }

    @Override
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        f2 f2Var;
        long j3;
        int action = motionEvent.getAction();
        w80 w80Var = this.L1;
        if (action == 0) {
            this.P1 = this.f32051u1;
            w80Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f32051u1 - this.P1) < this.K1 && !this.Q1) {
            Activity W = g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                f2Var = (f2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                f2Var = null;
            }
            if (f2Var instanceof an) {
                boolean pa2 = ((an) f2Var).pa();
                this.Q1 = true;
                v80 v80Var = new v80(0, this, iVar);
                if (pa2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                g0.i3(v80Var, j3);
            } else {
                this.Q1 = true;
                A0(true);
                iVar.requestFocus();
                g0.h3(new bt(iVar, 5));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        w80Var.i(true);
    }

    @Override
    public final void L0(String str) {
        this.L1.j(str);
    }

    @Override
    public final void N0(int i7) {
        super.N0(i7);
        this.M1.setTranslationY(this.f32042j1.getMeasuredHeight() + i7);
        float f10 = i7;
        this.N1.setTranslationY(f10);
        this.O1.setTranslationY(f10);
    }

    @Override
    public final void Q0() {
        int i7;
        q1 q1Var = this.f32043k1;
        if (q1Var.getChildCount() <= 0) {
            if (q1Var.getVisibility() == 0) {
                i7 = q1Var.getPaddingTop() - g0.L(8.0f);
            } else {
                i7 = 0;
            }
            if (this.f32051u1 != i7) {
                this.f32051u1 = i7;
                N0(i7);
                return;
            }
            return;
        }
        super.Q0();
    }

    @Override
    public final void dismiss() {
        d dVar = this.S1;
        b bVar = dVar.f59515i;
        if (bVar != null && !bVar.L1.f59544b) {
            dVar.f59515i = null;
        }
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        l lVar = this.L1.f59559s;
        if (lVar != null) {
            lVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = k6.w0(k6.f27796a7, this.I0);
        if (w02 != this.R1) {
            this.R1 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        w80 w80Var = this.L1;
        if (w80Var.f59544b && this.f32051u1 == 0) {
            this.f32051u1 = g0.L(8.0f);
        }
        super.show();
        w80Var.f59544b = false;
    }
}
