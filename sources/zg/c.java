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
import n2.p0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.bp;
import org.telegram.messenger.cp;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.yu0;
import ug.z;
import wg.r;
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
    public fj M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public p0 U;
    public ImageReceiver[] f62080a;
    public a9[] f62081b;
    public final r1 f62082c;
    public ImageReceiver d;
    public nh0 f62083e;
    public CharSequence[] f62084f;
    public TLRPC.User[] f62085g;
    public float[] h;
    public boolean[] f62086i;
    public Rect[] f62087j;
    public boolean[] f62088k;
    public int f62091n;
    public int f62092o;
    public Drawable f62093p;
    public String f62094q;
    public int f62095r;
    public StaticLayout f62096s;
    public StaticLayout f62097t;
    public StaticLayout f62098u;
    public TextPaint v;
    public TextPaint f62099w;
    public TextPaint f62100x;
    public TextPaint f62101y;
    public TextPaint f62102z;
    public int f62089l = 0;
    public int f62090m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public c(r1 r1Var) {
        this.f62082c = r1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i7;
        fj fjVar = this.M;
        if (fjVar != null && fjVar.w3()) {
            p0 p0Var = this.U;
            r1 r1Var = this.f62082c;
            if (p0Var == null) {
                this.U = new p0(r1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f62097t) != null && (i7 = y10 - this.S) > 0) {
                int offsetForHorizontal = this.f62097t.getOffsetForHorizontal(staticLayout.getLineForVertical(i7 - g0.L(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.f(true);
                        clickableSpanArr[0].onClick(r1Var);
                        return true;
                    }
                    k80 k80Var = new k80(clickableSpanArr[0], null, x10, y10, 0);
                    this.U.b(k80Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        e80 b10 = k80Var.b();
                        b10.e(this.f62097t, spanStart, this.T, this.S);
                        this.f62097t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return true;
                    }
                }
                this.U.f(true);
                r1Var.invalidate();
            }
            if (action == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.f62087j;
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
                    if (r1Var.getDelegate() != null) {
                        r1Var.getDelegate().K1(r1Var, this.O);
                    }
                    r1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    fj fjVar2 = this.M;
                    if (fjVar2 != null && fjVar2.f24073k != null) {
                        r.d(fjVar2, new z(fjVar2, 3), new pg.c(1));
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

    public final void b(Canvas canvas, int i7, int i10, i6 i6Var) {
        float f10;
        TextPaint textPaint;
        float f11;
        float f12;
        bp bpVar;
        int w02;
        int i11;
        fj fjVar = this.M;
        if (fjVar != null && fjVar.w3()) {
            y yVar = this.L;
            r1 r1Var = this.f62082c;
            gc gcVar = null;
            if (yVar == null) {
                int x02 = n6.x0(null, n6.f29543i6, false);
                this.K = x02;
                y a02 = n6.a0(x02, 12, 12);
                this.L = a02;
                a02.setCallback(r1Var);
            }
            this.f62101y.setColor(n6.f29648o2.getColor());
            this.f62102z.setColor(n6.x0(null, n6.f29690q5, false));
            this.A.setColor(n6.f29648o2.getColor());
            if (this.M.P3()) {
                TextPaint textPaint2 = this.f62100x;
                int i12 = n6.Ob;
                textPaint2.setColor(n6.w0(i12, i6Var));
                this.B.setColor(n6.w0(i12, i6Var));
                this.C.setColor(n6.w0(n6.Rb, i6Var));
            } else {
                TextPaint textPaint3 = this.f62100x;
                int i13 = n6.Bd;
                textPaint3.setColor(n6.w0(i13, i6Var));
                this.B.setColor(n6.w0(i13, i6Var));
                this.C.setColor(n6.w0(n6.Ld, i6Var));
            }
            if (this.N) {
                this.B.setColor(n6.w0(n6.Wk, i6Var));
            }
            canvas.save();
            int L = i10 - g0.L(4.0f);
            float f13 = L;
            canvas.translate(f13, i7);
            this.I.set(L, i7, this.f62090m + L, this.f62089l + i7);
            canvas.saveLayer(0.0f, 0.0f, this.f62090m, this.f62089l, this.D, 31);
            this.d.h(canvas, null);
            float f14 = this.f62090m / 2.0f;
            float L2 = g0.L(106.0f);
            int L3 = g0.L(12.0f) + this.H.width();
            int L4 = g0.L(10.0f) + this.H.height();
            this.F.set(f14 - ((g0.L(2.0f) + L3) / 2.0f), L2 - ((g0.L(2.0f) + L4) / 2.0f), ((g0.L(2.0f) + L3) / 2.0f) + f14, ((g0.L(2.0f) + L4) / 2.0f) + L2);
            canvas.drawRoundRect(this.F, g0.L(11.0f), g0.L(11.0f), this.E);
            float f15 = L3 / 2.0f;
            float f16 = L4 / 2.0f;
            this.F.set(f14 - f15, L2 - f16, f14 + f15, L2 + f16);
            canvas.drawRoundRect(this.F, g0.L(10.0f), g0.L(10.0f), this.B);
            Drawable drawable = this.f62093p;
            if (drawable != null) {
                drawable.setBounds(g0.L(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - g0.L(6.96f), g0.L(21.24f) + ((int) this.F.left), g0.L(6.96f) + ((int) this.F.centerY()));
                this.f62093p.draw(canvas);
            }
            String str = this.f62094q;
            float centerX = this.F.centerX();
            if (this.N) {
                f10 = 8.0f;
            } else {
                f10 = 0.0f;
            }
            float L5 = centerX + g0.L(f10);
            float centerY = this.F.centerY() + g0.L(4.0f);
            if (this.N) {
                textPaint = this.f62099w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, L5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, g0.L(128.0f));
            int L6 = g0.L(128.0f) + i7;
            this.S = this.f62091n + L6;
            this.T = (int) ((this.f62095r / 2.0f) + f13);
            canvas.save();
            canvas.translate(this.f62095r / 2.0f, 0.0f);
            this.f62096s.draw(canvas);
            canvas.translate(0.0f, this.f62091n);
            this.f62097t.draw(canvas);
            canvas.restore();
            float f17 = 6.0f;
            canvas.translate(0.0f, g0.L(6.0f) + this.f62092o);
            int C = f3.C(6.0f, this.f62092o, L6);
            int i14 = 0;
            int i15 = 0;
            while (true) {
                boolean[] zArr = this.f62088k;
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
                        boolean[] zArr2 = this.f62088k;
                        if (i16 >= zArr2.length || this.f62086i[i16] || !zArr2[i16]) {
                            break;
                        }
                        f17 = f12;
                    }
                    float f19 = f14 - (f18 / 2.0f);
                    canvas.translate(f19, 0.0f);
                    int i17 = ((int) f19) + L;
                    int i18 = i14;
                    while (true) {
                        TLRPC.User user = this.f62085g[i18];
                        if (this.M.P3()) {
                            w02 = n6.w0(n6.Ob, i6Var);
                        } else {
                            int f20 = n10.f(user);
                            if (f20 < 7) {
                                w02 = n6.w0(n6.f29712r8[f20], i6Var);
                            } else {
                                cp cpVar = mp.u1(i10.f24637t0).f25862t4;
                                if (cpVar == null) {
                                    bpVar = gcVar;
                                } else {
                                    bpVar = cpVar.d(f20);
                                }
                                if (bpVar != 0) {
                                    w02 = bpVar.f();
                                } else {
                                    w02 = n6.w0(n6.f29712r8[0], i6Var);
                                }
                            }
                        }
                        int i19 = this.O;
                        if (i19 >= 0 && i19 == i18) {
                            i11 = w02;
                        } else {
                            i11 = i15;
                        }
                        this.f62100x.setColor(w02);
                        this.C.setColor(w02);
                        this.C.setAlpha(25);
                        this.f62080a[i18].h(canvas, gcVar);
                        CharSequence charSequence = this.f62084f[i18];
                        int i20 = i17;
                        canvas.drawText(charSequence, 0, charSequence.length(), g0.L(30.0f), g0.L(16.0f), this.f62100x);
                        this.G.set(0.0f, 0.0f, this.h[i18] + g0.L(40.0f), g0.L(24.0f));
                        canvas.drawRoundRect(this.G, g0.L(12.0f), g0.L(12.0f), this.C);
                        float f21 = i20;
                        this.f62087j[i18].set(i20, C, (int) (this.G.width() + f21), g0.L(24.0f) + C);
                        canvas.translate(this.G.width() + g0.L(f12), 0.0f);
                        i17 = (int) (this.G.width() + g0.L(f12) + f21);
                        i18++;
                        boolean[] zArr3 = this.f62088k;
                        if (i18 >= zArr3.length || this.f62086i[i18] || !zArr3[i18]) {
                            break;
                        }
                        i15 = i11;
                        gcVar = null;
                    }
                    canvas.restore();
                    canvas.translate(0.0f, g0.L(30.0f));
                    C += g0.L(30.0f);
                    i14 = i18;
                    i15 = i11;
                    gcVar = null;
                    f17 = f12;
                } else {
                    i14++;
                    gcVar = null;
                }
            }
            canvas.translate(0.0f, g0.L(f17));
            canvas.save();
            canvas.translate(this.f62095r / 2.0f, 0.0f);
            this.f62098u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (n6.I.q()) {
                    f11 = 0.12f;
                } else {
                    f11 = 0.1f;
                }
                int r12 = n6.r1(f11, i15);
                if (this.K != r12) {
                    y yVar2 = this.L;
                    this.K = r12;
                    n6.H1(yVar2, r12, true);
                }
                this.L.setBounds(this.f62087j[this.O]);
                this.L.setCallback(r1Var);
            }
            p0 p0Var = this.U;
            if (p0Var != null && p0Var.h(canvas)) {
                r1Var.invalidate();
            }
        }
    }

    public final void c(boolean z10) {
        fj fjVar = this.M;
        if (fjVar != null && fjVar.w3() && this.L != null) {
            p0 p0Var = this.U;
            if (p0Var != null) {
                p0Var.f(true);
            }
            r1 r1Var = this.f62082c;
            if (z10) {
                this.L.setCallback(new a5.b(this, 10));
                this.L.setState(this.J);
                r1Var.invalidate();
                return;
            }
            this.L.setState(StateSet.NOTHING);
            r1Var.invalidate();
        }
    }

    public final void d(int i7, fj fjVar) {
        boolean z10;
        float f10;
        boolean z11;
        this.M = null;
        this.f62096s = null;
        this.f62097t = null;
        this.f62098u = null;
        this.f62089l = 0;
        this.f62090m = 0;
        this.N = false;
        if (fjVar.w3()) {
            this.M = fjVar;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f62099w = new TextPaint(1);
                this.f62100x = new TextPaint(1);
                this.f62101y = new TextPaint(1);
                this.f62102z = new TextPaint(1);
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
                this.f62084f = new CharSequence[10];
                this.f62085g = new TLRPC.User[10];
                this.h = new float[10];
                this.f62086i = new boolean[10];
                this.f62087j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f62082c);
                this.d = imageReceiver;
                imageReceiver.A1 = true;
                Paint paint = this.E;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTypeface(g0.o());
                this.v.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTextSize(g0.L(12.0f));
                TextPaint textPaint = this.v;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.f62099w.setTypeface(g0.o());
                this.f62099w.setTextSize(g0.L(12.0f));
                this.f62099w.setTextAlign(align);
                this.f62099w.setColor(-1);
                this.f62100x.setTypeface(g0.o());
                this.f62100x.setTextSize(g0.L(13.0f));
                this.A.setTextSize(g0.L(13.0f));
                this.f62101y.setTextSize(g0.L(14.0f));
                this.f62102z.setTextSize(g0.L(14.0f));
                this.f62102z.setTextAlign(align);
            }
            if (this.f62080a == null) {
                this.f62080a = new ImageReceiver[10];
                this.f62081b = new a9[10];
                this.f62088k = new boolean[10];
                int i10 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f62080a;
                    if (i10 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i10] = new ImageReceiver(this.f62082c);
                    ImageReceiver imageReceiver2 = this.f62080a[i10];
                    imageReceiver2.A1 = true;
                    imageReceiver2.K0(g0.L(12.0f));
                    this.f62081b[i10] = new a9((i6) null);
                    this.f62081b[i10].u(g0.L(18.0f));
                    this.f62087j[i10] = new Rect();
                    i10++;
                }
            }
            this.d.f22764v0 = false;
            if (this.f62083e == null) {
                this.f62083e = new nh0(2131624040, g0.L(120.0f), g0.L(120.0f));
            }
            this.d.x0(this.f62083e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) fjVar.f24073k.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f62080a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f62080a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f62081b = (a9[]) Arrays.copyOf(this.f62081b, size);
                this.f62088k = Arrays.copyOf(this.f62088k, size);
                this.f62084f = (CharSequence[]) Arrays.copyOf(this.f62084f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f62086i = Arrays.copyOf(this.f62086i, size);
                this.f62087j = (Rect[]) Arrays.copyOf(this.f62087j, size);
                this.f62085g = (TLRPC.User[]) Arrays.copyOf(this.f62085g, size);
                for (int i11 = length - 1; i11 < size; i11++) {
                    this.f62080a[i11] = new ImageReceiver(this.f62082c);
                    ImageReceiver imageReceiver3 = this.f62080a[i11];
                    imageReceiver3.A1 = true;
                    imageReceiver3.K0(g0.L(12.0f));
                    this.f62081b[i11] = new a9((i6) null);
                    this.f62081b[i11].u(g0.L(18.0f));
                    this.f62087j[i11] = new Rect();
                }
            }
            int L = g0.L(90.0f);
            int L2 = g0.L(230.0f);
            SpannableStringBuilder W2 = g0.W2(gd.N0(2131753383, "BoostingGiveawayResultsMsgWinnersSelected"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(W2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, W2.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder R2 = g0.R2(gd.K0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinnersTitle"), n6.Xc, 0, new b(this, fjVar, tL_messageMediaGiveawayResults, 0), null);
            this.R.append((CharSequence) g0.K2(R2, g0.W2("**" + tL_messageMediaGiveawayResults.winners_count + "**"), "%1$d"));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder W22 = g0.W2(gd.K0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinners"));
            this.R.append((CharSequence) W22);
            this.R.setSpan(new RelativeSizeSpan(1.05f), R2.length() + 2, W22.length() + R2.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) g0.W2(gd.G(tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), "BoostingGiveawayResultsMsgAllAndMoreWinners", new Object[0])));
                spannableStringBuilder2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.N = z10;
            if (z10) {
                spannableStringBuilder2.append((CharSequence) gd.H(' ', "BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) gd.N0(2131753385, null));
            }
            TextPaint textPaint2 = this.f62101y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f62096s = yu0.c(spannableStringBuilder, textPaint2, L2, alignment, g0.L(2.0f), truncateAt, L2, 10, true);
            this.f62097t = yu0.c(this.R, this.f62101y, L2, alignment, g0.L(2.0f), truncateAt, L2, 10, true);
            this.f62098u = yu0.c(spannableStringBuilder2, this.f62101y, L2, alignment, g0.L(3.0f), truncateAt, L2, 10, true);
            int max = Math.max(i7, L2);
            this.f62095r = max - L2;
            float f11 = max;
            float f12 = L;
            float f13 = f12 / 2.0f;
            this.d.z0((f11 / 2.0f) - f13, g0.L(70.0f) - f13, f12, f12);
            StaticLayout staticLayout = this.f62096s;
            int L3 = g0.L(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f62091n = L3;
            StaticLayout staticLayout2 = this.f62097t;
            this.f62092o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L3;
            StaticLayout staticLayout3 = this.f62098u;
            int lineBottom = this.f62089l + this.f62092o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f62089l = lineBottom;
            this.f62089l = g0.L(128.0f) + lineBottom;
            this.f62090m = max;
            if (this.N) {
                if (this.f62093p == null) {
                    this.f62093p = i5.c.g(t0.f27013b, 2131231126);
                }
                this.f62094q = gd.E((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f62093p = null;
                this.f62094q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f62094q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            float f14 = 20.0f;
            if (this.N) {
                Rect rect = this.H;
                rect.right = g0.L(20.0f) + rect.right;
            }
            Arrays.fill(this.f62088k, false);
            this.f62089l = g0.L(30.0f) + this.f62089l;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Long l10 = arrayList2.get(i12);
                i12++;
                Long l11 = l10;
                if (mp.u1(i10.f24637t0).c2(l11) != null) {
                    arrayList.add(l11);
                }
            }
            int i13 = 0;
            float f15 = 0.0f;
            while (i13 < arrayList.size()) {
                Long l12 = (Long) arrayList.get(i13);
                long longValue = l12.longValue();
                TLRPC.User c22 = mp.u1(i10.f24637t0).c2(l12);
                if (c22 != null) {
                    this.f62088k[i13] = true;
                    this.f62085g[i13] = c22;
                    f10 = f14;
                    this.f62084f[i13] = TextUtils.ellipsize(j6.m(n10.q(c22), this.f62100x.getFontMetricsInt(), false, null, 0), this.f62100x, 0.8f * f11, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f62100x;
                    CharSequence charSequence = this.f62084f[i13];
                    fArr[i13] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.h[i13] + g0.L(40.0f);
                    f15 += L4;
                    if (i13 > 0) {
                        boolean[] zArr = this.f62086i;
                        if (f15 > 0.9f * f11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zArr[i13] = z11;
                        if (z11) {
                            this.f62089l = g0.L(30.0f) + this.f62089l;
                            f15 = L4;
                        }
                    } else {
                        this.f62086i[i13] = false;
                    }
                    this.f62081b[i13].r(c22);
                    this.f62080a[i13].j0(c22, this.f62081b[i13], null);
                    this.f62080a[i13].z0(0.0f, 0.0f, g0.L(24.0f), g0.L(24.0f));
                } else {
                    f10 = f14;
                    this.f62085g[i13] = null;
                    this.f62088k[i13] = false;
                    this.f62084f[i13] = "";
                    this.f62086i[i13] = false;
                    this.h[i13] = g0.L(f10);
                    this.f62081b[i13].k(longValue, "", "", null);
                }
                i13++;
                f14 = f10;
            }
        }
    }
}
