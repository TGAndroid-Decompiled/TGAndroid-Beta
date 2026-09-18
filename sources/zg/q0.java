package zg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vq;
import org.telegram.ui.lb1;
import org.telegram.ui.tm;
public final class q0 {
    public static int Z;
    public MessageObject A;
    public f6 B;
    public Integer C;
    public float D;
    public boolean E;
    public int F;
    public boolean G;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public float Q;
    public float R;
    public n0 S;
    public boolean T;
    public v U;
    public float f49170a;
    public boolean f49171b;
    public int f49172c;
    public int d;
    public float e;
    public float f49173f;
    public float f49174g;
    public float h;
    public boolean f49175i;
    public boolean f49176j;
    public boolean f49177k;
    public boolean f49178l;
    public int f49179m;
    public int f49181o;
    public int f49182p;
    public int f49183q;
    public int f49184r;
    public boolean f49185s;
    public final float f49186t;
    public int f49187u;
    public final org.telegram.ui.Cells.a0 f49191z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);
    public static final m0 f49167a0 = new Object();
    public static int f49168b0 = 1;
    public static final lb1 f49169c0 = new lb1(25);
    public final ArrayList v = new ArrayList();
    public final ArrayList f49188w = new ArrayList();
    public final HashMap f49189x = new HashMap();
    public final HashMap f49190y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int f49180n = UserConfig.selectedAccount;

    public q0(org.telegram.ui.Cells.a0 a0Var) {
        this.f49191z = a0Var;
        o(this.B);
        this.f49186t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
    }

    public static boolean g(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || !(reaction2 instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id) {
            return false;
        }
        return true;
    }

    public static void h(RectF rectF, RectF rectF2, Path path) {
        float f7;
        path.rewind();
        float f10 = rectF.left;
        rectF2.set(f10, rectF.top, AndroidUtilities.dp(12.0f) + f10, rectF.top + AndroidUtilities.dp(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - AndroidUtilities.dp(12.0f), rectF.left + AndroidUtilities.dp(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        if (rectF.height() > AndroidUtilities.dp(26.0f)) {
            f7 = 1.4f;
        } else {
            f7 = 0.0f;
        }
        float dpf2 = rectF.right - AndroidUtilities.dpf2(9.09f);
        float dpf22 = dpf2 - AndroidUtilities.dpf2(0.056f);
        float dpf23 = AndroidUtilities.dpf2(1.22f) + dpf2;
        float dpf24 = AndroidUtilities.dpf2(3.07f) + dpf2;
        float dpf25 = AndroidUtilities.dpf2(2.406f) + dpf2;
        float dpf26 = AndroidUtilities.dpf2(8.27f + f7) + dpf2;
        float dpf27 = AndroidUtilities.dpf2(8.923f + f7) + dpf2;
        float dpf28 = AndroidUtilities.dpf2(1.753f) + rectF.top;
        float dpf29 = rectF.bottom - AndroidUtilities.dpf2(1.753f);
        float dpf210 = AndroidUtilities.dpf2(0.663f) + rectF.top;
        float dpf211 = rectF.bottom - AndroidUtilities.dpf2(0.663f);
        float f11 = 10.263f + f7;
        float dpf212 = AndroidUtilities.dpf2(f11) + rectF.top;
        float dpf213 = rectF.bottom - AndroidUtilities.dpf2(f11);
        float f12 = f7 + 11.333f;
        float dpf214 = AndroidUtilities.dpf2(f12) + rectF.top;
        float dpf215 = rectF.bottom - AndroidUtilities.dpf2(f12);
        path.lineTo(dpf22, rectF.bottom);
        path.cubicTo(dpf23, rectF.bottom, dpf25, dpf211, dpf24, dpf29);
        path.lineTo(dpf26, dpf213);
        path.cubicTo(dpf27, dpf215, dpf27, dpf214, dpf26, dpf212);
        path.lineTo(dpf24, dpf28);
        float f13 = rectF.top;
        path.cubicTo(dpf25, dpf210, dpf23, f13, dpf22, f13);
        path.close();
    }

    public static long k(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).f18268id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f18121id;
        }
        return 0L;
    }

    public static void o(f6 f6Var) {
        V.setColor(j6.v0(j6.f18961ie, f6Var));
        int v02 = j6.v0(j6.Sh, f6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(v02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        h9 h9Var;
        int i10;
        if (this.A == null) {
            return false;
        }
        HashMap hashMap = this.f49190y;
        hashMap.clear();
        int i11 = 0;
        while (true) {
            arrayList = this.f49188w;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((n0) arrayList.get(i11)).b();
            i11++;
        }
        arrayList.clear();
        hashMap.putAll(this.f49189x);
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i12 >= arrayList2.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList2.get(i12);
            String str = n0Var.f49138o;
            vq vqVar = n0Var.F;
            n0 n0Var2 = (n0) hashMap.get(str);
            if (n0Var2 != null && n0Var.f49122b != n0Var2.f49122b) {
                n0Var2 = null;
            }
            if (n0Var2 != null) {
                hashMap.remove(n0Var.f49138o);
                int i13 = n0Var.f49146x;
                int i14 = n0Var2.f49146x;
                if (i13 == i14 && n0Var.f49147y == n0Var2.f49147y && n0Var.A == n0Var2.A && n0Var.f49145w == n0Var2.f49145w && n0Var.f49139p == n0Var2.f49139p && n0Var.T == null && n0Var2.T == null) {
                    n0Var.f49124c = 0;
                    i12++;
                } else {
                    n0Var.d = i14;
                    n0Var.e = n0Var2.f49147y;
                    n0Var.f49128f = n0Var2.A;
                    n0Var.f49132i = n0Var2.N;
                    n0Var.f49130g = n0Var2.O;
                    n0Var.h = n0Var2.P;
                    n0Var.f49124c = 3;
                    int i15 = n0Var.f49145w;
                    int i16 = n0Var2.f49145w;
                    if (i15 != i16 && vqVar != null) {
                        vqVar.c(i16, false);
                        vqVar.c(n0Var.f49145w, true);
                    }
                    h9 h9Var2 = n0Var.T;
                    if (h9Var2 != null || n0Var2.T != null) {
                        if (h9Var2 == null) {
                            n0Var.p(new ArrayList());
                        }
                        if (n0Var2.T == null) {
                            n0Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = n0Var2.U;
                        ArrayList arrayList4 = n0Var.U;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLObject tLObject = (TLObject) arrayList3.get(i17);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i17);
                                if (tLObject != null && tLObject2 != null && k(tLObject) == k(tLObject2)) {
                                }
                            }
                        }
                        h9 h9Var3 = n0Var.T;
                        if (h9Var3 != null && (h9Var = n0Var2.T) != null) {
                            ValueAnimator valueAnimator = h9Var.f24585f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (h9Var3.f24600w) {
                                    h9Var3.f24600w = false;
                                    h9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.f49180n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = h9Var3.f24583b[i18].h;
                                h9Var3.l(i18, h9Var.f24583b[i18].h, i10);
                                i18++;
                            }
                            h9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                h9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            h9Var3.d = true;
                            h9Var3.b(true, false);
                        }
                    }
                }
            } else {
                n0Var.f49124c = 1;
            }
            z10 = true;
            i12++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((n0) arrayList.get(i20)).f49135l = ((n0) arrayList.get(i20)).f49137n;
                ((n0) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.f49175i) {
            float f7 = this.f49174g;
            if (f7 != this.f49172c || this.h != this.d) {
                this.f49176j = true;
                this.e = f7;
                this.f49173f = this.h;
                z10 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.f49183q) {
            this.f49177k = true;
            this.f49184r = i21;
            z10 = true;
        }
        int i22 = this.I;
        if (i22 != this.f49182p) {
            this.f49178l = true;
            this.J = i22;
            return true;
        }
        return z10;
    }

    public final void b(p0 p0Var) {
        int i10 = 0;
        if (p0Var.f49156g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(p0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.f49191z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f49180n).getReactionsMap().get(p0Var.f49155f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(p0Var, imageReceiver);
                return;
            }
        }
        if (!this.M || p0Var.f49156g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (p0Var.f(((n0) arrayList.get(i10)).f49141r)) {
                    ((n0) arrayList.get(i10)).q();
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        MessageObject messageObject;
        TLRPC.Message message;
        int i10 = 0;
        if (this.f49185s || this.f49171b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Cells.a0 a0Var = this.f49191z;
        if (e2.u(a0Var)) {
            y3 -= a0Var.getPaddingTop();
            if (a0Var instanceof w0) {
                x10 -= ((w0) a0Var).f21537j0 / 2.0f;
            }
        }
        float f7 = x10 - this.f49172c;
        float f10 = y3 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (f7 > ((n0) arrayList.get(i10)).f49146x && f7 < ((n0) arrayList.get(i10)).f49146x + ((n0) arrayList.get(i10)).A && f10 > ((n0) arrayList.get(i10)).f49147y && f10 < ((n0) arrayList.get(i10)).f49147y + ((n0) arrayList.get(i10)).B) {
                    this.Q = motionEvent.getX();
                    this.R = y3;
                    this.S = (n0) arrayList.get(i10);
                    v vVar = this.U;
                    if (vVar != null) {
                        AndroidUtilities.cancelRunOnUIThread(vVar);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    v vVar2 = new v(2, this, this.S);
                    this.U = vVar2;
                    AndroidUtilities.runOnUIThread(vVar2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f11 = this.f49186t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f11) || Math.abs(y3 - this.R) > f11) {
                this.T = false;
                n0 n0Var = this.S;
                if (n0Var != null) {
                    n0Var.Y.c(false);
                }
                this.S = null;
                v vVar3 = this.U;
                if (vVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(vVar3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            v vVar4 = this.U;
            if (vVar4 != null) {
                AndroidUtilities.cancelRunOnUIThread(vVar4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.f49120a;
                float x11 = motionEvent.getX();
                if (e2.u(a0Var)) {
                    ((n4) a0Var).f(reactionCount, false, x11, y3);
                }
            }
            this.T = false;
            n0 n0Var2 = this.S;
            if (n0Var2 != null) {
                n0Var2.Y.c(false);
            }
            this.S = null;
        }
        return this.T;
    }

    public final void d(Canvas canvas, float f7, Integer num) {
        float f10;
        float f11;
        boolean z10;
        Canvas canvas2 = canvas;
        boolean z11 = this.f49185s;
        ArrayList arrayList = this.f49188w;
        if (!z11 || !arrayList.isEmpty()) {
            float f12 = this.f49172c;
            float f13 = this.d;
            if (this.f49185s) {
                f12 = this.f49174g;
                f13 = this.h;
            } else if (this.f49176j) {
                float f14 = 1.0f - f7;
                f12 = (f12 * f7) + (this.e * f14);
                f13 = (f13 * f7) + (this.f49173f * f14);
            }
            float f15 = f12;
            float f16 = f13;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = this.v;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                n0 n0Var = (n0) arrayList2.get(i11);
                if (this.C == null && num == null && this.D < 0.5f) {
                    n0Var.c();
                }
                if (!Integer.valueOf(n0Var.f49141r.hashCode()).equals(this.C) && (num == null || n0Var.f49141r.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f17 = n0Var.f49146x;
                    float f18 = n0Var.f49147y;
                    int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                    if (i12 != 0 && n0Var.f49124c == 3) {
                        float f19 = 1.0f - f7;
                        f17 = (f17 * f7) + (n0Var.d * f19);
                        f18 = (f18 * f7) + (n0Var.e * f19);
                    }
                    if (i12 != 0 && n0Var.f49124c == 1) {
                        float f20 = (f7 * 0.5f) + 0.5f;
                        canvas2.scale(f20, f20, (n0Var.A / 2.0f) + f15 + f17, (n0Var.B / 2.0f) + f16 + f18);
                        f10 = f7;
                    } else {
                        f10 = 1.0f;
                    }
                    float f21 = f17 + f15;
                    float f22 = f18 + f16;
                    if (n0Var.f49124c == 3) {
                        f11 = f7;
                    } else {
                        f11 = 1.0f;
                    }
                    if (num != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    n0Var.d(canvas2, f21, f22, f11, f10, z10, this.E, this.D);
                    canvas2.restore();
                }
                i11++;
            }
            while (i10 < arrayList.size()) {
                n0 n0Var2 = (n0) arrayList.get(i10);
                float f23 = 1.0f - f7;
                float f24 = (f23 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f24, f24, (n0Var2.A / 2.0f) + n0Var2.f49146x + f15, (n0Var2.B / 2.0f) + n0Var2.f49147y + f16);
                ((n0) arrayList.get(i10)).d(canvas2, n0Var2.f49146x + f15, n0Var2.f49147y + f16, 1.0f, f23, false, this.E, this.D);
                canvas.restore();
                i10++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(android.graphics.Canvas r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: zg.q0.e(android.graphics.Canvas, float):void");
    }

    public final void f(tm tmVar, Canvas canvas, int i10, Integer num) {
        int i11;
        if (!this.f49185s || !this.f49188w.isEmpty()) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.v;
                if (i12 < arrayList.size()) {
                    n0 n0Var = (n0) arrayList.get(i12);
                    if ((num == null || n0Var.f49141r.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(n0Var.f49143t);
                        float dp = AndroidUtilities.dp(140.0f);
                        float dp2 = AndroidUtilities.dp(14.0f);
                        org.telegram.ui.Cells.a0 a0Var = this.f49191z;
                        if (a0Var instanceof t1) {
                            i11 = ((t1) a0Var).getParentWidth();
                        } else {
                            i11 = AndroidUtilities.displaySize.x;
                        }
                        float clamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), (i11 - dp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                        float f7 = rectF.top - dp2;
                        float f10 = i10;
                        float f11 = f7 + f10;
                        RectF rectF2 = this.O;
                        rectF2.set(clamp, (f7 - dp) + f10, dp + clamp, f11);
                        float interpolation = qr.h.getInterpolation(this.D);
                        AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                        int i13 = n0Var.V;
                        p0 p0Var = n0Var.f49142s;
                        View view = n0Var.W;
                        if (n0Var.f49129f0 == null && n0Var.f49131g0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (n0Var.f49141r != null && !p0Var.f49152a) {
                                if (p0Var.f49155f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(p0Var.f49155f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, j6.f18807a7, 1.0f);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        n0Var.f49129f0 = imageReceiver;
                                        imageReceiver.setLayerNum(7);
                                        n0Var.f49129f0.onAttachedToWindow();
                                        n0Var.f49129f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                        n0Var.f49129f0.setAllowStartLottieAnimation(true);
                                        n0Var.f49129f0.setAllowStartAnimation(true);
                                        n0Var.f49129f0.setAutoRepeat(1);
                                        n0Var.f49129f0.setAllowDecodeSingleFrame(true);
                                        n0Var.f49129f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                                    }
                                } else if (p0Var.f49156g != 0) {
                                    o5 o5Var = new o5(24, i13, p0Var.f49156g);
                                    n0Var.f49131g0 = o5Var;
                                    o5Var.a(view);
                                }
                            }
                        }
                        this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver2 = n0Var.f49129f0;
                            if (imageReceiver2 != null) {
                                imageReceiver2.setImageCoords(rectF2);
                                n0Var.f49129f0.setAlpha(interpolation);
                                n0Var.f49129f0.draw(canvas);
                            } else {
                                o5 o5Var2 = n0Var.f49131g0;
                                if (o5Var2 != null) {
                                    o5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    n0Var.f49131g0.setAlpha((int) (interpolation * 255.0f));
                                    n0Var.f49131g0.draw(canvas);
                                }
                            }
                            tmVar.invalidate();
                        }
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }
    }

    public final float i(float f7) {
        if (this.f49178l) {
            return (this.f49182p * f7) + ((1.0f - f7) * this.J);
        }
        return this.f49182p;
    }

    public final float j(float f7) {
        if (this.f49177k) {
            return (this.f49183q * f7) + ((1.0f - f7) * this.f49184r);
        }
        return this.f49183q;
    }

    public final n0 l(String str) {
        boolean z10 = this.f49171b;
        HashMap hashMap = this.f49189x;
        if (z10) {
            n0 n0Var = (n0) hashMap.get(str + "_");
            if (n0Var != null) {
                return n0Var;
            }
        }
        return (n0) hashMap.get(str);
    }

    public final n0 m(p0 p0Var) {
        String l4;
        if (p0Var.f49152a) {
            l4 = "stars";
        } else {
            String str = p0Var.f49155f;
            if (str != null) {
                l4 = str;
            } else {
                l4 = Long.toString(p0Var.f49156g);
            }
        }
        return l(l4);
    }

    public final boolean n() {
        if (this.L) {
            if ((!this.f49185s || !this.f49188w.isEmpty()) && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p(int i10, int i11) {
        ArrayList arrayList;
        float f7;
        int dp;
        float f10;
        int i12;
        this.f49181o = 0;
        this.f49183q = 0;
        this.f49179m = 0;
        this.f49182p = 0;
        if (this.f49185s) {
            return;
        }
        ArrayList arrayList2 = this.N;
        arrayList2.clear();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            arrayList = this.v;
            if (i13 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i13);
            boolean z10 = n0Var.f49122b;
            m6 m6Var = n0Var.G;
            vq vqVar = n0Var.F;
            if (z10) {
                n0Var.A = AndroidUtilities.dp(14.0f);
                n0Var.B = AndroidUtilities.dp(14.0f);
            } else if (n0Var.S) {
                n0Var.A = AndroidUtilities.dp(42.0f);
                n0Var.B = AndroidUtilities.dp(26.0f);
                if (n0Var.f49144u) {
                    n0Var.A = (int) (m6Var.d + AndroidUtilities.dp(8.0f) + n0Var.A);
                } else if (vqVar != null && n0Var.f49145w > 1) {
                    n0Var.A = w1.C(8.0f, (int) Math.ceil(vqVar.f29380m), n0Var.A);
                }
            } else {
                int dp2 = AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (n0Var.D != null) {
                    f10 = 6.0f;
                } else {
                    f10 = 4.0f;
                }
                n0Var.A = AndroidUtilities.dp(f10) + dp2;
                if (n0Var.T != null && n0Var.U.size() > 0) {
                    n0Var.U.size();
                    if (n0Var.U.size() > 1) {
                        i12 = n0Var.U.size() - 1;
                    } else {
                        i12 = 0;
                    }
                    n0Var.A = (int) ((AndroidUtilities.dp(20.0f) * i12 * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + n0Var.A);
                    n0Var.T.f24593o = AndroidUtilities.dp(26.0f);
                } else if (n0Var.f49144u) {
                    n0Var.A = (int) (m6Var.d + AndroidUtilities.dp(8.0f) + n0Var.A);
                } else if (((int) Math.ceil(vqVar.f29380m)) > 0) {
                    n0Var.A = w1.C(8.0f, (int) Math.ceil(vqVar.f29380m), n0Var.A);
                } else {
                    n0Var.A -= AndroidUtilities.dp(1.0f);
                }
                n0Var.B = AndroidUtilities.dp(26.0f);
            }
            if (n0Var.A + i14 > i10) {
                arrayList2.add(Integer.valueOf(i14));
                i16 = w1.C(4.0f, n0Var.B, i16);
                i17++;
                i14 = 0;
            }
            n0Var.f49146x = i14;
            n0Var.f49147y = i16;
            n0Var.f49148z = i17;
            i14 = w1.C(4.0f, n0Var.A, i14);
            if (i14 > i15) {
                i15 = i14;
            }
            i13++;
        }
        arrayList2.add(Integer.valueOf(i14));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i18 = ((n0) arrayList.get(0)).f49147y;
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((n0) arrayList.get(i20)).f49147y != i18) {
                    int i21 = i20 - 1;
                    int i22 = i10 - (((n0) arrayList.get(i21)).f49146x + ((n0) arrayList.get(i21)).A);
                    while (i19 < i20) {
                        ((n0) arrayList.get(i19)).f49146x += i22;
                        i19++;
                    }
                    i19 = i20;
                }
            }
            int size = arrayList.size() - 1;
            int i23 = i10 - (((n0) arrayList.get(size)).f49146x + ((n0) arrayList.get(size)).A);
            while (i19 <= size) {
                ((n0) arrayList.get(i19)).f49146x += i23;
                i19++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                n0 n0Var2 = (n0) arrayList.get(i24);
                int i25 = n0Var2.f49148z;
                if (i25 >= 0 && i25 < arrayList2.size()) {
                    f7 = ((Integer) arrayList2.get(n0Var2.f49148z)).intValue();
                } else {
                    f7 = 0.0f;
                }
                n0Var2.f49146x = (int) e2.A(i10, f7, 2.0f, n0Var2.f49146x);
            }
        }
        this.f49187u = i14;
        if (i11 != 5 && i11 != 1) {
            this.f49183q = i15;
        } else {
            this.f49183q = i10;
        }
        if (arrayList.size() == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(26.0f);
        }
        this.f49181o = i16 + dp;
        this.f49170a = 0.0f;
    }

    public final void q() {
        int i10 = 0;
        this.G = false;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((n0) arrayList.get(i10)).b();
            i10++;
        }
        HashMap hashMap = this.H;
        if (!hashMap.isEmpty()) {
            for (ImageReceiver imageReceiver : hashMap.values()) {
                imageReceiver.onDetachedFromWindow();
            }
        }
        hashMap.clear();
    }

    public final void r() {
        HashMap hashMap = this.f49189x;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                hashMap.put(((n0) arrayList.get(i10)).f49138o, (n0) arrayList.get(i10));
                i10++;
            } else {
                this.f49175i = !this.f49185s;
                this.f49174g = this.f49172c;
                this.h = this.d;
                this.F = this.f49183q;
                this.I = this.f49182p;
                return;
            }
        }
    }

    public final void s(org.telegram.messenger.MessageObject r20, boolean r21, boolean r22, org.telegram.ui.ActionBar.f6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: zg.q0.s(org.telegram.messenger.MessageObject, boolean, boolean, org.telegram.ui.ActionBar.f6):void");
    }
}
