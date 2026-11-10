package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sr0 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.rt0 {
    public boolean A0;
    public boolean B0;
    public int D;
    public CharSequence E;
    public Editable F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final int N;
    public int O;
    public boolean P;
    public org.telegram.ui.Components.ow0 Q;
    public org.telegram.ui.Components.gy R;
    public fi.q3 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.r0 f49919a;
    public boolean f49920a0;
    public qr0 f49921b;
    public org.telegram.ui.Cells.a6 f49922b0;
    public g61 f49923c;
    public final boolean f49924c0;
    public v4.b0 d;
    public final boolean f49925d0;
    public xc f49926e;
    public rr0 f49927e0;
    public final cn f49928f;
    public boolean f49929f0;
    public int f49930g0;
    public org.telegram.ui.Components.y20 h;
    public int f49931h0;
    public int f49932i0;
    public int f49933j0;
    public int f49934k0;
    public int f49935l0;
    public int m0;
    public final int f49936n;
    public int f49937n0;
    public int f49938o0;
    public int f49939p0;
    public int f49940q0;
    public int[] f49941r;
    public int f49942r0;
    public int f49943s;
    public int f49944s0;
    public int f49945t0;
    public int f49946u0;
    public int f49947v0;
    public final CharSequence[] f49948w;
    public int f49949w0;
    public final boolean[] f49950x;
    public int f49951x0;
    public int f49952y;
    public final m4 f49953y0;
    public TLRPC.MessageMedia f49954z0;

    public sr0(cn cnVar) {
        super(null);
        this.D = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = org.telegram.messenger.g0.L(3.0f);
        this.f49930g0 = -1;
        this.f49953y0 = new m4(this, 14);
        this.f49925d0 = true;
        int i7 = getMessagesController().R6;
        this.f49936n = i7;
        this.f49948w = new CharSequence[i7];
        this.f49950x = new boolean[i7];
        this.f49928f = cnVar;
        this.f49924c0 = org.telegram.messenger.p10.i(org.telegram.messenger.c.a(this.currentAccount).f21770a).q();
        this.L = false;
        this.N = 2;
    }

    public static void h0(sr0 sr0Var, View view, int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z9 = sr0Var.f49925d0;
        if (view instanceof org.telegram.ui.Cells.a6) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            if (i7 == sr0Var.f49932i0) {
                if (z9) {
                    i13 = sr0Var.getMessagesController().S6;
                } else {
                    i13 = 255;
                }
                CharSequence charSequence = sr0Var.E;
                if (charSequence != null) {
                    i16 = charSequence.length();
                } else {
                    i16 = 0;
                }
                i12 = i13 - i16;
            } else if (i7 == sr0Var.f49933j0) {
                Editable editable = sr0Var.F;
                if (editable != null) {
                    i14 = editable.length();
                } else {
                    i14 = 0;
                }
                i13 = 200;
                i12 = 200 - i14;
            } else {
                int i17 = sr0Var.f49937n0;
                if (i7 >= i17 && i7 < sr0Var.D + i17) {
                    int i18 = i7 - i17;
                    if (z9) {
                        i10 = sr0Var.getMessagesController().T6;
                    } else {
                        i10 = 100;
                    }
                    CharSequence charSequence2 = sr0Var.f49948w[i18];
                    if (charSequence2 != null) {
                        i11 = charSequence2.length();
                    } else {
                        i11 = 0;
                    }
                    i12 = i10 - i11;
                    i13 = i10;
                } else {
                    return;
                }
            }
            float f10 = i13;
            if (i12 <= f10 - (0.7f * f10)) {
                a6Var.setText2(String.format("%d", Integer.valueOf(i12)));
                org.telegram.ui.ActionBar.m5 textView2 = a6Var.getTextView2();
                if (i12 < 0) {
                    i15 = org.telegram.ui.ActionBar.m6.f28111p7;
                } else {
                    i15 = org.telegram.ui.ActionBar.m6.A6;
                }
                org.telegram.ui.ActionBar.t6.X(textView2, i15, null);
                textView2.setTag(Integer.valueOf(i15));
                return;
            }
            a6Var.setText2("");
        }
    }

    public static void i0(sr0 sr0Var, org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        v4.d1 T;
        if (sr0Var.f49924c0 && z9) {
            if (sr0Var.f49922b0 == a6Var && sr0Var.P && sr0Var.B0) {
                sr0Var.o0();
                sr0Var.P = false;
            }
            org.telegram.ui.Cells.a6 a6Var2 = sr0Var.f49922b0;
            sr0Var.f49922b0 = a6Var;
            a6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.ig emojiButton = a6Var.getEmojiButton();
            org.telegram.ui.Components.gg ggVar = org.telegram.ui.Components.gg.f33892e;
            emojiButton.j(ggVar, false);
            g61 g61Var = sr0Var.f49923c;
            View F = g61Var.F(a6Var);
            if (F == null) {
                T = null;
            } else {
                T = g61Var.T(F);
            }
            org.telegram.ui.Components.ow0 ow0Var = sr0Var.Q;
            if (ow0Var != null) {
                ow0Var.f();
                org.telegram.ui.Components.ow0 ow0Var2 = sr0Var.Q;
                if (ow0Var2 != null && T != null) {
                    View view = T.f57052a;
                    if ((view instanceof org.telegram.ui.Cells.a6) && ow0Var2.getDelegate() != view) {
                        sr0Var.Q.setDelegate((org.telegram.ui.Cells.a6) view);
                    }
                }
            }
            if (a6Var2 != null && a6Var2 != a6Var) {
                if (sr0Var.P) {
                    sr0Var.o0();
                    sr0Var.p0(false);
                    sr0Var.r0();
                }
                a6Var2.setEmojiButtonVisibility(false);
                a6Var2.getEmojiButton().j(ggVar, false);
            }
        }
    }

    public static void j0(sr0 sr0Var, org.telegram.ui.Cells.a6 a6Var) {
        sr0Var.f49922b0 = a6Var;
        if (sr0Var.P) {
            sr0Var.o0();
            sr0Var.r0();
            return;
        }
        sr0Var.v0(1);
    }

    @Override
    public final void K(int i7, boolean z9) {
        boolean z10;
        boolean z11;
        int i10;
        int L;
        if (this.f49924c0) {
            if (i7 > org.telegram.messenger.g0.L(50.0f) && this.Y && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                if (z9) {
                    this.X = i7;
                    org.telegram.messenger.qp.d1().edit().putInt("kbd_height_land3", this.X).commit();
                } else {
                    this.W = i7;
                    org.telegram.messenger.qp.d1().edit().putInt("kbd_height", this.W).commit();
                }
            }
            if (this.P) {
                if (z9) {
                    i10 = this.X;
                } else {
                    i10 = this.W;
                }
                if (this.B0) {
                    i10 += org.telegram.messenger.g0.L(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
                int i11 = layoutParams.width;
                int i12 = org.telegram.messenger.g0.f22567q.x;
                if (i11 != i12 || layoutParams.height != i10 || this.A0 != this.B0) {
                    layoutParams.width = i12;
                    layoutParams.height = i10;
                    this.R.setLayoutParams(layoutParams);
                    this.V = layoutParams.height;
                    this.S.a();
                    this.f49926e.requestLayout();
                    boolean z12 = this.A0;
                    if (z12 != this.B0) {
                        if (z12) {
                            L = -org.telegram.messenger.g0.L(120.0f);
                        } else {
                            L = org.telegram.messenger.g0.L(120.0f);
                        }
                        l0(L);
                    }
                    this.A0 = this.B0;
                }
            }
            if (this.Z != i7 || this.f49920a0 != z9) {
                this.Z = i7;
                this.f49920a0 = z9;
                boolean z13 = this.Y;
                org.telegram.ui.Cells.a6 a6Var = this.f49922b0;
                if (a6Var != null) {
                    if (a6Var.getEditField().isFocused() && this.S.c() && i7 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.Y = z11;
                } else {
                    this.Y = false;
                }
                if (this.Y && this.P) {
                    v0(0);
                }
                if (this.V != 0 && !(z10 = this.Y) && z10 != z13 && !this.P) {
                    this.V = 0;
                    this.S.a();
                    this.f49926e.requestLayout();
                }
                if (this.Y && this.T) {
                    this.T = false;
                    org.telegram.messenger.g0.r(this.f49953y0);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i7;
        int i10;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.l(lVar, 1, i11, getResourceProvider());
        org.telegram.ui.ActionBar.t6.b(this.actionBar, i11, getResourceProvider(), true);
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 3, org.telegram.ui.ActionBar.m6.f28302z8, getResourceProvider());
        org.telegram.ui.ActionBar.t6.l(this.actionBar, 5, i11, getResourceProvider());
        this.actionBar.setBackButtonImage(2131231240);
        boolean z9 = this.f49925d0;
        if (z9) {
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (this.I) {
                i10 = 2131744106;
            } else {
                i10 = 2131744074;
            }
            lVar2.setTitle(org.telegram.messenger.id.M0(i10, null));
        } else if (this.N == 1) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748264, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748265, null));
        }
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new kr0(this));
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        if (z9) {
            if (this.I) {
                i7 = 2131744107;
            } else {
                i7 = 2131744075;
            }
            upperCase = org.telegram.messenger.id.M0(i7, null);
        } else {
            upperCase = org.telegram.messenger.id.M0(2131751753, null).toUpperCase();
        }
        this.f49919a = s5.e(1, upperCase);
        this.f49921b = new qr0(this, context);
        xc xcVar = new xc(3, context, this);
        this.f49926e = xcVar;
        xcVar.setDelegate(this);
        xc xcVar2 = this.f49926e;
        this.fragmentView = xcVar2;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27834a7, xcVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f49923c = new g61(12, context, null);
        v4.k kVar = new v4.k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.n(350L);
        this.f49923c.setItemAnimator(kVar);
        this.f49923c.setVerticalScrollBarEnabled(false);
        ((v4.k) this.f49923c.getItemAnimator()).C = false;
        v4.b0 b0Var = new v4.b0(1, false);
        this.d = b0Var;
        this.f49923c.setLayoutManager(b0Var);
        new v4.y(new ei.d(this, 9)).h(this.f49923c);
        frameLayout.addView(this.f49923c, c8.ha.e(-1, -1, 51));
        this.f49923c.setAdapter(this.f49921b);
        this.f49923c.setOnItemClickListener(new h(this, 23));
        this.f49923c.setOnScrollListener(new g3(this, 24));
        org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(context, 4);
        this.h = y20Var;
        y20Var.setText(org.telegram.messenger.id.M0(2131747155, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f49924c0) {
            org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25022i4);
            org.telegram.ui.Components.ow0 ow0Var = new org.telegram.ui.Components.ow0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = ow0Var;
            ow0Var.D = true;
            ow0Var.E = true;
            ow0Var.setHorizontalPadding(org.telegram.messenger.g0.L(24.0f));
            frameLayout.addView(this.Q, c8.ha.e(-2, 160, 51));
        }
        this.S = new fi.q3(this.f49926e, false, null);
        n0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25022i4) {
            org.telegram.ui.Components.gy gyVar = this.R;
            if (gyVar != null) {
                gyVar.P.g1();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f49922b0;
            if (a6Var != null) {
                int currentTextColor = a6Var.getEditField().getCurrentTextColor();
                this.f49922b0.getEditField().setTextColor(-1);
                this.f49922b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f49930g0 < 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().G0) {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false);
            if (this.actionBar.x()) {
                x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28246w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void k0() {
        int i7;
        org.telegram.ui.Components.ow0 ow0Var = this.Q;
        if (ow0Var != null) {
            ow0Var.setDelegate(null);
            this.Q.f();
        }
        int i10 = this.D;
        this.f49950x[i10] = false;
        int i11 = i10 + 1;
        this.D = i11;
        if (this.f49941r != null) {
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int[] iArr2 = this.f49941r;
                if (i12 < iArr2.length) {
                    i7 = iArr2[i12];
                } else {
                    i7 = this.f49943s + 1;
                    this.f49943s = i7;
                }
                iArr[i12] = i7;
            }
            this.f49941r = iArr;
        }
        if (this.D == this.f49948w.length) {
            this.f49921b.s(this.f49938o0);
        }
        this.f49921b.i(this.f49938o0);
        w0();
        this.f49929f0 = false;
        this.f49930g0 = (this.f49937n0 + this.D) - 1;
        this.f49921b.g(this.f49939p0);
    }

    public final void l0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new sf(this, f10, 3));
        ofFloat.addListener(new lr0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27527w);
        ofFloat.start();
    }

    public final boolean m0(boolean z9) {
        int i7;
        int i10;
        boolean z10;
        TLRPC.MessageMedia messageMedia = this.f49954z0;
        boolean z11 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.f49948w;
        boolean z12 = false;
        if (z11) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i11 = 0;
            for (int i12 = 0; i12 < Math.min(this.D, charSequenceArr.length); i12++) {
                if (!TextUtils.isEmpty(charSequenceArr[i12])) {
                    i11++;
                }
            }
            if ((!this.I && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.an.d0(this.E))) || i11 != todoList.list.size()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                for (int i13 = 0; i13 < i11; i13++) {
                    if (!TextUtils.equals(charSequenceArr[i13].toString(), todoList.list.get(i13).title.text)) {
                        break;
                    }
                }
            }
            z12 = z10;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.an.d0(this.E));
            if (isEmpty) {
                for (int i14 = 0; i14 < this.D && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.an.d0(charSequenceArr[i14]))); i14++) {
                }
            }
            z12 = isEmpty;
        }
        if (z9 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z13 = this.f49925d0;
            if (z13) {
                i7 = 2131752567;
            } else {
                i7 = 2131752573;
            }
            String M0 = org.telegram.messenger.id.M0(i7, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            if (z13) {
                i10 = 2131752568;
            } else {
                i10 = 2131752574;
            }
            u1Var.T = org.telegram.messenger.id.M0(i10, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747580, null), new oi0(this, 3));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            showDialog(u1Var);
        }
        return z12;
    }

    public final void n0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sr0.n0():void");
    }

    public final void o0() {
        if (this.B0) {
            this.R.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.g0.L(120.0f);
            this.R.setLayoutParams(layoutParams);
            this.V = layoutParams.height;
            this.A0 = this.B0;
            this.B0 = false;
            l0(-org.telegram.messenger.g0.L(120.0f));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (this.P) {
            if (z9) {
                p0(true);
                return false;
            }
            return false;
        }
        return m0(z9);
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (this.f49929f0 && this.f49930g0 >= 0) {
            int i7 = 0;
            while (true) {
                if (i7 < this.f49923c.getChildCount()) {
                    view = this.f49923c.getChildAt(i7);
                    this.f49923c.getClass();
                    if (RecyclerView.R(view) == this.f49930g0) {
                        break;
                    }
                    i7++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.a6) {
                org.telegram.messenger.g0.i3(new rg(((org.telegram.ui.Cells.a6) view).getTextView(), 5), 300L);
                this.f49930g0 = -1;
            }
            this.f49929f0 = false;
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        w0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.U = true;
        if (this.f49924c0) {
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25022i4);
            org.telegram.ui.Components.gy gyVar = this.R;
            if (gyVar != null) {
                this.f49926e.removeView(gyVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f49924c0) {
            p0(false);
            org.telegram.ui.Components.ow0 ow0Var = this.Q;
            if (ow0Var != null) {
                ow0Var.f();
            }
            org.telegram.ui.Cells.a6 a6Var = this.f49922b0;
            if (a6Var != null) {
                a6Var.setEmojiButtonVisibility(false);
                this.f49922b0.getTextView().clearFocus();
                org.telegram.messenger.g0.v1(this.f49922b0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        qr0 qr0Var = this.f49921b;
        if (qr0Var != null) {
            qr0Var.f();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        org.telegram.ui.Cells.z5 z5Var;
        float f10;
        super.onThemeColorsChanged();
        try {
            g61 g61Var = this.f49923c;
            if (g61Var != null) {
                for (int i10 = 0; i10 < g61Var.getChildCount(); i10++) {
                    View childAt = g61Var.getChildAt(i10);
                    v4.d1 T = g61Var.T(childAt);
                    if (T != null && (((i7 = T.f57056f) == 4 || i7 == 5) && (childAt instanceof org.telegram.ui.Cells.a6) && (z5Var = ((org.telegram.ui.Cells.a6) childAt).d) != null)) {
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.G6);
                        if (z5Var.isEnabled()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.6f;
                        }
                        z5Var.setTextColor(org.telegram.ui.ActionBar.m6.r1(f10, themedColor));
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(boolean z9) {
        if (this.f49924c0) {
            if (this.P) {
                org.telegram.ui.Components.gy gyVar = this.R;
                gyVar.P.C0();
                gyVar.I.scrollTo(0, 0);
                gyVar.E(1);
                gyVar.Q.h1(0, 0);
                this.R.t(false);
                if (z9) {
                    this.R.A();
                }
                this.B0 = false;
                v0(0);
            }
            if (z9) {
                org.telegram.ui.Components.gy gyVar2 = this.R;
                if (gyVar2 != null && gyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                    ofFloat.addUpdateListener(new jr0(this, 1));
                    ofFloat.addListener(new lr0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27527w);
                    ofFloat.start();
                    return;
                }
                q0();
            }
        }
    }

    public final void q0() {
        org.telegram.ui.Components.gy gyVar;
        org.telegram.ui.Components.ig emojiButton;
        if (!this.P && (gyVar = this.R) != null && gyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.a6 a6Var = this.f49922b0;
            if (a6Var != null && (emojiButton = a6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.gg.f33892e, false);
            }
            this.R.setVisibility(8);
        }
        int i7 = this.V;
        this.V = 0;
        if (i7 != 0) {
            this.S.a();
        }
    }

    public final void r0() {
        int i7;
        this.S.f12656e = true;
        EditTextBoldCursor editField = this.f49922b0.getEditField();
        editField.requestFocus();
        org.telegram.messenger.g0.K3(editField);
        if (org.telegram.messenger.g0.D) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        v0(i7);
        if (!org.telegram.messenger.g0.D && !this.Y && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            this.T = true;
            m4 m4Var = this.f49953y0;
            org.telegram.messenger.g0.r(m4Var);
            org.telegram.messenger.g0.i3(m4Var, 100L);
        }
    }

    public final void s0(bg bgVar) {
        this.f49927e0 = bgVar;
    }

    public final void t0(TLRPC.MessageMedia messageMedia, boolean z9) {
        u0(messageMedia, z9, -1);
    }

    public final void u0(TLRPC.MessageMedia messageMedia, boolean z9, int i7) {
        int i10;
        int i11;
        this.f49954z0 = messageMedia;
        this.I = z9;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.E = spannableStringBuilder;
            CharSequence m10 = org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
            this.E = m10;
            Spannable B5 = org.telegram.messenger.ij.B5(m10, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.E = B5;
            org.telegram.messenger.ij.b(B5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.D = size;
            this.f49952y = size;
            this.f49943s = 0;
            this.f49941r = new int[size];
            int i12 = 0;
            while (true) {
                i10 = this.D;
                if (i12 >= i10) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i12).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.f49948w;
                charSequenceArr[i12] = spannableStringBuilder2;
                charSequenceArr[i12] = org.telegram.messenger.i6.m(charSequenceArr[i12], textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i12] = org.telegram.messenger.ij.B5(charSequenceArr[i12], tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                org.telegram.messenger.ij.b(charSequenceArr[i12], tL_textWithEntities.entities, false, false, false, false, 0);
                this.f49941r[i12] = tL_messageMediaToDo.todo.list.get(i12).f27107id;
                this.f49943s = Math.max(this.f49943s, this.f49941r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.D = i10 + 1;
                w0();
                this.f49929f0 = true;
                int i13 = this.f49937n0;
                if (i7 < 0) {
                    i11 = this.D - 1;
                } else {
                    i11 = i7;
                }
                this.f49930g0 = i13 + i11;
            }
        }
    }

    public final void v0(int i7) {
        boolean z9;
        int i10;
        org.telegram.ui.Cells.a6 a6Var;
        if (this.f49924c0) {
            if (i7 == 1) {
                org.telegram.ui.Components.gy gyVar = this.R;
                if (gyVar != null && gyVar.getVisibility() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                org.telegram.ui.Components.gy gyVar2 = this.R;
                if (gyVar2 != null && gyVar2.f34016c1 != org.telegram.messenger.p10.f24474s0) {
                    this.f49926e.removeView(gyVar2);
                    this.R = null;
                }
                if (this.R == null) {
                    org.telegram.ui.Components.gy gyVar3 = new org.telegram.ui.Components.gy(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.R = gyVar3;
                    gyVar3.f34083x2 = false;
                    gyVar3.U0 = false;
                    gyVar3.setVisibility(8);
                    if (org.telegram.messenger.g0.Q1()) {
                        this.R.setForseMultiwindowLayout(true);
                    }
                    this.R.setDelegate(new mr0(this));
                    this.f49926e.addView(this.R);
                }
                this.R.setVisibility(0);
                this.P = true;
                org.telegram.ui.Components.gy gyVar4 = this.R;
                if (this.W <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.W = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.W = org.telegram.messenger.qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                if (this.X <= 0) {
                    if (org.telegram.messenger.g0.Q1()) {
                        this.X = org.telegram.messenger.g0.L(150.0f);
                    } else {
                        this.X = org.telegram.messenger.qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.g0.f22567q;
                if (point.x > point.y) {
                    i10 = this.X;
                } else {
                    i10 = this.W;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gyVar4.getLayoutParams();
                layoutParams.height = i10;
                gyVar4.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1() && (a6Var = this.f49922b0) != null) {
                    org.telegram.messenger.g0.v1(a6Var.getEditField());
                }
                this.V = i10;
                this.S.a();
                this.f49926e.requestLayout();
                org.telegram.ui.Components.ig emojiButton = this.f49922b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.gg.d, true);
                }
                if (!z9 && !this.Y) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
                    ofFloat.addUpdateListener(new jr0(this, 0));
                    ofFloat.addListener(new lr0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27527w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.ig emojiButton2 = this.f49922b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.gg.f33892e, true);
            }
            org.telegram.ui.Components.gy gyVar5 = this.R;
            if (gyVar5 != null) {
                this.P = false;
                this.B0 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    gyVar5.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.V = 0;
            }
            this.S.a();
            this.f49926e.requestLayout();
        }
    }

    public final void w0() {
        this.f49931h0 = -1;
        this.f49932i0 = -1;
        this.f49935l0 = -1;
        this.m0 = -1;
        this.f49933j0 = -1;
        this.f49934k0 = -1;
        this.f49937n0 = -1;
        this.f49938o0 = -1;
        this.f49942r0 = -1;
        this.f49944s0 = -1;
        this.f49946u0 = -1;
        this.f49947v0 = -1;
        this.f49945t0 = -1;
        this.f49949w0 = -1;
        this.f49940q0 = -1;
        this.f49951x0 = 0;
        boolean z9 = this.f49925d0;
        if (!z9 || !this.I) {
            this.f49931h0 = 0;
            this.f49932i0 = 1;
            this.f49935l0 = 2;
            this.f49951x0 = 4;
            this.m0 = 3;
        }
        int i7 = this.D;
        if (i7 != 0) {
            int i10 = this.f49951x0;
            this.f49937n0 = i10;
            this.f49951x0 = i10 + i7;
        }
        if (i7 != this.f49948w.length) {
            int i11 = this.f49951x0;
            this.f49951x0 = i11 + 1;
            this.f49938o0 = i11;
        }
        int i12 = this.f49951x0;
        int i13 = i12 + 1;
        this.f49951x0 = i13;
        this.f49939p0 = i12;
        if (!z9 || !this.I) {
            int i14 = i12 + 2;
            this.f49951x0 = i14;
            this.f49940q0 = i13;
            if (z9) {
                int i15 = i12 + 3;
                this.f49951x0 = i15;
                this.f49947v0 = i14;
                if (this.J) {
                    this.f49951x0 = i12 + 4;
                    this.f49946u0 = i15;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f49928f.f44473e;
            if (!org.telegram.messenger.t3.T(chat) || chat.megagroup) {
                int i16 = this.f49951x0;
                this.f49951x0 = i16 + 1;
                this.f49942r0 = i16;
            }
            int i17 = this.N;
            if (i17 != 1) {
                int i18 = this.f49951x0;
                this.f49951x0 = i18 + 1;
                this.f49944s0 = i18;
            }
            if (i17 == 0) {
                int i19 = this.f49951x0;
                this.f49951x0 = i19 + 1;
                this.f49945t0 = i19;
            }
            int i20 = this.f49951x0;
            int i21 = i20 + 1;
            this.f49951x0 = i21;
            this.f49949w0 = i20;
            if (this.L) {
                this.f49933j0 = i21;
                this.f49951x0 = i20 + 3;
                this.f49934k0 = i20 + 2;
            }
        }
    }
}
