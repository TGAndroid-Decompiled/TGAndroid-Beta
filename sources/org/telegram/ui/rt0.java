package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class rt0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public final int E;
    public org.telegram.ui.Components.ek0 f51883a;
    public v4.c0 f51884b;
    public qt0 f51885c;
    public org.telegram.ui.Components.sy d;
    public int f51886e;
    public int f51887f;
    public int h;
    public int f51888n;
    public int f51889r;
    public int f51890s;
    public int f51891w;
    public int f51892x;
    public final boolean f51893y;

    public rt0() {
        super(null);
        this.E = 1;
        this.f51893y = true;
    }

    public final void Z(Long l10, View view) {
        boolean z10;
        boolean z11;
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(this, view);
        int i7 = 0;
        I.X(new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false)));
        int i10 = this.E;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        I.l(0, org.telegram.messenger.gd.N0(2131743664, null), new mp0(11, this, l10), z10);
        if (i10 != 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i10 == 0) {
            i7 = 2131232420;
        }
        I.m(i7, new pt0(this, l10), org.telegram.messenger.gd.N0(2131746125, null), z11, true);
        I.V = 190;
        I.a0();
    }

    public final void a0() {
        this.f51886e = 0;
        this.f51887f = -1;
        this.f51888n = -1;
        this.h = -1;
        this.f51892x = -1;
        if (!this.f51893y || getMessagesController().I0 >= 0) {
            int i7 = this.f51886e;
            int i10 = i7 + 1;
            this.f51886e = i10;
            this.f51887f = i7;
            int i11 = this.E;
            if (i11 == 1) {
                this.f51886e = i7 + 2;
                this.h = i10;
            }
            if (i11 == 1) {
                int size = getMessagesController().H0.size();
                if (size != 0) {
                    if (i11 == 1) {
                        int i12 = this.f51886e;
                        this.f51886e = i12 + 1;
                        this.f51888n = i12;
                    }
                    int i13 = this.f51886e;
                    this.f51889r = i13;
                    int i14 = i13 + size;
                    this.f51890s = i14;
                    int i15 = i14 + 1;
                    this.f51886e = i15;
                    this.f51891w = i14;
                    if (i11 != 1) {
                        this.f51886e = i14 + 2;
                        this.f51892x = i15;
                    }
                } else {
                    this.f51888n = -1;
                    this.f51889r = -1;
                    this.f51890s = -1;
                    this.f51891w = -1;
                    this.f51892x = -1;
                }
            } else {
                throw null;
            }
        }
        qt0 qt0Var = this.f51885c;
        if (qt0Var != null) {
            qt0Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29786v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29767u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29616m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        int i7 = 2;
        int i10 = this.E;
        if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131753678, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131750717, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748097, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new gs0(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sy syVar = new org.telegram.ui.Components.sy(context, null);
        this.d = syVar;
        if (i10 == 1) {
            syVar.setText(org.telegram.messenger.gd.N0(2131748046, null));
        } else {
            syVar.setText(org.telegram.messenger.gd.N0(2131748030, null));
        }
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f51883a = ek0Var;
        ek0Var.r1();
        this.f51883a.setItemSelectorColorProvider(new ot0(this));
        this.f51883a.setSectionsDrawBackground(true);
        this.f51883a.setEmptyView(this.d);
        org.telegram.ui.Components.ek0 ek0Var2 = this.f51883a;
        v4.c0 c0Var = new v4.c0(1, false);
        this.f51884b = c0Var;
        ek0Var2.setLayoutManager(c0Var);
        this.f51883a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.ek0 ek0Var3 = this.f51883a;
        qt0 qt0Var = new qt0(this, context);
        this.f51885c = qt0Var;
        ek0Var3.setAdapter(qt0Var);
        org.telegram.ui.Components.ek0 ek0Var4 = this.f51883a;
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 1;
        }
        ek0Var4.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f51883a, c8.na.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.na.c(-1.0f, -1));
        this.f51883a.setOnItemClickListener(new h(this, 27));
        this.f51883a.setOnItemLongClickListener(new ot0(this));
        if (i10 == 1) {
            this.f51883a.setOnScrollListener(new g3(this, 27));
            if (getMessagesController().I0 < 0) {
                this.d.b();
            } else {
                this.d.c();
            }
        }
        a0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.ek0 ek0Var;
        if (i7 == org.telegram.messenger.ks.f25276r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.mp.I8;
            if (((intValue & 2) != 0 || (intValue & 1) != 0) && (ek0Var = this.f51883a) != null) {
                int childCount = ek0Var.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = this.f51883a.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.b5) {
                        ((org.telegram.ui.Cells.b5) childAt).d(intValue);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25215g0) {
            this.d.c();
            a0();
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f51883a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(17, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f51883a, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.o4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29434c7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29525h6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f51883a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.f29843y6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f51883a, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.f29633n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25276r);
        if (this.E == 1) {
            org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25215g0);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25276r);
        if (this.E == 1) {
            org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25215g0);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        qt0 qt0Var = this.f51885c;
        if (qt0Var != null) {
            qt0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.sy syVar = this.d;
            if (syVar != null) {
                syVar.setProgressBarColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29525h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
