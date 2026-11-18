package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class qm0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public final boolean E;
    public final boolean F;
    public final bn G;
    public int H;
    public boolean I;
    public org.telegram.ui.ActionBar.h1 J;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public org.telegram.ui.ActionBar.z0[] L;
    public FrameLayout M;
    public org.telegram.ui.Components.wt N;
    public k0 O;
    public ImageView P;
    public om0 Q;
    public uv R;
    public View S;
    public final TextPaint T;
    public final RectF U;
    public final Paint V;
    public pm0 W;
    public CharSequence f51245a;
    public final HashMap f51246b;
    public final ArrayList f51247c;
    public ArrayList d;
    public boolean f51248e;
    public int f51249f;
    public org.telegram.ui.Components.ck0 h;
    public l4 f51250n;
    public FrameLayout f51251r;
    public TextView f51252s;
    public boolean f51253w;
    public final int f51254x;
    public boolean f51255y;

    public qm0(int i7, boolean z10, boolean z11, bn bnVar) {
        super(null);
        this.f51246b = new HashMap();
        this.f51247c = new ArrayList();
        this.d = null;
        this.f51248e = false;
        this.f51249f = 2;
        this.f51255y = true;
        this.I = true;
        this.T = new TextPaint(1);
        this.U = new RectF();
        this.V = new Paint(1);
        this.G = bnVar;
        this.f51254x = i7;
        this.E = z10;
        this.F = z11;
    }

    public static void Z(qm0 qm0Var, org.telegram.messenger.ue ueVar) {
        if (ueVar != null) {
            cn0 cn0Var = new cn0(0, ueVar, qm0Var.f51246b, qm0Var.f51247c, qm0Var.f51254x, qm0Var.F, qm0Var.G, false);
            Editable text = qm0Var.N.getText();
            qm0Var.f51245a = text;
            cn0Var.d = text;
            org.telegram.ui.Components.wt wtVar = cn0Var.f46545e0;
            if (wtVar != null) {
                wtVar.setText(text);
            }
            cn0Var.f46563t0 = new f(qm0Var, 29);
            cn0Var.k0(qm0Var.H, qm0Var.I);
            qm0Var.presentFragment(cn0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (qm0Var.E) {
            fn0 fn0Var = new fn0(hashMap, arrayList, qm0Var.f51254x, qm0Var.F, qm0Var.G);
            Editable text2 = qm0Var.N.getText();
            qm0Var.f51245a = text2;
            cn0 cn0Var2 = fn0Var.f47723a;
            if (cn0Var2 != null) {
                cn0Var2.d = text2;
                org.telegram.ui.Components.wt wtVar2 = cn0Var2.f46545e0;
                if (wtVar2 != null) {
                    wtVar2.setText(text2);
                }
            }
            nm0 nm0Var = new nm0(qm0Var, hashMap, arrayList, 1);
            cn0 cn0Var3 = fn0Var.f47723a;
            cn0Var3.f46563t0 = nm0Var;
            cn0 cn0Var4 = fn0Var.f47724b;
            cn0Var4.f46563t0 = nm0Var;
            cn0Var3.f46564u0 = new dn0(fn0Var, 1);
            cn0Var4.f46564u0 = new dn0(fn0Var, 2);
            int i7 = qm0Var.H;
            boolean z10 = qm0Var.I;
            cn0Var3.k0(i7, z10);
            fn0Var.f47724b.k0(i7, z10);
            qm0Var.presentFragment(fn0Var);
            return;
        }
        cn0 cn0Var5 = new cn0(0, ueVar, hashMap, arrayList, qm0Var.f51254x, qm0Var.F, qm0Var.G, false);
        Editable text3 = qm0Var.N.getText();
        qm0Var.f51245a = text3;
        cn0Var5.d = text3;
        org.telegram.ui.Components.wt wtVar3 = cn0Var5.f46545e0;
        if (wtVar3 != null) {
            wtVar3.setText(text3);
        }
        cn0Var5.f46563t0 = new nm0(qm0Var, hashMap, arrayList, 0);
        cn0Var5.k0(qm0Var.H, qm0Var.I);
        qm0Var.presentFragment(cn0Var5);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z10, int i7) {
        if (!hashMap.isEmpty() && this.W != null && !this.f51253w) {
            this.f51253w = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = hashMap.get(arrayList.get(i10));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                String str = null;
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    String str2 = efVar.h;
                    if (str2 != null) {
                        obj2.f28211c = str2;
                    } else {
                        obj2.f28211c = efVar.I;
                    }
                    obj2.f28212e = efVar.f27848c;
                    obj2.f28213f = efVar.f27851g;
                    obj2.f28217k = efVar.f27862s;
                    obj2.f28221o = efVar.f27847b;
                    CharSequence charSequence = efVar.f27846a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f28215i = efVar.f27857n;
                    obj2.f28216j = efVar.f27861r;
                    obj2.h = efVar.f27866x;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    String str3 = hfVar.h;
                    if (str3 != null) {
                        obj2.f28211c = str3;
                    } else {
                        obj2.f28218l = hfVar;
                    }
                    obj2.f28212e = hfVar.f27848c;
                    obj2.f28213f = hfVar.f27851g;
                    obj2.f28217k = hfVar.f27862s;
                    CharSequence charSequence2 = hfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f28215i = hfVar.f27857n;
                    obj2.f28216j = hfVar.f27861r;
                    obj2.h = hfVar.f27866x;
                    TLRPC.BotInlineResult botInlineResult = hfVar.N;
                    if (botInlineResult != null && hfVar.H == 1) {
                        obj2.f28219m = botInlineResult;
                        obj2.f28220n = hfVar.O;
                    }
                    System.currentTimeMillis();
                }
            }
            this.W.d(arrayList2);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29398da));
    }

    public final void b0(boolean z10) {
        boolean z11;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float L;
        if (this.M.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        FrameLayout frameLayout = this.M;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.N.getEditText().isFocused()) {
            org.telegram.messenger.g0.v1(this.N.getEditText());
        }
        this.N.k(true);
        if (z10) {
            this.M.setVisibility(0);
            this.O.setVisibility(0);
        } else {
            this.M.setVisibility(4);
            this.O.setVisibility(4);
        }
        k0 k0Var = this.O;
        float f14 = 0.2f;
        float f15 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        k0Var.setScaleX(f10);
        k0 k0Var2 = this.O;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.2f;
        }
        k0Var2.setScaleY(f11);
        k0 k0Var3 = this.O;
        float f16 = 0.0f;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        k0Var3.setAlpha(f12);
        uv uvVar = this.R;
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.2f;
        }
        uvVar.setScaleX(f13);
        uv uvVar2 = this.R;
        if (z10) {
            f14 = 1.0f;
        }
        uvVar2.setScaleY(f14);
        uv uvVar3 = this.R;
        if (!z10) {
            f15 = 0.0f;
        }
        uvVar3.setAlpha(f15);
        FrameLayout frameLayout2 = this.M;
        if (z10) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(48.0f);
        }
        frameLayout2.setTranslationY(L);
        View view = this.S;
        if (!z10) {
            f16 = org.telegram.messenger.g0.L(48.0f);
        }
        view.setTranslationY(f16);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.f29467h5;
        org.telegram.ui.ActionBar.u6.h(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.n6.f29502j5;
        org.telegram.ui.ActionBar.u6.l(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.I5, null);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 25));
        org.telegram.ui.ActionBar.z t6 = this.actionBar.t();
        if (this.f51255y) {
            t6.a(2, 2131232488).setContentDescription(org.telegram.messenger.gd.M0(2131745641, null));
        }
        org.telegram.ui.ActionBar.r0 a10 = t6.a(0, 2131231244);
        a10.setContentDescription(org.telegram.messenger.gd.M0(2131754839, null));
        a10.e(1, 2131232267, org.telegram.messenger.gd.M0(2131747603, null));
        om0 om0Var = new om0(this, context);
        this.Q = om0Var;
        org.telegram.ui.ActionBar.u6.h(i7, om0Var, null);
        this.fragmentView = this.Q;
        this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131750468, null));
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.h = ck0Var;
        ck0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new v4.c0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.Q.addView(this.h, c8.ma.e(-1, -1, 51));
        org.telegram.ui.Components.ck0 ck0Var2 = this.h;
        l4 l4Var = new l4(13, this, context);
        this.f51250n = l4Var;
        ck0Var2.setAdapter(l4Var);
        org.telegram.ui.ActionBar.u6.H(this.h, i7, null);
        TextView textView = new TextView(context);
        this.f51252s = textView;
        textView.setTextColor(-8355712);
        this.f51252s.setTextSize(1, 20.0f);
        this.f51252s.setGravity(17);
        this.f51252s.setVisibility(8);
        this.f51252s.setText(org.telegram.messenger.gd.M0(2131747988, null));
        this.Q.addView(this.f51252s, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f51252s.setOnTouchListener(new gi.a(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51251r = frameLayout;
        frameLayout.setVisibility(8);
        this.Q.addView(this.f51251r, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f51251r.addView(radialProgressView, c8.ma.e(-2, -2, 17));
        View view = new View(context);
        this.S = view;
        view.setBackgroundResource(2131231238);
        this.S.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.S, c8.ma.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        org.telegram.ui.ActionBar.u6.h(i7, frameLayout2, null);
        this.M.setVisibility(4);
        this.M.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.M, c8.ma.e(-1, 48, 83));
        this.M.setOnTouchListener(new gi.a(2));
        org.telegram.ui.Components.wt wtVar = this.N;
        if (wtVar != null) {
            wtVar.o();
        }
        this.N = new org.telegram.ui.Components.wt(context, this.Q, null, 1, false, null);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).J0())});
        this.N.setHint(org.telegram.messenger.gd.M0(2131754452, null));
        org.telegram.ui.Components.mt editText = this.N.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.M.addView(this.N, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f51245a;
        if (charSequence != null) {
            this.N.setText(charSequence);
        }
        k0 k0Var = new k0(17, context, this);
        this.O = k0Var;
        k0Var.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        this.O.setVisibility(4);
        this.O.setScaleX(0.2f);
        this.O.setScaleY(0.2f);
        this.O.setAlpha(0.0f);
        this.Q.addView(this.O, c8.ma.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.P = new ImageView(context);
        this.P.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.S5, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T5, false)));
        this.P.setImageResource(2131230876);
        this.P.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.u6.s(this.P, org.telegram.ui.ActionBar.n6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.P.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setOutlineProvider(new bg.q0(19));
        this.O.addView(this.P, c8.ma.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.P.setOnClickListener(new j40(this, 18));
        this.P.setOnLongClickListener(new t(this, 3));
        TextPaint textPaint = this.T;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        uv uvVar = new uv(4, context, this);
        this.R = uvVar;
        uvVar.setAlpha(0.0f);
        this.R.setScaleX(0.2f);
        this.R.setScaleY(0.2f);
        this.Q.addView(this.R, c8.ma.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f51254x != 0) {
            this.N.setVisibility(8);
        }
        if (this.f51248e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f51251r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f51251r.setVisibility(8);
            this.h.setEmptyView(this.f51252s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25180r2) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i11 = this.f51254x;
                if (i11 != 1 && i11 != 2 && i11 != 10 && this.f51255y) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f51251r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.ck0 ck0Var = this.h;
                if (ck0Var != null && ck0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f51252s);
                }
                l4 l4Var = this.f51250n;
                if (l4Var != null) {
                    l4Var.f();
                }
                this.f51248e = false;
            }
        } else if (i7 == org.telegram.messenger.ks.f25190t) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.N;
        if (wtVar != null && wtVar.f41789e) {
            if (z10) {
                wtVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.ck0 ck0Var = this.h;
        if (ck0Var != null) {
            ck0Var.getViewTreeObserver().addOnPreDrawListener(new d7(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7 = this.f51254x;
        boolean z10 = true;
        if (i7 != 1 && i7 != 2 && i7 != 10 && this.f51255y) {
            this.d = MediaController.f22688c2;
        } else {
            this.d = MediaController.d2;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.f51248e = z10;
        MediaController.O(this.classGuid);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25180r2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25190t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.wt wtVar = this.N;
        if (wtVar != null) {
            wtVar.o();
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25180r2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25190t);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f51250n;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.wt wtVar = this.N;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.ui.Components.ck0 ck0Var = this.h;
        if (ck0Var != null) {
            ck0Var.getViewTreeObserver().addOnPreDrawListener(new d7(this, 3));
        }
    }
}
