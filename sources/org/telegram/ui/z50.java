package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
public final class z50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, View.OnClickListener, te.b, rh.c {
    public final HashMap D;
    public final ArrayList E;
    public org.telegram.ui.Components.c20 F;
    public int G;
    public int H;
    public int I;
    public final te.c f52470a;
    public org.telegram.ui.Components.p00 f52471b;
    public org.telegram.ui.ActionBar.f5 f52472c;
    public x50 d;
    public ScrollView f52473e;
    public y50 f52474f;
    public org.telegram.ui.Components.pj0 h;
    public v4.b0 f52475n;
    public org.telegram.ui.Components.av0 f52476r;
    public w50 f52477s;
    public ArrayList f52478w;
    public int f52479x;
    public boolean f52480y;

    public z50() {
        super(null);
        this.f52470a = new te.c(3, this, org.telegram.ui.Components.xq.h, 350L, 0.0f);
        this.D = new HashMap();
        this.E = new ArrayList();
    }

    public static void Z(z50 z50Var, View view, int i7) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        boolean z9 = false;
        if (i7 == 0 && !z50Var.f52480y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s5 = org.telegram.messenger.g5.r(z50Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s5);
                z50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s5), 500);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if ((view instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) view).getContact()) != null) {
            org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) z50Var.D.get(contact.f21957b);
            if (c20Var != null) {
                z50Var.f52474f.a(c20Var);
            } else {
                org.telegram.ui.Components.c20 c20Var2 = new org.telegram.ui.Components.c20(z50Var.getParentActivity(), null, contact, true, z50Var.resourceProvider);
                y50 y50Var = z50Var.f52474f;
                ArrayList arrayList = y50Var.f52074c;
                z50 z50Var2 = y50Var.f52076f;
                z50Var2.E.add(c20Var2);
                z50Var2.D.put(c20Var2.getKey(), c20Var2);
                AnimatorSet animatorSet = y50Var.f52072a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    y50Var.f52072a.cancel();
                }
                y50Var.f52073b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                y50Var.f52072a = animatorSet2;
                animatorSet2.addListener(new d30(y50Var, 2));
                y50Var.f52072a.setInterpolator(org.telegram.ui.Components.xq.h);
                y50Var.f52072a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(c20Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(c20Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(c20Var2, View.ALPHA, 0.0f, 1.0f));
                y50Var.addView(c20Var2);
                z50Var2.f52473e.post(new hz(y50Var, 15));
                c20Var2.setOnClickListener(z50Var);
            }
            z50Var.f52471b.e(!z50Var.E.isEmpty(), true);
            if (c20Var == null) {
                z9 = true;
            }
            org.telegram.ui.Components.wo woVar = q4Var.f30123e;
            if (woVar != null) {
                woVar.a(z9, true);
            }
        }
    }

    public static void a0(z50 z50Var) {
        ArrayList arrayList = z50Var.E;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.d5 contact = ((org.telegram.ui.Components.c20) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.f21959e.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i7 = contact.f21965l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", org.telegram.messenger.g5.r(z50Var.currentAccount).s(i7));
            z50Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        z50Var.finishFragment();
    }

    public static org.telegram.ui.ActionBar.y4 b0(z50 z50Var) {
        return z50Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.y4 c0(z50 z50Var) {
        return z50Var.simpleActionBar;
    }

    public static void d0(z50 z50Var) {
        z50Var.f52480y = false;
        w50 w50Var = z50Var.f52477s;
        if (w50Var.h) {
            w50Var.h = false;
            w50Var.f();
        }
        z50Var.f52477s.E(null);
        z50Var.h.setFastScrollVisible(true);
        z50Var.h.setVerticalScrollBarEnabled(false);
        z50Var.f52476r.e(false, true);
        z50Var.f52476r.setStickerType(0);
        z50Var.f52476r.d.setText(org.telegram.messenger.hd.M0(2131748222, null));
        z50Var.f52476r.f31917e.setText("");
    }

    @Override
    public final View R() {
        return this.fragmentView;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            e0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28240y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        int i10 = 0;
        this.f52480y = false;
        this.E.clear();
        this.D.clear();
        this.F = null;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749150, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 9));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(1, 2131232486);
        this.f52472c = b10;
        b10.setContentDescription(org.telegram.messenger.hd.M0(2131745837, null));
        org.telegram.ui.ActionBar.f5 f5Var = this.f52472c;
        f5Var.N();
        f5Var.B0 = new kg.v1(this, 13);
        this.f52472c.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        k0 k0Var = new k0(11, context, this);
        this.fragmentView = k0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f52473e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.f52473e.setClipToPadding(false);
        y50 y50Var = new y50(this, context);
        this.f52474f = y50Var;
        this.f52473e.addView(y50Var, c8.ha.c(-2.0f, -1));
        this.d = new x50(this, context);
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        lzVar.setViewType(6);
        lzVar.f35802x = false;
        org.telegram.ui.Components.av0 av0Var = new org.telegram.ui.Components.av0(context, lzVar, 0, null);
        this.f52476r = av0Var;
        av0Var.addView(lzVar, 0);
        this.f52476r.setAnimateLayoutChange(true);
        this.f52476r.d.setText(org.telegram.messenger.hd.M0(2131748222, null));
        this.f52476r.f31917e.setText("");
        this.f52476r.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.f52475n = new v4.b0(1, false);
        this.f52477s = new w50(this, context);
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.h = pj0Var;
        pj0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.f52476r);
        this.h.setAdapter(this.f52477s);
        this.h.setLayoutManager(this.f52475n);
        this.h.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.pj0 pj0Var2 = this.h;
        if (!org.telegram.messenger.hd.f22871a0) {
            i7 = 2;
        }
        pj0Var2.setVerticalScrollbarPosition(i7);
        k0Var.addView(this.h, c8.ha.c(-1.0f, -1));
        k0Var.addView(this.f52476r);
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new g3(this, 17));
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        y1Var.f28772l = 180;
        y1Var.invalidateSelf();
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, this.resourceProvider, false);
        this.f52471b = p00Var;
        p00Var.f36831c.setImageDrawable(y1Var);
        this.f52471b.e(false, false);
        this.f52471b.setContentDescription(org.telegram.messenger.hd.M0(2131748249, null));
        this.f52471b.setOnClickListener(new g40(this, 3));
        w50 w50Var = this.f52477s;
        if (w50Var != null && !this.f52480y) {
            int b11 = w50Var.b();
            org.telegram.ui.Components.av0 av0Var2 = this.f52476r;
            if (b11 != 2) {
                i10 = 4;
            }
            av0Var2.setVisibility(i10);
        }
        k0Var.addView(this.d, c8.ha.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        k0Var.addView(this.f52471b, org.telegram.ui.Components.p00.b());
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.f41237f1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.av0 av0Var;
        if (i7 == org.telegram.messenger.qs.P) {
            f0();
        } else if (i7 == org.telegram.messenger.qs.O && (av0Var = this.f52476r) != null) {
            av0Var.e(false, true);
        }
    }

    public final void e0() {
        int i7;
        if (this.h == null) {
            return;
        }
        float f10 = this.f52470a.f55376f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (f10 > 0.0f) {
            i7 = org.telegram.messenger.g0.L(4.0f) + ((int) f10);
        } else {
            i7 = 0;
        }
        oi.a.e(this.h, this.G, this.H, currentActionBarHeight + i7, 0);
        this.f52476r.setPadding(0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.G, 0, this.H);
    }

    public final void f0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.g5.r(this.currentAccount).f22575a0);
        this.f52478w = arrayList;
        Collections.sort(arrayList, new oe(25));
        org.telegram.ui.Components.av0 av0Var = this.f52476r;
        if (av0Var != null) {
            av0Var.e(false, true);
        }
        w50 w50Var = this.f52477s;
        if (w50Var != null) {
            w50Var.f();
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27996l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28014m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28031n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27978k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 262148, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28030n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52474f, 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52474f, 0, new Class[]{org.telegram.ui.Components.c20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ri));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void m(r0.k1 k1Var) {
        int i7 = k1Var.f54084a.f(8).d;
        this.I = i7;
        org.telegram.ui.Components.p00 p00Var = this.f52471b;
        if (p00Var != null) {
            p00Var.setTranslationY(-Math.max(this.H, i7));
        }
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) view;
        if (c20Var.D) {
            this.F = null;
            this.f52474f.a(c20Var);
            this.f52471b.e(!this.E.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.h.getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) childAt).getContact()) != null) {
                    boolean containsKey = this.D.containsKey(contact.f21957b);
                    org.telegram.ui.Components.wo woVar = q4Var.f30123e;
                    if (woVar != null) {
                        woVar.a(containsKey, true);
                    }
                }
            }
            return;
        }
        org.telegram.ui.Components.c20 c20Var2 = this.F;
        if (c20Var2 != null) {
            c20Var2.a();
        }
        this.F = c20Var;
        c20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.P);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.O);
        f0();
        if (!org.telegram.messenger.p10.i(this.currentAccount).H) {
            org.telegram.messenger.g5.r(this.currentAccount).l();
            org.telegram.messenger.p10.i(this.currentAccount).H = true;
            org.telegram.messenger.p10.i(this.currentAccount).v(false);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.P);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.O);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.G = i10;
        this.H = i12;
        e0();
        x50 x50Var = this.d;
        if (x50Var != null) {
            x50Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.G);
        }
        org.telegram.ui.Components.p00 p00Var = this.f52471b;
        if (p00Var != null) {
            p00Var.setTranslationY(-Math.max(this.H, this.I));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.pj0 pj0Var = this.h;
            if (pj0Var != null) {
                pj0Var.x1();
            }
            if (this.f52474f != null) {
                for (int i7 = 0; i7 < this.f52474f.getChildCount(); i7++) {
                    View childAt = this.f52474f.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.c20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
