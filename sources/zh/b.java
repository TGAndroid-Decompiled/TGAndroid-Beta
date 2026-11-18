package zh;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import bi.e6;
import bi.i8;
import c8.ma;
import di.b1;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.wz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import v4.u0;
public final class b extends o51 {
    public final int O1;
    public final j90 P1;
    public final wz Q1;
    public final kv0 R1;
    public final kv0 S1;
    public float T1;
    public boolean U1;
    public int V1;
    public final d W1;

    public b(d dVar, h2 h2Var, long j3) {
        super(h2Var.getCurrentAccount(), h2Var.getParentActivity(), h2Var.getResourceProvider());
        this.W1 = dVar;
        this.O1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i7 = n6.f29339a7;
        v0(n6.w0(i7, this.J0));
        this.G1 = i7;
        this.F1 = i7;
        N0(0.0f);
        Q(i7);
        this.B1 = false;
        this.C1 = false;
        j90 j90Var = new j90(this, h2Var, this.f30195c, j3);
        this.P1 = j90Var;
        j90Var.B = false;
        this.f30221q0 = 75;
        this.f37992w1.K.setHint(gd.M0(2131745563, null));
        g gVar = j90Var.f62012f;
        this.f37986q1 = gVar;
        this.f37985p1 = gVar;
        this.f37984o1.setAdapter(gVar);
        this.f37984o1.r1();
        b1 b1Var = this.f37984o1;
        j90Var.f62021p = b1Var;
        b1Var.setOnItemClickListener(new i8(j90Var, 24));
        u0 onScrollListener = b1Var.getOnScrollListener();
        if (onScrollListener == null) {
            b1Var.setOnScrollListener(j90Var.D);
        } else {
            b1Var.setOnScrollListener(new e6(11, j90Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.f37984o1.getParent()).indexOfChild(this.f37984o1);
        wz b10 = j90Var.b();
        this.Q1 = b10;
        this.f30192b.addView(b10, indexOfChild, ma.c(-1.0f, -1));
        kv0 a10 = j90Var.a();
        this.R1 = a10;
        this.f30192b.addView(a10, indexOfChild, ma.c(-1.0f, -1));
        kv0 c10 = j90Var.c();
        this.S1 = c10;
        this.f30192b.addView(c10, indexOfChild, ma.c(-1.0f, -1));
        j90Var.e();
    }

    @Override
    public final void K0(MotionEvent motionEvent, ah.i iVar) {
        h2 h2Var;
        long j3;
        int action = motionEvent.getAction();
        j90 j90Var = this.P1;
        if (action == 0) {
            this.T1 = this.f37994y1;
            j90Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f37994y1 - this.T1) < this.O1 && !this.U1) {
            Activity W = g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                h2Var = (h2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                h2Var = null;
            }
            if (h2Var instanceof bn) {
                boolean sa2 = ((bn) h2Var).sa();
                this.U1 = true;
                dw dwVar = new dw(20, this, iVar);
                if (sa2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                g0.h3(dwVar, j3);
            } else {
                this.U1 = true;
                A0(true);
                iVar.requestFocus();
                g0.g3(new org.telegram.ui.Components.i(iVar, 6));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        j90Var.i(true);
    }

    @Override
    public final void M0(String str) {
        this.P1.j(str);
    }

    @Override
    public final void O0(int i7) {
        super.O0(i7);
        this.Q1.setTranslationY(this.n1.getMeasuredHeight() + i7);
        float f10 = i7;
        this.R1.setTranslationY(f10);
        this.S1.setTranslationY(f10);
    }

    @Override
    public final void R0() {
        int i7;
        b1 b1Var = this.f37984o1;
        if (b1Var.getChildCount() <= 0) {
            if (b1Var.getVisibility() == 0) {
                i7 = b1Var.getPaddingTop() - g0.L(8.0f);
            } else {
                i7 = 0;
            }
            if (this.f37994y1 != i7) {
                this.f37994y1 = i7;
                O0(i7);
                return;
            }
            return;
        }
        super.R0();
    }

    @Override
    public final void dismiss() {
        d dVar = this.W1;
        b bVar = dVar.f61982i;
        if (bVar != null && !bVar.P1.f62009b) {
            dVar.f61982i = null;
        }
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        k kVar = this.P1.f62024s;
        if (kVar != null) {
            kVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = n6.w0(n6.f29339a7, this.J0);
        if (w02 != this.V1) {
            this.V1 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        j90 j90Var = this.P1;
        if (j90Var.f62009b && this.f37994y1 == 0) {
            this.f37994y1 = g0.L(8.0f);
        }
        super.show();
        j90Var.f62009b = false;
    }
}
