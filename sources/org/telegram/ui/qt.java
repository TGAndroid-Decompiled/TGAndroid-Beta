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
public final class qt {
    public static TextPaint f36881f0;
    public static volatile qt f36882g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.qd0 C;
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
    public ah1 O;
    public org.telegram.ui.Components.zb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final mt U;
    public int V;
    public TLRPC.Document W;
    public SendMessagesHelper.ImportingSticker X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f36883a;
    public TLRPC.InputStickerSet f36884a0;
    public int f36885b;
    public Object f36886b0;
    public float f36887c;
    public org.telegram.ui.ActionBar.e6 f36888c0;
    public float d;
    public VibrationEffect f36889d0;
    public boolean f36890e0;
    public float f36891f;
    public float f36892g;
    public View h;
    public boolean f36893i;
    public org.telegram.ui.Components.h21 f36894j;
    public org.telegram.ui.ActionBar.o1 f36895k;
    public ot f36896l;
    public boolean f36897m;
    public boolean f36898n;
    public ArrayList f36899o;
    public boolean f36900p;
    public int f36902r;
    public final fh.b f36903s;
    public final ah.c f36904t;
    public final ColorDrawable f36905u;
    public Bitmap v;
    public Activity f36906w;
    public WindowManager.LayoutParams f36907x;
    public l0 f36908y;
    public ci.m6 f36909z;
    public float e = 0.0f;
    public i0.b f36901q = i0.b.e;

    public qt() {
        fh.b bVar = new fh.b();
        this.f36903s = bVar;
        this.f36904t = new ah.c(bVar);
        this.f36905u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new mt(this);
    }

    public static void a(qt qtVar, Bitmap bitmap, Bitmap bitmap2) {
        fh.b bVar = qtVar.f36903s;
        Paint paint = qtVar.N;
        qtVar.A.setVisible(true, false);
        qtVar.v = bitmap;
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
        gh.d.c(bVar, qtVar.f36908y);
        qtVar.f36904t.d();
        qtVar.f36890e0 = false;
        ci.m6 m6Var = qtVar.f36909z;
        if (m6Var != null) {
            m6Var.invalidate();
        }
    }

    public static int d(qt qtVar, int i10) {
        return org.telegram.ui.ActionBar.i6.v0(i10, qtVar.f36888c0);
    }

    public static boolean h(qt qtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        qh.q qVar;
        ot otVar = qtVar.f36896l;
        if (otVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = otVar.d();
        TLRPC.PollAnswer h = qtVar.f36896l.h();
        if (d == null || d.poll == null || h == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, h.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !qtVar.f36896l.c()) {
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
            qh.q qVar2 = new qh.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), qtVar.f36902r, qtVar.f36888c0);
            org.telegram.ui.Components.a80 a80Var = new org.telegram.ui.Components.a80(actionBarPopupWindow$ActionBarPopupWindowLayout, qtVar.f36888c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(a80Var.B);
            int i10 = org.telegram.ui.ActionBar.i6.E8;
            a80Var.T(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(i10, qtVar.f36888c0)));
            ah.c cVar = qtVar.f36904t;
            dh.e k10 = eh.b.k(qtVar.f36888c0);
            org.telegram.ui.ActionBar.o2 o2Var = null;
            View view = a80Var.B;
            if (view != null) {
                ch.d c10 = cVar.c(view, null, true);
                c10.u(k10);
                view.setBackground(c10);
            }
            z13 = true;
            a80Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new cj(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            a80Var.k();
            MessageObject A = qtVar.f36896l.A();
            Activity activity = qtVar.f36906w;
            if ((activity instanceof LaunchActivity) && A != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    o2Var = launchActivity.O().getLastFragment();
                }
                if (o2Var != null) {
                    org.telegram.ui.Components.t61 a2 = qVar2.a(o2Var, A.getDialogId(), A.getId(), h.option, pollResult.voters, new et(0, qtVar, o2Var));
                    qVar = qVar2;
                    a80Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.f42118a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(w7.y5.n(-1, 48));
                    qVar.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I5, qtVar.f36888c0), 12, 0));
                    qVar.setOnClickListener(new ci.n4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    org.telegram.ui.ActionBar.l1 l1Var = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), qtVar.f36888c0);
                    l1Var.setTag(R.id.fit_width_tag, 1);
                    l1Var.setColor(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(i10, qtVar.f36888c0)));
                    l1Var.setLayoutParams(w7.y5.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.f42118a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(w7.y5.n(-1, 48));
            qVar.setBackground(org.telegram.ui.ActionBar.i6.Y(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I5, qtVar.f36888c0), 12, 0));
            qVar.setOnClickListener(new ci.n4(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            org.telegram.ui.ActionBar.l1 l1Var2 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), qtVar.f36888c0);
            l1Var2.setTag(R.id.fit_width_tag, 1);
            l1Var2.setColor(org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(i10, qtVar.f36888c0)));
            l1Var2.setLayoutParams(w7.y5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(l1Var2);
        } else {
            z13 = true;
        }
        if (z11) {
            f7 = 0.06f;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, qtVar.f36888c0).setOnClickListener(new dt(qtVar, 2));
        } else {
            f7 = 0.06f;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, qtVar.f36888c0).setOnClickListener(new dt(qtVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            org.telegram.ui.ActionBar.l1 l1Var3 = new org.telegram.ui.ActionBar.l1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), qtVar.f36888c0);
            l1Var3.setTag(R.id.fit_width_tag, 1);
            l1Var3.setColor(org.telegram.ui.ActionBar.i6.l1(f7, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, qtVar.f36888c0)));
            l1Var3.setLayoutParams(w7.y5.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(l1Var3);
        }
        if (!z10 && !z11 && !z12) {
            return false;
        }
        return z13;
    }

    public static qt q() {
        qt qtVar;
        qt qtVar2 = f36882g0;
        if (qtVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    qtVar = f36882g0;
                    if (qtVar == null) {
                        qtVar = new qt();
                        f36882g0 = qtVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return qtVar;
        }
        return qtVar2;
    }

    public final void n() {
        if (this.f36906w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f36909z.invalidate();
            this.W = null;
            this.f36884a0 = null;
            this.Y = null;
            this.f36896l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new bt(this, 0), 200L);
            ah1 ah1Var = this.O;
            if (ah1Var != null) {
                ah1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.sr.f28359f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.sr.f28359f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void o() {
        zg.c0 reactionsWindow;
        org.telegram.ui.Components.zb zbVar = this.P;
        if (zbVar != null && (reactionsWindow = zbVar.getReactionsWindow()) != null && !reactionsWindow.f49312q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.o1 o1Var = this.f36895k;
        if (o1Var != null) {
            o1Var.dismiss();
            this.f36895k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.qk.s(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.sr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.yl0 yl0Var, ot otVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        this.f36896l = otVar;
        if (otVar != null) {
            this.f36897m = otVar.l();
            this.f36898n = this.f36896l.q();
        }
        ot otVar2 = this.f36896l;
        if ((otVar2 == null || otVar2.i()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = yl0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = yl0Var.getChildAt(i11);
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
                        if (((org.telegram.ui.Cells.f8) childAt).f20305a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.d8) {
                        if (((org.telegram.ui.Cells.d8) childAt).f20147a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.f2) {
                            org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) childAt;
                            if (f2Var.f20275a.getBitmap() != null) {
                                int i12 = f2Var.O;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && f2Var.f20289s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.lv) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.vy) && ((org.telegram.ui.Components.vy) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.yy0) && (((org.telegram.ui.Components.yy0) childAt).f30803b instanceof org.telegram.ui.Components.q5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f36883a = x10;
                        this.f36885b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.h21 h21Var = new org.telegram.ui.Components.h21(this, yl0Var, i10, e6Var, 1);
                        this.f36894j = h21Var;
                        AndroidUtilities.runOnUIThread(h21Var, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean s(android.view.MotionEvent r17, org.telegram.ui.Components.yl0 r18, java.lang.Object r19, org.telegram.ui.ot r20, org.telegram.ui.ActionBar.e6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qt.s(android.view.MotionEvent, org.telegram.ui.Components.yl0, java.lang.Object, org.telegram.ui.ot, org.telegram.ui.ActionBar.e6):boolean");
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
        mt mtVar;
        if (this.f36906w != null && this.f36908y != null) {
            this.f36888c0 = e6Var;
            this.f36900p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, e6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f36905u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            mt mtVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f36881f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f36881f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f36881f0.getFontMetricsInt(), false), f36881f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f36881f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i10 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(mtVar2);
                            if (i11 > 0) {
                                j10 = i11;
                            } else {
                                j10 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(mtVar2, j10);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f36902r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f36884a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f36884a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f36884a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f36884a0, 1);
                            }
                        }
                        if (MessageObject.isTextColorEmoji(document)) {
                            imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.i6.n0(e6Var));
                        }
                        if (this.G == null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i15);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f36881f0.getFontMetricsInt(), false), f36881f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f36881f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(this.f36909z.getContext());
                                    this.C = qd0Var;
                                    this.f36909z.addView(qd0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f36881f0.getFontMetricsInt(), z11), f36881f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f36881f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f36896l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(mtVar2);
                            if (i11 > 0) {
                                j3 = i11;
                            } else {
                                j3 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(mtVar2, j3);
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
                        mtVar = mtVar2;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                    } else {
                        imageReceiver3 = imageReceiver5;
                        mtVar = mtVar2;
                        imageReceiver4 = imageReceiver4;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                    }
                } else {
                    imageReceiver3 = imageReceiver5;
                    mtVar = mtVar2;
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
                AndroidUtilities.cancelRunOnUIThread(mtVar);
                AndroidUtilities.runOnUIThread(mtVar, 2000L);
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
            this.f36886b0 = obj;
            this.f36888c0 = e6Var;
            this.f36909z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f36906w);
                try {
                    if (this.f36908y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f36906w.getSystemService(str6)).removeView(this.f36908y);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            ((WindowManager) this.f36906w.getSystemService(str6)).addView(this.f36908y, this.f36907x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f36887c = -10000.0f;
                            this.f36892g = 0.0f;
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
                ((WindowManager) this.f36906w.getSystemService(str6)).addView(this.f36908y, this.f36907x);
                this.E = true;
                this.F = 0.0f;
                this.f36887c = -10000.0f;
                this.f36892g = 0.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        org.telegram.ui.Components.h21 h21Var = this.f36894j;
        if (h21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h21Var);
            this.f36894j = null;
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

    public final void v(ot otVar) {
        this.f36896l = otVar;
        if (otVar != null) {
            this.f36897m = otVar.l();
            this.f36898n = this.f36896l.q();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f36902r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f36902r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f36906w == activity) {
            return;
        }
        this.f36906w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f36908y = new l0(this, activity, 5);
        hh.k kVar = new hh.k(this.f36908y);
        l0 l0Var = this.f36908y;
        ah.c cVar = this.f36904t;
        cVar.f425f = kVar;
        cVar.f426g = l0Var;
        cVar.e = new pe.b();
        this.f36908y.setFocusable(true);
        this.f36908y.setFocusableInTouchMode(true);
        this.f36908y.setSystemUiVisibility(1792);
        l0 l0Var2 = this.f36908y;
        ct ctVar = new ct(this);
        WeakHashMap weakHashMap = r0.i0.f42173a;
        r0.a0.j(l0Var2, ctVar);
        ci.m6 m6Var = new ci.m6(this, activity);
        this.f36909z = m6Var;
        m6Var.setFocusable(false);
        this.f36908y.addView(this.f36909z, w7.y5.e(-1, -1, 51));
        this.f36909z.setOnTouchListener(new f0(this, 1));
        MessagesController.getInstance(this.f36902r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f36907x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f36909z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f36909z);
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
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(f8Var.getSticker(), null, Integer.valueOf(this.f36902r));
        ot otVar = this.f36896l;
        if (otVar != null) {
            str = otVar.G(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, f8Var.f20314y, f8Var.getParentObject(), this.f36888c0, 0);
        mt mtVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(mtVar);
        AndroidUtilities.runOnUIThread(mtVar, 16L);
        f8Var.setScaled(true);
        return true;
    }
}
