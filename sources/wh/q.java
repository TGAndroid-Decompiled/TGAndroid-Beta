package wh;

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
import java.util.ArrayList;
import k7.c6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.jk;
import org.telegram.ui.ti0;
import org.telegram.ui.xn;
import org.telegram.ui.yx0;
import qh.v9;
public final class q extends ei implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] N = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int B;
    public e1 C;
    public int D;
    public q70 E;
    public int F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;
    public boolean K;
    public ti0 L;
    public final e M;
    public final int f49929n;
    public final r3 f49930r;
    public final v3 f49931s;
    public m.r3 v;
    public mz f49932w;
    public boolean f49933x;
    public boolean f49934y;

    public q(int i10, Context context, g6 g6Var, mi miVar) {
        super(context, g6Var, miVar);
        l lVar = new l(this);
        this.G = true;
        this.M = new e(this, 3);
        this.f49929n = i10;
        this.h = true;
        this.f26549f = true;
        r3 r3Var = new r3(context, i10, g6Var, new q5.g0(this, g6Var, false, 13));
        this.f49930r = r3Var;
        r3Var.setAdaptiveLinkDialogs(false);
        r3Var.setAllowTapAboveContent(false);
        addView(r3Var, c6.e(-1, -1, 119));
        addView(r3Var.getOverlayView(), c6.e(-1, -1, 119));
        r3Var.z4();
        d2 d2Var = r3Var.G3;
        if (d2Var != null) {
            d2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        v3 v3Var = new v3(context, lVar);
        this.f49931s = v3Var;
        v3Var.setBackVisible(false);
        v3Var.setTopGradientVisible(false);
        Y();
        addView(v3Var, c6.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void J(q qVar) {
        boolean z4;
        int i10 = 0;
        if (!qVar.f49930r.k3() && !qVar.f49933x) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            mi miVar = qVar.f26546b;
            if (!miVar.O && miVar.P0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (qVar.H != i10) {
            qVar.H = i10;
            qVar.S();
        }
    }

    public static void K(q qVar) {
        r3 r3Var = qVar.f49930r;
        if (qVar.f49933x) {
            e1 P2 = r3Var.P2();
            if (P2 != null) {
                P2.r();
                AndroidUtilities.showKeyboard(P2);
            }
            qVar.R(true);
            return;
        }
        mi miVar = qVar.f26546b;
        if (qVar.f49932w == null) {
            mz mzVar = new mz(miVar.f29040c0, true, false, false, qVar.getContext(), true, null, miVar.f29078o1, true, qVar.f26545a, false, false);
            qVar.f49932w = mzVar;
            mzVar.setVisibility(8);
            mz mzVar2 = qVar.f49932w;
            mzVar2.f29330u2 = false;
            mzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = qVar.f49932w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            qVar.f49932w.setDelegate(new o(qVar));
            qVar.addView(qVar.f49932w, c6.e(-1, qVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = qVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qVar.f49932w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        qVar.f49932w.setLayoutParams(layoutParams);
        qVar.f49932w.setTranslationY(0.0f);
        qVar.f49932w.setVisibility(0);
        qVar.f49933x = true;
        qVar.B = emojiPanelHeight;
        e1 P22 = r3Var.P2();
        if (P22 != null) {
            AndroidUtilities.hideKeyboard(P22);
        }
        v3 v3Var = qVar.f49931s;
        if (v3Var != null) {
            v3Var.setEmojiOpened(true);
        }
        qVar.V(false);
        qVar.requestLayout();
    }

    public static e1 M(q qVar) {
        r3 r3Var = qVar.f49930r;
        e1 focusedEditTextOrNull = r3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            qVar.C = focusedEditTextOrNull;
            qVar.D = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        e1 e1Var = qVar.C;
        if (e1Var != null) {
            return e1Var;
        }
        return r3Var.P2();
    }

    public static int N(q qVar, e1 e1Var) {
        if (e1Var == qVar.C && qVar.f49930r.getFocusedEditTextOrNull() != e1Var) {
            return Math.min(qVar.D, e1Var.length());
        }
        return Math.max(0, e1Var.getSelectionEnd());
    }

    public static void O(q qVar, int i10, int i11) {
        mi miVar = qVar.f26546b;
        if (miVar.f29040c0 == null) {
            return;
        }
        mi miVar2 = new mi(qVar.getContext(), miVar.f29040c0, false, false, true, qVar.f26545a);
        miVar2.W1 = new m(qVar, miVar2);
        miVar2.f29054g0.f0();
        miVar2.J1(1, true);
        miVar2.h1(i10);
        miVar2.f29085q2 = new f(qVar, miVar2);
        miVar2.V = new f(qVar, miVar2);
        miVar2.U = new n(qVar, miVar2);
        miVar2.r1();
        if (i11 != 0) {
            miVar2.A1(i11);
        }
        miVar2.setFocusable(true);
        miVar2.show();
    }

    public static void U(Context context, final String str, final Utilities.Callback callback, g6 g6Var) {
        String str2;
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, true, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(k6.b0(AndroidUtilities.dp(8.0f), k6.l1(0.05f, k6.v0(k6.G6, g6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f10.addView(horizontalScrollView, c6.t(-1, -2, 49, 12, 2, 12, 0));
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        hg.k0 k0Var = new hg.k0(strArr, horizontalScrollView, p10, zArr2, new qh.d4(strArr, 27), imageView, g6Var, new int[]{6}, 6);
        final org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, g6Var);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f22955b;
        g3Var.setImeOptions(6);
        g3Var.setMaxLines(5);
        i3Var.setBackground(k6.b0(AndroidUtilities.dp(24.0f), k6.v0(k6.f21659d6, g6Var)));
        i3Var.setText(strArr[0]);
        g3Var.addTextChangedListener(new p(strArr, k0Var));
        f10.addView(i3Var, c6.t(-1, -2, 55, 12, 8, 12, 0));
        p10.setText(LocaleController.getString(R.string.Done));
        f10.addView(p10, c6.t(-1, 48, 55, 12, 12, 12, 12));
        k0Var.run();
        o10.customView = f10;
        o10.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.g3 g3Var2 = org.telegram.ui.Cells.i3.this.f22955b;
                g3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(g3Var2);
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
        o10.show();
        int i10 = k6.f21605a7;
        o10.setBackgroundColor(k6.v0(i10, g6Var));
        o10.fixNavigationBar(k6.v0(i10, g6Var));
        p10.setOnClickListener(new oh.b0(p10, zArr, callback, strArr, o10, 15));
        AndroidUtilities.runOnUIThread(new v9(i3Var, 26), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int R = this.f26546b.f29078o1.R();
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
    public final void D(ei eiVar) {
        this.f26546b.U0.setTitle("");
        this.f49930r.V2.N(false);
        V(false);
        post(new e(this, 4));
    }

    @Override
    public final void F() {
        this.f49930r.x0(0);
    }

    @Override
    public final boolean H(int i10, boolean z4, int i11, boolean z10, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        jk jkVar;
        int i12 = this.f49929n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        r3 r3Var = this.f49930r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && w4.f(r3Var.f49988i3, r3Var.f49990j3)) {
            z1.p0(getContext(), new b(r3Var, 0), new e(this, 2), this.f26545a);
            return false;
        }
        if (r3Var.k3() && !r3Var.m3()) {
            if (!r3Var.M3()) {
                v3 v3Var = this.f49931s;
                if (v3Var != null) {
                    v3Var.setSendEnabled(r3Var.M3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                mi miVar = this.f26546b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.p2 p2Var = miVar.f29040c0;
                    if ((p2Var instanceof xn) && (jkVar = ((xn) p2Var).V) != null) {
                        jkVar.R0(w4.k(r3Var.f49988i3), z4, i10, i11);
                        miVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList Z2 = r3Var.Z2();
                    if (!Z2.isEmpty()) {
                        ArrayList B2 = r3Var.B2();
                        ArrayList y22 = r3Var.y2();
                        ArrayList a2 = v4.a(i12, Z2);
                        org.telegram.ui.ActionBar.p2 p2Var2 = miVar.f29040c0;
                        if (p2Var2 instanceof xn) {
                            xn xnVar = (xn) p2Var2;
                            MessageObject messageObject3 = xnVar.f43245k5;
                            MessageObject messageObject4 = xnVar.U3;
                            j11 = xnVar.N8();
                            sendMessageChatArguments = xnVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(miVar.G1), Z2, B2, y22, a2, false, miVar.n1(), messageObject, messageObject2, z4, i10, i11, sendMessageChatArguments, j10, j11, 0L);
                        miVar.dismiss(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean I() {
        return !this.f49930r.k3();
    }

    public final void P(q70 q70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, q70 q70Var2) {
        boolean z4;
        if (aVar != null && aVar.f49617b.getClass() == pageBlock.getClass()) {
            z4 = true;
        } else {
            z4 = false;
        }
        q70Var.j(z4, i10, null, str, new yx0(this, aVar, pageBlock, q70Var2, 27));
        q70Var.y().f21373a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        q70Var.y().f21373a.setTextSize(1, i11);
    }

    public final boolean Q() {
        r3 r3Var = this.f49930r;
        if (r3Var != null && r3Var.k3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f26545a);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) {
                public final q f49804b;

                {
                    this.f49804b = this;
                }

                @Override
                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f49804b.f26546b.dismiss();
                            return;
                        default:
                            q qVar = this.f49804b;
                            qVar.T();
                            qVar.f26546b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.c2(this) {
                public final q f49804b;

                {
                    this.f49804b = this;
                }

                @Override
                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f49804b.f26546b.dismiss();
                            return;
                        default:
                            q qVar = this.f49804b;
                            qVar.T();
                            qVar.f26546b.dismiss();
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

    public final void R(boolean z4) {
        if (this.f49934y) {
            this.f49934y = false;
            mz mzVar = this.f49932w;
            if (mzVar != null) {
                mzVar.t(false);
                if (!z4) {
                    this.f49932w.B();
                }
            }
        }
        this.C = null;
        mz mzVar2 = this.f49932w;
        if (mzVar2 != null) {
            mzVar2.setTranslationY(0.0f);
            this.f49932w.setVisibility(8);
        }
        this.f49933x = false;
        this.B = 0;
        v3 v3Var = this.f49931s;
        if (v3Var != null) {
            v3Var.setEmojiOpened(false);
        }
        V(false);
        requestLayout();
    }

    public final void S() {
        int i10;
        int i11;
        float f10;
        int i12;
        float f11;
        float f12;
        if (this.f49934y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.B;
        }
        mz mzVar = this.f49932w;
        float f13 = 0.0f;
        mi miVar = this.f26546b;
        if (mzVar != null) {
            if (this.f49933x) {
                float f14 = this.B - i10;
                if (this.f49934y) {
                    f12 = -miVar.f29062i2;
                } else {
                    f12 = 0.0f;
                }
                f11 = f14 + f12;
            } else {
                f11 = 0.0f;
            }
            mzVar.setTranslationY(f11);
        }
        v3 v3Var = this.f49931s;
        if (v3Var != null) {
            boolean z4 = this.f49933x;
            if (z4) {
                f10 = i10;
            } else {
                if (!this.I && this.B <= 0) {
                    i11 = AndroidUtilities.navigationBarHeight;
                } else {
                    i11 = 0;
                }
                f10 = i11;
            }
            if (!z4 || this.f49934y) {
                f10 += miVar.f29062i2;
            }
            v3Var.getBottomContainer().animate().cancel();
            v3Var.getBottomContainer().setTranslationY(-f10);
            boolean z10 = this.f49933x;
            if (z10) {
                f13 = i10;
            }
            if (!z10 || this.f49934y) {
                f13 += miVar.f29062i2;
            }
            v3Var.setBottomGradientTranslationY(-f13);
            if (this.J != this.H) {
                ViewPropertyAnimator animate = v3Var.getBottomInnerContainer().animate();
                this.J = this.H;
                animate.translationY(-i12).setDuration(320L).setInterpolator(pr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f26546b.f29040c0;
        if (p2Var instanceof xn) {
            xn xnVar = (xn) p2Var;
            r3 r3Var = this.f49930r;
            if (!r3Var.r2()) {
                return false;
            }
            TL_iv.RichMessage j22 = r3Var.j2();
            AccountInstance.getInstance(this.f49929n).getMediaDataController().saveDraft(xnVar.a(), xnVar.B7(xnVar.f43245k5), "", null, null, null, null, 0L, false, false, j22);
            jk jkVar = xnVar.V;
            if (jkVar != null) {
                jkVar.setRichDraftPreview(j22);
                return true;
            }
            return true;
        }
        return false;
    }

    public final void V(boolean z4) {
        boolean z10;
        int i10;
        int i11 = 0;
        if (!this.f49930r.k3() && !this.f49933x) {
            z10 = false;
        } else {
            z10 = true;
        }
        mi miVar = this.f26546b;
        mh mhVar = miVar.f29098u1;
        if (miVar.f29089r2 != z10) {
            miVar.f29089r2 = z10;
            if (miVar.P0) {
                mhVar.animate().cancel();
                if (!z10) {
                    mhVar.setVisibility(0);
                }
                float f10 = 1.0f;
                float f11 = 0.0f;
                if (z4) {
                    ViewPropertyAnimator animate = mhVar.animate();
                    if (z10) {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z10) {
                        f11 = AndroidUtilities.dp(48.0f);
                    }
                    alpha.translationY(f11).setDuration(180L).withEndAction(new fh(miVar, z10, 3)).start();
                } else {
                    if (z10) {
                        f10 = 0.0f;
                    }
                    mhVar.setAlpha(f10);
                    if (z10) {
                        f11 = AndroidUtilities.dp(48.0f);
                    }
                    mhVar.setTranslationY(f11);
                    if (z10) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    mhVar.setVisibility(i10);
                }
            }
        }
        if (!z10 && !miVar.O && miVar.P0) {
            i11 = AndroidUtilities.dp(62.0f);
        }
        this.H = i11;
        S();
        if (this.G == z10) {
            this.G = !z10;
            requestLayout();
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: wh.q.W():void");
    }

    public final void X() {
        boolean z4;
        float f10;
        v3 v3Var = this.f49931s;
        if (v3Var != null) {
            r3 r3Var = this.f49930r;
            boolean r22 = r3Var.r2();
            d2 d2Var = r3Var.G3;
            if (d2Var != null && !d2Var.f49697c.isEmpty()) {
                z4 = true;
            } else {
                z4 = false;
            }
            ImageView imageView = v3Var.f50105r;
            ImageView imageView2 = v3Var.f50104n;
            imageView2.setEnabled(r22);
            float f11 = 0.35f;
            if (r22) {
                f10 = 1.0f;
            } else {
                f10 = 0.35f;
            }
            imageView2.setAlpha(f10);
            imageView.setEnabled(z4);
            if (z4) {
                f11 = 1.0f;
            }
            imageView.setAlpha(f11);
        }
    }

    public final void Y() {
        boolean z4;
        v3 v3Var = this.f49931s;
        if (v3Var != null) {
            int i10 = this.f49929n;
            boolean z10 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z4 = true;
            } else {
                z4 = false;
            }
            lg sendButton = v3Var.getSendButton();
            if (z4) {
                r3 r3Var = this.f49930r;
                if (w4.f(r3Var.f49988i3, r3Var.f49990j3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            v3Var.setPremiumLocked(z4);
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: wh.q.Z():void");
    }

    public final void a0() {
        int i10;
        v3 v3Var = this.f49931s;
        if (v3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        r3 r3Var = this.f49930r;
        if (r3Var.getChildCount() <= 0) {
            i10 = r3Var.getPaddingTop();
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < r3Var.getChildCount(); i12++) {
                View childAt = r3Var.getChildAt(i12);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 == Integer.MAX_VALUE) {
                i10 = r3Var.getPaddingTop();
            } else {
                i10 = i11;
            }
        }
        v3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i10));
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
        r3 r3Var = this.f49930r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f26546b.f29040c0 instanceof xn) && r3Var.r2() && T()) {
                l.d.v(R.string.RichEditorDraftSaved, new qc(this.f49931s, this.f26545a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!r3Var.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        mz mzVar;
        r3 r3Var = this.f49930r;
        f3 f3Var = r3Var.f49992k3;
        y9 y9Var = r3Var.f49994l3;
        if (!f3Var.y() || !y9Var.onTouchEvent(motionEvent)) {
            if (this.f49934y && (mzVar = this.f49932w) != null) {
                height = (int) mzVar.getY();
            } else {
                height = getHeight() - this.B;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.H;
            if (motionEvent.getAction() == 0 && this.f49933x && motionEvent.getY() < dp) {
                R(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < dp)) && y9Var.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < dp && r3Var.i3(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public int getCurrentItemTop() {
        r3 r3Var = this.f49930r;
        if (r3Var.getChildCount() <= 0) {
            int paddingTop = r3Var.getPaddingTop();
            this.F = paddingTop;
            r3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        int i10 = Integer.MAX_VALUE;
        boolean z4 = false;
        for (int i11 = 0; i11 < r3Var.getChildCount(); i11++) {
            View childAt = r3Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R == 0) {
                z4 = true;
            }
            if (R >= 0 && childAt.getTop() < i10) {
                i10 = childAt.getTop();
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        r3Var.setTopGlowOffset(Math.max(0, i10));
        int i12 = i10 - AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(7.0f);
        if (i12 < AndroidUtilities.dp(7.0f) || !z4) {
            i12 = dp;
        }
        this.F = i12;
        return i12;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (this.f49930r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public m9 getTextSelectionHelper() {
        return this.f49930r.getTextSelectionHelper();
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final boolean i() {
        boolean z4 = this.f49934y;
        if (z4) {
            if (z4) {
                this.f49934y = false;
                mz mzVar = this.f49932w;
                if (mzVar != null) {
                    mzVar.t(false);
                    this.f49932w.B();
                }
                S();
                return false;
            }
        } else if (this.f49933x) {
            R(false);
            return false;
        } else if (!this.f49930r.F2() && !Q()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(float f10) {
        S();
    }

    @Override
    public final void m() {
        ti0 ti0Var = this.L;
        if (ti0Var != null) {
            ti0Var.i();
            this.L = null;
        }
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.c();
        }
        r3 r3Var2 = this.f49930r;
        if (r3Var2 != null) {
            r3Var2.v2();
        }
        mz mzVar = this.f49932w;
        if (mzVar != null) {
            mzVar.D();
        }
    }

    @Override
    public final boolean n() {
        r3 r3Var = this.f49930r;
        if (r3Var != null) {
            r3Var.v2();
            return false;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f49929n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Y();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f49929n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
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
        m.r3 r3Var = this.v;
        if (r3Var != null) {
            r3Var.c();
        }
        if (this.f49933x) {
            R(false);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.K) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f26546b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void v() {
        boolean z4;
        if (this.f26546b.f29078o1.R() > AndroidUtilities.dp(20.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.I = z4;
        S();
        a0();
    }

    @Override
    public final void w(int i10, boolean z4) {
        this.I = z4;
        S();
        if (z4 && this.f49933x && !this.f49934y) {
            R(false);
        }
        a0();
    }

    @Override
    public final void y(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: wh.q.y(int, int):void");
    }

    @Override
    public final void q() {
    }
}
