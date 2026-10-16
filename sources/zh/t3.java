package zh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
public final class t3 {
    public float A;
    public float B;
    public i11 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final b8 G;
    public final ad H;
    public final ad I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public TLRPC.TL_messageActionStarGiftUnique N;
    public MessageObject O;
    public boolean P;
    public final ne.e Q;
    public yh.e0 R;
    public final int f51174a;
    public final View f51175b;
    public final org.telegram.ui.ActionBar.c6 f51176c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.q5 e;
    public int f51178g;
    public RadialGradient h;
    public final yh.k1 f51180j;
    public TL_stars.starGiftAttributeBackdrop f51181k;
    public TL_stars.starGiftAttributePattern f51182l;
    public TL_stars.starGiftAttributeModel f51183m;
    public boolean f51186p;
    public float f51187q;
    public i11 f51188r;
    public float f51189s;
    public i11 f51190t;
    public float f51191u;
    public float v;
    public float f51193x;
    public final yh.l0 f51194y;
    public boolean f51195z;
    public final Paint f51177f = new Paint(1);
    public final Matrix f51179i = new Matrix();
    public final RectF f51184n = new RectF();
    public final Path f51185o = new Path();
    public final ArrayList f51192w = new ArrayList();

    public t3(int i10, View view, org.telegram.ui.ActionBar.c6 c6Var) {
        yh.l0 l0Var = new yh.l0();
        this.f51194y = l0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new b8(1, 25);
        this.Q = new ne.e(0, new rg.b0(this, 28), es.h, 320L);
        this.f51174a = i10;
        this.f51175b = view;
        this.f51176c = c6Var;
        this.f51180j = new yh.k1(view);
        this.H = new ad(view);
        this.I = new ad(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.q5(AndroidUtilities.dp(28.0f), view);
        l0Var.f48967r = view;
        l0Var.d.setParentView(view);
    }

    public final void a() {
        this.P = true;
        if (this.N != null) {
            this.d.onAttachedToWindow();
            this.e.a();
            this.f51194y.d.onAttachedToWindow();
        }
    }

    public final void b(Canvas canvas) {
        ne.e eVar = this.Q;
        float f7 = eVar.e;
        float f10 = f7 / 2.0f;
        RectF rectF = this.f51184n;
        rectF.set(0.0f, 0.0f, f7, this.M);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f51181k != null && (this.h == null || this.f51178g != height)) {
            this.f51178g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f51181k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f51177f;
        if (radialGradient != null) {
            Matrix matrix = this.f51179i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.f51185o;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
        canvas.save();
        float a2 = this.I.a(0.0125f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f10, AndroidUtilities.dp(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f51181k;
        org.telegram.ui.Components.q5 q5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            q5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        i0.a(canvas, 1, q5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f10 - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        imageReceiver.draw(canvas);
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f51181k;
        if (stargiftattributebackdrop3 != null) {
            m12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i10 = m12;
        this.f51188r.f25465p = eVar.e - AndroidUtilities.dp(12.0f);
        i11 i11Var = this.f51188r;
        i11Var.c(f10 - (i11Var.f25455c / 2.0f), this.f51187q, 1.0f, -1, canvas);
        this.f51190t.f25465p = eVar.e - AndroidUtilities.dp(12.0f);
        i11 i11Var2 = this.f51190t;
        Canvas canvas2 = canvas;
        int i11 = i10;
        i11Var2.c(f10 - (i11Var2.f25455c / 2.0f), this.f51189s, 1.0f, i11, canvas2);
        if (this.f51195z) {
            yh.l0 l0Var = this.f51194y;
            int i12 = l0Var.f48969t;
            int i13 = l0Var.f48970u;
            int i14 = (int) (f10 - (i12 / 2.0f));
            int i15 = (int) this.f51193x;
            l0Var.setBounds(i14, i15, i12 + i14, i13 + i15);
            l0Var.draw(canvas2);
        } else {
            float f11 = 9.0f;
            float dp = this.f51191u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f51192w;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                int i17 = i16 + 1;
                s3 s3Var = (s3) arrayList.get(i16);
                i11 i11Var3 = s3Var.f51157b;
                float f12 = f10 - (dp / 2.0f);
                float f13 = f11;
                i11Var3.c((f12 + this.f51191u) - i11Var3.f25455c, s3Var.f51156a, 1.0f, i11, canvas2);
                canvas2 = canvas;
                s3Var.f51158c.c(f12 + this.f51191u + AndroidUtilities.dp(f13), s3Var.f51156a, 1.0f, -1, canvas2);
                i11 = i11;
                i16 = i17;
                f11 = f13;
            }
        }
        int i18 = i11;
        if (!this.f51186p) {
            float f14 = this.A;
            float a10 = org.telegram.messenger.g0.a(this.C.f25455c, AndroidUtilities.dp(30.0f), 2.0f, f10);
            float f15 = this.A + this.B;
            RectF rectF2 = this.D;
            rectF2.set(f10 - ((this.C.f25455c + AndroidUtilities.dp(30.0f)) / 2.0f), f14, a10, f15);
            Path path2 = this.E;
            path2.rewind();
            float f16 = this.B / 2.0f;
            path2.addRoundRect(rectF2, f16, f16, Path.Direction.CW);
            int m13 = org.telegram.ui.ActionBar.g6.m1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(m13);
            float a11 = this.H.a(0.075f);
            canvas2.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            int dp2 = ((int) rectF.right) - AndroidUtilities.dp(46.67f);
            int dp3 = ((int) rectF.top) - AndroidUtilities.dp(1.33f);
            int dp4 = AndroidUtilities.dp(1.33f) + ((int) rectF.right);
            int dp5 = AndroidUtilities.dp(46.67f) + ((int) rectF.top);
            yh.k1 k1Var = this.f51180j;
            k1Var.setBounds(dp2, dp3, dp4, dp5);
            k1Var.f48941x = i18;
            k1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.f51186p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f51184n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        b8 b8Var = this.G;
        b8Var.g(rectF2);
        b8Var.d();
        b8Var.a(canvas, org.telegram.ui.ActionBar.g6.m1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f51175b;
        if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).N();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.Q.e;
    }

    public final boolean e(float f7, float f10, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean contains = this.D.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        boolean contains2 = this.f51184n.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        int action = motionEvent.getAction();
        ad adVar = this.H;
        ad adVar2 = this.I;
        if (action == 0) {
            if (contains2 && !contains) {
                z11 = true;
            } else {
                z11 = false;
            }
            adVar2.c(z11);
            adVar.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (adVar.f23201i && !contains) {
                adVar.c(false);
            } else if (adVar2.f23201i && !contains2) {
                adVar2.c(false);
            }
        } else if (motionEvent.getAction() == 1 && ((z10 = adVar.f23201i) || adVar2.f23201i)) {
            yh.e0 e0Var = this.R;
            if (e0Var != null) {
                if (z10) {
                    e0Var.run();
                }
            } else if (this.J) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.messenger.g0.q(R.string.UniqueGiftNotFoundBurned, zc.a0(U), R.raw.fire_on, 36);
                }
            } else {
                r3 r3Var = new r3(this.f51175b.getContext(), this.f51174a, this.O.getDialogId(), this.f51176c, null);
                r3Var.k2(this.O, null);
                r3Var.show();
            }
            adVar.c(false);
            adVar2.c(false);
            return true;
        } else if (motionEvent.getAction() == 3 && (adVar.f23201i || adVar2.f23201i)) {
            adVar.c(false);
            adVar2.c(false);
            return true;
        }
        if (adVar.f23201i || adVar2.f23201i) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: zh.t3.f(org.telegram.messenger.MessageObject, boolean):void");
    }

    public final void g(MessageObject messageObject, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        long dialogId;
        float f7;
        float f10;
        float f11;
        float f12;
        int dp;
        int i10;
        float f13 = this.L;
        boolean isOutOwner = messageObject.isOutOwner();
        boolean z10 = !tL_messageActionStarGiftUnique.upgrade;
        int i11 = this.f51174a;
        if (z10 == isOutOwner) {
            dialogId = UserConfig.getInstance(i11).getClientUserId();
        } else {
            dialogId = messageObject.getDialogId();
        }
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            dialogId = DialogObject.getPeerDialogId(peer);
        }
        String shortName = DialogObject.getShortName(dialogId);
        float dp2 = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        int i12 = 0;
        if (this.f51186p) {
            this.f51188r = new i11(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer == null && !UserObject.isService(messageObject.getDialogId())) {
            if (messageObject.getDialogId() == UserConfig.getInstance(i11).getClientUserId()) {
                if (tL_starGiftUnique.crafted) {
                    this.f51188r = new i11(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f51188r = new i11(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
                } else {
                    this.f51188r = new i11(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
                }
            } else {
                this.f51188r = new i11(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
            }
        } else {
            this.f51188r = new i11(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        }
        this.f51187q = (this.f51188r.j() / 2.0f) + dp2;
        float j10 = this.f51188r.j() + dp2 + AndroidUtilities.dp(3.0f);
        TLObject tLObject = null;
        if (this.f51186p) {
            f7 = 10.0f;
            f10 = 3.0f;
            this.f51190t = new i11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f11 = 2.0f;
        } else {
            f7 = 10.0f;
            f10 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f11 = 2.0f;
            this.f51190t = new i11(org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f51189s = (this.f51190t.j() / f11) + j10;
        float j11 = this.f51190t.j() + j10;
        if (this.f51186p) {
            f12 = 14.0f;
        } else {
            f12 = 11.0f;
        }
        float dp3 = j11 + AndroidUtilities.dp(f12);
        ArrayList arrayList = this.f51192w;
        arrayList.clear();
        this.f51191u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        yh.l0 l0Var = this.f51194y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = l0Var.f48955c;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false);
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
            if (!tL_messageActionStarGiftUnique.name_hidden) {
                if (tL_messageActionStarGiftUnique.from_id != null) {
                    tLObject = MessagesController.getInstance(i11).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.from_id));
                } else {
                    tLObject = MessagesController.getInstance(i11).getUserOrChat(messageObject.getFromChatId());
                }
            }
            this.f51195z = true;
            l0Var.c(tLObject);
            l0Var.f48962m = replaceAnimatedEmoji;
            l0Var.f48968s = -1;
            l0Var.b(((int) f13) - AndroidUtilities.dp(24.0f));
            if (!this.K) {
                StaticLayout staticLayout = l0Var.f48963n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.K = true;
                    StaticLayout staticLayout2 = l0Var.f48963n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.L = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.L);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp4 = dp3 + AndroidUtilities.dp(4.0f);
            this.f51193x = dp4;
            dp3 = dp4 + l0Var.f48970u + AndroidUtilities.dp(f10);
        } else {
            this.f51195z = false;
            l0Var.c(null);
            l0Var.f48962m = null;
            l0Var.f48968s = -1;
            if (this.f51183m != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                s3 s3Var = new s3(dp3, LocaleController.getString(R.string.Gift2AttributeModel), this.f51183m.name);
                arrayList.add(s3Var);
                float f14 = f13 * 0.5f;
                i11 i11Var = s3Var.f51157b;
                i11Var.f25465p = f14;
                this.f51191u = Math.max(this.f51191u, i11Var.f25455c);
                i11 i11Var2 = s3Var.f51158c;
                i11Var2.f25465p = f14;
                this.v = Math.max(this.v, i11Var2.f25455c);
                dp3 += s3Var.a();
            }
            if (this.f51181k != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                s3 s3Var2 = new s3(dp3, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f51181k.name);
                arrayList.add(s3Var2);
                float f15 = f13 * 0.5f;
                i11 i11Var3 = s3Var2.f51157b;
                i11Var3.f25465p = f15;
                this.f51191u = Math.max(this.f51191u, i11Var3.f25455c);
                i11 i11Var4 = s3Var2.f51158c;
                i11Var4.f25465p = f15;
                this.v = Math.max(this.v, i11Var4.f25455c);
                dp3 = s3Var2.a() + dp3;
            }
            if (this.f51182l != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                s3 s3Var3 = new s3(dp3, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f51182l.name);
                arrayList.add(s3Var3);
                float f16 = f13 * 0.5f;
                i11 i11Var5 = s3Var3.f51157b;
                i11Var5.f25465p = f16;
                this.f51191u = Math.max(this.f51191u, i11Var5.f25455c);
                i11 i11Var6 = s3Var3.f51158c;
                i11Var6.f25465p = f16;
                this.v = Math.max(this.v, i11Var6.f25455c);
                dp3 += s3Var3.a();
            }
        }
        float dp5 = dp3 + AndroidUtilities.dp(11.66f);
        if (!this.f51186p) {
            this.A = dp5;
            this.C = new i11(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
            float dp6 = AndroidUtilities.dp(30.0f);
            this.B = dp6;
            dp5 += dp6;
            dp = AndroidUtilities.dp(11.0f);
        } else {
            dp = AndroidUtilities.dp(f7);
        }
        this.M = (int) (dp5 + dp);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i10;
        float f7 = this.L;
        float dp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        int i11 = 0;
        i11 i11Var = new i11(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j10)), 14.0f, AndroidUtilities.bold());
        this.f51188r = i11Var;
        this.f51187q = (i11Var.j() / 2.0f) + dp;
        float j11 = this.f51188r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        String h = org.telegram.messenger.g0.h(tL_starGiftUnique.num, ',', sb2);
        TLObject tLObject = null;
        i11 i11Var2 = new i11(h, 12.0f, null);
        this.f51190t = i11Var2;
        this.f51189s = (i11Var2.j() / 2.0f) + j11;
        float j12 = this.f51190t.j() + j11 + AndroidUtilities.dp(11.0f);
        this.f51192w.clear();
        this.f51191u = 0.0f;
        this.v = 0.0f;
        yh.l0 l0Var = this.f51194y;
        TextPaint textPaint = l0Var.f48955c;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false);
            spanned = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftMessageHint));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spanned = spannableStringBuilder2;
        }
        if (j10 != 0) {
            tLObject = MessagesController.getInstance(this.f51174a).getUserOrChat(j10);
        }
        this.f51195z = true;
        l0Var.c(tLObject);
        l0Var.f48962m = spanned;
        l0Var.f48968s = -1;
        l0Var.b(((int) f7) - AndroidUtilities.dp(24.0f));
        if (!this.K) {
            StaticLayout staticLayout = l0Var.f48963n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.K = true;
                StaticLayout staticLayout2 = l0Var.f48963n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.L = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.L);
                h(tL_starGiftUnique, j10, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j12 + AndroidUtilities.dp(4.0f);
        this.f51193x = dp2;
        float dp3 = dp2 + l0Var.f48970u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new i11(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.M = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
