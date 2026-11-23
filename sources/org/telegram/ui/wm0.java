package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class wm0 extends oq0 {
    public final cn0 f53458a;

    public wm0(cn0 cn0Var) {
        this.f53458a = cn0Var;
    }

    @Override
    public final wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        cn0 cn0Var = this.f53458a;
        org.telegram.ui.Cells.s5 a02 = cn0.a0(cn0Var, i7);
        if (a02 != null) {
            org.telegram.ui.Components.q9 imageView = a02.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            wq0 wq0Var = new wq0();
            wq0Var.f53498b = iArr[0];
            wq0Var.f53499c = iArr[1];
            wq0Var.d = cn0Var.L;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            wq0Var.f53497a = imageReceiver;
            wq0Var.f53500e = imageReceiver.p();
            wq0Var.f53505k = a02.getScale();
            a02.g(false);
            return wq0Var;
        }
        return null;
    }

    @Override
    public final void G() {
        cn0 cn0Var = this.f53458a;
        int childCount = cn0Var.L.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = cn0Var.L.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                ((org.telegram.ui.Cells.s5) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.f53458a.f46598b.size();
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
        cn0 cn0Var = this.f53458a;
        if (!cn0Var.f46598b.containsKey(obj2)) {
            return -1;
        }
        cn0Var.f46598b.remove(obj2);
        int indexOf = cn0Var.f46600c.indexOf(obj2);
        if (indexOf >= 0) {
            cn0Var.f46600c.remove(indexOf);
        }
        if (cn0Var.f46603e) {
            cn0Var.m0();
        }
        return indexOf;
    }

    @Override
    public final void X(int i7) {
        cn0 cn0Var = this.f53458a;
        org.telegram.messenger.ve veVar = cn0Var.K;
        org.telegram.ui.Cells.s5 a02 = cn0.a0(cn0Var, i7);
        if (a02 != null) {
            if (veVar != null) {
                org.telegram.ui.Components.q9 imageView = a02.getImageView();
                imageView.r();
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.f27357e.get(i7);
                String str = ffVar.f28060c;
                int i10 = ffVar.C;
                String str2 = ffVar.I;
                if (str != null) {
                    imageView.h(str, null, org.telegram.ui.ActionBar.m6.R4);
                    return;
                } else if (str2 != null) {
                    imageView.s(ffVar.J, ffVar.K, true);
                    if (ffVar.f28059b && !ffVar.d()) {
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
            a02.e((org.telegram.messenger.jf) cn0Var.f46605f.get(i7));
        }
    }

    @Override
    public final void a0(int i7) {
        cn0 cn0Var = this.f53458a;
        int childCount = cn0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cn0Var.L.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.ve veVar = cn0Var.K;
                if (veVar == null ? !(intValue < 0 || intValue >= cn0Var.f46605f.size()) : !(intValue < 0 || intValue >= veVar.f27357e.size())) {
                    if (intValue == i7) {
                        s5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList c() {
        return this.f53458a.f46600c;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        org.telegram.ui.Cells.s5 a02 = cn0.a0(this.f53458a, i7);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final int k(int i7, org.telegram.messenger.f20 f20Var) {
        int d02;
        boolean z10;
        cn0 cn0Var = this.f53458a;
        org.telegram.messenger.ve veVar = cn0Var.K;
        int i10 = -1;
        int i11 = 1;
        if (veVar != null) {
            if (i7 < 0 || i7 >= veVar.f27357e.size()) {
                return -1;
            }
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) cn0Var.K.f27357e.get(i7);
            d02 = cn0Var.d0(-1, ffVar);
            if (d02 == -1) {
                ffVar.f28074s = f20Var;
                d02 = cn0Var.f46600c.indexOf(Integer.valueOf(ffVar.C));
                z10 = true;
            } else {
                ffVar.f28074s = null;
                z10 = false;
            }
        } else if (i7 < 0 || i7 >= cn0Var.f46605f.size()) {
            return -1;
        } else {
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) cn0Var.f46605f.get(i7);
            d02 = cn0Var.d0(-1, jfVar);
            if (d02 == -1) {
                jfVar.f28074s = f20Var;
                d02 = cn0Var.f46600c.indexOf(jfVar.B);
                z10 = true;
            } else {
                jfVar.f28074s = null;
                z10 = false;
            }
        }
        int childCount = cn0Var.L.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = cn0Var.L.getChildAt(i12);
            if (((Integer) childAt.getTag()).intValue() == i7) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                if (cn0Var.f46603e) {
                    i10 = d02;
                }
                s5Var.b(i10, z10, false);
            } else {
                i12++;
            }
        }
        if (!z10) {
            i11 = 2;
        }
        cn0Var.n0(i11);
        cn0Var.f46622t0.u();
        return d02;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        cn0 cn0Var = this.f53458a;
        ArrayList arrayList = cn0Var.f46605f;
        org.telegram.messenger.ve veVar = cn0Var.K;
        if (cn0Var.f46598b.isEmpty()) {
            if (veVar != null) {
                if (i7 >= 0 && i7 < veVar.f27357e.size()) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.f27357e.get(i7);
                    ffVar.f28074s = f20Var;
                    cn0Var.d0(-1, ffVar);
                } else {
                    return;
                }
            } else if (i7 >= 0 && i7 < arrayList.size()) {
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) arrayList.get(i7);
                jfVar.f28074s = f20Var;
                cn0Var.d0(-1, jfVar);
            } else {
                return;
            }
        }
        cn0Var.j0(i10, z10);
    }

    @Override
    public final boolean u() {
        cn0 cn0Var = this.f53458a;
        cn0Var.f46622t0.v0(0, true, true);
        cn0Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap v() {
        return this.f53458a.f46598b;
    }

    @Override
    public final boolean x(int i7) {
        cn0 cn0Var = this.f53458a;
        org.telegram.messenger.ve veVar = cn0Var.K;
        if (veVar != null) {
            if (i7 < 0 || i7 >= veVar.f27357e.size() || !cn0Var.f46598b.containsKey(Integer.valueOf(((org.telegram.messenger.ff) cn0Var.K.f27357e.get(i7)).C))) {
                return false;
            }
            return true;
        } else if (i7 < 0 || i7 >= cn0Var.f46605f.size() || !cn0Var.f46598b.containsKey(((org.telegram.messenger.jf) cn0Var.f46605f.get(i7)).B)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final boolean z() {
        return this.f53458a.F;
    }
}
