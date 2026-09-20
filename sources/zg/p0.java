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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vq;
import org.telegram.ui.mb1;
import org.telegram.ui.rm;
import yh.s5;
public final class p0 {
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
    public m0 S;
    public boolean T;
    public s5 U;
    public float f49430a;
    public boolean f49431b;
    public int f49432c;
    public int d;
    public float e;
    public float f49433f;
    public float f49434g;
    public float h;
    public boolean f49435i;
    public boolean f49436j;
    public boolean f49437k;
    public boolean f49438l;
    public int f49439m;
    public int f49441o;
    public int f49442p;
    public int f49443q;
    public int f49444r;
    public boolean f49445s;
    public final float f49446t;
    public int f49447u;
    public final org.telegram.ui.Cells.a0 f49451z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);
    public static final l0 f49427a0 = new Object();
    public static int f49428b0 = 1;
    public static final mb1 f49429c0 = new mb1(25);
    public final ArrayList v = new ArrayList();
    public final ArrayList f49448w = new ArrayList();
    public final HashMap f49449x = new HashMap();
    public final HashMap f49450y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int f49440n = UserConfig.selectedAccount;

    public p0(org.telegram.ui.Cells.a0 a0Var) {
        this.f49451z = a0Var;
        o(this.B);
        this.f49446t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
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
            return ((TLRPC.User) tLObject).f18475id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f18328id;
        }
        return 0L;
    }

    public static void o(f6 f6Var) {
        V.setColor(j6.v0(j6.f19192ie, f6Var));
        int v02 = j6.v0(j6.Sh, f6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(v02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        i9 i9Var;
        int i10;
        if (this.A == null) {
            return false;
        }
        HashMap hashMap = this.f49450y;
        hashMap.clear();
        int i11 = 0;
        while (true) {
            arrayList = this.f49448w;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((m0) arrayList.get(i11)).b();
            i11++;
        }
        arrayList.clear();
        hashMap.putAll(this.f49449x);
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i12 >= arrayList2.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList2.get(i12);
            String str = m0Var.f49407o;
            vq vqVar = m0Var.F;
            m0 m0Var2 = (m0) hashMap.get(str);
            if (m0Var2 != null && m0Var.f49391b != m0Var2.f49391b) {
                m0Var2 = null;
            }
            if (m0Var2 != null) {
                hashMap.remove(m0Var.f49407o);
                int i13 = m0Var.f49415x;
                int i14 = m0Var2.f49415x;
                if (i13 == i14 && m0Var.f49416y == m0Var2.f49416y && m0Var.A == m0Var2.A && m0Var.f49414w == m0Var2.f49414w && m0Var.f49408p == m0Var2.f49408p && m0Var.T == null && m0Var2.T == null) {
                    m0Var.f49393c = 0;
                    i12++;
                } else {
                    m0Var.d = i14;
                    m0Var.e = m0Var2.f49416y;
                    m0Var.f49397f = m0Var2.A;
                    m0Var.f49401i = m0Var2.N;
                    m0Var.f49399g = m0Var2.O;
                    m0Var.h = m0Var2.P;
                    m0Var.f49393c = 3;
                    int i15 = m0Var.f49414w;
                    int i16 = m0Var2.f49414w;
                    if (i15 != i16 && vqVar != null) {
                        vqVar.c(i16, false);
                        vqVar.c(m0Var.f49414w, true);
                    }
                    i9 i9Var2 = m0Var.T;
                    if (i9Var2 != null || m0Var2.T != null) {
                        if (i9Var2 == null) {
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
                        i9 i9Var3 = m0Var.T;
                        if (i9Var3 != null && (i9Var = m0Var2.T) != null) {
                            ValueAnimator valueAnimator = i9Var.f24949f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (i9Var3.f24964w) {
                                    i9Var3.f24964w = false;
                                    i9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.f49440n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = i9Var3.f24947b[i18].h;
                                i9Var3.l(i18, i9Var.f24947b[i18].h, i10);
                                i18++;
                            }
                            i9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                i9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            i9Var3.d = true;
                            i9Var3.b(true, false);
                        }
                    }
                }
            } else {
                m0Var.f49393c = 1;
            }
            z10 = true;
            i12++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((m0) arrayList.get(i20)).f49404l = ((m0) arrayList.get(i20)).f49406n;
                ((m0) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.f49435i) {
            float f7 = this.f49434g;
            if (f7 != this.f49432c || this.h != this.d) {
                this.f49436j = true;
                this.e = f7;
                this.f49433f = this.h;
                z10 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.f49443q) {
            this.f49437k = true;
            this.f49444r = i21;
            z10 = true;
        }
        int i22 = this.I;
        if (i22 != this.f49442p) {
            this.f49438l = true;
            this.J = i22;
            return true;
        }
        return z10;
    }

    public final void b(o0 o0Var) {
        int i10 = 0;
        if (o0Var.f49424g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(o0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.f49451z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f49440n).getReactionsMap().get(o0Var.f49423f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(o0Var, imageReceiver);
                return;
            }
        }
        if (!this.M || o0Var.f49424g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (o0Var.f(((m0) arrayList.get(i10)).f49410r)) {
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
        if (this.f49445s || this.f49431b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Cells.a0 a0Var = this.f49451z;
        if (e2.u(a0Var)) {
            y3 -= a0Var.getPaddingTop();
            if (a0Var instanceof w0) {
                x10 -= ((w0) a0Var).f21742j0 / 2.0f;
            }
        }
        float f7 = x10 - this.f49432c;
        float f10 = y3 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (f7 > ((m0) arrayList.get(i10)).f49415x && f7 < ((m0) arrayList.get(i10)).f49415x + ((m0) arrayList.get(i10)).A && f10 > ((m0) arrayList.get(i10)).f49416y && f10 < ((m0) arrayList.get(i10)).f49416y + ((m0) arrayList.get(i10)).B) {
                    this.Q = motionEvent.getX();
                    this.R = y3;
                    this.S = (m0) arrayList.get(i10);
                    s5 s5Var = this.U;
                    if (s5Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(s5Var);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    s5 s5Var2 = new s5(8, this, this.S);
                    this.U = s5Var2;
                    AndroidUtilities.runOnUIThread(s5Var2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f11 = this.f49446t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f11) || Math.abs(y3 - this.R) > f11) {
                this.T = false;
                m0 m0Var = this.S;
                if (m0Var != null) {
                    m0Var.Y.c(false);
                }
                this.S = null;
                s5 s5Var3 = this.U;
                if (s5Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(s5Var3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            s5 s5Var4 = this.U;
            if (s5Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(s5Var4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.f49389a;
                float x11 = motionEvent.getX();
                if (e2.u(a0Var)) {
                    ((p4) a0Var).f(reactionCount, false, x11, y3);
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
        boolean z11 = this.f49445s;
        ArrayList arrayList = this.f49448w;
        if (!z11 || !arrayList.isEmpty()) {
            float f12 = this.f49432c;
            float f13 = this.d;
            if (this.f49445s) {
                f12 = this.f49434g;
                f13 = this.h;
            } else if (this.f49436j) {
                float f14 = 1.0f - f7;
                f12 = (f12 * f7) + (this.e * f14);
                f13 = (f13 * f7) + (this.f49433f * f14);
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
                if (!Integer.valueOf(m0Var.f49410r.hashCode()).equals(this.C) && (num == null || m0Var.f49410r.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f17 = m0Var.f49415x;
                    float f18 = m0Var.f49416y;
                    int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                    if (i12 != 0 && m0Var.f49393c == 3) {
                        float f19 = 1.0f - f7;
                        f17 = (f17 * f7) + (m0Var.d * f19);
                        f18 = (f18 * f7) + (m0Var.e * f19);
                    }
                    if (i12 != 0 && m0Var.f49393c == 1) {
                        float f20 = (f7 * 0.5f) + 0.5f;
                        canvas2.scale(f20, f20, (m0Var.A / 2.0f) + f15 + f17, (m0Var.B / 2.0f) + f16 + f18);
                        f10 = f7;
                    } else {
                        f10 = 1.0f;
                    }
                    float f21 = f17 + f15;
                    float f22 = f18 + f16;
                    if (m0Var.f49393c == 3) {
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
                canvas2.scale(f24, f24, (m0Var2.A / 2.0f) + m0Var2.f49415x + f15, (m0Var2.B / 2.0f) + m0Var2.f49416y + f16);
                ((m0) arrayList.get(i10)).d(canvas2, m0Var2.f49415x + f15, m0Var2.f49416y + f16, 1.0f, f23, false, this.E, this.D);
                canvas.restore();
                i10++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(android.graphics.Canvas r18, float r19) {
        throw new UnsupportedOperationException("Method not decompiled: zg.p0.e(android.graphics.Canvas, float):void");
    }

    public final void f(rm rmVar, Canvas canvas, int i10, Integer num) {
        int i11;
        if (!this.f49445s || !this.f49448w.isEmpty()) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.v;
                if (i12 < arrayList.size()) {
                    m0 m0Var = (m0) arrayList.get(i12);
                    if ((num == null || m0Var.f49410r.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(m0Var.f49412t);
                        float dp = AndroidUtilities.dp(140.0f);
                        float dp2 = AndroidUtilities.dp(14.0f);
                        org.telegram.ui.Cells.a0 a0Var = this.f49451z;
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
                        float interpolation = qr.h.getInterpolation(this.D);
                        AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                        int i13 = m0Var.V;
                        o0 o0Var = m0Var.f49411s;
                        View view = m0Var.W;
                        if (m0Var.f49398f0 == null && m0Var.f49400g0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (m0Var.f49410r != null && !o0Var.f49420a) {
                                if (o0Var.f49423f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(o0Var.f49423f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, j6.f19038a7, 1.0f);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        m0Var.f49398f0 = imageReceiver;
                                        imageReceiver.setLayerNum(7);
                                        m0Var.f49398f0.onAttachedToWindow();
                                        m0Var.f49398f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                        m0Var.f49398f0.setAllowStartLottieAnimation(true);
                                        m0Var.f49398f0.setAllowStartAnimation(true);
                                        m0Var.f49398f0.setAutoRepeat(1);
                                        m0Var.f49398f0.setAllowDecodeSingleFrame(true);
                                        m0Var.f49398f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                                    }
                                } else if (o0Var.f49424g != 0) {
                                    p5 p5Var = new p5(24, i13, o0Var.f49424g);
                                    m0Var.f49400g0 = p5Var;
                                    p5Var.a(view);
                                }
                            }
                        }
                        this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver2 = m0Var.f49398f0;
                            if (imageReceiver2 != null) {
                                imageReceiver2.setImageCoords(rectF2);
                                m0Var.f49398f0.setAlpha(interpolation);
                                m0Var.f49398f0.draw(canvas);
                            } else {
                                p5 p5Var2 = m0Var.f49400g0;
                                if (p5Var2 != null) {
                                    p5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    m0Var.f49400g0.setAlpha((int) (interpolation * 255.0f));
                                    m0Var.f49400g0.draw(canvas);
                                }
                            }
                            rmVar.invalidate();
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
        if (this.f49438l) {
            return (this.f49442p * f7) + ((1.0f - f7) * this.J);
        }
        return this.f49442p;
    }

    public final float j(float f7) {
        if (this.f49437k) {
            return (this.f49443q * f7) + ((1.0f - f7) * this.f49444r);
        }
        return this.f49443q;
    }

    public final m0 l(String str) {
        boolean z10 = this.f49431b;
        HashMap hashMap = this.f49449x;
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
        if (o0Var.f49420a) {
            l4 = "stars";
        } else {
            String str = o0Var.f49423f;
            if (str != null) {
                l4 = str;
            } else {
                l4 = Long.toString(o0Var.f49424g);
            }
        }
        return l(l4);
    }

    public final boolean n() {
        if (this.L) {
            if ((!this.f49445s || !this.f49448w.isEmpty()) && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
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
        this.f49441o = 0;
        this.f49443q = 0;
        this.f49439m = 0;
        this.f49442p = 0;
        if (this.f49445s) {
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
            boolean z10 = m0Var.f49391b;
            n6 n6Var = m0Var.G;
            vq vqVar = m0Var.F;
            if (z10) {
                m0Var.A = AndroidUtilities.dp(14.0f);
                m0Var.B = AndroidUtilities.dp(14.0f);
            } else if (m0Var.S) {
                m0Var.A = AndroidUtilities.dp(42.0f);
                m0Var.B = AndroidUtilities.dp(26.0f);
                if (m0Var.f49413u) {
                    m0Var.A = (int) (n6Var.d + AndroidUtilities.dp(8.0f) + m0Var.A);
                } else if (vqVar != null && m0Var.f49414w > 1) {
                    m0Var.A = org.telegram.messenger.l0.C(8.0f, (int) Math.ceil(vqVar.f29804m), m0Var.A);
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
                    m0Var.T.f24957o = AndroidUtilities.dp(26.0f);
                } else if (m0Var.f49413u) {
                    m0Var.A = (int) (n6Var.d + AndroidUtilities.dp(8.0f) + m0Var.A);
                } else if (((int) Math.ceil(vqVar.f29804m)) > 0) {
                    m0Var.A = org.telegram.messenger.l0.C(8.0f, (int) Math.ceil(vqVar.f29804m), m0Var.A);
                } else {
                    m0Var.A -= AndroidUtilities.dp(1.0f);
                }
                m0Var.B = AndroidUtilities.dp(26.0f);
            }
            if (m0Var.A + i14 > i10) {
                arrayList2.add(Integer.valueOf(i14));
                i16 = org.telegram.messenger.l0.C(4.0f, m0Var.B, i16);
                i17++;
                i14 = 0;
            }
            m0Var.f49415x = i14;
            m0Var.f49416y = i16;
            m0Var.f49417z = i17;
            i14 = org.telegram.messenger.l0.C(4.0f, m0Var.A, i14);
            if (i14 > i15) {
                i15 = i14;
            }
            i13++;
        }
        arrayList2.add(Integer.valueOf(i14));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i18 = ((m0) arrayList.get(0)).f49416y;
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((m0) arrayList.get(i20)).f49416y != i18) {
                    int i21 = i20 - 1;
                    int i22 = i10 - (((m0) arrayList.get(i21)).f49415x + ((m0) arrayList.get(i21)).A);
                    while (i19 < i20) {
                        ((m0) arrayList.get(i19)).f49415x += i22;
                        i19++;
                    }
                    i19 = i20;
                }
            }
            int size = arrayList.size() - 1;
            int i23 = i10 - (((m0) arrayList.get(size)).f49415x + ((m0) arrayList.get(size)).A);
            while (i19 <= size) {
                ((m0) arrayList.get(i19)).f49415x += i23;
                i19++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                m0 m0Var2 = (m0) arrayList.get(i24);
                int i25 = m0Var2.f49417z;
                if (i25 >= 0 && i25 < arrayList2.size()) {
                    f7 = ((Integer) arrayList2.get(m0Var2.f49417z)).intValue();
                } else {
                    f7 = 0.0f;
                }
                m0Var2.f49415x = (int) e2.A(i10, f7, 2.0f, m0Var2.f49415x);
            }
        }
        this.f49447u = i14;
        if (i11 != 5 && i11 != 1) {
            this.f49443q = i15;
        } else {
            this.f49443q = i10;
        }
        if (arrayList.size() == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(26.0f);
        }
        this.f49441o = i16 + dp;
        this.f49430a = 0.0f;
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
        HashMap hashMap = this.f49449x;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                hashMap.put(((m0) arrayList.get(i10)).f49407o, (m0) arrayList.get(i10));
                i10++;
            } else {
                this.f49435i = !this.f49445s;
                this.f49434g = this.f49432c;
                this.h = this.d;
                this.F = this.f49443q;
                this.I = this.f49442p;
                return;
            }
        }
    }

    public final void s(org.telegram.messenger.MessageObject r20, boolean r21, boolean r22, org.telegram.ui.ActionBar.f6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: zg.p0.s(org.telegram.messenger.MessageObject, boolean, boolean, org.telegram.ui.ActionBar.f6):void");
    }
}
