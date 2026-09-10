package zh;

import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
public abstract class f6 extends z4.g {
    public ArrayList A0;
    public w2 B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public int F0;
    public Runnable G0;
    public y2 H0;
    public int I0;
    public int J0;
    public float K0;
    public boolean L0;
    public sg.a1 M0;
    public u7 N0;
    public int O0;
    public float P0;
    public long f48417w0;
    public ArrayList f48418x0;
    public int f48419y0;
    public c6 f48420z0;

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
                e6 e6Var = (e6) getChildAt(i10);
                if (e6Var.d && !e6Var.f48384a.O1.d()) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        this.N0.l(z10);
    }

    public final void B() {
        if (this.O0 >= 0) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && getCurrentItem() == this.O0) {
                    e6 e6Var = (e6) getChildAt(i10);
                    if (!e6Var.d) {
                        this.O0 = -1;
                        e6Var.a(true);
                        if (this.f48418x0 != null) {
                            a3 a3Var = e6Var.f48384a;
                            long j3 = e6Var.f48385b;
                            ArrayList arrayList = e6Var.f48386c;
                            a3Var.B1 = j3;
                            a3Var.f48232z1 = arrayList;
                            a3Var.o0(0);
                        } else {
                            e6Var.f48384a.U0(0, e6Var.f48385b);
                        }
                    }
                }
            }
        }
    }

    public final void D(int r9, long r10, java.util.ArrayList r12) {
        throw new UnsupportedOperationException("Method not decompiled: zh.f6.D(int, long, java.util.ArrayList):void");
    }

    public final boolean E(boolean z10) {
        u7 u7Var = this.N0;
        boolean z11 = false;
        if (z10) {
            int currentItem = getCurrentItem();
            ArrayList arrayList = this.f48418x0;
            if (arrayList == null) {
                arrayList = this.A0;
            }
            if (currentItem < arrayList.size() - 1) {
                int currentItem2 = getCurrentItem() + 1;
                if (u7Var.f48918a && Build.VERSION.SDK_INT < 33) {
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
        if (u7Var.f48918a && Build.VERSION.SDK_INT < 33) {
            z11 = true;
        }
        x(currentItem3, !z11);
        return true;
    }

    public final void F() {
        boolean z10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            a3 a3Var = (a3) ((FrameLayout) getChildAt(i10)).getChildAt(0);
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem() && !a3Var.U3) {
                z10 = true;
            } else {
                z10 = false;
            }
            a3Var.setActive(z10);
        }
    }

    public long getCurrentDialogId() {
        if (this.f48418x0 != null) {
            return this.f48417w0;
        }
        if (getCurrentItem() < this.A0.size()) {
            return ((Long) this.A0.get(getCurrentItem())).longValue();
        }
        return 0L;
    }

    public a3 getCurrentPeerView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (((Integer) getChildAt(i10).getTag()).intValue() == getCurrentItem()) {
                return (a3) ((FrameLayout) getChildAt(i10)).getChildAt(0);
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
                FileLog.e(e);
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.C0) {
            this.C0 = false;
            a3 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                w2 w2Var = this.B0;
                l7 l7Var = (l7) w2Var;
                l7Var.a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
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

    public void setDelegate(w2 w2Var) {
        this.B0 = w2Var;
    }

    public void setHorizontalProgressToDismiss(float f7) {
        if (Math.abs(f7) <= 1.0f && this.P0 != f7) {
            this.P0 = f7;
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
            a3 currentPeerView = getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.requestLayout();
            }
        }
    }

    public void setPaused(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((a3) ((FrameLayout) getChildAt(i10)).getChildAt(0)).setPaused(z10);
        }
    }
}
