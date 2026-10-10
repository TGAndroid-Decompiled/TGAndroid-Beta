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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.s5;
import org.telegram.ui.mb1;
import org.telegram.ui.sm;
import yh.t5;
public final class o0 {
    public static int Z;
    public MessageObject A;
    public e6 B;
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
    public l0 S;
    public boolean T;
    public t5 U;
    public float f54666a;
    public boolean f54667b;
    public int f54668c;
    public int d;
    public float f54669e;
    public float f54670f;
    public float f54671g;
    public float h;
    public boolean f54672i;
    public boolean f54673j;
    public boolean f54674k;
    public boolean f54675l;
    public int f54676m;
    public int f54678o;
    public int f54679p;
    public int f54680q;
    public int f54681r;
    public boolean f54682s;
    public final float f54683t;
    public int f54684u;
    public final org.telegram.ui.Cells.a0 f54688z;
    public static final Paint V = new Paint(1);
    public static final Paint W = new Paint(1);
    public static final Paint X = new Paint(1);
    public static final TextPaint Y = new TextPaint(1);
    public static final k0 f54663a0 = new Object();
    public static int f54664b0 = 1;
    public static final mb1 f54665c0 = new mb1(27);
    public final ArrayList v = new ArrayList();
    public final ArrayList f54685w = new ArrayList();
    public final HashMap f54686x = new HashMap();
    public final HashMap f54687y = new HashMap();
    public final HashMap H = new HashMap();
    public final ArrayList N = new ArrayList();
    public final RectF O = new RectF();
    public final Rect P = new Rect();
    public final int f54677n = UserConfig.selectedAccount;

    public o0(org.telegram.ui.Cells.a0 a0Var) {
        this.f54688z = a0Var;
        o(this.B);
        this.f54683t = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
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
            return ((TLRPC.User) tLObject).f20189id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f20042id;
        }
        return 0L;
    }

    public static void o(e6 e6Var) {
        V.setColor(i6.w0(i6.f20900ie, e6Var));
        int w02 = i6.w0(i6.Sh, e6Var);
        TextPaint textPaint = Y;
        textPaint.setColor(w02);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        X.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        l9 l9Var;
        int i10;
        if (this.A == null) {
            return false;
        }
        HashMap hashMap = this.f54687y;
        hashMap.clear();
        int i11 = 0;
        while (true) {
            arrayList = this.f54685w;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((l0) arrayList.get(i11)).b();
            i11++;
        }
        arrayList.clear();
        hashMap.putAll(this.f54686x);
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i12 >= arrayList2.size()) {
                break;
            }
            l0 l0Var = (l0) arrayList2.get(i12);
            String str = l0Var.f54643o;
            lr lrVar = l0Var.F;
            l0 l0Var2 = (l0) hashMap.get(str);
            if (l0Var2 != null && l0Var.f54626b != l0Var2.f54626b) {
                l0Var2 = null;
            }
            if (l0Var2 != null) {
                hashMap.remove(l0Var.f54643o);
                int i13 = l0Var.f54651x;
                int i14 = l0Var2.f54651x;
                if (i13 == i14 && l0Var.f54652y == l0Var2.f54652y && l0Var.A == l0Var2.A && l0Var.f54650w == l0Var2.f54650w && l0Var.f54644p == l0Var2.f54644p && l0Var.T == null && l0Var2.T == null) {
                    l0Var.f54628c = 0;
                    i12++;
                } else {
                    l0Var.d = i14;
                    l0Var.f54631e = l0Var2.f54652y;
                    l0Var.f54633f = l0Var2.A;
                    l0Var.f54637i = l0Var2.N;
                    l0Var.f54635g = l0Var2.O;
                    l0Var.h = l0Var2.P;
                    l0Var.f54628c = 3;
                    int i15 = l0Var.f54650w;
                    int i16 = l0Var2.f54650w;
                    if (i15 != i16 && lrVar != null) {
                        lrVar.c(i16, false);
                        lrVar.c(l0Var.f54650w, true);
                    }
                    l9 l9Var2 = l0Var.T;
                    if (l9Var2 != null || l0Var2.T != null) {
                        if (l9Var2 == null) {
                            l0Var.p(new ArrayList());
                        }
                        if (l0Var2.T == null) {
                            l0Var2.p(new ArrayList());
                        }
                        ArrayList arrayList3 = l0Var2.U;
                        ArrayList arrayList4 = l0Var.U;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                                TLObject tLObject = (TLObject) arrayList3.get(i17);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i17);
                                if (tLObject != null && tLObject2 != null && k(tLObject) == k(tLObject2)) {
                                }
                            }
                        }
                        l9 l9Var3 = l0Var.T;
                        if (l9Var3 != null && (l9Var = l0Var2.T) != null) {
                            ValueAnimator valueAnimator = l9Var.f28253f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (l9Var3.f28268w) {
                                    l9Var3.f28268w = false;
                                    l9Var3.n();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i18 = 0;
                            while (true) {
                                i10 = this.f54677n;
                                if (i18 >= 3) {
                                    break;
                                }
                                tLObjectArr[i18] = l9Var3.f28250b[i18].h;
                                l9Var3.l(i18, l9Var.f28250b[i18].h, i10);
                                i18++;
                            }
                            l9Var3.b(false, true);
                            for (int i19 = 0; i19 < 3; i19++) {
                                l9Var3.l(i19, tLObjectArr[i19], i10);
                            }
                            l9Var3.d = true;
                            l9Var3.b(true, false);
                        }
                    }
                }
            } else {
                l0Var.f54628c = 1;
            }
            z10 = true;
            i12++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                ((l0) arrayList.get(i20)).f54640l = ((l0) arrayList.get(i20)).f54642n;
                ((l0) arrayList.get(i20)).a();
            }
            z10 = true;
        }
        if (this.f54672i) {
            float f7 = this.f54671g;
            if (f7 != this.f54668c || this.h != this.d) {
                this.f54673j = true;
                this.f54669e = f7;
                this.f54670f = this.h;
                z10 = true;
            }
        }
        int i21 = this.F;
        if (i21 != this.f54680q) {
            this.f54674k = true;
            this.f54681r = i21;
            z10 = true;
        }
        int i22 = this.I;
        if (i22 != this.f54679p) {
            this.f54675l = true;
            this.J = i22;
            return true;
        }
        return z10;
    }

    public final void b(n0 n0Var) {
        int i10 = 0;
        if (n0Var.f54662g == 0) {
            HashMap hashMap = this.H;
            if (hashMap.get(n0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver();
                imageReceiver.setParentView(this.f54688z);
                int i11 = Z;
                Z = i11 + 1;
                imageReceiver.setUniqKeyPrefix(Integer.toString(i11));
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.f54677n).getReactionsMap().get(n0Var.f54661f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.setAutoRepeat(0);
                imageReceiver.onAttachedToWindow();
                hashMap.put(n0Var, imageReceiver);
                return;
            }
        }
        if (!this.M || n0Var.f54662g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                if (n0Var.f(((l0) arrayList.get(i10)).f54646r)) {
                    ((l0) arrayList.get(i10)).q();
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
        if (this.f54682s || this.f54667b || (messageObject = this.A) == null || (message = messageObject.messageOwner) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Cells.a0 a0Var = this.f54688z;
        if (e2.t(a0Var)) {
            y3 -= a0Var.getPaddingTop();
            if (a0Var instanceof w0) {
                x10 -= ((w0) a0Var).f23611j0 / 2.0f;
            }
        }
        float f7 = x10 - this.f54668c;
        float f10 = y3 - this.d;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (f7 > ((l0) arrayList.get(i10)).f54651x && f7 < ((l0) arrayList.get(i10)).f54651x + ((l0) arrayList.get(i10)).A && f10 > ((l0) arrayList.get(i10)).f54652y && f10 < ((l0) arrayList.get(i10)).f54652y + ((l0) arrayList.get(i10)).B) {
                    this.Q = motionEvent.getX();
                    this.R = y3;
                    this.S = (l0) arrayList.get(i10);
                    t5 t5Var = this.U;
                    if (t5Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(t5Var);
                        this.U = null;
                    }
                    this.S.Y.c(true);
                    t5 t5Var2 = new t5(7, this, this.S);
                    this.U = t5Var2;
                    AndroidUtilities.runOnUIThread(t5Var2, ViewConfiguration.getLongPressTimeout());
                    this.T = true;
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.T;
            float f11 = this.f54683t;
            if ((z10 && Math.abs(motionEvent.getX() - this.Q) > f11) || Math.abs(y3 - this.R) > f11) {
                this.T = false;
                l0 l0Var = this.S;
                if (l0Var != null) {
                    l0Var.Y.c(false);
                }
                this.S = null;
                t5 t5Var3 = this.U;
                if (t5Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(t5Var3);
                    this.U = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            t5 t5Var4 = this.U;
            if (t5Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(t5Var4);
                this.U = null;
            }
            if (this.T && this.S != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.S.f54624a;
                float x11 = motionEvent.getX();
                if (e2.t(a0Var)) {
                    ((o4) a0Var).f(reactionCount, false, x11, y3);
                }
            }
            this.T = false;
            l0 l0Var2 = this.S;
            if (l0Var2 != null) {
                l0Var2.Y.c(false);
            }
            this.S = null;
        }
        return this.T;
    }

    public final void d(Canvas canvas, float f7, Integer num) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        Canvas canvas2 = canvas;
        boolean z11 = this.f54682s;
        ArrayList arrayList = this.f54685w;
        if (!z11 || !arrayList.isEmpty()) {
            float f13 = this.f54668c;
            float f14 = this.d;
            if (this.f54682s) {
                f13 = this.f54671g;
                f14 = this.h;
            } else if (this.f54673j) {
                float f15 = 1.0f - f7;
                f13 = (f13 * f7) + (this.f54669e * f15);
                f14 = (f14 * f7) + (this.f54670f * f15);
            }
            float f16 = f13;
            float f17 = f14;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = this.v;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                l0 l0Var = (l0) arrayList2.get(i11);
                if (this.C == null && num == null && this.D < 0.5f) {
                    l0Var.c();
                }
                if (!Integer.valueOf(l0Var.f54646r.hashCode()).equals(this.C) && (num == null || l0Var.f54646r.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f18 = l0Var.f54651x;
                    float f19 = l0Var.f54652y;
                    int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
                    if (i12 != 0 && l0Var.f54628c == 3) {
                        float f20 = 1.0f - f7;
                        f18 = (f18 * f7) + (l0Var.d * f20);
                        f19 = (f19 * f7) + (l0Var.f54631e * f20);
                    }
                    if (i12 != 0 && l0Var.f54628c == 1) {
                        float f21 = (f7 * 0.5f) + 0.5f;
                        canvas2.scale(f21, f21, (l0Var.A / 2.0f) + f16 + f18, (l0Var.B / 2.0f) + f17 + f19);
                        f10 = f7;
                    } else {
                        f10 = 1.0f;
                    }
                    float f22 = f18 + f16;
                    float f23 = f19 + f17;
                    if (l0Var.f54628c == 3) {
                        f11 = f10;
                        f12 = f7;
                    } else {
                        f11 = f10;
                        f12 = 1.0f;
                    }
                    if (num != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    l0Var.d(canvas2, f22, f23, f12, f11, z10, this.E, this.D);
                    canvas2.restore();
                }
                i11++;
            }
            while (i10 < arrayList.size()) {
                l0 l0Var2 = (l0) arrayList.get(i10);
                float f24 = 1.0f - f7;
                float f25 = (f24 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f25, f25, (l0Var2.A / 2.0f) + l0Var2.f54651x + f16, (l0Var2.B / 2.0f) + l0Var2.f54652y + f17);
                ((l0) arrayList.get(i10)).d(canvas2, l0Var2.f54651x + f16, l0Var2.f54652y + f17, 1.0f, f24, false, this.E, this.D);
                canvas.restore();
                i10++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(Canvas canvas, float f7) {
        l0 l0Var;
        boolean z10;
        float f10;
        boolean z11 = this.f54682s;
        ArrayList arrayList = this.f54685w;
        if (!z11 || !arrayList.isEmpty()) {
            float f11 = this.f54668c;
            float f12 = this.d;
            float f13 = 1.0f;
            if (this.f54682s) {
                f11 = this.f54671g;
                f12 = this.h;
            } else if (this.f54673j) {
                float f14 = 1.0f - f7;
                f11 = (f11 * f7) + (this.f54669e * f14);
                f12 = (f12 * f7) + (this.f54670f * f14);
            }
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                ArrayList arrayList2 = this.v;
                if (i10 >= arrayList2.size()) {
                    break;
                }
                l0 l0Var2 = (l0) arrayList2.get(i10);
                if (!l0Var2.f54641m) {
                    f10 = f13;
                } else {
                    canvas.save();
                    float f15 = l0Var2.f54651x;
                    float f16 = l0Var2.f54652y;
                    int i11 = (f7 > f13 ? 1 : (f7 == f13 ? 0 : -1));
                    if (i11 != 0) {
                        f10 = f13;
                        if (l0Var2.f54628c == 3) {
                            float f17 = f10 - f7;
                            f15 = (f15 * f7) + (l0Var2.d * f17);
                            f16 = (f16 * f7) + (l0Var2.f54631e * f17);
                        }
                    } else {
                        f10 = f13;
                    }
                    if (i11 != 0 && l0Var2.f54628c == 1) {
                        float f18 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f18, f18, (l0Var2.A / 2.0f) + f11 + f15, (l0Var2.B / 2.0f) + f12 + f16);
                    }
                    if (!z12 && !l0Var2.g(canvas, f15 + f11, f16 + f12)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    canvas.restore();
                }
                i10++;
                f13 = f10;
            }
            float f19 = f13;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((l0) arrayList.get(i12)).f54641m) {
                    float f20 = ((f19 - f7) * 0.5f) + 0.5f;
                    canvas.save();
                    canvas.scale(f20, f20, (l0Var.A / 2.0f) + l0Var.f54651x + f11, (l0Var.B / 2.0f) + l0Var.f54652y + f12);
                    if (!z12 && !((l0) arrayList.get(i12)).g(canvas, l0Var.f54651x + f11, l0Var.f54652y + f12)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    canvas.restore();
                    z12 = z10;
                }
            }
        }
    }

    public final void f(sm smVar, Canvas canvas, int i10, Integer num) {
        int i11;
        if (!this.f54682s || !this.f54685w.isEmpty()) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.v;
                if (i12 < arrayList.size()) {
                    l0 l0Var = (l0) arrayList.get(i12);
                    if ((num == null || l0Var.f54646r.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(l0Var.f54648t);
                        float dp = AndroidUtilities.dp(140.0f);
                        float dp2 = AndroidUtilities.dp(14.0f);
                        org.telegram.ui.Cells.a0 a0Var = this.f54688z;
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
                        float interpolation = is.h.getInterpolation(this.D);
                        AndroidUtilities.lerp(rectF, rectF2, interpolation, rectF2);
                        int i13 = l0Var.V;
                        n0 n0Var = l0Var.f54647s;
                        View view = l0Var.W;
                        if (l0Var.f54634f0 == null && l0Var.f54636g0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (l0Var.f54646r != null && !n0Var.f54657a) {
                                if (n0Var.f54661f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i13).getReactionsMap().get(n0Var.f54661f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_availableReaction.static_icon, i6.f20745a7, 1.0f);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        l0Var.f54634f0 = imageReceiver;
                                        imageReceiver.setLayerNum(7);
                                        l0Var.f54634f0.onAttachedToWindow();
                                        l0Var.f54634f0.setRoundRadius(AndroidUtilities.dp(14.0f));
                                        l0Var.f54634f0.setAllowStartLottieAnimation(true);
                                        l0Var.f54634f0.setAllowStartAnimation(true);
                                        l0Var.f54634f0.setAutoRepeat(1);
                                        l0Var.f54634f0.setAllowDecodeSingleFrame(true);
                                        l0Var.f54634f0.setImage(ImageLocation.getForDocument(tL_availableReaction.activate_animation), "140_140", svgThumb, null, tL_availableReaction, 1);
                                    }
                                } else if (n0Var.f54662g != 0) {
                                    s5 s5Var = new s5(24, i13, n0Var.f54662g);
                                    l0Var.f54636g0 = s5Var;
                                    s5Var.a(view);
                                }
                            }
                        }
                        this.P.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver2 = l0Var.f54634f0;
                            if (imageReceiver2 != null) {
                                imageReceiver2.setImageCoords(rectF2);
                                l0Var.f54634f0.setAlpha(interpolation);
                                l0Var.f54634f0.draw(canvas);
                            } else {
                                s5 s5Var2 = l0Var.f54636g0;
                                if (s5Var2 != null) {
                                    s5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    l0Var.f54636g0.setAlpha((int) (interpolation * 255.0f));
                                    l0Var.f54636g0.draw(canvas);
                                }
                            }
                            smVar.invalidate();
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
        if (this.f54675l) {
            return (this.f54679p * f7) + ((1.0f - f7) * this.J);
        }
        return this.f54679p;
    }

    public final float j(float f7) {
        if (this.f54674k) {
            return (this.f54680q * f7) + ((1.0f - f7) * this.f54681r);
        }
        return this.f54680q;
    }

    public final l0 l(String str) {
        boolean z10 = this.f54667b;
        HashMap hashMap = this.f54686x;
        if (z10) {
            l0 l0Var = (l0) hashMap.get(str + "_");
            if (l0Var != null) {
                return l0Var;
            }
        }
        return (l0) hashMap.get(str);
    }

    public final l0 m(n0 n0Var) {
        String l4;
        if (n0Var.f54657a) {
            l4 = "stars";
        } else {
            String str = n0Var.f54661f;
            if (str != null) {
                l4 = str;
            } else {
                l4 = Long.toString(n0Var.f54662g);
            }
        }
        return l(l4);
    }

    public final boolean n() {
        if (this.L) {
            if ((!this.f54682s || !this.f54685w.isEmpty()) && LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
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
        this.f54678o = 0;
        this.f54680q = 0;
        this.f54676m = 0;
        this.f54679p = 0;
        if (this.f54682s) {
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
            l0 l0Var = (l0) arrayList.get(i13);
            boolean z10 = l0Var.f54626b;
            q6 q6Var = l0Var.G;
            lr lrVar = l0Var.F;
            if (z10) {
                l0Var.A = AndroidUtilities.dp(14.0f);
                l0Var.B = AndroidUtilities.dp(14.0f);
            } else if (l0Var.S) {
                l0Var.A = AndroidUtilities.dp(42.0f);
                l0Var.B = AndroidUtilities.dp(26.0f);
                if (l0Var.f54649u) {
                    l0Var.A = (int) (q6Var.d + AndroidUtilities.dp(8.0f) + l0Var.A);
                } else if (lrVar != null && l0Var.f54650w > 1) {
                    l0Var.A = org.telegram.messenger.q.C(8.0f, (int) Math.ceil(lrVar.f28516m), l0Var.A);
                }
            } else {
                int dp2 = AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f);
                if (l0Var.D != null) {
                    f10 = 6.0f;
                } else {
                    f10 = 4.0f;
                }
                l0Var.A = AndroidUtilities.dp(f10) + dp2;
                if (l0Var.T != null && l0Var.U.size() > 0) {
                    l0Var.U.size();
                    if (l0Var.U.size() > 1) {
                        i12 = l0Var.U.size() - 1;
                    } else {
                        i12 = 0;
                    }
                    l0Var.A = (int) ((AndroidUtilities.dp(20.0f) * i12 * 0.8f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(2.0f) + AndroidUtilities.dp(1.0f) + l0Var.A);
                    l0Var.T.f28261o = AndroidUtilities.dp(26.0f);
                } else if (l0Var.f54649u) {
                    l0Var.A = (int) (q6Var.d + AndroidUtilities.dp(8.0f) + l0Var.A);
                } else if (((int) Math.ceil(lrVar.f28516m)) > 0) {
                    l0Var.A = org.telegram.messenger.q.C(8.0f, (int) Math.ceil(lrVar.f28516m), l0Var.A);
                } else {
                    l0Var.A -= AndroidUtilities.dp(1.0f);
                }
                l0Var.B = AndroidUtilities.dp(26.0f);
            }
            if (l0Var.A + i14 > i10) {
                arrayList2.add(Integer.valueOf(i14));
                i16 = org.telegram.messenger.q.C(4.0f, l0Var.B, i16);
                i17++;
                i14 = 0;
            }
            l0Var.f54651x = i14;
            l0Var.f54652y = i16;
            l0Var.f54653z = i17;
            i14 = org.telegram.messenger.q.C(4.0f, l0Var.A, i14);
            if (i14 > i15) {
                i15 = i14;
            }
            i13++;
        }
        arrayList2.add(Integer.valueOf(i14));
        if (i11 == 5 && !arrayList.isEmpty()) {
            int i18 = ((l0) arrayList.get(0)).f54652y;
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                if (((l0) arrayList.get(i20)).f54652y != i18) {
                    int i21 = i20 - 1;
                    int i22 = i10 - (((l0) arrayList.get(i21)).f54651x + ((l0) arrayList.get(i21)).A);
                    while (i19 < i20) {
                        ((l0) arrayList.get(i19)).f54651x += i22;
                        i19++;
                    }
                    i19 = i20;
                }
            }
            int size = arrayList.size() - 1;
            int i23 = i10 - (((l0) arrayList.get(size)).f54651x + ((l0) arrayList.get(size)).A);
            while (i19 <= size) {
                ((l0) arrayList.get(i19)).f54651x += i23;
                i19++;
            }
        } else if (i11 == 1 && !arrayList.isEmpty()) {
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                l0 l0Var2 = (l0) arrayList.get(i24);
                int i25 = l0Var2.f54653z;
                if (i25 >= 0 && i25 < arrayList2.size()) {
                    f7 = ((Integer) arrayList2.get(l0Var2.f54653z)).intValue();
                } else {
                    f7 = 0.0f;
                }
                l0Var2.f54651x = (int) e2.z(i10, f7, 2.0f, l0Var2.f54651x);
            }
        }
        this.f54684u = i14;
        if (i11 != 5 && i11 != 1) {
            this.f54680q = i15;
        } else {
            this.f54680q = i10;
        }
        if (arrayList.size() == 0) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(26.0f);
        }
        this.f54678o = i16 + dp;
        this.f54666a = 0.0f;
    }

    public final void q() {
        int i10 = 0;
        this.G = false;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((l0) arrayList.get(i10)).b();
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
        HashMap hashMap = this.f54686x;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.v;
            if (i10 < arrayList.size()) {
                hashMap.put(((l0) arrayList.get(i10)).f54643o, (l0) arrayList.get(i10));
                i10++;
            } else {
                this.f54672i = !this.f54682s;
                this.f54671g = this.f54668c;
                this.h = this.d;
                this.F = this.f54680q;
                this.I = this.f54679p;
                return;
            }
        }
    }

    public final void s(org.telegram.messenger.MessageObject r20, boolean r21, boolean r22, org.telegram.ui.ActionBar.e6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: zg.o0.s(org.telegram.messenger.MessageObject, boolean, boolean, org.telegram.ui.ActionBar.e6):void");
    }
}
