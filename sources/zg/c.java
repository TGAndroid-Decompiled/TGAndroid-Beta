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
import n2.o0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.cp;
import org.telegram.messenger.dp;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.zu0;
import ug.z;
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
    public gj M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public o0 U;
    public ImageReceiver[] f61997a;
    public b9[] f61998b;
    public final r1 f61999c;
    public ImageReceiver d;
    public oh0 f62000e;
    public CharSequence[] f62001f;
    public TLRPC.User[] f62002g;
    public float[] h;
    public boolean[] f62003i;
    public Rect[] f62004j;
    public boolean[] f62005k;
    public int f62008n;
    public int f62009o;
    public Drawable f62010p;
    public String f62011q;
    public int f62012r;
    public StaticLayout f62013s;
    public StaticLayout f62014t;
    public StaticLayout f62015u;
    public TextPaint v;
    public TextPaint f62016w;
    public TextPaint f62017x;
    public TextPaint f62018y;
    public TextPaint f62019z;
    public int f62006l = 0;
    public int f62007m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public c(r1 r1Var) {
        this.f61999c = r1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i7;
        gj gjVar = this.M;
        if (gjVar != null && gjVar.w3()) {
            o0 o0Var = this.U;
            r1 r1Var = this.f61999c;
            if (o0Var == null) {
                this.U = new o0(r1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f62014t) != null && (i7 = y10 - this.S) > 0) {
                int offsetForHorizontal = this.f62014t.getOffsetForHorizontal(staticLayout.getLineForVertical(i7 - g0.L(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.f(true);
                        clickableSpanArr[0].onClick(r1Var);
                        return true;
                    }
                    n80 n80Var = new n80(clickableSpanArr[0], null, x10, y10, 0);
                    this.U.b(n80Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        h80 b10 = n80Var.b();
                        b10.e(this.f62014t, spanStart, this.T, this.S);
                        this.f62014t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
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
                    Rect[] rectArr = this.f62004j;
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
                    gj gjVar2 = this.M;
                    if (gjVar2 != null && gjVar2.f24213k != null) {
                        s.d(gjVar2, new z(gjVar2, 3), new pg.c(1));
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

    public final void b(Canvas canvas, int i7, int i10, h6 h6Var) {
        float f10;
        TextPaint textPaint;
        float f11;
        float f12;
        cp cpVar;
        int w02;
        int i11;
        gj gjVar = this.M;
        if (gjVar != null && gjVar.w3()) {
            y yVar = this.L;
            r1 r1Var = this.f61999c;
            hc hcVar = null;
            if (yVar == null) {
                int x02 = m6.x0(null, m6.f29473i6, false);
                this.K = x02;
                y a02 = m6.a0(x02, 12, 12);
                this.L = a02;
                a02.setCallback(r1Var);
            }
            this.f62018y.setColor(m6.f29578o2.getColor());
            this.f62019z.setColor(m6.x0(null, m6.f29620q5, false));
            this.A.setColor(m6.f29578o2.getColor());
            if (this.M.P3()) {
                TextPaint textPaint2 = this.f62017x;
                int i12 = m6.Ob;
                textPaint2.setColor(m6.w0(i12, h6Var));
                this.B.setColor(m6.w0(i12, h6Var));
                this.C.setColor(m6.w0(m6.Rb, h6Var));
            } else {
                TextPaint textPaint3 = this.f62017x;
                int i13 = m6.Bd;
                textPaint3.setColor(m6.w0(i13, h6Var));
                this.B.setColor(m6.w0(i13, h6Var));
                this.C.setColor(m6.w0(m6.Ld, h6Var));
            }
            if (this.N) {
                this.B.setColor(m6.w0(m6.Wk, h6Var));
            }
            canvas.save();
            int L = i10 - g0.L(4.0f);
            float f13 = L;
            canvas.translate(f13, i7);
            this.I.set(L, i7, this.f62007m + L, this.f62006l + i7);
            canvas.saveLayer(0.0f, 0.0f, this.f62007m, this.f62006l, this.D, 31);
            this.d.h(canvas, null);
            float f14 = this.f62007m / 2.0f;
            float L2 = g0.L(106.0f);
            int L3 = g0.L(12.0f) + this.H.width();
            int L4 = g0.L(10.0f) + this.H.height();
            this.F.set(f14 - ((g0.L(2.0f) + L3) / 2.0f), L2 - ((g0.L(2.0f) + L4) / 2.0f), ((g0.L(2.0f) + L3) / 2.0f) + f14, ((g0.L(2.0f) + L4) / 2.0f) + L2);
            canvas.drawRoundRect(this.F, g0.L(11.0f), g0.L(11.0f), this.E);
            float f15 = L3 / 2.0f;
            float f16 = L4 / 2.0f;
            this.F.set(f14 - f15, L2 - f16, f14 + f15, L2 + f16);
            canvas.drawRoundRect(this.F, g0.L(10.0f), g0.L(10.0f), this.B);
            Drawable drawable = this.f62010p;
            if (drawable != null) {
                drawable.setBounds(g0.L(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - g0.L(6.96f), g0.L(21.24f) + ((int) this.F.left), g0.L(6.96f) + ((int) this.F.centerY()));
                this.f62010p.draw(canvas);
            }
            String str = this.f62011q;
            float centerX = this.F.centerX();
            if (this.N) {
                f10 = 8.0f;
            } else {
                f10 = 0.0f;
            }
            float L5 = centerX + g0.L(f10);
            float centerY = this.F.centerY() + g0.L(4.0f);
            if (this.N) {
                textPaint = this.f62016w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, L5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, g0.L(128.0f));
            int L6 = g0.L(128.0f) + i7;
            this.S = this.f62008n + L6;
            this.T = (int) ((this.f62012r / 2.0f) + f13);
            canvas.save();
            canvas.translate(this.f62012r / 2.0f, 0.0f);
            this.f62013s.draw(canvas);
            canvas.translate(0.0f, this.f62008n);
            this.f62014t.draw(canvas);
            canvas.restore();
            float f17 = 6.0f;
            canvas.translate(0.0f, g0.L(6.0f) + this.f62009o);
            int C = f3.C(6.0f, this.f62009o, L6);
            int i14 = 0;
            int i15 = 0;
            while (true) {
                boolean[] zArr = this.f62005k;
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
                        boolean[] zArr2 = this.f62005k;
                        if (i16 >= zArr2.length || this.f62003i[i16] || !zArr2[i16]) {
                            break;
                        }
                        f17 = f12;
                    }
                    float f19 = f14 - (f18 / 2.0f);
                    canvas.translate(f19, 0.0f);
                    int i17 = ((int) f19) + L;
                    int i18 = i14;
                    while (true) {
                        TLRPC.User user = this.f62002g[i18];
                        if (this.M.P3()) {
                            w02 = m6.w0(m6.Ob, h6Var);
                        } else {
                            int f20 = p10.f(user);
                            if (f20 < 7) {
                                w02 = m6.w0(m6.f29642r8[f20], h6Var);
                            } else {
                                dp dpVar = np.u1(k10.f24968t0).f25966t4;
                                if (dpVar == null) {
                                    cpVar = hcVar;
                                } else {
                                    cpVar = dpVar.d(f20);
                                }
                                if (cpVar != 0) {
                                    w02 = cpVar.f();
                                } else {
                                    w02 = m6.w0(m6.f29642r8[0], h6Var);
                                }
                            }
                        }
                        int i19 = this.O;
                        if (i19 >= 0 && i19 == i18) {
                            i11 = w02;
                        } else {
                            i11 = i15;
                        }
                        this.f62017x.setColor(w02);
                        this.C.setColor(w02);
                        this.C.setAlpha(25);
                        this.f61997a[i18].h(canvas, hcVar);
                        CharSequence charSequence = this.f62001f[i18];
                        int i20 = i17;
                        canvas.drawText(charSequence, 0, charSequence.length(), g0.L(30.0f), g0.L(16.0f), this.f62017x);
                        this.G.set(0.0f, 0.0f, this.h[i18] + g0.L(40.0f), g0.L(24.0f));
                        canvas.drawRoundRect(this.G, g0.L(12.0f), g0.L(12.0f), this.C);
                        float f21 = i20;
                        this.f62004j[i18].set(i20, C, (int) (this.G.width() + f21), g0.L(24.0f) + C);
                        canvas.translate(this.G.width() + g0.L(f12), 0.0f);
                        i17 = (int) (this.G.width() + g0.L(f12) + f21);
                        i18++;
                        boolean[] zArr3 = this.f62005k;
                        if (i18 >= zArr3.length || this.f62003i[i18] || !zArr3[i18]) {
                            break;
                        }
                        i15 = i11;
                        hcVar = null;
                    }
                    canvas.restore();
                    canvas.translate(0.0f, g0.L(30.0f));
                    C += g0.L(30.0f);
                    i14 = i18;
                    i15 = i11;
                    hcVar = null;
                    f17 = f12;
                } else {
                    i14++;
                    hcVar = null;
                }
            }
            canvas.translate(0.0f, g0.L(f17));
            canvas.save();
            canvas.translate(this.f62012r / 2.0f, 0.0f);
            this.f62015u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (m6.I.q()) {
                    f11 = 0.12f;
                } else {
                    f11 = 0.1f;
                }
                int r12 = m6.r1(f11, i15);
                if (this.K != r12) {
                    y yVar2 = this.L;
                    this.K = r12;
                    m6.H1(yVar2, r12, true);
                }
                this.L.setBounds(this.f62004j[this.O]);
                this.L.setCallback(r1Var);
            }
            o0 o0Var = this.U;
            if (o0Var != null && o0Var.h(canvas)) {
                r1Var.invalidate();
            }
        }
    }

    public final void c(boolean z10) {
        gj gjVar = this.M;
        if (gjVar != null && gjVar.w3() && this.L != null) {
            o0 o0Var = this.U;
            if (o0Var != null) {
                o0Var.f(true);
            }
            r1 r1Var = this.f61999c;
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

    public final void d(int i7, gj gjVar) {
        boolean z10;
        float f10;
        boolean z11;
        this.M = null;
        this.f62013s = null;
        this.f62014t = null;
        this.f62015u = null;
        this.f62006l = 0;
        this.f62007m = 0;
        this.N = false;
        if (gjVar.w3()) {
            this.M = gjVar;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f62016w = new TextPaint(1);
                this.f62017x = new TextPaint(1);
                this.f62018y = new TextPaint(1);
                this.f62019z = new TextPaint(1);
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
                this.f62001f = new CharSequence[10];
                this.f62002g = new TLRPC.User[10];
                this.h = new float[10];
                this.f62003i = new boolean[10];
                this.f62004j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f61999c);
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
                this.f62016w.setTypeface(g0.o());
                this.f62016w.setTextSize(g0.L(12.0f));
                this.f62016w.setTextAlign(align);
                this.f62016w.setColor(-1);
                this.f62017x.setTypeface(g0.o());
                this.f62017x.setTextSize(g0.L(13.0f));
                this.A.setTextSize(g0.L(13.0f));
                this.f62018y.setTextSize(g0.L(14.0f));
                this.f62019z.setTextSize(g0.L(14.0f));
                this.f62019z.setTextAlign(align);
            }
            if (this.f61997a == null) {
                this.f61997a = new ImageReceiver[10];
                this.f61998b = new b9[10];
                this.f62005k = new boolean[10];
                int i10 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f61997a;
                    if (i10 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i10] = new ImageReceiver(this.f61999c);
                    ImageReceiver imageReceiver2 = this.f61997a[i10];
                    imageReceiver2.A1 = true;
                    imageReceiver2.J0(g0.L(12.0f));
                    this.f61998b[i10] = new b9((h6) null);
                    this.f61998b[i10].u(g0.L(18.0f));
                    this.f62004j[i10] = new Rect();
                    i10++;
                }
            }
            this.d.f22697v0 = false;
            if (this.f62000e == null) {
                this.f62000e = new oh0(2131624040, g0.L(120.0f), g0.L(120.0f));
            }
            this.d.w0(this.f62000e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) gjVar.f24213k.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f61997a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f61997a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f61998b = (b9[]) Arrays.copyOf(this.f61998b, size);
                this.f62005k = Arrays.copyOf(this.f62005k, size);
                this.f62001f = (CharSequence[]) Arrays.copyOf(this.f62001f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f62003i = Arrays.copyOf(this.f62003i, size);
                this.f62004j = (Rect[]) Arrays.copyOf(this.f62004j, size);
                this.f62002g = (TLRPC.User[]) Arrays.copyOf(this.f62002g, size);
                for (int i11 = length - 1; i11 < size; i11++) {
                    this.f61997a[i11] = new ImageReceiver(this.f61999c);
                    ImageReceiver imageReceiver3 = this.f61997a[i11];
                    imageReceiver3.A1 = true;
                    imageReceiver3.J0(g0.L(12.0f));
                    this.f61998b[i11] = new b9((h6) null);
                    this.f61998b[i11].u(g0.L(18.0f));
                    this.f62004j[i11] = new Rect();
                }
            }
            int L = g0.L(90.0f);
            int L2 = g0.L(230.0f);
            SpannableStringBuilder W2 = g0.W2(hd.N0(2131753383, "BoostingGiveawayResultsMsgWinnersSelected"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(W2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, W2.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder R2 = g0.R2(hd.K0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinnersTitle"), m6.Xc, 0, new b(this, gjVar, tL_messageMediaGiveawayResults, 0), null);
            this.R.append((CharSequence) g0.K2(R2, g0.W2("**" + tL_messageMediaGiveawayResults.winners_count + "**"), "%1$d"));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder W22 = g0.W2(hd.K0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinners"));
            this.R.append((CharSequence) W22);
            this.R.setSpan(new RelativeSizeSpan(1.05f), R2.length() + 2, W22.length() + R2.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) g0.W2(hd.G(tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), "BoostingGiveawayResultsMsgAllAndMoreWinners", new Object[0])));
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
                spannableStringBuilder2.append((CharSequence) hd.H(' ', "BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) hd.N0(2131753385, null));
            }
            TextPaint textPaint2 = this.f62018y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f62013s = zu0.c(spannableStringBuilder, textPaint2, L2, alignment, g0.L(2.0f), truncateAt, L2, 10, true);
            this.f62014t = zu0.c(this.R, this.f62018y, L2, alignment, g0.L(2.0f), truncateAt, L2, 10, true);
            this.f62015u = zu0.c(spannableStringBuilder2, this.f62018y, L2, alignment, g0.L(3.0f), truncateAt, L2, 10, true);
            int max = Math.max(i7, L2);
            this.f62012r = max - L2;
            float f11 = max;
            float f12 = L;
            float f13 = f12 / 2.0f;
            this.d.y0((f11 / 2.0f) - f13, g0.L(70.0f) - f13, f12, f12);
            StaticLayout staticLayout = this.f62013s;
            int L3 = g0.L(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f62008n = L3;
            StaticLayout staticLayout2 = this.f62014t;
            this.f62009o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L3;
            StaticLayout staticLayout3 = this.f62015u;
            int lineBottom = this.f62006l + this.f62009o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f62006l = lineBottom;
            this.f62006l = g0.L(128.0f) + lineBottom;
            this.f62007m = max;
            if (this.N) {
                if (this.f62010p == null) {
                    this.f62010p = i5.c.g(t0.f26931b, 2131231124);
                }
                this.f62011q = hd.E((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f62010p = null;
                this.f62011q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f62011q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            float f14 = 20.0f;
            if (this.N) {
                Rect rect = this.H;
                rect.right = g0.L(20.0f) + rect.right;
            }
            Arrays.fill(this.f62005k, false);
            this.f62006l = g0.L(30.0f) + this.f62006l;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Long l10 = arrayList2.get(i12);
                i12++;
                Long l11 = l10;
                if (np.u1(k10.f24968t0).c2(l11) != null) {
                    arrayList.add(l11);
                }
            }
            int i13 = 0;
            float f15 = 0.0f;
            while (i13 < arrayList.size()) {
                Long l12 = (Long) arrayList.get(i13);
                long longValue = l12.longValue();
                TLRPC.User c22 = np.u1(k10.f24968t0).c2(l12);
                if (c22 != null) {
                    this.f62005k[i13] = true;
                    this.f62002g[i13] = c22;
                    f10 = f14;
                    this.f62001f[i13] = TextUtils.ellipsize(j6.m(p10.q(c22), this.f62017x.getFontMetricsInt(), false, null, 0), this.f62017x, 0.8f * f11, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f62017x;
                    CharSequence charSequence = this.f62001f[i13];
                    fArr[i13] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.h[i13] + g0.L(40.0f);
                    f15 += L4;
                    if (i13 > 0) {
                        boolean[] zArr = this.f62003i;
                        if (f15 > 0.9f * f11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zArr[i13] = z11;
                        if (z11) {
                            this.f62006l = g0.L(30.0f) + this.f62006l;
                            f15 = L4;
                        }
                    } else {
                        this.f62003i[i13] = false;
                    }
                    this.f61998b[i13].r(c22);
                    this.f61997a[i13].i0(c22, this.f61998b[i13], null);
                    this.f61997a[i13].y0(0.0f, 0.0f, g0.L(24.0f), g0.L(24.0f));
                } else {
                    f10 = f14;
                    this.f62002g[i13] = null;
                    this.f62005k[i13] = false;
                    this.f62001f[i13] = "";
                    this.f62003i[i13] = false;
                    this.h[i13] = g0.L(f10);
                    this.f61998b[i13].k(longValue, "", "", null);
                }
                i13++;
                f14 = f10;
            }
        }
    }
}
