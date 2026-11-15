package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class sm0 extends mq0 {
    public final ym0 f51245a;

    public sm0(ym0 ym0Var) {
        this.f51245a = ym0Var;
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        ym0 ym0Var = this.f51245a;
        org.telegram.ui.Cells.q5 a02 = ym0.a0(ym0Var, i7);
        if (a02 != null) {
            org.telegram.ui.Components.i9 imageView = a02.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            uq0 uq0Var = new uq0();
            uq0Var.f52000b = iArr[0];
            uq0Var.f52001c = iArr[1];
            uq0Var.d = ym0Var.L;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            uq0Var.f51999a = imageReceiver;
            uq0Var.f52002e = imageReceiver.p();
            uq0Var.f52007k = a02.getScale();
            a02.g(false);
            return uq0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        ym0 ym0Var = this.f51245a;
        int childCount = ym0Var.L.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = ym0Var.L.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f51245a.f53566b.size();
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        if (obj instanceof org.telegram.messenger.ff) {
            obj2 = Integer.valueOf(((org.telegram.messenger.ff) obj).C);
        } else if (obj instanceof org.telegram.messenger.jf) {
            obj2 = ((org.telegram.messenger.jf) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        ym0 ym0Var = this.f51245a;
        if (!ym0Var.f53566b.containsKey(obj2)) {
            return -1;
        }
        ym0Var.f53566b.remove(obj2);
        int indexOf = ym0Var.f53568c.indexOf(obj2);
        if (indexOf >= 0) {
            ym0Var.f53568c.remove(indexOf);
        }
        if (ym0Var.f53571e) {
            ym0Var.m0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i7) {
        ym0 ym0Var = this.f51245a;
        org.telegram.messenger.ve veVar = ym0Var.K;
        org.telegram.ui.Cells.q5 a02 = ym0.a0(ym0Var, i7);
        if (a02 != null) {
            if (veVar != null) {
                org.telegram.ui.Components.i9 imageView = a02.getImageView();
                imageView.r();
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.f26971e.get(i7);
                String str = ffVar.f27709c;
                int i10 = ffVar.C;
                String str2 = ffVar.I;
                if (str != null) {
                    imageView.h(str, null, org.telegram.ui.ActionBar.j6.R4);
                    return;
                } else if (str2 != null) {
                    imageView.s(ffVar.J, ffVar.K, true);
                    if (ffVar.f27708b && !ffVar.d()) {
                        imageView.h("vthumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.j6.R4);
                        return;
                    }
                    imageView.h("thumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.j6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                    return;
                }
            }
            a02.e((org.telegram.messenger.jf) ym0Var.f53573f.get(i7));
        }
    }

    @Override
    public final void a0(int i7) {
        ym0 ym0Var = this.f51245a;
        int childCount = ym0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ym0Var.L.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.ve veVar = ym0Var.K;
                if (veVar == null ? !(intValue < 0 || intValue >= ym0Var.f53573f.size()) : !(intValue < 0 || intValue >= veVar.f26971e.size())) {
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
        return this.f51245a.f53568c;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        org.telegram.ui.Cells.q5 a02 = ym0.a0(this.f51245a, i7);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        int d02;
        boolean z10;
        ym0 ym0Var = this.f51245a;
        org.telegram.messenger.ve veVar = ym0Var.K;
        int i10 = -1;
        int i11 = 1;
        if (veVar != null) {
            if (i7 < 0 || i7 >= veVar.f26971e.size()) {
                return -1;
            }
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ym0Var.K.f26971e.get(i7);
            d02 = ym0Var.d0(-1, ffVar);
            if (d02 == -1) {
                ffVar.f27723s = g20Var;
                d02 = ym0Var.f53568c.indexOf(Integer.valueOf(ffVar.C));
                z10 = true;
            } else {
                ffVar.f27723s = null;
                z10 = false;
            }
        } else if (i7 < 0 || i7 >= ym0Var.f53573f.size()) {
            return -1;
        } else {
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) ym0Var.f53573f.get(i7);
            d02 = ym0Var.d0(-1, jfVar);
            if (d02 == -1) {
                jfVar.f27723s = g20Var;
                d02 = ym0Var.f53568c.indexOf(jfVar.B);
                z10 = true;
            } else {
                jfVar.f27723s = null;
                z10 = false;
            }
        }
        int childCount = ym0Var.L.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = ym0Var.L.getChildAt(i12);
            if (((Integer) childAt.getTag()).intValue() == i7) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (ym0Var.f53571e) {
                    i10 = d02;
                }
                q5Var.b(i10, z10, false);
            } else {
                i12++;
            }
        }
        if (!z10) {
            i11 = 2;
        }
        ym0Var.n0(i11);
        ym0Var.f53590t0.y();
        return d02;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        ym0 ym0Var = this.f51245a;
        ArrayList arrayList = ym0Var.f53573f;
        org.telegram.messenger.ve veVar = ym0Var.K;
        if (ym0Var.f53566b.isEmpty()) {
            if (veVar != null) {
                if (i7 >= 0 && i7 < veVar.f26971e.size()) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.f26971e.get(i7);
                    ffVar.f27723s = g20Var;
                    ym0Var.d0(-1, ffVar);
                } else {
                    return;
                }
            } else if (i7 >= 0 && i7 < arrayList.size()) {
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) arrayList.get(i7);
                jfVar.f27723s = g20Var;
                ym0Var.d0(-1, jfVar);
            } else {
                return;
            }
        }
        ym0Var.j0(i10, z10);
    }

    @Override
    public final boolean u() {
        ym0 ym0Var = this.f51245a;
        ym0Var.f53590t0.t0(0, true, true);
        ym0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f51245a.f53566b;
    }

    @Override
    public final boolean x(int i7) {
        ym0 ym0Var = this.f51245a;
        org.telegram.messenger.ve veVar = ym0Var.K;
        if (veVar != null) {
            if (i7 < 0 || i7 >= veVar.f26971e.size() || !ym0Var.f53566b.containsKey(Integer.valueOf(((org.telegram.messenger.ff) ym0Var.K.f26971e.get(i7)).C))) {
                return false;
            }
            return true;
        } else if (i7 < 0 || i7 >= ym0Var.f53573f.size() || !ym0Var.f53566b.containsKey(((org.telegram.messenger.jf) ym0Var.f53573f.get(i7)).B)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f51245a.F;
    }
}
