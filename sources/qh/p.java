package qh;

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
import g7.e6;
import java.util.ArrayList;
import kh.b8;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ak;
import org.telegram.ui.ir0;
import org.telegram.ui.li0;
import org.telegram.ui.qn;
public final class p extends ci implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] M = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int A;
    public d1 B;
    public int C;
    public x60 D;
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public boolean J;
    public li0 K;
    public final d L;
    public final int f46605n;
    public final o3 f46606r;
    public final s3 f46607s;
    public m.t3 v;
    public wy f46608w;
    public boolean f46609x;
    public boolean f46610y;

    public p(int i9, Context context, b6 b6Var, ki kiVar) {
        super(context, b6Var, kiVar);
        k kVar = new k(this);
        this.F = true;
        this.L = new d(this, 3);
        this.f46605n = i9;
        this.h = true;
        this.f27496f = true;
        o3 o3Var = new o3(context, i9, b6Var, new org.telegram.ui.Cells.e3(18, this, b6Var));
        this.f46606r = o3Var;
        o3Var.setAdaptiveLinkDialogs(false);
        o3Var.setAllowTapAboveContent(false);
        addView(o3Var, e6.e(-1, -1, 119));
        addView(o3Var.getOverlayView(), e6.e(-1, -1, 119));
        o3Var.z4();
        b2 b2Var = o3Var.F3;
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
        s3 s3Var = new s3(context, kVar);
        this.f46607s = s3Var;
        s3Var.setBackVisible(false);
        s3Var.setTopGradientVisible(false);
        X();
        addView(s3Var, e6.e(-1, -1, 119));
        W();
        Y();
        U(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 0));
    }

    public static void J(p pVar) {
        boolean z10;
        int i9 = 0;
        if (!pVar.f46606r.k3() && !pVar.f46609x) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ki kiVar = pVar.f27493b;
            if (!kiVar.N && kiVar.O0) {
                i9 = AndroidUtilities.dp(62.0f);
            }
        }
        if (pVar.G != i9) {
            pVar.G = i9;
            pVar.R();
        }
    }

    public static void K(p pVar) {
        o3 o3Var = pVar.f46606r;
        if (pVar.f46609x) {
            d1 P2 = o3Var.P2();
            if (P2 != null) {
                P2.r();
                AndroidUtilities.showKeyboard(P2);
            }
            pVar.Q(true);
            return;
        }
        ki kiVar = pVar.f27493b;
        if (pVar.f46608w == null) {
            wy wyVar = new wy(kiVar.f30099b0, true, false, false, pVar.getContext(), true, null, kiVar.f30138n1, true, pVar.f27492a, false, false);
            pVar.f46608w = wyVar;
            wyVar.setVisibility(8);
            wy wyVar2 = pVar.f46608w;
            wyVar2.f34447t2 = false;
            wyVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = pVar.f46608w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            pVar.f46608w.setDelegate(new n(pVar));
            pVar.addView(pVar.f46608w, e6.e(-1, pVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = pVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.f46608w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        pVar.f46608w.setLayoutParams(layoutParams);
        pVar.f46608w.setTranslationY(0.0f);
        pVar.f46608w.setVisibility(0);
        pVar.f46609x = true;
        pVar.A = emojiPanelHeight;
        d1 P22 = o3Var.P2();
        if (P22 != null) {
            AndroidUtilities.hideKeyboard(P22);
        }
        s3 s3Var = pVar.f46607s;
        if (s3Var != null) {
            s3Var.setEmojiOpened(true);
        }
        pVar.U(false);
        pVar.requestLayout();
    }

    public static d1 L(p pVar) {
        o3 o3Var = pVar.f46606r;
        d1 focusedEditTextOrNull = o3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            pVar.B = focusedEditTextOrNull;
            pVar.C = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        d1 d1Var = pVar.B;
        if (d1Var != null) {
            return d1Var;
        }
        return o3Var.P2();
    }

    public static int M(p pVar, d1 d1Var) {
        if (d1Var == pVar.B && pVar.f46606r.getFocusedEditTextOrNull() != d1Var) {
            return Math.min(pVar.C, d1Var.length());
        }
        return Math.max(0, d1Var.getSelectionEnd());
    }

    public static void N(p pVar, int i9, int i10) {
        ki kiVar = pVar.f27493b;
        if (kiVar.f30099b0 == null) {
            return;
        }
        ki kiVar2 = new ki(pVar.getContext(), kiVar.f30099b0, false, false, true, pVar.f27492a);
        kiVar2.V1 = new l(pVar, kiVar2);
        kiVar2.f30114f0.e0();
        kiVar2.J1(1, true);
        kiVar2.h1(i9);
        kiVar2.f30145p2 = new e(pVar, kiVar2);
        kiVar2.U = new e(pVar, kiVar2);
        kiVar2.T = new m(pVar, kiVar2);
        kiVar2.r1();
        if (i10 != 0) {
            kiVar2.A1(i10);
        }
        kiVar2.setFocusable(true);
        kiVar2.show();
    }

    public static void T(Context context, final String str, final Utilities.Callback callback, b6 b6Var) {
        String str2;
        org.telegram.ui.ActionBar.f3 j10 = ll.j(context, b6Var, true, false);
        LinearLayout f10 = ll.f(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(f6.b0(AndroidUtilities.dp(8.0f), f6.l1(0.05f, f6.v0(f6.G6, b6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f10.addView(horizontalScrollView, e6.t(-1, -2, 49, 12, 2, 12, 0));
        kh.d i9 = ll.i(24, context, b6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        bg.p0 p0Var = new bg.p0(strArr, horizontalScrollView, i9, zArr2, new b8(strArr, 26), imageView, b6Var, new int[]{6}, 7);
        final org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, b6Var);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f24544b;
        h3Var.setImeOptions(6);
        h3Var.setMaxLines(5);
        j3Var.setBackground(f6.b0(AndroidUtilities.dp(24.0f), f6.v0(f6.f23001d6, b6Var)));
        j3Var.setText(strArr[0]);
        h3Var.addTextChangedListener(new o(strArr, p0Var));
        f10.addView(j3Var, e6.t(-1, -2, 55, 12, 8, 12, 0));
        i9.setText(LocaleController.getString(R.string.Done));
        f10.addView(i9, e6.t(-1, 48, 55, 12, 12, 12, 12));
        p0Var.run();
        j10.customView = f10;
        j10.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.h3 h3Var2 = org.telegram.ui.Cells.j3.this.f24544b;
                h3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(h3Var2);
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
        j10.show();
        int i10 = f6.f22947a7;
        j10.setBackgroundColor(f6.v0(i10, b6Var));
        j10.fixNavigationBar(f6.v0(i10, b6Var));
        i9.setOnClickListener(new ih.d0(i9, zArr, callback, strArr, j10, 15));
        AndroidUtilities.runOnUIThread(new pf.o1(j3Var, 1), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int R = this.f27493b.f30138n1.R();
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
    public final void D(ci ciVar) {
        this.f27493b.T0.setTitle("");
        this.f46606r.U2.N(false);
        U(false);
        post(new d(this, 4));
    }

    @Override
    public final void F() {
        this.f46606r.x0(0);
    }

    @Override
    public final boolean H(int i9, boolean z10, int i10, boolean z11, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        ak akVar;
        int i11 = this.f46605n;
        boolean richEditorAllowed = MessagesController.getInstance(i11).richEditorAllowed();
        o3 o3Var = this.f46606r;
        if (!richEditorAllowed && !UserConfig.getInstance(i11).isPremium() && t4.f(o3Var.f46573h3, o3Var.f46575i3)) {
            x1.o0(getContext(), new b(o3Var, 0), new d(this, 2), this.f27492a);
            return false;
        }
        if (o3Var.k3() && !o3Var.m3()) {
            if (!o3Var.M3()) {
                s3 s3Var = this.f46607s;
                if (s3Var != null) {
                    s3Var.setSendEnabled(o3Var.M3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i11).richEditorAllowed();
                ki kiVar = this.f27493b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
                    if ((o2Var instanceof qn) && (akVar = ((qn) o2Var).U) != null) {
                        akVar.R0(t4.k(o3Var.f46573h3), z10, i9, i10);
                        kiVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList Z2 = o3Var.Z2();
                    if (!Z2.isEmpty()) {
                        ArrayList B2 = o3Var.B2();
                        ArrayList y22 = o3Var.y2();
                        ArrayList a2 = s4.a(i11, Z2);
                        org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.f30099b0;
                        if (o2Var2 instanceof qn) {
                            qn qnVar = (qn) o2Var2;
                            MessageObject messageObject3 = qnVar.f41959j5;
                            MessageObject messageObject4 = qnVar.T3;
                            j11 = qnVar.N8();
                            sendMessageChatArguments = qnVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(kiVar.F1), Z2, B2, y22, a2, false, kiVar.n1(), messageObject, messageObject2, z10, i9, i10, sendMessageChatArguments, j10, j11, 0L);
                        kiVar.dismiss(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean I() {
        return !this.f46606r.k3();
    }

    public final void O(x60 x60Var, a aVar, TL_iv.PageBlock pageBlock, int i9, String str, int i10, x60 x60Var2) {
        boolean z10;
        if (aVar != null && aVar.f46269b.getClass() == pageBlock.getClass()) {
            z10 = true;
        } else {
            z10 = false;
        }
        x60Var.j(z10, i9, null, str, new ir0(this, aVar, pageBlock, x60Var2, 24));
        x60Var.y().f23403a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        x60Var.y().f23403a.setTextSize(1, i10);
    }

    public final boolean P() {
        o3 o3Var = this.f46606r;
        if (o3Var != null && o3Var.k3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f27492a);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                public final p f46438b;

                {
                    this.f46438b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
                    switch (r2) {
                        case 0:
                            this.f46438b.f27493b.dismiss();
                            return;
                        default:
                            p pVar = this.f46438b;
                            pVar.S();
                            pVar.f27493b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.b2(this) {
                public final p f46438b;

                {
                    this.f46438b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
                    switch (r2) {
                        case 0:
                            this.f46438b.f27493b.dismiss();
                            return;
                        default:
                            p pVar = this.f46438b;
                            pVar.S();
                            pVar.f27493b.dismiss();
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

    public final void Q(boolean z10) {
        if (this.f46610y) {
            this.f46610y = false;
            wy wyVar = this.f46608w;
            if (wyVar != null) {
                wyVar.t(false);
                if (!z10) {
                    this.f46608w.A();
                }
            }
        }
        this.B = null;
        wy wyVar2 = this.f46608w;
        if (wyVar2 != null) {
            wyVar2.setTranslationY(0.0f);
            this.f46608w.setVisibility(8);
        }
        this.f46609x = false;
        this.A = 0;
        s3 s3Var = this.f46607s;
        if (s3Var != null) {
            s3Var.setEmojiOpened(false);
        }
        U(false);
        requestLayout();
    }

    public final void R() {
        int i9;
        int i10;
        float f10;
        int i11;
        float f11;
        float f12;
        if (this.f46610y) {
            i9 = AndroidUtilities.dp(245.0f);
        } else {
            i9 = this.A;
        }
        wy wyVar = this.f46608w;
        float f13 = 0.0f;
        ki kiVar = this.f27493b;
        if (wyVar != null) {
            if (this.f46609x) {
                float f14 = this.A - i9;
                if (this.f46610y) {
                    f12 = -kiVar.f30122h2;
                } else {
                    f12 = 0.0f;
                }
                f11 = f14 + f12;
            } else {
                f11 = 0.0f;
            }
            wyVar.setTranslationY(f11);
        }
        s3 s3Var = this.f46607s;
        if (s3Var != null) {
            boolean z10 = this.f46609x;
            if (z10) {
                f10 = i9;
            } else {
                if (!this.H && this.A <= 0) {
                    i10 = AndroidUtilities.navigationBarHeight;
                } else {
                    i10 = 0;
                }
                f10 = i10;
            }
            if (!z10 || this.f46610y) {
                f10 += kiVar.f30122h2;
            }
            s3Var.getBottomContainer().animate().cancel();
            s3Var.getBottomContainer().setTranslationY(-f10);
            boolean z11 = this.f46609x;
            if (z11) {
                f13 = i9;
            }
            if (!z11 || this.f46610y) {
                f13 += kiVar.f30122h2;
            }
            s3Var.setBottomGradientTranslationY(-f13);
            if (this.I != this.G) {
                ViewPropertyAnimator animate = s3Var.getBottomInnerContainer().animate();
                this.I = this.G;
                animate.translationY(-i11).setDuration(320L).setInterpolator(gr.h).start();
            }
        }
    }

    public final boolean S() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f27493b.f30099b0;
        if (o2Var instanceof qn) {
            qn qnVar = (qn) o2Var;
            o3 o3Var = this.f46606r;
            if (!o3Var.r2()) {
                return false;
            }
            TL_iv.RichMessage j22 = o3Var.j2();
            AccountInstance.getInstance(this.f46605n).getMediaDataController().saveDraft(qnVar.a(), qnVar.B7(qnVar.f41959j5), "", null, null, null, null, 0L, false, false, j22);
            ak akVar = qnVar.U;
            if (akVar != null) {
                akVar.setRichDraftPreview(j22);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void U(boolean z10) {
        boolean z11;
        int i9;
        int i10 = 0;
        if (!this.f46606r.k3() && !this.f46609x) {
            z11 = false;
        } else {
            z11 = true;
        }
        ki kiVar = this.f27493b;
        mh mhVar = kiVar.f30158t1;
        if (kiVar.f30148q2 != z11) {
            kiVar.f30148q2 = z11;
            if (kiVar.O0) {
                mhVar.animate().cancel();
                if (!z11) {
                    mhVar.setVisibility(0);
                }
                float f10 = 1.0f;
                float f11 = 0.0f;
                if (z10) {
                    ViewPropertyAnimator animate = mhVar.animate();
                    if (z11) {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z11) {
                        f11 = AndroidUtilities.dp(48.0f);
                    }
                    alpha.translationY(f11).setDuration(180L).withEndAction(new fh(kiVar, z11, 3)).start();
                } else {
                    if (z11) {
                        f10 = 0.0f;
                    }
                    mhVar.setAlpha(f10);
                    if (z11) {
                        f11 = AndroidUtilities.dp(48.0f);
                    }
                    mhVar.setTranslationY(f11);
                    if (z11) {
                        i9 = 4;
                    } else {
                        i9 = 0;
                    }
                    mhVar.setVisibility(i9);
                }
            }
        }
        if (!z11 && !kiVar.N && kiVar.O0) {
            i10 = AndroidUtilities.dp(62.0f);
        }
        this.G = i10;
        R();
        if (this.F == z11) {
            this.F = !z11;
            requestLayout();
        }
    }

    public final void V() {
        throw new UnsupportedOperationException("Method not decompiled: qh.p.V():void");
    }

    public final void W() {
        boolean z10;
        float f10;
        s3 s3Var = this.f46607s;
        if (s3Var != null) {
            o3 o3Var = this.f46606r;
            boolean r22 = o3Var.r2();
            b2 b2Var = o3Var.F3;
            if (b2Var != null && !b2Var.f46306c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageView imageView = s3Var.f46695r;
            ImageView imageView2 = s3Var.f46694n;
            imageView2.setEnabled(r22);
            float f11 = 0.35f;
            if (r22) {
                f10 = 1.0f;
            } else {
                f10 = 0.35f;
            }
            imageView2.setAlpha(f10);
            imageView.setEnabled(z10);
            if (z10) {
                f11 = 1.0f;
            }
            imageView.setAlpha(f11);
        }
    }

    public final void X() {
        boolean z10;
        s3 s3Var = this.f46607s;
        if (s3Var != null) {
            int i9 = this.f46605n;
            boolean z11 = false;
            if (!MessagesController.getInstance(i9).richEditorAllowed() && !UserConfig.getInstance(i9).isPremium()) {
                z10 = true;
            } else {
                z10 = false;
            }
            lg sendButton = s3Var.getSendButton();
            if (z10) {
                o3 o3Var = this.f46606r;
                if (t4.f(o3Var.f46573h3, o3Var.f46575i3)) {
                    z11 = true;
                }
            }
            sendButton.setLocked(z11);
            s3Var.setPremiumLocked(z10);
        }
    }

    public final void Y() {
        throw new UnsupportedOperationException("Method not decompiled: qh.p.Y():void");
    }

    public final void Z() {
        int i9;
        s3 s3Var = this.f46607s;
        if (s3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        o3 o3Var = this.f46606r;
        if (o3Var.getChildCount() <= 0) {
            i9 = o3Var.getPaddingTop();
        } else {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < o3Var.getChildCount(); i11++) {
                View childAt = o3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                }
            }
            if (i10 == Integer.MAX_VALUE) {
                i9 = o3Var.getPaddingTop();
            } else {
                i9 = i10;
            }
        }
        s3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i9));
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
            X();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        o3 o3Var = this.f46606r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f27493b.f30099b0 instanceof qn) && o3Var.r2() && S()) {
                org.telegram.messenger.l0.p(R.string.RichEditorDraftSaved, new oc(this.f46607s, this.f27492a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!o3Var.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        wy wyVar;
        o3 o3Var = this.f46606r;
        c3 c3Var = o3Var.f46577j3;
        z9 z9Var = o3Var.f46579k3;
        if (!c3Var.y() || !z9Var.onTouchEvent(motionEvent)) {
            if (this.f46610y && (wyVar = this.f46608w) != null) {
                height = (int) wyVar.getY();
            } else {
                height = getHeight() - this.A;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.G;
            if (motionEvent.getAction() == 0 && this.f46609x && motionEvent.getY() < dp) {
                Q(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < dp)) && z9Var.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < dp && o3Var.i3(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public int getCurrentItemTop() {
        o3 o3Var = this.f46606r;
        if (o3Var.getChildCount() <= 0) {
            int paddingTop = o3Var.getPaddingTop();
            this.E = paddingTop;
            o3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        int i9 = Integer.MAX_VALUE;
        boolean z10 = false;
        for (int i10 = 0; i10 < o3Var.getChildCount(); i10++) {
            View childAt = o3Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                z10 = true;
            }
            if (R >= 0 && childAt.getTop() < i9) {
                i9 = childAt.getTop();
            }
        }
        if (i9 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        o3Var.setTopGlowOffset(Math.max(0, i9));
        int i11 = i9 - AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(7.0f);
        if (i11 < AndroidUtilities.dp(7.0f) || !z10) {
            i11 = dp;
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
        return (this.f46606r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public n9 getTextSelectionHelper() {
        return this.f46606r.getTextSelectionHelper();
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final boolean i() {
        boolean z10 = this.f46610y;
        if (z10) {
            if (z10) {
                this.f46610y = false;
                wy wyVar = this.f46608w;
                if (wyVar != null) {
                    wyVar.t(false);
                    this.f46608w.A();
                }
                R();
                return false;
            }
        } else if (this.f46609x) {
            Q(false);
            return false;
        } else if (!this.f46606r.F2() && !P()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(float f10) {
        R();
    }

    @Override
    public final void m() {
        li0 li0Var = this.K;
        if (li0Var != null) {
            li0Var.i();
            this.K = null;
        }
        m.t3 t3Var = this.v;
        if (t3Var != null) {
            t3Var.c();
        }
        o3 o3Var = this.f46606r;
        if (o3Var != null) {
            o3Var.v2();
        }
        wy wyVar = this.f46608w;
        if (wyVar != null) {
            wyVar.D();
        }
    }

    @Override
    public final boolean n() {
        o3 o3Var = this.f46606r;
        if (o3Var != null) {
            o3Var.v2();
            return false;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f46605n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        X();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46605n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final boolean p() {
        if (!P()) {
            return false;
        }
        return true;
    }

    @Override
    public final void r() {
        m.t3 t3Var = this.v;
        if (t3Var != null) {
            t3Var.c();
        }
        if (this.f46609x) {
            Q(false);
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
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f27493b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void v() {
        boolean z10;
        if (this.f27493b.f30138n1.R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.H = z10;
        R();
        Z();
    }

    @Override
    public final void w(int i9, boolean z10) {
        this.H = z10;
        R();
        if (z10 && this.f46609x && !this.f46610y) {
            Q(false);
        }
        Z();
    }

    @Override
    public final void y(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: qh.p.y(int, int):void");
    }

    @Override
    public final void q() {
    }
}
