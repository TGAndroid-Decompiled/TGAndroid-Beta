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
public final class w90 extends org.telegram.ui.ActionBar.f2 {
    public FrameLayout f51030a;
    public org.telegram.ui.Components.pj0 f51031b;
    public v4.b0 f51032c;
    public org.telegram.ui.Components.yh0 d;
    public org.telegram.ui.Components.cc f51033e;
    public int f51034f;
    public final r3 h;
    public final boolean[] f51035n;
    public final ArrayList f51036r;
    public final ArrayList f51037s;

    public w90() {
        super(null);
        this.h = new r3(this, 10);
        this.f51035n = new boolean[3];
        this.f51036r = new ArrayList();
        this.f51037s = new ArrayList();
    }

    public final int Z(int i7) {
        if (i7 == 3) {
            return 0;
        }
        if (i7 == 28700) {
            return 1;
        }
        if (i7 == this.f51034f) {
            return 2;
        }
        return -1;
    }

    public final void a0(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f51037s;
            if (i10 < arrayList.size()) {
                if (((r90) arrayList.get(i10)).f49413e == i7) {
                    this.f51031b.e1(new l2.q(this, i10, 12), 700, true);
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
        this.f51035n[Z] = true;
        d0();
        c0();
    }

    public final void c0() {
        String a02;
        ArrayList arrayList = this.f51036r;
        arrayList.clear();
        ArrayList arrayList2 = this.f51037s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i7 = Build.VERSION.SDK_INT;
        arrayList2.add(new r90(1, 0, null, 0, 0));
        if (org.telegram.messenger.rc.c() <= 0) {
            a02 = org.telegram.messenger.hd.M0(2131748870, null);
        } else if (org.telegram.messenger.rc.c() >= 100) {
            a02 = org.telegram.messenger.hd.M0(2131748869, null);
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131748871, String.format("%d%%", Integer.valueOf(org.telegram.messenger.rc.c())));
        }
        arrayList2.add(new r90(2, 0, a02, 0, 0));
        arrayList2.add(new r90(0, 0, org.telegram.messenger.hd.M0(2131748847, null), 0, 0));
        arrayList2.add(r90.c(2131232038, 3, org.telegram.messenger.hd.M0(2131748849, null)));
        boolean[] zArr = this.f51035n;
        if (zArr[0]) {
            arrayList2.add(r90.b(1, org.telegram.messenger.hd.M0(2131748861, null)));
            arrayList2.add(r90.b(2, org.telegram.messenger.hd.M0(2131748863, null)));
        }
        arrayList2.add(r90.c(2131232037, 28700, org.telegram.messenger.hd.M0(2131748854, null)));
        if (zArr[1]) {
            arrayList2.add(r90.b(16388, org.telegram.messenger.hd.M0(2131748861, null)));
            arrayList2.add(r90.b(8200, org.telegram.messenger.hd.M0(2131748860, null)));
            arrayList2.add(r90.b(4112, org.telegram.messenger.hd.M0(2131748863, null)));
        }
        arrayList2.add(r90.c(2131232017, this.f51034f, org.telegram.messenger.hd.M0(2131748855, null)));
        if (zArr[2]) {
            arrayList2.add(r90.b(32, org.telegram.messenger.hd.N0("LiteOptionsBackground")));
            if (!org.telegram.messenger.g0.Q1()) {
                arrayList2.add(r90.b(64, org.telegram.messenger.hd.N0("LiteOptionsTopics")));
            }
            arrayList2.add(r90.b(128, org.telegram.messenger.hd.N0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.iz.o() < 1) {
                boolean z9 = org.telegram.messenger.r2.f25191a;
            } else {
                arrayList2.add(r90.b(256, org.telegram.messenger.hd.N0("LiteOptionsBlur2")));
            }
            if (i7 >= 33) {
                if (org.telegram.messenger.iz.o() < 1) {
                    boolean z10 = org.telegram.messenger.r2.f25191a;
                } else {
                    arrayList2.add(r90.b(262144, org.telegram.messenger.hd.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(r90.b(32768, org.telegram.messenger.hd.N0("LiteOptionsScale")));
            if (org.telegram.ui.Components.cz0.c()) {
                arrayList2.add(r90.b(65536, org.telegram.messenger.hd.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(r90.c(2131232021, 512, org.telegram.messenger.hd.M0(2131748856, null)));
        arrayList2.add(r90.c(2131232040, 1024, org.telegram.messenger.hd.M0(2131748859, null)));
        arrayList2.add(r90.c(2131232028, 2048, org.telegram.messenger.hd.M0(2131748862, null)));
        arrayList2.add(r90.c(2131232527, 131072, org.telegram.messenger.hd.M0(2131748852, null)));
        arrayList2.add(new r90(2, 0, "", 0, 0));
        arrayList2.add(new r90(5, 0, org.telegram.messenger.hd.M0(2131748845, null), 0, 1));
        arrayList2.add(new r90(2, 0, org.telegram.messenger.hd.N0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747065, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 12));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f51030a = new FrameLayout(context);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f51031b = pj0Var;
        pj0Var.r1();
        org.telegram.ui.Components.pj0 pj0Var2 = this.f51031b;
        v4.b0 b0Var = new v4.b0();
        this.f51032c = b0Var;
        pj0Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.pj0 pj0Var3 = this.f51031b;
        org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(this, 2);
        this.d = yh0Var;
        pj0Var3.setAdapter(yh0Var);
        this.f51031b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f56979m = false;
        this.f51031b.setItemAnimator(kVar);
        this.f51030a.addView(this.f51031b, c8.ha.c(-1.0f, -1));
        this.f51031b.setOnItemClickListener(new wr(this, 18));
        this.fragmentView = this.f51030a;
        if (org.telegram.messenger.g0.Q1()) {
            i7 = 360864;
        } else {
            i7 = 360928;
        }
        this.f51034f = i7;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z9;
        float f10;
        if (this.f51031b != null) {
            for (int i7 = 0; i7 < this.f51031b.getChildCount(); i7++) {
                View childAt = this.f51031b.getChildAt(i7);
                if (childAt != null) {
                    this.f51031b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f51037s;
                        if (R < arrayList.size()) {
                            r90 r90Var = (r90) arrayList.get(R);
                            int i10 = r90Var.f54440a;
                            if (i10 != 3 && i10 != 4) {
                                if (i10 == 1) {
                                    ((u90) childAt).a();
                                }
                            } else {
                                v90 v90Var = (v90) childAt;
                                ImageView imageView = v90Var.f50620e;
                                w90 w90Var = v90Var.D;
                                int i11 = r90Var.f49413e;
                                if (i10 == 3) {
                                    if (Integer.bitCount(i11) > 1) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    v90Var.f50625w = z9;
                                    if (z9) {
                                        v90Var.c(r90Var, true);
                                        int Z = w90Var.Z(i11);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (Z >= 0 && w90Var.f51035n[Z]) {
                                            f10 = 180.0f;
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        org.telegram.messenger.camera.q.l(animate.rotation(f10), org.telegram.ui.Components.xq.h, 240L);
                                    }
                                    v90Var.f50621f.c(org.telegram.messenger.rc.e(i11), true);
                                } else {
                                    v90Var.h.a(org.telegram.messenger.rc.e(i11), true);
                                }
                                v90Var.b(org.telegram.messenger.rc.f(), true);
                            }
                        }
                    }
                }
            }
            if (this.f51033e != null && !org.telegram.messenger.rc.f()) {
                this.f51033e.b();
                this.f51033e = null;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f51031b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.rc.f25264n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.rc.a(this.h);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.rc.k();
        org.telegram.ui.Components.i5.t();
        org.telegram.ui.ActionBar.k6.u1(true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
