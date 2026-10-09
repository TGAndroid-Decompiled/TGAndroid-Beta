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
public final class rt {
    public static TextPaint f41480f0;
    public static volatile rt f41481g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.he0 C;
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
    public jh1 O;
    public org.telegram.ui.Components.cc P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final nt U;
    public int V;
    public TLRPC.Document W;
    public SendMessagesHelper.ImportingSticker X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f41482a;
    public TLRPC.InputStickerSet f41483a0;
    public int f41484b;
    public Object f41485b0;
    public float f41486c;
    public org.telegram.ui.ActionBar.e6 f41487c0;
    public float d;
    public VibrationEffect f41488d0;
    public boolean f41490e0;
    public float f41491f;
    public float f41492g;
    public View h;
    public boolean f41493i;
    public org.telegram.ui.Components.x21 f41494j;
    public org.telegram.ui.ActionBar.n1 f41495k;
    public pt f41496l;
    public boolean f41497m;
    public boolean f41498n;
    public ArrayList f41499o;
    public boolean f41500p;
    public int f41502r;
    public final fh.b f41503s;
    public final ah.c f41504t;
    public final ColorDrawable f41505u;
    public Bitmap v;
    public Activity f41506w;
    public WindowManager.LayoutParams f41507x;
    public k0 f41508y;
    public ci.m6 f41509z;
    public float f41489e = 0.0f;
    public i0.b f41501q = i0.b.f11575e;

    public rt() {
        fh.b bVar = new fh.b();
        this.f41503s = bVar;
        this.f41504t = new ah.c(bVar);
        this.f41505u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new nt(this);
    }

    public static void a(rt rtVar, Bitmap bitmap, Bitmap bitmap2) {
        fh.b bVar = rtVar.f41503s;
        Paint paint = rtVar.N;
        rtVar.A.setVisible(true, false);
        rtVar.v = bitmap;
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
        gh.d.c(bVar, rtVar.f41508y);
        rtVar.f41504t.d();
        rtVar.f41490e0 = false;
        ci.m6 m6Var = rtVar.f41509z;
        if (m6Var != null) {
            m6Var.invalidate();
        }
    }

    public static int d(rt rtVar, int i10) {
        return org.telegram.ui.ActionBar.i6.w0(i10, rtVar.f41487c0);
    }

    public static boolean h(rt rtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        boolean z13;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        qh.q qVar;
        pt ptVar = rtVar.f41496l;
        if (ptVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = ptVar.d();
        TLRPC.PollAnswer h = rtVar.f41496l.h();
        if (d == null || d.poll == null || h == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, h.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !rtVar.f41496l.c()) {
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
            qh.q qVar2 = new qh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), rtVar.f41502r, rtVar.f41487c0);
            org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(actionBarPopupWindow$ActionBarPopupWindowLayout, rtVar.f41487c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(p80Var.B);
            int i10 = org.telegram.ui.ActionBar.i6.E8;
            p80Var.T(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i10, rtVar.f41487c0)));
            ah.c cVar = rtVar.f41504t;
            dh.e k10 = eh.b.k(rtVar.f41487c0);
            org.telegram.ui.ActionBar.n2 n2Var = null;
            View view = p80Var.B;
            if (view != null) {
                ch.d c10 = cVar.c(view, null, true);
                c10.o(k10);
                view.setBackground(c10);
            }
            z13 = true;
            p80Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new cj(actionBarPopupWindow$ActionBarPopupWindowLayout, 16), false);
            p80Var.k();
            MessageObject A = rtVar.f41496l.A();
            Activity activity = rtVar.f41506w;
            if ((activity instanceof LaunchActivity) && A != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    n2Var = launchActivity.O().getLastFragment();
                }
                if (n2Var != null) {
                    org.telegram.ui.Components.k71 a2 = qVar2.a(n2Var, A.getDialogId(), A.getId(), h.option, pollResult.voters, new ft(0, rtVar, n2Var));
                    qVar = qVar2;
                    p80Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.f46716a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(w7.x5.n(-1, 48));
                    qVar.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.I5, rtVar.f41487c0), 12, 0));
                    qVar.setOnClickListener(new ci.m4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    org.telegram.ui.ActionBar.k1 k1Var = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), rtVar.f41487c0);
                    k1Var.setTag(R.id.fit_width_tag, 1);
                    f7 = 0.06f;
                    k1Var.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i10, rtVar.f41487c0)));
                    k1Var.setLayoutParams(w7.x5.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.f46716a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(w7.x5.n(-1, 48));
            qVar.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.I5, rtVar.f41487c0), 12, 0));
            qVar.setOnClickListener(new ci.m4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), rtVar.f41487c0);
            k1Var2.setTag(R.id.fit_width_tag, 1);
            f7 = 0.06f;
            k1Var2.setColor(org.telegram.ui.ActionBar.i6.m1(0.06f, org.telegram.ui.ActionBar.i6.w0(i10, rtVar.f41487c0)));
            k1Var2.setLayoutParams(w7.x5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k1Var2);
        } else {
            f7 = 0.06f;
            z13 = true;
        }
        if (z11) {
            f10 = f7;
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, rtVar.f41487c0).setOnClickListener(new et(rtVar, 2));
        } else {
            f10 = f7;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, rtVar.f41487c0).setOnClickListener(new et(rtVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            org.telegram.ui.ActionBar.k1 k1Var3 = new org.telegram.ui.ActionBar.k1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), rtVar.f41487c0);
            k1Var3.setTag(R.id.fit_width_tag, 1);
            k1Var3.setColor(org.telegram.ui.ActionBar.i6.m1(f10, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, rtVar.f41487c0)));
            k1Var3.setLayoutParams(w7.x5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(k1Var3);
        }
        if (!z10 && !z11 && !z12) {
            return false;
        }
        return z13;
    }

    public static rt q() {
        rt rtVar;
        rt rtVar2 = f41481g0;
        if (rtVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    rtVar = f41481g0;
                    if (rtVar == null) {
                        rtVar = new rt();
                        f41481g0 = rtVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return rtVar;
        }
        return rtVar2;
    }

    public final void n() {
        if (this.f41506w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f41509z.invalidate();
            this.W = null;
            this.f41483a0 = null;
            this.Y = null;
            this.f41496l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new ct(this, 0), 200L);
            jh1 jh1Var = this.O;
            if (jh1Var != null) {
                jh1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.hs.f27118f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.hs.f27118f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void o() {
        zg.a0 reactionsWindow;
        org.telegram.ui.Components.cc ccVar = this.P;
        if (ccVar != null && (reactionsWindow = ccVar.getReactionsWindow()) != null && !reactionsWindow.f54461q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.n1 n1Var = this.f41495k;
        if (n1Var != null) {
            n1Var.dismiss();
            this.f41495k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.bi.t(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.hs.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.qm0 qm0Var, pt ptVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        this.f41496l = ptVar;
        if (ptVar != null) {
            this.f41497m = ptVar.l();
            this.f41498n = this.f41496l.q();
        }
        pt ptVar2 = this.f41496l;
        if ((ptVar2 == null || ptVar2.i()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = qm0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = qm0Var.getChildAt(i11);
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
                        if (((org.telegram.ui.Cells.f8) childAt).f22088a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.d8) {
                        if (((org.telegram.ui.Cells.d8) childAt).f21983a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.f2) {
                            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                            if (f2Var.f22056a.getBitmap() != null) {
                                int i12 = f2Var.O;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && f2Var.f22071s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.zv) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.iz) && ((org.telegram.ui.Components.iz) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.nz0) && (((org.telegram.ui.Components.nz0) childAt).f29309b instanceof org.telegram.ui.Components.s5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f41482a = x10;
                        this.f41484b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.x21 x21Var = new org.telegram.ui.Components.x21(this, qm0Var, i10, e6Var, 1);
                        this.f41494j = x21Var;
                        AndroidUtilities.runOnUIThread(x21Var, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean s(android.view.MotionEvent r17, org.telegram.ui.Components.qm0 r18, java.lang.Object r19, org.telegram.ui.pt r20, org.telegram.ui.ActionBar.e6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rt.s(android.view.MotionEvent, org.telegram.ui.Components.qm0, java.lang.Object, org.telegram.ui.pt, org.telegram.ui.ActionBar.e6):boolean");
    }

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        int i12;
        ImageReceiver imageReceiver;
        String str3;
        String str4;
        boolean z11;
        long j3;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver2;
        long j10;
        CharSequence charSequence;
        String str5;
        int i13;
        String str6;
        ImageReceiver imageReceiver3;
        nt ntVar;
        if (this.f41506w != null && this.f41508y != null) {
            this.f41487c0 = e6Var;
            this.f41500p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, e6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f41505u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            nt ntVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f41480f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f41480f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f41480f0.getFontMetricsInt(), false), f41480f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f41480f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i10 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(ntVar2);
                            if (i11 > 0) {
                                j10 = i11;
                            } else {
                                j10 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(ntVar2, j10);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f41502r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f41483a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f41483a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f41483a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f41483a0, 1);
                            }
                        }
                        if (MessageObject.isTextColorEmoji(document)) {
                            imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.i6.o0(e6Var));
                        }
                        if (this.G == null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i15);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f41480f0.getFontMetricsInt(), false), f41480f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f41480f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.he0 he0Var = new org.telegram.ui.Components.he0(this.f41509z.getContext());
                                    this.C = he0Var;
                                    this.f41509z.addView(he0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f41480f0.getFontMetricsInt(), z11), f41480f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f41480f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f41496l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(ntVar2);
                            if (i11 > 0) {
                                j3 = i11;
                            } else {
                                j3 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(ntVar2, j3);
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
                        ntVar = ntVar2;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                    } else {
                        imageReceiver3 = imageReceiver5;
                        ntVar = ntVar2;
                        imageReceiver4 = imageReceiver4;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                    }
                } else {
                    imageReceiver3 = imageReceiver5;
                    ntVar = ntVar2;
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
                AndroidUtilities.cancelRunOnUIThread(ntVar);
                AndroidUtilities.runOnUIThread(ntVar, 2000L);
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
            this.f41485b0 = obj;
            this.f41487c0 = e6Var;
            this.f41509z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f41506w);
                try {
                    if (this.f41508y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f41506w.getSystemService(str6)).removeView(this.f41508y);
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            ((WindowManager) this.f41506w.getSystemService(str6)).addView(this.f41508y, this.f41507x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f41486c = -10000.0f;
                            this.f41492g = 0.0f;
                            this.d = 0.0f;
                            this.f41489e = 0.0f;
                            this.H = System.currentTimeMillis();
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
                        }
                    } else {
                        str6 = str4;
                    }
                } catch (Exception e10) {
                    e = e10;
                    str6 = str4;
                }
                ((WindowManager) this.f41506w.getSystemService(str6)).addView(this.f41508y, this.f41507x);
                this.E = true;
                this.F = 0.0f;
                this.f41486c = -10000.0f;
                this.f41492g = 0.0f;
                this.d = 0.0f;
                this.f41489e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        org.telegram.ui.Components.x21 x21Var = this.f41494j;
        if (x21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x21Var);
            this.f41494j = null;
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

    public final void v(pt ptVar) {
        this.f41496l = ptVar;
        if (ptVar != null) {
            this.f41497m = ptVar.l();
            this.f41498n = this.f41496l.q();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f41502r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f41502r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f41506w == activity) {
            return;
        }
        this.f41506w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f41508y = new k0(this, activity, 5);
        hh.j jVar = new hh.j(this.f41508y);
        k0 k0Var = this.f41508y;
        ah.c cVar = this.f41504t;
        cVar.f545f = jVar;
        cVar.f546g = k0Var;
        cVar.f544e = new qe.b();
        this.f41508y.setFocusable(true);
        this.f41508y.setFocusableInTouchMode(true);
        this.f41508y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f41508y;
        dt dtVar = new dt(this);
        WeakHashMap weakHashMap = r0.i0.f46764a;
        r0.a0.i(k0Var2, dtVar);
        ci.m6 m6Var = new ci.m6(this, activity);
        this.f41509z = m6Var;
        m6Var.setFocusable(false);
        this.f41508y.addView(this.f41509z, w7.x5.e(-1, -1, 51));
        this.f41509z.setOnTouchListener(new e0(this, 1));
        MessagesController.getInstance(this.f41502r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f41507x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f41509z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f41509z);
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
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f8Var.getSticker(), null, Integer.valueOf(this.f41502r));
        pt ptVar = this.f41496l;
        if (ptVar != null) {
            str = ptVar.G(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, f8Var.f22098y, f8Var.getParentObject(), this.f41487c0, 0);
        nt ntVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(ntVar);
        AndroidUtilities.runOnUIThread(ntVar, 16L);
        f8Var.setScaled(true);
        return true;
    }
}
