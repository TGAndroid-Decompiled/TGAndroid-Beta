package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class um0 extends qq0 {
    public final an0 f50522a;

    public um0(an0 an0Var) {
        this.f50522a = an0Var;
    }

    @Override
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        an0 an0Var = this.f50522a;
        org.telegram.ui.Cells.q5 a02 = an0.a0(an0Var, i7);
        if (a02 != null) {
            org.telegram.ui.Components.k9 imageView = a02.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            zq0 zq0Var = new zq0();
            zq0Var.f52504b = iArr[0];
            zq0Var.f52505c = iArr[1];
            zq0Var.d = an0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            zq0Var.f52503a = imageReceiver;
            zq0Var.f52506e = imageReceiver.p();
            zq0Var.f52511k = a02.getScale();
            a02.g(false);
            return zq0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        an0 an0Var = this.f50522a;
        int childCount = an0Var.K.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = an0Var.K.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f50522a.f43750b.size();
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
        an0 an0Var = this.f50522a;
        if (!an0Var.f43750b.containsKey(obj2)) {
            return -1;
        }
        an0Var.f43750b.remove(obj2);
        int indexOf = an0Var.f43752c.indexOf(obj2);
        if (indexOf >= 0) {
            an0Var.f43752c.remove(indexOf);
        }
        if (an0Var.f43755e) {
            an0Var.m0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i7) {
        an0 an0Var = this.f50522a;
        org.telegram.messenger.we weVar = an0Var.J;
        org.telegram.ui.Cells.q5 a02 = an0.a0(an0Var, i7);
        if (a02 != null) {
            if (weVar != null) {
                org.telegram.ui.Components.k9 imageView = a02.getImageView();
                imageView.r();
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.f26304e.get(i7);
                String str = gfVar.f26850c;
                int i10 = gfVar.C;
                String str2 = gfVar.I;
                if (str != null) {
                    imageView.h(str, null, org.telegram.ui.ActionBar.m6.R4);
                    return;
                } else if (str2 != null) {
                    imageView.s(gfVar.J, gfVar.K, true);
                    if (gfVar.f26849b && !gfVar.d()) {
                        imageView.h("vthumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.m6.R4);
                        return;
                    }
                    imageView.h("thumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.m6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.m6.R4);
                    return;
                }
            }
            a02.e((org.telegram.messenger.kf) an0Var.f43757f.get(i7));
        }
    }

    @Override
    public final void a0(int i7) {
        an0 an0Var = this.f50522a;
        int childCount = an0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = an0Var.K.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.we weVar = an0Var.J;
                if (weVar == null ? !(intValue < 0 || intValue >= an0Var.f43757f.size()) : !(intValue < 0 || intValue >= weVar.f26304e.size())) {
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
        return this.f50522a.f43752c;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Cells.q5 a02 = an0.a0(this.f50522a, i7);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        int d02;
        boolean z9;
        an0 an0Var = this.f50522a;
        org.telegram.messenger.we weVar = an0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (weVar != null) {
            if (i7 < 0 || i7 >= weVar.f26304e.size()) {
                return -1;
            }
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) an0Var.J.f26304e.get(i7);
            d02 = an0Var.d0(-1, gfVar);
            if (d02 == -1) {
                gfVar.f26864s = j20Var;
                d02 = an0Var.f43752c.indexOf(Integer.valueOf(gfVar.C));
                z9 = true;
            } else {
                gfVar.f26864s = null;
                z9 = false;
            }
        } else if (i7 < 0 || i7 >= an0Var.f43757f.size()) {
            return -1;
        } else {
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) an0Var.f43757f.get(i7);
            d02 = an0Var.d0(-1, kfVar);
            if (d02 == -1) {
                kfVar.f26864s = j20Var;
                d02 = an0Var.f43752c.indexOf(kfVar.B);
                z9 = true;
            } else {
                kfVar.f26864s = null;
                z9 = false;
            }
        }
        int childCount = an0Var.K.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = an0Var.K.getChildAt(i12);
            if (((Integer) childAt.getTag()).intValue() == i7) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (an0Var.f43755e) {
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
        an0Var.n0(i11);
        an0Var.f43773s0.A();
        return d02;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        an0 an0Var = this.f50522a;
        ArrayList arrayList = an0Var.f43757f;
        org.telegram.messenger.we weVar = an0Var.J;
        if (an0Var.f43750b.isEmpty()) {
            if (weVar != null) {
                if (i7 >= 0 && i7 < weVar.f26304e.size()) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.f26304e.get(i7);
                    gfVar.f26864s = j20Var;
                    an0Var.d0(-1, gfVar);
                } else {
                    return;
                }
            } else if (i7 >= 0 && i7 < arrayList.size()) {
                org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) arrayList.get(i7);
                kfVar.f26864s = j20Var;
                an0Var.d0(-1, kfVar);
            } else {
                return;
            }
        }
        an0Var.j0(i10, z9);
    }

    @Override
    public final boolean u() {
        an0 an0Var = this.f50522a;
        an0Var.f43773s0.v0(0, true, true);
        an0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f50522a.f43750b;
    }

    @Override
    public final boolean x(int i7) {
        an0 an0Var = this.f50522a;
        org.telegram.messenger.we weVar = an0Var.J;
        if (weVar != null) {
            if (i7 < 0 || i7 >= weVar.f26304e.size() || !an0Var.f43750b.containsKey(Integer.valueOf(((org.telegram.messenger.gf) an0Var.J.f26304e.get(i7)).C))) {
                return false;
            }
            return true;
        } else if (i7 < 0 || i7 >= an0Var.f43757f.size() || !an0Var.f43750b.containsKey(((org.telegram.messenger.kf) an0Var.f43757f.get(i7)).B)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f50522a.E;
    }
}
