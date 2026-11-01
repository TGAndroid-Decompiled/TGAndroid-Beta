package th;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.ew;
public abstract class a6 extends z4.g {
    public ArrayList A0;
    public v2 B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public Runnable G0;
    public final x2 H0;
    public int I0;
    public int J0;
    public float K0;
    public boolean L0;
    public final ew M0;
    public final o7 N0;
    public int O0;
    public final ArrayList P0;
    public float Q0;
    public long f48798w0;
    public ArrayList f48799x0;
    public int f48800y0;
    public final y5 f48801z0;

    public a6(int i10, Context context, o7 o7Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        boolean z10;
        this.A0 = new ArrayList();
        this.D0 = true;
        q qVar = (q) this;
        this.M0 = new ew(qVar, 28);
        this.O0 = -1;
        this.P0 = new ArrayList();
        this.f48800y0 = i10;
        this.H0 = new x2(context);
        this.N0 = o7Var;
        y5 y5Var = new y5(qVar, context, o7Var, p6Var);
        this.f48801z0 = y5Var;
        setAdapter(y5Var);
        rh.d0 d0Var = new rh.d0(qVar, 16);
        if (this.m0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.m0 = d0Var;
        setChildrenDrawingOrderEnabled(true);
        this.f54630o0 = 1;
        this.f54629n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new kg.f1(qVar, o7Var, 1));
        setOverScrollMode(2);
    }

    public static boolean C(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) != arrayList2.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void A() {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < getChildCount()) {
                z5 z5Var = (z5) getChildAt(i10);
                if (z5Var.d && !z5Var.f49800a.f49790x1.d()) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        this.N0.x(z10);
    }

    public final void B() {
        if (this.O0 >= 0) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.O0) {
                    z5 z5Var = (z5) getChildAt(i10);
                    if (!z5Var.d) {
                        this.O0 = -1;
                        z5Var.a(true);
                        if (this.f48799x0 != null) {
                            z2 z2Var = z5Var.f49800a;
                            long j10 = z5Var.f49801b;
                            ArrayList arrayList = z5Var.f49802c;
                            z2Var.f49740k1 = j10;
                            z2Var.f49732i1 = arrayList;
                            z2Var.m0(0);
                        } else {
                            z5Var.f49800a.S0(0, z5Var.f49801b);
                        }
                    }
                }
            }
        }
    }

    public final void D(int r7, long r8, java.util.ArrayList r10) {
        throw new UnsupportedOperationException("Method not decompiled: th.a6.D(int, long, java.util.ArrayList):void");
    }

    public final boolean E(boolean z10) {
        o7 o7Var = this.N0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.f48799x0;
            if (arrayList == null) {
                arrayList = this.A0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (o7Var.f49304a && Build.VERSION.SDK_INT < 33) {
                    z11 = true;
                }
                x(currentItem2, !z11);
                return true;
            }
        }
        if (z10 || getCurrentItem() <= 0) {
            return false;
        }
        int currentItem3 = getCurrentItem() - 1;
        if (o7Var.f49304a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        boolean z10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            z2 z2Var = (z2) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && !z2Var.D3) {
                z10 = true;
            } else {
                z10 = false;
            }
            z2Var.setActive(z10);
        }
    }

    public long getCurrentDialogId() {
        if (this.f48799x0 != null) {
            return this.f48798w0;
        }
        if (getCurrentItem() < this.A0.size()) {
            return ((Long) this.A0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public z2 getCurrentPeerView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem()) {
                return (z2) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            }
        }
        return null;
    }

    public ArrayList<Long> getDialogIds() {
        return this.A0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.D0 && !this.L0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.C0) {
            this.C0 = false;
            z2 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                v2 v2Var = this.B0;
                f7 f7Var = (f7) v2Var;
                f7Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
            }
        }
        B();
        F();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.D0 && !this.L0) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.L0) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void setDelegate(v2 v2Var) {
        this.B0 = v2Var;
    }

    public void setHorizontalProgressToDismiss(float f7) {
        if (Math.abs(f7) <= 1.0f && this.Q0 != f7) {
            this.Q0 = f7;
            setCameraDistance(getWidth() * 15);
            float f10 = 0.0f;
            if (f7 < 0.0f) {
                f10 = getWidth();
            }
            setPivotX(f10);
            setPivotY(getHeight() * 0.5f);
            setRotationY(f7 * 90.0f);
        }
    }

    public void setKeyboardHeight(int i10) {
        if (this.E0 != i10) {
            this.E0 = i10;
            z2 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((z2) ((FrameLayout) getChildAt(i10)).getChildAt(0)).setPaused(z10);
        }
    }
}
