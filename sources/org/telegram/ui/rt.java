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
    public static TextPaint f38025f0;
    public static volatile rt f38026g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.id0 C;
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
    public xg1 O;
    public org.telegram.ui.Components.rb P;
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
    public int f38027a;
    public TLRPC.InputStickerSet f38028a0;
    public int f38029b;
    public Object f38030b0;
    public float f38031c;
    public org.telegram.ui.ActionBar.f6 f38032c0;
    public float d;
    public VibrationEffect f38033d0;
    public boolean f38034e0;
    public float f38035f;
    public float f38036g;
    public View h;
    public boolean f38037i;
    public et f38038j;
    public org.telegram.ui.ActionBar.p1 f38039k;
    public pt f38040l;
    public boolean f38041m;
    public boolean f38042n;
    public ArrayList f38043o;
    public boolean f38044p;
    public int f38046r;
    public final sg.b f38047s;
    public final ng.a f38048t;
    public final ColorDrawable f38049u;
    public Bitmap v;
    public Activity f38050w;
    public WindowManager.LayoutParams f38051x;
    public n0 f38052y;
    public ah.e f38053z;
    public float e = 0.0f;
    public i0.b f38045q = i0.b.e;

    public rt() {
        sg.b bVar = new sg.b();
        this.f38047s = bVar;
        this.f38048t = new ng.a(bVar);
        this.f38049u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new nt(this);
    }

    public static void a(rt rtVar, Bitmap bitmap, Bitmap bitmap2) {
        sg.b bVar = rtVar.f38047s;
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
        tg.c.c(bVar, rtVar.f38052y);
        rtVar.f38048t.d();
        rtVar.f38034e0 = false;
        ah.e eVar = rtVar.f38053z;
        if (eVar != null) {
            eVar.invalidate();
        }
    }

    public static int d(rt rtVar, int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, rtVar.f38032c0);
    }

    public static boolean h(rt rtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        dh.u uVar;
        pt ptVar = rtVar.f38040l;
        if (ptVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll e = ptVar.e();
        TLRPC.PollAnswer h = rtVar.f38040l.h();
        if (e == null || e.poll == null || h == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(e, h.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(e)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!MessageObject.isVoted(e) && !e.poll.closed && !rtVar.f38040l.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && MessageObject.canUnvote(e)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z4) {
            dh.u uVar2 = new dh.u(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), rtVar.f38046r, rtVar.f38032c0);
            org.telegram.ui.Components.p70 p70Var = new org.telegram.ui.Components.p70(actionBarPopupWindow$ActionBarPopupWindowLayout, rtVar.f38032c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(p70Var.B);
            int i10 = org.telegram.ui.ActionBar.j6.E8;
            p70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, rtVar.f38032c0)));
            ng.a aVar = rtVar.f38048t;
            qg.d k10 = rg.b.k(rtVar.f38032c0);
            org.telegram.ui.ActionBar.p2 p2Var = null;
            View view = p70Var.B;
            if (view != null) {
                pg.b c3 = aVar.c(view, null, true);
                c3.n(k10);
                view.setBackground(c3);
            }
            z12 = true;
            p70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new bj(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            p70Var.k();
            MessageObject z13 = rtVar.f38040l.z();
            Activity activity = rtVar.f38050w;
            if ((activity instanceof LaunchActivity) && z13 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    p2Var = launchActivity.O().getLastFragment();
                }
                if (p2Var != null) {
                    org.telegram.ui.Components.g61 a2 = uVar2.a(p2Var, z13.getDialogId(), z13.getId(), h.option, pollResult.voters, new org.telegram.ui.Components.vk(10, rtVar, p2Var));
                    uVar = uVar2;
                    p70Var.q(a2);
                    uVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    uVar.f4947a.d(pollResult.recent_voters, false);
                    uVar.setLayoutParams(k7.b6.n(-1, 48));
                    uVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, rtVar.f38032c0), 12, 0));
                    uVar.setOnClickListener(new lh.y0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 14));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(uVar);
                    org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), rtVar.f38032c0);
                    m1Var.setTag(R.id.fit_width_tag, 1);
                    m1Var.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, rtVar.f38032c0)));
                    m1Var.setLayoutParams(k7.b6.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m1Var);
                }
            }
            uVar = uVar2;
            uVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            uVar.f4947a.d(pollResult.recent_voters, false);
            uVar.setLayoutParams(k7.b6.n(-1, 48));
            uVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, rtVar.f38032c0), 12, 0));
            uVar.setOnClickListener(new lh.y0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 14));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(uVar);
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), rtVar.f38032c0);
            m1Var2.setTag(R.id.fit_width_tag, 1);
            m1Var2.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, rtVar.f38032c0)));
            m1Var2.setLayoutParams(k7.b6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m1Var2);
        } else {
            z12 = true;
        }
        if (z10) {
            f10 = 0.06f;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, rtVar.f38032c0).setOnClickListener(new ft(rtVar, 2));
        } else {
            f10 = 0.06f;
        }
        if (z11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, rtVar.f38032c0).setOnClickListener(new ft(rtVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z4 && (z10 || z11)) {
            org.telegram.ui.ActionBar.m1 m1Var3 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), rtVar.f38032c0);
            m1Var3.setTag(R.id.fit_width_tag, 1);
            m1Var3.setColor(org.telegram.ui.ActionBar.j6.l1(f10, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, rtVar.f38032c0)));
            m1Var3.setLayoutParams(k7.b6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(m1Var3);
        }
        if (!z4 && !z10 && !z11) {
            return false;
        }
        return z12;
    }

    public static rt q() {
        rt rtVar;
        rt rtVar2 = f38026g0;
        if (rtVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    rtVar = f38026g0;
                    if (rtVar == null) {
                        rtVar = new rt();
                        f38026g0 = rtVar;
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
        if (this.f38050w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f38053z.invalidate();
            this.W = null;
            this.f38028a0 = null;
            this.Y = null;
            this.f38040l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new ct(this, 0), 200L);
            xg1 xg1Var = this.O;
            if (xg1Var != null) {
                xg1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.mr.f27122f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.mr.f27122f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void o() {
        mg.d0 reactionsWindow;
        org.telegram.ui.Components.rb rbVar = this.P;
        if (rbVar != null && (reactionsWindow = rbVar.getReactionsWindow()) != null && !reactionsWindow.f13973q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.p1 p1Var = this.f38039k;
        if (p1Var != null) {
            p1Var.dismiss();
            this.f38039k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            b.p(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.mr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.rl0 rl0Var, pt ptVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        this.f38040l = ptVar;
        if (ptVar != null) {
            this.f38041m = ptVar.k();
            this.f38042n = this.f38040l.p();
        }
        pt ptVar2 = this.f38040l;
        if ((ptVar2 == null || ptVar2.i()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = rl0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = rl0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y10 && bottom >= y10 && left <= x10 && right >= x10) {
                    boolean z4 = childAt instanceof org.telegram.ui.Cells.c8;
                    ImageReceiver imageReceiver = this.A;
                    if (z4) {
                        if (((org.telegram.ui.Cells.c8) childAt).f20883a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.a8) {
                        if (((org.telegram.ui.Cells.a8) childAt).f20812a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.d2) {
                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                            if (d2Var.f20900a.getBitmap() != null) {
                                int i12 = d2Var.L;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && d2Var.f20911s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.cv) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.sy) && ((org.telegram.ui.Components.sy) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.py0) && (((org.telegram.ui.Components.py0) childAt).f28026b instanceof org.telegram.ui.Components.l5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f38027a = x10;
                        this.f38029b = y10;
                        this.h = childAt;
                        et etVar = new et(this, rl0Var, i10, f6Var, 0);
                        this.f38038j = etVar;
                        AndroidUtilities.runOnUIThread(etVar, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean s(android.view.MotionEvent r17, org.telegram.ui.Components.rl0 r18, java.lang.Object r19, org.telegram.ui.pt r20, org.telegram.ui.ActionBar.f6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rt.s(android.view.MotionEvent, org.telegram.ui.Components.rl0, java.lang.Object, org.telegram.ui.pt, org.telegram.ui.ActionBar.f6):boolean");
    }

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z4, Object obj, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        int i12;
        ImageReceiver imageReceiver;
        String str3;
        String str4;
        boolean z10;
        long j10;
        TLRPC.InputStickerSet inputStickerSet;
        ImageReceiver imageReceiver2;
        long j11;
        CharSequence charSequence;
        String str5;
        int i13;
        String str6;
        ImageReceiver imageReceiver3;
        nt ntVar;
        if (this.f38050w != null && this.f38052y != null) {
            this.f38032c0 = f6Var;
            this.f38044p = z4;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f38049u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            nt ntVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f38025f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f38025f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f38025f0.getFontMetricsInt(), false), f38025f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f38025f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i10 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(ntVar2);
                            if (i11 > 0) {
                                j11 = i11;
                            } else {
                                j11 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(ntVar2, j11);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f38046r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f38028a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f38028a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f38028a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f38028a0, 1);
                            }
                        }
                        if (MessageObject.isTextColorEmoji(document)) {
                            imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.j6.n0(f6Var));
                        }
                        if (this.G == null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i15);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f38025f0.getFontMetricsInt(), false), f38025f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f38025f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.id0 id0Var = new org.telegram.ui.Components.id0(this.f38053z.getContext());
                                    this.C = id0Var;
                                    this.f38053z.addView(id0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z10 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z10 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f38025f0.getFontMetricsInt(), z10), f38025f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f38025f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f38040l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(ntVar2);
                            if (i11 > 0) {
                                j10 = i11;
                            } else {
                                j10 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(ntVar2, j10);
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
                imageReceiver4.getLottieAnimation().K(0);
            } else {
                i13 = 0;
            }
            if (this.S && imageReceiver.getLottieAnimation() != null) {
                imageReceiver.getLottieAnimation().K(i13);
            }
            this.V = i10;
            this.W = document;
            this.X = importingSticker;
            this.Y = str2;
            this.Z = botInlineResult;
            this.f38030b0 = obj;
            this.f38032c0 = f6Var;
            this.f38053z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f38050w);
                try {
                    if (this.f38052y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f38050w.getSystemService(str6)).removeView(this.f38052y);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            ((WindowManager) this.f38050w.getSystemService(str6)).addView(this.f38052y, this.f38051x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f38031c = -10000.0f;
                            this.f38036g = 0.0f;
                            this.d = 0.0f;
                            this.e = 0.0f;
                            this.H = System.currentTimeMillis();
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
                        }
                    } else {
                        str6 = str4;
                    }
                } catch (Exception e6) {
                    e = e6;
                    str6 = str4;
                }
                ((WindowManager) this.f38050w.getSystemService(str6)).addView(this.f38052y, this.f38051x);
                this.E = true;
                this.F = 0.0f;
                this.f38031c = -10000.0f;
                this.f38036g = 0.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        et etVar = this.f38038j;
        if (etVar != null) {
            AndroidUtilities.cancelRunOnUIThread(etVar);
            this.f38038j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.c8) {
                ((org.telegram.ui.Cells.c8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.a8) {
                ((org.telegram.ui.Cells.a8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(pt ptVar) {
        this.f38040l = ptVar;
        if (ptVar != null) {
            this.f38041m = ptVar.k();
            this.f38042n = this.f38040l.p();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f38046r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f38046r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f38050w == activity) {
            return;
        }
        this.f38050w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f38052y = new n0(this, activity, 5);
        ug.i iVar = new ug.i(this.f38052y);
        n0 n0Var = this.f38052y;
        ng.a aVar = this.f38048t;
        aVar.d = iVar;
        aVar.e = n0Var;
        aVar.f14951c = new be.b(true);
        this.f38052y.setFocusable(true);
        this.f38052y.setFocusableInTouchMode(true);
        this.f38052y.setSystemUiVisibility(1792);
        n0 n0Var2 = this.f38052y;
        dt dtVar = new dt(this);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(n0Var2, dtVar);
        ah.e eVar = new ah.e(this, activity);
        this.f38053z = eVar;
        eVar.setFocusable(false);
        this.f38052y.addView(this.f38053z, k7.b6.e(-1, -1, 51));
        this.f38053z.setOnTouchListener(new g0(this, 1));
        MessagesController.getInstance(this.f38046r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f38051x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f38053z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f38053z);
    }

    public final void x() {
        this.T = null;
    }

    public final boolean y(View view) {
        if (!(view instanceof org.telegram.ui.Cells.c8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.c8) {
            ((org.telegram.ui.Cells.c8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.a8) {
            ((org.telegram.ui.Cells.a8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.d2) {
            ((org.telegram.ui.Cells.d2) view2).setScaled(false);
        }
        this.h = c8Var;
        TLRPC.Document sticker = c8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = c8Var.getStickerPath();
        String str = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(c8Var.getSticker(), null, Integer.valueOf(this.f38046r));
        pt ptVar = this.f38040l;
        if (ptVar != null) {
            str = ptVar.G(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, c8Var.f20892y, c8Var.getParentObject(), this.f38032c0, 0);
        nt ntVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(ntVar);
        AndroidUtilities.runOnUIThread(ntVar, 16L);
        c8Var.setScaled(true);
        return true;
    }
}
