package rh;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import h7.z5;
import java.util.ArrayList;
import lh.a8;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bh;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.yh;
import org.telegram.ui.Components.yy;
import org.telegram.ui.ck;
import org.telegram.ui.ex0;
import org.telegram.ui.i6;
import org.telegram.ui.ni0;
import org.telegram.ui.rn;

public final class p extends yh implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] M = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int A;
    public d1 B;
    public int C;
    public b70 D;
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public boolean J;
    public ni0 K;
    public final d L;

    public final int f47323n;

    public final p3 f47324r;

    public final t3 f47325s;
    public m.t3 v;

    public yy f47326w;

    public boolean f47327x;

    public boolean f47328y;

    public p(int i10, Context context, c6 c6Var, gi giVar) {
        super(context, c6Var, giVar);
        k kVar = new k(this);
        this.F = true;
        this.L = new d(this, 3);
        this.f47323n = i10;
        this.h = true;
        this.f34903f = true;
        p3 p3Var = new p3(context, i10, c6Var, new i6(20, this, c6Var));
        this.f47324r = p3Var;
        p3Var.setAdaptiveLinkDialogs(false);
        p3Var.setAllowTapAboveContent(false);
        addView(p3Var, z5.e(-1, -1, 119));
        addView(p3Var.getOverlayView(), z5.e(-1, -1, 119));
        p3Var.z4();
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        t3 t3Var = new t3(context, kVar);
        this.f47325s = t3Var;
        t3Var.setBackVisible(false);
        t3Var.setTopGradientVisible(false);
        Y();
        addView(t3Var, z5.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 0));
    }

    public static void K(p pVar) {
        int iDp = 0;
        if (!(pVar.f47324r.k3() || pVar.f47327x)) {
            gi giVar = pVar.f34900b;
            if (!giVar.N && giVar.O0) {
                iDp = AndroidUtilities.dp(62.0f);
            }
        }
        if (pVar.G != iDp) {
            pVar.G = iDp;
            pVar.S();
        }
    }

    public static void L(p pVar) {
        p3 p3Var = pVar.f47324r;
        if (pVar.f47327x) {
            d1 d1VarP2 = p3Var.P2();
            if (d1VarP2 != null) {
                d1VarP2.r();
                AndroidUtilities.showKeyboard(d1VarP2);
            }
            pVar.R(true);
            return;
        }
        gi giVar = pVar.f34900b;
        if (pVar.f47326w == null) {
            yy yyVar = new yy(giVar.f28635b0, true, false, false, pVar.getContext(), true, null, giVar.f28674n1, true, pVar.f34899a, false, false);
            pVar.f47326w = yyVar;
            yyVar.setVisibility(8);
            yy yyVar2 = pVar.f47326w;
            yyVar2.f35040t2 = false;
            yyVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = pVar.f47326w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            pVar.f47326w.setDelegate(new n(pVar));
            pVar.addView(pVar.f47326w, z5.e(-1, pVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = pVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.f47326w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        pVar.f47326w.setLayoutParams(layoutParams);
        pVar.f47326w.setTranslationY(0.0f);
        pVar.f47326w.setVisibility(0);
        pVar.f47327x = true;
        pVar.A = emojiPanelHeight;
        d1 d1VarP3 = p3Var.P2();
        if (d1VarP3 != null) {
            AndroidUtilities.hideKeyboard(d1VarP3);
        }
        t3 t3Var = pVar.f47325s;
        if (t3Var != null) {
            t3Var.setEmojiOpened(true);
        }
        pVar.V(false);
        pVar.requestLayout();
    }

    public static d1 M(p pVar) {
        p3 p3Var = pVar.f47324r;
        d1 focusedEditTextOrNull = p3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            d1 d1Var = pVar.B;
            return d1Var != null ? d1Var : p3Var.P2();
        }
        pVar.B = focusedEditTextOrNull;
        pVar.C = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int N(p pVar, d1 d1Var) {
        return (d1Var != pVar.B || pVar.f47324r.getFocusedEditTextOrNull() == d1Var) ? Math.max(0, d1Var.getSelectionEnd()) : Math.min(pVar.C, d1Var.length());
    }

    public static void O(p pVar, int i10, int i11) {
        gi giVar = pVar.f34900b;
        if (giVar.f28635b0 == null) {
            return;
        }
        gi giVar2 = new gi(pVar.getContext(), giVar.f28635b0, false, false, true, pVar.f34899a);
        giVar2.V1 = new l(pVar, giVar2);
        giVar2.f28650f0.f0();
        giVar2.J1(1, true);
        giVar2.h1(i10);
        giVar2.f28681p2 = new e(pVar, giVar2);
        giVar2.U = new e(pVar, giVar2);
        giVar2.T = new m(pVar, giVar2);
        giVar2.r1();
        if (i11 != 0) {
            giVar2.A1(i11);
        }
        giVar2.setFocusable(true);
        giVar2.show();
    }

    public static void U(Context context, final String str, final Utilities.Callback callback, c6 c6Var) {
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, true, false);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        final String[] strArr = {str == null ? "" : str};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(g6.b0(AndroidUtilities.dp(8.0f), g6.l1(0.05f, g6.v0(g6.G6, c6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        linearLayoutG.addView(horizontalScrollView, z5.t(-1, -2, 49, 12, 2, 12, 0));
        lh.d dVarG = rl.g(24, context, c6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        cg.l0 l0Var = new cg.l0(strArr, horizontalScrollView, dVarG, zArr2, new a8(strArr, 26), imageView, c6Var, new int[]{6}, 7);
        final org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, c6Var);
        org.telegram.ui.Cells.e3 e3Var = g3Var.f24370b;
        e3Var.setImeOptions(6);
        e3Var.setMaxLines(5);
        g3Var.setBackground(g6.b0(AndroidUtilities.dp(24.0f), g6.v0(g6.f23053d6, c6Var)));
        g3Var.setText(strArr[0]);
        e3Var.addTextChangedListener(new o(strArr, l0Var));
        linearLayoutG.addView(g3Var, z5.t(-1, -2, 55, 12, 8, 12, 0));
        dVarG.setText(LocaleController.getString(R.string.Done));
        linearLayoutG.addView(dVarG, z5.t(-1, 48, 55, 12, 12, 12, 12));
        l0Var.run();
        e3VarO.customView = linearLayoutG;
        e3VarO.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.e3 e3Var2 = g3Var.f24370b;
                e3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(e3Var2);
                boolean[] zArr3 = zArr;
                if (zArr3[0] || zArr2[0]) {
                    return;
                }
                String[] strArr2 = strArr;
                if (TextUtils.equals(str, strArr2[0])) {
                    return;
                }
                zArr3[0] = true;
                callback.run(strArr2[0]);
            }
        });
        e3VarO.show();
        int i10 = g6.f22999a7;
        e3VarO.setBackgroundColor(g6.v0(i10, c6Var));
        e3VarO.fixNavigationBar(g6.v0(i10, c6Var));
        dVarG.setOnClickListener(new jh.b0(dVarG, zArr, callback, strArr, e3VarO, 15));
        AndroidUtilities.runOnUIThread(new qf.b(g3Var, 8), 200L);
    }

    private int getEmojiPanelHeight() {
        int iR = this.f34900b.f28674n1.R();
        if (iR <= 0) {
            SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
            Point point = AndroidUtilities.displaySize;
            iR = globalEmojiSettings.getInt(point.x > point.y ? "kbd_height_land3" : "kbd_height", AndroidUtilities.dp(200.0f));
        }
        if (iR <= 0) {
            iR = AndroidUtilities.dp(200.0f);
        }
        return iR + AndroidUtilities.navigationBarHeight;
    }

    @Override
    public final void E(yh yhVar) {
        this.f34900b.T0.setTitle("");
        this.f47324r.U2.N(false);
        V(false);
        post(new d(this, 4));
    }

    @Override
    public final void G() {
        this.f47324r.x0(0);
    }

    @Override
    public final boolean I(int i10, boolean z10, int i11, boolean z11, long j10) {
        long jN8;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArgumentsC8;
        ck ckVar;
        int i12 = this.f47323n;
        boolean zRichEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        p3 p3Var = this.f47324r;
        if (!zRichEditorAllowed && !UserConfig.getInstance(i12).isPremium() && u4.f(p3Var.f47348h3, p3Var.f47350i3)) {
            x1.p0(getContext(), new b(p3Var, 0), new d(this, 2), this.f34899a);
            return false;
        }
        if (p3Var.k3() && !p3Var.m3()) {
            if (p3Var.M3()) {
                boolean zRichEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                gi giVar = this.f34900b;
                if (zRichEditorAllowed2) {
                    ArrayList arrayListZ2 = p3Var.Z2();
                    if (!arrayListZ2.isEmpty()) {
                        ArrayList arrayListB2 = p3Var.B2();
                        ArrayList arrayListY2 = p3Var.y2();
                        ArrayList arrayListA = t4.a(i12, arrayListZ2);
                        org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
                        if (n2Var instanceof rn) {
                            rn rnVar = (rn) n2Var;
                            MessageObject messageObject3 = rnVar.f42095j5;
                            MessageObject messageObject4 = rnVar.T3;
                            jN8 = rnVar.N8();
                            sendMessageChatArgumentsC8 = rnVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            jN8 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArgumentsC8 = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(giVar.F1), arrayListZ2, arrayListB2, arrayListY2, arrayListA, false, giVar.n1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArgumentsC8, j10, jN8, 0L);
                        giVar.dismiss(true);
                        return true;
                    }
                } else {
                    org.telegram.ui.ActionBar.n2 n2Var2 = giVar.f28635b0;
                    if ((n2Var2 instanceof rn) && (ckVar = ((rn) n2Var2).U) != null) {
                        ckVar.R0(u4.k(p3Var.f47348h3), z10, i10, i11);
                        giVar.dismiss(true);
                        return true;
                    }
                }
            } else {
                t3 t3Var = this.f47325s;
                if (t3Var != null) {
                    t3Var.setSendEnabled(p3Var.M3());
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public final boolean J() {
        return !this.f47324r.k3();
    }

    public final void P(b70 b70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, b70 b70Var2) {
        b70Var.j(aVar != null && aVar.f47028b.getClass() == pageBlock.getClass(), i10, null, str, new ex0(this, aVar, pageBlock, b70Var2, 24));
        b70Var.y().f22911a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        b70Var.y().f22911a.setTextSize(1, i11);
    }

    public final boolean Q() {
        p3 p3Var = this.f47324r;
        if (p3Var == null || !p3Var.k3()) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f34899a);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ArticleSaveDraftTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ArticleSaveDraftMessage);
        final int i10 = 0;
        alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {

            public final p f47184b;

            {
                this.f47184b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.f47184b.f34900b.dismiss();
                        break;
                    default:
                        p pVar = this.f47184b;
                        pVar.T();
                        pVar.f34900b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.a2(this) {

            public final p f47184b;

            {
                this.f47184b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (i11) {
                    case 0:
                        this.f47184b.f34900b.dismiss();
                        break;
                    default:
                        p pVar = this.f47184b;
                        pVar.T();
                        pVar.f34900b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.d(-2);
        alertDialog$Builder.o();
        return false;
    }

    public final void R(boolean z10) {
        if (this.f47328y) {
            this.f47328y = false;
            yy yyVar = this.f47326w;
            if (yyVar != null) {
                yyVar.u(false);
                if (!z10) {
                    this.f47326w.C();
                }
            }
        }
        this.B = null;
        yy yyVar2 = this.f47326w;
        if (yyVar2 != null) {
            yyVar2.setTranslationY(0.0f);
            this.f47326w.setVisibility(8);
        }
        this.f47327x = false;
        this.A = 0;
        t3 t3Var = this.f47325s;
        if (t3Var != null) {
            t3Var.setEmojiOpened(false);
        }
        V(false);
        requestLayout();
    }

    public final void S() {
        float f10;
        float f11;
        int iDp = this.f47328y ? AndroidUtilities.dp(245.0f) : this.A;
        yy yyVar = this.f47326w;
        gi giVar = this.f34900b;
        if (yyVar != null) {
            if (this.f47327x) {
                f11 = (this.A - iDp) + (this.f47328y ? -giVar.f28658h2 : 0.0f);
            } else {
                f11 = 0.0f;
            }
            yyVar.setTranslationY(f11);
        }
        t3 t3Var = this.f47325s;
        if (t3Var != null) {
            boolean z10 = this.f47327x;
            if (z10) {
                f10 = iDp;
            } else {
                f10 = (this.H || this.A > 0) ? 0 : AndroidUtilities.navigationBarHeight;
            }
            if (!z10 || this.f47328y) {
                f10 += giVar.f28658h2;
            }
            t3Var.getBottomContainer().animate().cancel();
            t3Var.getBottomContainer().setTranslationY(-f10);
            boolean z11 = this.f47327x;
            float f12 = z11 ? iDp : 0.0f;
            if (!z11 || this.f47328y) {
                f12 += giVar.f28658h2;
            }
            t3Var.setBottomGradientTranslationY(-f12);
            if (this.I != this.G) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = t3Var.getBottomInnerContainer().animate();
                int i10 = this.G;
                this.I = i10;
                viewPropertyAnimatorAnimate.translationY(-i10).setDuration(320L).setInterpolator(er.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f34900b.f28635b0;
        if (!(n2Var instanceof rn)) {
            return false;
        }
        rn rnVar = (rn) n2Var;
        p3 p3Var = this.f47324r;
        if (!p3Var.r2()) {
            return false;
        }
        TL_iv.RichMessage richMessageJ2 = p3Var.j2();
        AccountInstance.getInstance(this.f47323n).getMediaDataController().saveDraft(rnVar.a(), rnVar.B7(rnVar.f42095j5), "", null, null, null, null, 0L, false, false, richMessageJ2);
        ck ckVar = rnVar.U;
        if (ckVar == null) {
            return true;
        }
        ckVar.setRichDraftPreview(richMessageJ2);
        return true;
    }

    public final void V(boolean z10) {
        int iDp = 0;
        boolean z11 = this.f47324r.k3() || this.f47327x;
        gi giVar = this.f34900b;
        ih ihVar = giVar.f28694t1;
        if (giVar.f28684q2 != z11) {
            giVar.f28684q2 = z11;
            if (giVar.O0) {
                ihVar.animate().cancel();
                if (!z11) {
                    ihVar.setVisibility(0);
                }
                if (z10) {
                    ihVar.animate().alpha(z11 ? 0.0f : 1.0f).translationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f).setDuration(180L).withEndAction(new bh(giVar, z11, 3)).start();
                } else {
                    ihVar.setAlpha(z11 ? 0.0f : 1.0f);
                    ihVar.setTranslationY(z11 ? AndroidUtilities.dp(48.0f) : 0.0f);
                    ihVar.setVisibility(z11 ? 4 : 0);
                }
            }
        }
        if (!z11 && !giVar.N && giVar.O0) {
            iDp = AndroidUtilities.dp(62.0f);
        }
        this.G = iDp;
        S();
        if (this.F == z11) {
            this.F = !z11;
            requestLayout();
        }
    }

    public final void W() {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        p3 p3Var = this.f47324r;
        j9 textSelectionHelper = p3Var.getTextSelectionHelper();
        t3 t3Var = this.f47325s;
        if (t3Var == null || textSelectionHelper == null || !textSelectionHelper.y()) {
            return;
        }
        int[] iArrB4 = p3Var.B4();
        t3Var.setQuoteState(iArrB4 != null && p3Var.H3(iArrB4[0], iArrB4[1]));
        boolean zL3 = p3Var.L3();
        int[] iArr = M;
        if (zL3) {
            j9 textSelectionHelper2 = p3Var.getTextSelectionHelper();
            int i12 = textSelectionHelper2.f24540u0;
            int i13 = textSelectionHelper2.f24541v0;
            int i14 = textSelectionHelper2.f24544y0;
            int i15 = textSelectionHelper2.f24542w0;
            int i16 = textSelectionHelper2.f24545z0;
            int i17 = 0;
            for (int i18 = 0; i18 < 8; i18++) {
                int i19 = iArr[i18];
                if (this.f47324r.K3(i19, i12, i13, i15, i14, i16)) {
                    i17 |= i19;
                }
            }
            boolean z12 = i13 == i14;
            d1 d1VarN4 = z12 ? p3Var.N4(i12, i13) : null;
            int iMax = Math.max(0, Math.min(i15, i16));
            int iMax2 = d1VarN4 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), d1VarN4.length()));
            this.f47325s.c(i17, d1VarN4 != null && iMax < iMax2 && v5.h(d1VarN4.getText(), iMax, iMax2), d1VarN4 != null && iMax < iMax2 && v5.g(d1VarN4.getText(), iMax, iMax2), z12, p3Var.l2(), true);
            return;
        }
        if (p3Var.w3()) {
            j9 textSelectionHelper3 = p3Var.getTextSelectionHelper();
            d1 d1VarS2 = p3Var.s2(textSelectionHelper3.f24540u0);
            int i20 = textSelectionHelper3.f24542w0;
            int i21 = textSelectionHelper3.f24545z0;
            int iMax3 = d1VarS2 == null ? 0 : Math.max(0, Math.min(Math.min(i20, i21), d1VarS2.length()));
            int iMax4 = d1VarS2 == null ? 0 : Math.max(0, Math.min(Math.max(i20, i21), d1VarS2.length()));
            if (d1VarS2 == null || iMax3 >= iMax4) {
                i11 = 0;
            } else {
                int i22 = 0;
                for (int i23 = 0; i23 < 8; i23++) {
                    int i24 = iArr[i23];
                    if ((d1VarS2.getCurrentStyle(iMax3, iMax4) & i24) != 0) {
                        i22 |= i24;
                    }
                }
                i11 = i22;
            }
            this.f47325s.c(i11, d1VarS2 != null && iMax3 < iMax4 && v5.h(d1VarS2.getText(), iMax3, iMax4), d1VarS2 != null && iMax3 < iMax4 && v5.g(d1VarS2.getText(), iMax3, iMax4), true, p3Var.l2(), true);
            return;
        }
        int i25 = textSelectionHelper.f24540u0;
        int i26 = textSelectionHelper.f24543x0;
        int i27 = textSelectionHelper.f24542w0;
        int i28 = textSelectionHelper.f24545z0;
        boolean z13 = i25 >= 0 && i26 >= 0 && i26 >= i25 && i26 < p3Var.f47357l4.size();
        if (z13) {
            int i29 = 0;
            int i30 = 0;
            while (i29 < 8) {
                int i31 = iArr[i29];
                int i32 = i28;
                if (this.f47324r.J3(i31, i25, i27, i26, i32)) {
                    i30 |= i31;
                }
                i29++;
                i28 = i32;
            }
            i10 = i30;
        } else {
            i10 = 0;
        }
        int i33 = i28;
        if (z13) {
            Editable editableH4 = p3Var.H4(i25, i27, i26, i33);
            if (editableH4 == null ? false : v5.h(editableH4, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z13) {
            Editable editableH5 = p3Var.H4(i25, i27, i26, i33);
            if (editableH5 == null ? false : v5.g(editableH5, Math.max(0, Math.min(i27, i33)), Math.max(i27, i33))) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        this.f47325s.c(i10, z10, z11, z13 && i25 == i26, p3Var.l2(), !p3Var.I3());
    }

    public final void X() {
        t3 t3Var = this.f47325s;
        if (t3Var != null) {
            p3 p3Var = this.f47324r;
            boolean zR2 = p3Var.r2();
            b2 b2Var = p3Var.F3;
            boolean z10 = (b2Var == null || b2Var.f47064c.isEmpty()) ? false : true;
            ImageView imageView = t3Var.f47473r;
            ImageView imageView2 = t3Var.f47472n;
            imageView2.setEnabled(zR2);
            imageView2.setAlpha(zR2 ? 1.0f : 0.35f);
            imageView.setEnabled(z10);
            imageView.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void Y() {
        t3 t3Var = this.f47325s;
        if (t3Var != null) {
            int i10 = this.f47323n;
            boolean z10 = false;
            boolean z11 = (MessagesController.getInstance(i10).richEditorAllowed() || UserConfig.getInstance(i10).isPremium()) ? false : true;
            hg sendButton = t3Var.getSendButton();
            if (z11) {
                p3 p3Var = this.f47324r;
                if (u4.f(p3Var.f47348h3, p3Var.f47350i3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            t3Var.setPremiumLocked(z11);
        }
    }

    public final void Z() {
        a aVarQ2;
        t3 t3Var = this.f47325s;
        if (t3Var == null) {
            return;
        }
        p3 p3Var = this.f47324r;
        j9 textSelectionHelper = p3Var.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.y()) {
            aVarQ2 = p3Var.Q2();
        } else {
            int i10 = textSelectionHelper.f24540u0;
            aVarQ2 = i10 == textSelectionHelper.f24543x0 ? p3Var.y4(i10) : null;
        }
        int i11 = 4;
        int i12 = 0;
        if (p3Var.R2() == null) {
            if (aVarQ2 == null) {
                i11 = 0;
            } else if (aVarQ2.a() || aVarQ2.b() || aVarQ2.c()) {
                i11 = 2;
            } else {
                TL_iv.PageBlock pageBlock = aVarQ2.f47028b;
                if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    i11 = 2;
                } else if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        i11 = 7;
                    } else {
                        if (!p3.C3(pageBlock)) {
                            TL_iv.PageBlock pageBlock2 = aVarQ2.f47028b;
                            if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) && !(pageBlock2 instanceof TL_iv.pageBlockPreformatted) && !(pageBlock2 instanceof TL_iv.pageBlockBlockquote) && !(pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                                i11 = 0;
                            }
                        }
                        i11 = 1;
                    }
                }
            }
        }
        if (aVarQ2 != null) {
            if (i11 == 1) {
                TL_iv.PageBlock pageBlock3 = aVarQ2.f47028b;
                if (pageBlock3 instanceof TL_iv.pageBlockHeading1) {
                    i12 = R.drawable.iv_h1;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading2) {
                    i12 = R.drawable.iv_h2;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading3) {
                    i12 = R.drawable.iv_h3;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading4) {
                    i12 = R.drawable.iv_h4;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading5) {
                    i12 = R.drawable.iv_h5;
                } else if (pageBlock3 instanceof TL_iv.pageBlockHeading6) {
                    i12 = R.drawable.iv_h6;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPreformatted) {
                    i12 = R.drawable.iv_code;
                } else if (pageBlock3 instanceof TL_iv.pageBlockBlockquote) {
                    i12 = R.drawable.iv_quote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                    i12 = R.drawable.iv_pullquote;
                } else if (pageBlock3 instanceof TL_iv.pageBlockFooter) {
                    i12 = R.drawable.iv_footer;
                }
            } else if (i11 == 2) {
                if (aVarQ2.a()) {
                    i12 = R.drawable.iv_todo;
                } else if (aVarQ2.c()) {
                    i12 = R.drawable.iv_ordered_list;
                }
            }
        }
        t3Var.d(i11, i12);
    }

    public final void a0() {
        int paddingTop;
        t3 t3Var = this.f47325s;
        if (t3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        p3 p3Var = this.f47324r;
        if (p3Var.getChildCount() <= 0) {
            paddingTop = p3Var.getPaddingTop();
        } else {
            int top = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < p3Var.getChildCount(); i10++) {
                View childAt = p3Var.getChildAt(i10);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < top) {
                    top = childAt.getTop();
                }
            }
            paddingTop = top == Integer.MAX_VALUE ? p3Var.getPaddingTop() : top;
        }
        t3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, paddingTop));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            Y();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        p3 p3Var = this.f47324r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f34900b.f28635b0 instanceof rn) && p3Var.r2() && T()) {
                org.telegram.messenger.y1.q(R.string.RichEditorDraftSaved, new mc(this.f47325s, this.f34899a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!p3Var.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yy yyVar;
        p3 p3Var = this.f47324r;
        d3 d3Var = p3Var.f47352j3;
        v9 v9Var = p3Var.f47354k3;
        if (d3Var.y() && v9Var.onTouchEvent(motionEvent)) {
            return true;
        }
        int height = (((!this.f47328y || (yyVar = this.f47326w) == null) ? getHeight() - this.A : (int) yyVar.getY()) - AndroidUtilities.dp(60.0f)) - this.G;
        if (motionEvent.getAction() == 0 && this.f47327x && motionEvent.getY() < height) {
            R(false);
        }
        if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < height)) && v9Var.b(motionEvent)) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getY() >= height || !p3Var.i3(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public int getCurrentItemTop() {
        p3 p3Var = this.f47324r;
        if (p3Var.getChildCount() <= 0) {
            int paddingTop = p3Var.getPaddingTop();
            this.E = paddingTop;
            p3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        int top = Integer.MAX_VALUE;
        boolean z10 = false;
        for (int i10 = 0; i10 < p3Var.getChildCount(); i10++) {
            View childAt = p3Var.getChildAt(i10);
            int iR = RecyclerView.R(childAt);
            if (iR == 0) {
                z10 = true;
            }
            if (iR >= 0 && childAt.getTop() < top) {
                top = childAt.getTop();
            }
        }
        if (top == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        p3Var.setTopGlowOffset(Math.max(0, top));
        int i11 = top - AndroidUtilities.statusBarHeight;
        int iDp = AndroidUtilities.dp(7.0f);
        if (i11 < AndroidUtilities.dp(7.0f) || !z10) {
            i11 = iDp;
        }
        this.E = i11;
        return i11;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.f47324r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public j9 getTextSelectionHelper() {
        return this.f47324r.getTextSelectionHelper();
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final boolean i() {
        boolean z10 = this.f47328y;
        if (z10) {
            if (z10) {
                this.f47328y = false;
                yy yyVar = this.f47326w;
                if (yyVar != null) {
                    yyVar.u(false);
                    this.f47326w.C();
                }
                S();
                return false;
            }
        } else {
            if (this.f47327x) {
                R(false);
                return false;
            }
            if (!this.f47324r.F2() && !Q()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void k(float f10) {
        S();
    }

    @Override
    public final void m() {
        ni0 ni0Var = this.K;
        if (ni0Var != null) {
            ni0Var.i();
            this.K = null;
        }
        m.t3 t3Var = this.v;
        if (t3Var != null) {
            t3Var.c();
        }
        p3 p3Var = this.f47324r;
        if (p3Var != null) {
            p3Var.v2();
        }
        yy yyVar = this.f47326w;
        if (yyVar != null) {
            yyVar.E();
        }
    }

    @Override
    public final boolean n() {
        p3 p3Var = this.f47324r;
        if (p3Var == null) {
            return false;
        }
        p3Var.v2();
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f47323n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Y();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f47323n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final boolean q() {
        return Q();
    }

    @Override
    public final void requestLayout() {
        if (this.J) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s() {
        m.t3 t3Var = this.v;
        if (t3Var != null) {
            t3Var.c();
        }
        if (this.f47327x) {
            R(false);
        }
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f34900b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void w() {
        this.H = this.f34900b.f28674n1.R() > AndroidUtilities.dp(20.0f);
        S();
        a0();
    }

    @Override
    public final void x(int i10, boolean z10) {
        this.H = z10;
        S();
        if (z10 && this.f47327x && !this.f47328y) {
            R(false);
        }
        a0();
    }

    @Override
    public final void z(int i10, int i11) {
        int iDp;
        int i12;
        b70 b70Var;
        boolean z10 = this.H;
        gi giVar = this.f34900b;
        boolean z11 = giVar.f28674n1.R() > AndroidUtilities.dp(20.0f);
        this.H = z11;
        if (!z11 && z10 && (b70Var = this.D) != null) {
            b70Var.u();
            this.D = null;
        }
        if (this.H || this.A > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(52.0f);
            giVar.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                i12 = (i11 / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                } else {
                    i12 = (i11 / 5) * 2;
                }
            }
            iDp = i12 - AndroidUtilities.dp(52.0f);
            if (iDp < 0) {
                iDp = 0;
            }
            giVar.setAllowNestedScroll(true);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + iDp;
        p3 p3Var = this.f47324r;
        int iC = org.telegram.messenger.y1.C(110.0f, (this.H || this.A > 0) ? 0 : AndroidUtilities.navigationBarHeight, (p3Var.k3() || this.f47327x || !giVar.O0) ? 0 : AndroidUtilities.dp(62.0f)) + this.A;
        if (p3Var.getPaddingTop() != currentActionBarHeight || p3Var.getPaddingBottom() != iC) {
            this.J = true;
            p3Var.o1(0, currentActionBarHeight, 0, iC);
            this.J = false;
        }
        a0();
    }

    @Override
    public final void r() {
    }
}
