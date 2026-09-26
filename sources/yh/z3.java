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
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
public final class z3 {
    public float A;
    public float B;
    public t01 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final i8 G;
    public final yc H;
    public final yc I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public TLRPC.TL_messageActionStarGiftUnique N;
    public MessageObject O;
    public boolean P;
    public final le.f Q;
    public xh.d0 R;
    public final int f48317a;
    public final View f48318b;
    public final org.telegram.ui.ActionBar.d6 f48319c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.o5 e;
    public int f48321g;
    public RadialGradient h;
    public final xh.m1 f48323j;
    public TL_stars.starGiftAttributeBackdrop f48324k;
    public TL_stars.starGiftAttributePattern f48325l;
    public TL_stars.starGiftAttributeModel f48326m;
    public boolean f48329p;
    public float f48330q;
    public t01 f48331r;
    public float f48332s;
    public t01 f48333t;
    public float f48334u;
    public float v;
    public float f48336x;
    public final xh.k0 f48337y;
    public boolean f48338z;
    public final Paint f48320f = new Paint(1);
    public final Matrix f48322i = new Matrix();
    public final RectF f48327n = new RectF();
    public final Path f48328o = new Path();
    public final ArrayList f48335w = new ArrayList();

    public z3(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        xh.k0 k0Var = new xh.k0();
        this.f48337y = k0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new i8(1, 25);
        this.Q = new le.f(0, new r5.d(this, 22), rr.h, 320L);
        this.f48317a = i10;
        this.f48318b = view;
        this.f48319c = d6Var;
        this.f48323j = new xh.m1(view);
        this.H = new yc(view);
        this.I = new yc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.o5(AndroidUtilities.dp(28.0f), view);
        k0Var.f46246r = view;
        k0Var.d.setParentView(view);
    }

    public final void a(Canvas canvas) {
        le.f fVar = this.Q;
        float f7 = fVar.e;
        float f10 = f7 / 2.0f;
        RectF rectF = this.f48327n;
        rectF.set(0.0f, 0.0f, f7, this.M);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f48324k != null && (this.h == null || this.f48321g != height)) {
            this.f48321g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f48324k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f48320f;
        if (radialGradient != null) {
            Matrix matrix = this.f48322i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.f48328o;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f48324k;
        org.telegram.ui.Components.o5 o5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            o5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        j0.a(canvas, 1, o5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f10 - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        imageReceiver.draw(canvas);
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f48324k;
        if (stargiftattributebackdrop3 != null) {
            l1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i10 = l1;
        this.f48331r.f28373p = fVar.e - AndroidUtilities.dp(12.0f);
        t01 t01Var = this.f48331r;
        t01Var.c(f10 - (t01Var.f28363c / 2.0f), this.f48330q, 1.0f, -1, canvas);
        this.f48333t.f28373p = fVar.e - AndroidUtilities.dp(12.0f);
        t01 t01Var2 = this.f48333t;
        Canvas canvas2 = canvas;
        int i11 = i10;
        t01Var2.c(f10 - (t01Var2.f28363c / 2.0f), this.f48332s, 1.0f, i11, canvas2);
        if (this.f48338z) {
            xh.k0 k0Var = this.f48337y;
            int i12 = k0Var.f46248t;
            int i13 = k0Var.f46249u;
            int i14 = (int) (f10 - (i12 / 2.0f));
            int i15 = (int) this.f48336x;
            k0Var.setBounds(i14, i15, i12 + i14, i13 + i15);
            k0Var.draw(canvas2);
        } else {
            float dp = this.f48334u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f48335w;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                int i17 = i16 + 1;
                y3 y3Var = (y3) arrayList.get(i16);
                t01 t01Var3 = y3Var.f48293b;
                float f11 = f10 - (dp / 2.0f);
                t01Var3.c((f11 + this.f48334u) - t01Var3.f28363c, y3Var.f48292a, 1.0f, i11, canvas2);
                canvas2 = canvas;
                y3Var.f48294c.c(f11 + this.f48334u + AndroidUtilities.dp(9.0f), y3Var.f48292a, 1.0f, -1, canvas2);
                i11 = i11;
                i16 = i17;
            }
        }
        int i18 = i11;
        if (!this.f48329p) {
            float f12 = this.A;
            float a10 = org.telegram.messenger.f0.a(this.C.f28363c, AndroidUtilities.dp(30.0f), 2.0f, f10);
            float f13 = this.A + this.B;
            RectF rectF2 = this.D;
            rectF2.set(f10 - ((this.C.f28363c + AndroidUtilities.dp(30.0f)) / 2.0f), f12, a10, f13);
            Path path2 = this.E;
            path2.rewind();
            float f14 = this.B / 2.0f;
            path2.addRoundRect(rectF2, f14, f14, Path.Direction.CW);
            int l12 = org.telegram.ui.ActionBar.h6.l1(0.13f, -16777216);
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
            xh.m1 m1Var = this.f48323j;
            m1Var.setBounds(dp2, dp3, dp4, dp5);
            m1Var.h = i18;
            m1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void b(Canvas canvas) {
        if (this.f48329p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f48327n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        i8 i8Var = this.G;
        i8Var.g(rectF2);
        i8Var.d();
        i8Var.a(canvas, org.telegram.ui.ActionBar.h6.l1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f48318b;
        if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).K();
        } else {
            view.invalidate();
        }
    }

    public final float c() {
        return this.Q.e;
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
        boolean contains2 = this.f48327n.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        int action = motionEvent.getAction();
        yc ycVar = this.H;
        yc ycVar2 = this.I;
        if (action == 0) {
            if (contains2 && !contains) {
                z11 = true;
            } else {
                z11 = false;
            }
            ycVar2.c(z11);
            ycVar.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (ycVar.h && !contains) {
                ycVar.c(false);
            } else if (ycVar2.h && !contains2) {
                ycVar2.c(false);
            }
        } else if (motionEvent.getAction() == 1 && ((z10 = ycVar.h) || ycVar2.h)) {
            xh.d0 d0Var = this.R;
            if (d0Var != null) {
                if (z10) {
                    d0Var.run();
                }
            } else if (this.J) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.messenger.f0.p(R.string.UniqueGiftNotFoundBurned, xc.a0(U), R.raw.fire_on, 36);
                }
            } else {
                x3 x3Var = new x3(this.f48318b.getContext(), this.f48317a, this.O.getDialogId(), this.f48319c, null);
                x3Var.i2(this.O, null);
                x3Var.show();
            }
            ycVar.c(false);
            ycVar2.c(false);
            return true;
        } else if (motionEvent.getAction() == 3 && (ycVar.h || ycVar2.h)) {
            ycVar.c(false);
            ycVar2.c(false);
            return true;
        }
        if (ycVar.h || ycVar2.h) {
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
        int i11 = this.f48317a;
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
        if (this.f48329p) {
            this.f48331r = new t01(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer == null && !UserObject.isService(messageObject.getDialogId())) {
            if (messageObject.getDialogId() == UserConfig.getInstance(i11).getClientUserId()) {
                if (tL_starGiftUnique.crafted) {
                    this.f48331r = new t01(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f48331r = new t01(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
                } else {
                    this.f48331r = new t01(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
                }
            } else {
                this.f48331r = new t01(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
            }
        } else {
            this.f48331r = new t01(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        }
        this.f48330q = (this.f48331r.j() / 2.0f) + dp2;
        float j3 = this.f48331r.j() + dp2 + AndroidUtilities.dp(3.0f);
        TLObject tLObject = null;
        if (this.f48329p) {
            f7 = 10.0f;
            f10 = 3.0f;
            this.f48333t = new t01(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f11 = 2.0f;
        } else {
            f7 = 10.0f;
            f10 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f11 = 2.0f;
            this.f48333t = new t01(org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f48332s = (this.f48333t.j() / f11) + j3;
        float j10 = this.f48333t.j() + j3;
        if (this.f48329p) {
            f12 = 14.0f;
        } else {
            f12 = 11.0f;
        }
        float dp3 = j10 + AndroidUtilities.dp(f12);
        ArrayList arrayList = this.f48335w;
        arrayList.clear();
        this.f48334u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        xh.k0 k0Var = this.f48337y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = k0Var.f46234c;
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
            this.f48338z = true;
            k0Var.c(tLObject);
            k0Var.f46241m = replaceAnimatedEmoji;
            k0Var.f46247s = -1;
            k0Var.b(((int) f13) - AndroidUtilities.dp(24.0f));
            if (!this.K) {
                StaticLayout staticLayout = k0Var.f46242n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.K = true;
                    StaticLayout staticLayout2 = k0Var.f46242n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.L = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.L);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp4 = dp3 + AndroidUtilities.dp(4.0f);
            this.f48336x = dp4;
            dp3 = dp4 + k0Var.f46249u + AndroidUtilities.dp(f10);
        } else {
            this.f48338z = false;
            k0Var.c(null);
            k0Var.f46241m = null;
            k0Var.f46247s = -1;
            if (this.f48326m != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                y3 y3Var = new y3(dp3, LocaleController.getString(R.string.Gift2AttributeModel), this.f48326m.name);
                arrayList.add(y3Var);
                float f14 = f13 * 0.5f;
                t01 t01Var = y3Var.f48293b;
                t01Var.f28373p = f14;
                this.f48334u = Math.max(this.f48334u, t01Var.f28363c);
                t01 t01Var2 = y3Var.f48294c;
                t01Var2.f28373p = f14;
                this.v = Math.max(this.v, t01Var2.f28363c);
                dp3 += y3Var.a();
            }
            if (this.f48324k != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                y3 y3Var2 = new y3(dp3, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f48324k.name);
                arrayList.add(y3Var2);
                float f15 = f13 * 0.5f;
                t01 t01Var3 = y3Var2.f48293b;
                t01Var3.f28373p = f15;
                this.f48334u = Math.max(this.f48334u, t01Var3.f28363c);
                t01 t01Var4 = y3Var2.f48294c;
                t01Var4.f28373p = f15;
                this.v = Math.max(this.v, t01Var4.f28363c);
                dp3 = y3Var2.a() + dp3;
            }
            if (this.f48325l != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                y3 y3Var3 = new y3(dp3, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f48325l.name);
                arrayList.add(y3Var3);
                float f16 = f13 * 0.5f;
                t01 t01Var5 = y3Var3.f48293b;
                t01Var5.f28373p = f16;
                this.f48334u = Math.max(this.f48334u, t01Var5.f28363c);
                t01 t01Var6 = y3Var3.f48294c;
                t01Var6.f28373p = f16;
                this.v = Math.max(this.v, t01Var6.f28363c);
                dp3 += y3Var3.a();
            }
        }
        float dp5 = dp3 + AndroidUtilities.dp(11.66f);
        if (!this.f48329p) {
            this.A = dp5;
            this.C = new t01(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
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
        t01 t01Var = new t01(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j3)), 14.0f, AndroidUtilities.bold());
        this.f48331r = t01Var;
        this.f48330q = (t01Var.j() / 2.0f) + dp;
        float j10 = this.f48331r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        String h = org.telegram.messenger.f0.h(tL_starGiftUnique.num, ',', sb2);
        TLObject tLObject = null;
        t01 t01Var2 = new t01(h, 12.0f, null);
        this.f48333t = t01Var2;
        this.f48332s = (t01Var2.j() / 2.0f) + j10;
        float j11 = this.f48333t.j() + j10 + AndroidUtilities.dp(11.0f);
        this.f48335w.clear();
        this.f48334u = 0.0f;
        this.v = 0.0f;
        xh.k0 k0Var = this.f48337y;
        TextPaint textPaint = k0Var.f46234c;
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
            tLObject = MessagesController.getInstance(this.f48317a).getUserOrChat(j3);
        }
        this.f48338z = true;
        k0Var.c(tLObject);
        k0Var.f46241m = spanned;
        k0Var.f46247s = -1;
        k0Var.b(((int) f7) - AndroidUtilities.dp(24.0f));
        if (!this.K) {
            StaticLayout staticLayout = k0Var.f46242n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.K = true;
                StaticLayout staticLayout2 = k0Var.f46242n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.L = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.L);
                h(tL_starGiftUnique, j3, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j11 + AndroidUtilities.dp(4.0f);
        this.f48336x = dp2;
        float dp3 = dp2 + k0Var.f46249u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new t01(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.M = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
