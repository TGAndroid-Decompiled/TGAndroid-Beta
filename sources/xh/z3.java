package xh;

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
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
public final class z3 {
    public float A;
    public float B;
    public t01 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final l8 G;
    public final xc H;
    public final xc I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public TLRPC.TL_messageActionStarGiftUnique N;
    public MessageObject O;
    public boolean P;
    public final le.e Q;
    public wh.e0 R;
    public final int f46353a;
    public final View f46354b;
    public final org.telegram.ui.ActionBar.f6 f46355c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.n5 e;
    public int f46357g;
    public RadialGradient h;
    public final wh.k1 f46359j;
    public TL_stars.starGiftAttributeBackdrop f46360k;
    public TL_stars.starGiftAttributePattern f46361l;
    public TL_stars.starGiftAttributeModel f46362m;
    public boolean f46365p;
    public float f46366q;
    public t01 f46367r;
    public float f46368s;
    public t01 f46369t;
    public float f46370u;
    public float v;
    public float f46372x;
    public final wh.l0 f46373y;
    public boolean f46374z;
    public final Paint f46356f = new Paint(1);
    public final Matrix f46358i = new Matrix();
    public final RectF f46363n = new RectF();
    public final Path f46364o = new Path();
    public final ArrayList f46371w = new ArrayList();

    public z3(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        wh.l0 l0Var = new wh.l0();
        this.f46373y = l0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new l8(1, 25);
        this.Q = new le.e(0, new th.e(this, 12), wr.h, 320L);
        this.f46353a = i10;
        this.f46354b = view;
        this.f46355c = f6Var;
        this.f46359j = new wh.k1(view);
        this.H = new xc(view);
        this.I = new xc(view);
        this.d = new ImageReceiver(view);
        this.e = new org.telegram.ui.Components.n5(AndroidUtilities.dp(28.0f), view);
        l0Var.f44194r = view;
        l0Var.d.setParentView(view);
    }

    public final void a(Canvas canvas) {
        le.e eVar = this.Q;
        float f7 = eVar.e;
        float f10 = f7 / 2.0f;
        RectF rectF = this.f46363n;
        rectF.set(0.0f, 0.0f, f7, this.M);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f46360k != null && (this.h == null || this.f46357g != height)) {
            this.f46357g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f46360k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f46356f;
        if (radialGradient != null) {
            Matrix matrix = this.f46358i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.f46364o;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f46360k;
        org.telegram.ui.Components.n5 n5Var = this.e;
        if (stargiftattributebackdrop2 != null) {
            n5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        j0.a(canvas, 1, n5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f10 - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        imageReceiver.draw(canvas);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f46360k;
        if (stargiftattributebackdrop3 != null) {
            l1 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i10 = l1;
        this.f46367r.f27257p = eVar.e - AndroidUtilities.dp(12.0f);
        t01 t01Var = this.f46367r;
        t01Var.c(f10 - (t01Var.f27247c / 2.0f), this.f46366q, 1.0f, -1, canvas);
        this.f46369t.f27257p = eVar.e - AndroidUtilities.dp(12.0f);
        t01 t01Var2 = this.f46369t;
        Canvas canvas2 = canvas;
        int i11 = i10;
        t01Var2.c(f10 - (t01Var2.f27247c / 2.0f), this.f46368s, 1.0f, i11, canvas2);
        if (this.f46374z) {
            wh.l0 l0Var = this.f46373y;
            int i12 = l0Var.f44196t;
            int i13 = l0Var.f44197u;
            int i14 = (int) (f10 - (i12 / 2.0f));
            int i15 = (int) this.f46372x;
            l0Var.setBounds(i14, i15, i12 + i14, i13 + i15);
            l0Var.draw(canvas2);
        } else {
            float dp = this.f46370u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f46371w;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                int i17 = i16 + 1;
                y3 y3Var = (y3) arrayList.get(i16);
                t01 t01Var3 = y3Var.f46330b;
                float f11 = f10 - (dp / 2.0f);
                t01Var3.c((f11 + this.f46370u) - t01Var3.f27247c, y3Var.f46329a, 1.0f, i11, canvas2);
                canvas2 = canvas;
                y3Var.f46331c.c(f11 + this.f46370u + AndroidUtilities.dp(9.0f), y3Var.f46329a, 1.0f, -1, canvas2);
                i11 = i11;
                i16 = i17;
            }
        }
        int i18 = i11;
        if (!this.f46365p) {
            float f12 = this.A;
            float a10 = org.telegram.messenger.a2.a(this.C.f27247c, AndroidUtilities.dp(30.0f), 2.0f, f10);
            float f13 = this.A + this.B;
            RectF rectF2 = this.D;
            rectF2.set(f10 - ((this.C.f27247c + AndroidUtilities.dp(30.0f)) / 2.0f), f12, a10, f13);
            Path path2 = this.E;
            path2.rewind();
            float f14 = this.B / 2.0f;
            path2.addRoundRect(rectF2, f14, f14, Path.Direction.CW);
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.13f, -16777216);
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
            wh.k1 k1Var = this.f46359j;
            k1Var.setBounds(dp2, dp3, dp4, dp5);
            k1Var.h = i18;
            k1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void b(Canvas canvas) {
        if (this.f46365p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f46363n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        l8 l8Var = this.G;
        l8Var.g(rectF2);
        l8Var.d();
        l8Var.a(canvas, org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f46354b;
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
        boolean contains2 = this.f46363n.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        int action = motionEvent.getAction();
        xc xcVar = this.H;
        xc xcVar2 = this.I;
        if (action == 0) {
            if (contains2 && !contains) {
                z11 = true;
            } else {
                z11 = false;
            }
            xcVar2.c(z11);
            xcVar.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (xcVar.h && !contains) {
                xcVar.c(false);
            } else if (xcVar2.h && !contains2) {
                xcVar2.c(false);
            }
        } else if (motionEvent.getAction() == 1 && ((z10 = xcVar.h) || xcVar2.h)) {
            wh.e0 e0Var = this.R;
            if (e0Var != null) {
                if (z10) {
                    e0Var.run();
                }
            } else if (this.J) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.messenger.a2.o(R.string.UniqueGiftNotFoundBurned, wc.a0(U), R.raw.fire_on, 36);
                }
            } else {
                x3 x3Var = new x3(this.f46354b.getContext(), this.f46353a, this.O.getDialogId(), this.f46355c, null);
                x3Var.i2(this.O, null);
                x3Var.show();
            }
            xcVar.c(false);
            xcVar2.c(false);
            return true;
        } else if (motionEvent.getAction() == 3 && (xcVar.h || xcVar2.h)) {
            xcVar.c(false);
            xcVar2.c(false);
            return true;
        }
        if (xcVar.h || xcVar2.h) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: xh.z3.f(org.telegram.messenger.MessageObject, boolean):void");
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
        int i11 = this.f46353a;
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
        if (this.f46365p) {
            this.f46367r = new t01(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer == null && !UserObject.isService(messageObject.getDialogId())) {
            if (messageObject.getDialogId() == UserConfig.getInstance(i11).getClientUserId()) {
                if (tL_starGiftUnique.crafted) {
                    this.f46367r = new t01(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f46367r = new t01(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
                } else {
                    this.f46367r = new t01(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
                }
            } else {
                this.f46367r = new t01(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
            }
        } else {
            this.f46367r = new t01(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        }
        this.f46366q = (this.f46367r.j() / 2.0f) + dp2;
        float j3 = this.f46367r.j() + dp2 + AndroidUtilities.dp(3.0f);
        TLObject tLObject = null;
        if (this.f46365p) {
            f7 = 10.0f;
            f10 = 3.0f;
            this.f46369t = new t01(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f11 = 2.0f;
        } else {
            f7 = 10.0f;
            f10 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f11 = 2.0f;
            this.f46369t = new t01(hc.b.l(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f46368s = (this.f46369t.j() / f11) + j3;
        float j10 = this.f46369t.j() + j3;
        if (this.f46365p) {
            f12 = 14.0f;
        } else {
            f12 = 11.0f;
        }
        float dp3 = j10 + AndroidUtilities.dp(f12);
        ArrayList arrayList = this.f46371w;
        arrayList.clear();
        this.f46370u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        wh.l0 l0Var = this.f46373y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = l0Var.f44182c;
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
            this.f46374z = true;
            l0Var.c(tLObject);
            l0Var.f44189m = replaceAnimatedEmoji;
            l0Var.f44195s = -1;
            l0Var.b(((int) f13) - AndroidUtilities.dp(24.0f));
            if (!this.K) {
                StaticLayout staticLayout = l0Var.f44190n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.K = true;
                    StaticLayout staticLayout2 = l0Var.f44190n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.L = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.L);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp4 = dp3 + AndroidUtilities.dp(4.0f);
            this.f46372x = dp4;
            dp3 = dp4 + l0Var.f44197u + AndroidUtilities.dp(f10);
        } else {
            this.f46374z = false;
            l0Var.c(null);
            l0Var.f44189m = null;
            l0Var.f44195s = -1;
            if (this.f46362m != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                y3 y3Var = new y3(dp3, LocaleController.getString(R.string.Gift2AttributeModel), this.f46362m.name);
                arrayList.add(y3Var);
                float f14 = f13 * 0.5f;
                t01 t01Var = y3Var.f46330b;
                t01Var.f27257p = f14;
                this.f46370u = Math.max(this.f46370u, t01Var.f27247c);
                t01 t01Var2 = y3Var.f46331c;
                t01Var2.f27257p = f14;
                this.v = Math.max(this.v, t01Var2.f27247c);
                dp3 += y3Var.a();
            }
            if (this.f46360k != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                y3 y3Var2 = new y3(dp3, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f46360k.name);
                arrayList.add(y3Var2);
                float f15 = f13 * 0.5f;
                t01 t01Var3 = y3Var2.f46330b;
                t01Var3.f27257p = f15;
                this.f46370u = Math.max(this.f46370u, t01Var3.f27247c);
                t01 t01Var4 = y3Var2.f46331c;
                t01Var4.f27257p = f15;
                this.v = Math.max(this.v, t01Var4.f27247c);
                dp3 = y3Var2.a() + dp3;
            }
            if (this.f46361l != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                y3 y3Var3 = new y3(dp3, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f46361l.name);
                arrayList.add(y3Var3);
                float f16 = f13 * 0.5f;
                t01 t01Var5 = y3Var3.f46330b;
                t01Var5.f27257p = f16;
                this.f46370u = Math.max(this.f46370u, t01Var5.f27247c);
                t01 t01Var6 = y3Var3.f46331c;
                t01Var6.f27257p = f16;
                this.v = Math.max(this.v, t01Var6.f27247c);
                dp3 += y3Var3.a();
            }
        }
        float dp5 = dp3 + AndroidUtilities.dp(11.66f);
        if (!this.f46365p) {
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
        this.f46367r = t01Var;
        this.f46366q = (t01Var.j() / 2.0f) + dp;
        float j10 = this.f46367r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        String l4 = hc.b.l(tL_starGiftUnique.num, ',', sb2);
        TLObject tLObject = null;
        t01 t01Var2 = new t01(l4, 12.0f, null);
        this.f46369t = t01Var2;
        this.f46368s = (t01Var2.j() / 2.0f) + j10;
        float j11 = this.f46369t.j() + j10 + AndroidUtilities.dp(11.0f);
        this.f46371w.clear();
        this.f46370u = 0.0f;
        this.v = 0.0f;
        wh.l0 l0Var = this.f46373y;
        TextPaint textPaint = l0Var.f44182c;
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
            tLObject = MessagesController.getInstance(this.f46353a).getUserOrChat(j3);
        }
        this.f46374z = true;
        l0Var.c(tLObject);
        l0Var.f44189m = spanned;
        l0Var.f44195s = -1;
        l0Var.b(((int) f7) - AndroidUtilities.dp(24.0f));
        if (!this.K) {
            StaticLayout staticLayout = l0Var.f44190n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.K = true;
                StaticLayout staticLayout2 = l0Var.f44190n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.L = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.L);
                h(tL_starGiftUnique, j3, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j11 + AndroidUtilities.dp(4.0f);
        this.f46372x = dp2;
        float dp3 = dp2 + l0Var.f44197u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new t01(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.M = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
