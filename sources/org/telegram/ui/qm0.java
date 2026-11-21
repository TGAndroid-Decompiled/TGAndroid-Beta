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
public final class qm0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public final boolean E;
    public final boolean F;
    public final bn G;
    public int H;
    public boolean I;
    public org.telegram.ui.ActionBar.g1 J;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public org.telegram.ui.ActionBar.y0[] L;
    public FrameLayout M;
    public org.telegram.ui.Components.yt N;
    public k0 O;
    public ImageView P;
    public om0 Q;
    public uv R;
    public View S;
    public final TextPaint T;
    public final RectF U;
    public final Paint V;
    public pm0 W;
    public CharSequence f51299a;
    public final HashMap f51300b;
    public final ArrayList f51301c;
    public ArrayList d;
    public boolean f51302e;
    public int f51303f;
    public org.telegram.ui.Components.ek0 h;
    public l4 f51304n;
    public FrameLayout f51305r;
    public TextView f51306s;
    public boolean f51307w;
    public final int f51308x;
    public boolean f51309y;

    public qm0(int i7, boolean z10, boolean z11, bn bnVar) {
        super(null);
        this.f51300b = new HashMap();
        this.f51301c = new ArrayList();
        this.d = null;
        this.f51302e = false;
        this.f51303f = 2;
        this.f51309y = true;
        this.I = true;
        this.T = new TextPaint(1);
        this.U = new RectF();
        this.V = new Paint(1);
        this.G = bnVar;
        this.f51308x = i7;
        this.E = z10;
        this.F = z11;
    }

    public static void Z(qm0 qm0Var, org.telegram.messenger.ue ueVar) {
        if (ueVar != null) {
            cn0 cn0Var = new cn0(0, ueVar, qm0Var.f51300b, qm0Var.f51301c, qm0Var.f51308x, qm0Var.F, qm0Var.G, false);
            Editable text = qm0Var.N.getText();
            qm0Var.f51299a = text;
            cn0Var.d = text;
            org.telegram.ui.Components.yt ytVar = cn0Var.f46601e0;
            if (ytVar != null) {
                ytVar.setText(text);
            }
            cn0Var.f46619t0 = new f(qm0Var, 29);
            cn0Var.k0(qm0Var.H, qm0Var.I);
            qm0Var.presentFragment(cn0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (qm0Var.E) {
            fn0 fn0Var = new fn0(hashMap, arrayList, qm0Var.f51308x, qm0Var.F, qm0Var.G);
            Editable text2 = qm0Var.N.getText();
            qm0Var.f51299a = text2;
            cn0 cn0Var2 = fn0Var.f47790a;
            if (cn0Var2 != null) {
                cn0Var2.d = text2;
                org.telegram.ui.Components.yt ytVar2 = cn0Var2.f46601e0;
                if (ytVar2 != null) {
                    ytVar2.setText(text2);
                }
            }
            nm0 nm0Var = new nm0(qm0Var, hashMap, arrayList, 1);
            cn0 cn0Var3 = fn0Var.f47790a;
            cn0Var3.f46619t0 = nm0Var;
            cn0 cn0Var4 = fn0Var.f47791b;
            cn0Var4.f46619t0 = nm0Var;
            cn0Var3.f46620u0 = new dn0(fn0Var, 1);
            cn0Var4.f46620u0 = new dn0(fn0Var, 2);
            int i7 = qm0Var.H;
            boolean z10 = qm0Var.I;
            cn0Var3.k0(i7, z10);
            fn0Var.f47791b.k0(i7, z10);
            qm0Var.presentFragment(fn0Var);
            return;
        }
        cn0 cn0Var5 = new cn0(0, ueVar, hashMap, arrayList, qm0Var.f51308x, qm0Var.F, qm0Var.G, false);
        Editable text3 = qm0Var.N.getText();
        qm0Var.f51299a = text3;
        cn0Var5.d = text3;
        org.telegram.ui.Components.yt ytVar3 = cn0Var5.f46601e0;
        if (ytVar3 != null) {
            ytVar3.setText(text3);
        }
        cn0Var5.f46619t0 = new nm0(qm0Var, hashMap, arrayList, 0);
        cn0Var5.k0(qm0Var.H, qm0Var.I);
        qm0Var.presentFragment(cn0Var5);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z10, int i7) {
        if (!hashMap.isEmpty() && this.W != null && !this.f51307w) {
            this.f51307w = true;
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
                        obj2.f28239c = str2;
                    } else {
                        obj2.f28239c = efVar.I;
                    }
                    obj2.f28240e = efVar.f27876c;
                    obj2.f28241f = efVar.f27879g;
                    obj2.f28245k = efVar.f27890s;
                    obj2.f28249o = efVar.f27875b;
                    CharSequence charSequence = efVar.f27874a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.f28243i = efVar.f27885n;
                    obj2.f28244j = efVar.f27889r;
                    obj2.h = efVar.f27894x;
                } else if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    String str3 = hfVar.h;
                    if (str3 != null) {
                        obj2.f28239c = str3;
                    } else {
                        obj2.f28246l = hfVar;
                    }
                    obj2.f28240e = hfVar.f27876c;
                    obj2.f28241f = hfVar.f27879g;
                    obj2.f28245k = hfVar.f27890s;
                    CharSequence charSequence2 = hfVar.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.f28243i = hfVar.f27885n;
                    obj2.f28244j = hfVar.f27889r;
                    obj2.h = hfVar.f27894x;
                    TLRPC.BotInlineResult botInlineResult = hfVar.N;
                    if (botInlineResult != null && hfVar.H == 1) {
                        obj2.f28247m = botInlineResult;
                        obj2.f28248n = hfVar.O;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382da));
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
        int i7 = org.telegram.ui.ActionBar.m6.f29451h5;
        org.telegram.ui.ActionBar.t6.h(i7, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.m6.f29486j5;
        org.telegram.ui.ActionBar.t6.l(kVar2, 5, i10, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.I5, null);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setActionBarMenuOnItemClick(new dv(this, 25));
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        if (this.f51309y) {
            s5.a(2, 2131232488).setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
        }
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, 2131231244);
        a10.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        a10.e(1, 2131232267, org.telegram.messenger.gd.N0(2131747602, null));
        om0 om0Var = new om0(this, context);
        this.Q = om0Var;
        org.telegram.ui.ActionBar.t6.h(i7, om0Var, null);
        this.fragmentView = this.Q;
        this.actionBar.setTitle(org.telegram.messenger.gd.N0(2131750467, null));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.h = ek0Var;
        ek0Var.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new v4.c0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.Q.addView(this.h, c8.ma.e(-1, -1, 51));
        org.telegram.ui.Components.ek0 ek0Var2 = this.h;
        l4 l4Var = new l4(13, this, context);
        this.f51304n = l4Var;
        ek0Var2.setAdapter(l4Var);
        org.telegram.ui.ActionBar.t6.H(this.h, i7, null);
        TextView textView = new TextView(context);
        this.f51306s = textView;
        textView.setTextColor(-8355712);
        this.f51306s.setTextSize(1, 20.0f);
        this.f51306s.setGravity(17);
        this.f51306s.setVisibility(8);
        this.f51306s.setText(org.telegram.messenger.gd.N0(2131747987, null));
        this.Q.addView(this.f51306s, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f51306s.setOnTouchListener(new gi.a(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51305r = frameLayout;
        frameLayout.setVisibility(8);
        this.Q.addView(this.f51305r, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f51305r.addView(radialProgressView, c8.ma.e(-2, -2, 17));
        View view = new View(context);
        this.S = view;
        view.setBackgroundResource(2131231238);
        this.S.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.S, c8.ma.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        org.telegram.ui.ActionBar.t6.h(i7, frameLayout2, null);
        this.M.setVisibility(4);
        this.M.setTranslationY(org.telegram.messenger.g0.L(48.0f));
        this.Q.addView(this.M, c8.ma.e(-1, 48, 83));
        this.M.setOnTouchListener(new gi.a(2));
        org.telegram.ui.Components.yt ytVar = this.N;
        if (ytVar != null) {
            ytVar.o();
        }
        this.N = new org.telegram.ui.Components.yt(context, this.Q, null, 1, false, null);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).J0())});
        this.N.setHint(org.telegram.messenger.gd.N0(2131754451, null));
        org.telegram.ui.Components.ot editText = this.N.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.M.addView(this.N, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f51299a;
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
        this.P.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.j0(org.telegram.messenger.g0.L(56.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.S5, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T5, false)));
        this.P.setImageResource(2131230876);
        this.P.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.t6.s(this.P, org.telegram.ui.ActionBar.m6.U5, null, PorterDuff.Mode.MULTIPLY);
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
        if (this.f51308x != 0) {
            this.N.setVisibility(8);
        }
        if (this.f51302e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f51305r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f51305r.setVisibility(8);
            this.h.setEmptyView(this.f51306s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25208r2) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i11 = this.f51308x;
                if (i11 != 1 && i11 != 2 && i11 != 10 && this.f51309y) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f51305r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.ek0 ek0Var = this.h;
                if (ek0Var != null && ek0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f51306s);
                }
                l4 l4Var = this.f51304n;
                if (l4Var != null) {
                    l4Var.f();
                }
                this.f51302e = false;
            }
        } else if (i7 == org.telegram.messenger.ks.f25218t) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.yt ytVar = this.N;
        if (ytVar != null && ytVar.f42545e) {
            if (z10) {
                ytVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.ek0 ek0Var = this.h;
        if (ek0Var != null) {
            ek0Var.getViewTreeObserver().addOnPreDrawListener(new d7(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i7 = this.f51308x;
        boolean z10 = true;
        if (i7 != 1 && i7 != 2 && i7 != 10 && this.f51309y) {
            this.d = MediaController.f22716c2;
        } else {
            this.d = MediaController.d2;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.f51302e = z10;
        MediaController.O(this.classGuid);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25208r2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25218t);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.yt ytVar = this.N;
        if (ytVar != null) {
            ytVar.o();
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25208r2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25218t);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        l4 l4Var = this.f51304n;
        if (l4Var != null) {
            l4Var.f();
        }
        org.telegram.ui.Components.yt ytVar = this.N;
        if (ytVar != null) {
            ytVar.s();
        }
        org.telegram.ui.Components.ek0 ek0Var = this.h;
        if (ek0Var != null) {
            ek0Var.getViewTreeObserver().addOnPreDrawListener(new d7(this, 3));
        }
    }
}
