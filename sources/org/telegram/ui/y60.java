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
public final class y60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, View.OnClickListener, fe.e, hh.d {
    public final HashMap D;
    public final ArrayList E;
    public org.telegram.ui.Components.s20 F;
    public int G;
    public int H;
    public int I;
    public final fe.f f43732a;
    public org.telegram.ui.Components.f10 f43733b;
    public org.telegram.ui.ActionBar.p5 f43734c;
    public w60 d;
    public ScrollView e;
    public x60 f43735f;
    public org.telegram.ui.Components.tk0 h;
    public s4.a0 f43736n;
    public org.telegram.ui.Components.dw0 f43737r;
    public v60 f43738s;
    public ArrayList f43739w;
    public int f43740x;
    public boolean f43741y;

    public y60() {
        super(null);
        this.f43732a = new fe.f(3, this, org.telegram.ui.Components.gr.h, 350L, 0.0f);
        this.D = new HashMap();
        this.E = new ArrayList();
    }

    public static void Y(y60 y60Var, View view, int i10) {
        org.telegram.ui.Cells.s4 s4Var;
        org.telegram.messenger.f5 contact;
        boolean z10 = false;
        if (i10 == 0 && !y60Var.f43741y) {
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                String s10 = org.telegram.messenger.i5.r(y60Var.currentAccount).s(0);
                intent.putExtra("android.intent.extra.TEXT", s10);
                y60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, s10), 500);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } else if ((view instanceof org.telegram.ui.Cells.s4) && (contact = (s4Var = (org.telegram.ui.Cells.s4) view).getContact()) != null) {
            org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) y60Var.D.get(contact.f15509b);
            if (s20Var != null) {
                y60Var.f43735f.a(s20Var);
            } else {
                org.telegram.ui.Components.s20 s20Var2 = new org.telegram.ui.Components.s20(y60Var.getParentActivity(), null, contact, true, y60Var.resourceProvider);
                x60 x60Var = y60Var.f43735f;
                ArrayList arrayList = x60Var.f43454c;
                y60 y60Var2 = x60Var.f43455f;
                y60Var2.E.add(s20Var2);
                y60Var2.D.put(s20Var2.getKey(), s20Var2);
                AnimatorSet animatorSet = x60Var.f43452a;
                if (animatorSet != null) {
                    animatorSet.setupEndValues();
                    x60Var.f43452a.cancel();
                }
                x60Var.f43453b = false;
                AnimatorSet animatorSet2 = new AnimatorSet();
                x60Var.f43452a = animatorSet2;
                animatorSet2.addListener(new org.telegram.ui.Components.voip.h2(x60Var, 13));
                x60Var.f43452a.setInterpolator(org.telegram.ui.Components.gr.h);
                x60Var.f43452a.setDuration(320L);
                arrayList.clear();
                arrayList.add(ObjectAnimator.ofFloat(s20Var2, View.SCALE_X, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s20Var2, View.SCALE_Y, 0.75f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(s20Var2, View.ALPHA, 0.0f, 1.0f));
                x60Var.addView(s20Var2);
                y60Var2.e.post(new zy(x60Var, 15));
                s20Var2.setOnClickListener(y60Var);
            }
            y60Var.f43733b.e(!y60Var.E.isEmpty(), true);
            if (s20Var == null) {
                z10 = true;
            }
            org.telegram.ui.Components.ep epVar = s4Var.e;
            if (epVar != null) {
                epVar.a(z10, true);
            }
        }
    }

    public static void Z(y60 y60Var) {
        ArrayList arrayList = y60Var.E;
        try {
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                org.telegram.messenger.f5 contact = ((org.telegram.ui.Components.s20) arrayList.get(i11)).getContact();
                if (sb2.length() != 0) {
                    sb2.append(';');
                }
                sb2.append((String) contact.e.get(0));
                if (i11 == 0 && arrayList.size() == 1) {
                    i10 = contact.f15516l;
                }
            }
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + sb2.toString()));
            intent.putExtra("sms_body", org.telegram.messenger.i5.r(y60Var.currentAccount).s(i10));
            y60Var.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        y60Var.finishFragment();
    }

    public static org.telegram.ui.ActionBar.i5 a0(y60 y60Var) {
        return y60Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.i5 b0(y60 y60Var) {
        return y60Var.simpleActionBar;
    }

    public static void c0(y60 y60Var) {
        y60Var.f43741y = false;
        v60 v60Var = y60Var.f43738s;
        if (v60Var.h) {
            v60Var.h = false;
            v60Var.f();
        }
        y60Var.f43738s.E(null);
        y60Var.h.setFastScrollVisible(true);
        y60Var.h.setVerticalScrollBarEnabled(false);
        y60Var.f43737r.e(false, true);
        y60Var.f43737r.setStickerType(0);
        y60Var.f43737r.d.setText(org.telegram.messenger.cd.L0(2131748240, null));
        y60Var.f43737r.e.setText("");
    }

    @Override
    public final View R() {
        return this.fragmentView;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
    }

    @Override
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        int i11 = 0;
        this.f43741y = false;
        this.E.clear();
        this.D.clear();
        this.F = null;
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131749161, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 0));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(1, 2131232485);
        this.f43734c = b10;
        b10.setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
        org.telegram.ui.ActionBar.p5 p5Var = this.f43734c;
        p5Var.N();
        p5Var.B0 = new ag.l3(this, 13);
        this.f43734c.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        l0 l0Var = new l0(this, context, 11);
        this.fragmentView = l0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        x60 x60Var = new x60(this, context);
        this.f43735f = x60Var;
        this.e.addView(x60Var, w7.b6.c(-2.0f, -1));
        this.d = new w60(this, context);
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context, null);
        zzVar.setViewType(6);
        zzVar.f33274x = false;
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(context, zzVar, 0, null);
        this.f43737r = dw0Var;
        dw0Var.addView(zzVar, 0);
        this.f43737r.setAnimateLayoutChange(true);
        this.f43737r.d.setText(org.telegram.messenger.cd.L0(2131748240, null));
        this.f43737r.e.setText("");
        this.f43737r.e(org.telegram.messenger.i5.r(this.currentAccount).y(), true);
        this.f43736n = new s4.a0(1, false);
        this.f43738s = new v60(this, context);
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.h = tk0Var;
        tk0Var.r1();
        this.h.setSectionsDrawBackground(true);
        this.h.setEmptyView(this.f43737r);
        this.h.setAdapter(this.f43738s);
        this.h.setLayoutManager(this.f43736n);
        this.h.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.tk0 tk0Var2 = this.h;
        if (!org.telegram.messenger.cd.X) {
            i10 = 2;
        }
        tk0Var2.setVerticalScrollbarPosition(i10);
        l0Var.addView(this.h, w7.b6.c(-1.0f, -1));
        l0Var.addView(this.f43737r);
        this.h.setOnItemClickListener(new g(this, 15));
        this.h.setOnScrollListener(new h3(this, 17));
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        c2Var.f20203l = 180;
        c2Var.invalidateSelf();
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.f43733b = f10Var;
        f10Var.f25929c.setImageDrawable(c2Var);
        this.f43733b.e(false, false);
        this.f43733b.setContentDescription(org.telegram.messenger.cd.L0(2131748267, null));
        this.f43733b.setOnClickListener(new f50(this, 3));
        v60 v60Var = this.f43738s;
        if (v60Var != null && !this.f43741y) {
            int b11 = v60Var.b();
            org.telegram.ui.Components.dw0 dw0Var2 = this.f43737r;
            if (b11 != 2) {
                i11 = 4;
            }
            dw0Var2.setVisibility(i11);
        }
        l0Var.addView(this.d, w7.b6.d(-1, -2.0f, 48, 6.0f, 0.0f, 6.0f, 0.0f));
        l0Var.addView(this.f43733b, org.telegram.ui.Components.f10.b());
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.f33362h1.d.add(this);
        }
        return this.fragmentView;
    }

    public final void d0() {
        int i10;
        if (this.h == null) {
            return;
        }
        float f7 = this.f43732a.f7031f;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (f7 > 0.0f) {
            i10 = org.telegram.messenger.i0.L(4.0f) + ((int) f7);
        } else {
            i10 = 0;
        }
        ei.b.e(this.h, this.G, this.H, currentActionBarHeight + i10, 0);
        this.f43737r.setPadding(0, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.G, 0, this.H);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.dw0 dw0Var;
        if (i10 == org.telegram.messenger.zs.P) {
            e0();
        } else if (i10 == org.telegram.messenger.zs.O && (dw0Var = this.f43737r) != null) {
            dw0Var.e(false, true);
        }
    }

    public final void e0() {
        ArrayList arrayList = new ArrayList(org.telegram.messenger.i5.r(this.currentAccount).f16059a0);
        this.f43739w = arrayList;
        Collections.sort(arrayList, new f6(25));
        org.telegram.ui.Components.dw0 dw0Var = this.f43737r;
        if (dw0Var != null) {
            dw0Var.e(false, true);
        }
        v60 v60Var = this.f43738s;
        if (v60Var != null) {
            v60Var.f();
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.h;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21077l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21096m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21116n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 4, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 4, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21021i7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 4, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21059k7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 262148, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"statusTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21115n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f43735f, 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f43735f, 0, new Class[]{org.telegram.ui.Components.s20.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ri));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void l(r0.j1 j1Var) {
        int i10 = j1Var.f46132a.f(8).d;
        this.I = i10;
        org.telegram.ui.Components.f10 f10Var = this.f43733b;
        if (f10Var != null) {
            f10Var.setTranslationY(-Math.max(this.H, i10));
        }
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.s4 s4Var;
        org.telegram.messenger.f5 contact;
        org.telegram.ui.Components.s20 s20Var = (org.telegram.ui.Components.s20) view;
        if (s20Var.D) {
            this.F = null;
            this.f43735f.a(s20Var);
            this.f43733b.e(!this.E.isEmpty(), true);
            int childCount = this.h.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.h.getChildAt(i10);
                if ((childAt instanceof org.telegram.ui.Cells.s4) && (contact = (s4Var = (org.telegram.ui.Cells.s4) childAt).getContact()) != null) {
                    boolean containsKey = this.D.containsKey(contact.f15509b);
                    org.telegram.ui.Components.ep epVar = s4Var.e;
                    if (epVar != null) {
                        epVar.a(containsKey, true);
                    }
                }
            }
            return;
        }
        org.telegram.ui.Components.s20 s20Var2 = this.F;
        if (s20Var2 != null) {
            s20Var2.a();
        }
        this.F = s20Var;
        s20Var.b();
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.P);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.O);
        e0();
        if (!org.telegram.messenger.d20.i(this.currentAccount).H) {
            org.telegram.messenger.i5.r(this.currentAccount).l();
            org.telegram.messenger.d20.i(this.currentAccount).H = true;
            org.telegram.messenger.d20.i(this.currentAccount).v(false);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.P);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.O);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.G = i11;
        this.H = i13;
        d0();
        w60 w60Var = this.d;
        if (w60Var != null) {
            w60Var.setTranslationY(org.telegram.messenger.i0.L(4.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.G);
        }
        org.telegram.ui.Components.f10 f10Var = this.f43733b;
        if (f10Var != null) {
            f10Var.setTranslationY(-Math.max(this.H, this.I));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.tk0 tk0Var = this.h;
            if (tk0Var != null) {
                tk0Var.x1();
            }
            if (this.f43735f != null) {
                for (int i10 = 0; i10 < this.f43735f.getChildCount(); i10++) {
                    View childAt = this.f43735f.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.s20) {
                        childAt.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 3) {
            int paddingTop = this.h.getPaddingTop();
            this.d.invalidate();
            d0();
            int paddingTop2 = this.h.getPaddingTop();
            if (paddingTop2 != paddingTop) {
                this.h.scrollBy(0, paddingTop - paddingTop2);
            }
        }
    }

    @Override
    public final void P() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
