package th;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
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
import i7.f6;
import java.util.ArrayList;
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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.ph;
import org.telegram.ui.Components.tc;
import org.telegram.ui.dk;
import org.telegram.ui.ki0;
import org.telegram.ui.lx0;
import org.telegram.ui.tn;
public final class p extends fi implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] M = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int A;
    public d1 B;
    public int C;
    public j70 D;
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public boolean J;
    public ki0 K;
    public final d L;
    public final int f48622n;
    public final p3 f48623r;
    public final t3 f48624s;
    public m.s3 v;
    public fz f48625w;
    public boolean f48626x;
    public boolean f48627y;

    public p(int i10, Context context, c6 c6Var, ni niVar) {
        super(context, c6Var, niVar);
        k kVar = new k(this);
        this.F = true;
        this.L = new d(this, 3);
        this.f48622n = i10;
        this.h = true;
        this.f28406f = true;
        p3 p3Var = new p3(context, i10, c6Var, new oc.i(this, c6Var, false, 26));
        this.f48623r = p3Var;
        p3Var.setAdaptiveLinkDialogs(false);
        p3Var.setAllowTapAboveContent(false);
        addView(p3Var, f6.e(-1, -1, 119));
        addView(p3Var.getOverlayView(), f6.e(-1, -1, 119));
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
        this.f48624s = t3Var;
        t3Var.setBackVisible(false);
        t3Var.setTopGradientVisible(false);
        Y();
        addView(t3Var, f6.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 0));
    }

    public static void J(p pVar) {
        boolean z10;
        int i10 = 0;
        if (!pVar.f48623r.k3() && !pVar.f48626x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ni niVar = pVar.f28403b;
            if (!niVar.N && niVar.O0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (pVar.G != i10) {
            pVar.G = i10;
            pVar.S();
        }
    }

    public static void K(p pVar) {
        p3 p3Var = pVar.f48623r;
        if (pVar.f48626x) {
            d1 P2 = p3Var.P2();
            if (P2 != null) {
                P2.r();
                AndroidUtilities.showKeyboard(P2);
            }
            pVar.R(true);
            return;
        }
        ni niVar = pVar.f28403b;
        if (pVar.f48625w == null) {
            fz fzVar = new fz(niVar.f30990b0, true, false, false, pVar.getContext(), true, null, niVar.f31029n1, true, pVar.f28402a, false, false);
            pVar.f48625w = fzVar;
            fzVar.setVisibility(8);
            fz fzVar2 = pVar.f48625w;
            fzVar2.f28638t2 = false;
            fzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = pVar.f48625w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            pVar.f48625w.setDelegate(new n(pVar));
            pVar.addView(pVar.f48625w, f6.e(-1, pVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = pVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.f48625w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        pVar.f48625w.setLayoutParams(layoutParams);
        pVar.f48625w.setTranslationY(0.0f);
        pVar.f48625w.setVisibility(0);
        pVar.f48626x = true;
        pVar.A = emojiPanelHeight;
        d1 P22 = p3Var.P2();
        if (P22 != null) {
            AndroidUtilities.hideKeyboard(P22);
        }
        t3 t3Var = pVar.f48624s;
        if (t3Var != null) {
            t3Var.setEmojiOpened(true);
        }
        pVar.V(false);
        pVar.requestLayout();
    }

    public static d1 L(p pVar) {
        p3 p3Var = pVar.f48623r;
        d1 focusedEditTextOrNull = p3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            pVar.B = focusedEditTextOrNull;
            pVar.C = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        d1 d1Var = pVar.B;
        if (d1Var != null) {
            return d1Var;
        }
        return p3Var.P2();
    }

    public static int M(p pVar, d1 d1Var) {
        if (d1Var == pVar.B && pVar.f48623r.getFocusedEditTextOrNull() != d1Var) {
            return Math.min(pVar.C, d1Var.length());
        }
        return Math.max(0, d1Var.getSelectionEnd());
    }

    public static void O(p pVar, int i10, int i11) {
        ni niVar = pVar.f28403b;
        if (niVar.f30990b0 == null) {
            return;
        }
        ni niVar2 = new ni(pVar.getContext(), niVar.f30990b0, false, false, true, pVar.f28402a);
        niVar2.V1 = new l(pVar, niVar2);
        niVar2.f31005f0.f0();
        niVar2.J1(1, true);
        niVar2.h1(i10);
        niVar2.f31036p2 = new e(pVar, niVar2);
        niVar2.U = new e(pVar, niVar2);
        niVar2.T = new m(pVar, niVar2);
        niVar2.r1();
        if (i11 != 0) {
            niVar2.A1(i11);
        }
        niVar2.setFocusable(true);
        niVar2.show();
    }

    public static void U(Context context, final String str, final Utilities.Callback callback, c6 c6Var) {
        String str2;
        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, true, false);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
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
        g10.addView(horizontalScrollView, f6.t(-1, -2, 49, 12, 2, 12, 0));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        eg.l0 l0Var = new eg.l0(strArr, horizontalScrollView, o10, zArr2, new nh.t4(strArr, 27), imageView, c6Var, new int[]{6}, 7);
        final org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, c6Var);
        org.telegram.ui.Cells.e3 e3Var = g3Var.f24387b;
        e3Var.setImeOptions(6);
        e3Var.setMaxLines(5);
        g3Var.setBackground(g6.b0(AndroidUtilities.dp(24.0f), g6.v0(g6.f23062d6, c6Var)));
        g3Var.setText(strArr[0]);
        e3Var.addTextChangedListener(new o(strArr, l0Var));
        g10.addView(g3Var, f6.t(-1, -2, 55, 12, 8, 12, 0));
        o10.setText(LocaleController.getString(R.string.Done));
        g10.addView(o10, f6.t(-1, 48, 55, 12, 12, 12, 12));
        l0Var.run();
        q6.customView = g10;
        q6.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.e3 e3Var2 = org.telegram.ui.Cells.g3.this.f24387b;
                e3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(e3Var2);
                boolean[] zArr3 = zArr;
                if (!zArr3[0] && !zArr2[0]) {
                    String[] strArr2 = strArr;
                    if (!TextUtils.equals(str, strArr2[0])) {
                        zArr3[0] = true;
                        callback.run(strArr2[0]);
                    }
                }
            }
        });
        q6.show();
        int i10 = g6.f23009a7;
        q6.setBackgroundColor(g6.v0(i10, c6Var));
        q6.fixNavigationBar(g6.v0(i10, c6Var));
        o10.setOnClickListener(new lh.b0(o10, zArr, callback, strArr, q6, 15));
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.t1(g3Var, 22), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int R = this.f28403b.f31029n1.R();
        if (R <= 0) {
            SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                str = "kbd_height_land3";
            } else {
                str = "kbd_height";
            }
            R = globalEmojiSettings.getInt(str, AndroidUtilities.dp(200.0f));
        }
        if (R <= 0) {
            R = AndroidUtilities.dp(200.0f);
        }
        return R + AndroidUtilities.navigationBarHeight;
    }

    @Override
    public final void D(fi fiVar) {
        this.f28403b.T0.setTitle("");
        this.f48623r.U2.N(false);
        V(false);
        post(new d(this, 4));
    }

    @Override
    public final void F() {
        this.f48623r.x0(0);
    }

    @Override
    public final boolean H(int i10, boolean z10, int i11, boolean z11, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        dk dkVar;
        int i12 = this.f48622n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        p3 p3Var = this.f48623r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && u4.f(p3Var.f48646h3, p3Var.f48648i3)) {
            x1.p0(getContext(), new b(p3Var, 0), new d(this, 2), this.f28402a);
            return false;
        }
        if (p3Var.k3() && !p3Var.m3()) {
            if (!p3Var.M3()) {
                t3 t3Var = this.f48624s;
                if (t3Var != null) {
                    t3Var.setSendEnabled(p3Var.M3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                ni niVar = this.f28403b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
                    if ((o2Var instanceof tn) && (dkVar = ((tn) o2Var).U) != null) {
                        dkVar.R0(u4.k(p3Var.f48646h3), z10, i10, i11);
                        niVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList Z2 = p3Var.Z2();
                    if (!Z2.isEmpty()) {
                        ArrayList B2 = p3Var.B2();
                        ArrayList y22 = p3Var.y2();
                        ArrayList a2 = t4.a(i12, Z2);
                        org.telegram.ui.ActionBar.o2 o2Var2 = niVar.f30990b0;
                        if (o2Var2 instanceof tn) {
                            tn tnVar = (tn) o2Var2;
                            MessageObject messageObject3 = tnVar.f42856j5;
                            MessageObject messageObject4 = tnVar.T3;
                            j11 = tnVar.N8();
                            sendMessageChatArguments = tnVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(niVar.F1), Z2, B2, y22, a2, false, niVar.n1(), messageObject, messageObject2, z10, i10, i11, sendMessageChatArguments, j10, j11, 0L);
                        niVar.dismiss(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean I() {
        return !this.f48623r.k3();
    }

    public final void P(j70 j70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, j70 j70Var2) {
        boolean z10;
        if (aVar != null && aVar.f48328b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        j70Var.j(z10, i10, null, str, new lx0(this, aVar, pageBlock, j70Var2, 26));
        j70Var.y().f22963a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        j70Var.y().f22963a.setTextSize(1, i11);
    }

    public final boolean Q() {
        p3 p3Var = this.f48623r;
        if (p3Var != null && p3Var.k3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f28402a);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                public final p f48484b;

                {
                    this.f48484b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f48484b.f28403b.dismiss();
                            return;
                        default:
                            p pVar = this.f48484b;
                            pVar.T();
                            pVar.f28403b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.b2(this) {
                public final p f48484b;

                {
                    this.f48484b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f48484b.f28403b.dismiss();
                            return;
                        default:
                            p pVar = this.f48484b;
                            pVar.T();
                            pVar.f28403b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-2);
            alertDialog$Builder.o();
            return false;
        }
        return true;
    }

    public final void R(boolean z10) {
        if (this.f48627y) {
            this.f48627y = false;
            fz fzVar = this.f48625w;
            if (fzVar != null) {
                fzVar.t(false);
                if (!z10) {
                    this.f48625w.B();
                }
            }
        }
        this.B = null;
        fz fzVar2 = this.f48625w;
        if (fzVar2 != null) {
            fzVar2.setTranslationY(0.0f);
            this.f48625w.setVisibility(8);
        }
        this.f48626x = false;
        this.A = 0;
        t3 t3Var = this.f48624s;
        if (t3Var != null) {
            t3Var.setEmojiOpened(false);
        }
        V(false);
        requestLayout();
    }

    public final void S() {
        int i10;
        int i11;
        float f9;
        int i12;
        float f10;
        float f11;
        if (this.f48627y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.A;
        }
        fz fzVar = this.f48625w;
        float f12 = 0.0f;
        ni niVar = this.f28403b;
        if (fzVar != null) {
            if (this.f48626x) {
                float f13 = this.A - i10;
                if (this.f48627y) {
                    f11 = -niVar.f31013h2;
                } else {
                    f11 = 0.0f;
                }
                f10 = f13 + f11;
            } else {
                f10 = 0.0f;
            }
            fzVar.setTranslationY(f10);
        }
        t3 t3Var = this.f48624s;
        if (t3Var != null) {
            boolean z10 = this.f48626x;
            if (z10) {
                f9 = i10;
            } else {
                if (!this.H && this.A <= 0) {
                    i11 = AndroidUtilities.navigationBarHeight;
                } else {
                    i11 = 0;
                }
                f9 = i11;
            }
            if (!z10 || this.f48627y) {
                f9 += niVar.f31013h2;
            }
            t3Var.getBottomContainer().animate().cancel();
            t3Var.getBottomContainer().setTranslationY(-f9);
            boolean z11 = this.f48626x;
            if (z11) {
                f12 = i10;
            }
            if (!z11 || this.f48627y) {
                f12 += niVar.f31013h2;
            }
            t3Var.setBottomGradientTranslationY(-f12);
            if (this.I != this.G) {
                ViewPropertyAnimator animate = t3Var.getBottomInnerContainer().animate();
                this.I = this.G;
                animate.translationY(-i12).setDuration(320L).setInterpolator(jr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f28403b.f30990b0;
        if (o2Var instanceof tn) {
            tn tnVar = (tn) o2Var;
            p3 p3Var = this.f48623r;
            if (!p3Var.r2()) {
                return false;
            }
            TL_iv.RichMessage j22 = p3Var.j2();
            AccountInstance.getInstance(this.f48622n).getMediaDataController().saveDraft(tnVar.a(), tnVar.B7(tnVar.f42856j5), "", null, null, null, null, 0L, false, false, j22);
            dk dkVar = tnVar.U;
            if (dkVar != null) {
                dkVar.setRichDraftPreview(j22);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void V(boolean z10) {
        boolean z11;
        int i10;
        int i11 = 0;
        if (!this.f48623r.k3() && !this.f48626x) {
            z11 = false;
        } else {
            z11 = true;
        }
        ni niVar = this.f28403b;
        ph phVar = niVar.f31049t1;
        if (niVar.f31039q2 != z11) {
            niVar.f31039q2 = z11;
            if (niVar.O0) {
                phVar.animate().cancel();
                if (!z11) {
                    phVar.setVisibility(0);
                }
                float f9 = 1.0f;
                float f10 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = phVar.animate();
                    if (z11) {
                        f9 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f9);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    alpha.translationY(f10).setDuration(180L).withEndAction(new ih(niVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f9 = 0.0f;
                    }
                    phVar.setAlpha(f9);
                    if (z11) {
                        f10 = AndroidUtilities.dp(48.0f);
                    }
                    phVar.setTranslationY(f10);
                    if (z11) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    phVar.setVisibility(i10);
                }
            }
        }
        if (!z11 && !niVar.N && niVar.O0) {
            i11 = AndroidUtilities.dp(62.0f);
        }
        this.G = i11;
        S();
        if (this.F == z11) {
            this.F = !z11;
            requestLayout();
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: th.p.W():void");
    }

    public final void X() {
        boolean z10;
        float f9;
        t3 t3Var = this.f48624s;
        if (t3Var != null) {
            p3 p3Var = this.f48623r;
            boolean r22 = p3Var.r2();
            b2 b2Var = p3Var.F3;
            if (b2Var != null && !b2Var.f48364c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = t3Var.f48771r;
            ImageView imageView2 = t3Var.f48770n;
            imageView2.setEnabled(r22);
            float f10 = 0.35f;
            if (r22) {
                f9 = 1.0f;
            } else {
                f9 = 0.35f;
            }
            imageView2.setAlpha(f9);
            imageView.setEnabled(z10);
            if (z10) {
                f10 = 1.0f;
            }
            imageView.setAlpha(f10);
        }
    }

    public final void Y() {
        boolean z10;
        t3 t3Var = this.f48624s;
        if (t3Var != null) {
            int i10 = this.f48622n;
            boolean z11 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z10 = true;
            } else {
                z10 = false;
            }
            og sendButton = t3Var.getSendButton();
            if (z10) {
                p3 p3Var = this.f48623r;
                if (u4.f(p3Var.f48646h3, p3Var.f48648i3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            t3Var.setPremiumLocked(z10);
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: th.p.Z():void");
    }

    public final void a0() {
        int i10;
        t3 t3Var = this.f48624s;
        if (t3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        p3 p3Var = this.f48623r;
        if (p3Var.getChildCount() <= 0) {
            i10 = p3Var.getPaddingTop();
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < p3Var.getChildCount(); i12++) {
                View childAt = p3Var.getChildAt(i12);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 == Integer.MAX_VALUE) {
                i10 = p3Var.getPaddingTop();
            } else {
                i10 = i11;
            }
        }
        t3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i10));
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
        p3 p3Var = this.f48623r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f28403b.f30990b0 instanceof tn) && p3Var.r2() && T()) {
                j7.l1.v(R.string.RichEditorDraftSaved, new tc(this.f48624s, this.f28402a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!p3Var.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        fz fzVar;
        p3 p3Var = this.f48623r;
        d3 d3Var = p3Var.f48650j3;
        w9 w9Var = p3Var.f48652k3;
        if (!d3Var.y() || !w9Var.onTouchEvent(motionEvent)) {
            if (this.f48627y && (fzVar = this.f48625w) != null) {
                height = (int) fzVar.getY();
            } else {
                height = getHeight() - this.A;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.G;
            if (motionEvent.getAction() == 0 && this.f48626x && motionEvent.getY() < dp) {
                R(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < dp)) && w9Var.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < dp && p3Var.i3(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public int getCurrentItemTop() {
        p3 p3Var = this.f48623r;
        if (p3Var.getChildCount() <= 0) {
            int paddingTop = p3Var.getPaddingTop();
            this.E = paddingTop;
            p3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        int i10 = Integer.MAX_VALUE;
        boolean z10 = false;
        for (int i11 = 0; i11 < p3Var.getChildCount(); i11++) {
            View childAt = p3Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                z10 = true;
            }
            if (R >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        p3Var.setTopGlowOffset(Math.max(0, i10));
        int i12 = i10 - AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(7.0f);
        if (i12 < AndroidUtilities.dp(7.0f) || !z10) {
            i12 = dp;
        }
        this.E = i12;
        return i12;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.f48623r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
    }

    public k9 getTextSelectionHelper() {
        return this.f48623r.getTextSelectionHelper();
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final boolean i() {
        boolean z10 = this.f48627y;
        if (z10) {
            if (z10) {
                this.f48627y = false;
                fz fzVar = this.f48625w;
                if (fzVar != null) {
                    fzVar.t(false);
                    this.f48625w.B();
                }
                S();
                return false;
            }
        } else if (this.f48626x) {
            R(false);
            return false;
        } else if (!this.f48623r.F2() && !Q()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(float f9) {
        S();
    }

    @Override
    public final void m() {
        ki0 ki0Var = this.K;
        if (ki0Var != null) {
            ki0Var.i();
            this.K = null;
        }
        m.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.c();
        }
        p3 p3Var = this.f48623r;
        if (p3Var != null) {
            p3Var.v2();
        }
        fz fzVar = this.f48625w;
        if (fzVar != null) {
            fzVar.D();
        }
    }

    @Override
    public final boolean n() {
        p3 p3Var = this.f48623r;
        if (p3Var != null) {
            p3Var.v2();
            return false;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f48622n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Y();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f48622n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final boolean p() {
        if (!Q()) {
            return false;
        }
        return true;
    }

    @Override
    public final void r() {
        m.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.c();
        }
        if (this.f48626x) {
            R(false);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.J) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.f28403b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void v() {
        boolean z10;
        if (this.f28403b.f31029n1.R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        S();
        a0();
    }

    @Override
    public final void w(int i10, boolean z10) {
        this.H = z10;
        S();
        if (z10 && this.f48626x && !this.f48627y) {
            R(false);
        }
        a0();
    }

    @Override
    public final void y(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: th.p.y(int, int):void");
    }

    @Override
    public final void q() {
    }
}
