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
public final class t90 extends org.telegram.ui.ActionBar.d2 {
    public FrameLayout f49741a;
    public org.telegram.ui.Components.tj0 f49742b;
    public u4.b0 f49743c;
    public org.telegram.ui.Components.bi0 d;
    public org.telegram.ui.Components.ac f49744e;
    public int f49745f;
    public final s3 h;
    public final boolean[] f49746n;
    public final ArrayList f49747r;
    public final ArrayList f49748s;

    public t90() {
        super(null);
        this.h = new s3(this, 10);
        this.f49746n = new boolean[3];
        this.f49747r = new ArrayList();
        this.f49748s = new ArrayList();
    }

    public final int Z(int i3) {
        if (i3 == 3) {
            return 0;
        }
        if (i3 == 28700) {
            return 1;
        }
        if (i3 == this.f49745f) {
            return 2;
        }
        return -1;
    }

    public final void a0(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49748s;
            if (i10 < arrayList.size()) {
                if (((o90) arrayList.get(i10)).f48238e == i3) {
                    this.f49742b.e1(new k2.q(this, i10, 13), 700, true);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void b0(int i3) {
        int Z = Z(i3);
        if (Z == -1) {
            return;
        }
        this.f49746n[Z] = true;
        d0();
        c0();
    }

    public final void c0() {
        String a02;
        ArrayList arrayList = this.f49747r;
        arrayList.clear();
        ArrayList arrayList2 = this.f49748s;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i3 = Build.VERSION.SDK_INT;
        arrayList2.add(new o90(1, 0, null, 0, 0));
        if (org.telegram.messenger.lc.c() <= 0) {
            a02 = org.telegram.messenger.bd.M0(2131748879, null);
        } else if (org.telegram.messenger.lc.c() >= 100) {
            a02 = org.telegram.messenger.bd.M0(2131748878, null);
        } else {
            a02 = org.telegram.messenger.bd.a0(null, null, 2131748880, String.format("%d%%", Integer.valueOf(org.telegram.messenger.lc.c())));
        }
        arrayList2.add(new o90(2, 0, a02, 0, 0));
        arrayList2.add(new o90(0, 0, org.telegram.messenger.bd.M0(2131748856, null), 0, 0));
        arrayList2.add(o90.c(2131232038, 3, org.telegram.messenger.bd.M0(2131748858, null)));
        boolean[] zArr = this.f49746n;
        if (zArr[0]) {
            arrayList2.add(o90.b(1, org.telegram.messenger.bd.M0(2131748870, null)));
            arrayList2.add(o90.b(2, org.telegram.messenger.bd.M0(2131748872, null)));
        }
        arrayList2.add(o90.c(2131232037, 28700, org.telegram.messenger.bd.M0(2131748863, null)));
        if (zArr[1]) {
            arrayList2.add(o90.b(16388, org.telegram.messenger.bd.M0(2131748870, null)));
            arrayList2.add(o90.b(8200, org.telegram.messenger.bd.M0(2131748869, null)));
            arrayList2.add(o90.b(4112, org.telegram.messenger.bd.M0(2131748872, null)));
        }
        arrayList2.add(o90.c(2131232017, this.f49745f, org.telegram.messenger.bd.M0(2131748864, null)));
        if (zArr[2]) {
            arrayList2.add(o90.b(32, org.telegram.messenger.bd.N0("LiteOptionsBackground")));
            if (!org.telegram.messenger.g0.Q1()) {
                arrayList2.add(o90.b(64, org.telegram.messenger.bd.N0("LiteOptionsTopics")));
            }
            arrayList2.add(o90.b(128, org.telegram.messenger.bd.N0("LiteOptionsSpoiler")));
            if (org.telegram.messenger.az.o() < 1) {
                boolean z10 = org.telegram.messenger.r2.f25040a;
            } else {
                arrayList2.add(o90.b(256, org.telegram.messenger.bd.N0("LiteOptionsBlur2")));
            }
            if (i3 >= 33) {
                if (org.telegram.messenger.az.o() < 1) {
                    boolean z11 = org.telegram.messenger.r2.f25040a;
                } else {
                    arrayList2.add(o90.b(262144, org.telegram.messenger.bd.N0("LiteOptionsLiquidGlass")));
                }
            }
            arrayList2.add(o90.b(32768, org.telegram.messenger.bd.N0("LiteOptionsScale")));
            if (org.telegram.ui.Components.cz0.c()) {
                arrayList2.add(o90.b(65536, org.telegram.messenger.bd.N0("LiteOptionsThanos")));
            }
        }
        arrayList2.add(o90.c(2131232021, 512, org.telegram.messenger.bd.M0(2131748865, null)));
        arrayList2.add(o90.c(2131232040, 1024, org.telegram.messenger.bd.M0(2131748868, null)));
        arrayList2.add(o90.c(2131232028, 2048, org.telegram.messenger.bd.M0(2131748871, null)));
        arrayList2.add(o90.c(2131232527, 131072, org.telegram.messenger.bd.M0(2131748861, null)));
        arrayList2.add(new o90(2, 0, "", 0, 0));
        arrayList2.add(new o90(5, 0, org.telegram.messenger.bd.M0(2131748854, null), 0, 1));
        arrayList2.add(new o90(2, 0, org.telegram.messenger.bd.N0("LiteSmoothTransitionsInfo"), 0, 0));
        this.d.E(arrayList, arrayList2);
    }

    @Override
    public final View createView(Context context) {
        int i3;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747074, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 13));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        this.f49741a = new FrameLayout(context);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f49742b = tj0Var;
        tj0Var.r1();
        org.telegram.ui.Components.tj0 tj0Var2 = this.f49742b;
        u4.b0 b0Var = new u4.b0();
        this.f49743c = b0Var;
        tj0Var2.setLayoutManager(b0Var);
        org.telegram.ui.Components.tj0 tj0Var3 = this.f49742b;
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(this, 2);
        this.d = bi0Var;
        tj0Var3.setAdapter(bi0Var);
        this.f49742b.setSectionsDrawBackground(true);
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f55567m = false;
        this.f49742b.setItemAnimator(kVar);
        this.f49741a.addView(this.f49742b, b8.mf.c(-1.0f, -1));
        this.f49742b.setOnItemClickListener(new ur(this, 18));
        this.fragmentView = this.f49741a;
        if (org.telegram.messenger.g0.Q1()) {
            i3 = 360864;
        } else {
            i3 = 360928;
        }
        this.f49745f = i3;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        boolean z10;
        float f10;
        if (this.f49742b != null) {
            for (int i3 = 0; i3 < this.f49742b.getChildCount(); i3++) {
                View childAt = this.f49742b.getChildAt(i3);
                if (childAt != null) {
                    this.f49742b.getClass();
                    int R = RecyclerView.R(childAt);
                    if (R >= 0) {
                        ArrayList arrayList = this.f49748s;
                        if (R < arrayList.size()) {
                            o90 o90Var = (o90) arrayList.get(R);
                            int i10 = o90Var.f54715a;
                            if (i10 != 3 && i10 != 4) {
                                if (i10 == 1) {
                                    ((r90) childAt).a();
                                }
                            } else {
                                s90 s90Var = (s90) childAt;
                                ImageView imageView = s90Var.f49443e;
                                t90 t90Var = s90Var.E;
                                int i11 = o90Var.f48238e;
                                if (i10 == 3) {
                                    if (Integer.bitCount(i11) > 1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    s90Var.f49448w = z10;
                                    if (z10) {
                                        s90Var.c(o90Var, true);
                                        int Z = t90Var.Z(i11);
                                        imageView.clearAnimation();
                                        ViewPropertyAnimator animate = imageView.animate();
                                        if (Z >= 0 && t90Var.f49746n[Z]) {
                                            f10 = 180.0f;
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        org.telegram.messenger.camera.q.l(animate.rotation(f10), org.telegram.ui.Components.xq.h, 240L);
                                    }
                                    s90Var.f49444f.c(org.telegram.messenger.lc.e(i11), true);
                                } else {
                                    s90Var.h.a(org.telegram.messenger.lc.e(i11), true);
                                }
                                s90Var.b(org.telegram.messenger.lc.f(), true);
                            }
                        }
                    }
                }
            }
            if (this.f49744e != null && !org.telegram.messenger.lc.f()) {
                this.f49744e.b();
                this.f49744e = null;
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f49742b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        HashSet hashSet = org.telegram.messenger.lc.f23973n;
        if (hashSet != null) {
            hashSet.remove(this.h);
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        org.telegram.messenger.lc.a(this.h);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.lc.k();
        org.telegram.ui.Components.g5.t();
        org.telegram.ui.ActionBar.k6.u1(true);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
