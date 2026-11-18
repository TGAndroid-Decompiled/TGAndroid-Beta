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
public final class z90 extends org.telegram.ui.ActionBar.h2 {
    public FrameLayout f54455a;
    public org.telegram.ui.Components.ck0 f54456b;
    public v4.c0 f54457c;
    public org.telegram.ui.Components.li0 d;
    public org.telegram.ui.Components.gc f54458e;
    public int f54459f;
    public final r3 h;
    public final boolean[] f54460n;
    public final ArrayList f54461r;
    public final ArrayList f54462s;

    public z90() {
        super(null);
        this.h = new r3(this, 11);
        this.f54460n = new boolean[3];
        this.f54461r = new ArrayList();
        this.f54462s = new ArrayList();
    }

    public final int Z(int i7) {
        if (i7 == 3) {
            return 0;
        }
        if (i7 == 28700) {
            return 1;
        }
        if (i7 == this.f54459f) {
            return 2;
        }
        return -1;
    }

    public final void a0(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f54462s;
            if (i10 < arrayList.size()) {
                if (((u90) arrayList.get(i10)).f52466e == i7) {
                    this.f54456b.e1(new ai.s1(this, i10, 15), 700, true);
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
        this.f54460n[Z] = true;
        d0();
        c0();
    }

    public final void c0() {
        String a02;
        ArrayList arrayList = this.f54461r;
        arrayList.clear();
        ArrayList arrayList2 = this.f54462s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i7 = Build.VERSION.SDK_INT;
        arrayList2.add(new u90(1, 0, null, 0, 0));
        if (org.telegram.messenger.pc.c() <= 0) {
            a02 = org.telegram.messenger.gd.M0(2131748679, null);
        } else if (org.telegram.messenger.pc.c() >= 100) {
            a02 = org.telegram.messenger.gd.M0(2131748678, null);
        } else {
            a02 = org.telegram.messenger.gd.a0(null, null, 2131748680, String.format("%d%%", Integer.valueOf(org.telegram.messenger.pc.c())));
        }
        arrayList2.add(new u90(2, 0, a02, 0, 0));
        arrayList2.add(new u90(0, 0, org.telegram.messenger.gd.M0(2131748656, null), 0, 0));
        arrayList2.add(u90.c(2131232040, 3, org.telegram.messenger.gd.M0(2131748658, null)));
        boolean[] zArr = this.f54460n;
        if (zArr[0]) {
            arrayList2.add(u90.b(1, org.telegram.messenger.gd.M0(2131748670, null)));
            arrayList2.add(u90.b(2, org.telegram.messenger.gd.M0(2131748672, null)));
        }
        arrayList2.add(u90.c(2131232038, 28700, org.telegram.messenger.gd.M0(2131748663, null)));
        if (zArr[1]) {
            arrayList2.add(u90.b(16388, org.telegram.messenger.gd.M0(2131748670, null)));
            arrayList2.add(u90.b(8200, org.telegram.messenger.gd.M0(2131748669, null)));
            arrayList2.add(u90.b(4112, org.telegram.messenger.gd.M0(2131748672, null)));
        }
        arrayList2.add(u90.c(2131232018, this.f54459f, org.telegram.messenger.gd.M0(2131748664, null)));
        if (zArr[2]) {
            arrayList2.add(u90.b(32, org.telegram.messenger.gd.N0("LiteOptionsBackground")));
            if (!org.telegram.messenger.g0.Q1()) {
                arrayList2.add(u90.b(64, org.telegram.messenger.gd.N0("LiteOptionsTopics")));
            }
            arrayList2.add(u90.b(128, org.telegram.messenger.gd.N0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.bz.o() < 1) {
                boolean z10 = org.telegram.messenger.s2.f26721a;
            } else {
                arrayList2.add(u90.b(256, org.telegram.messenger.gd.N0("LiteOptionsBlur2")));
            }
            if (i7 >= 33) {
                if (org.telegram.messenger.bz.o() < 1) {
                    boolean z11 = org.telegram.messenger.s2.f26721a;
                } else {
                    arrayList2.add(u90.b(262144, org.telegram.messenger.gd.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(u90.b(32768, org.telegram.messenger.gd.N0("LiteOptionsScale")));
            if (org.telegram.ui.Components.mz0.c()) {
                arrayList2.add(u90.b(65536, org.telegram.messenger.gd.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(u90.c(2131232022, 512, org.telegram.messenger.gd.M0(2131748665, null)));
        arrayList2.add(u90.c(2131232042, 1024, org.telegram.messenger.gd.M0(2131748668, null)));
        arrayList2.add(u90.c(2131232029, 2048, org.telegram.messenger.gd.M0(2131748671, null)));
        arrayList2.add(u90.c(2131232529, 131072, org.telegram.messenger.gd.M0(2131748661, null)));
        arrayList2.add(new u90(2, 0, "", 0, 0));
        arrayList2.add(new u90(5, 0, org.telegram.messenger.gd.M0(2131748654, null), 0, 1));
        arrayList2.add(new u90(2, 0, org.telegram.messenger.gd.N0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131746873, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 15));
        org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f54455a = new FrameLayout(context);
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f54456b = ck0Var;
        ck0Var.r1();
        org.telegram.ui.Components.ck0 ck0Var2 = this.f54456b;
        v4.c0 c0Var = new v4.c0();
        this.f54457c = c0Var;
        ck0Var2.setLayoutManager(c0Var);
        org.telegram.ui.Components.ck0 ck0Var3 = this.f54456b;
        org.telegram.ui.Components.li0 li0Var = new org.telegram.ui.Components.li0(this, 2);
        this.d = li0Var;
        ck0Var3.setAdapter(li0Var);
        this.f54456b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.lr.h);
        kVar.C = false;
        kVar.f59152m = false;
        this.f54456b.setItemAnimator(kVar);
        this.f54455a.addView(this.f54456b, c8.ma.c(-1.0f, -1));
        this.f54456b.setOnItemClickListener(new zr(this, 18));
        this.fragmentView = this.f54455a;
        if (org.telegram.messenger.g0.Q1()) {
            i7 = 360864;
        } else {
            i7 = 360928;
        }
        this.f54459f = i7;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z10;
        float f10;
        if (this.f54456b != null) {
            for (int i7 = 0; i7 < this.f54456b.getChildCount(); i7++) {
                View childAt = this.f54456b.getChildAt(i7);
                if (childAt != null) {
                    this.f54456b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f54462s;
                        if (R < arrayList.size()) {
                            u90 u90Var = (u90) arrayList.get(R);
                            int i10 = u90Var.f56589a;
                            if (i10 != 3 && i10 != 4) {
                                if (i10 == 1) {
                                    ((x90) childAt).a();
                                }
                            } else {
                                y90 y90Var = (y90) childAt;
                                ImageView imageView = y90Var.f54041e;
                                z90 z90Var = y90Var.E;
                                int i11 = u90Var.f52466e;
                                if (i10 == 3) {
                                    if (Integer.bitCount(i11) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    y90Var.f54046w = z10;
                                    if (z10) {
                                        y90Var.c(u90Var, true);
                                        int Z = z90Var.Z(i11);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (Z >= 0 && z90Var.f54460n[Z]) {
                                            f10 = 180.0f;
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        org.telegram.messenger.n10.o(animate.rotation(f10), org.telegram.ui.Components.lr.h, 240L);
                                    }
                                    y90Var.f54042f.c(org.telegram.messenger.pc.e(i11), true);
                                } else {
                                    y90Var.h.a(org.telegram.messenger.pc.e(i11), true);
                                }
                                y90Var.b(org.telegram.messenger.pc.f(), true);
                            }
                        }
                    }
                }
            }
            if (this.f54458e != null && !org.telegram.messenger.pc.f()) {
                this.f54458e.b();
                this.f54458e = null;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f54456b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.pc.f26224n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.pc.a(this.h);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.pc.k();
        org.telegram.ui.Components.o5.t();
        org.telegram.ui.ActionBar.n6.u1(true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
