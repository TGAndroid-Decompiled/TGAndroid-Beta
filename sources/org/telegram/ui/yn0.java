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
public final class yn0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public final boolean D;
    public final boolean E;
    public final un F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.k1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.b1[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.wt M;
    public l0 N;
    public ImageView O;
    public wn0 P;
    public bi.t0 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public xn0 V;
    public CharSequence f43864a;
    public final HashMap f43865b;
    public final ArrayList f43866c;
    public ArrayList d;
    public boolean e;
    public int f43867f;
    public org.telegram.ui.Components.tk0 h;
    public fg.j f43868n;
    public FrameLayout f43869r;
    public TextView f43870s;
    public boolean f43871w;
    public final int f43872x;
    public boolean f43873y;

    public yn0(int i10, boolean z10, boolean z11, un unVar) {
        super(null);
        this.f43865b = new HashMap();
        this.f43866c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f43867f = 2;
        this.f43873y = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = unVar;
        this.f43872x = i10;
        this.D = z10;
        this.E = z11;
    }

    public static void Y(yn0 yn0Var, org.telegram.messenger.we weVar) {
        if (weVar != null) {
            lo0 lo0Var = new lo0(0, weVar, yn0Var.f43865b, yn0Var.f43866c, yn0Var.f43872x, yn0Var.E, yn0Var.F, false);
            Editable text = yn0Var.M.getText();
            yn0Var.f43864a = text;
            lo0Var.d = text;
            org.telegram.ui.Components.wt wtVar = lo0Var.f39333d0;
            if (wtVar != null) {
                wtVar.setText(text);
            }
            lo0Var.f39351s0 = new e(yn0Var, 28);
            lo0Var.j0(yn0Var.G, yn0Var.H);
            yn0Var.presentFragment(lo0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (yn0Var.D) {
            oo0 oo0Var = new oo0(hashMap, arrayList, yn0Var.f43872x, yn0Var.E, yn0Var.F);
            Editable text2 = yn0Var.M.getText();
            yn0Var.f43864a = text2;
            lo0 lo0Var2 = oo0Var.f40349a;
            if (lo0Var2 != null) {
                lo0Var2.d = text2;
                org.telegram.ui.Components.wt wtVar2 = lo0Var2.f39333d0;
                if (wtVar2 != null) {
                    wtVar2.setText(text2);
                }
            }
            vn0 vn0Var = new vn0(yn0Var, hashMap, arrayList, 1);
            lo0 lo0Var3 = oo0Var.f40349a;
            lo0Var3.f39351s0 = vn0Var;
            lo0 lo0Var4 = oo0Var.f40350b;
            lo0Var4.f39351s0 = vn0Var;
            lo0Var3.f39352t0 = new mo0(oo0Var, 1);
            lo0Var4.f39352t0 = new mo0(oo0Var, 2);
            int i10 = yn0Var.G;
            boolean z10 = yn0Var.H;
            lo0Var3.j0(i10, z10);
            oo0Var.f40350b.j0(i10, z10);
            yn0Var.presentFragment(oo0Var);
            return;
        }
        lo0 lo0Var5 = new lo0(0, weVar, hashMap, arrayList, yn0Var.f43872x, yn0Var.E, yn0Var.F, false);
        Editable text3 = yn0Var.M.getText();
        yn0Var.f43864a = text3;
        lo0Var5.d = text3;
        org.telegram.ui.Components.wt wtVar3 = lo0Var5.f39333d0;
        if (wtVar3 != null) {
            wtVar3.setText(text3);
        }
        lo0Var5.f39351s0 = new vn0(yn0Var, hashMap, arrayList, 0);
        lo0Var5.j0(yn0Var.G, yn0Var.H);
        yn0Var.presentFragment(lo0Var5);
    }

    public final void Z(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (!hashMap.isEmpty() && this.V != null && !this.f43871w) {
            this.f43871w = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Object obj = hashMap.get(arrayList.get(i11));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                String str = null;
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    String str2 = efVar.h;
                    if (str2 != null) {
                        obj2.f17515c = str2;
                    } else {
                        obj2.f17515c = efVar.I;
                    }
                    obj2.e = efVar.f19508c;
                    obj2.f17516f = efVar.f19510g;
                    obj2.f17520k = efVar.f19521s;
                    obj2.f17524o = efVar.f19507b;
                    CharSequence charSequence = efVar.f19506a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f17518i = efVar.f19516n;
                    obj2.f17519j = efVar.f19520r;
                    obj2.h = efVar.f19525x;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    String str3 = hfVar.h;
                    if (str3 != null) {
                        obj2.f17515c = str3;
                    } else {
                        obj2.f17521l = hfVar;
                    }
                    obj2.e = hfVar.f19508c;
                    obj2.f17516f = hfVar.f19510g;
                    obj2.f17520k = hfVar.f19521s;
                    CharSequence charSequence2 = hfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f17518i = hfVar.f19516n;
                    obj2.f17519j = hfVar.f19520r;
                    obj2.h = hfVar.f19525x;
                    TLRPC.BotInlineResult botInlineResult = hfVar.N;
                    if (botInlineResult != null && hfVar.H == 1) {
                        obj2.f17522m = botInlineResult;
                        obj2.f17523n = hfVar.O;
                    }
                    System.currentTimeMillis();
                }
            }
            this.V.b(arrayList2);
        }
    }

    public final void a0(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float L;
        if (this.L.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        FrameLayout frameLayout = this.L;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.M.getEditText().isFocused()) {
            org.telegram.messenger.i0.v1(this.M.getEditText());
        }
        this.M.k(true);
        if (z10) {
            this.L.setVisibility(0);
            this.N.setVisibility(0);
        } else {
            this.L.setVisibility(4);
            this.N.setVisibility(4);
        }
        l0 l0Var = this.N;
        float f13 = 0.2f;
        float f14 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.2f;
        }
        l0Var.setScaleX(f7);
        l0 l0Var2 = this.N;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        l0Var2.setScaleY(f10);
        l0 l0Var3 = this.N;
        float f15 = 0.0f;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        l0Var3.setAlpha(f11);
        bi.t0 t0Var = this.Q;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.2f;
        }
        t0Var.setScaleX(f12);
        bi.t0 t0Var2 = this.Q;
        if (z10) {
            f13 = 1.0f;
        }
        t0Var2.setScaleY(f13);
        bi.t0 t0Var3 = this.Q;
        if (!z10) {
            f14 = 0.0f;
        }
        t0Var3.setAlpha(f14);
        FrameLayout frameLayout2 = this.L;
        if (z10) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.i0.L(48.0f);
        }
        frameLayout2.setTranslationY(L);
        View view = this.R;
        if (!z10) {
            f15 = org.telegram.messenger.i0.L(48.0f);
        }
        view.setTranslationY(f15);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20933da));
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.f21001h5;
        org.telegram.ui.ActionBar.a7.i(i10, lVar, null);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.m(lVar2, 5, i11, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, i11, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.I5, null);
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setActionBarMenuOnItemClick(new t60(this, 13));
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        if (this.f43873y) {
            p5.a(2, 2131232485).setContentDescription(org.telegram.messenger.cd.L0(2131745853, null));
        }
        org.telegram.ui.ActionBar.t0 a2 = p5.a(0, 2131231245);
        a2.setContentDescription(org.telegram.messenger.cd.L0(2131754839, null));
        a2.e(1, 2131232264, org.telegram.messenger.cd.L0(2131747812, null));
        wn0 wn0Var = new wn0(this, context);
        this.P = wn0Var;
        org.telegram.ui.ActionBar.a7.i(i10, wn0Var, null);
        this.fragmentView = this.P;
        this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131750493, null));
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.h = tk0Var;
        tk0Var.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new s4.a0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, w7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.tk0 tk0Var2 = this.h;
        fg.j jVar = new fg.j(14, this, context);
        this.f43868n = jVar;
        tk0Var2.setAdapter(jVar);
        org.telegram.ui.ActionBar.a7.I(this.h, i10, null);
        TextView textView = new TextView(context);
        this.f43870s = textView;
        textView.setTextColor(-8355712);
        this.f43870s.setTextSize(1, 20.0f);
        this.f43870s.setGravity(17);
        this.f43870s.setVisibility(8);
        this.f43870s.setText(org.telegram.messenger.cd.L0(2131748197, null));
        this.P.addView(this.f43870s, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f43870s.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43869r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.f43869r, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f43869r.addView(radialProgressView, w7.b6.e(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(2131231239);
        this.R.setTranslationY(org.telegram.messenger.i0.L(48.0f));
        this.P.addView(this.R, w7.b6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        org.telegram.ui.ActionBar.a7.i(i10, frameLayout2, null);
        this.L.setVisibility(4);
        this.L.setTranslationY(org.telegram.messenger.i0.L(48.0f));
        this.P.addView(this.L, w7.b6.e(-1, 48, 83));
        this.L.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        org.telegram.ui.Components.wt wtVar = this.M;
        if (wtVar != null) {
            wtVar.o();
        }
        this.M = new org.telegram.ui.Components.wt(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0).f18915u3)});
        this.M.setHint(org.telegram.messenger.cd.L0(2131754454, null));
        org.telegram.ui.Components.mt editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f43864a;
        if (charSequence != null) {
            this.M.setText(charSequence);
        }
        l0 l0Var = new l0(this, context, 18);
        this.N = l0Var;
        l0Var.setFocusable(true);
        this.N.setFocusableInTouchMode(true);
        this.N.setVisibility(4);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.N.setAlpha(0.0f);
        this.P.addView(this.N, w7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.O = new ImageView(context);
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.j0(org.telegram.messenger.i0.L(56.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.S5, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T5, false)));
        this.O.setImageResource(2131230876);
        this.O.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.a7.t(this.O, org.telegram.ui.ActionBar.t6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new bi.d2(19));
        this.N.addView(this.O, w7.b6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.O.setOnClickListener(new f50(this, 18));
        this.O.setOnLongClickListener(new s(this, 3));
        TextPaint textPaint = this.S;
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        bi.t0 t0Var = new bi.t0(this, context, 29);
        this.Q = t0Var;
        t0Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, w7.b6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f43872x != 0) {
            this.M.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f43869r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f43869r.setVisibility(8);
            this.h.setEmptyView(this.f43870s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19679r2) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i12 = this.f43872x;
                if (i12 != 1 && i12 != 2 && i12 != 10 && this.f43873y) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f43869r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.tk0 tk0Var = this.h;
                if (tk0Var != null && tk0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f43870s);
                }
                fg.j jVar = this.f43868n;
                if (jVar != null) {
                    jVar.f();
                }
                this.e = false;
            }
        } else if (i10 == org.telegram.messenger.zs.f19690t) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.M;
        if (wtVar != null && wtVar.e) {
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
        org.telegram.ui.Components.tk0 tk0Var = this.h;
        if (tk0Var != null) {
            tk0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f43872x;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2 && i10 != 10 && this.f43873y) {
            this.d = MediaController.a2;
        } else {
            this.d = MediaController.f14432b2;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.e = z10;
        MediaController.O(this.classGuid);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19679r2);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19690t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.wt wtVar = this.M;
        if (wtVar != null) {
            wtVar.o();
        }
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19679r2);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19690t);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.f43868n;
        if (jVar != null) {
            jVar.f();
        }
        org.telegram.ui.Components.wt wtVar = this.M;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.ui.Components.tk0 tk0Var = this.h;
        if (tk0Var != null) {
            tk0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }
}
