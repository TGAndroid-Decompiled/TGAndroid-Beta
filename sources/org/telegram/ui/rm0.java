package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class rm0 extends mq0 {
    public final xm0 f49515a;

    public rm0(xm0 xm0Var) {
        this.f49515a = xm0Var;
    }

    @Override
    public final vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        xm0 xm0Var = this.f49515a;
        org.telegram.ui.Cells.q5 a02 = xm0.a0(xm0Var, i7);
        if (a02 != null) {
            org.telegram.ui.Components.l9 imageView = a02.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            vq0 vq0Var = new vq0();
            vq0Var.f50791b = iArr[0];
            vq0Var.f50792c = iArr[1];
            vq0Var.d = xm0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            vq0Var.f50790a = imageReceiver;
            vq0Var.f50793e = imageReceiver.p();
            vq0Var.f50798k = a02.getScale();
            a02.g(false);
            return vq0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        xm0 xm0Var = this.f49515a;
        int childCount = xm0Var.K.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = xm0Var.K.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f49515a.f51897b.size();
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        if (obj instanceof org.telegram.messenger.gf) {
            obj2 = Integer.valueOf(((org.telegram.messenger.gf) obj).C);
        } else if (obj instanceof org.telegram.messenger.kf) {
            obj2 = ((org.telegram.messenger.kf) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        xm0 xm0Var = this.f49515a;
        if (!xm0Var.f51897b.containsKey(obj2)) {
            return -1;
        }
        xm0Var.f51897b.remove(obj2);
        int indexOf = xm0Var.f51899c.indexOf(obj2);
        if (indexOf >= 0) {
            xm0Var.f51899c.remove(indexOf);
        }
        if (xm0Var.f51902e) {
            xm0Var.m0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i7) {
        xm0 xm0Var = this.f49515a;
        org.telegram.messenger.we weVar = xm0Var.J;
        org.telegram.ui.Cells.q5 a02 = xm0.a0(xm0Var, i7);
        if (a02 != null) {
            if (weVar != null) {
                org.telegram.ui.Components.l9 imageView = a02.getImageView();
                imageView.r();
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.f26289e.get(i7);
                String str = gfVar.f26825c;
                int i10 = gfVar.C;
                String str2 = gfVar.I;
                if (str != null) {
                    imageView.h(str, null, org.telegram.ui.ActionBar.k6.R4);
                    return;
                } else if (str2 != null) {
                    imageView.s(gfVar.J, gfVar.K, true);
                    if (gfVar.f26824b && !gfVar.d()) {
                        imageView.h("vthumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
                        return;
                    }
                    imageView.h("thumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                    return;
                }
            }
            a02.e((org.telegram.messenger.kf) xm0Var.f51904f.get(i7));
        }
    }

    @Override
    public final void a0(int i7) {
        xm0 xm0Var = this.f49515a;
        int childCount = xm0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = xm0Var.K.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.we weVar = xm0Var.J;
                if (weVar == null ? !(intValue < 0 || intValue >= xm0Var.f51904f.size()) : !(intValue < 0 || intValue >= weVar.f26289e.size())) {
                    if (intValue == i7) {
                        q5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f49515a.f51899c;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Cells.q5 a02 = xm0.a0(this.f49515a, i7);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        int d02;
        boolean z9;
        xm0 xm0Var = this.f49515a;
        org.telegram.messenger.we weVar = xm0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (weVar != null) {
            if (i7 < 0 || i7 >= weVar.f26289e.size()) {
                return -1;
            }
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) xm0Var.J.f26289e.get(i7);
            d02 = xm0Var.d0(-1, gfVar);
            if (d02 == -1) {
                gfVar.f26839s = j20Var;
                d02 = xm0Var.f51899c.indexOf(Integer.valueOf(gfVar.C));
                z9 = true;
            } else {
                gfVar.f26839s = null;
                z9 = false;
            }
        } else if (i7 < 0 || i7 >= xm0Var.f51904f.size()) {
            return -1;
        } else {
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) xm0Var.f51904f.get(i7);
            d02 = xm0Var.d0(-1, kfVar);
            if (d02 == -1) {
                kfVar.f26839s = j20Var;
                d02 = xm0Var.f51899c.indexOf(kfVar.B);
                z9 = true;
            } else {
                kfVar.f26839s = null;
                z9 = false;
            }
        }
        int childCount = xm0Var.K.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = xm0Var.K.getChildAt(i12);
            if (((Integer) childAt.getTag()).intValue() == i7) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (xm0Var.f51902e) {
                    i10 = d02;
                }
                q5Var.b(i10, z9, false);
            } else {
                i12++;
            }
        }
        if (!z9) {
            i11 = 2;
        }
        xm0Var.n0(i11);
        xm0Var.f51920s0.A();
        return d02;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        xm0 xm0Var = this.f49515a;
        ArrayList arrayList = xm0Var.f51904f;
        org.telegram.messenger.we weVar = xm0Var.J;
        if (xm0Var.f51897b.isEmpty()) {
            if (weVar != null) {
                if (i7 >= 0 && i7 < weVar.f26289e.size()) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.f26289e.get(i7);
                    gfVar.f26839s = j20Var;
                    xm0Var.d0(-1, gfVar);
                } else {
                    return;
                }
            } else if (i7 >= 0 && i7 < arrayList.size()) {
                org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) arrayList.get(i7);
                kfVar.f26839s = j20Var;
                xm0Var.d0(-1, kfVar);
            } else {
                return;
            }
        }
        xm0Var.j0(i10, z9);
    }

    @Override
    public final boolean u() {
        xm0 xm0Var = this.f49515a;
        xm0Var.f51920s0.v0(0, true, true);
        xm0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f49515a.f51897b;
    }

    @Override
    public final boolean x(int i7) {
        xm0 xm0Var = this.f49515a;
        org.telegram.messenger.we weVar = xm0Var.J;
        if (weVar != null) {
            if (i7 < 0 || i7 >= weVar.f26289e.size() || !xm0Var.f51897b.containsKey(Integer.valueOf(((org.telegram.messenger.gf) xm0Var.J.f26289e.get(i7)).C))) {
                return false;
            }
            return true;
        } else if (i7 < 0 || i7 >= xm0Var.f51904f.size() || !xm0Var.f51897b.containsKey(((org.telegram.messenger.kf) xm0Var.f51904f.get(i7)).B)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f49515a.E;
    }
}
