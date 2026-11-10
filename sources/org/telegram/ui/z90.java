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
public final class z90 extends org.telegram.ui.ActionBar.f2 {
    public FrameLayout f52334a;
    public org.telegram.ui.Components.pj0 f52335b;
    public v4.b0 f52336c;
    public org.telegram.ui.Components.yh0 d;
    public org.telegram.ui.Components.bc f52337e;
    public int f52338f;
    public final r3 h;
    public final boolean[] f52339n;
    public final ArrayList f52340r;
    public final ArrayList f52341s;

    public z90() {
        super(null);
        this.h = new r3(this, 10);
        this.f52339n = new boolean[3];
        this.f52340r = new ArrayList();
        this.f52341s = new ArrayList();
    }

    public final int Z(int i7) {
        if (i7 == 3) {
            return 0;
        }
        if (i7 == 28700) {
            return 1;
        }
        if (i7 == this.f52338f) {
            return 2;
        }
        return -1;
    }

    public final void a0(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f52341s;
            if (i10 < arrayList.size()) {
                if (((u90) arrayList.get(i10)).f50438e == i7) {
                    this.f52335b.e1(new l2.q(this, i10, 12), 700, true);
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
        this.f52339n[Z] = true;
        d0();
        c0();
    }

    public final void c0() {
        String a02;
        ArrayList arrayList = this.f52340r;
        arrayList.clear();
        ArrayList arrayList2 = this.f52341s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i7 = Build.VERSION.SDK_INT;
        arrayList2.add(new u90(1, 0, null, 0, 0));
        if (org.telegram.messenger.sc.c() <= 0) {
            a02 = org.telegram.messenger.id.M0(2131748871, null);
        } else if (org.telegram.messenger.sc.c() >= 100) {
            a02 = org.telegram.messenger.id.M0(2131748870, null);
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131748872, String.format("%d%%", Integer.valueOf(org.telegram.messenger.sc.c())));
        }
        arrayList2.add(new u90(2, 0, a02, 0, 0));
        arrayList2.add(new u90(0, 0, org.telegram.messenger.id.M0(2131748848, null), 0, 0));
        arrayList2.add(u90.c(2131232038, 3, org.telegram.messenger.id.M0(2131748850, null)));
        boolean[] zArr = this.f52339n;
        if (zArr[0]) {
            arrayList2.add(u90.b(1, org.telegram.messenger.id.M0(2131748862, null)));
            arrayList2.add(u90.b(2, org.telegram.messenger.id.M0(2131748864, null)));
        }
        arrayList2.add(u90.c(2131232037, 28700, org.telegram.messenger.id.M0(2131748855, null)));
        if (zArr[1]) {
            arrayList2.add(u90.b(16388, org.telegram.messenger.id.M0(2131748862, null)));
            arrayList2.add(u90.b(8200, org.telegram.messenger.id.M0(2131748861, null)));
            arrayList2.add(u90.b(4112, org.telegram.messenger.id.M0(2131748864, null)));
        }
        arrayList2.add(u90.c(2131232017, this.f52338f, org.telegram.messenger.id.M0(2131748856, null)));
        if (zArr[2]) {
            arrayList2.add(u90.b(32, org.telegram.messenger.id.N0("LiteOptionsBackground")));
            if (!org.telegram.messenger.g0.Q1()) {
                arrayList2.add(u90.b(64, org.telegram.messenger.id.N0("LiteOptionsTopics")));
            }
            arrayList2.add(u90.b(128, org.telegram.messenger.id.N0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.iz.o() < 1) {
                boolean z9 = org.telegram.messenger.r2.f25216a;
            } else {
                arrayList2.add(u90.b(256, org.telegram.messenger.id.N0("LiteOptionsBlur2")));
            }
            if (i7 >= 33) {
                if (org.telegram.messenger.iz.o() < 1) {
                    boolean z10 = org.telegram.messenger.r2.f25216a;
                } else {
                    arrayList2.add(u90.b(262144, org.telegram.messenger.id.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(u90.b(32768, org.telegram.messenger.id.N0("LiteOptionsScale")));
            if (org.telegram.ui.Components.dz0.c()) {
                arrayList2.add(u90.b(65536, org.telegram.messenger.id.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(u90.c(2131232021, 512, org.telegram.messenger.id.M0(2131748857, null)));
        arrayList2.add(u90.c(2131232040, 1024, org.telegram.messenger.id.M0(2131748860, null)));
        arrayList2.add(u90.c(2131232028, 2048, org.telegram.messenger.id.M0(2131748863, null)));
        arrayList2.add(u90.c(2131232527, 131072, org.telegram.messenger.id.M0(2131748853, null)));
        arrayList2.add(new u90(2, 0, "", 0, 0));
        arrayList2.add(new u90(5, 0, org.telegram.messenger.id.M0(2131748846, null), 0, 1));
        arrayList2.add(new u90(2, 0, org.telegram.messenger.id.N0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747066, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new xx(this, 12));
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f52334a = new FrameLayout(context);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f52335b = pj0Var;
        pj0Var.r1();
        org.telegram.ui.Components.pj0 pj0Var2 = this.f52335b;
        v4.b0 b0Var = new v4.b0();
        this.f52336c = b0Var;
        pj0Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.pj0 pj0Var3 = this.f52335b;
        org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(this, 2);
        this.d = yh0Var;
        pj0Var3.setAdapter(yh0Var);
        this.f52335b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.C = false;
        kVar.f57079m = false;
        this.f52335b.setItemAnimator(kVar);
        this.f52334a.addView(this.f52335b, c8.ha.c(-1.0f, -1));
        this.f52335b.setOnItemClickListener(new zr(this, 18));
        this.fragmentView = this.f52334a;
        if (org.telegram.messenger.g0.Q1()) {
            i7 = 360864;
        } else {
            i7 = 360928;
        }
        this.f52338f = i7;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z9;
        float f10;
        if (this.f52335b != null) {
            for (int i7 = 0; i7 < this.f52335b.getChildCount(); i7++) {
                View childAt = this.f52335b.getChildAt(i7);
                if (childAt != null) {
                    this.f52335b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f52341s;
                        if (R < arrayList.size()) {
                            u90 u90Var = (u90) arrayList.get(R);
                            int i10 = u90Var.f54543a;
                            if (i10 != 3 && i10 != 4) {
                                if (i10 == 1) {
                                    ((x90) childAt).a();
                                }
                            } else {
                                y90 y90Var = (y90) childAt;
                                ImageView imageView = y90Var.f51972e;
                                z90 z90Var = y90Var.D;
                                int i11 = u90Var.f50438e;
                                if (i10 == 3) {
                                    if (Integer.bitCount(i11) > 1) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    y90Var.f51977w = z9;
                                    if (z9) {
                                        y90Var.c(u90Var, true);
                                        int Z = z90Var.Z(i11);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (Z >= 0 && z90Var.f52339n[Z]) {
                                            f10 = 180.0f;
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        org.telegram.messenger.camera.q.l(animate.rotation(f10), org.telegram.ui.Components.wq.h, 240L);
                                    }
                                    y90Var.f51973f.c(org.telegram.messenger.sc.e(i11), true);
                                } else {
                                    y90Var.h.a(org.telegram.messenger.sc.e(i11), true);
                                }
                                y90Var.b(org.telegram.messenger.sc.f(), true);
                            }
                        }
                    }
                }
            }
            if (this.f52337e != null && !org.telegram.messenger.sc.f()) {
                this.f52337e.b();
                this.f52337e = null;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f52335b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.sc.f25458n;
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
        org.telegram.ui.Components.h5.t();
        org.telegram.ui.ActionBar.m6.u1(true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
