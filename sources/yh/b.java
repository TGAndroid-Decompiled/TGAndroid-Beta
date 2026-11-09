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
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.x80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import v4.s0;
public final class b extends c51 {
    public final int K1;
    public final x80 L1;
    public final mz M1;
    public final cv0 N1;
    public final cv0 O1;
    public float P1;
    public boolean Q1;
    public int R1;
    public final d S1;

    public b(d dVar, f2 f2Var, long j3) {
        super(f2Var.getCurrentAccount(), f2Var.getParentActivity(), f2Var.getResourceProvider());
        this.S1 = dVar;
        this.K1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i7 = l6.f27809a7;
        v0(l6.w0(i7, this.I0));
        this.C1 = i7;
        this.B1 = i7;
        M0(0.0f);
        P(i7);
        this.f32541x1 = false;
        this.f32542y1 = false;
        x80 x80Var = new x80(this, f2Var, this.f28627c, j3);
        this.L1 = x80Var;
        x80Var.B = false;
        this.f28648p0 = 75;
        this.f32536s1.J.setHint(id.M0(2131745758, null));
        h hVar = x80Var.f59556f;
        this.f32531m1 = hVar;
        this.l1 = hVar;
        this.f32530k1.setAdapter(hVar);
        this.f32530k1.r1();
        q1 q1Var = this.f32530k1;
        x80Var.f59565p = q1Var;
        q1Var.setOnItemClickListener(new ai.k(x80Var, 23));
        s0 onScrollListener = q1Var.getOnScrollListener();
        if (onScrollListener == null) {
            q1Var.setOnScrollListener(x80Var.D);
        } else {
            q1Var.setOnScrollListener(new o0(10, x80Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.f32530k1.getParent()).indexOfChild(this.f32530k1);
        mz b10 = x80Var.b();
        this.M1 = b10;
        this.f28624b.addView(b10, indexOfChild, ha.c(-1.0f, -1));
        cv0 a10 = x80Var.a();
        this.N1 = a10;
        this.f28624b.addView(a10, indexOfChild, ha.c(-1.0f, -1));
        cv0 c10 = x80Var.c();
        this.O1 = c10;
        this.f28624b.addView(c10, indexOfChild, ha.c(-1.0f, -1));
        x80Var.e();
    }

    @Override
    public final void J0(MotionEvent motionEvent, ah.i iVar) {
        f2 f2Var;
        long j3;
        int action = motionEvent.getAction();
        x80 x80Var = this.L1;
        if (action == 0) {
            this.P1 = this.f32538u1;
            x80Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f32538u1 - this.P1) < this.K1 && !this.Q1) {
            Activity W = g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                f2Var = (f2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                f2Var = null;
            }
            if (f2Var instanceof cn) {
                boolean ra2 = ((cn) f2Var).ra();
                this.Q1 = true;
                w80 w80Var = new w80(0, this, iVar);
                if (ra2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                g0.i3(w80Var, j3);
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
        x80Var.i(true);
    }

    @Override
    public final void L0(String str) {
        this.L1.j(str);
    }

    @Override
    public final void N0(int i7) {
        super.N0(i7);
        this.M1.setTranslationY(this.f32529j1.getMeasuredHeight() + i7);
        float f10 = i7;
        this.N1.setTranslationY(f10);
        this.O1.setTranslationY(f10);
    }

    @Override
    public final void Q0() {
        int i7;
        q1 q1Var = this.f32530k1;
        if (q1Var.getChildCount() <= 0) {
            if (q1Var.getVisibility() == 0) {
                i7 = q1Var.getPaddingTop() - g0.L(8.0f);
            } else {
                i7 = 0;
            }
            if (this.f32538u1 != i7) {
                this.f32538u1 = i7;
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
        b bVar = dVar.f59524i;
        if (bVar != null && !bVar.L1.f59553b) {
            dVar.f59524i = null;
        }
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        l lVar = this.L1.f59568s;
        if (lVar != null) {
            lVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = l6.w0(l6.f27809a7, this.I0);
        if (w02 != this.R1) {
            this.R1 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        x80 x80Var = this.L1;
        if (x80Var.f59553b && this.f32538u1 == 0) {
            this.f32538u1 = g0.L(8.0f);
        }
        super.show();
        x80Var.f59553b = false;
    }
}
