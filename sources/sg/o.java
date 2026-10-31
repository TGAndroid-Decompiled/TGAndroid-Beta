package sg;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.i21;
import org.telegram.ui.ns0;
import w7.b6;
public final class o extends k2 implements us {
    public final Paint D;
    public u51 E;
    public final ArrayList F;
    public final ArrayList G;
    public final LinkedHashMap H;
    public final ArrayList I;
    public final LinkedHashMap J;
    public final ArrayList K;
    public boolean L;
    public final int M;
    public boolean N;
    public boolean O;
    public fe.b P;
    public final TLRPC.ChatFull Q;
    public final long R;
    public int S;
    public int T;
    public TLRPC.Chat U;
    public TL_stories.TL_premium_boostsStatus V;
    public int W;
    public int X;
    public boolean Y;
    public final h Z;
    public boolean f48421a;
    public m f48422b;
    public org.telegram.ui.Components.voip.i0 f48423c;
    public f d;
    public t8 e;
    public b9 f48424f;
    public l h;
    public x7 f48425n;
    public t8 f48426r;
    public r0 f48427s;
    public FrameLayout f48428w;
    public ImageView f48429x;
    public int f48430y;

    public o(long j10, TLRPC.ChatFull chatFull) {
        super(null);
        this.D = new Paint();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new LinkedHashMap();
        this.I = new ArrayList();
        this.J = new LinkedHashMap();
        this.K = new ArrayList();
        this.M = getMessagesController().f18963z4;
        this.N = false;
        this.X = -1;
        this.Z = new h(this, 6);
        this.R = j10;
        this.Q = chatFull;
    }

    public static boolean Y(o oVar) {
        return oVar.inPreviewMode;
    }

    public static boolean Z(o oVar) {
        return oVar.inBubbleMode;
    }

    public final void a0(View view, boolean z10) {
        this.F.add(view);
        this.G.add(Boolean.valueOf(z10));
    }

    public final void b0(o5 o5Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(o5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            o5[] o5VarArr = (o5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), o5.class);
            for (o5 o5Var2 : o5VarArr) {
                o5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean c0(boolean z10) {
        boolean z11 = !this.H.keySet().equals(this.J.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.W) {
            z11 = false;
        }
        if (this.L != this.f48421a) {
            z11 = true;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String L0 = cd.L0(2131743860, "UnsavedChanges");
            x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = cd.L0(2131746422, "ReactionApplyChangesDialog");
            alertDialog$Builder.k(cd.L0(2131754216, "ApplyTheme"), new u1(this) {
                public final o f48336b;

                {
                    this.f48336b = this;
                }

                @Override
                public final void h(x1 x1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f48336b.f48427s.performClick();
                            return;
                        default:
                            this.f48336b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(cd.L0(2131751407, null), new u1(this) {
                public final o f48336b;

                {
                    this.f48336b = this;
                }

                @Override
                public final void h(x1 x1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f48336b.f48427s.performClick();
                            return;
                        default:
                            this.f48336b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.p();
        }
        return z11;
    }

    @Override
    public final boolean canBeginSlide() {
        if (c0(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r25) {
        throw new UnsupportedOperationException("Method not decompiled: sg.o.createView(android.content.Context):android.view.View");
    }

    public final void d0(boolean z10) {
        if (this.V == null) {
            return;
        }
        if (this.X == 0) {
            this.X = 1;
        }
        int size = g0(true).size();
        this.W = size;
        if (this.V.level < size) {
            if (z10) {
                cc.a0(this).Q(2131623981, 36, org.telegram.messenger.i0.W2(cd.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
            }
            this.f48427s.setLvlRequiredState(this.W);
            return;
        }
        this.f48427s.g(null, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19726y1 && ((Long) objArr[0]).longValue() == (-this.R)) {
            z4 z4Var = this.parentLayout;
            if (z4Var != null && z4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0() {
        if (this.N) {
            this.N = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.E.setFocusableInTouchMode(true);
                this.E.requestFocus();
            } else {
                this.h.clearFocus();
            }
            zs.e().k(zs.f19633j1, 512);
            this.f48423c.setLayerType(2, null);
            this.P.a(false, true);
        }
    }

    public final boolean f0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        o5[] o5VarArr = (o5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, o5.class);
        for (o5 o5Var : o5VarArr) {
            this.H.remove(Long.valueOf(o5Var.documentId));
            this.I.remove(Long.valueOf(o5Var.documentId));
            this.f48422b.A(Long.valueOf(o5Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        d0(false);
        return true;
    }

    public final ArrayList g0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.I;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (l4.longValue() != -1) {
                ArrayList arrayList4 = this.K;
                int size2 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList4.get(i11);
                        i11++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l4.longValue() == tL_availableReaction.activate_animation.f19799id) {
                            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                            tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                            arrayList.add(tL_reactionEmoji);
                            break;
                        }
                    } else {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l4.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                }
            }
        }
        if (z10) {
            return arrayList2;
        }
        return arrayList;
    }

    @Override
    public final tk0 getListViewForSimpleGlass() {
        return this.E;
    }

    public final void h0(int i10, boolean z10, boolean z11) {
        boolean z12;
        int i11;
        int i12;
        if (this.X != i10 || this.f48421a != z10) {
            this.f48421a = z10;
            if (i10 != 1 && i10 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.e.setChecked(z12);
            if (z12) {
                i11 = t6.f20966f6;
            } else {
                i11 = t6.f20948e6;
            }
            int x02 = t6.x0(null, i11, false);
            if (z11) {
                if (z12) {
                    this.e.b(x02, true);
                } else {
                    this.e.setBackgroundColorAnimatedReverse(x02);
                }
            } else {
                t8 t8Var = this.e;
                if (z12) {
                    i12 = t6.f20966f6;
                } else {
                    i12 = t6.f20948e6;
                }
                a7.i(i12, t8Var, null);
            }
            this.X = i10;
            if (i10 != 1 && i10 != 0 && !z10) {
                if (z11) {
                    e0();
                    this.f48428w.animate().setListener(null).cancel();
                    this.f48428w.animate().alpha(0.0f).setDuration(350L).setInterpolator(gr.f26495f).setListener(new ns0(this, 29)).start();
                    this.h.setFocusableInTouchMode(false);
                    this.E.f30819f3.O(true);
                    return;
                }
                this.f48428w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.E.f30819f3.O(false);
                return;
            }
            this.f48428w.setVisibility(0);
            this.E.f30819f3.O(z11);
            if (z11) {
                this.f48428w.animate().setListener(null).cancel();
                this.f48428w.animate().alpha(1.0f).setDuration(350L).setInterpolator(gr.f26495f).start();
                this.E.post(new h(this, 1));
                LinkedHashMap linkedHashMap = this.H;
                if (linkedHashMap.isEmpty()) {
                    this.f48422b.K.clear();
                    this.h.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.K;
                    int size = arrayList.size();
                    int i13 = 0;
                    int i14 = 0;
                    while (i14 < size) {
                        int i15 = i14 + 1;
                        q0.a((TLRPC.TL_availableReaction) arrayList.get(i14), linkedHashMap, this.I, spannableStringBuilder, this.f48422b, this.h.getFontMetricsInt());
                        i13++;
                        if (i13 >= this.M) {
                            break;
                        }
                        i14 = i15;
                    }
                    this.h.append(spannableStringBuilder);
                    this.h.I();
                    i21 i21Var = this.f48422b.f38144p0;
                    if (i21Var != null) {
                        i21Var.f();
                    }
                    d0(false);
                }
            }
        }
    }

    public final void i0(float f7) {
        float a2 = w7.u.a(f7, 0.0f, 1.0f);
        org.telegram.ui.Components.voip.i0 i0Var = this.f48423c;
        if (i0Var != null && this.f48428w != null) {
            i0Var.setTranslationY((1.0f - a2) * i0Var.getMeasuredHeight());
            this.f48428w.setTranslationY((-a2) * this.f48423c.getMeasuredHeight());
        }
        k0();
        m0();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        t8 t8Var = this.f48426r;
        boolean z10 = t8Var.e.h;
        int i10 = this.M;
        LinkedHashMap linkedHashMap = this.H;
        ArrayList arrayList = this.I;
        if (z10) {
            t8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            o5 o5Var = (o5) linkedHashMap.remove(-1L);
            if (o5Var != null) {
                o5Var.setRemoved(new rh.o(20, this, o5Var));
            }
            b0(o5Var);
            this.f48422b.x(-1L, true);
            d0(false);
            this.h.setMaxLength(i10);
            h0(this.X, this.f48421a, true);
        } else {
            t8Var.setChecked(true);
            try {
                this.h.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = f5.f();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.f48422b.x(-1L, true);
                d0(true);
                b0(nVar);
            } catch (Exception e) {
                f8.g(e, true);
            }
            h0(this.X, true, true);
        }
        this.h.k(true);
    }

    public final void k0() {
        float f7;
        if (this.f48428w != null && this.f48427s != null) {
            fe.b bVar = this.P;
            if (bVar != null) {
                f7 = bVar.e;
            } else {
                f7 = 0.0f;
            }
            int round = Math.round((1.0f - f7) * this.f48430y);
            ViewGroup.LayoutParams layoutParams = this.f48428w.getLayoutParams();
            layoutParams.height = org.telegram.messenger.i0.L(74.0f) + round;
            this.f48428w.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f48427s.getLayoutParams();
            layoutParams2.bottomMargin = org.telegram.messenger.i0.L(13.0f) + round;
            this.f48427s.setLayoutParams(layoutParams2);
        }
    }

    public final void l0() {
        if (this.f48423c != null) {
            this.D.setColor(t6.w0(t6.f20929d6, this.resourceProvider));
            this.f48423c.setPadding(0, 0, 0, this.f48430y);
            this.f48423c.invalidate();
        }
    }

    public final void m0() {
        float f7;
        if (this.E == null) {
            return;
        }
        fe.b bVar = this.P;
        if (bVar != null) {
            f7 = bVar.e;
        } else {
            f7 = 0.0f;
        }
        int W1 = org.telegram.messenger.i0.W1(f7, org.telegram.messenger.i0.L(72.0f), org.telegram.messenger.i0.L(12.0f) + Math.max(0, this.f48423c.getMeasuredHeight() - this.mSystemInsets.d));
        u51 u51Var = this.E;
        i0.c cVar = this.mSystemInsets;
        ei.b.e(u51Var, cVar.f7766b, cVar.d, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), W1);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.N) {
            if (z10) {
                e0();
                return false;
            }
        } else if (!c0(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        vp messagesController = getMessagesController();
        long j10 = this.R;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        this.U = L0;
        if (L0 == null) {
            TLRPC.Chat P = hs.a0(this.currentAccount).P(j10);
            this.U = P;
            if (P != null) {
                getMessagesController().N3(this.U, true);
            }
            return false;
        }
        if (this.Q != null) {
            getMessagesController().G0().a(-j10, new i(this, 0));
            getNotificationCenter().c(this, zs.V4);
            this.K.addAll(getMediaDataController().f18332n);
            zs.e().k(zs.f19633j1, 512);
            getNotificationCenter().c(this, zs.f19726y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.i0.r(this.Z);
        if (this.X == 2 && this.T != this.S) {
            getMessagesController().D4(this.R, this.X, g0(false), this.T, null, null, null);
        }
        getNotificationCenter().n(this, zs.V4);
        getNotificationCenter().n(this, zs.f19726y1);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f48430y = i13;
        k0();
        l0();
        m0();
    }

    @Override
    public final void onPause() {
        this.Y = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.Y) {
            this.Y = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.N) {
                this.h.J(false);
                org.telegram.messenger.i0.h3(new h(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        try {
            super.onThemeColorsChanged();
            t8 t8Var = this.e;
            if (t8Var != null && (t8Var.getBackground() instanceof ColorDrawable)) {
                t8 t8Var2 = this.e;
                if (t8Var2.e.h) {
                    i10 = t6.f20966f6;
                } else {
                    i10 = t6.f20948e6;
                }
                t8Var2.setBackgroundColor(t6.x0(null, i10, false));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.X != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z10) {
            this.O = true;
        }
        if (z10 && !z11) {
            if (this.f48422b == null) {
                m mVar = new m(this, this, getParentActivity(), getResourceProvider(), t6.w0(t6.G6, getResourceProvider()));
                this.f48422b = mVar;
                mVar.setAnimationsEnabled(false);
                this.f48422b.setClipChildren(false);
                a7.i(t6.f20929d6, this.f48422b, null);
                this.f48423c.addView(this.f48422b, b6.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new i(this, 1));
                this.f48423c.addView(this.d, b6.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.f48422b.x((Long) obj, false);
                }
            }
            org.telegram.messenger.i0.h3(new r5.a(6), 200L);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
