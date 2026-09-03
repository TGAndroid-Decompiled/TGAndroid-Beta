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
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.dy0;
import org.telegram.ui.lk;
import org.telegram.ui.ui0;
import org.telegram.ui.zn;
import ph.ga;
public final class q extends di implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] N = {1, 2, 16, 8, 256, 4, 16384, 32768};
    public int B;
    public e1 C;
    public int D;
    public p70 E;
    public int F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;
    public boolean K;
    public ui0 L;
    public final e M;
    public final int f46155n;
    public final s3 f46156r;
    public final w3 f46157s;
    public m.s3 v;
    public kz f46158w;
    public boolean f46159x;
    public boolean f46160y;

    public q(int i10, Context context, f6 f6Var, li liVar) {
        super(context, f6Var, liVar);
        l lVar = new l(this);
        this.G = true;
        this.M = new e(this, 3);
        this.f46155n = i10;
        this.h = true;
        this.f24284f = true;
        s3 s3Var = new s3(context, i10, f6Var, new q5.c0(this, f6Var, false, 13));
        this.f46156r = s3Var;
        s3Var.setAdaptiveLinkDialogs(false);
        s3Var.setAllowTapAboveContent(false);
        addView(s3Var, b6.e(-1, -1, 119));
        addView(s3Var.getOverlayView(), b6.e(-1, -1, 119));
        s3Var.y4();
        d2 d2Var = s3Var.G3;
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
        w3 w3Var = new w3(context, lVar);
        this.f46157s = w3Var;
        w3Var.setBackVisible(false);
        w3Var.setTopGradientVisible(false);
        Y();
        addView(w3Var, b6.e(-1, -1, 119));
        X();
        Z();
        V(false);
        getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 0));
    }

    public static void J(q qVar) {
        boolean z4;
        int i10 = 0;
        if (!qVar.f46156r.j3() && !qVar.f46159x) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            li liVar = qVar.f24282b;
            if (!liVar.O && liVar.P0) {
                i10 = AndroidUtilities.dp(62.0f);
            }
        }
        if (qVar.H != i10) {
            qVar.H = i10;
            qVar.S();
        }
    }

    public static void K(q qVar) {
        s3 s3Var = qVar.f46156r;
        if (qVar.f46159x) {
            e1 O2 = s3Var.O2();
            if (O2 != null) {
                O2.r();
                AndroidUtilities.showKeyboard(O2);
            }
            qVar.R(true);
            return;
        }
        li liVar = qVar.f24282b;
        if (qVar.f46158w == null) {
            kz kzVar = new kz(liVar.f26685c0, true, false, false, qVar.getContext(), true, null, liVar.f26722o1, true, qVar.f24281a, false, false);
            qVar.f46158w = kzVar;
            kzVar.setVisibility(8);
            kz kzVar2 = qVar.f46158w;
            kzVar2.f26487u2 = false;
            kzVar2.setBottomInset(AndroidUtilities.navigationBarHeight);
            View view = qVar.f46158w.v;
            if (view != null) {
                view.setVisibility(8);
            }
            qVar.f46158w.setDelegate(new o(qVar));
            qVar.addView(qVar.f46158w, b6.e(-1, qVar.getEmojiPanelHeight(), 87));
        }
        int emojiPanelHeight = qVar.getEmojiPanelHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qVar.f46158w.getLayoutParams();
        layoutParams.height = emojiPanelHeight;
        qVar.f46158w.setLayoutParams(layoutParams);
        qVar.f46158w.setTranslationY(0.0f);
        qVar.f46158w.setVisibility(0);
        qVar.f46159x = true;
        qVar.B = emojiPanelHeight;
        e1 O22 = s3Var.O2();
        if (O22 != null) {
            AndroidUtilities.hideKeyboard(O22);
        }
        w3 w3Var = qVar.f46157s;
        if (w3Var != null) {
            w3Var.setEmojiOpened(true);
        }
        qVar.V(false);
        qVar.requestLayout();
    }

    public static e1 M(q qVar) {
        s3 s3Var = qVar.f46156r;
        e1 focusedEditTextOrNull = s3Var.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull != null) {
            qVar.C = focusedEditTextOrNull;
            qVar.D = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
            return focusedEditTextOrNull;
        }
        e1 e1Var = qVar.C;
        if (e1Var != null) {
            return e1Var;
        }
        return s3Var.O2();
    }

    public static int N(q qVar, e1 e1Var) {
        if (e1Var == qVar.C && qVar.f46156r.getFocusedEditTextOrNull() != e1Var) {
            return Math.min(qVar.D, e1Var.length());
        }
        return Math.max(0, e1Var.getSelectionEnd());
    }

    public static void O(q qVar, int i10, int i11) {
        li liVar = qVar.f24282b;
        if (liVar.f26685c0 == null) {
            return;
        }
        li liVar2 = new li(qVar.getContext(), liVar.f26685c0, false, false, true, qVar.f24281a);
        liVar2.W1 = new m(qVar, liVar2);
        liVar2.f26698g0.f0();
        liVar2.J1(1, true);
        liVar2.h1(i10);
        liVar2.f26729q2 = new f(qVar, liVar2);
        liVar2.V = new f(qVar, liVar2);
        liVar2.U = new n(qVar, liVar2);
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
        gg.k0 k0Var = new gg.k0(strArr, horizontalScrollView, p10, zArr2, new ph.d4(strArr, 27), imageView, f6Var, new int[]{6}, 6);
        final org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.ArticleLatexEquation), true, false, -1, f6Var);
        org.telegram.ui.Cells.f3 f3Var = h3Var.f21132b;
        f3Var.setImeOptions(6);
        f3Var.setMaxLines(5);
        h3Var.setBackground(j6.b0(AndroidUtilities.dp(24.0f), j6.v0(j6.f19881d6, f6Var)));
        h3Var.setText(strArr[0]);
        f3Var.addTextChangedListener(new p(strArr, k0Var));
        f10.addView(h3Var, b6.t(-1, -2, 55, 12, 8, 12, 0));
        p10.setText(LocaleController.getString(R.string.Done));
        f10.addView(p10, b6.t(-1, 48, 55, 12, 12, 12, 12));
        k0Var.run();
        o10.customView = f10;
        o10.setOnHideListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                org.telegram.ui.Cells.f3 f3Var2 = org.telegram.ui.Cells.h3.this.f21132b;
                f3Var2.clearFocus();
                AndroidUtilities.hideKeyboard(f3Var2);
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
        int i10 = j6.f19827a7;
        o10.setBackgroundColor(j6.v0(i10, f6Var));
        o10.fixNavigationBar(j6.v0(i10, f6Var));
        p10.setOnClickListener(new nh.c0(p10, zArr, callback, strArr, o10, 15));
        AndroidUtilities.runOnUIThread(new ga(h3Var, 25), 200L);
    }

    private int getEmojiPanelHeight() {
        String str;
        int R = this.f24282b.f26722o1.R();
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
        this.f24282b.U0.setTitle("");
        this.f46156r.V2.N(false);
        V(false);
        post(new e(this, 4));
    }

    @Override
    public final void F() {
        this.f46156r.x0(0);
    }

    @Override
    public final boolean H(int i10, boolean z4, int i11, boolean z10, long j10) {
        long j11;
        MessageObject messageObject;
        MessageObject messageObject2;
        SendMessageChatArguments sendMessageChatArguments;
        lk lkVar;
        int i12 = this.f46155n;
        boolean richEditorAllowed = MessagesController.getInstance(i12).richEditorAllowed();
        s3 s3Var = this.f46156r;
        if (!richEditorAllowed && !UserConfig.getInstance(i12).isPremium() && x4.f(s3Var.f46217i3, s3Var.f46219j3)) {
            y1.p0(getContext(), new b(s3Var, 0), new e(this, 2), this.f24281a);
            return false;
        }
        if (s3Var.j3() && !s3Var.l3()) {
            if (!s3Var.L3()) {
                w3 w3Var = this.f46157s;
                if (w3Var != null) {
                    w3Var.setSendEnabled(s3Var.L3());
                    return false;
                }
            } else {
                boolean richEditorAllowed2 = MessagesController.getInstance(i12).richEditorAllowed();
                li liVar = this.f24282b;
                if (!richEditorAllowed2) {
                    org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
                    if ((p2Var instanceof zn) && (lkVar = ((zn) p2Var).V) != null) {
                        lkVar.R0(x4.k(s3Var.f46217i3), z4, i10, i11);
                        liVar.dismiss(true);
                        return true;
                    }
                } else {
                    ArrayList Y2 = s3Var.Y2();
                    if (!Y2.isEmpty()) {
                        ArrayList A2 = s3Var.A2();
                        ArrayList x22 = s3Var.x2();
                        ArrayList a2 = w4.a(i12, Y2);
                        org.telegram.ui.ActionBar.p2 p2Var2 = liVar.f26685c0;
                        if (p2Var2 instanceof zn) {
                            zn znVar = (zn) p2Var2;
                            MessageObject messageObject3 = znVar.f40642k5;
                            MessageObject messageObject4 = znVar.U3;
                            j11 = znVar.N8();
                            sendMessageChatArguments = znVar.C8();
                            messageObject = messageObject3;
                            messageObject2 = messageObject4;
                        } else {
                            j11 = 0;
                            messageObject = null;
                            messageObject2 = null;
                            sendMessageChatArguments = null;
                        }
                        SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(liVar.G1), Y2, A2, x22, a2, false, liVar.n1(), messageObject, messageObject2, z4, i10, i11, sendMessageChatArguments, j10, j11, 0L);
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
        return !this.f46156r.j3();
    }

    public final void P(p70 p70Var, a aVar, TL_iv.PageBlock pageBlock, int i10, String str, int i11, p70 p70Var2) {
        boolean z4;
        if (aVar != null && aVar.f45853b.getClass() == pageBlock.getClass()) {
            z4 = true;
        } else {
            z4 = false;
        }
        p70Var.j(z4, i10, null, str, new dy0(this, aVar, pageBlock, p70Var2, 27));
        p70Var.y().f19677a.setTypeface(AndroidUtilities.getTypeface("fonts/mw_bold.ttf"));
        p70Var.y().f19677a.setTextSize(1, i11);
    }

    public final boolean Q() {
        s3 s3Var = this.f46156r;
        if (s3Var != null && s3Var.j3()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.f24281a);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ArticleSaveDraftTitle);
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.ArticleSaveDraftMessage);
            alertDialog$Builder.h(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2(this) {
                public final q f46021b;

                {
                    this.f46021b = this;
                }

                @Override
                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f46021b.f24282b.dismiss();
                            return;
                        default:
                            q qVar = this.f46021b;
                            qVar.T();
                            qVar.f24282b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.k(LocaleController.getString(R.string.Save), new org.telegram.ui.ActionBar.c2(this) {
                public final q f46021b;

                {
                    this.f46021b = this;
                }

                @Override
                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f46021b.f24282b.dismiss();
                            return;
                        default:
                            q qVar = this.f46021b;
                            qVar.T();
                            qVar.f24282b.dismiss();
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
        if (this.f46160y) {
            this.f46160y = false;
            kz kzVar = this.f46158w;
            if (kzVar != null) {
                kzVar.t(false);
                if (!z4) {
                    this.f46158w.B();
                }
            }
        }
        this.C = null;
        kz kzVar2 = this.f46158w;
        if (kzVar2 != null) {
            kzVar2.setTranslationY(0.0f);
            this.f46158w.setVisibility(8);
        }
        this.f46159x = false;
        this.B = 0;
        w3 w3Var = this.f46157s;
        if (w3Var != null) {
            w3Var.setEmojiOpened(false);
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
        if (this.f46160y) {
            i10 = AndroidUtilities.dp(245.0f);
        } else {
            i10 = this.B;
        }
        kz kzVar = this.f46158w;
        float f13 = 0.0f;
        li liVar = this.f24282b;
        if (kzVar != null) {
            if (this.f46159x) {
                float f14 = this.B - i10;
                if (this.f46160y) {
                    f12 = -liVar.f26706i2;
                } else {
                    f12 = 0.0f;
                }
                f11 = f14 + f12;
            } else {
                f11 = 0.0f;
            }
            kzVar.setTranslationY(f11);
        }
        w3 w3Var = this.f46157s;
        if (w3Var != null) {
            boolean z4 = this.f46159x;
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
            if (!z4 || this.f46160y) {
                f10 += liVar.f26706i2;
            }
            w3Var.getBottomContainer().animate().cancel();
            w3Var.getBottomContainer().setTranslationY(-f10);
            boolean z10 = this.f46159x;
            if (z10) {
                f13 = i10;
            }
            if (!z10 || this.f46160y) {
                f13 += liVar.f26706i2;
            }
            w3Var.setBottomGradientTranslationY(-f13);
            if (this.J != this.H) {
                ViewPropertyAnimator animate = w3Var.getBottomInnerContainer().animate();
                this.J = this.H;
                animate.translationY(-i12).setDuration(320L).setInterpolator(mr.h).start();
            }
        }
    }

    public final boolean T() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f24282b.f26685c0;
        if (p2Var instanceof zn) {
            zn znVar = (zn) p2Var;
            s3 s3Var = this.f46156r;
            if (!s3Var.q2()) {
                return false;
            }
            TL_iv.RichMessage i22 = s3Var.i2();
            AccountInstance.getInstance(this.f46155n).getMediaDataController().saveDraft(znVar.a(), znVar.B7(znVar.f40642k5), "", null, null, null, null, 0L, false, false, i22);
            lk lkVar = znVar.V;
            if (lkVar != null) {
                lkVar.setRichDraftPreview(i22);
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
        if (!this.f46156r.j3() && !this.f46159x) {
            z10 = false;
        } else {
            z10 = true;
        }
        li liVar = this.f24282b;
        mh mhVar = liVar.f26742u1;
        if (liVar.f26733r2 != z10) {
            liVar.f26733r2 = z10;
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
        throw new UnsupportedOperationException("Method not decompiled: vh.q.W():void");
    }

    public final void X() {
        boolean z4;
        float f10;
        w3 w3Var = this.f46157s;
        if (w3Var != null) {
            s3 s3Var = this.f46156r;
            boolean q22 = s3Var.q2();
            d2 d2Var = s3Var.G3;
            if (d2Var != null && !d2Var.f45931c.isEmpty()) {
                z4 = true;
            } else {
                z4 = false;
            }
            ImageView imageView = w3Var.f46333r;
            ImageView imageView2 = w3Var.f46332n;
            imageView2.setEnabled(q22);
            float f11 = 0.35f;
            if (q22) {
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
        w3 w3Var = this.f46157s;
        if (w3Var != null) {
            int i10 = this.f46155n;
            boolean z10 = false;
            if (!MessagesController.getInstance(i10).richEditorAllowed() && !UserConfig.getInstance(i10).isPremium()) {
                z4 = true;
            } else {
                z4 = false;
            }
            lg sendButton = w3Var.getSendButton();
            if (z4) {
                s3 s3Var = this.f46156r;
                if (x4.f(s3Var.f46217i3, s3Var.f46219j3)) {
                    z10 = true;
                }
            }
            sendButton.setLocked(z10);
            w3Var.setPremiumLocked(z4);
        }
    }

    public final void Z() {
        throw new UnsupportedOperationException("Method not decompiled: vh.q.Z():void");
    }

    public final void a0() {
        int i10;
        w3 w3Var = this.f46157s;
        if (w3Var == null) {
            return;
        }
        int currentActionBarHeight = (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(44.0f)) / 2) + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        s3 s3Var = this.f46156r;
        if (s3Var.getChildCount() <= 0) {
            i10 = s3Var.getPaddingTop();
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < s3Var.getChildCount(); i12++) {
                View childAt = s3Var.getChildAt(i12);
                if (RecyclerView.R(childAt) >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                }
            }
            if (i11 == Integer.MAX_VALUE) {
                i10 = s3Var.getPaddingTop();
            } else {
                i10 = i11;
            }
        }
        w3Var.setTopButtonsOffset(Math.max(currentActionBarHeight, i10));
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
        s3 s3Var = this.f46156r;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if ((this.f24282b.f26685c0 instanceof zn) && s3Var.q2() && T()) {
                kf.k0.v(R.string.RichEditorDraftSaved, new qc(this.f46157s, this.f24281a), R.raw.contact_check, 36);
                return true;
            }
        } else if (!s3Var.g3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int height;
        kz kzVar;
        s3 s3Var = this.f46156r;
        g3 g3Var = s3Var.f46221k3;
        x9 x9Var = s3Var.f46223l3;
        if (!g3Var.y() || !x9Var.onTouchEvent(motionEvent)) {
            if (this.f46160y && (kzVar = this.f46158w) != null) {
                height = (int) kzVar.getY();
            } else {
                height = getHeight() - this.B;
            }
            int dp = (height - AndroidUtilities.dp(60.0f)) - this.H;
            if (motionEvent.getAction() == 0 && this.f46159x && motionEvent.getY() < dp) {
                R(false);
            }
            if ((motionEvent.getAction() != 0 || (motionEvent.getY() > AndroidUtilities.dp(60.0f) && motionEvent.getY() < dp)) && x9Var.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getY() < dp && s3Var.h3(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public int getCurrentItemTop() {
        s3 s3Var = this.f46156r;
        if (s3Var.getChildCount() <= 0) {
            int paddingTop = s3Var.getPaddingTop();
            this.F = paddingTop;
            s3Var.setTopGlowOffset(paddingTop);
            return Integer.MAX_VALUE;
        }
        int i10 = Integer.MAX_VALUE;
        boolean z4 = false;
        for (int i11 = 0; i11 < s3Var.getChildCount(); i11++) {
            View childAt = s3Var.getChildAt(i11);
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
        s3Var.setTopGlowOffset(Math.max(0, i10));
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
        return (this.f46156r.getPaddingTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
    }

    public l9 getTextSelectionHelper() {
        return this.f46156r.getTextSelectionHelper();
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final boolean i() {
        boolean z4 = this.f46160y;
        if (z4) {
            if (z4) {
                this.f46160y = false;
                kz kzVar = this.f46158w;
                if (kzVar != null) {
                    kzVar.t(false);
                    this.f46158w.B();
                }
                S();
                return false;
            }
        } else if (this.f46159x) {
            R(false);
            return false;
        } else if (!this.f46156r.E2() && !Q()) {
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
        ui0 ui0Var = this.L;
        if (ui0Var != null) {
            ui0Var.i();
            this.L = null;
        }
        m.s3 s3Var = this.v;
        if (s3Var != null) {
            s3Var.c();
        }
        s3 s3Var2 = this.f46156r;
        if (s3Var2 != null) {
            s3Var2.u2();
        }
        kz kzVar = this.f46158w;
        if (kzVar != null) {
            kzVar.D();
        }
    }

    @Override
    public final boolean n() {
        s3 s3Var = this.f46156r;
        if (s3Var != null) {
            s3Var.u2();
            return false;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f46155n).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        Y();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f46155n).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
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
        if (this.f46159x) {
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
        this.f24282b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void v() {
        boolean z4;
        if (this.f24282b.f26722o1.R() > AndroidUtilities.dp(20.0f)) {
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
        if (z4 && this.f46159x && !this.f46160y) {
            R(false);
        }
        a0();
    }

    @Override
    public final void y(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: vh.q.y(int, int):void");
    }

    @Override
    public final void q() {
    }
}
