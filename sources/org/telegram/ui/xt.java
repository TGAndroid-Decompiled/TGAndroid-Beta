package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class xt {
    public static TextPaint f41632f0;
    public static volatile xt f41633g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.fe0 C;
    public Path D;
    public boolean E;
    public float F;
    public StaticLayout G;
    public long H;
    public int I;
    public Drawable J;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout L;
    public float M;
    public final Paint N;
    public ph1 O;
    public org.telegram.ui.Components.bc P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final tt U;
    public int V;
    public TLRPC.Document W;
    public SendMessagesHelper.ImportingSticker X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f41634a;
    public TLRPC.InputStickerSet f41635a0;
    public int f41636b;
    public Object f41637b0;
    public float f41638c;
    public org.telegram.ui.ActionBar.c6 f41639c0;
    public float d;
    public VibrationEffect f41640d0;
    public boolean f41641e0;
    public float f41642f;
    public float f41643g;
    public View h;
    public boolean f41644i;
    public org.telegram.ui.Components.n21 f41645j;
    public org.telegram.ui.ActionBar.m1 f41646k;
    public vt f41647l;
    public boolean f41648m;
    public boolean f41649n;
    public ArrayList f41650o;
    public boolean f41651p;
    public int f41653r;
    public final gh.b f41654s;
    public final bh.b f41655t;
    public final ColorDrawable f41656u;
    public Bitmap v;
    public Activity f41657w;
    public WindowManager.LayoutParams f41658x;
    public l0 f41659y;
    public ah.v f41660z;
    public float e = 0.0f;
    public i0.b f41652q = i0.b.e;

    public xt() {
        gh.b bVar = new gh.b();
        this.f41654s = bVar;
        this.f41655t = new bh.b(bVar);
        this.f41656u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new tt(this);
    }

    public static void a(xt xtVar, Bitmap bitmap, Bitmap bitmap2) {
        gh.b bVar = xtVar.f41654s;
        Paint paint = xtVar.N;
        xtVar.A.setVisible(true, false);
        xtVar.v = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(15.0f, 15.0f);
        bitmapShader.setLocalMatrix(matrix);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
        bVar.a(bitmap2);
        hh.d.c(bVar, xtVar.f41659y);
        xtVar.f41655t.d();
        xtVar.f41641e0 = false;
        ah.v vVar = xtVar.f41660z;
        if (vVar != null) {
            vVar.invalidate();
        }
    }

    public static int d(xt xtVar, int i10) {
        return org.telegram.ui.ActionBar.g6.w0(i10, xtVar.f41639c0);
    }

    public static boolean h(xt xtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        boolean z13;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        rh.q qVar;
        vt vtVar = xtVar.f41647l;
        if (vtVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = vtVar.d();
        TLRPC.PollAnswer h = xtVar.f41647l.h();
        if (d == null || d.poll == null || h == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, h.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !xtVar.f41647l.c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && MessageObject.canUnvote(d)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10) {
            rh.q qVar2 = new rh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), xtVar.f41653r, xtVar.f41639c0);
            org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(actionBarPopupWindow$ActionBarPopupWindowLayout, xtVar.f41639c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(l80Var.B);
            int i10 = org.telegram.ui.ActionBar.g6.E8;
            l80Var.T(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(i10, xtVar.f41639c0)));
            bh.b bVar = xtVar.f41655t;
            eh.e k10 = fh.b.k(xtVar.f41639c0);
            org.telegram.ui.ActionBar.m2 m2Var = null;
            View view = l80Var.B;
            if (view != null) {
                dh.d c10 = bVar.c(view, null, true);
                c10.o(k10);
                view.setBackground(c10);
            }
            z13 = true;
            l80Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new gj(actionBarPopupWindow$ActionBarPopupWindowLayout, 16), false);
            l80Var.k();
            MessageObject A = xtVar.f41647l.A();
            Activity activity = xtVar.f41657w;
            if ((activity instanceof LaunchActivity) && A != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    m2Var = launchActivity.O().getLastFragment();
                }
                if (m2Var != null) {
                    org.telegram.ui.Components.i71 a2 = qVar2.a(m2Var, A.getDialogId(), A.getId(), h.option, pollResult.voters, new mt(0, xtVar, m2Var));
                    qVar = qVar2;
                    l80Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.f44462a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(w7.z5.n(-1, 48));
                    qVar.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.I5, xtVar.f41639c0), 12, 0));
                    qVar.setOnClickListener(new di.m4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    org.telegram.ui.ActionBar.j1 j1Var = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), xtVar.f41639c0);
                    j1Var.setTag(R.id.fit_width_tag, 1);
                    f7 = 0.06f;
                    j1Var.setColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(i10, xtVar.f41639c0)));
                    j1Var.setLayoutParams(w7.z5.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.f44462a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(w7.z5.n(-1, 48));
            qVar.setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.I5, xtVar.f41639c0), 12, 0));
            qVar.setOnClickListener(new di.m4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            org.telegram.ui.ActionBar.j1 j1Var2 = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), xtVar.f41639c0);
            j1Var2.setTag(R.id.fit_width_tag, 1);
            f7 = 0.06f;
            j1Var2.setColor(org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(i10, xtVar.f41639c0)));
            j1Var2.setLayoutParams(w7.z5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j1Var2);
        } else {
            f7 = 0.06f;
            z13 = true;
        }
        if (z11) {
            f10 = f7;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, xtVar.f41639c0).setOnClickListener(new lt(xtVar, 2));
        } else {
            f10 = f7;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, xtVar.f41639c0).setOnClickListener(new lt(xtVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            org.telegram.ui.ActionBar.j1 j1Var3 = new org.telegram.ui.ActionBar.j1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), xtVar.f41639c0);
            j1Var3.setTag(R.id.fit_width_tag, 1);
            j1Var3.setColor(org.telegram.ui.ActionBar.g6.m1(f10, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, xtVar.f41639c0)));
            j1Var3.setLayoutParams(w7.z5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(j1Var3);
        }
        if (!z10 && !z11 && !z12) {
            return false;
        }
        return z13;
    }

    public static xt q() {
        xt xtVar;
        xt xtVar2 = f41633g0;
        if (xtVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    xtVar = f41633g0;
                    if (xtVar == null) {
                        xtVar = new xt();
                        f41633g0 = xtVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return xtVar;
        }
        return xtVar2;
    }

    public final void n() {
        if (this.f41657w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f41660z.invalidate();
            this.W = null;
            this.f41635a0 = null;
            this.Y = null;
            this.f41647l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new jt(this, 0), 200L);
            ph1 ph1Var = this.O;
            if (ph1Var != null) {
                ph1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.es.f24465f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.es.f24465f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void o() {
        ah.t0 reactionsWindow;
        org.telegram.ui.Components.bc bcVar = this.P;
        if (bcVar != null && (reactionsWindow = bcVar.getReactionsWindow()) != null && !reactionsWindow.f881q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.m1 m1Var = this.f41646k;
        if (m1Var != null) {
            m1Var.dismiss();
            this.f41646k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.sk.t(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.es.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.mm0 mm0Var, vt vtVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        this.f41647l = vtVar;
        if (vtVar != null) {
            this.f41648m = vtVar.k();
            this.f41649n = this.f41647l.p();
        }
        vt vtVar2 = this.f41647l;
        if ((vtVar2 == null || vtVar2.i()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = mm0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = mm0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y3 && bottom >= y3 && left <= x10 && right >= x10) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.f8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.f8) childAt).f20882a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.d8) {
                        if (((org.telegram.ui.Cells.d8) childAt).f20774a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.f2) {
                            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                            if (f2Var.f20845a.getBitmap() != null) {
                                int i12 = f2Var.O;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && f2Var.f20859s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.vv) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.ez) && ((org.telegram.ui.Components.ez) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.kz0) && (((org.telegram.ui.Components.kz0) childAt).f26509b instanceof org.telegram.ui.Components.s5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f41634a = x10;
                        this.f41636b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.n21 n21Var = new org.telegram.ui.Components.n21(this, mm0Var, i10, c6Var, 2);
                        this.f41645j = n21Var;
                        AndroidUtilities.runOnUIThread(n21Var, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean s(android.view.MotionEvent r17, org.telegram.ui.Components.mm0 r18, java.lang.Object r19, org.telegram.ui.vt r20, org.telegram.ui.ActionBar.c6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xt.s(android.view.MotionEvent, org.telegram.ui.Components.mm0, java.lang.Object, org.telegram.ui.vt, org.telegram.ui.ActionBar.c6):boolean");
    }

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        int i12;
        ImageReceiver imageReceiver;
        String str3;
        String str4;
        boolean z11;
        long j10;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver2;
        long j11;
        CharSequence charSequence;
        String str5;
        int i13;
        String str6;
        ImageReceiver imageReceiver3;
        tt ttVar;
        if (this.f41657w != null && this.f41659y != null) {
            this.f41639c0 = c6Var;
            this.f41651p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f41656u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            tt ttVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f41632f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f41632f0 = textPaint;
                        textPaint.setTextSize(AndroidUtilities.dp(24.0f));
                    }
                    imageReceiver6.clearImage();
                    this.S = false;
                    if (document != null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 < document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i14);
                                imageReceiver = imageReceiver6;
                                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                                    break;
                                }
                                i14++;
                                imageReceiver6 = imageReceiver;
                            } else {
                                imageReceiver = imageReceiver6;
                                inputStickerSet = null;
                                break;
                            }
                        }
                        if (str != null) {
                            imageReceiver2 = imageReceiver4;
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f41632f0.getFontMetricsInt(), false), f41632f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f41632f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i10 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(ttVar2);
                            if (i11 > 0) {
                                j11 = i11;
                            } else {
                                j11 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(ttVar2, j11);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f41653r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f41635a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f41635a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f41635a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f41635a0, 1);
                            }
                        }
                        if (MessageObject.isTextColorEmoji(document)) {
                            imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.g6.o0(c6Var));
                        }
                        if (this.G == null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i15);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f41632f0.getFontMetricsInt(), false), f41632f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f41632f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    break;
                                }
                                i15++;
                            }
                        }
                    } else {
                        imageReceiver = imageReceiver6;
                        if (importingSticker != null) {
                            String str7 = importingSticker.path;
                            if (importingSticker.animated) {
                                str3 = "tgs";
                            } else {
                                str3 = null;
                            }
                            str4 = "window";
                            imageReceiver4.setImage(str7, null, null, str3, 0L);
                            if (importingSticker.videoEditedInfo != null) {
                                if (this.C == null) {
                                    org.telegram.ui.Components.fe0 fe0Var = new org.telegram.ui.Components.fe0(this.f41660z.getContext());
                                    this.C = fe0Var;
                                    this.f41660z.addView(fe0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f41632f0.getFontMetricsInt(), z11), f41632f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f41632f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f41647l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(ttVar2);
                            if (i11 > 0) {
                                j10 = i11;
                            } else {
                                j10 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(ttVar2, j10);
                        }
                    }
                    str4 = "window";
                } else {
                    return;
                }
            } else {
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                    TLRPC.VideoSize documentVideoThumb = MessageObject.getDocumentVideoThumb(document);
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    forDocument.imageType = 2;
                    if (documentVideoThumb != null) {
                        imageReceiver3 = imageReceiver5;
                        ttVar = ttVar2;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                    } else {
                        imageReceiver3 = imageReceiver5;
                        ttVar = ttVar2;
                        imageReceiver4 = imageReceiver4;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                    }
                } else {
                    imageReceiver3 = imageReceiver5;
                    ttVar = ttVar2;
                    if (botInlineResult != null && botInlineResult.content != null) {
                        TLRPC.WebDocument webDocument = botInlineResult.thumb;
                        if ((webDocument instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument.mime_type)) {
                            imageReceiver4 = imageReceiver4;
                            imageReceiver4.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", null, botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                        } else {
                            imageReceiver4 = imageReceiver4;
                            imageReceiver4.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.content)), null, ImageLocation.getForWebFile(WebFile.createWithWebDocument(botInlineResult.thumb)), "90_90_b", botInlineResult.content.size, null, "gif" + botInlineResult, 1);
                        }
                    } else {
                        return;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(ttVar);
                AndroidUtilities.runOnUIThread(ttVar, 2000L);
                str4 = "window";
                imageReceiver = imageReceiver3;
            }
            if (imageReceiver4.getLottieAnimation() != null) {
                i13 = 0;
                imageReceiver4.getLottieAnimation().M(0);
            } else {
                i13 = 0;
            }
            if (this.S && imageReceiver.getLottieAnimation() != null) {
                imageReceiver.getLottieAnimation().M(i13);
            }
            this.V = i10;
            this.W = document;
            this.X = importingSticker;
            this.Y = str2;
            this.Z = botInlineResult;
            this.f41637b0 = obj;
            this.f41639c0 = c6Var;
            this.f41660z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f41657w);
                try {
                    if (this.f41659y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f41657w.getSystemService(str6)).removeView(this.f41659y);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            ((WindowManager) this.f41657w.getSystemService(str6)).addView(this.f41659y, this.f41658x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f41638c = -10000.0f;
                            this.f41643g = 0.0f;
                            this.d = 0.0f;
                            this.e = 0.0f;
                            this.H = System.currentTimeMillis();
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
                        }
                    } else {
                        str6 = str4;
                    }
                } catch (Exception e7) {
                    e = e7;
                    str6 = str4;
                }
                ((WindowManager) this.f41657w.getSystemService(str6)).addView(this.f41659y, this.f41658x);
                this.E = true;
                this.F = 0.0f;
                this.f41638c = -10000.0f;
                this.f41643g = 0.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        org.telegram.ui.Components.n21 n21Var = this.f41645j;
        if (n21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n21Var);
            this.f41645j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.f8) {
                ((org.telegram.ui.Cells.f8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.f2) {
                ((org.telegram.ui.Cells.f2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(vt vtVar) {
        this.f41647l = vtVar;
        if (vtVar != null) {
            this.f41648m = vtVar.k();
            this.f41649n = this.f41647l.p();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f41653r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f41653r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f41657w == activity) {
            return;
        }
        this.f41657w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f41659y = new l0(this, activity, 5);
        ih.j jVar = new ih.j(this.f41659y);
        l0 l0Var = this.f41659y;
        bh.b bVar = this.f41655t;
        bVar.f2749f = jVar;
        bVar.f2750g = l0Var;
        bVar.e = new re.b();
        this.f41659y.setFocusable(true);
        this.f41659y.setFocusableInTouchMode(true);
        this.f41659y.setSystemUiVisibility(1792);
        l0 l0Var2 = this.f41659y;
        kt ktVar = new kt(this);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(l0Var2, ktVar);
        ah.v vVar = new ah.v(this, activity);
        this.f41660z = vVar;
        vVar.setFocusable(false);
        this.f41659y.addView(this.f41660z, w7.z5.e(-1, -1, 51));
        this.f41660z.setOnTouchListener(new e0(this, 1));
        MessagesController.getInstance(this.f41653r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f41658x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f41660z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f41660z);
    }

    public final void x() {
        this.T = null;
    }

    public final boolean y(View view) {
        if (!(view instanceof org.telegram.ui.Cells.f8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.f8) {
            ((org.telegram.ui.Cells.f8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.d8) {
            ((org.telegram.ui.Cells.d8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.f2) {
            ((org.telegram.ui.Cells.f2) view2).setScaled(false);
        }
        this.h = f8Var;
        TLRPC.Document sticker = f8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = f8Var.getStickerPath();
        String str = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f8Var.getSticker(), null, Integer.valueOf(this.f41653r));
        vt vtVar = this.f41647l;
        if (vtVar != null) {
            str = vtVar.G(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, f8Var.f20891y, f8Var.getParentObject(), this.f41639c0, 0);
        tt ttVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(ttVar);
        AndroidUtilities.runOnUIThread(ttVar, 16L);
        f8Var.setScaled(true);
        return true;
    }
}
