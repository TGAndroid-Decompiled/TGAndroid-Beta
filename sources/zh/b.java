package zh;

import ai.i4;
import ai.j6;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import b8.mf;
import ci.j1;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.zs;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
import u4.t0;
public final class b extends v41 {
    public final int L1;
    public final s80 M1;
    public final iz N1;
    public final zu0 O1;
    public final zu0 P1;
    public float Q1;
    public boolean R1;
    public int S1;
    public final d T1;

    public b(d dVar, d2 d2Var, long j10) {
        super(d2Var.getCurrentAccount(), d2Var.getParentActivity(), d2Var.getResourceProvider());
        this.T1 = dVar;
        this.L1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i3 = k6.f27824a7;
        v0(k6.w0(i3, this.J0));
        this.D1 = i3;
        this.C1 = i3;
        M0(0.0f);
        P(i3);
        this.f39006y1 = false;
        this.f39007z1 = false;
        s80 s80Var = new s80(this, d2Var, this.f28589c, j10);
        this.M1 = s80Var;
        s80Var.B = false;
        this.f28612q0 = 75;
        this.f39001t1.K.setHint(bd.M0(2131745768, null));
        f fVar = s80Var.f60584f;
        this.f38995n1 = fVar;
        this.m1 = fVar;
        this.f38994l1.setAdapter(fVar);
        this.f38994l1.r1();
        j1 j1Var = this.f38994l1;
        s80Var.f60593p = j1Var;
        j1Var.setOnItemClickListener(new j6(s80Var, 24));
        t0 onScrollListener = j1Var.getOnScrollListener();
        if (onScrollListener == null) {
            j1Var.setOnScrollListener(s80Var.D);
        } else {
            j1Var.setOnScrollListener(new i4(11, s80Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.f38994l1.getParent()).indexOfChild(this.f38994l1);
        iz b10 = s80Var.b();
        this.N1 = b10;
        this.f28586b.addView(b10, indexOfChild, mf.c(-1.0f, -1));
        zu0 a10 = s80Var.a();
        this.O1 = a10;
        this.f28586b.addView(a10, indexOfChild, mf.c(-1.0f, -1));
        zu0 c2 = s80Var.c();
        this.P1 = c2;
        this.f28586b.addView(c2, indexOfChild, mf.c(-1.0f, -1));
        s80Var.e();
    }

    @Override
    public final void J0(MotionEvent motionEvent, bh.g gVar) {
        d2 d2Var;
        long j10;
        int action = motionEvent.getAction();
        s80 s80Var = this.M1;
        if (action == 0) {
            this.Q1 = this.f39003v1;
            s80Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f39003v1 - this.Q1) < this.L1 && !this.R1) {
            Activity W = g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                d2Var = (d2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                d2Var = null;
            }
            if (d2Var instanceof wm) {
                boolean pa2 = ((wm) d2Var).pa();
                this.R1 = true;
                j50 j50Var = new j50(5, this, gVar);
                if (pa2) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                g0.i3(j50Var, j10);
            } else {
                this.R1 = true;
                A0(true);
                gVar.requestFocus();
                g0.h3(new zs(gVar, 5));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        s80Var.i(true);
    }

    @Override
    public final void L0(String str) {
        this.M1.j(str);
    }

    @Override
    public final void N0(int i3) {
        super.N0(i3);
        this.N1.setTranslationY(this.k1.getMeasuredHeight() + i3);
        float f10 = i3;
        this.O1.setTranslationY(f10);
        this.P1.setTranslationY(f10);
    }

    @Override
    public final void Q0() {
        int i3;
        j1 j1Var = this.f38994l1;
        if (j1Var.getChildCount() <= 0) {
            if (j1Var.getVisibility() == 0) {
                i3 = j1Var.getPaddingTop() - g0.L(8.0f);
            } else {
                i3 = 0;
            }
            if (this.f39003v1 != i3) {
                this.f39003v1 = i3;
                N0(i3);
                return;
            }
            return;
        }
        super.Q0();
    }

    @Override
    public final void dismiss() {
        d dVar = this.T1;
        b bVar = dVar.f60555i;
        if (bVar != null && !bVar.M1.f60581b) {
            dVar.f60555i = null;
        }
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        j jVar = this.M1.f60596s;
        if (jVar != null) {
            jVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = k6.w0(k6.f27824a7, this.J0);
        if (w02 != this.S1) {
            this.S1 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        s80 s80Var = this.M1;
        if (s80Var.f60581b && this.f39003v1 == 0) {
            this.f39003v1 = g0.L(8.0f);
        }
        super.show();
        s80Var.f60581b = false;
    }
}
