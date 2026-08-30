package vh;

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
import k7.b6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.jk;
import org.telegram.ui.si0;
import org.telegram.ui.wx0;
import org.telegram.ui.xn;
import ph.ga;
public final class p extends di implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] N = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int B;
    public d1 C;
    public int D;
    public o70 E;
    public int F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;
    public boolean K;
    public si0 L;
    public final d M;
    public final int f46058n;
    public final r3 f46059r;
    public final v3 f46060s;
    public m.s3 v;
    public kz f46061w;
    public boolean f46062x;
    public boolean f46063y;

    public p(int i10, Context context, f6 f6Var, li liVar) {
        super(context, f6Var, liVar);
        k kVar = new k(this);
        this.G = true;
        this.M = new d(this, 3);
        this.f46058n = i10;
        this.h = true;
        this.f24280f = true;
        r3 r3Var = new r3(context, i10, f6Var, new q5.g0(this, f6Var, false, 12));
        this.f46059r = r3Var;
        r3Var.setAdaptiveLinkDialogs(false);
        r3Var.setAllowTapAboveContent(false);
        addView(r3Var, b6.e(-1, -1, 119));
        addView(r3Var.getOverlayView(), b6.e(-1, -1, 119));
        r3Var.z4();
        c2 c2Var = r3Var.G3;
        if (c2Var != null) {
            c2Var.j();
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        setBackground(null);
        setForeground(null);
        v3 v3Var = new v3(context, kVar);
        this.f46060s = v3Var;
        v3Var.setBackVisible(false);
        v3Var.setTopGradientVisible(false);
        Y();
        addView(v3Var, b6.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 0));
    }

    public static void J(p pVar) {
        boolean z4;
        int i10 = 0;
        if (!pVar.f46059r.k3() && !pVar.f46062x) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            li liVar = pVar.f24278b;
            if (!liVar.O && liVar.P0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (pVar.H != i10) {
            pVar.H = i10;
            pVar.S();
        }
    }

    public static void K(p pVar) {
        r3 r3Var = pVar.f46059r;
        if (pVar.f46062x) {
            d1 P2 = r3Var.P2();
            if (P2 != null) {
                P2.r();
                AndroidUtilities.showKeyboard(P2);
            }
            pVar.R(true);
            return;
        }
        li liVar = pVar.f24278b;
        if (pVar.f46061w == null) {
            kz kzVar = new kz(liVar.f26689c0, true, false, false, pVar.getContext(), true, null, liVar.f26726o1, true, pVar.f24277a, false, false);
            pVar.f46061w = kzVar;
            kzVar.setVisibility(8);
            kz kzVar2 = pVar.f46061w;
            kzVar2.f26475u2 = false;
            kzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = pVar.f46061w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            pVar.f46061w.setDelegate(new n(pVar));
            pVar.addView(pVar.f46061w, b6.e(-1, pVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = pVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.f46061w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        pVar.f46061w.setLayoutParams(layoutParams);
        pVar.f46061w.setTranslationY(0.0f);
        pVar.f46061w.setVisibility(0);
        pVar.f46062x = true;
        pVar.B = emojiPanelHeight;
        d1 P22 = r3Var.P2();
        if (P22 != null) {
            AndroidUtilities.hideKeyboard(P22);
        }
        v3 v3Var = pVar.f46060s;
        if (v3Var != null) {
            v3Var.setEmojiOpened(true);
        }
        pVar.V(false);
        pVar.requestLayout();
    }

    public static d1 M(p pVar) {
        r3 r3Var = pVar.f46059r;
        d1 focusedEditTextOrNull = r3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            pVar.C = focusedEditTextOrNull;
            pVar.D = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        d1 d1Var = pVar.C;
        if (d1Var != null) {
            return d1Var;
        }
        return r3Var.P2();
    }

    public static int N(p pVar, d1 d1Var) {
        if (d1Var == pVar.C && pVar.f46059r.getFocusedEditTextOrNull() != d1Var) {
            return Math.min(pVar.D, d1Var.length());
        }
        return Math.max(0, d1Var.getSelectionEnd());
    }

    public static void O(p pVar, int i10, int i11) {
        li liVar = pVar.f24278b;
        if (liVar.f26689c0 == null) {
            return;
        }
        li liVar2 = new li(pVar.getContext(), liVar.f26689c0, false, false, true, pVar.f24277a);
        liVar2.W1 = new l(pVar, liVar2);
        liVar2.f26702g0.f0();
        liVar2.J1(1, true);
        liVar2.h1(i10);
        liVar2.f26733q2 = new e(pVar, liVar2);
        liVar2.V = new e(pVar, liVar2);
        liVar2.U = new m(pVar, liVar2);
        liVar2.r1();
        if (i11 != 0) {
            liVar2.A1(i11);
        }
        liVar2.setFocusable(true);
        liVar2.show();
    }

    public static void U(Context context, final String str, final Utilities.Callback callback, f6 f6Var) {
        String str2;
        org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, f6Var, true, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        final String[] strArr = {str2};
        ImageView imageView = new ImageView(context);
        imageView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        imageView.setBackground(j6.b0(AndroidUtilities.dp(8.0f), j6.l1(0.05f, j6.v0(j6.G6, f6Var))));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setVisibility(8);
        horizontalScrollView.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        f10.addView(horizontalScrollView, b6.t(-1, -2, 49, 12, 2, 12, 0));
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        gg.k0 k0Var = new gg.k0(strArr, horizontalScrollView, p10, zArr2, new ph.d4(strArr, 27), imageView, f6Var, new int[]{6}, 7);
        final org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, f6Var);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f21199b;
        g3Var.setImeOptions(6);
        g3Var.setMaxLines(5);
        i3Var.setBackground(j6.b0(AndroidUtilities.dp(24.0f), j6.v0(j6.f19906d6, f6Var)));
        i3Var.setText(strArr[0]);
        g3Var.addTextChangedListener(new o(strArr, k0Var));
        f10.addView(i3Var, b6.t(-1, -2, 55, 12, 8, 12, 0));
        p10.setText(LocaleController.getString(R.string.Done));
        f10.addView(p10, b6.t(-1, 48, 55, 12, 12, 12, 12));
        k0Var.run();
        o10.customView = f10;
        o10.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.g3 g3Var2 = org.telegram.ui.Cells.i3.this.f21199b;
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
        int i10 = j6.f19852a7;
        o10.setBackgroundColor(j6.v0(i10, f6Var));
        o10.fixNavigationBar(j6.v0(i10, f6Var));
        p10.setOnClickListener(new nh.c0(p10, zArr, callback, strArr, o10, 15));
        AndroidUtilities.runOnUIThread(new ga(i3Var, 24), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int R = this.f24278b.f26726o1.R();
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
    public final void D(di diVar) {
        this.f24278b.U0.setTitle("");
        this.f46059r.V2.N(false);
        V(false);
        post(new d(this, 4));
    }

    @Override
    public final void F() {
        this.f46059r.x0(0);
    }

    @Override
    public final boolean H(int i10, boolean z4, int i11, boolean z10, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        jk jkVar;
        int i12 = this.f46058n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        r3 r3Var = this.f46059r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && w4.f(r3Var.f46120i3, r3Var.f46122j3)) {
            y1.p0(getContext(), new b(r3Var, 0), new d(this, 2), this.f24277a);
            return false;
        }
        if (r3Var.k3() && !r3Var.m3()) {
            if (!r3Var.M3()) {
                v3 v3Var = this.f46060s;
                if (v3Var != null) {
                    v3Var.setSendEnabled(r3Var.M3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                li liVar = this.f24278b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
                    if ((p2Var instanceof xn) && (jkVar = ((xn) p2Var).V) != null) {
                        jkVar.R0(w4.k(r3Var.f46120i3), z4, i10, i11);
                        liVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList Z2 = r3Var.Z2();
                    if (!Z2.isEmpty()) {
                        ArrayList B2 = r3Var.B2();
                        ArrayList y22 = r3Var.y2();
                        ArrayList a2 = v4.a(i12, Z2);
                        org.telegram.ui.ActionBar.p2 p2Var2 = liVar.f26689c0;
                        if (p2Var2 instanceof xn) {
                            xn xnVar = (xn) p2Var2;
                            MessageObject messageObject3 = xnVar.f40076k5;
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
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(liVar.G1), Z2, B2, y22, a2, false, liVar.n1(), messageObject, messageObject2, z4, i10, i11, sendMessageChatArguments, j10, j11, 0L);
                        liVar.dismiss(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean I() {
        return !this.f46059r.k3();
    }

    public final void P(o70 o70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, o70 o70Var2) {
        boolean z4;
        if (aVar != null && aVar.f45775b.getClass() == pageBlock.getClass()) {
            z4 = true;
        } else {
            z4 = false;
        }
        o70Var.j(z4, i10, null, str, new wx0(this, aVar, pageBlock, o70Var2, 26));
        o70Var.y().f19702a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        o70Var.y().f19702a.setTextSize(1, i11);
    }

    public final boolean Q() {
        r3 r3Var = this.f46059r;
        if (r3Var != null && r3Var.k3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f24277a);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) {
                public final p f45924b;

                {
                    this.f45924b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f45924b.f24278b.dismiss();
                            return;
                        default:
                            p pVar = this.f45924b;
                            pVar.T();
                            pVar.f24278b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.c2(this) {
                public final p f45924b;

                {
                    this.f45924b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f45924b.f24278b.dismiss();
                            return;
                        default:
                            p pVar = this.f45924b;
                            pVar.T();
                            pVar.f24278b.dismiss();
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
        if (this.f46063y) {
            this.f46063y = false;
            kz kzVar = this.f46061w;
            if (kzVar != null) {
                kzVar.t(false);
                if (!z4) {
                    this.f46061w.B();
                }
            }
        }
        this.C = null;
        kz kzVar2 = this.f46061w;
        if (kzVar2 != null) {
            kzVar2.setTranslationY(0.0f);
            this.f46061w.setVisibility(8);
        }
        this.f46062x = false;
        this.B = 0;
        v3 v3Var = this.f46060s;
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
        if (this.f46063y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.B;
        }
        kz kzVar = this.f46061w;
        float f13 = 0.0f;
        li liVar = this.f24278b;
        if (kzVar != null) {
            if (this.f46062x) {
                float f14 = this.B - i10;
                if (this.f46063y) {
                    f12 = -liVar.f26710i2;
                } else {
                    f12 = 0.0f;
                }
                f11 = f14 + f12;
            } else {
                f11 = 0.0f;
            }
            kzVar.setTranslationY(f11);
        }
        v3 v3Var = this.f46060s;
        if (v3Var != null) {
            boolean z4 = this.f46062x;
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
            if (!z4 || this.f46063y) {
                f10 += liVar.f26710i2;
            }
            v3Var.getBottomContainer().animate().cancel();
            v3Var.getBottomContainer().setTranslationY(-f10);
            boolean z10 = this.f46062x;
            if (z10) {
                f13 = i10;
            }
            if (!z10 || this.f46063y) {
                f13 += liVar.f26710i2;
            }
            v3Var.setBottomGradientTranslationY(-f13);
            if (this.J != this.H) {
                ViewPropertyAnimator animate = v3Var.getBottomInnerContainer().animate();
                this.J = this.H;
                animate.translationY(-i12).setDuration(320L).setInterpolator(nr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f24278b.f26689c0;
        if (p2Var instanceof xn) {
            xn xnVar = (xn) p2Var;
            r3 r3Var = this.f46059r;
            if (!r3Var.r2()) {
                return false;
            }
            TL_iv.RichMessage j22 = r3Var.j2();
            AccountInstance.getInstance(this.f46058n).getMediaDataController().saveDraft(xnVar.a(), xnVar.B7(xnVar.f40076k5), "", null, null, null, null, 0L, false, false, j22);
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
        if (!this.f46059r.k3() && !this.f46062x) {
            z10 = false;
        } else {
            z10 = true;
        }
        li liVar = this.f24278b;
        mh mhVar = liVar.f26746u1;
        if (liVar.f26737r2 != z10) {
            liVar.f26737r2 = z10;
            if (liVar.P0) {
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
                    alpha.translationY(f11).setDuration(180L).withEndAction(new fh(liVar, z10, 3)).start();
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
        if (!z10 && !liVar.O && liVar.P0) {
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
        throw new UnsupportedOperationException("Method not decompiled: vh.p.W():void");
    }

    public final void X() {
        boolean z4;
        float f10;
        v3 v3Var = this.f46060s;
        if (v3Var != null) {
            r3 r3Var = this.f46059r;
            boolean r22 = r3Var.r2();
            c2 c2Var = r3Var.G3;
            if (c2Var != null && !c2Var.f45834c.isEmpty()) {
                z4 = true;
            } else {
                z4 = false;
            }
            ImageView imageView = v3Var.f46232r;
            ImageView imageView2 = v3Var.f46231n;
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
        v3 v3Var = this.f46060s;
        if (v3Var != null) {
            int i10 = this.f46058n;
            boolean z10 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z4 = true;
            } else {
                z4 = false;
            }
            lg sendButton = v3Var.getSendButton();
            if (z4) {
                r3 r3Var = this.f46059r;
                if (w4.f(r3Var.f46120i3, r3Var.f46122j3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            v3Var.setPremiumLocked(z4);
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: vh.p.Z():void");
    }

    public final void a0() {
        int i10;
        v3 v3Var = this.f46060s;
        if (v3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        r3 r3Var = this.f46059r;
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
        r3 r3Var = this.f46059r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f24278b.f26689c0 instanceof xn) && r3Var.r2() && T()) {
                kh.a2.v(R.string.RichEditorDraftSaved, new qc(this.f46060s, this.f24277a), R.raw.contact_check, 36);
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
        kz kzVar;
        r3 r3Var = this.f46059r;
        f3 f3Var = r3Var.f46124k3;
        y9 y9Var = r3Var.f46126l3;
        if (!f3Var.y() || !y9Var.onTouchEvent(motionEvent)) {
            if (this.f46063y && (kzVar = this.f46061w) != null) {
                height = (int) kzVar.getY();
            } else {
                height = getHeight() - this.B;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.H;
            if (motionEvent.getAction() == 0 && this.f46062x && motionEvent.getY() < dp) {
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
        r3 r3Var = this.f46059r;
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
        return (this.f46059r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public m9 getTextSelectionHelper() {
        return this.f46059r.getTextSelectionHelper();
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final boolean i() {
        boolean z4 = this.f46063y;
        if (z4) {
            if (z4) {
                this.f46063y = false;
                kz kzVar = this.f46061w;
                if (kzVar != null) {
                    kzVar.t(false);
                    this.f46061w.B();
                }
                S();
                return false;
            }
        } else if (this.f46062x) {
            R(false);
            return false;
        } else if (!this.f46059r.F2() && !Q()) {
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
        si0 si0Var = this.L;
        if (si0Var != null) {
            si0Var.i();
            this.L = null;
        }
        m.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.c();
        }
        r3 r3Var = this.f46059r;
        if (r3Var != null) {
            r3Var.v2();
        }
        kz kzVar = this.f46061w;
        if (kzVar != null) {
            kzVar.D();
        }
    }

    @Override
    public final boolean n() {
        r3 r3Var = this.f46059r;
        if (r3Var != null) {
            r3Var.v2();
            return false;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f46058n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Y();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46058n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
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
        if (this.f46062x) {
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
        this.f24278b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void v() {
        boolean z4;
        if (this.f24278b.f26726o1.R() > AndroidUtilities.dp(20.0f)) {
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
        if (z4 && this.f46062x && !this.f46063y) {
            R(false);
        }
        a0();
    }

    @Override
    public final void y(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: vh.p.y(int, int):void");
    }

    @Override
    public final void q() {
    }
}
