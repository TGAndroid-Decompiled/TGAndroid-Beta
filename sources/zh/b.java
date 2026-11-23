package zh;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import bi.j6;
import bi.n8;
import c8.na;
import di.b1;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.vz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import v4.u0;
public final class b extends q51 {
    public final int O1;
    public final i90 P1;
    public final vz Q1;
    public final mv0 R1;
    public final mv0 S1;
    public float T1;
    public boolean U1;
    public int V1;
    public final d W1;

    public b(d dVar, g2 g2Var, long j3) {
        super(g2Var.getCurrentAccount(), g2Var.getParentActivity(), g2Var.getResourceProvider());
        this.W1 = dVar;
        this.O1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i7 = n6.f29394a7;
        v0(n6.w0(i7, this.J0));
        this.G1 = i7;
        this.F1 = i7;
        N0(0.0f);
        Q(i7);
        this.B1 = false;
        this.C1 = false;
        i90 i90Var = new i90(this, g2Var, this.f30229c, j3);
        this.P1 = i90Var;
        i90Var.B = false;
        this.f30255q0 = 75;
        this.f38706w1.K.setHint(gd.N0(2131745562, null));
        g gVar = i90Var.f62141f;
        this.f38700q1 = gVar;
        this.f38699p1 = gVar;
        this.f38698o1.setAdapter(gVar);
        this.f38698o1.r1();
        b1 b1Var = this.f38698o1;
        i90Var.f62150p = b1Var;
        b1Var.setOnItemClickListener(new n8(i90Var, 24));
        u0 onScrollListener = b1Var.getOnScrollListener();
        if (onScrollListener == null) {
            b1Var.setOnScrollListener(i90Var.D);
        } else {
            b1Var.setOnScrollListener(new j6(11, i90Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.f38698o1.getParent()).indexOfChild(this.f38698o1);
        vz b10 = i90Var.b();
        this.Q1 = b10;
        this.f30226b.addView(b10, indexOfChild, na.c(-1.0f, -1));
        mv0 a10 = i90Var.a();
        this.R1 = a10;
        this.f30226b.addView(a10, indexOfChild, na.c(-1.0f, -1));
        mv0 c10 = i90Var.c();
        this.S1 = c10;
        this.f30226b.addView(c10, indexOfChild, na.c(-1.0f, -1));
        i90Var.e();
    }

    @Override
    public final void K0(MotionEvent motionEvent, ah.i iVar) {
        g2 g2Var;
        long j3;
        int action = motionEvent.getAction();
        i90 i90Var = this.P1;
        if (action == 0) {
            this.T1 = this.f38708y1;
            i90Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f38708y1 - this.T1) < this.O1 && !this.U1) {
            Activity W = g0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                g2Var = (g2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                g2Var = null;
            }
            if (g2Var instanceof bn) {
                boolean sa2 = ((bn) g2Var).sa();
                this.U1 = true;
                bt btVar = new bt(24, this, iVar);
                if (sa2) {
                    j3 = 200;
                } else {
                    j3 = 0;
                }
                g0.h3(btVar, j3);
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
        i90Var.i(true);
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
        b1 b1Var = this.f38698o1;
        if (b1Var.getChildCount() <= 0) {
            if (b1Var.getVisibility() == 0) {
                i7 = b1Var.getPaddingTop() - g0.L(8.0f);
            } else {
                i7 = 0;
            }
            if (this.f38708y1 != i7) {
                this.f38708y1 = i7;
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
        b bVar = dVar.f62111i;
        if (bVar != null && !bVar.P1.f62138b) {
            dVar.f62111i = null;
        }
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        k kVar = this.P1.f62153s;
        if (kVar != null) {
            kVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = n6.w0(n6.f29394a7, this.J0);
        if (w02 != this.V1) {
            this.V1 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        i90 i90Var = this.P1;
        if (i90Var.f62138b && this.f38708y1 == 0) {
            this.f38708y1 = g0.L(8.0f);
        }
        super.show();
        i90Var.f62138b = false;
    }
}
