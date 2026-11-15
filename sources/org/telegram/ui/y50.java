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
public final class y50 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, View.OnClickListener, te.b, rh.c {
    public final HashMap E;
    public final ArrayList F;
    public org.telegram.ui.Components.f20 G;
    public int H;
    public int I;
    public int J;
    public final te.c f53417a;
    public org.telegram.ui.Components.t00 f53418b;
    public org.telegram.ui.ActionBar.d5 f53419c;
    public w50 d;
    public ScrollView f53420e;
    public x50 f53421f;
    public org.telegram.ui.Components.uj0 h;
    public v4.b0 f53422n;
    public org.telegram.ui.Components.cv0 f53423r;
    public v50 f53424s;
    public ArrayList f53425w;
    public int f53426x;
    public boolean f53427y;

    public y50() {
        super(null);
        this.f53417a = new te.c(3, this, org.telegram.ui.Components.er.h, 350L, 0.0f);
        this.E = new HashMap();
        this.F = new ArrayList();
    }

    public static void Z(y50 y50Var, View view, int i7) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        boolean z10 = false;
        if (i7 == 0 && !y50Var.f53427y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s5 = org.telegram.messenger.g5.r(y50Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s5);
                y50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s5), 500);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if ((view instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) view).getContact()) != null) {
            org.telegram.ui.Components.f20 f20Var = (org.telegram.ui.Components.f20) y50Var.E.get(contact.f23032b);
            if (f20Var != null) {
                y50Var.f53421f.a(f20Var);
            } else {
                org.telegram.ui.Components.f20 f20Var2 = new org.telegram.ui.Components.f20(y50Var.getParentActivity(), null, contact, true, y50Var.resourceProvider);
                x50 x50Var = y50Var.f53421f;
                ArrayList arrayList = x50Var.f53100c;
                y50 y50Var2 = x50Var.f53102f;
                y50Var2.F.add(f20Var2);
                y50Var2.E.put(f20Var2.getKey(), f20Var2);
                AnimatorSet animatorSet = x50Var.f53098a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    x50Var.f53098a.cancel();
                }
                x50Var.f53099b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                x50Var.f53098a = animatorSet2;
                animatorSet2.addListener(new xx(x50Var, 3));
                x50Var.f53098a.setInterpolator(org.telegram.ui.Components.er.h);
                x50Var.f53098a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(f20Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(f20Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(f20Var2, View.ALPHA, 0.0f, 1.0f));
                x50Var.addView(f20Var2);
                y50Var2.f53420e.post(new iz(x50Var, 15));
                f20Var2.setOnClickListener(y50Var);
            }
            y50Var.f53418b.e(!y50Var.F.isEmpty(), true);
            if (f20Var == null) {
                z10 = true;
            }
            org.telegram.ui.Components.fp fpVar = q4Var.f31276e;
            if (fpVar != null) {
                fpVar.a(z10, true);
            }
        }
    }

    public static void a0(y50 y50Var) {
        ArrayList arrayList = y50Var.F;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.d5 contact = ((org.telegram.ui.Components.f20) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.f23034e.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i7 = contact.f23040l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", org.telegram.messenger.g5.r(y50Var.currentAccount).s(i7));
            y50Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        y50Var.finishFragment();
    }

    public static org.telegram.ui.ActionBar.w4 b0(y50 y50Var) {
        return y50Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.w4 c0(y50 y50Var) {
        return y50Var.simpleActionBar;
    }

    public static void d0(y50 y50Var) {
        y50Var.f53427y = false;
        v50 v50Var = y50Var.f53424s;
        if (v50Var.h) {
            v50Var.h = false;
            v50Var.f();
        }
        y50Var.f53424s.E(null);
        y50Var.h.setFastScrollVisible(true);
        y50Var.h.setVerticalScrollBarEnabled(false);
        y50Var.f53423r.e(false, true);
        y50Var.f53423r.setStickerType(0);
        y50Var.f53423r.d.setText(org.telegram.messenger.hd.M0(2131748223, null));
        y50Var.f53423r.f33707e.setText("");
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
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
    public final View S() {
        return this.fragmentView;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        int i10 = 0;
        this.f53427y = false;
        this.F.clear();
        this.E.clear();
        this.G = null;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749151, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 10));
        org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(1, 2131232487);
        this.f53419c = b10;
        b10.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        org.telegram.ui.ActionBar.d5 d5Var = this.f53419c;
        d5Var.O();
        d5Var.C0 = new kg.x1(this, 13);
        this.f53419c.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        k0 k0Var = new k0(11, context, this);
        this.fragmentView = k0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f53420e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.f53420e.setClipToPadding(false);
        x50 x50Var = new x50(this, context);
        this.f53421f = x50Var;
        this.f53420e.addView(x50Var, c8.ja.c(-2.0f, -1));
        this.d = new w50(this, context);
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        pzVar.setViewType(6);
        pzVar.f38448x = false;
        org.telegram.ui.Components.cv0 cv0Var = new org.telegram.ui.Components.cv0(context, pzVar, 0, null);
        this.f53423r = cv0Var;
        cv0Var.addView(pzVar, 0);
        this.f53423r.setAnimateLayoutChange(true);
        this.f53423r.d.setText(org.telegram.messenger.hd.M0(2131748223, null));
        this.f53423r.f33707e.setText("");
        this.f53423r.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.f53422n = new v4.b0(1, false);
        this.f53424s = new v50(this, context);
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.h = uj0Var;
        uj0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.f53423r);
        this.h.setAdapter(this.f53424s);
        this.h.setLayoutManager(this.f53422n);
        this.h.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.uj0 uj0Var2 = this.h;
        if (!org.telegram.messenger.hd.f24101a0) {
            i7 = 2;
        }
        uj0Var2.setVerticalScrollbarPosition(i7);
        k0Var.addView(this.h, c8.ja.c(-1.0f, -1));
        k0Var.addView(this.f53423r);
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new g3(this, 17));
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        x1Var.f29865l = 180;
        x1Var.invalidateSelf();
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
        this.f53418b = t00Var;
        t00Var.f39467c.setImageDrawable(x1Var);
        this.f53418b.e(false, false);
        this.f53418b.setContentDescription(org.telegram.messenger.hd.M0(2131748250, null));
        this.f53418b.setOnClickListener(new g40(this, 3));
        v50 v50Var = this.f53424s;
        if (v50Var != null && !this.f53427y) {
            int b11 = v50Var.b();
            org.telegram.ui.Components.cv0 cv0Var2 = this.f53423r;
            if (b11 != 2) {
                i10 = 4;
            }
            cv0Var2.setVisibility(i10);
        }
        k0Var.addView(this.d, c8.ja.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        k0Var.addView(this.f53418b, org.telegram.ui.Components.t00.b());
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.f42635g1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.Components.cv0 cv0Var;
        if (i7 == org.telegram.messenger.ns.P) {
            f0();
        } else if (i7 == org.telegram.messenger.ns.O && (cv0Var = this.f53423r) != null) {
            cv0Var.e(false, true);
        }
    }

    public final void e0() {
        int i7;
        if (this.h == null) {
            return;
        }
        float f10 = this.f53417a.f57087f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (f10 > 0.0f) {
            i7 = org.telegram.messenger.g0.L(4.0f) + ((int) f10);
        } else {
            i7 = 0;
        }
        ri.a.e(this.h, this.H, this.I, currentActionBarHeight + i7, 0);
        this.f53423r.setPadding(0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.H, 0, this.I);
    }

    public final void f0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.g5.r(this.currentAccount).f23672b0);
        this.f53425w = arrayList;
        Collections.sort(arrayList, new me(25));
        org.telegram.ui.Components.cv0 cv0Var = this.f53423r;
        if (cv0Var != null) {
            cv0Var.e(false, true);
        }
        v50 v50Var = this.f53424s;
        if (v50Var != null) {
            v50Var.f();
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28997l7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29015m7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29032n7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ri));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28979k7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 262148, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29031n6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f53421f, 0, new Class[]{org.telegram.ui.Components.f20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f53421f, 0, new Class[]{org.telegram.ui.Components.f20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ui));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void m(r0.k1 k1Var) {
        int i7 = k1Var.f55682a.f(8).d;
        this.J = i7;
        org.telegram.ui.Components.t00 t00Var = this.f53418b;
        if (t00Var != null) {
            t00Var.setTranslationY(-Math.max(this.I, i7));
        }
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        org.telegram.ui.Components.f20 f20Var = (org.telegram.ui.Components.f20) view;
        if (f20Var.E) {
            this.G = null;
            this.f53421f.a(f20Var);
            this.f53418b.e(!this.F.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.h.getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) childAt).getContact()) != null) {
                    boolean containsKey = this.E.containsKey(contact.f23032b);
                    org.telegram.ui.Components.fp fpVar = q4Var.f31276e;
                    if (fpVar != null) {
                        fpVar.a(containsKey, true);
                    }
                }
            }
            return;
        }
        org.telegram.ui.Components.f20 f20Var2 = this.G;
        if (f20Var2 != null) {
            f20Var2.a();
        }
        this.G = f20Var;
        f20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.P);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.O);
        f0();
        if (!org.telegram.messenger.m10.i(this.currentAccount).I) {
            org.telegram.messenger.g5.r(this.currentAccount).l();
            org.telegram.messenger.m10.i(this.currentAccount).I = true;
            org.telegram.messenger.m10.i(this.currentAccount).v(false);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.P);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.O);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.H = i10;
        this.I = i12;
        e0();
        w50 w50Var = this.d;
        if (w50Var != null) {
            w50Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.H);
        }
        org.telegram.ui.Components.t00 t00Var = this.f53418b;
        if (t00Var != null) {
            t00Var.setTranslationY(-Math.max(this.I, this.J));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.uj0 uj0Var = this.h;
            if (uj0Var != null) {
                uj0Var.x1();
            }
            if (this.f53421f != null) {
                for (int i7 = 0; i7 < this.f53421f.getChildCount(); i7++) {
                    View childAt = this.f53421f.getChildAt(i7);
                    if (childAt instanceof org.telegram.ui.Components.f20) {
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
    public final void Q() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
