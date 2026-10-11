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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.n11;
import org.telegram.ui.LaunchActivity;
public final class u3 {
    public float A;
    public float B;
    public n11 C;
    public final RectF D;
    public final Path E;
    public final Paint F;
    public final b8 G;
    public final bd H;
    public final bd I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public TLRPC.TL_messageActionStarGiftUnique N;
    public MessageObject O;
    public boolean P;
    public final me.e Q;
    public xh.f0 R;
    public final int f53350a;
    public final View f53351b;
    public final org.telegram.ui.ActionBar.d6 f53352c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.q5 f53353e;
    public int f53355g;
    public RadialGradient h;
    public final xh.m1 f53357j;
    public TL_stars.starGiftAttributeBackdrop f53358k;
    public TL_stars.starGiftAttributePattern f53359l;
    public TL_stars.starGiftAttributeModel f53360m;
    public boolean f53363p;
    public float f53364q;
    public n11 f53365r;
    public float f53366s;
    public n11 f53367t;
    public float f53368u;
    public float v;
    public float f53370x;
    public final xh.m0 f53371y;
    public boolean f53372z;
    public final Paint f53354f = new Paint(1);
    public final Matrix f53356i = new Matrix();
    public final RectF f53361n = new RectF();
    public final Path f53362o = new Path();
    public final ArrayList f53369w = new ArrayList();

    public u3(int i10, View view, org.telegram.ui.ActionBar.d6 d6Var) {
        xh.m0 m0Var = new xh.m0();
        this.f53371y = m0Var;
        this.D = new RectF();
        this.E = new Path();
        this.F = new Paint();
        this.G = new b8(1, 25);
        this.Q = new me.e(0, new r5.d(this, 22), is.h, 320L);
        this.f53350a = i10;
        this.f53351b = view;
        this.f53352c = d6Var;
        this.f53357j = new xh.m1(view);
        this.H = new bd(view);
        this.I = new bd(view);
        this.d = new ImageReceiver(view);
        this.f53353e = new org.telegram.ui.Components.q5(AndroidUtilities.dp(28.0f), view);
        m0Var.f51451r = view;
        m0Var.d.setParentView(view);
    }

    public final void a() {
        this.P = true;
        if (this.N != null) {
            this.d.onAttachedToWindow();
            this.f53353e.a();
            this.f53371y.d.onAttachedToWindow();
        }
    }

    public final void b(Canvas canvas) {
        me.e eVar = this.Q;
        float f7 = eVar.f16373e;
        float f10 = f7 / 2.0f;
        RectF rectF = this.f53361n;
        rectF.set(0.0f, 0.0f, f7, this.M);
        int height = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.f53358k != null && (this.h == null || this.f53355g != height)) {
            this.f53355g = height;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f53358k;
            this.h = new RadialGradient(0.0f, 0.0f, height, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.h;
        Paint paint = this.f53354f;
        if (radialGradient != null) {
            Matrix matrix = this.f53356i;
            matrix.reset();
            matrix.postTranslate(f10, f10);
            this.h.setLocalMatrix(matrix);
            paint.setShader(this.h);
        }
        Path path = this.f53362o;
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
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.f53358k;
        org.telegram.ui.Components.q5 q5Var = this.f53353e;
        if (stargiftattributebackdrop2 != null) {
            q5Var.k(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        i0.a(canvas, 1, q5Var, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(f10 - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        imageReceiver.draw(canvas);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.f53358k;
        if (stargiftattributebackdrop3 != null) {
            m12 = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i10 = m12;
        this.f53365r.f28913p = eVar.f16373e - AndroidUtilities.dp(12.0f);
        n11 n11Var = this.f53365r;
        n11Var.c(f10 - (n11Var.f28902c / 2.0f), this.f53364q, 1.0f, -1, canvas);
        this.f53367t.f28913p = eVar.f16373e - AndroidUtilities.dp(12.0f);
        n11 n11Var2 = this.f53367t;
        Canvas canvas2 = canvas;
        int i11 = i10;
        n11Var2.c(f10 - (n11Var2.f28902c / 2.0f), this.f53366s, 1.0f, i11, canvas2);
        if (this.f53372z) {
            xh.m0 m0Var = this.f53371y;
            int i12 = m0Var.f51453t;
            int i13 = m0Var.f51454u;
            int i14 = (int) (f10 - (i12 / 2.0f));
            int i15 = (int) this.f53370x;
            m0Var.setBounds(i14, i15, i12 + i14, i13 + i15);
            m0Var.draw(canvas2);
        } else {
            float f11 = 9.0f;
            float dp = this.f53368u + AndroidUtilities.dp(9.0f) + this.v;
            ArrayList arrayList = this.f53369w;
            int size = arrayList.size();
            int i16 = 0;
            while (i16 < size) {
                int i17 = i16 + 1;
                t3 t3Var = (t3) arrayList.get(i16);
                n11 n11Var3 = t3Var.f53328b;
                float f12 = f10 - (dp / 2.0f);
                float f13 = f11;
                n11Var3.c((f12 + this.f53368u) - n11Var3.f28902c, t3Var.f53327a, 1.0f, i11, canvas2);
                canvas2 = canvas;
                t3Var.f53329c.c(f12 + this.f53368u + AndroidUtilities.dp(f13), t3Var.f53327a, 1.0f, -1, canvas2);
                i11 = i11;
                i16 = i17;
                f11 = f13;
            }
        }
        int i18 = i11;
        if (!this.f53363p) {
            float f14 = this.A;
            float a10 = org.telegram.messenger.q.a(this.C.f28902c, AndroidUtilities.dp(30.0f), 2.0f, f10);
            float f15 = this.A + this.B;
            RectF rectF2 = this.D;
            rectF2.set(f10 - ((this.C.f28902c + AndroidUtilities.dp(30.0f)) / 2.0f), f14, a10, f15);
            Path path2 = this.E;
            path2.rewind();
            float f16 = this.B / 2.0f;
            path2.addRoundRect(rectF2, f16, f16, Path.Direction.CW);
            int m13 = org.telegram.ui.ActionBar.h6.m1(0.13f, -16777216);
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
            xh.m1 m1Var = this.f53357j;
            m1Var.setBounds(dp2, dp3, dp4, dp5);
            m1Var.f51462x = i18;
            m1Var.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void c(Canvas canvas) {
        if (this.f53363p) {
            return;
        }
        canvas.save();
        float a2 = this.I.a(0.0125f);
        RectF rectF = this.f53361n;
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float a10 = this.H.a(0.075f);
        RectF rectF2 = this.D;
        canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.E);
        b8 b8Var = this.G;
        b8Var.g(rectF2);
        b8Var.d();
        b8Var.a(canvas, org.telegram.ui.ActionBar.h6.m1(0.7f, -1));
        this.C.c(rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), 1.0f, -1, canvas);
        canvas.restore();
        View view = this.f53351b;
        if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).N();
        } else {
            view.invalidate();
        }
    }

    public final float d() {
        return this.Q.f16373e;
    }

    public final boolean e(float f7, float f10, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean contains = this.D.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        boolean contains2 = this.f53361n.contains(motionEvent.getX() - f7, motionEvent.getY() - f10);
        int action = motionEvent.getAction();
        bd bdVar = this.H;
        bd bdVar2 = this.I;
        if (action == 0) {
            if (contains2 && !contains) {
                z11 = true;
            } else {
                z11 = false;
            }
            bdVar2.c(z11);
            bdVar.c(contains);
        } else if (motionEvent.getAction() == 2) {
            if (bdVar.f24913i && !contains) {
                bdVar.c(false);
            } else if (bdVar2.f24913i && !contains2) {
                bdVar2.c(false);
            }
        } else if (motionEvent.getAction() == 1 && ((z10 = bdVar.f24913i) || bdVar2.f24913i)) {
            xh.f0 f0Var = this.R;
            if (f0Var != null) {
                if (z10) {
                    f0Var.run();
                }
            } else if (this.J) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.messenger.q.q(R.string.UniqueGiftNotFoundBurned, ad.a0(U), R.raw.fire_on, 36);
                }
            } else {
                s3 s3Var = new s3(this.f53351b.getContext(), this.f53350a, this.O.getDialogId(), this.f53352c, null);
                s3Var.k2(this.O, null);
                s3Var.show();
            }
            bdVar.c(false);
            bdVar2.c(false);
            return true;
        } else if (motionEvent.getAction() == 3 && (bdVar.f24913i || bdVar2.f24913i)) {
            bdVar.c(false);
            bdVar2.c(false);
            return true;
        }
        if (bdVar.f24913i || bdVar2.f24913i) {
            return true;
        }
        return false;
    }

    public final void f(org.telegram.messenger.MessageObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: yh.u3.f(org.telegram.messenger.MessageObject, boolean):void");
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
        int i11 = this.f53350a;
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
        if (this.f53363p) {
            this.f53365r = new n11(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer == null && !UserObject.isService(messageObject.getDialogId())) {
            if (messageObject.getDialogId() == UserConfig.getInstance(i11).getClientUserId()) {
                if (tL_starGiftUnique.crafted) {
                    this.f53365r = new n11(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
                } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
                    this.f53365r = new n11(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
                } else {
                    this.f53365r = new n11(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
                }
            } else {
                this.f53365r = new n11(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
            }
        } else {
            this.f53365r = new n11(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        }
        this.f53364q = (this.f53365r.j() / 2.0f) + dp2;
        float j3 = this.f53365r.j() + dp2 + AndroidUtilities.dp(3.0f);
        TLObject tLObject = null;
        if (this.f53363p) {
            f7 = 10.0f;
            f10 = 3.0f;
            this.f53367t = new n11(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f11 = 2.0f;
        } else {
            f7 = 10.0f;
            f10 = 3.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            f11 = 2.0f;
            this.f53367t = new n11(org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2), 12.0f, null);
        }
        this.f53366s = (this.f53367t.j() / f11) + j3;
        float j10 = this.f53367t.j() + j3;
        if (this.f53363p) {
            f12 = 14.0f;
        } else {
            f12 = 11.0f;
        }
        float dp3 = j10 + AndroidUtilities.dp(f12);
        ArrayList arrayList = this.f53369w;
        arrayList.clear();
        this.f53368u = 0.0f;
        this.v = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        xh.m0 m0Var = this.f53371y;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = m0Var.f51438c;
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
            this.f53372z = true;
            m0Var.c(tLObject);
            m0Var.f51446m = replaceAnimatedEmoji;
            m0Var.f51452s = -1;
            m0Var.b(((int) f13) - AndroidUtilities.dp(24.0f));
            if (!this.K) {
                StaticLayout staticLayout = m0Var.f51447n;
                if (staticLayout != null) {
                    i10 = staticLayout.getLineCount();
                } else {
                    i10 = 0;
                }
                if (i10 > 3) {
                    this.K = true;
                    StaticLayout staticLayout2 = m0Var.f51447n;
                    if (staticLayout2 != null) {
                        i12 = staticLayout2.getLineCount();
                    }
                    this.L = (int) ((Math.min(0.4f, (i12 - 3) * 0.1f) + 1.0f) * this.L);
                    g(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float dp4 = dp3 + AndroidUtilities.dp(4.0f);
            this.f53370x = dp4;
            dp3 = dp4 + m0Var.f51454u + AndroidUtilities.dp(f10);
        } else {
            this.f53372z = false;
            m0Var.c(null);
            m0Var.f51446m = null;
            m0Var.f51452s = -1;
            if (this.f53360m != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                t3 t3Var = new t3(dp3, LocaleController.getString(R.string.Gift2AttributeModel), this.f53360m.name);
                arrayList.add(t3Var);
                float f14 = f13 * 0.5f;
                n11 n11Var = t3Var.f53328b;
                n11Var.f28913p = f14;
                this.f53368u = Math.max(this.f53368u, n11Var.f28902c);
                n11 n11Var2 = t3Var.f53329c;
                n11Var2.f28913p = f14;
                this.v = Math.max(this.v, n11Var2.f28902c);
                dp3 += t3Var.a();
            }
            if (this.f53358k != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                t3 t3Var2 = new t3(dp3, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.f53358k.name);
                arrayList.add(t3Var2);
                float f15 = f13 * 0.5f;
                n11 n11Var3 = t3Var2.f53328b;
                n11Var3.f28913p = f15;
                this.f53368u = Math.max(this.f53368u, n11Var3.f28902c);
                n11 n11Var4 = t3Var2.f53329c;
                n11Var4.f28913p = f15;
                this.v = Math.max(this.v, n11Var4.f28902c);
                dp3 = t3Var2.a() + dp3;
            }
            if (this.f53359l != null) {
                if (!arrayList.isEmpty()) {
                    dp3 += AndroidUtilities.dp(6.0f);
                }
                t3 t3Var3 = new t3(dp3, LocaleController.getString(R.string.Gift2AttributeSymbol), this.f53359l.name);
                arrayList.add(t3Var3);
                float f16 = f13 * 0.5f;
                n11 n11Var5 = t3Var3.f53328b;
                n11Var5.f28913p = f16;
                this.f53368u = Math.max(this.f53368u, n11Var5.f28902c);
                n11 n11Var6 = t3Var3.f53329c;
                n11Var6.f28913p = f16;
                this.v = Math.max(this.v, n11Var6.f28902c);
                dp3 += t3Var3.a();
            }
        }
        float dp5 = dp3 + AndroidUtilities.dp(11.66f);
        if (!this.f53363p) {
            this.A = dp5;
            this.C = new n11(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
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
        n11 n11Var = new n11(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j3)), 14.0f, AndroidUtilities.bold());
        this.f53365r = n11Var;
        this.f53364q = (n11Var.j() / 2.0f) + dp;
        float j10 = this.f53365r.j() + dp + AndroidUtilities.dp(3.0f);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        String h = org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2);
        TLObject tLObject = null;
        n11 n11Var2 = new n11(h, 12.0f, null);
        this.f53367t = n11Var2;
        this.f53366s = (n11Var2.j() / 2.0f) + j10;
        float j11 = this.f53367t.j() + j10 + AndroidUtilities.dp(11.0f);
        this.f53369w.clear();
        this.f53368u = 0.0f;
        this.v = 0.0f;
        xh.m0 m0Var = this.f53371y;
        TextPaint textPaint = m0Var.f51438c;
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
            tLObject = MessagesController.getInstance(this.f53350a).getUserOrChat(j3);
        }
        this.f53372z = true;
        m0Var.c(tLObject);
        m0Var.f51446m = spanned;
        m0Var.f51452s = -1;
        m0Var.b(((int) f7) - AndroidUtilities.dp(24.0f));
        if (!this.K) {
            StaticLayout staticLayout = m0Var.f51447n;
            if (staticLayout != null) {
                i10 = staticLayout.getLineCount();
            } else {
                i10 = 0;
            }
            if (i10 > 3) {
                this.K = true;
                StaticLayout staticLayout2 = m0Var.f51447n;
                if (staticLayout2 != null) {
                    i11 = staticLayout2.getLineCount();
                }
                this.L = (int) ((Math.min(0.4f, (i11 - 3) * 0.1f) + 1.0f) * this.L);
                h(tL_starGiftUnique, j3, tL_textWithEntities, str);
                return;
            }
        }
        float dp2 = j11 + AndroidUtilities.dp(4.0f);
        this.f53370x = dp2;
        float dp3 = dp2 + m0Var.f51454u + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.A = dp3;
        this.C = new n11(str, 14.0f, AndroidUtilities.bold());
        float dp4 = AndroidUtilities.dp(30.0f);
        this.B = dp4;
        this.M = (int) (dp3 + dp4 + AndroidUtilities.dp(11.0f));
    }
}
