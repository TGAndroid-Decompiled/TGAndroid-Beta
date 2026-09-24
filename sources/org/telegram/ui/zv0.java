package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class zv0 extends org.telegram.ui.Components.n81 {
    public final int f40571a;
    public final Object f40572b;
    public final Object f40573c;

    public zv0(Object obj, Context context, int i10) {
        this.f40571a = i10;
        this.f40573c = obj;
        this.f40572b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        org.telegram.ui.ActionBar.m2 m2Var;
        t5 t5Var;
        int i12 = this.f40571a;
        Object obj = this.f40573c;
        switch (i12) {
            case 0:
                return;
            case 1:
                ((s31) view).a(i11);
                return;
            case 2:
                return;
            case 3:
                th1 th1Var = (th1) obj;
                SparseArray sparseArray = th1Var.f38107a;
                rh1 rh1Var = (rh1) sparseArray.get(i10);
                if (rh1Var != null) {
                    m2Var = rh1Var.f37325a;
                } else {
                    org.telegram.ui.ActionBar.m2 V = th1Var.V(i10);
                    rh1 rh1Var2 = new rh1(V);
                    sparseArray.put(i10, rh1Var2);
                    m2Var = V;
                    rh1Var = rh1Var2;
                }
                if (!rh1Var.f37326b) {
                    m2Var.onFragmentCreate();
                    rh1Var.f37326b = true;
                }
                m2Var.setParentLayout(th1Var.getParentLayout());
                if (m2Var.getFragmentView() == null) {
                    m2Var.performCreateView((Context) this.f40572b);
                    m2Var.setTitleOverlayText(th1Var.f38111n, th1Var.f38112r, th1Var.f38113s);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                frameLayout.removeAllViews();
                View fragmentView = m2Var.getFragmentView();
                AndroidUtilities.removeFromParent(fragmentView);
                if (!m2Var.hasOwnBackground() && fragmentView.getBackground() == null) {
                    fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                }
                frameLayout.addView(fragmentView, w7.y5.c(-1.0f, -1));
                if (m2Var.getActionBar() != null && m2Var.getActionBar().K) {
                    AndroidUtilities.removeFromParent(m2Var.getActionBar());
                    frameLayout.addView(m2Var.getActionBar());
                }
                WeakHashMap weakHashMap = r0.i0.f42114a;
                r0.y.c(frameLayout);
                th1Var.checkSystemBarColors();
                th1Var.U();
                return;
            case 4:
                return;
            default:
                yh.x3 x3Var = (yh.x3) obj;
                if (i11 == 0) {
                    yh.x3.j1(x3Var, false);
                    xh.n2 n2Var = x3Var.f48219b0;
                    if (n2Var != null) {
                        t5Var = n2Var.Y;
                    } else {
                        return;
                    }
                } else if (i11 == 2) {
                    yh.x3.j1(x3Var, true);
                    xh.n2 n2Var2 = x3Var.f48221c0;
                    if (n2Var2 != null) {
                        t5Var = n2Var2.Y;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                FrameLayout frameLayout2 = (FrameLayout) view;
                frameLayout2.removeAllViews();
                AndroidUtilities.removeFromParent(t5Var);
                frameLayout2.addView(t5Var);
                return;
        }
    }

    @Override
    public final View d(int i10) {
        t5 t5Var;
        switch (this.f40571a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) this.f40572b);
                frameLayout.setOnClickListener(new f60(this, 23));
                return frameLayout;
            case 1:
                return new s31((t31) this.f40573c, (Context) this.f40572b);
            case 2:
                FrameLayout frameLayout2 = new FrameLayout((Context) this.f40572b);
                frameLayout2.setOnClickListener(new y31(this, 7));
                return frameLayout2;
            case 3:
                return new m51((Context) this.f40572b, 7);
            case 4:
                if (i10 == 0) {
                    return ((tg.a0) this.f40572b).getContainerView();
                }
                return ((tg.z0) this.f40573c).getContainerView();
            default:
                yh.x3 x3Var = (yh.x3) this.f40573c;
                if (i10 == 0) {
                    yh.x3.j1(x3Var, false);
                    xh.n2 n2Var = x3Var.f48219b0;
                    if (n2Var != null) {
                        t5Var = n2Var.Y;
                        AndroidUtilities.removeFromParent(t5Var);
                        FrameLayout frameLayout3 = new FrameLayout((Context) this.f40572b);
                        frameLayout3.addView(t5Var, w7.y5.e(-1, -1, 119));
                        return frameLayout3;
                    }
                    return null;
                }
                if (i10 == 1) {
                    t5Var = x3Var.Y;
                } else {
                    if (i10 == 2) {
                        yh.x3.j1(x3Var, true);
                        xh.n2 n2Var2 = x3Var.f48221c0;
                        if (n2Var2 != null) {
                            t5Var = n2Var2.Y;
                        }
                    }
                    return null;
                }
                AndroidUtilities.removeFromParent(t5Var);
                FrameLayout frameLayout32 = new FrameLayout((Context) this.f40572b);
                frameLayout32.addView(t5Var, w7.y5.e(-1, -1, 119));
                return frameLayout32;
        }
    }

    @Override
    public final int e() {
        switch (this.f40571a) {
            case 0:
                return 2;
            case 1:
                return 5;
            case 2:
                return 2;
            case 3:
                ((th1) this.f40573c).getClass();
                return 4;
            case 4:
                return 2;
            default:
                yh.x3 x3Var = (yh.x3) this.f40573c;
                return (x3Var.L1(true) ? 1 : 0) + (x3Var.L1(false) ? 1 : 0) + 1;
        }
    }

    @Override
    public int h(int i10) {
        switch (this.f40571a) {
            case 1:
                if (i10 == 0) {
                    return 0;
                }
                return 1;
            case 2:
            case 3:
            default:
                return super.h(i10);
            case 4:
                return i10;
            case 5:
                return (i10 - (((yh.x3) this.f40573c).L1(false) ? 1 : 0)) + 1;
        }
    }

    public zv0(tg.a0 a0Var, tg.z0 z0Var) {
        this.f40571a = 4;
        this.f40572b = a0Var;
        this.f40573c = z0Var;
    }

    private final void i(View view, int i10, int i11) {
    }

    private final void j(View view, int i10, int i11) {
    }

    private final void k(View view, int i10, int i11) {
    }
}
