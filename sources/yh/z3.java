package yh;

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
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
public final class z3 {
    public float A;
    public float B;
    public e11 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final j8 G;
    public final zc H;
    public final zc I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public TLRPC.TL_messageActionStarGiftUnique N;
    public MessageObject O;
    public boolean P;
    public final le.e Q;
    public xh.d0 R;
    public final int f52308a;
    public final View f52309b;
    public final org.telegram.ui.ActionBar.d6 f52310c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.o5 f52311e;
    public int f52313g;
    public RadialGradient h;
    public final xh.l1 f52315j;
    public TL_stars.starGiftAttributeBackdrop f52316k;
    public TL_stars.starGiftAttributePattern f52317l;
    public TL_stars.starGiftAttributeModel f52318m;
    public boolean f52321p;
    public float f52322q;
    public e11 f52323r;
    public float f52324s;
    public e11 f52325t;
    public float f52326u;
    public float v;
    public float f52328x;
    public final xh.k0 f52329y;
    public boolean f52330z;
    public final Paint f52312f = new Paint(1);
    public final Matrix f52314i = new Matrix();
    public final RectF f52319n = new RectF();
    public final Path f52320o = new Path();
    public final ArrayList f52327w = new ArrayList();

    public z3(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        xh.k0 k0Var = new xh.k0();
        this.f52329y = k0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new j8(1, 25);
        this.Q = new le.e(0, new r2.s(this, 24), tr.h, 320L);
        this.f52308a = i10;
        this.f52309b = view;
        this.f52310c = d6Var;
        this.f52315j = new xh.l1(view);
        this.H = new zc(view);
        this.I = new zc(view);
        this.d = new ImageReceiver(view);
        this.f52311e = new org.telegram.ui.Components.o5(AndroidUtilities.dp(28.0f), view);
        k0Var.f50057r = view;
        k0Var.d.setParentView(view);
    }

    public final void a(Canvas canvas) {
        le.e eVar = this.Q;
        float f7 = eVar.f15442e;
        float f10 = f7 / 2.0f;
        RectF rectF = this.f52319n;
        rectF.set(0.0f, 0.0f, f7, this.M);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f52316k != null && (this.h == null || this.f52313g != height)) {
            this.f52313g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f52316k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f52312f;
        if (radialGradient != null) {
            Matrix matrix = this.f52314i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.f52320o;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f52316k;
        org.telegram.ui.Components.o5 o5Var = this.f52311e;
        if (stargiftattributebackdrop2 != null) {
            o5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        j0.a(canvas, 1, o5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f10 - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        imageReceiver.draw(canvas);
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f52316k;
        if (stargiftattributebackdrop3 != null) {
            l1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i10 = l1;
        this.f52323r.f25889p = eVar.f15442e - AndroidUtilities.dp(12.0f);
        e11 e11Var = this.f52323r;
        e11Var.c(f10 - (e11Var.f25878c / 2.0f), this.f52322q, 1.0f, -1, canvas);
        this.f52325t.f25889p = eVar.f15442e - AndroidUtilities.dp(12.0f);
        e11 e11Var2 = this.f52325t;
        Canvas canvas2 = canvas;
        int i11 = i10;
        e11Var2.c(f10 - (e11Var2.f25878c / 2.0f), this.f52324s, 1.0f, i11, canvas2);
        if (this.f52330z) {
            xh.k0 k0Var = this.f52329y;
            int i12 = k0Var.f50059t;
            int i13 = k0Var.f50060u;
            int i14 = (int) (f10 - (i12 / 2.0f));
            int i15 = (int) this.f52328x;
            k0Var.setBounds(i14, i15, i12 + i14, i13 + i15);
            k0Var.draw(canvas2);
        } else {
            float dp = this.f52326u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f52327w;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                int i17 = i16 + 1;
                y3 y3Var = (y3) arrayList.get(i16);
                e11 e11Var3 = y3Var.f52288b;
                float f11 = f10 - (dp / 2.0f);
                e11Var3.c((f11 + this.f52326u) - e11Var3.f25878c, y3Var.f52287a, 1.0f, i11, canvas2);
                canvas2 = canvas;
                y3Var.f52289c.c(f11 + this.f52326u + AndroidUtilities.dp(9.0f), y3Var.f52287a, 1.0f, -1, canvas2);
                i11 = i11;
                i16 = i17;
            }
        }
        int i18 = i11;
        if (!this.f52321p) {
            float f12 = this.A;
            float a10 = org.telegram.messenger.f0.a(this.C.f25878c, AndroidUtilities.dp(30.0f), 2.0f, f10);
            float f13 = this.A + this.B;
            RectF rectF2 = this.D;
            rectF2.set(f10 - ((this.C.f25878c + AndroidUtilities.dp(30.0f)) / 2.0f), f12, a10, f13);
            Path path2 = this.E;
            path2.rewind();
            float f14 = this.B / 2.0f;
            path2.addRoundRect(rectF2, f14, f14, Path.Direction.CW);
            int l12 = org.telegram.ui.ActionBar.i6.l1(0.13f, -16777216);
            Paint paint2 = this.F;
            paint2.setColor(l12);
            float a11 = this.H.a(0.075f);
            canvas2.scale(a11, a11, rectF2.centerX(), rectF2.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            int dp2 = ((int) rectF.right) - AndroidUtilities.dp(46.67f);
            int dp3 = ((int) rectF.top) - AndroidUtilities.dp(1.33f);
            int dp4 = AndroidUtilities.dp(1.33f) + ((int) rectF.right);
            int dp5 = AndroidUtilities.dp(46.67f) + ((int) rectF.top);
            xh.l1 l1Var = this.f52315j;
            l1Var.setBounds(dp2, dp3, dp4, dp5);
            l1Var.h = i18;
            l1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void b(Canvas canvas) {
        if (this.f52321p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f52319n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        j8 j8Var = this.G;
        j8Var.g(rectF2);
        j8Var.d();
        j8Var.a(canvas, org.telegram.ui.ActionBar.i6.l1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f52309b;
        if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).I();
        } else {
            view.invalidate();
        }
    }

    public final float c() {
        return this.Q.f15442e;
    }

    public final boolean d() {
        if (this.N != null) {
            return true;
        }
        return false;
    }

    public final boolean e(float f7, float f10, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean contains = this.D.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        boolean contains2 = this.f52319n.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        int action = motionEvent.getAction();
        zc zcVar = this.H;
        zc zcVar2 = this.I;
        if (action == 0) {
            if (contains2 && !contains) {
                z11 = true;
            } else {
                z11 = false;
            }
            zcVar2.c(z11);
            zcVar.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (zcVar.h && !contains) {
                zcVar.c(false);
            } else if (zcVar2.h && !contains2) {
                zcVar2.c(false);
            }
        } else if (motionEvent.getAction() == 1 && ((z10 = zcVar.h) || zcVar2.h)) {
            xh.d0 d0Var = this.R;
            if (d0Var != null) {
                if (z10) {
                    d0Var.run();
                }
            } else if (this.J) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.messenger.f0.p(R.string.UniqueGiftNotFoundBurned, yc.a0(U), R.raw.fire_on, 36);
                }
            } else {
                x3 x3Var = new x3(this.f52309b.getContext(), this.f52308a, this.O.getDialogId(), this.f52310c, null);
                x3Var.i2(this.O, null);
                x3Var.show();
            }
            zcVar.c(false);
            zcVar2.c(false);
            return true;
        } else if (motionEvent.getAction() == 3 && (zcVar.h || zcVar2.h)) {
            zcVar.c(false);
            zcVar2.c(false);
            return true;
        }
        if (zcVar.h || zcVar2.h) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: yh.z3.f(org.telegram.messenger.MessageObject, boolean):void");
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
        int i11 = this.f52308a;
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
        if (this.f52321p) {
            this.f52323r = new e11(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer == null && !UserObject.isService(messageObject.getDialogId())) {
            if (messageObject.getDialogId() == UserConfig.getInstance(i11).getClientUserId()) {
                if (tL_starGiftUnique.crafted) {
                    this.f52323r = new e11(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f52323r = new e11(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
                } else {
                    this.f52323r = new e11(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
                }
            } else {
                this.f52323r = new e11(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
            }
        } else {
            this.f52323r = new e11(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        }
        this.f52322q = (this.f52323r.j() / 2.0f) + dp2;
        float j3 = this.f52323r.j() + dp2 + AndroidUtilities.dp(3.0f);
        TLObject tLObject = null;
        if (this.f52321p) {
            f7 = 10.0f;
            f10 = 3.0f;
            this.f52325t = new e11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f11 = 2.0f;
        } else {
            f7 = 10.0f;
            f10 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f11 = 2.0f;
            this.f52325t = new e11(org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f52324s = (this.f52325t.j() / f11) + j3;
        float j10 = this.f52325t.j() + j3;
        if (this.f52321p) {
            f12 = 14.0f;
        } else {
            f12 = 11.0f;
        }
        float dp3 = j10 + AndroidUtilities.dp(f12);
        ArrayList arrayList = this.f52327w;
        arrayList.clear();
        this.f52326u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        xh.k0 k0Var = this.f52329y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = k0Var.f50044c;
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
            this.f52330z = true;
            k0Var.c(tLObject);
            k0Var.f50052m = replaceAnimatedEmoji;
            k0Var.f50058s = -1;
            k0Var.b(((int) f13) - AndroidUtilities.dp(24.0f));
            if (!this.K) {
                StaticLayout staticLayout = k0Var.f50053n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.K = true;
                    StaticLayout staticLayout2 = k0Var.f50053n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.L = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.L);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp4 = dp3 + AndroidUtilities.dp(4.0f);
            this.f52328x = dp4;
            dp3 = dp4 + k0Var.f50060u + AndroidUtilities.dp(f10);
        } else {
            this.f52330z = false;
            k0Var.c(null);
            k0Var.f50052m = null;
            k0Var.f50058s = -1;
            if (this.f52318m != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                y3 y3Var = new y3(dp3, LocaleController.getString(R.string.Gift2AttributeModel), this.f52318m.name);
                arrayList.add(y3Var);
                float f14 = f13 * 0.5f;
                e11 e11Var = y3Var.f52288b;
                e11Var.f25889p = f14;
                this.f52326u = Math.max(this.f52326u, e11Var.f25878c);
                e11 e11Var2 = y3Var.f52289c;
                e11Var2.f25889p = f14;
                this.v = Math.max(this.v, e11Var2.f25878c);
                dp3 += y3Var.a();
            }
            if (this.f52316k != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                y3 y3Var2 = new y3(dp3, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f52316k.name);
                arrayList.add(y3Var2);
                float f15 = f13 * 0.5f;
                e11 e11Var3 = y3Var2.f52288b;
                e11Var3.f25889p = f15;
                this.f52326u = Math.max(this.f52326u, e11Var3.f25878c);
                e11 e11Var4 = y3Var2.f52289c;
                e11Var4.f25889p = f15;
                this.v = Math.max(this.v, e11Var4.f25878c);
                dp3 = y3Var2.a() + dp3;
            }
            if (this.f52317l != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                y3 y3Var3 = new y3(dp3, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f52317l.name);
                arrayList.add(y3Var3);
                float f16 = f13 * 0.5f;
                e11 e11Var5 = y3Var3.f52288b;
                e11Var5.f25889p = f16;
                this.f52326u = Math.max(this.f52326u, e11Var5.f25878c);
                e11 e11Var6 = y3Var3.f52289c;
                e11Var6.f25889p = f16;
                this.v = Math.max(this.v, e11Var6.f25878c);
                dp3 += y3Var3.a();
            }
        }
        float dp5 = dp3 + AndroidUtilities.dp(11.66f);
        if (!this.f52321p) {
            this.A = dp5;
            this.C = new e11(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
            float dp6 = AndroidUtilities.dp(30.0f);
            this.B = dp6;
            dp5 += dp6;
            dp = AndroidUtilities.dp(11.0f);
        } else {
            dp = AndroidUtilities.dp(f7);
        }
        this.M = (int) (dp5 + dp);
    }

    public final void h(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spanned spanned;
        int i10;
        float f7 = this.L;
        float dp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        int i11 = 0;
        e11 e11Var = new e11(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j3)), 14.0f, AndroidUtilities.bold());
        this.f52323r = e11Var;
        this.f52322q = (e11Var.j() / 2.0f) + dp;
        float j10 = this.f52323r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        String h = org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2);
        TLObject tLObject = null;
        e11 e11Var2 = new e11(h, 12.0f, null);
        this.f52325t = e11Var2;
        this.f52324s = (e11Var2.j() / 2.0f) + j10;
        float j11 = this.f52325t.j() + j10 + AndroidUtilities.dp(11.0f);
        this.f52327w.clear();
        this.f52326u = 0.0f;
        this.v = 0.0f;
        xh.k0 k0Var = this.f52329y;
        TextPaint textPaint = k0Var.f50044c;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false);
            spanned = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.GiftMessageHint));
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder2.length(), 33);
            spanned = spannableStringBuilder2;
        }
        if (j3 != 0) {
            tLObject = MessagesController.getInstance(this.f52308a).getUserOrChat(j3);
        }
        this.f52330z = true;
        k0Var.c(tLObject);
        k0Var.f50052m = spanned;
        k0Var.f50058s = -1;
        k0Var.b(((int) f7) - AndroidUtilities.dp(24.0f));
        if (!this.K) {
            StaticLayout staticLayout = k0Var.f50053n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.K = true;
                StaticLayout staticLayout2 = k0Var.f50053n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.L = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.L);
                h(tL_starGiftUnique, j3, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j11 + AndroidUtilities.dp(4.0f);
        this.f52328x = dp2;
        float dp3 = dp2 + k0Var.f50060u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new e11(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.M = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
