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
public final class wn0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
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
    public un0 P;
    public bi.t0 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public vn0 V;
    public CharSequence f43131a;
    public final HashMap f43132b;
    public final ArrayList f43133c;
    public ArrayList d;
    public boolean e;
    public int f43134f;
    public org.telegram.ui.Components.uk0 h;
    public fg.j f43135n;
    public FrameLayout f43136r;
    public TextView f43137s;
    public boolean f43138w;
    public final int f43139x;
    public boolean f43140y;

    public wn0(int i10, boolean z10, boolean z11, un unVar) {
        super(null);
        this.f43132b = new HashMap();
        this.f43133c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f43134f = 2;
        this.f43140y = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = unVar;
        this.f43139x = i10;
        this.D = z10;
        this.E = z11;
    }

    public static void Z(wn0 wn0Var, org.telegram.messenger.xe xeVar) {
        if (xeVar != null) {
            jo0 jo0Var = new jo0(0, xeVar, wn0Var.f43132b, wn0Var.f43133c, wn0Var.f43139x, wn0Var.E, wn0Var.F, false);
            Editable text = wn0Var.M.getText();
            wn0Var.f43131a = text;
            jo0Var.d = text;
            org.telegram.ui.Components.wt wtVar = jo0Var.f38488d0;
            if (wtVar != null) {
                wtVar.setText(text);
            }
            jo0Var.f38506s0 = new e(wn0Var, 29);
            jo0Var.k0(wn0Var.G, wn0Var.H);
            wn0Var.presentFragment(jo0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (wn0Var.D) {
            mo0 mo0Var = new mo0(hashMap, arrayList, wn0Var.f43139x, wn0Var.E, wn0Var.F);
            Editable text2 = wn0Var.M.getText();
            wn0Var.f43131a = text2;
            jo0 jo0Var2 = mo0Var.f39585a;
            if (jo0Var2 != null) {
                jo0Var2.d = text2;
                org.telegram.ui.Components.wt wtVar2 = jo0Var2.f38488d0;
                if (wtVar2 != null) {
                    wtVar2.setText(text2);
                }
            }
            tn0 tn0Var = new tn0(wn0Var, hashMap, arrayList, 1);
            jo0 jo0Var3 = mo0Var.f39585a;
            jo0Var3.f38506s0 = tn0Var;
            jo0 jo0Var4 = mo0Var.f39586b;
            jo0Var4.f38506s0 = tn0Var;
            jo0Var3.f38507t0 = new ko0(mo0Var, 1);
            jo0Var4.f38507t0 = new ko0(mo0Var, 2);
            int i10 = wn0Var.G;
            boolean z10 = wn0Var.H;
            jo0Var3.k0(i10, z10);
            mo0Var.f39586b.k0(i10, z10);
            wn0Var.presentFragment(mo0Var);
            return;
        }
        jo0 jo0Var5 = new jo0(0, xeVar, hashMap, arrayList, wn0Var.f43139x, wn0Var.E, wn0Var.F, false);
        Editable text3 = wn0Var.M.getText();
        wn0Var.f43131a = text3;
        jo0Var5.d = text3;
        org.telegram.ui.Components.wt wtVar3 = jo0Var5.f38488d0;
        if (wtVar3 != null) {
            wtVar3.setText(text3);
        }
        jo0Var5.f38506s0 = new tn0(wn0Var, hashMap, arrayList, 0);
        jo0Var5.k0(wn0Var.G, wn0Var.H);
        wn0Var.presentFragment(jo0Var5);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (!hashMap.isEmpty() && this.V != null && !this.f43138w) {
            this.f43138w = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Object obj = hashMap.get(arrayList.get(i11));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                String str = null;
                if (obj instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                    String str2 = ffVar.h;
                    if (str2 != null) {
                        obj2.f17850c = str2;
                    } else {
                        obj2.f17850c = ffVar.I;
                    }
                    obj2.e = ffVar.f14604c;
                    obj2.f17851f = ffVar.f14606g;
                    obj2.f17855k = ffVar.f14617s;
                    obj2.f17859o = ffVar.f14603b;
                    CharSequence charSequence = ffVar.f14602a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f17853i = ffVar.f14612n;
                    obj2.f17854j = ffVar.f14616r;
                    obj2.h = ffVar.f14621x;
                } else if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    String str3 = jfVar.h;
                    if (str3 != null) {
                        obj2.f17850c = str3;
                    } else {
                        obj2.f17856l = jfVar;
                    }
                    obj2.e = jfVar.f14604c;
                    obj2.f17851f = jfVar.f14606g;
                    obj2.f17855k = jfVar.f14617s;
                    CharSequence charSequence2 = jfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f17853i = jfVar.f14612n;
                    obj2.f17854j = jfVar.f14616r;
                    obj2.h = jfVar.f14621x;
                    TLRPC.BotInlineResult botInlineResult = jfVar.N;
                    if (botInlineResult != null && jfVar.H == 1) {
                        obj2.f17857m = botInlineResult;
                        obj2.f17858n = jfVar.O;
                    }
                    System.currentTimeMillis();
                }
            }
            this.V.b(arrayList2);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20934da));
    }

    public final void b0(boolean z10) {
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
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.t6.f21002h5;
        org.telegram.ui.ActionBar.a7.i(i10, lVar, null);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.a7.m(lVar2, 5, i11, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, i11, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.I5, null);
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 13));
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        if (this.f43140y) {
            p5.a(2, 2131232485).setContentDescription(org.telegram.messenger.dd.L0(2131745853, null));
        }
        org.telegram.ui.ActionBar.t0 a2 = p5.a(0, 2131231245);
        a2.setContentDescription(org.telegram.messenger.dd.L0(2131754839, null));
        a2.e(1, 2131232264, org.telegram.messenger.dd.L0(2131747812, null));
        un0 un0Var = new un0(this, context);
        this.P = un0Var;
        org.telegram.ui.ActionBar.a7.i(i10, un0Var, null);
        this.fragmentView = this.P;
        this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131750493, null));
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.h = uk0Var;
        uk0Var.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new s4.a0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, w7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.uk0 uk0Var2 = this.h;
        fg.j jVar = new fg.j(14, this, context);
        this.f43135n = jVar;
        uk0Var2.setAdapter(jVar);
        org.telegram.ui.ActionBar.a7.I(this.h, i10, null);
        TextView textView = new TextView(context);
        this.f43137s = textView;
        textView.setTextColor(-8355712);
        this.f43137s.setTextSize(1, 20.0f);
        this.f43137s.setGravity(17);
        this.f43137s.setVisibility(8);
        this.f43137s.setText(org.telegram.messenger.dd.L0(2131748197, null));
        this.P.addView(this.f43137s, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f43137s.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43136r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.f43136r, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f43136r.addView(radialProgressView, w7.b6.e(-2, -2, 17));
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
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).f19258u3)});
        this.M.setHint(org.telegram.messenger.dd.L0(2131754454, null));
        org.telegram.ui.Components.mt editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, w7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f43131a;
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
        this.O.setOnClickListener(new e50(this, 18));
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
        if (this.f43139x != 0) {
            this.M.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f43136r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f43136r.setVisibility(8);
            this.h.setEmptyView(this.f43137s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14775r2) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i12 = this.f43139x;
                if (i12 != 1 && i12 != 2 && i12 != 10 && this.f43140y) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f43136r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.uk0 uk0Var = this.h;
                if (uk0Var != null && uk0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f43137s);
                }
                fg.j jVar = this.f43135n;
                if (jVar != null) {
                    jVar.f();
                }
                this.e = false;
            }
        } else if (i10 == org.telegram.messenger.at.f14786t) {
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
        org.telegram.ui.Components.uk0 uk0Var = this.h;
        if (uk0Var != null) {
            uk0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f43139x;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2 && i10 != 10 && this.f43140y) {
            this.d = MediaController.a2;
        } else {
            this.d = MediaController.f14433b2;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.e = z10;
        MediaController.O(this.classGuid);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14775r2);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14786t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.wt wtVar = this.M;
        if (wtVar != null) {
            wtVar.o();
        }
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14775r2);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14786t);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        fg.j jVar = this.f43135n;
        if (jVar != null) {
            jVar.f();
        }
        org.telegram.ui.Components.wt wtVar = this.M;
        if (wtVar != null) {
            wtVar.s();
        }
        org.telegram.ui.Components.uk0 uk0Var = this.h;
        if (uk0Var != null) {
            uk0Var.getViewTreeObserver().addOnPreDrawListener(new e7(this, 3));
        }
    }
}
