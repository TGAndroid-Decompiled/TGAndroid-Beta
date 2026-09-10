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
public final class tt {
    public static TextPaint f37011f0;
    public static volatile tt f37012g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.pd0 C;
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
    public nh1 O;
    public org.telegram.ui.Components.yb P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final pt U;
    public int V;
    public TLRPC.Document W;
    public SendMessagesHelper.ImportingSticker X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int f37013a;
    public TLRPC.InputStickerSet f37014a0;
    public int f37015b;
    public Object f37016b0;
    public float f37017c;
    public org.telegram.ui.ActionBar.f6 f37018c0;
    public float d;
    public VibrationEffect f37019d0;
    public boolean f37020e0;
    public float f37021f;
    public float f37022g;
    public View h;
    public boolean f37023i;
    public org.telegram.ui.Components.g21 f37024j;
    public org.telegram.ui.ActionBar.p1 f37025k;
    public rt f37026l;
    public boolean f37027m;
    public boolean f37028n;
    public ArrayList f37029o;
    public boolean f37030p;
    public int f37032r;
    public final eh.b f37033s;
    public final zg.a f37034t;
    public final ColorDrawable f37035u;
    public Bitmap v;
    public Activity f37036w;
    public WindowManager.LayoutParams f37037x;
    public k0 f37038y;
    public bi.n7 f37039z;
    public float e = 0.0f;
    public i0.c f37031q = i0.c.e;

    public tt() {
        eh.b bVar = new eh.b();
        this.f37033s = bVar;
        this.f37034t = new zg.a(bVar);
        this.f37035u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new pt(this);
    }

    public static void a(tt ttVar, Bitmap bitmap, Bitmap bitmap2) {
        eh.b bVar = ttVar.f37033s;
        Paint paint = ttVar.N;
        ttVar.A.setVisible(true, false);
        ttVar.v = bitmap;
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
        fh.d.c(bVar, ttVar.f37038y);
        ttVar.f37034t.d();
        ttVar.f37020e0 = false;
        bi.n7 n7Var = ttVar.f37039z;
        if (n7Var != null) {
            n7Var.invalidate();
        }
    }

    public static int d(tt ttVar, int i10) {
        return org.telegram.ui.ActionBar.j6.v0(i10, ttVar.f37018c0);
    }

    public static boolean h(tt ttVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f7;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        ph.q qVar;
        rt rtVar = ttVar.f37026l;
        if (rtVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = rtVar.d();
        TLRPC.PollAnswer g10 = ttVar.f37026l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !ttVar.f37026l.c()) {
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
            ph.q qVar2 = new ph.q(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ttVar.f37032r, ttVar.f37018c0);
            org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(actionBarPopupWindow$ActionBarPopupWindowLayout, ttVar.f37018c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(w70Var.B);
            int i10 = org.telegram.ui.ActionBar.j6.E8;
            w70Var.T(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, ttVar.f37018c0)));
            zg.a aVar = ttVar.f37034t;
            ch.e k10 = dh.c.k(ttVar.f37018c0);
            org.telegram.ui.ActionBar.p2 p2Var = null;
            View view = w70Var.B;
            if (view != null) {
                bh.d c10 = aVar.c(view, null, true);
                c10.n(k10);
                view.setBackground(c10);
            }
            z13 = true;
            w70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new fj(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            w70Var.k();
            MessageObject y3 = ttVar.f37026l.y();
            Activity activity = ttVar.f37036w;
            if ((activity instanceof LaunchActivity) && y3 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    p2Var = launchActivity.O().getLastFragment();
                }
                if (p2Var != null) {
                    org.telegram.ui.Components.r61 a2 = qVar2.a(p2Var, y3.getDialogId(), y3.getId(), g10.option, pollResult.voters, new pf(23, ttVar, p2Var));
                    qVar = qVar2;
                    w70Var.q(a2);
                    qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    qVar.f40446a.d(pollResult.recent_voters, false);
                    qVar.setLayoutParams(w7.a6.n(-1, 48));
                    qVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, ttVar.f37018c0), 12, 0));
                    qVar.setOnClickListener(new bi.j5(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
                    org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ttVar.f37018c0);
                    m1Var.setTag(R.id.fit_width_tag, 1);
                    m1Var.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, ttVar.f37018c0)));
                    m1Var.setLayoutParams(w7.a6.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m1Var);
                }
            }
            qVar = qVar2;
            qVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            qVar.f40446a.d(pollResult.recent_voters, false);
            qVar.setLayoutParams(w7.a6.n(-1, 48));
            qVar.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, ttVar.f37018c0), 12, 0));
            qVar.setOnClickListener(new bi.j5(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 17));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(qVar);
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), ttVar.f37018c0);
            m1Var2.setTag(R.id.fit_width_tag, 1);
            m1Var2.setColor(org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(i10, ttVar.f37018c0)));
            m1Var2.setLayoutParams(w7.a6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m1Var2);
        } else {
            z13 = true;
        }
        if (z11) {
            f7 = 0.06f;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, ttVar.f37018c0).setOnClickListener(new ht(ttVar, 2));
        } else {
            f7 = 0.06f;
        }
        if (z12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, ttVar.f37018c0).setOnClickListener(new ht(ttVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z10 && (z11 || z12)) {
            org.telegram.ui.ActionBar.m1 m1Var3 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), ttVar.f37018c0);
            m1Var3.setTag(R.id.fit_width_tag, 1);
            m1Var3.setColor(org.telegram.ui.ActionBar.j6.l1(f7, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, ttVar.f37018c0)));
            m1Var3.setLayoutParams(w7.a6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(m1Var3);
        }
        if (!z10 && !z11 && !z12) {
            return false;
        }
        return z13;
    }

    public static tt q() {
        tt ttVar;
        tt ttVar2 = f37012g0;
        if (ttVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    ttVar = f37012g0;
                    if (ttVar == null) {
                        ttVar = new tt();
                        f37012g0 = ttVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ttVar;
        }
        return ttVar2;
    }

    public final void n() {
        if (this.f37036w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f37039z.invalidate();
            this.W = null;
            this.f37014a0 = null;
            this.Y = null;
            this.f37026l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new ft(this, 0), 200L);
            nh1 nh1Var = this.O;
            if (nh1Var != null) {
                nh1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.wr.f28819f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.wr.f28819f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void o() {
        yg.c0 reactionsWindow;
        org.telegram.ui.Components.yb ybVar = this.P;
        if (ybVar != null && (reactionsWindow = ybVar.getReactionsWindow()) != null && !reactionsWindow.f46963q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.p1 p1Var = this.f37025k;
        if (p1Var != null) {
            p1Var.dismiss();
            this.f37025k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            org.telegram.messenger.em.q(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.wr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.vl0 vl0Var, rt rtVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        this.f37026l = rtVar;
        if (rtVar != null) {
            this.f37027m = rtVar.j();
            this.f37028n = this.f37026l.o();
        }
        rt rtVar2 = this.f37026l;
        if ((rtVar2 == null || rtVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int childCount = vl0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = vl0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y3 && bottom >= y3 && left <= x10 && right >= x10) {
                    boolean z10 = childAt instanceof org.telegram.ui.Cells.g8;
                    ImageReceiver imageReceiver = this.A;
                    if (z10) {
                        if (((org.telegram.ui.Cells.g8) childAt).f19207a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.e8) {
                        if (((org.telegram.ui.Cells.e8) childAt).f19084a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.e2) {
                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                            if (e2Var.f19047a.getBitmap() != null) {
                                int i12 = e2Var.O;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && e2Var.f19061s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.nv) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.az) && ((org.telegram.ui.Components.az) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.yy0) && (((org.telegram.ui.Components.yy0) childAt).f29529b instanceof org.telegram.ui.Components.p5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f37013a = x10;
                        this.f37015b = y3;
                        this.h = childAt;
                        org.telegram.ui.Components.g21 g21Var = new org.telegram.ui.Components.g21(this, vl0Var, i10, f6Var, 1);
                        this.f37024j = g21Var;
                        AndroidUtilities.runOnUIThread(g21Var, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean s(android.view.MotionEvent r17, org.telegram.ui.Components.vl0 r18, java.lang.Object r19, org.telegram.ui.rt r20, org.telegram.ui.ActionBar.f6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tt.s(android.view.MotionEvent, org.telegram.ui.Components.vl0, java.lang.Object, org.telegram.ui.rt, org.telegram.ui.ActionBar.f6):boolean");
    }

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z10, Object obj, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
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
        pt ptVar;
        if (this.f37036w != null && this.f37038y != null) {
            this.f37018c0 = f6Var;
            this.f37030p = z10;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, f6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f37035u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            pt ptVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f37011f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f37011f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f37011f0.getFontMetricsInt(), false), f37011f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f37011f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i10 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(ptVar2);
                            if (i11 > 0) {
                                j10 = i11;
                            } else {
                                j10 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(ptVar2, j10);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f37032r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f37014a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f37014a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f37014a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f37014a0, 1);
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
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f37011f0.getFontMetricsInt(), false), f37011f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f37011f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.pd0 pd0Var = new org.telegram.ui.Components.pd0(this.f37039z.getContext());
                                    this.C = pd0Var;
                                    this.f37039z.addView(pd0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z11 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z11 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f37011f0.getFontMetricsInt(), z11), f37011f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f37011f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f37026l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(ptVar2);
                            if (i11 > 0) {
                                j3 = i11;
                            } else {
                                j3 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(ptVar2, j3);
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
                        ptVar = ptVar2;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(documentVideoThumb, document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", null, document.size, null, "gif" + document, 0);
                    } else {
                        imageReceiver3 = imageReceiver5;
                        ptVar = ptVar2;
                        imageReceiver4 = imageReceiver4;
                        imageReceiver4.setImage(forDocument, null, ImageLocation.getForDocument(closestPhotoSizeWithSize2, document), "90_90_b", document.size, null, "gif" + document, 0);
                    }
                } else {
                    imageReceiver3 = imageReceiver5;
                    ptVar = ptVar2;
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
                AndroidUtilities.cancelRunOnUIThread(ptVar);
                AndroidUtilities.runOnUIThread(ptVar, 2000L);
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
            this.f37016b0 = obj;
            this.f37018c0 = f6Var;
            this.f37039z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f37036w);
                try {
                    if (this.f37038y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f37036w.getSystemService(str6)).removeView(this.f37038y);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            ((WindowManager) this.f37036w.getSystemService(str6)).addView(this.f37038y, this.f37037x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f37017c = -10000.0f;
                            this.f37022g = 0.0f;
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
                ((WindowManager) this.f37036w.getSystemService(str6)).addView(this.f37038y, this.f37037x);
                this.E = true;
                this.F = 0.0f;
                this.f37017c = -10000.0f;
                this.f37022g = 0.0f;
                this.d = 0.0f;
                this.e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        org.telegram.ui.Components.g21 g21Var = this.f37024j;
        if (g21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g21Var);
            this.f37024j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.g8) {
                ((org.telegram.ui.Cells.g8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e8) {
                ((org.telegram.ui.Cells.e8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(rt rtVar) {
        this.f37026l = rtVar;
        if (rtVar != null) {
            this.f37027m = rtVar.j();
            this.f37028n = this.f37026l.o();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f37032r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f37032r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f37036w == activity) {
            return;
        }
        this.f37036w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f37038y = new k0(this, activity, 5);
        gh.k kVar = new gh.k(this.f37038y);
        k0 k0Var = this.f37038y;
        zg.a aVar = this.f37034t;
        aVar.d = kVar;
        aVar.e = k0Var;
        aVar.f48082c = new pe.b(true);
        this.f37038y.setFocusable(true);
        this.f37038y.setFocusableInTouchMode(true);
        this.f37038y.setSystemUiVisibility(1792);
        k0 k0Var2 = this.f37038y;
        gt gtVar = new gt(this);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(k0Var2, gtVar);
        bi.n7 n7Var = new bi.n7(this, activity);
        this.f37039z = n7Var;
        n7Var.setFocusable(false);
        this.f37038y.addView(this.f37039z, w7.a6.e(-1, -1, 51));
        this.f37039z.setOnTouchListener(new e0(this, 1));
        MessagesController.getInstance(this.f37032r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f37037x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f37039z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f37039z);
    }

    public final void x() {
        this.T = null;
    }

    public final boolean y(View view) {
        if (!(view instanceof org.telegram.ui.Cells.g8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.g8) {
            ((org.telegram.ui.Cells.g8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.e8) {
            ((org.telegram.ui.Cells.e8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view2).setScaled(false);
        }
        this.h = g8Var;
        TLRPC.Document sticker = g8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = g8Var.getStickerPath();
        String str = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(g8Var.getSticker(), null, Integer.valueOf(this.f37032r));
        rt rtVar = this.f37026l;
        if (rtVar != null) {
            str = rtVar.E(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, g8Var.f19216y, g8Var.getParentObject(), this.f37018c0, 0);
        pt ptVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(ptVar);
        AndroidUtilities.runOnUIThread(ptVar, 16L);
        g8Var.setScaled(true);
        return true;
    }
}
