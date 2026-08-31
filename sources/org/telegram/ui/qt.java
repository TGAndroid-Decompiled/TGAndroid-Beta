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
    public static TextPaint f40667f0;
    public static volatile qt f40668g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public org.telegram.ui.Components.jd0 C;
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
    public rg1 O;
    public org.telegram.ui.Components.rb P;
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
    public int f40669a;
    public TLRPC.InputStickerSet f40670a0;
    public int f40671b;
    public Object f40672b0;
    public float f40673c;
    public org.telegram.ui.ActionBar.g6 f40674c0;
    public float d;
    public VibrationEffect f40675d0;
    public boolean f40677e0;
    public float f40678f;
    public float f40679g;
    public View h;
    public boolean f40680i;
    public dt f40681j;
    public org.telegram.ui.ActionBar.p1 f40682k;
    public ot f40683l;
    public boolean f40684m;
    public boolean f40685n;
    public ArrayList f40686o;
    public boolean f40687p;
    public int f40689r;
    public final tg.b f40690s;
    public final og.a f40691t;
    public final ColorDrawable f40692u;
    public Bitmap v;
    public Activity f40693w;
    public WindowManager.LayoutParams f40694x;
    public l0 f40695y;
    public ag.l f40696z;
    public float f40676e = 0.0f;
    public i0.b f40688q = i0.b.f7756e;

    public qt() {
        tg.b bVar = new tg.b();
        this.f40690s = bVar;
        this.f40691t = new og.a(bVar);
        this.f40692u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver();
        this.B = new ImageReceiver();
        this.E = false;
        this.I = AndroidUtilities.dp(200.0f);
        this.N = new Paint(1);
        this.U = new mt(this);
    }

    public static void a(qt qtVar, Bitmap bitmap, Bitmap bitmap2) {
        tg.b bVar = qtVar.f40690s;
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
        ug.c.c(bVar, qtVar.f40695y);
        qtVar.f40691t.d();
        qtVar.f40677e0 = false;
        ag.l lVar = qtVar.f40696z;
        if (lVar != null) {
            lVar.invalidate();
        }
    }

    public static int d(qt qtVar, int i10) {
        return org.telegram.ui.ActionBar.k6.v0(i10, qtVar.f40674c0);
    }

    public static boolean h(qt qtVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        eh.v vVar;
        ot otVar = qtVar.f40683l;
        if (otVar == null) {
            return false;
        }
        TLRPC.TL_messageMediaPoll d = otVar.d();
        TLRPC.PollAnswer g10 = qtVar.f40683l.g();
        if (d == null || d.poll == null || g10 == null) {
            return false;
        }
        TLRPC.PollAnswerVoters pollResult = MessageObject.getPollResult(d, g10.option);
        if (pollResult != null && pollResult.voters > 0 && MessageObject.canShowVotersList(d)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!MessageObject.isVoted(d) && !d.poll.closed && !qtVar.f40683l.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && MessageObject.canUnvote(d)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z4) {
            eh.v vVar2 = new eh.v(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), qtVar.f40689r, qtVar.f40674c0);
            org.telegram.ui.Components.q70 q70Var = new org.telegram.ui.Components.q70(actionBarPopupWindow$ActionBarPopupWindowLayout, qtVar.f40674c0);
            int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(q70Var.B);
            int i10 = org.telegram.ui.ActionBar.k6.E8;
            q70Var.T(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(i10, qtVar.f40674c0)));
            og.a aVar = qtVar.f40691t;
            rg.d j10 = sg.b.j(qtVar.f40674c0);
            org.telegram.ui.ActionBar.p2 p2Var = null;
            View view = q70Var.B;
            if (view != null) {
                qg.b c3 = aVar.c(view, null, true);
                c3.n(j10);
                view.setBackground(c3);
            }
            z12 = true;
            q70Var.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new zi(actionBarPopupWindow$ActionBarPopupWindowLayout, 15), false);
            q70Var.k();
            MessageObject y10 = qtVar.f40683l.y();
            Activity activity = qtVar.f40693w;
            if ((activity instanceof LaunchActivity) && y10 != null) {
                LaunchActivity launchActivity = (LaunchActivity) activity;
                if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                    p2Var = launchActivity.O().getLastFragment();
                }
                if (p2Var != null) {
                    org.telegram.ui.Components.i61 a2 = vVar2.a(p2Var, y10.getDialogId(), y10.getId(), g10.option, pollResult.voters, new org.telegram.ui.Components.xk(10, qtVar, p2Var));
                    vVar = vVar2;
                    q70Var.q(a2);
                    vVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
                    vVar.f5679a.d(pollResult.recent_voters, false);
                    vVar.setLayoutParams(k7.c6.n(-1, 48));
                    vVar.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.I5, qtVar.f40674c0), 12, 0));
                    vVar.setOnClickListener(new mh.x0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 14));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(vVar);
                    org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), qtVar.f40674c0);
                    m1Var.setTag(R.id.fit_width_tag, 1);
                    m1Var.setColor(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(i10, qtVar.f40674c0)));
                    m1Var.setLayoutParams(k7.c6.n(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m1Var);
                }
            }
            vVar = vVar2;
            vVar.setText(LocaleController.formatPluralString("PollVotesCount", pollResult.voters, new Object[0]));
            vVar.f5679a.d(pollResult.recent_voters, false);
            vVar.setLayoutParams(k7.c6.n(-1, 48));
            vVar.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.I5, qtVar.f40674c0), 12, 0));
            vVar.setOnClickListener(new mh.x0(actionBarPopupWindow$ActionBarPopupWindowLayout, b10, 14));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(vVar);
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), qtVar.f40674c0);
            m1Var2.setTag(R.id.fit_width_tag, 1);
            m1Var2.setColor(org.telegram.ui.ActionBar.k6.l1(0.06f, org.telegram.ui.ActionBar.k6.v0(i10, qtVar.f40674c0)));
            m1Var2.setLayoutParams(k7.c6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(m1Var2);
        } else {
            z12 = true;
        }
        if (z10) {
            f10 = 0.06f;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(R.string.PollSubmitVotesNoCaps), false, qtVar.f40674c0).setOnClickListener(new et(qtVar, 2));
        } else {
            f10 = 0.06f;
        }
        if (z11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), false, qtVar.f40674c0).setOnClickListener(new et(qtVar, 3));
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
        }
        if (!z4 && (z10 || z11)) {
            org.telegram.ui.ActionBar.m1 m1Var3 = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), qtVar.f40674c0);
            m1Var3.setTag(R.id.fit_width_tag, 1);
            m1Var3.setColor(org.telegram.ui.ActionBar.k6.l1(f10, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, qtVar.f40674c0)));
            m1Var3.setLayoutParams(k7.c6.n(-1, 8));
            actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(m1Var3);
        }
        if (!z4 && !z10 && !z11) {
            return false;
        }
        return z12;
    }

    public static qt q() {
        qt qtVar;
        qt qtVar2 = f40668g0;
        if (qtVar2 == null) {
            synchronized (PhotoViewer.class) {
                try {
                    qtVar = f40668g0;
                    if (qtVar == null) {
                        qtVar = new qt();
                        f40668g0 = qtVar;
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
        if (this.f40693w != null && !this.K) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.f40696z.invalidate();
            this.W = null;
            this.f40670a0 = null;
            this.Y = null;
            this.f40683l = null;
            this.E = false;
            AndroidUtilities.runOnUIThread(new bt(this, 0), 200L);
            rg1 rg1Var = this.O;
            if (rg1Var != null) {
                rg1Var.animate().alpha(0.0f).translationY(AndroidUtilities.dp(56.0f)).setDuration(150L).setInterpolator(org.telegram.ui.Components.pr.f30183f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(org.telegram.ui.Components.pr.f30183f).start();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
        }
    }

    public final void o() {
        ng.d0 reactionsWindow;
        org.telegram.ui.Components.rb rbVar = this.P;
        if (rbVar != null && (reactionsWindow = rbVar.getReactionsWindow()) != null && !reactionsWindow.f16047q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        p();
        n();
    }

    public final void p() {
        org.telegram.ui.ActionBar.p1 p1Var = this.f40682k;
        if (p1Var != null) {
            p1Var.dismiss();
            this.f40682k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            b.p(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(AndroidUtilities.dp(-12.0f)), org.telegram.ui.Components.pr.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                n();
            }
        }
    }

    public final boolean r(MotionEvent motionEvent, org.telegram.ui.Components.tl0 tl0Var, ot otVar, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        this.f40683l = otVar;
        if (otVar != null) {
            this.f40684m = otVar.j();
            this.f40685n = this.f40683l.o();
        }
        ot otVar2 = this.f40683l;
        if ((otVar2 == null || otVar2.h()) && motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int childCount = tl0Var.getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = tl0Var.getChildAt(i11);
                if (childAt == null) {
                    break;
                }
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                if (top <= y10 && bottom >= y10 && left <= x10 && right >= x10) {
                    boolean z4 = childAt instanceof org.telegram.ui.Cells.d8;
                    ImageReceiver imageReceiver = this.A;
                    if (z4) {
                        if (((org.telegram.ui.Cells.d8) childAt).f22683a.hasNotThumb()) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else if (childAt instanceof org.telegram.ui.Cells.b8) {
                        if (((org.telegram.ui.Cells.b8) childAt).f22610a.getImageReceiver().getBitmap() != null) {
                            imageReceiver.setRoundRadius(0);
                            i10 = 0;
                        }
                        i10 = -1;
                    } else {
                        i10 = 2;
                        if (childAt instanceof org.telegram.ui.Cells.e2) {
                            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) childAt;
                            if (e2Var.f22721a.getBitmap() != null) {
                                int i12 = e2Var.L;
                                if (i12 == 6) {
                                    imageReceiver.setRoundRadius(0);
                                    i10 = 0;
                                } else if (i12 == 2 && e2Var.f22733s) {
                                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                                    i10 = 1;
                                }
                            }
                            i10 = -1;
                        } else if (childAt instanceof org.telegram.ui.Components.fv) {
                            imageReceiver.setRoundRadius(0);
                        } else if ((childAt instanceof org.telegram.ui.Components.uy) && ((org.telegram.ui.Components.uy) childAt).getSpan() != null) {
                            imageReceiver.setRoundRadius(0);
                        } else {
                            if ((childAt instanceof org.telegram.ui.Components.qy0) && (((org.telegram.ui.Components.qy0) childAt).f30530b instanceof org.telegram.ui.Components.l5)) {
                                imageReceiver.setRoundRadius(0);
                            }
                            i10 = -1;
                        }
                    }
                    if (i10 != -1) {
                        this.f40669a = x10;
                        this.f40671b = y10;
                        this.h = childAt;
                        dt dtVar = new dt(this, tl0Var, i10, g6Var, 0);
                        this.f40681j = dtVar;
                        AndroidUtilities.runOnUIThread(dtVar, 200L);
                        return true;
                    }
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final boolean s(android.view.MotionEvent r17, org.telegram.ui.Components.tl0 r18, java.lang.Object r19, org.telegram.ui.ot r20, org.telegram.ui.ActionBar.g6 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qt.s(android.view.MotionEvent, org.telegram.ui.Components.tl0, java.lang.Object, org.telegram.ui.ot, org.telegram.ui.ActionBar.g6):boolean");
    }

    public final void t(TLRPC.Document document, SendMessagesHelper.ImportingSticker importingSticker, String str, String str2, TLRPC.BotInlineResult botInlineResult, int i10, boolean z4, Object obj, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
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
        mt mtVar;
        if (this.f40693w != null && this.f40695y != null) {
            this.f40674c0 = g6Var;
            this.f40687p = z4;
            this.G = null;
            if (AndroidUtilities.isDarkColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, g6Var))) {
                i12 = 1895825408;
            } else {
                i12 = 1692853990;
            }
            this.f40692u.setColor(i12);
            this.S = false;
            ImageReceiver imageReceiver4 = this.A;
            imageReceiver4.setColorFilter(null);
            ImageReceiver imageReceiver5 = this.B;
            mt mtVar2 = this.U;
            if (i10 == 0 || i10 == 2 || i10 == 3) {
                ImageReceiver imageReceiver6 = imageReceiver5;
                if (document != null || importingSticker != null) {
                    if (f40667f0 == null) {
                        TextPaint textPaint = new TextPaint(1);
                        f40667f0 = textPaint;
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
                            this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f40667f0.getFontMetricsInt(), false), f40667f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f40667f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            imageReceiver2 = imageReceiver4;
                        }
                        if (inputStickerSet != null || i10 == 2) {
                            AndroidUtilities.cancelRunOnUIThread(mtVar2);
                            if (i11 > 0) {
                                j11 = i11;
                            } else {
                                j11 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(mtVar2, j11);
                        }
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.f40689r).getStickerSet(inputStickerSet, true);
                        if (stickerSet != null && stickerSet.documents.isEmpty()) {
                            inputStickerSet = null;
                        }
                        this.f40670a0 = inputStickerSet;
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (MessageObject.isVideoStickerDocument(document)) {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), null, null, 0L, "webp", this.f40670a0, 1);
                        } else {
                            charSequence = "";
                            str5 = "…";
                            imageReceiver4 = imageReceiver2;
                            imageReceiver4.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), (String) null, "webp", this.f40670a0, 1);
                            if (MessageObject.isPremiumSticker(document)) {
                                this.S = true;
                                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(document), document), (String) null, (ImageLocation) null, (String) null, "tgs", this.f40670a0, 1);
                            }
                        }
                        if (MessageObject.isTextColorEmoji(document)) {
                            imageReceiver4.setColorFilter(org.telegram.ui.ActionBar.k6.n0(g6Var));
                        }
                        if (this.G == null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= document.attributes.size()) {
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i15);
                                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) && !TextUtils.isEmpty(documentAttribute2.alt)) {
                                    this.G = new StaticLayout(AndroidUtilities.replaceCharSequence(str5, TextUtils.ellipsize(Emoji.replaceEmoji(documentAttribute2.alt, f40667f0.getFontMetricsInt(), false), f40667f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), charSequence), f40667f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                                    org.telegram.ui.Components.jd0 jd0Var = new org.telegram.ui.Components.jd0(this.f40696z.getContext());
                                    this.C = jd0Var;
                                    this.f40696z.addView(jd0Var, new FrameLayout.LayoutParams(512, 512));
                                }
                                z10 = false;
                                this.C.b(importingSticker.videoEditedInfo.mediaEntities, true, true, false);
                            } else {
                                z10 = false;
                            }
                            if (str != null) {
                                this.G = new StaticLayout(AndroidUtilities.replaceCharSequence("…", TextUtils.ellipsize(Emoji.replaceEmoji(str, f40667f0.getFontMetricsInt(), z10), f40667f0, AndroidUtilities.dp(200.0f), TextUtils.TruncateAt.END), ""), f40667f0, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                            this.f40683l.getClass();
                            AndroidUtilities.cancelRunOnUIThread(mtVar2);
                            if (i11 > 0) {
                                j10 = i11;
                            } else {
                                j10 = 1300;
                            }
                            AndroidUtilities.runOnUIThread(mtVar2, j10);
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
            this.f40672b0 = obj;
            this.f40674c0 = g6Var;
            this.f40696z.invalidate();
            if (!this.E) {
                AndroidUtilities.lockOrientation(this.f40693w);
                try {
                    if (this.f40695y.getParent() != null) {
                        str6 = str4;
                        try {
                            ((WindowManager) this.f40693w.getSystemService(str6)).removeView(this.f40695y);
                        } catch (Exception e6) {
                            e = e6;
                            FileLog.e(e);
                            ((WindowManager) this.f40693w.getSystemService(str6)).addView(this.f40695y, this.f40694x);
                            this.E = true;
                            this.F = 0.0f;
                            this.f40673c = -10000.0f;
                            this.f40679g = 0.0f;
                            this.d = 0.0f;
                            this.f40676e = 0.0f;
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
                ((WindowManager) this.f40693w.getSystemService(str6)).addView(this.f40695y, this.f40694x);
                this.E = true;
                this.F = 0.0f;
                this.f40673c = -10000.0f;
                this.f40679g = 0.0f;
                this.d = 0.0f;
                this.f40676e = 0.0f;
                this.H = System.currentTimeMillis();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 8);
            }
        }
    }

    public final void u() {
        dt dtVar = this.f40681j;
        if (dtVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dtVar);
            this.f40681j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.b8) {
                ((org.telegram.ui.Cells.b8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.e2) {
                ((org.telegram.ui.Cells.e2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void v(ot otVar) {
        this.f40683l = otVar;
        if (otVar != null) {
            this.f40684m = otVar.j();
            this.f40685n = this.f40683l.o();
        }
    }

    public final void w(Activity activity) {
        int i10 = UserConfig.selectedAccount;
        this.f40689r = i10;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setCurrentAccount(i10);
        imageReceiver.setLayerNum(Integer.MAX_VALUE);
        int i11 = this.f40689r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.setCurrentAccount(i11);
        imageReceiver2.setLayerNum(Integer.MAX_VALUE);
        if (this.f40693w == activity) {
            return;
        }
        this.f40693w = activity;
        this.J = activity.getResources().getDrawable(R.drawable.preview_arrow);
        this.f40695y = new l0(this, activity, 5);
        vg.i iVar = new vg.i(this.f40695y);
        l0 l0Var = this.f40695y;
        og.a aVar = this.f40691t;
        aVar.d = iVar;
        aVar.f16754e = l0Var;
        aVar.f16753c = new be.b(true);
        this.f40695y.setFocusable(true);
        this.f40695y.setFocusableInTouchMode(true);
        this.f40695y.setSystemUiVisibility(1792);
        l0 l0Var2 = this.f40695y;
        ct ctVar = new ct(this);
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.b0.j(l0Var2, ctVar);
        ag.l lVar = new ag.l(this, activity);
        this.f40696z = lVar;
        lVar.setFocusable(false);
        this.f40695y.addView(this.f40696z, k7.c6.e(-1, -1, 51));
        this.f40696z.setOnTouchListener(new f0(this, 1));
        MessagesController.getInstance(this.f40689r);
        this.I = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f40694x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        imageReceiver.setAspectFit(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setParentView(this.f40696z);
        imageReceiver2.setAspectFit(true);
        imageReceiver2.setInvalidateAll(true);
        imageReceiver2.setParentView(this.f40696z);
    }

    public final void x() {
        this.T = null;
    }

    public final boolean y(View view) {
        if (!(view instanceof org.telegram.ui.Cells.d8)) {
            return false;
        }
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        if (findActivity == null) {
            return true;
        }
        w(findActivity);
        org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) view;
        View view2 = this.h;
        if (view2 instanceof org.telegram.ui.Cells.d8) {
            ((org.telegram.ui.Cells.d8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.b8) {
            ((org.telegram.ui.Cells.b8) view2).setScaled(false);
        } else if (view2 instanceof org.telegram.ui.Cells.e2) {
            ((org.telegram.ui.Cells.e2) view2).setScaled(false);
        }
        this.h = d8Var;
        TLRPC.Document sticker = d8Var.getSticker();
        SendMessagesHelper.ImportingSticker stickerPath = d8Var.getStickerPath();
        String str = null;
        String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(d8Var.getSticker(), null, Integer.valueOf(this.f40689r));
        ot otVar = this.f40683l;
        if (otVar != null) {
            str = otVar.F(false);
        }
        t(sticker, stickerPath, findAnimatedEmojiEmoticon, str, null, 0, d8Var.f22693y, d8Var.getParentObject(), this.f40674c0, 0);
        mt mtVar = this.U;
        AndroidUtilities.cancelRunOnUIThread(mtVar);
        AndroidUtilities.runOnUIThread(mtVar, 16L);
        d8Var.setScaled(true);
        return true;
    }
}
