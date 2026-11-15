package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class tm0 extends mq0 {
    public final zm0 f51613a;

    public tm0(zm0 zm0Var) {
        this.f51613a = zm0Var;
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        zm0 zm0Var = this.f51613a;
        org.telegram.ui.Cells.q5 a02 = zm0.a0(zm0Var, i7);
        if (a02 != null) {
            org.telegram.ui.Components.i9 imageView = a02.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            uq0 uq0Var = new uq0();
            uq0Var.f51998b = iArr[0];
            uq0Var.f51999c = iArr[1];
            uq0Var.d = zm0Var.L;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            uq0Var.f51997a = imageReceiver;
            uq0Var.f52000e = imageReceiver.p();
            uq0Var.f52005k = a02.getScale();
            a02.g(false);
            return uq0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        zm0 zm0Var = this.f51613a;
        int childCount = zm0Var.L.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = zm0Var.L.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f51613a.f53957b.size();
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
        zm0 zm0Var = this.f51613a;
        if (!zm0Var.f53957b.containsKey(obj2)) {
            return -1;
        }
        zm0Var.f53957b.remove(obj2);
        int indexOf = zm0Var.f53959c.indexOf(obj2);
        if (indexOf >= 0) {
            zm0Var.f53959c.remove(indexOf);
        }
        if (zm0Var.f53962e) {
            zm0Var.m0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i7) {
        zm0 zm0Var = this.f51613a;
        org.telegram.messenger.ve veVar = zm0Var.K;
        org.telegram.ui.Cells.q5 a02 = zm0.a0(zm0Var, i7);
        if (a02 != null) {
            if (veVar != null) {
                org.telegram.ui.Components.i9 imageView = a02.getImageView();
                imageView.r();
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.f26972e.get(i7);
                String str = ffVar.f27711c;
                int i10 = ffVar.C;
                String str2 = ffVar.I;
                if (str != null) {
                    imageView.h(str, null, org.telegram.ui.ActionBar.j6.R4);
                    return;
                } else if (str2 != null) {
                    imageView.s(ffVar.J, ffVar.K, true);
                    if (ffVar.f27710b && !ffVar.d()) {
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
            a02.e((org.telegram.messenger.jf) zm0Var.f53964f.get(i7));
        }
    }

    @Override
    public final void a0(int i7) {
        zm0 zm0Var = this.f51613a;
        int childCount = zm0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = zm0Var.L.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.ve veVar = zm0Var.K;
                if (veVar == null ? !(intValue < 0 || intValue >= zm0Var.f53964f.size()) : !(intValue < 0 || intValue >= veVar.f26972e.size())) {
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
        return this.f51613a.f53959c;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        org.telegram.ui.Cells.q5 a02 = zm0.a0(this.f51613a, i7);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        int d02;
        boolean z10;
        zm0 zm0Var = this.f51613a;
        org.telegram.messenger.ve veVar = zm0Var.K;
        int i10 = -1;
        int i11 = 1;
        if (veVar != null) {
            if (i7 < 0 || i7 >= veVar.f26972e.size()) {
                return -1;
            }
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) zm0Var.K.f26972e.get(i7);
            d02 = zm0Var.d0(-1, ffVar);
            if (d02 == -1) {
                ffVar.f27725s = g20Var;
                d02 = zm0Var.f53959c.indexOf(Integer.valueOf(ffVar.C));
                z10 = true;
            } else {
                ffVar.f27725s = null;
                z10 = false;
            }
        } else if (i7 < 0 || i7 >= zm0Var.f53964f.size()) {
            return -1;
        } else {
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) zm0Var.f53964f.get(i7);
            d02 = zm0Var.d0(-1, jfVar);
            if (d02 == -1) {
                jfVar.f27725s = g20Var;
                d02 = zm0Var.f53959c.indexOf(jfVar.B);
                z10 = true;
            } else {
                jfVar.f27725s = null;
                z10 = false;
            }
        }
        int childCount = zm0Var.L.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = zm0Var.L.getChildAt(i12);
            if (((Integer) childAt.getTag()).intValue() == i7) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                if (zm0Var.f53962e) {
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
        zm0Var.n0(i11);
        zm0Var.f53981t0.y();
        return d02;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        zm0 zm0Var = this.f51613a;
        ArrayList arrayList = zm0Var.f53964f;
        org.telegram.messenger.ve veVar = zm0Var.K;
        if (zm0Var.f53957b.isEmpty()) {
            if (veVar != null) {
                if (i7 >= 0 && i7 < veVar.f26972e.size()) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.f26972e.get(i7);
                    ffVar.f27725s = g20Var;
                    zm0Var.d0(-1, ffVar);
                } else {
                    return;
                }
            } else if (i7 >= 0 && i7 < arrayList.size()) {
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) arrayList.get(i7);
                jfVar.f27725s = g20Var;
                zm0Var.d0(-1, jfVar);
            } else {
                return;
            }
        }
        zm0Var.j0(i10, z10);
    }

    @Override
    public final boolean u() {
        zm0 zm0Var = this.f51613a;
        zm0Var.f53981t0.t0(0, true, true);
        zm0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f51613a.f53957b;
    }

    @Override
    public final boolean x(int i7) {
        zm0 zm0Var = this.f51613a;
        org.telegram.messenger.ve veVar = zm0Var.K;
        if (veVar != null) {
            if (i7 < 0 || i7 >= veVar.f26972e.size() || !zm0Var.f53957b.containsKey(Integer.valueOf(((org.telegram.messenger.ff) zm0Var.K.f26972e.get(i7)).C))) {
                return false;
            }
            return true;
        } else if (i7 < 0 || i7 >= zm0Var.f53964f.size() || !zm0Var.f53957b.containsKey(((org.telegram.messenger.jf) zm0Var.f53964f.get(i7)).B)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f51613a.F;
    }
}
