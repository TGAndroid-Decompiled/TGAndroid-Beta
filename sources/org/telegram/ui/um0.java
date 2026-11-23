package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class um0 extends oq0 {
    public final an0 f52688a;

    public um0(an0 an0Var) {
        this.f52688a = an0Var;
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        an0 an0Var = this.f52688a;
        org.telegram.ui.Cells.r5 a02 = an0.a0(an0Var, i7);
        if (a02 != null) {
            org.telegram.ui.Components.p9 imageView = a02.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            wq0 wq0Var = new wq0();
            wq0Var.f53727b = iArr[0];
            wq0Var.f53728c = iArr[1];
            wq0Var.d = an0Var.L;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            wq0Var.f53726a = imageReceiver;
            wq0Var.f53729e = imageReceiver.p();
            wq0Var.f53734k = a02.getScale();
            a02.g(false);
            return wq0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        an0 an0Var = this.f52688a;
        int childCount = an0Var.L.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = an0Var.L.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                ((org.telegram.ui.Cells.r5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f52688a.f45745b.size();
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        if (obj instanceof org.telegram.messenger.ef) {
            obj2 = Integer.valueOf(((org.telegram.messenger.ef) obj).C);
        } else if (obj instanceof org.telegram.messenger.hf) {
            obj2 = ((org.telegram.messenger.hf) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return -1;
        }
        an0 an0Var = this.f52688a;
        if (!an0Var.f45745b.containsKey(obj2)) {
            return -1;
        }
        an0Var.f45745b.remove(obj2);
        int indexOf = an0Var.f45747c.indexOf(obj2);
        if (indexOf >= 0) {
            an0Var.f45747c.remove(indexOf);
        }
        if (an0Var.f45750e) {
            an0Var.m0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i7) {
        an0 an0Var = this.f52688a;
        org.telegram.messenger.ue ueVar = an0Var.K;
        org.telegram.ui.Cells.r5 a02 = an0.a0(an0Var, i7);
        if (a02 != null) {
            if (ueVar != null) {
                org.telegram.ui.Components.p9 imageView = a02.getImageView();
                imageView.r();
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ueVar.f27262e.get(i7);
                String str = efVar.f27964c;
                int i10 = efVar.C;
                String str2 = efVar.I;
                if (str != null) {
                    imageView.h(str, null, org.telegram.ui.ActionBar.n6.R4);
                    return;
                } else if (str2 != null) {
                    imageView.s(efVar.J, efVar.K, true);
                    if (efVar.f27963b && !efVar.d()) {
                        imageView.h("vthumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.n6.R4);
                        return;
                    }
                    imageView.h("thumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.n6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.n6.R4);
                    return;
                }
            }
            a02.e((org.telegram.messenger.hf) an0Var.f45752f.get(i7));
        }
    }

    @Override
    public final void a0(int i7) {
        an0 an0Var = this.f52688a;
        int childCount = an0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = an0Var.L.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.ue ueVar = an0Var.K;
                if (ueVar == null ? !(intValue < 0 || intValue >= an0Var.f45752f.size()) : !(intValue < 0 || intValue >= ueVar.f27262e.size())) {
                    if (intValue == i7) {
                        r5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f52688a.f45747c;
    }

    @Override
    public final org.telegram.messenger.hc j(int i7) {
        org.telegram.ui.Cells.r5 a02 = an0.a0(this.f52688a, i7);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.d20 d20Var) {
        int d02;
        boolean z10;
        an0 an0Var = this.f52688a;
        org.telegram.messenger.ue ueVar = an0Var.K;
        int i10 = -1;
        int i11 = 1;
        if (ueVar != null) {
            if (i7 < 0 || i7 >= ueVar.f27262e.size()) {
                return -1;
            }
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) an0Var.K.f27262e.get(i7);
            d02 = an0Var.d0(-1, efVar);
            if (d02 == -1) {
                efVar.f27978s = d20Var;
                d02 = an0Var.f45747c.indexOf(Integer.valueOf(efVar.C));
                z10 = true;
            } else {
                efVar.f27978s = null;
                z10 = false;
            }
        } else if (i7 < 0 || i7 >= an0Var.f45752f.size()) {
            return -1;
        } else {
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) an0Var.f45752f.get(i7);
            d02 = an0Var.d0(-1, hfVar);
            if (d02 == -1) {
                hfVar.f27978s = d20Var;
                d02 = an0Var.f45747c.indexOf(hfVar.B);
                z10 = true;
            } else {
                hfVar.f27978s = null;
                z10 = false;
            }
        }
        int childCount = an0Var.L.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = an0Var.L.getChildAt(i12);
            if (((Integer) childAt.getTag()).intValue() == i7) {
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) childAt;
                if (an0Var.f45750e) {
                    i10 = d02;
                }
                r5Var.b(i10, z10, false);
            } else {
                i12++;
            }
        }
        if (!z10) {
            i11 = 2;
        }
        an0Var.n0(i11);
        an0Var.f45769t0.o();
        return d02;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        an0 an0Var = this.f52688a;
        ArrayList arrayList = an0Var.f45752f;
        org.telegram.messenger.ue ueVar = an0Var.K;
        if (an0Var.f45745b.isEmpty()) {
            if (ueVar != null) {
                if (i7 >= 0 && i7 < ueVar.f27262e.size()) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ueVar.f27262e.get(i7);
                    efVar.f27978s = d20Var;
                    an0Var.d0(-1, efVar);
                } else {
                    return;
                }
            } else if (i7 >= 0 && i7 < arrayList.size()) {
                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) arrayList.get(i7);
                hfVar.f27978s = d20Var;
                an0Var.d0(-1, hfVar);
            } else {
                return;
            }
        }
        an0Var.j0(i10, z10);
    }

    @Override
    public final boolean u() {
        an0 an0Var = this.f52688a;
        an0Var.f45769t0.g0(0, true, true);
        an0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f52688a.f45745b;
    }

    @Override
    public final boolean x(int i7) {
        an0 an0Var = this.f52688a;
        org.telegram.messenger.ue ueVar = an0Var.K;
        if (ueVar != null) {
            if (i7 < 0 || i7 >= ueVar.f27262e.size() || !an0Var.f45745b.containsKey(Integer.valueOf(((org.telegram.messenger.ef) an0Var.K.f27262e.get(i7)).C))) {
                return false;
            }
            return true;
        } else if (i7 < 0 || i7 >= an0Var.f45752f.size() || !an0Var.f45745b.containsKey(((org.telegram.messenger.hf) an0Var.f45752f.get(i7)).B)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f52688a.F;
    }
}
