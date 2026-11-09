package org.telegram.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class y90 extends org.telegram.ui.ActionBar.f2 {
    public FrameLayout f52004a;
    public org.telegram.ui.Components.qj0 f52005b;
    public v4.b0 f52006c;
    public org.telegram.ui.Components.zh0 d;
    public org.telegram.ui.Components.cc f52007e;
    public int f52008f;
    public final r3 h;
    public final boolean[] f52009n;
    public final ArrayList f52010r;
    public final ArrayList f52011s;

    public y90() {
        super(null);
        this.h = new r3(this, 10);
        this.f52009n = new boolean[3];
        this.f52010r = new ArrayList();
        this.f52011s = new ArrayList();
    }

    public final int Z(int i7) {
        if (i7 == 3) {
            return 0;
        }
        if (i7 == 28700) {
            return 1;
        }
        if (i7 == this.f52008f) {
            return 2;
        }
        return -1;
    }

    public final void a0(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f52011s;
            if (i10 < arrayList.size()) {
                if (((t90) arrayList.get(i10)).f50130e == i7) {
                    this.f52005b.e1(new l2.q(this, i10, 12), 700, true);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void b0(int i7) {
        int Z = Z(i7);
        if (Z == -1) {
            return;
        }
        this.f52009n[Z] = true;
        d0();
        c0();
    }

    public final void c0() {
        String a02;
        ArrayList arrayList = this.f52010r;
        arrayList.clear();
        ArrayList arrayList2 = this.f52011s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i7 = Build.VERSION.SDK_INT;
        arrayList2.add(new t90(1, 0, null, 0, 0));
        if (org.telegram.messenger.sc.c() <= 0) {
            a02 = org.telegram.messenger.id.M0(2131748871, null);
        } else if (org.telegram.messenger.sc.c() >= 100) {
            a02 = org.telegram.messenger.id.M0(2131748870, null);
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131748872, String.format("%d%%", Integer.valueOf(org.telegram.messenger.sc.c())));
        }
        arrayList2.add(new t90(2, 0, a02, 0, 0));
        arrayList2.add(new t90(0, 0, org.telegram.messenger.id.M0(2131748848, null), 0, 0));
        arrayList2.add(t90.c(2131232038, 3, org.telegram.messenger.id.M0(2131748850, null)));
        boolean[] zArr = this.f52009n;
        if (zArr[0]) {
            arrayList2.add(t90.b(1, org.telegram.messenger.id.M0(2131748862, null)));
            arrayList2.add(t90.b(2, org.telegram.messenger.id.M0(2131748864, null)));
        }
        arrayList2.add(t90.c(2131232037, 28700, org.telegram.messenger.id.M0(2131748855, null)));
        if (zArr[1]) {
            arrayList2.add(t90.b(16388, org.telegram.messenger.id.M0(2131748862, null)));
            arrayList2.add(t90.b(8200, org.telegram.messenger.id.M0(2131748861, null)));
            arrayList2.add(t90.b(4112, org.telegram.messenger.id.M0(2131748864, null)));
        }
        arrayList2.add(t90.c(2131232017, this.f52008f, org.telegram.messenger.id.M0(2131748856, null)));
        if (zArr[2]) {
            arrayList2.add(t90.b(32, org.telegram.messenger.id.N0("LiteOptionsBackground")));
            if (!org.telegram.messenger.g0.Q1()) {
                arrayList2.add(t90.b(64, org.telegram.messenger.id.N0("LiteOptionsTopics")));
            }
            arrayList2.add(t90.b(128, org.telegram.messenger.id.N0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.iz.o() < 1) {
                boolean z9 = org.telegram.messenger.r2.f25212a;
            } else {
                arrayList2.add(t90.b(256, org.telegram.messenger.id.N0("LiteOptionsBlur2")));
            }
            if (i7 >= 33) {
                if (org.telegram.messenger.iz.o() < 1) {
                    boolean z10 = org.telegram.messenger.r2.f25212a;
                } else {
                    arrayList2.add(t90.b(262144, org.telegram.messenger.id.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(t90.b(32768, org.telegram.messenger.id.N0("LiteOptionsScale")));
            if (org.telegram.ui.Components.ez0.c()) {
                arrayList2.add(t90.b(65536, org.telegram.messenger.id.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(t90.c(2131232021, 512, org.telegram.messenger.id.M0(2131748857, null)));
        arrayList2.add(t90.c(2131232040, 1024, org.telegram.messenger.id.M0(2131748860, null)));
        arrayList2.add(t90.c(2131232028, 2048, org.telegram.messenger.id.M0(2131748863, null)));
        arrayList2.add(t90.c(2131232527, 131072, org.telegram.messenger.id.M0(2131748853, null)));
        arrayList2.add(new t90(2, 0, "", 0, 0));
        arrayList2.add(new t90(5, 0, org.telegram.messenger.id.M0(2131748846, null), 0, 1));
        arrayList2.add(new t90(2, 0, org.telegram.messenger.id.N0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747066, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 12));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f52004a = new FrameLayout(context);
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f52005b = qj0Var;
        qj0Var.r1();
        org.telegram.ui.Components.qj0 qj0Var2 = this.f52005b;
        v4.b0 b0Var = new v4.b0();
        this.f52006c = b0Var;
        qj0Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.qj0 qj0Var3 = this.f52005b;
        org.telegram.ui.Components.zh0 zh0Var = new org.telegram.ui.Components.zh0(this, 2);
        this.d = zh0Var;
        qj0Var3.setAdapter(zh0Var);
        this.f52005b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f57083m = false;
        this.f52005b.setItemAnimator(kVar);
        this.f52004a.addView(this.f52005b, c8.ha.c(-1.0f, -1));
        this.f52005b.setOnItemClickListener(new yr(this, 18));
        this.fragmentView = this.f52004a;
        if (org.telegram.messenger.g0.Q1()) {
            i7 = 360864;
        } else {
            i7 = 360928;
        }
        this.f52008f = i7;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z9;
        float f10;
        if (this.f52005b != null) {
            for (int i7 = 0; i7 < this.f52005b.getChildCount(); i7++) {
                View childAt = this.f52005b.getChildAt(i7);
                if (childAt != null) {
                    this.f52005b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f52011s;
                        if (R < arrayList.size()) {
                            t90 t90Var = (t90) arrayList.get(R);
                            int i10 = t90Var.f54544a;
                            if (i10 != 3 && i10 != 4) {
                                if (i10 == 1) {
                                    ((w90) childAt).a();
                                }
                            } else {
                                x90 x90Var = (x90) childAt;
                                ImageView imageView = x90Var.f51599e;
                                y90 y90Var = x90Var.D;
                                int i11 = t90Var.f50130e;
                                if (i10 == 3) {
                                    if (Integer.bitCount(i11) > 1) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    x90Var.f51604w = z9;
                                    if (z9) {
                                        x90Var.c(t90Var, true);
                                        int Z = y90Var.Z(i11);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (Z >= 0 && y90Var.f52009n[Z]) {
                                            f10 = 180.0f;
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        org.telegram.messenger.camera.q.l(animate.rotation(f10), org.telegram.ui.Components.xq.h, 240L);
                                    }
                                    x90Var.f51600f.c(org.telegram.messenger.sc.e(i11), true);
                                } else {
                                    x90Var.h.a(org.telegram.messenger.sc.e(i11), true);
                                }
                                x90Var.b(org.telegram.messenger.sc.f(), true);
                            }
                        }
                    }
                }
            }
            if (this.f52007e != null && !org.telegram.messenger.sc.f()) {
                this.f52007e.b();
                this.f52007e = null;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f52005b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.sc.f25454n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.sc.a(this.h);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.sc.k();
        org.telegram.ui.Components.i5.t();
        org.telegram.ui.ActionBar.l6.u1(true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
