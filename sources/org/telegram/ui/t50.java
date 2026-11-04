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
public final class t50 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, View.OnClickListener, qe.b, sh.c {
    public final HashMap E;
    public final ArrayList F;
    public org.telegram.ui.Components.y10 G;
    public int H;
    public int I;
    public int J;
    public final qe.c f49700a;
    public org.telegram.ui.Components.l00 f49701b;
    public org.telegram.ui.ActionBar.f5 f49702c;
    public r50 d;
    public ScrollView f49703e;
    public s50 f49704f;
    public org.telegram.ui.Components.tj0 h;
    public u4.b0 f49705n;
    public org.telegram.ui.Components.zu0 f49706r;
    public q50 f49707s;
    public ArrayList f49708w;
    public int f49709x;
    public boolean f49710y;

    public t50() {
        super(null);
        this.f49700a = new qe.c(3, this, org.telegram.ui.Components.xq.h, 350L, 0.0f);
        this.E = new HashMap();
        this.F = new ArrayList();
    }

    public static void Z(t50 t50Var, View view, int i3) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        boolean z10 = false;
        if (i3 == 0 && !t50Var.f49710y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s6 = org.telegram.messenger.g5.r(t50Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s6);
                t50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s6), 500);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if ((view instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) view).getContact()) != null) {
            org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) t50Var.E.get(contact.f22148b);
            if (y10Var != null) {
                t50Var.f49704f.a(y10Var);
            } else {
                org.telegram.ui.Components.y10 y10Var2 = new org.telegram.ui.Components.y10(t50Var.getParentActivity(), null, contact, true, t50Var.resourceProvider);
                s50 s50Var = t50Var.f49704f;
                ArrayList arrayList = s50Var.f49366c;
                t50 t50Var2 = s50Var.f49368f;
                t50Var2.F.add(y10Var2);
                t50Var2.E.put(y10Var2.getKey(), y10Var2);
                AnimatorSet animatorSet = s50Var.f49364a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    s50Var.f49364a.cancel();
                }
                s50Var.f49365b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                s50Var.f49364a = animatorSet2;
                animatorSet2.addListener(new y20(s50Var, 2));
                s50Var.f49364a.setInterpolator(org.telegram.ui.Components.xq.h);
                s50Var.f49364a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(y10Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(y10Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(y10Var2, View.ALPHA, 0.0f, 1.0f));
                s50Var.addView(y10Var2);
                t50Var2.f49703e.post(new fz(s50Var, 14));
                y10Var2.setOnClickListener(t50Var);
            }
            t50Var.f49701b.e(!t50Var.F.isEmpty(), true);
            if (y10Var == null) {
                z10 = true;
            }
            org.telegram.ui.Components.wo woVar = q4Var.f30200e;
            if (woVar != null) {
                woVar.a(z10, true);
            }
        }
    }

    public static void a0(t50 t50Var) {
        ArrayList arrayList = t50Var.F;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i3 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.d5 contact = ((org.telegram.ui.Components.y10) arrayList.get(i10)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.f22150e.get(0));
                if (i10 == 0 && arrayList.size() == 1) {
                    i3 = contact.f22156l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", org.telegram.messenger.g5.r(t50Var.currentAccount).s(i3));
            t50Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        t50Var.finishFragment();
    }

    public static org.telegram.ui.ActionBar.y4 b0(t50 t50Var) {
        return t50Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.y4 c0(t50 t50Var) {
        return t50Var.simpleActionBar;
    }

    public static void d0(t50 t50Var) {
        t50Var.f49710y = false;
        q50 q50Var = t50Var.f49707s;
        if (q50Var.h) {
            q50Var.h = false;
            q50Var.f();
        }
        t50Var.f49707s.E(null);
        t50Var.h.setFastScrollVisible(true);
        t50Var.h.setVerticalScrollBarEnabled(false);
        t50Var.f49706r.e(false, true);
        t50Var.f49706r.setStickerType(0);
        t50Var.f49706r.d.setText(org.telegram.messenger.bd.M0(2131748231, null));
        t50Var.f49706r.f41128e.setText("");
    }

    @Override
    public final View R() {
        return this.fragmentView;
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 3) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
    }

    @Override
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        int i10 = 0;
        this.f49710y = false;
        this.F.clear();
        this.E.clear();
        this.G = null;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131749159, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 10));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(1, 2131232486);
        this.f49702c = b10;
        b10.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        org.telegram.ui.ActionBar.f5 f5Var = this.f49702c;
        f5Var.N();
        f5Var.C0 = new lg.w1(this, 13);
        this.f49702c.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        l0 l0Var = new l0(11, context, this);
        this.fragmentView = l0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f49703e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.f49703e.setClipToPadding(false);
        s50 s50Var = new s50(this, context);
        this.f49704f = s50Var;
        this.f49703e.addView(s50Var, b8.mf.c(-2.0f, -1));
        this.d = new r50(this, context);
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        izVar.setViewType(6);
        izVar.f34869x = false;
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, izVar, 0, null);
        this.f49706r = zu0Var;
        zu0Var.addView(izVar, 0);
        this.f49706r.setAnimateLayoutChange(true);
        this.f49706r.d.setText(org.telegram.messenger.bd.M0(2131748231, null));
        this.f49706r.f41128e.setText("");
        this.f49706r.e(org.telegram.messenger.g5.r(this.currentAccount).y(), true);
        this.f49705n = new u4.b0(1, false);
        this.f49707s = new q50(this, context);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.h = tj0Var;
        tj0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.f49706r);
        this.h.setAdapter(this.f49707s);
        this.h.setLayoutManager(this.f49705n);
        this.h.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.tj0 tj0Var2 = this.h;
        if (!org.telegram.messenger.bd.f21784a0) {
            i3 = 2;
        }
        tj0Var2.setVerticalScrollbarPosition(i3);
        l0Var.addView(this.h, b8.mf.c(-1.0f, -1));
        l0Var.addView(this.f49706r);
        this.h.setOnItemClickListener(new h(this, 15));
        this.h.setOnScrollListener(new h3(this, 17));
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        w1Var.f28773l = 180;
        w1Var.invalidateSelf();
        org.telegram.ui.Components.l00 l00Var = new org.telegram.ui.Components.l00(context, this.resourceProvider, false);
        this.f49701b = l00Var;
        l00Var.f35530c.setImageDrawable(w1Var);
        this.f49701b.e(false, false);
        this.f49701b.setContentDescription(org.telegram.messenger.bd.M0(2131748258, null));
        this.f49701b.setOnClickListener(new b40(this, 3));
        q50 q50Var = this.f49707s;
        if (q50Var != null && !this.f49710y) {
            int b11 = q50Var.b();
            org.telegram.ui.Components.zu0 zu0Var2 = this.f49706r;
            if (b11 != 2) {
                i10 = 4;
            }
            zu0Var2.setVisibility(i10);
        }
        l0Var.addView(this.d, b8.mf.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        l0Var.addView(this.f49701b, org.telegram.ui.Components.l00.b());
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null) {
            launchActivity.f41300i1.d.add(this);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.ui.Components.zu0 zu0Var;
        if (i3 == org.telegram.messenger.hs.P) {
            f0();
        } else if (i3 == org.telegram.messenger.hs.O && (zu0Var = this.f49706r) != null) {
            zu0Var.e(false, true);
        }
    }

    public final void e0() {
        int i3;
        if (this.h == null) {
            return;
        }
        float f10 = this.f49700a.f53846f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (f10 > 0.0f) {
            i3 = org.telegram.messenger.g0.L(4.0f) + ((int) f10);
        } else {
            i3 = 0;
        }
        pi.a.e(this.h, this.H, this.I, currentActionBarHeight + i3, 0);
        this.f49706r.setPadding(0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.H, 0, this.I);
    }

    public final void f0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.g5.r(this.currentAccount).f22646b0);
        this.f49708w = arrayList;
        Collections.sort(arrayList, new org.telegram.ui.Components.d80(13));
        org.telegram.ui.Components.zu0 zu0Var = this.f49706r;
        if (zu0Var != null) {
            zu0Var.e(false, true);
        }
        q50 q50Var = this.f49707s;
        if (q50Var != null) {
            q50Var.f();
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28027l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28044m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28063n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27973i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 4, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28008k7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 262148, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28062n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49704f, 0, new Class[]{org.telegram.ui.Components.y10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f49704f, 0, new Class[]{org.telegram.ui.Components.y10.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ri));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void m(r0.k1 k1Var) {
        int i3 = k1Var.f54026a.f(8).d;
        this.J = i3;
        org.telegram.ui.Components.l00 l00Var = this.f49701b;
        if (l00Var != null) {
            l00Var.setTranslationY(-Math.max(this.I, i3));
        }
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.messenger.d5 contact;
        org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) view;
        if (y10Var.E) {
            this.G = null;
            this.f49704f.a(y10Var);
            this.f49701b.e(!this.F.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.h.getChildAt(i3);
                if ((childAt instanceof org.telegram.ui.Cells.q4) && (contact = (q4Var = (org.telegram.ui.Cells.q4) childAt).getContact()) != null) {
                    boolean containsKey = this.E.containsKey(contact.f22148b);
                    org.telegram.ui.Components.wo woVar = q4Var.f30200e;
                    if (woVar != null) {
                        woVar.a(containsKey, true);
                    }
                }
            }
            return;
        }
        org.telegram.ui.Components.y10 y10Var2 = this.G;
        if (y10Var2 != null) {
            y10Var2.a();
        }
        this.G = y10Var;
        y10Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.P);
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.O);
        f0();
        if (!org.telegram.messenger.h10.i(this.currentAccount).I) {
            org.telegram.messenger.g5.r(this.currentAccount).l();
            org.telegram.messenger.h10.i(this.currentAccount).I = true;
            org.telegram.messenger.h10.i(this.currentAccount).v(false);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.P);
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.O);
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.H = i10;
        this.I = i12;
        e0();
        r50 r50Var = this.d;
        if (r50Var != null) {
            r50Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.H);
        }
        org.telegram.ui.Components.l00 l00Var = this.f49701b;
        if (l00Var != null) {
            l00Var.setTranslationY(-Math.max(this.I, this.J));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.tj0 tj0Var = this.h;
            if (tj0Var != null) {
                tj0Var.x1();
            }
            if (this.f49704f != null) {
                for (int i3 = 0; i3 < this.f49704f.getChildCount(); i3++) {
                    View childAt = this.f49704f.getChildAt(i3);
                    if (childAt instanceof org.telegram.ui.Components.y10) {
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
    public final void F(float f10, int i3) {
    }
}
