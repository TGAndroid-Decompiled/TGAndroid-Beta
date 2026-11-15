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
public final class x90 extends org.telegram.ui.ActionBar.e2 {
    public FrameLayout f53125a;
    public org.telegram.ui.Components.uj0 f53126b;
    public v4.b0 f53127c;
    public org.telegram.ui.Components.ci0 d;
    public org.telegram.ui.Components.xb f53128e;
    public int f53129f;
    public final r3 h;
    public final boolean[] f53130n;
    public final ArrayList f53131r;
    public final ArrayList f53132s;

    public x90() {
        super(null);
        this.h = new r3(this, 10);
        this.f53130n = new boolean[3];
        this.f53131r = new ArrayList();
        this.f53132s = new ArrayList();
    }

    public final int Z(int i7) {
        if (i7 == 3) {
            return 0;
        }
        if (i7 == 28700) {
            return 1;
        }
        if (i7 == this.f53129f) {
            return 2;
        }
        return -1;
    }

    public final void a0(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f53132s;
            if (i10 < arrayList.size()) {
                if (((s90) arrayList.get(i10)).f51162e == i7) {
                    this.f53126b.e1(new ai.r1(this, i10, 15), 700, true);
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
        this.f53130n[Z] = true;
        d0();
        c0();
    }

    public final void c0() {
        String a02;
        ArrayList arrayList = this.f53131r;
        arrayList.clear();
        ArrayList arrayList2 = this.f53132s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i7 = Build.VERSION.SDK_INT;
        arrayList2.add(new s90(1, 0, null, 0, 0));
        if (org.telegram.messenger.qc.c() <= 0) {
            a02 = org.telegram.messenger.hd.M0(2131748871, null);
        } else if (org.telegram.messenger.qc.c() >= 100) {
            a02 = org.telegram.messenger.hd.M0(2131748870, null);
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131748872, String.format("%d%%", Integer.valueOf(org.telegram.messenger.qc.c())));
        }
        arrayList2.add(new s90(2, 0, a02, 0, 0));
        arrayList2.add(new s90(0, 0, org.telegram.messenger.hd.M0(2131748848, null), 0, 0));
        arrayList2.add(s90.c(2131232039, 3, org.telegram.messenger.hd.M0(2131748850, null)));
        boolean[] zArr = this.f53130n;
        if (zArr[0]) {
            arrayList2.add(s90.b(1, org.telegram.messenger.hd.M0(2131748862, null)));
            arrayList2.add(s90.b(2, org.telegram.messenger.hd.M0(2131748864, null)));
        }
        arrayList2.add(s90.c(2131232037, 28700, org.telegram.messenger.hd.M0(2131748855, null)));
        if (zArr[1]) {
            arrayList2.add(s90.b(16388, org.telegram.messenger.hd.M0(2131748862, null)));
            arrayList2.add(s90.b(8200, org.telegram.messenger.hd.M0(2131748861, null)));
            arrayList2.add(s90.b(4112, org.telegram.messenger.hd.M0(2131748864, null)));
        }
        arrayList2.add(s90.c(2131232017, this.f53129f, org.telegram.messenger.hd.M0(2131748856, null)));
        if (zArr[2]) {
            arrayList2.add(s90.b(32, org.telegram.messenger.hd.N0("LiteOptionsBackground")));
            if (!org.telegram.messenger.g0.Q1()) {
                arrayList2.add(s90.b(64, org.telegram.messenger.hd.N0("LiteOptionsTopics")));
            }
            arrayList2.add(s90.b(128, org.telegram.messenger.hd.N0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.gz.o() < 1) {
                boolean z10 = org.telegram.messenger.r2.f26198a;
            } else {
                arrayList2.add(s90.b(256, org.telegram.messenger.hd.N0("LiteOptionsBlur2")));
            }
            if (i7 >= 33) {
                if (org.telegram.messenger.gz.o() < 1) {
                    boolean z11 = org.telegram.messenger.r2.f26198a;
                } else {
                    arrayList2.add(s90.b(262144, org.telegram.messenger.hd.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(s90.b(32768, org.telegram.messenger.hd.N0("LiteOptionsScale")));
            if (org.telegram.ui.Components.fz0.c()) {
                arrayList2.add(s90.b(65536, org.telegram.messenger.hd.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(s90.c(2131232021, 512, org.telegram.messenger.hd.M0(2131748857, null)));
        arrayList2.add(s90.c(2131232041, 1024, org.telegram.messenger.hd.M0(2131748860, null)));
        arrayList2.add(s90.c(2131232028, 2048, org.telegram.messenger.hd.M0(2131748863, null)));
        arrayList2.add(s90.c(2131232528, 131072, org.telegram.messenger.hd.M0(2131748853, null)));
        arrayList2.add(new s90(2, 0, "", 0, 0));
        arrayList2.add(new s90(5, 0, org.telegram.messenger.hd.M0(2131748846, null), 0, 1));
        arrayList2.add(new s90(2, 0, org.telegram.messenger.hd.N0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747066, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 13));
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f53125a = new FrameLayout(context);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f53126b = uj0Var;
        uj0Var.r1();
        org.telegram.ui.Components.uj0 uj0Var2 = this.f53126b;
        v4.b0 b0Var = new v4.b0();
        this.f53127c = b0Var;
        uj0Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.uj0 uj0Var3 = this.f53126b;
        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(this, 2);
        this.d = ci0Var;
        uj0Var3.setAdapter(ci0Var);
        this.f53126b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.C = false;
        kVar.f58564m = false;
        this.f53126b.setItemAnimator(kVar);
        this.f53125a.addView(this.f53126b, c8.ja.c(-1.0f, -1));
        this.f53126b.setOnItemClickListener(new zr(this, 18));
        this.fragmentView = this.f53125a;
        if (org.telegram.messenger.g0.Q1()) {
            i7 = 360864;
        } else {
            i7 = 360928;
        }
        this.f53129f = i7;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z10;
        float f10;
        if (this.f53126b != null) {
            for (int i7 = 0; i7 < this.f53126b.getChildCount(); i7++) {
                View childAt = this.f53126b.getChildAt(i7);
                if (childAt != null) {
                    this.f53126b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f53132s;
                        if (R < arrayList.size()) {
                            s90 s90Var = (s90) arrayList.get(R);
                            int i10 = s90Var.f56015a;
                            if (i10 != 3 && i10 != 4) {
                                if (i10 == 1) {
                                    ((v90) childAt).a();
                                }
                            } else {
                                w90 w90Var = (w90) childAt;
                                ImageView imageView = w90Var.f52506e;
                                x90 x90Var = w90Var.E;
                                int i11 = s90Var.f51162e;
                                if (i10 == 3) {
                                    if (Integer.bitCount(i11) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    w90Var.f52511w = z10;
                                    if (z10) {
                                        w90Var.c(s90Var, true);
                                        int Z = x90Var.Z(i11);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (Z >= 0 && x90Var.f53130n[Z]) {
                                            f10 = 180.0f;
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        org.telegram.messenger.i20.n(animate.rotation(f10), org.telegram.ui.Components.er.h, 240L);
                                    }
                                    w90Var.f52507f.c(org.telegram.messenger.qc.e(i11), true);
                                } else {
                                    w90Var.h.a(org.telegram.messenger.qc.e(i11), true);
                                }
                                w90Var.b(org.telegram.messenger.qc.f(), true);
                            }
                        }
                    }
                }
            }
            if (this.f53128e != null && !org.telegram.messenger.qc.f()) {
                this.f53128e.b();
                this.f53128e = null;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f53126b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.qc.f26077n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.qc.a(this.h);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qc.k();
        org.telegram.ui.Components.g5.t();
        org.telegram.ui.ActionBar.j6.u1(true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
