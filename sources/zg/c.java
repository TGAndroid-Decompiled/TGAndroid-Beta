package zg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import jg.g;
import n2.n0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.fp;
import org.telegram.messenger.g0;
import org.telegram.messenger.gp;
import org.telegram.messenger.i6;
import org.telegram.messenger.ic;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t0;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.zg0;
import wg.s;
public final class c {
    public TextPaint A;
    public Paint B;
    public Paint C;
    public Paint D;
    public Paint E;
    public RectF F;
    public RectF G;
    public Rect H;
    public Rect I;
    public int[] J;
    public int K;
    public y L;
    public ij M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public n0 U;
    public ImageReceiver[] f60177a;
    public w8[] f60178b;
    public final q1 f60179c;
    public ImageReceiver d;
    public zg0 f60180e;
    public CharSequence[] f60181f;
    public TLRPC.User[] f60182g;
    public float[] h;
    public boolean[] f60183i;
    public Rect[] f60184j;
    public boolean[] f60185k;
    public int f60188n;
    public int f60189o;
    public Drawable f60190p;
    public String f60191q;
    public int f60192r;
    public StaticLayout f60193s;
    public StaticLayout f60194t;
    public StaticLayout f60195u;
    public TextPaint v;
    public TextPaint f60196w;
    public TextPaint f60197x;
    public TextPaint f60198y;
    public TextPaint f60199z;
    public int f60186l = 0;
    public int f60187m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public c(q1 q1Var) {
        this.f60179c = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i7;
        ij ijVar = this.M;
        if (ijVar != null && ijVar.x3()) {
            n0 n0Var = this.U;
            q1 q1Var = this.f60179c;
            if (n0Var == null) {
                this.U = new n0(q1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f60194t) != null && (i7 = y10 - this.S) > 0) {
                int offsetForHorizontal = this.f60194t.getOffsetForHorizontal(staticLayout.getLineForVertical(i7 - g0.L(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.f(true);
                        clickableSpanArr[0].onClick(q1Var);
                        return true;
                    }
                    x70 x70Var = new x70(clickableSpanArr[0], null, x10, y10, 0);
                    this.U.b(x70Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        r70 b10 = x70Var.b();
                        b10.e(this.f60194t, spanStart, this.T, this.S);
                        this.f60194t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return true;
                    }
                }
                this.U.f(true);
                q1Var.invalidate();
            }
            if (action == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.f60184j;
                    if (i10 < rectArr.length) {
                        if (rectArr[i10].contains(x10, y10)) {
                            this.O = i10;
                            this.L.setHotspot(x10, y10);
                            this.P = true;
                            c(true);
                            return true;
                        }
                        i10++;
                    } else if (this.I.contains(x10, y10)) {
                        this.Q = true;
                        return true;
                    }
                }
            } else if (action == 1) {
                if (this.P) {
                    if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().x1(q1Var, this.O);
                    }
                    q1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    ij ijVar2 = this.M;
                    if (ijVar2 != null && ijVar2.f23262k != null) {
                        s.d(ijVar2, new ii.c(ijVar2, 27), new pg.c(1));
                        return false;
                    }
                }
            } else if (action != 2 && action == 3) {
                this.U.f(true);
                if (this.P) {
                    c(false);
                }
                this.P = false;
                this.Q = false;
            }
        }
        return false;
    }

    public final void b(Canvas canvas, int i7, int i10, f6 f6Var) {
        float f10;
        TextPaint textPaint;
        float f11;
        float f12;
        fp fpVar;
        int w02;
        int i11;
        ij ijVar = this.M;
        if (ijVar != null && ijVar.x3()) {
            y yVar = this.L;
            q1 q1Var = this.f60179c;
            ic icVar = null;
            if (yVar == null) {
                int x02 = k6.x0(null, k6.f27944i6, false);
                this.K = x02;
                y a02 = k6.a0(x02, 12, 12);
                this.L = a02;
                a02.setCallback(q1Var);
            }
            this.f60198y.setColor(k6.f28049o2.getColor());
            this.f60199z.setColor(k6.x0(null, k6.f28091q5, false));
            this.A.setColor(k6.f28049o2.getColor());
            if (this.M.Q3()) {
                TextPaint textPaint2 = this.f60197x;
                int i12 = k6.Lb;
                textPaint2.setColor(k6.w0(i12, f6Var));
                this.B.setColor(k6.w0(i12, f6Var));
                this.C.setColor(k6.w0(k6.Ob, f6Var));
            } else {
                TextPaint textPaint3 = this.f60197x;
                int i13 = k6.f28250yd;
                textPaint3.setColor(k6.w0(i13, f6Var));
                this.B.setColor(k6.w0(i13, f6Var));
                this.C.setColor(k6.w0(k6.Id, f6Var));
            }
            if (this.N) {
                this.B.setColor(k6.w0(k6.Tk, f6Var));
            }
            canvas.save();
            int L = i10 - g0.L(4.0f);
            float f13 = L;
            canvas.translate(f13, i7);
            this.I.set(L, i7, this.f60187m + L, this.f60186l + i7);
            canvas.saveLayer(0.0f, 0.0f, this.f60187m, this.f60186l, this.D, 31);
            this.d.h(canvas, null);
            float f14 = this.f60187m / 2.0f;
            float L2 = g0.L(106.0f);
            int L3 = g0.L(12.0f) + this.H.width();
            int L4 = g0.L(10.0f) + this.H.height();
            this.F.set(f14 - ((g0.L(2.0f) + L3) / 2.0f), L2 - ((g0.L(2.0f) + L4) / 2.0f), ((g0.L(2.0f) + L3) / 2.0f) + f14, ((g0.L(2.0f) + L4) / 2.0f) + L2);
            canvas.drawRoundRect(this.F, g0.L(11.0f), g0.L(11.0f), this.E);
            float f15 = L3 / 2.0f;
            float f16 = L4 / 2.0f;
            this.F.set(f14 - f15, L2 - f16, f14 + f15, L2 + f16);
            canvas.drawRoundRect(this.F, g0.L(10.0f), g0.L(10.0f), this.B);
            Drawable drawable = this.f60190p;
            if (drawable != null) {
                drawable.setBounds(g0.L(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - g0.L(6.96f), g0.L(21.24f) + ((int) this.F.left), g0.L(6.96f) + ((int) this.F.centerY()));
                this.f60190p.draw(canvas);
            }
            String str = this.f60191q;
            float centerX = this.F.centerX();
            if (this.N) {
                f10 = 8.0f;
            } else {
                f10 = 0.0f;
            }
            float L5 = centerX + g0.L(f10);
            float centerY = this.F.centerY() + g0.L(4.0f);
            if (this.N) {
                textPaint = this.f60196w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, L5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, g0.L(128.0f));
            int L6 = g0.L(128.0f) + i7;
            this.S = this.f60188n + L6;
            this.T = (int) ((this.f60192r / 2.0f) + f13);
            canvas.save();
            canvas.translate(this.f60192r / 2.0f, 0.0f);
            this.f60193s.draw(canvas);
            canvas.translate(0.0f, this.f60188n);
            this.f60194t.draw(canvas);
            canvas.restore();
            float f17 = 6.0f;
            canvas.translate(0.0f, g0.L(6.0f) + this.f60189o);
            int C = k5.C(6.0f, this.f60189o, L6);
            int i14 = 0;
            int i15 = 0;
            while (true) {
                boolean[] zArr = this.f60185k;
                if (i14 >= zArr.length) {
                    break;
                } else if (zArr[i14]) {
                    canvas.save();
                    int i16 = i14;
                    float f18 = 0.0f;
                    while (true) {
                        f12 = f17;
                        f18 += this.h[i16] + g0.L(40.0f);
                        i16++;
                        boolean[] zArr2 = this.f60185k;
                        if (i16 >= zArr2.length || this.f60183i[i16] || !zArr2[i16]) {
                            break;
                        }
                        f17 = f12;
                    }
                    float f19 = f14 - (f18 / 2.0f);
                    canvas.translate(f19, 0.0f);
                    int i17 = ((int) f19) + L;
                    int i18 = i14;
                    while (true) {
                        TLRPC.User user = this.f60182g[i18];
                        if (this.M.Q3()) {
                            w02 = k6.w0(k6.Lb, f6Var);
                        } else {
                            int e10 = t10.e(user);
                            if (e10 < 7) {
                                w02 = k6.w0(k6.f28113r8[e10], f6Var);
                            } else {
                                gp gpVar = qp.s1(p10.f24470s0).f24874q4;
                                if (gpVar == null) {
                                    fpVar = icVar;
                                } else {
                                    fpVar = gpVar.d(e10);
                                }
                                if (fpVar != 0) {
                                    w02 = fpVar.f();
                                } else {
                                    w02 = k6.w0(k6.f28113r8[0], f6Var);
                                }
                            }
                        }
                        int i19 = this.O;
                        if (i19 >= 0 && i19 == i18) {
                            i11 = w02;
                        } else {
                            i11 = i15;
                        }
                        this.f60197x.setColor(w02);
                        this.C.setColor(w02);
                        this.C.setAlpha(25);
                        this.f60177a[i18].h(canvas, icVar);
                        CharSequence charSequence = this.f60181f[i18];
                        int i20 = i17;
                        canvas.drawText(charSequence, 0, charSequence.length(), g0.L(30.0f), g0.L(16.0f), this.f60197x);
                        this.G.set(0.0f, 0.0f, this.h[i18] + g0.L(40.0f), g0.L(24.0f));
                        canvas.drawRoundRect(this.G, g0.L(12.0f), g0.L(12.0f), this.C);
                        float f20 = i20;
                        this.f60184j[i18].set(i20, C, (int) (this.G.width() + f20), g0.L(24.0f) + C);
                        canvas.translate(this.G.width() + g0.L(f12), 0.0f);
                        i17 = (int) (this.G.width() + g0.L(f12) + f20);
                        i18++;
                        boolean[] zArr3 = this.f60185k;
                        if (i18 >= zArr3.length || this.f60183i[i18] || !zArr3[i18]) {
                            break;
                        }
                        i15 = i11;
                        icVar = null;
                    }
                    canvas.restore();
                    canvas.translate(0.0f, g0.L(30.0f));
                    C += g0.L(30.0f);
                    i14 = i18;
                    i15 = i11;
                    icVar = null;
                    f17 = f12;
                } else {
                    i14++;
                    icVar = null;
                }
            }
            canvas.translate(0.0f, g0.L(f17));
            canvas.save();
            canvas.translate(this.f60192r / 2.0f, 0.0f);
            this.f60195u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (k6.I.q()) {
                    f11 = 0.12f;
                } else {
                    f11 = 0.1f;
                }
                int r12 = k6.r1(f11, i15);
                if (this.K != r12) {
                    y yVar2 = this.L;
                    this.K = r12;
                    k6.H1(yVar2, r12, true);
                }
                this.L.setBounds(this.f60184j[this.O]);
                this.L.setCallback(q1Var);
            }
            n0 n0Var = this.U;
            if (n0Var != null && n0Var.h(canvas)) {
                q1Var.invalidate();
            }
        }
    }

    public final void c(boolean z9) {
        ij ijVar = this.M;
        if (ijVar != null && ijVar.x3() && this.L != null) {
            n0 n0Var = this.U;
            if (n0Var != null) {
                n0Var.f(true);
            }
            q1 q1Var = this.f60179c;
            if (z9) {
                this.L.setCallback(new a5.b(this, 10));
                this.L.setState(this.J);
                q1Var.invalidate();
                return;
            }
            this.L.setState(StateSet.NOTHING);
            q1Var.invalidate();
        }
    }

    public final void d(int i7, ij ijVar) {
        boolean z9;
        float f10;
        boolean z10;
        this.M = null;
        this.f60193s = null;
        this.f60194t = null;
        this.f60195u = null;
        this.f60186l = 0;
        this.f60187m = 0;
        this.N = false;
        if (ijVar.x3()) {
            this.M = ijVar;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f60196w = new TextPaint(1);
                this.f60197x = new TextPaint(1);
                this.f60198y = new TextPaint(1);
                this.f60199z = new TextPaint(1);
                this.A = new TextPaint(1);
                this.B = new Paint(1);
                this.C = new Paint(1);
                this.D = new Paint();
                this.E = new Paint();
                this.F = new RectF();
                this.G = new RectF();
                this.H = new Rect();
                this.I = new Rect();
                this.J = new int[]{16842910, 16842919};
                this.f60181f = new CharSequence[10];
                this.f60182g = new TLRPC.User[10];
                this.h = new float[10];
                this.f60183i = new boolean[10];
                this.f60184j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f60179c);
                this.d = imageReceiver;
                imageReceiver.f21236z1 = true;
                Paint paint = this.E;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTypeface(g0.o());
                this.v.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTextSize(g0.L(12.0f));
                TextPaint textPaint = this.v;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.f60196w.setTypeface(g0.o());
                this.f60196w.setTextSize(g0.L(12.0f));
                this.f60196w.setTextAlign(align);
                this.f60196w.setColor(-1);
                this.f60197x.setTypeface(g0.o());
                this.f60197x.setTextSize(g0.L(13.0f));
                this.A.setTextSize(g0.L(13.0f));
                this.f60198y.setTextSize(g0.L(14.0f));
                this.f60199z.setTextSize(g0.L(14.0f));
                this.f60199z.setTextAlign(align);
            }
            if (this.f60177a == null) {
                this.f60177a = new ImageReceiver[10];
                this.f60178b = new w8[10];
                this.f60185k = new boolean[10];
                int i10 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f60177a;
                    if (i10 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i10] = new ImageReceiver(this.f60179c);
                    ImageReceiver imageReceiver2 = this.f60177a[i10];
                    imageReceiver2.f21236z1 = true;
                    imageReceiver2.J0(g0.L(12.0f));
                    this.f60178b[i10] = new w8((f6) null);
                    this.f60178b[i10].u(g0.L(18.0f));
                    this.f60184j[i10] = new Rect();
                    i10++;
                }
            }
            this.d.f21222u0 = false;
            if (this.f60180e == null) {
                this.f60180e = new zg0(2131624039, g0.L(120.0f), g0.L(120.0f));
            }
            this.d.w0(this.f60180e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) ijVar.f23262k.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f60177a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f60177a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f60178b = (w8[]) Arrays.copyOf(this.f60178b, size);
                this.f60185k = Arrays.copyOf(this.f60185k, size);
                this.f60181f = (CharSequence[]) Arrays.copyOf(this.f60181f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f60183i = Arrays.copyOf(this.f60183i, size);
                this.f60184j = (Rect[]) Arrays.copyOf(this.f60184j, size);
                this.f60182g = (TLRPC.User[]) Arrays.copyOf(this.f60182g, size);
                for (int i11 = length - 1; i11 < size; i11++) {
                    this.f60177a[i11] = new ImageReceiver(this.f60179c);
                    ImageReceiver imageReceiver3 = this.f60177a[i11];
                    imageReceiver3.f21236z1 = true;
                    imageReceiver3.J0(g0.L(12.0f));
                    this.f60178b[i11] = new w8((f6) null);
                    this.f60178b[i11].u(g0.L(18.0f));
                    this.f60184j[i11] = new Rect();
                }
            }
            int L = g0.L(90.0f);
            int L2 = g0.L(230.0f);
            SpannableStringBuilder X2 = g0.X2(id.M0(2131753386, "BoostingGiveawayResultsMsgWinnersSelected"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, X2.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder S2 = g0.S2(id.K0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinnersTitle"), k6.Uc, 0, new b(this, ijVar, tL_messageMediaGiveawayResults, 0), null);
            this.R.append((CharSequence) g0.K2(S2, g0.X2("**" + tL_messageMediaGiveawayResults.winners_count + "**"), "%1$d"));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder X22 = g0.X2(id.K0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinners"));
            this.R.append((CharSequence) X22);
            this.R.setSpan(new RelativeSizeSpan(1.05f), S2.length() + 2, X22.length() + S2.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) g0.X2(id.G(tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), "BoostingGiveawayResultsMsgAllAndMoreWinners", new Object[0])));
                spannableStringBuilder2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.N = z9;
            if (z9) {
                spannableStringBuilder2.append((CharSequence) id.H(' ', "BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) id.M0(2131753388, null));
            }
            TextPaint textPaint2 = this.f60198y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f60193s = mu0.c(spannableStringBuilder, textPaint2, L2, alignment, g0.L(2.0f), truncateAt, L2, 10, true);
            this.f60194t = mu0.c(this.R, this.f60198y, L2, alignment, g0.L(2.0f), truncateAt, L2, 10, true);
            this.f60195u = mu0.c(spannableStringBuilder2, this.f60198y, L2, alignment, g0.L(3.0f), truncateAt, L2, 10, true);
            int max = Math.max(i7, L2);
            this.f60192r = max - L2;
            float f11 = max;
            float f12 = L;
            float f13 = f12 / 2.0f;
            this.d.y0((f11 / 2.0f) - f13, g0.L(70.0f) - f13, f12, f12);
            StaticLayout staticLayout = this.f60193s;
            int L3 = g0.L(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f60188n = L3;
            StaticLayout staticLayout2 = this.f60194t;
            this.f60189o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L3;
            StaticLayout staticLayout3 = this.f60195u;
            int lineBottom = this.f60186l + this.f60189o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f60186l = lineBottom;
            this.f60186l = g0.L(128.0f) + lineBottom;
            this.f60187m = max;
            if (this.N) {
                if (this.f60190p == null) {
                    this.f60190p = g.h(t0.f25566b, 2131231124);
                }
                this.f60191q = id.E((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f60190p = null;
                this.f60191q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f60191q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            float f14 = 20.0f;
            if (this.N) {
                Rect rect = this.H;
                rect.right = g0.L(20.0f) + rect.right;
            }
            Arrays.fill(this.f60185k, false);
            this.f60186l = g0.L(30.0f) + this.f60186l;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Long l10 = arrayList2.get(i12);
                i12++;
                Long l11 = l10;
                if (qp.s1(p10.f24470s0).a2(l11) != null) {
                    arrayList.add(l11);
                }
            }
            int i13 = 0;
            float f15 = 0.0f;
            while (i13 < arrayList.size()) {
                Long l12 = (Long) arrayList.get(i13);
                long longValue = l12.longValue();
                TLRPC.User a22 = qp.s1(p10.f24470s0).a2(l12);
                if (a22 != null) {
                    this.f60185k[i13] = true;
                    this.f60182g[i13] = a22;
                    f10 = f14;
                    this.f60181f[i13] = TextUtils.ellipsize(i6.m(t10.p(a22), this.f60197x.getFontMetricsInt(), false, null, 0), this.f60197x, 0.8f * f11, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f60197x;
                    CharSequence charSequence = this.f60181f[i13];
                    fArr[i13] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.h[i13] + g0.L(40.0f);
                    f15 += L4;
                    if (i13 > 0) {
                        boolean[] zArr = this.f60183i;
                        if (f15 > 0.9f * f11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zArr[i13] = z10;
                        if (z10) {
                            this.f60186l = g0.L(30.0f) + this.f60186l;
                            f15 = L4;
                        }
                    } else {
                        this.f60183i[i13] = false;
                    }
                    this.f60178b[i13].r(a22);
                    this.f60177a[i13].i0(a22, this.f60178b[i13], null);
                    this.f60177a[i13].y0(0.0f, 0.0f, g0.L(24.0f), g0.L(24.0f));
                } else {
                    f10 = f14;
                    this.f60182g[i13] = null;
                    this.f60185k[i13] = false;
                    this.f60181f[i13] = "";
                    this.f60183i[i13] = false;
                    this.h[i13] = g0.L(f10);
                    this.f60178b[i13].k(longValue, "", "", null);
                }
                i13++;
                f14 = f10;
            }
        }
    }
}
