package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class tm0 extends pq0 {
    public final zm0 f50203a;

    public tm0(zm0 zm0Var) {
        this.f50203a = zm0Var;
    }

    @Override
    public final yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        zm0 zm0Var = this.f50203a;
        org.telegram.ui.Cells.q5 a02 = zm0.a0(zm0Var, i7);
        if (a02 != null) {
            org.telegram.ui.Components.l9 imageView = a02.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            yq0 yq0Var = new yq0();
            yq0Var.f52160b = iArr[0];
            yq0Var.f52161c = iArr[1];
            yq0Var.d = zm0Var.K;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            yq0Var.f52159a = imageReceiver;
            yq0Var.f52162e = imageReceiver.p();
            yq0Var.f52167k = a02.getScale();
            a02.g(false);
            return yq0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        zm0 zm0Var = this.f50203a;
        int childCount = zm0Var.K.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = zm0Var.K.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f50203a.f52600b.size();
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
        zm0 zm0Var = this.f50203a;
        if (!zm0Var.f52600b.containsKey(obj2)) {
            return -1;
        }
        zm0Var.f52600b.remove(obj2);
        int indexOf = zm0Var.f52602c.indexOf(obj2);
        if (indexOf >= 0) {
            zm0Var.f52602c.remove(indexOf);
        }
        if (zm0Var.f52605e) {
            zm0Var.m0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i7) {
        zm0 zm0Var = this.f50203a;
        org.telegram.messenger.we weVar = zm0Var.J;
        org.telegram.ui.Cells.q5 a02 = zm0.a0(zm0Var, i7);
        if (a02 != null) {
            if (weVar != null) {
                org.telegram.ui.Components.l9 imageView = a02.getImageView();
                imageView.r();
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.f26300e.get(i7);
                String str = gfVar.f26846c;
                int i10 = gfVar.C;
                String str2 = gfVar.I;
                if (str != null) {
                    imageView.h(str, null, org.telegram.ui.ActionBar.l6.R4);
                    return;
                } else if (str2 != null) {
                    imageView.s(gfVar.J, gfVar.K, true);
                    if (gfVar.f26845b && !gfVar.d()) {
                        imageView.h("vthumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.l6.R4);
                        return;
                    }
                    imageView.h("thumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.l6.R4);
                    return;
                } else {
                    imageView.setImageDrawable(org.telegram.ui.ActionBar.l6.R4);
                    return;
                }
            }
            a02.e((org.telegram.messenger.kf) zm0Var.f52607f.get(i7));
        }
    }

    @Override
    public final void a0(int i7) {
        zm0 zm0Var = this.f50203a;
        int childCount = zm0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zm0Var.K.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.we weVar = zm0Var.J;
                if (weVar == null ? !(intValue < 0 || intValue >= zm0Var.f52607f.size()) : !(intValue < 0 || intValue >= weVar.f26300e.size())) {
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
        return this.f50203a.f52602c;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Cells.q5 a02 = zm0.a0(this.f50203a, i7);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        int d02;
        boolean z9;
        zm0 zm0Var = this.f50203a;
        org.telegram.messenger.we weVar = zm0Var.J;
        int i10 = -1;
        int i11 = 1;
        if (weVar != null) {
            if (i7 < 0 || i7 >= weVar.f26300e.size()) {
                return -1;
            }
            org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) zm0Var.J.f26300e.get(i7);
            d02 = zm0Var.d0(-1, gfVar);
            if (d02 == -1) {
                gfVar.f26860s = j20Var;
                d02 = zm0Var.f52602c.indexOf(Integer.valueOf(gfVar.C));
                z9 = true;
            } else {
                gfVar.f26860s = null;
                z9 = false;
            }
        } else if (i7 < 0 || i7 >= zm0Var.f52607f.size()) {
            return -1;
        } else {
            org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) zm0Var.f52607f.get(i7);
            d02 = zm0Var.d0(-1, kfVar);
            if (d02 == -1) {
                kfVar.f26860s = j20Var;
                d02 = zm0Var.f52602c.indexOf(kfVar.B);
                z9 = true;
            } else {
                kfVar.f26860s = null;
                z9 = false;
            }
        }
        int childCount = zm0Var.K.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = zm0Var.K.getChildAt(i12);
            if (((Integer) childAt.getTag()).intValue() == i7) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (zm0Var.f52605e) {
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
        zm0Var.n0(i11);
        zm0Var.f52623s0.A();
        return d02;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        zm0 zm0Var = this.f50203a;
        ArrayList arrayList = zm0Var.f52607f;
        org.telegram.messenger.we weVar = zm0Var.J;
        if (zm0Var.f52600b.isEmpty()) {
            if (weVar != null) {
                if (i7 >= 0 && i7 < weVar.f26300e.size()) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) weVar.f26300e.get(i7);
                    gfVar.f26860s = j20Var;
                    zm0Var.d0(-1, gfVar);
                } else {
                    return;
                }
            } else if (i7 >= 0 && i7 < arrayList.size()) {
                org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) arrayList.get(i7);
                kfVar.f26860s = j20Var;
                zm0Var.d0(-1, kfVar);
            } else {
                return;
            }
        }
        zm0Var.j0(i10, z9);
    }

    @Override
    public final boolean u() {
        zm0 zm0Var = this.f50203a;
        zm0Var.f52623s0.v0(0, true, true);
        zm0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f50203a.f52600b;
    }

    @Override
    public final boolean x(int i7) {
        zm0 zm0Var = this.f50203a;
        org.telegram.messenger.we weVar = zm0Var.J;
        if (weVar != null) {
            if (i7 < 0 || i7 >= weVar.f26300e.size() || !zm0Var.f52600b.containsKey(Integer.valueOf(((org.telegram.messenger.gf) zm0Var.J.f26300e.get(i7)).C))) {
                return false;
            }
            return true;
        } else if (i7 < 0 || i7 >= zm0Var.f52607f.size() || !zm0Var.f52600b.containsKey(((org.telegram.messenger.kf) zm0Var.f52607f.get(i7)).B)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f50203a.E;
    }
}
