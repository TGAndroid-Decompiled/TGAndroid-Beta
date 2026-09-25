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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wq;
import org.telegram.ui.db1;
import org.telegram.ui.pm;
import yh.z5;
public final class p0 {
    public static int Z;
    public MessageObject A;
    public d6 B;
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
    public m0 S;
    public boolean T;
    public z5 U;
    public float f49404a;
    public boolean f49405b;
    public int f49406c;
    public int d;
    public float e;
    public float f49407f;
    public float f49408g;
    public float h;
    public boolean f49409i;
    public boolean f49410j;
    public boolean f49411k;
    public boolean f49412l;
    public int f49413m;
    public int f49415o;
    public int f49416p;
    public int f49417q;
    public int f49418r;
    public boolean f49419s;
    public final float f49420t;
    public int f49421u;
    public final org.telegram.ui.Cells.a0 f49425z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);
    public static final l0 f49401a0 = new Object();
    public static int f49402b0 = 1;
    public static final db1 f49403c0 = new db1(25);
    public final ArrayList v = new ArrayList();
    public final ArrayList f49422w = new ArrayList();
    public final HashMap f49423x = new HashMap();
    public final HashMap f49424y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int f49414n = UserConfig.selectedAccount;

    public p0(org.telegram.ui.Cells.a0 a0Var) {
        this.f49425z = a0Var;
        o(this.B);
        this.f49420t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
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
            return ((TLRPC.User) tLObject).f18483id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f18336id;
        }
        return 0L;
    }

    public static void o(d6 d6Var) {
        V.setColor(h6.v0(h6.f19157ie, d6Var));
        int v02 = h6.v0(h6.Sh, d6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(v02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        j9 j9Var;
        int i10;
        if (this.A == null) {
            return false;
        }
        HashMap hashMap = this.f49424y;
        hashMap.clear();
        int i11 = 0;
        while (true) {
            arrayList = this.f49422w;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((m0) arrayList.get(i11)).b();
            i11++;
        }
        arrayList.clear();
        hashMap.putAll(this.f49423x);
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i12 >= arrayList2.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList2.get(i12);
            String str = m0Var.f49381o;
            wq wqVar = m0Var.F;
            m0 m0Var2 = (m0) hashMap.get(str);
            if (m0Var2 != null && m0Var.f49365b != m0Var2.f49365b) {
                m0Var2 = null;
            }
            if (m0Var2 != null) {
                hashMap.remove(m0Var.f49381o);
                int i13 = m0Var.f49389x;
                int i14 = m0Var2.f49389x;
                if (i13 == i14 && m0Var.f49390y == m0Var2.f49390y && m0Var.A == m0Var2.A && m0Var.f49388w == m0Var2.f49388w && m0Var.f49382p == m0Var2.f49382p && m0Var.T == null && m0Var2.T == null) {
                    m0Var.f49367c = 0;
                    i12++;
                } else {
                    m0Var.d = i14;
                    m0Var.e = m0Var2.f49390y;
                    m0Var.f49371f = m0Var2.A;
                    m0Var.f49375i = m0Var2.N;
                    m0Var.f49373g = m0Var2.O;
                    m0Var.h = m0Var2.P;
                    m0Var.f49367c = 3;
                    int i15 = m0Var.f49388w;
                    int i16 = m0Var2.f49388w;
                    if (i15 != i16 && wqVar != null) {
                        wqVar.c(i16, false);
                        wqVar.c(m0Var.f49388w, true);
                    }
                    j9 j9Var2 = m0Var.T;
                    if (j9Var2 != null || m0Var2.T != null) {
                        if (j9Var2 == null) {
                            m0Var.p(new ArrayList());
                        }
                        if (m0Var2.T == null) {
                            m0Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = m0Var2.U;
                        ArrayList arrayList4 = m0Var.U;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLObject tLObject = (TLObject) arrayList3.get(i17);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i17);
                                if (tLObject != null && tLObject2 != null && k(tLObject) == k(tLObject2)) {
                                }
                            }
                        }
                        j9 j9Var3 = m0Var.T;
                        if (j9Var3 != null && (j9Var = m0Var2.T) != null) {
                            ValueAnimator valueAnimator = j9Var.f25342f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (j9Var3.f25357w) {
                                    j9Var3.f25357w = false;
                                    j9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.f49414n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = j9Var3.f25340b[i18].h;
                                j9Var3.l(i18, j9Var.f25340b[i18].h, i10);
                                i18++;
                            }
                            j9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                j9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            j9Var3.d = true;
                            j9Var3.b(true, false);
                        }
                    }
                }
            } else {
                m0Var.f49367c = 1;
            }
            z10 = true;
            i12++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((m0) arrayList.get(i20)).f49378l = ((m0) arrayList.get(i20)).f49380n;
                ((m0) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.f49409i) {
            float f7 = this.f49408g;
            if (f7 != this.f49406c || this.h != this.d) {
                this.f49410j = true;
                this.e = f7;
                this.f49407f = this.h;
                z10 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.f49417q) {
            this.f49411k = true;
            this.f49418r = i21;
            z10 = true;
        }
        int i22 = this.I;
        if (i22 != this.f49416p) {
            this.f49412l = true;
            this.J = i22;
            return true;
        }
        return z10;
    }

    public final void b(o0 o0Var) {
        int i10 = 0;
        if (o0Var.f49398g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(o0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.f49425z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f49414n).getReactionsMap().get(o0Var.f49397f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(o0Var, imageReceiver);
                return;
            }
        }
        if (!this.M || o0Var.f49398g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (o0Var.f(((m0) arrayList.get(i10)).f49384r)) {
                    ((m0) arrayList.get(i10)).q();
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
        if (this.f49419s || this.f49405b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Cells.a0 a0Var = this.f49425z;
        if (e2.u(a0Var)) {
            y3 -= a0Var.getPaddingTop();
            if (a0Var instanceof w0) {
                x10 -= ((w0) a0Var).f21746j0 / 2.0f;
            }
        }
        float f7 = x10 - this.f49406c;
        float f10 = y3 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (f7 > ((m0) arrayList.get(i10)).f49389x && f7 < ((m0) arrayList.get(i10)).f49389x + ((m0) arrayList.get(i10)).A && f10 > ((m0) arrayList.get(i10)).f49390y && f10 < ((m0) arrayList.get(i10)).f49390y + ((m0) arrayList.get(i10)).B) {
                    this.Q = motionEvent.getX();
                    this.R = y3;
                    this.S = (m0) arrayList.get(i10);
                    z5 z5Var = this.U;
                    if (z5Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(z5Var);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    z5 z5Var2 = new z5(7, this, this.S);
                    this.U = z5Var2;
                    AndroidUtilities.runOnUIThread(z5Var2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f11 = this.f49420t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f11) || Math.abs(y3 - this.R) > f11) {
                this.T = false;
                m0 m0Var = this.S;
                if (m0Var != null) {
                    m0Var.Y.c(false);
                }
                this.S = null;
                z5 z5Var3 = this.U;
                if (z5Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(z5Var3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            z5 z5Var4 = this.U;
            if (z5Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(z5Var4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.f49363a;
                float x11 = motionEvent.getX();
                if (e2.u(a0Var)) {
                    ((o4) a0Var).f(reactionCount, false, x11, y3);
                }
            }
            this.T = false;
            m0 m0Var2 = this.S;
            if (m0Var2 != null) {
                m0Var2.Y.c(false);
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
        boolean z11 = this.f49419s;
        ArrayList arrayList = this.f49422w;
        if (!z11 || !arrayList.isEmpty()) {
            float f12 = this.f49406c;
            float f13 = this.d;
            if (this.f49419s) {
                f12 = this.f49408g;
                f13 = this.h;
            } else if (this.f49410j) {
                float f14 = 1.0f - f7;
                f12 = (f12 * f7) + (this.e * f14);
                f13 = (f13 * f7) + (this.f49407f * f14);
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
                m0 m0Var = (m0) arrayList2.get(i11);
                if (this.C == null && num == null && this.D < 0.5f) {
                    m0Var.c();
                }
                if (!Integer.valueOf(m0Var.f49384r.hashCode()).equals(this.C) && (num == null || m0Var.f49384r.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f17 = m0Var.f49389x;
                    float f18 = m0Var.f49390y;
                    int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                    if (i12 != 0 && m0Var.f49367c == 3) {
                        float f19 = 1.0f - f7;
                        f17 = (f17 * f7) + (m0Var.d * f19);
                        f18 = (f18 * f7) + (m0Var.e * f19);
                    }
                    if (i12 != 0 && m0Var.f49367c == 1) {
                        float f20 = (f7 * 0.5f) + 0.5f;
                        canvas2.scale(f20, f20, (m0Var.A / 2.0f) + f15 + f17, (m0Var.B / 2.0f) + f16 + f18);
                        f10 = f7;
                    } else {
                        f10 = 1.0f;
                    }
                    float f21 = f17 + f15;
                    float f22 = f18 + f16;
                    if (m0Var.f49367c == 3) {
                        f11 = f7;
                    } else {
                        f11 = 1.0f;
                    }
                    if (num != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    m0Var.d(canvas2, f21, f22, f11, f10, z10, this.E, this.D);
                    canvas2.restore();
                }
                i11++;
            }
            while (i10 < arrayList.size()) {
                m0 m0Var2 = (m0) arrayList.get(i10);
                float f23 = 1.0f - f7;
                float f24 = (f23 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f24, f24, (m0Var2.A / 2.0f) + m0Var2.f49389x + f15, (m0Var2.B / 2.0f) + m0Var2.f49390y + f16);
                ((m0) arrayList.get(i10)).d(canvas2, m0Var2.f49389x + f15, m0Var2.f49390y + f16, 1.0f, f23, false, this.E, this.D);
                canvas.restore();
                i10++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(android.graphics.Canvas r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: zg.p0.e(android.graphics.Canvas, float):void");
    }

    public final void f(pm pmVar, Canvas canvas, int i10, Integer num) {
        int i11;
        if (!this.f49419s || !this.f49422w.isEmpty()) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.v;
                if (i12 < arrayList.size()) {
                    m0 m0Var = (m0) arrayList.get(i12);
                    if ((num == null || m0Var.f49384r.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(m0Var.f49386t);
                        float dp = AndroidUtilities.dp(140.0f);
                        float dp2 = AndroidUtilities.dp(14.0f);
                        org.telegram.ui.Cells.a0 a0Var = this.f49425z;
                        if (a0Var instanceof u1) {
                            i11 = ((u1) a0Var).getParentWidth();
                        } else {
                            i11 = AndroidUtilities.displaySize.x;
                        }
                        float clamp = Utilities.clamp(rectF.left - AndroidUtilities.dp(12.0f), (i11 - dp) - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                        float f7 = rectF.top - dp2;
                        float f10 = i10;
                        float f11 = f7 + f10;
                        RectF rectF2 = this.O;
                        rectF2.set(clamp, (f7 - dp) + f10, dp + clamp, f11);
                        float interpolation = rr.h.getInterpolation(this.D);
                        AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                        int i13 = m0Var.V;
                        o0 o0Var = m0Var.f49385s;
                        View view = m0Var.W;
                        if (m0Var.f49372f0 == null && m0Var.f49374g0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (m0Var.f49384r != null && !o0Var.f49394a) {
                                if (o0Var.f49397f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(o0Var.f49397f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, h6.f19004a7, 1.0f);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        m0Var.f49372f0 = imageReceiver;
                                        imageReceiver.setLayerNum(7);
                                        m0Var.f49372f0.onAttachedToWindow();
                                        m0Var.f49372f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                        m0Var.f49372f0.setAllowStartLottieAnimation(true);
                                        m0Var.f49372f0.setAllowStartAnimation(true);
                                        m0Var.f49372f0.setAutoRepeat(1);
                                        m0Var.f49372f0.setAllowDecodeSingleFrame(true);
                                        m0Var.f49372f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                                    }
                                } else if (o0Var.f49398g != 0) {
                                    q5 q5Var = new q5(24, i13, o0Var.f49398g);
                                    m0Var.f49374g0 = q5Var;
                                    q5Var.a(view);
                                }
                            }
                        }
                        this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver2 = m0Var.f49372f0;
                            if (imageReceiver2 != null) {
                                imageReceiver2.setImageCoords(rectF2);
                                m0Var.f49372f0.setAlpha(interpolation);
                                m0Var.f49372f0.draw(canvas);
                            } else {
                                q5 q5Var2 = m0Var.f49374g0;
                                if (q5Var2 != null) {
                                    q5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    m0Var.f49374g0.setAlpha((int) (interpolation * 255.0f));
                                    m0Var.f49374g0.draw(canvas);
                                }
                            }
                            pmVar.invalidate();
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
        if (this.f49412l) {
            return (this.f49416p * f7) + ((1.0f - f7) * this.J);
        }
        return this.f49416p;
    }

    public final float j(float f7) {
        if (this.f49411k) {
            return (this.f49417q * f7) + ((1.0f - f7) * this.f49418r);
        }
        return this.f49417q;
    }

    public final m0 l(String str) {
        boolean z10 = this.f49405b;
        HashMap hashMap = this.f49423x;
        if (z10) {
            m0 m0Var = (m0) hashMap.get(str + "_");
            if (m0Var != null) {
                return m0Var;
            }
        }
        return (m0) hashMap.get(str);
    }

    public final m0 m(o0 o0Var) {
        String l4;
        if (o0Var.f49394a) {
            l4 = "stars";
        } else {
            String str = o0Var.f49397f;
            if (str != null) {
                l4 = str;
            } else {
                l4 = Long.toString(o0Var.f49398g);
            }
        }
        return l(l4);
    }

    public final boolean n() {
        if (this.L) {
            if ((!this.f49419s || !this.f49422w.isEmpty()) && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
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
        this.f49415o = 0;
        this.f49417q = 0;
        this.f49413m = 0;
        this.f49416p = 0;
        if (this.f49419s) {
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
            m0 m0Var = (m0) arrayList.get(i13);
            boolean z10 = m0Var.f49365b;
            o6 o6Var = m0Var.G;
            wq wqVar = m0Var.F;
            if (z10) {
                m0Var.A = AndroidUtilities.dp(14.0f);
                m0Var.B = AndroidUtilities.dp(14.0f);
            } else if (m0Var.S) {
                m0Var.A = AndroidUtilities.dp(42.0f);
                m0Var.B = AndroidUtilities.dp(26.0f);
                if (m0Var.f49387u) {
                    m0Var.A = (int) (o6Var.d + AndroidUtilities.dp(8.0f) + m0Var.A);
                } else if (wqVar != null && m0Var.f49388w > 1) {
                    m0Var.A = org.telegram.messenger.f0.C(8.0f, (int) Math.ceil(wqVar.f30158m), m0Var.A);
                }
            } else {
                int dp2 = AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (m0Var.D != null) {
                    f10 = 6.0f;
                } else {
                    f10 = 4.0f;
                }
                m0Var.A = AndroidUtilities.dp(f10) + dp2;
                if (m0Var.T != null && m0Var.U.size() > 0) {
                    m0Var.U.size();
                    if (m0Var.U.size() > 1) {
                        i12 = m0Var.U.size() - 1;
                    } else {
                        i12 = 0;
                    }
                    m0Var.A = (int) ((AndroidUtilities.dp(20.0f) * i12 * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + m0Var.A);
                    m0Var.T.f25350o = AndroidUtilities.dp(26.0f);
                } else if (m0Var.f49387u) {
                    m0Var.A = (int) (o6Var.d + AndroidUtilities.dp(8.0f) + m0Var.A);
                } else if (((int) Math.ceil(wqVar.f30158m)) > 0) {
                    m0Var.A = org.telegram.messenger.f0.C(8.0f, (int) Math.ceil(wqVar.f30158m), m0Var.A);
                } else {
                    m0Var.A -= AndroidUtilities.dp(1.0f);
                }
                m0Var.B = AndroidUtilities.dp(26.0f);
            }
            if (m0Var.A + i14 > i10) {
                arrayList2.add(Integer.valueOf(i14));
                i16 = org.telegram.messenger.f0.C(4.0f, m0Var.B, i16);
                i17++;
                i14 = 0;
            }
            m0Var.f49389x = i14;
            m0Var.f49390y = i16;
            m0Var.f49391z = i17;
            i14 = org.telegram.messenger.f0.C(4.0f, m0Var.A, i14);
            if (i14 > i15) {
                i15 = i14;
            }
            i13++;
        }
        arrayList2.add(Integer.valueOf(i14));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i18 = ((m0) arrayList.get(0)).f49390y;
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((m0) arrayList.get(i20)).f49390y != i18) {
                    int i21 = i20 - 1;
                    int i22 = i10 - (((m0) arrayList.get(i21)).f49389x + ((m0) arrayList.get(i21)).A);
                    while (i19 < i20) {
                        ((m0) arrayList.get(i19)).f49389x += i22;
                        i19++;
                    }
                    i19 = i20;
                }
            }
            int size = arrayList.size() - 1;
            int i23 = i10 - (((m0) arrayList.get(size)).f49389x + ((m0) arrayList.get(size)).A);
            while (i19 <= size) {
                ((m0) arrayList.get(i19)).f49389x += i23;
                i19++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                m0 m0Var2 = (m0) arrayList.get(i24);
                int i25 = m0Var2.f49391z;
                if (i25 >= 0 && i25 < arrayList2.size()) {
                    f7 = ((Integer) arrayList2.get(m0Var2.f49391z)).intValue();
                } else {
                    f7 = 0.0f;
                }
                m0Var2.f49389x = (int) e2.A(i10, f7, 2.0f, m0Var2.f49389x);
            }
        }
        this.f49421u = i14;
        if (i11 != 5 && i11 != 1) {
            this.f49417q = i15;
        } else {
            this.f49417q = i10;
        }
        if (arrayList.size() == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(26.0f);
        }
        this.f49415o = i16 + dp;
        this.f49404a = 0.0f;
    }

    public final void q() {
        int i10 = 0;
        this.G = false;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((m0) arrayList.get(i10)).b();
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
        HashMap hashMap = this.f49423x;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                hashMap.put(((m0) arrayList.get(i10)).f49381o, (m0) arrayList.get(i10));
                i10++;
            } else {
                this.f49409i = !this.f49419s;
                this.f49408g = this.f49406c;
                this.h = this.d;
                this.F = this.f49417q;
                this.I = this.f49416p;
                return;
            }
        }
    }

    public final void s(org.telegram.messenger.MessageObject r20, boolean r21, boolean r22, org.telegram.ui.ActionBar.d6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: zg.p0.s(org.telegram.messenger.MessageObject, boolean, boolean, org.telegram.ui.ActionBar.d6):void");
    }
}
