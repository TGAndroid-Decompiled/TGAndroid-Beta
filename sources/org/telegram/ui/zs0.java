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
public final class zs0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs, org.telegram.ui.Components.uu0 {
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
    public org.telegram.ui.Components.tx0 Q;
    public org.telegram.ui.Components.vy R;
    public vh.r2 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.t0 f44052a;
    public boolean f44053a0;
    public xs0 f44054b;
    public org.telegram.ui.Cells.e6 f44055b0;
    public u71 f44056c;
    public final boolean f44057c0;
    public s4.a0 d;
    public final boolean f44058d0;
    public gd e;
    public ys0 f44059e0;
    public final un f44060f;
    public boolean f44061f0;
    public int f44062g0;
    public org.telegram.ui.Components.q30 h;
    public int f44063h0;
    public int f44064i0;
    public int f44065j0;
    public int f44066k0;
    public int f44067l0;
    public int m0;
    public final int f44068n;
    public int f44069n0;
    public int f44070o0;
    public int f44071p0;
    public int f44072q0;
    public int[] f44073r;
    public int f44074r0;
    public int f44075s;
    public int f44076s0;
    public int f44077t0;
    public int f44078u0;
    public int f44079v0;
    public final CharSequence[] f44080w;
    public int f44081w0;
    public final boolean[] f44082x;
    public int f44083x0;
    public int f44084y;
    public final m4 f44085y0;
    public TLRPC.MessageMedia f44086z0;

    public zs0(un unVar) {
        super(null);
        this.D = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = org.telegram.messenger.i0.L(3.0f);
        this.f44062g0 = -1;
        this.f44085y0 = new m4(this, 14);
        this.f44056c.getChildCount();
        this.f44058d0 = true;
        int i10 = getMessagesController().S6;
        this.f44068n = i10;
        this.f44080w = new CharSequence[i10];
        this.f44082x = new boolean[i10];
        this.f44060f = unVar;
        this.f44057c0 = org.telegram.messenger.e20.i(org.telegram.messenger.c.a(this.currentAccount).f15043a).q();
        this.L = false;
        this.N = 2;
    }

    public static org.telegram.ui.ActionBar.l e0(zs0 zs0Var) {
        return zs0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l f0(zs0 zs0Var) {
        return zs0Var.actionBar;
    }

    public static void h0(zs0 zs0Var, View view, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10 = zs0Var.f44058d0;
        if (view instanceof org.telegram.ui.Cells.e6) {
            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
            if (i10 == zs0Var.f44064i0) {
                if (z10) {
                    i14 = zs0Var.getMessagesController().T6;
                } else {
                    i14 = 255;
                }
                CharSequence charSequence = zs0Var.E;
                if (charSequence != null) {
                    i17 = charSequence.length();
                } else {
                    i17 = 0;
                }
                i13 = i14 - i17;
            } else if (i10 == zs0Var.f44065j0) {
                Editable editable = zs0Var.F;
                if (editable != null) {
                    i15 = editable.length();
                } else {
                    i15 = 0;
                }
                i14 = 200;
                i13 = 200 - i15;
            } else {
                int i18 = zs0Var.f44069n0;
                if (i10 >= i18 && i10 < zs0Var.D + i18) {
                    int i19 = i10 - i18;
                    if (z10) {
                        i11 = zs0Var.getMessagesController().U6;
                    } else {
                        i11 = 100;
                    }
                    CharSequence charSequence2 = zs0Var.f44080w[i19];
                    if (charSequence2 != null) {
                        i12 = charSequence2.length();
                    } else {
                        i12 = 0;
                    }
                    i13 = i11 - i12;
                    i14 = i11;
                } else {
                    return;
                }
            }
            float f7 = i14;
            if (i13 <= f7 - (0.7f * f7)) {
                e6Var.setText2(String.format("%d", Integer.valueOf(i13)));
                org.telegram.ui.ActionBar.u5 textView2 = e6Var.getTextView2();
                if (i13 < 0) {
                    i16 = org.telegram.ui.ActionBar.t6.f21154p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.t6.A6;
                }
                org.telegram.ui.ActionBar.a7.Y(textView2, i16, null);
                textView2.setTag(Integer.valueOf(i16));
                return;
            }
            e6Var.setText2("");
        }
    }

    public static void i0(zs0 zs0Var, org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        s4.c1 T;
        if (zs0Var.f44057c0 && z10) {
            if (zs0Var.f44055b0 == e6Var && zs0Var.P && zs0Var.B0) {
                zs0Var.o0();
                zs0Var.P = false;
            }
            org.telegram.ui.Cells.e6 e6Var2 = zs0Var.f44055b0;
            zs0Var.f44055b0 = e6Var;
            e6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.fg emojiButton = e6Var.getEmojiButton();
            org.telegram.ui.Components.dg dgVar = org.telegram.ui.Components.dg.e;
            emojiButton.j(dgVar, false);
            u71 u71Var = zs0Var.f44056c;
            View F = u71Var.F(e6Var);
            if (F == null) {
                T = null;
            } else {
                T = u71Var.T(F);
            }
            org.telegram.ui.Components.tx0 tx0Var = zs0Var.Q;
            if (tx0Var != null) {
                tx0Var.f();
                org.telegram.ui.Components.tx0 tx0Var2 = zs0Var.Q;
                if (tx0Var2 != null && T != null) {
                    View view = T.f47909a;
                    if ((view instanceof org.telegram.ui.Cells.e6) && tx0Var2.getDelegate() != view) {
                        zs0Var.Q.setDelegate((org.telegram.ui.Cells.e6) view);
                    }
                }
            }
            if (e6Var2 != null && e6Var2 != e6Var) {
                if (zs0Var.P) {
                    zs0Var.o0();
                    zs0Var.p0(false);
                    zs0Var.r0();
                }
                e6Var2.setEmojiButtonVisibility(false);
                e6Var2.getEmojiButton().j(dgVar, false);
            }
        }
    }

    public static void j0(zs0 zs0Var, org.telegram.ui.Cells.e6 e6Var) {
        zs0Var.f44055b0 = e6Var;
        if (zs0Var.P) {
            zs0Var.o0();
            zs0Var.r0();
            return;
        }
        zs0Var.v0(1);
    }

    @Override
    public final void L(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        int L;
        if (this.f44057c0) {
            if (i10 > org.telegram.messenger.i0.L(50.0f) && this.Y && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                if (z10) {
                    this.X = i10;
                    org.telegram.messenger.wp.c1().edit().putInt("kbd_height_land3", this.X).commit();
                } else {
                    this.W = i10;
                    org.telegram.messenger.wp.c1().edit().putInt("kbd_height", this.W).commit();
                }
            }
            if (this.P) {
                if (z10) {
                    i11 = this.X;
                } else {
                    i11 = this.W;
                }
                if (this.B0) {
                    i11 += org.telegram.messenger.i0.L(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = org.telegram.messenger.i0.f16172q.x;
                if (i12 != i13 || layoutParams.height != i11 || this.A0 != this.B0) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.R.setLayoutParams(layoutParams);
                    this.V = layoutParams.height;
                    this.S.a();
                    this.e.requestLayout();
                    boolean z13 = this.A0;
                    if (z13 != this.B0) {
                        if (z13) {
                            L = -org.telegram.messenger.i0.L(120.0f);
                        } else {
                            L = org.telegram.messenger.i0.L(120.0f);
                        }
                        l0(L);
                    }
                    this.A0 = this.B0;
                }
            }
            if (this.Z != i10 || this.f44053a0 != z10) {
                this.Z = i10;
                this.f44053a0 = z10;
                boolean z14 = this.Y;
                org.telegram.ui.Cells.e6 e6Var = this.f44055b0;
                if (e6Var != null) {
                    if (e6Var.getEditField().isFocused() && this.S.c() && i10 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.Y = z12;
                } else {
                    this.Y = false;
                }
                if (this.Y && this.P) {
                    v0(0);
                }
                if (this.V != 0 && !(z11 = this.Y) && z11 != z14 && !this.P) {
                    this.V = 0;
                    this.S.a();
                    this.e.requestLayout();
                }
                if (this.Y && this.T) {
                    this.T = false;
                    org.telegram.messenger.i0.r(this.f44085y0);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.m(lVar, 1, i12, getResourceProvider());
        org.telegram.ui.ActionBar.a7.b(this.actionBar, i12, getResourceProvider(), true);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.f21333z8, getResourceProvider());
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 5, i12, getResourceProvider());
        this.actionBar.setBackButtonImage(2131231241);
        boolean z10 = this.f44058d0;
        if (z10) {
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (this.I) {
                i11 = 2131744131;
            } else {
                i11 = 2131744099;
            }
            lVar2.setTitle(org.telegram.messenger.dd.L0(i11, null));
        } else if (this.N == 1) {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131748281, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131748282, null));
        }
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && ((ActionBarLayout) z4Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new rs0(this));
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        if (z10) {
            if (this.I) {
                i10 = 2131744132;
            } else {
                i10 = 2131744100;
            }
            upperCase = org.telegram.messenger.dd.L0(i10, null);
        } else {
            upperCase = org.telegram.messenger.dd.L0(2131751753, null).toUpperCase();
        }
        this.f44052a = p5.e(1, upperCase);
        this.f44054b = new xs0(this, context);
        gd gdVar = new gd(3, context, this);
        this.e = gdVar;
        gdVar.setDelegate(this);
        gd gdVar2 = this.e;
        this.fragmentView = gdVar2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20873a7, gdVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.f44056c = new u71(9, context, null);
        s4.j jVar = new s4.j();
        jVar.f47938m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.n(350L);
        this.f44056c.setItemAnimator(jVar);
        this.f44056c.setVerticalScrollBarEnabled(false);
        ((s4.j) this.f44056c.getItemAnimator()).C = false;
        s4.a0 a0Var = new s4.a0(1, false);
        this.d = a0Var;
        this.f44056c.setLayoutManager(a0Var);
        new s4.x(new ja(this, 8)).h(this.f44056c);
        frameLayout.addView(this.f44056c, w7.b6.e(-1, -1, 51));
        this.f44056c.setAdapter(this.f44054b);
        this.f44056c.setOnItemClickListener(new g(this, 23));
        this.f44056c.setOnScrollListener(new h3(this, 24));
        org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(context, 4);
        this.h = q30Var;
        q30Var.setText(org.telegram.messenger.dd.L0(2131747170, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.f44057c0) {
            org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14726i4);
            org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = tx0Var;
            tx0Var.D = true;
            tx0Var.E = true;
            tx0Var.setHorizontalPadding(org.telegram.messenger.i0.L(24.0f));
            frameLayout.addView(this.Q, w7.b6.e(-2, 160, 51));
        }
        this.S = new vh.r2(this.e, false, null);
        n0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14726i4) {
            org.telegram.ui.Components.vy vyVar = this.R;
            if (vyVar != null) {
                vyVar.P.g1();
            }
            org.telegram.ui.Cells.e6 e6Var = this.f44055b0;
            if (e6Var != null) {
                int currentTextColor = e6Var.getEditField().getCurrentTextColor();
                this.f44055b0.getEditField().setTextColor(-1);
                this.f44055b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.f44062g0 < 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false);
            if (this.actionBar.u()) {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21280w8, false);
            }
            if (i0.b.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void k0() {
        int i10;
        org.telegram.ui.Components.tx0 tx0Var = this.Q;
        if (tx0Var != null) {
            tx0Var.setDelegate(null);
            this.Q.f();
        }
        int i11 = this.D;
        this.f44082x[i11] = false;
        int i12 = i11 + 1;
        this.D = i12;
        if (this.f44073r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.f44073r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.f44075s + 1;
                    this.f44075s = i10;
                }
                iArr[i13] = i10;
            }
            this.f44073r = iArr;
        }
        if (this.D == this.f44080w.length) {
            this.f44054b.s(this.f44070o0);
        }
        this.f44054b.i(this.f44070o0);
        w0();
        this.f44061f0 = false;
        this.f44062g0 = (this.f44069n0 + this.D) - 1;
        this.f44054b.g(this.f44071p0);
    }

    public final void l0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new eg(this, f7, 3));
        ofFloat.addListener(new ss0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
        ofFloat.start();
    }

    public final boolean m0(boolean z10) {
        int i10;
        int i11;
        boolean z11;
        TLRPC.MessageMedia messageMedia = this.f44086z0;
        boolean z12 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.f44080w;
        boolean z13 = false;
        if (z12) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i12 = 0;
            for (int i13 = 0; i13 < Math.min(this.D, charSequenceArr.length); i13++) {
                if (!TextUtils.isEmpty(charSequenceArr[i13])) {
                    i12++;
                }
            }
            if ((!this.I && !TextUtils.equals(todoList.title.text, org.telegram.ui.Components.jn.b0(this.E))) || i12 != todoList.list.size()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                for (int i14 = 0; i14 < i12; i14++) {
                    if (!TextUtils.equals(charSequenceArr[i14].toString(), todoList.list.get(i14).title.text)) {
                        break;
                    }
                }
            }
            z13 = z11;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(this.E));
            if (isEmpty) {
                for (int i15 = 0; i15 < this.D && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.jn.b0(charSequenceArr[i15]))); i15++) {
                }
            }
            z13 = isEmpty;
        }
        if (z10 && !z13) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.f44058d0;
            if (z14) {
                i10 = 2131752567;
            } else {
                i10 = 2131752573;
            }
            String L0 = org.telegram.messenger.dd.L0(i10, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            if (z14) {
                i11 = 2131752568;
            } else {
                i11 = 2131752574;
            }
            x1Var.T = org.telegram.messenger.dd.L0(i11, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747596, null), new rj0(this, 4));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
            showDialog(x1Var);
        }
        return z13;
    }

    public final void n0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zs0.n0():void");
    }

    public final void o0() {
        if (this.B0) {
            this.R.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            layoutParams.height -= org.telegram.messenger.i0.L(120.0f);
            this.R.setLayoutParams(layoutParams);
            this.V = layoutParams.height;
            this.A0 = this.B0;
            this.B0 = false;
            l0(-org.telegram.messenger.i0.L(120.0f));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.P) {
            if (z10) {
                p0(true);
                return false;
            }
            return false;
        }
        return m0(z10);
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (this.f44061f0 && this.f44062g0 >= 0) {
            int i10 = 0;
            while (true) {
                if (i10 < this.f44056c.getChildCount()) {
                    view = this.f44056c.getChildAt(i10);
                    this.f44056c.getClass();
                    if (RecyclerView.R(view) == this.f44062g0) {
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof org.telegram.ui.Cells.e6) {
                org.telegram.messenger.i0.h3(new yg(((org.telegram.ui.Cells.e6) view).getTextView(), 5), 300L);
                this.f44062g0 = -1;
            }
            this.f44061f0 = false;
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
        if (this.f44057c0) {
            org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
            org.telegram.ui.Components.vy vyVar = this.R;
            if (vyVar != null) {
                this.e.removeView(vyVar);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.f44057c0) {
            p0(false);
            org.telegram.ui.Components.tx0 tx0Var = this.Q;
            if (tx0Var != null) {
                tx0Var.f();
            }
            org.telegram.ui.Cells.e6 e6Var = this.f44055b0;
            if (e6Var != null) {
                e6Var.setEmojiButtonVisibility(false);
                this.f44055b0.getTextView().clearFocus();
                org.telegram.messenger.i0.v1(this.f44055b0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        xs0 xs0Var = this.f44054b;
        if (xs0Var != null) {
            xs0Var.f();
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        ih.b bVar;
        float f7;
        super.onThemeColorsChanged();
        try {
            u71 u71Var = this.f44056c;
            if (u71Var != null) {
                for (int i11 = 0; i11 < u71Var.getChildCount(); i11++) {
                    View childAt = u71Var.getChildAt(i11);
                    s4.c1 T = u71Var.T(childAt);
                    if (T != null && (((i10 = T.f47912f) == 4 || i10 == 5) && (childAt instanceof org.telegram.ui.Cells.e6) && (bVar = ((org.telegram.ui.Cells.e6) childAt).d) != null)) {
                        int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.G6);
                        if (bVar.isEnabled()) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.6f;
                        }
                        bVar.setTextColor(org.telegram.ui.ActionBar.t6.r1(f7, themedColor));
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p0(boolean z10) {
        if (this.f44057c0) {
            if (this.P) {
                org.telegram.ui.Components.vy vyVar = this.R;
                vyVar.P.C0();
                vyVar.I.scrollTo(0, 0);
                vyVar.G(1);
                vyVar.Q.h1(0, 0);
                this.R.t(false);
                if (z10) {
                    this.R.B();
                }
                this.B0 = false;
                v0(0);
            }
            if (z10) {
                org.telegram.ui.Components.vy vyVar2 = this.R;
                if (vyVar2 != null && vyVar2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                    ofFloat.addUpdateListener(new qs0(this, 1));
                    ofFloat.addListener(new ss0(this, 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                    ofFloat.start();
                    return;
                }
                q0();
            }
        }
    }

    public final void q0() {
        org.telegram.ui.Components.vy vyVar;
        org.telegram.ui.Components.fg emojiButton;
        if (!this.P && (vyVar = this.R) != null && vyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.e6 e6Var = this.f44055b0;
            if (e6Var != null && (emojiButton = e6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.dg.e, false);
            }
            this.R.setVisibility(8);
        }
        int i10 = this.V;
        this.V = 0;
        if (i10 != 0) {
            this.S.a();
        }
    }

    public final void r0() {
        int i10;
        this.S.e = true;
        EditTextBoldCursor editField = this.f44055b0.getEditField();
        editField.requestFocus();
        org.telegram.messenger.i0.J3(editField);
        if (org.telegram.messenger.i0.D) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        v0(i10);
        if (!org.telegram.messenger.i0.D && !this.Y && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            this.T = true;
            m4 m4Var = this.f44085y0;
            org.telegram.messenger.i0.r(m4Var);
            org.telegram.messenger.i0.h3(m4Var, 100L);
        }
    }

    public final void s0(rg rgVar) {
        this.f44059e0 = rgVar;
    }

    public final void t0(TLRPC.MessageMedia messageMedia, boolean z10) {
        u0(messageMedia, z10, -1);
    }

    public final void u0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        int i12;
        this.f44086z0 = messageMedia;
        this.I = z10;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.E = spannableStringBuilder;
            CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
            this.E = m10;
            Spannable A5 = org.telegram.messenger.kj.A5(m10, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.E = A5;
            org.telegram.messenger.kj.b(A5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.D = size;
            this.f44084y = size;
            this.f44075s = 0;
            this.f44073r = new int[size];
            int i13 = 0;
            while (true) {
                i11 = this.D;
                if (i13 >= i11) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i13).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.f44080w;
                charSequenceArr[i13] = spannableStringBuilder2;
                charSequenceArr[i13] = org.telegram.messenger.k6.m(charSequenceArr[i13], textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i13] = org.telegram.messenger.kj.A5(charSequenceArr[i13], tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                org.telegram.messenger.kj.b(charSequenceArr[i13], tL_textWithEntities.entities, false, false, false, false, 0);
                this.f44073r[i13] = tL_messageMediaToDo.todo.list.get(i13).f19941id;
                this.f44075s = Math.max(this.f44075s, this.f44073r[i13]);
                i13++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.D = i11 + 1;
                w0();
                this.f44061f0 = true;
                int i14 = this.f44069n0;
                if (i10 < 0) {
                    i12 = this.D - 1;
                } else {
                    i12 = i10;
                }
                this.f44062g0 = i14 + i12;
            }
        }
    }

    public final void v0(int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.Cells.e6 e6Var;
        if (this.f44057c0) {
            if (i10 == 1) {
                org.telegram.ui.Components.vy vyVar = this.R;
                if (vyVar != null && vyVar.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.vy vyVar2 = this.R;
                if (vyVar2 != null && vyVar2.f31943c1 != org.telegram.messenger.e20.f15506s0) {
                    this.e.removeView(vyVar2);
                    this.R = null;
                }
                if (this.R == null) {
                    org.telegram.ui.Components.vy vyVar3 = new org.telegram.ui.Components.vy(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.R = vyVar3;
                    vyVar3.f32011x2 = false;
                    vyVar3.U0 = false;
                    vyVar3.setVisibility(8);
                    if (org.telegram.messenger.i0.Q1()) {
                        this.R.setForseMultiwindowLayout(true);
                    }
                    this.R.setDelegate(new ts0(this));
                    this.e.addView(this.R);
                }
                this.R.setVisibility(0);
                this.P = true;
                org.telegram.ui.Components.vy vyVar4 = this.R;
                if (this.W <= 0) {
                    if (org.telegram.messenger.i0.Q1()) {
                        this.W = org.telegram.messenger.i0.L(150.0f);
                    } else {
                        this.W = org.telegram.messenger.wp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
                    }
                }
                if (this.X <= 0) {
                    if (org.telegram.messenger.i0.Q1()) {
                        this.X = org.telegram.messenger.i0.L(150.0f);
                    } else {
                        this.X = org.telegram.messenger.wp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
                    }
                }
                Point point = org.telegram.messenger.i0.f16172q;
                if (point.x > point.y) {
                    i11 = this.X;
                } else {
                    i11 = this.W;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vyVar4.getLayoutParams();
                layoutParams.height = i11;
                vyVar4.setLayoutParams(layoutParams);
                if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1() && (e6Var = this.f44055b0) != null) {
                    org.telegram.messenger.i0.v1(e6Var.getEditField());
                }
                this.V = i11;
                this.S.a();
                this.e.requestLayout();
                org.telegram.ui.Components.fg emojiButton = this.f44055b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.dg.d, true);
                }
                if (!z10 && !this.Y) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
                    ofFloat.addUpdateListener(new qs0(this, 0));
                    ofFloat.addListener(new ss0(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            org.telegram.ui.Components.fg emojiButton2 = this.f44055b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.dg.e, true);
            }
            org.telegram.ui.Components.vy vyVar5 = this.R;
            if (vyVar5 != null) {
                this.P = false;
                this.B0 = false;
                if (org.telegram.messenger.i0.D || org.telegram.messenger.i0.E) {
                    vyVar5.setVisibility(8);
                }
            }
            if (i10 == 0) {
                this.V = 0;
            }
            this.S.a();
            this.e.requestLayout();
        }
    }

    public final void w0() {
        this.f44063h0 = -1;
        this.f44064i0 = -1;
        this.f44067l0 = -1;
        this.m0 = -1;
        this.f44065j0 = -1;
        this.f44066k0 = -1;
        this.f44069n0 = -1;
        this.f44070o0 = -1;
        this.f44074r0 = -1;
        this.f44076s0 = -1;
        this.f44078u0 = -1;
        this.f44079v0 = -1;
        this.f44077t0 = -1;
        this.f44081w0 = -1;
        this.f44072q0 = -1;
        this.f44083x0 = 0;
        boolean z10 = this.f44058d0;
        if (!z10 || !this.I) {
            this.f44063h0 = 0;
            this.f44064i0 = 1;
            this.f44067l0 = 2;
            this.f44083x0 = 4;
            this.m0 = 3;
        }
        int i10 = this.D;
        if (i10 != 0) {
            int i11 = this.f44083x0;
            this.f44069n0 = i11;
            this.f44083x0 = i11 + i10;
        }
        if (i10 != this.f44080w.length) {
            int i12 = this.f44083x0;
            this.f44083x0 = i12 + 1;
            this.f44070o0 = i12;
        }
        int i13 = this.f44083x0;
        int i14 = i13 + 1;
        this.f44083x0 = i14;
        this.f44071p0 = i13;
        if (!z10 || !this.I) {
            int i15 = i13 + 2;
            this.f44083x0 = i15;
            this.f44072q0 = i14;
            if (z10) {
                int i16 = i13 + 3;
                this.f44083x0 = i16;
                this.f44079v0 = i15;
                if (this.J) {
                    this.f44083x0 = i13 + 4;
                    this.f44078u0 = i16;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f44060f.e;
            if (!org.telegram.messenger.w3.T(chat) || chat.megagroup) {
                int i17 = this.f44083x0;
                this.f44083x0 = i17 + 1;
                this.f44074r0 = i17;
            }
            int i18 = this.N;
            if (i18 != 1) {
                int i19 = this.f44083x0;
                this.f44083x0 = i19 + 1;
                this.f44076s0 = i19;
            }
            if (i18 == 0) {
                int i20 = this.f44083x0;
                this.f44083x0 = i20 + 1;
                this.f44077t0 = i20;
            }
            int i21 = this.f44083x0;
            int i22 = i21 + 1;
            this.f44083x0 = i22;
            this.f44081w0 = i21;
            if (this.L) {
                this.f44065j0 = i22;
                this.f44083x0 = i21 + 3;
                this.f44066k0 = i21 + 2;
            }
        }
    }
}
