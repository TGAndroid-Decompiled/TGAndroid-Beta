package pg;

import ag.l;
import ag.z0;
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
import bi.s0;
import java.util.ArrayList;
import java.util.Arrays;
import mg.k0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.jc;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.kp;
import org.telegram.messenger.lp;
import org.telegram.messenger.m5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.r8;
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
    public jj M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public ji.a U;
    public ImageReceiver[] f44943a;
    public r8[] f44944b;
    public final q1 f44945c;
    public ImageReceiver d;
    public bi0 e;
    public CharSequence[] f44946f;
    public TLRPC.User[] f44947g;
    public float[] h;
    public boolean[] f44948i;
    public Rect[] f44949j;
    public boolean[] f44950k;
    public int f44953n;
    public int f44954o;
    public Drawable f44955p;
    public String f44956q;
    public int f44957r;
    public StaticLayout f44958s;
    public StaticLayout f44959t;
    public StaticLayout f44960u;
    public TextPaint v;
    public TextPaint f44961w;
    public TextPaint f44962x;
    public TextPaint f44963y;
    public TextPaint f44964z;
    public int f44951l = 0;
    public int f44952m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public c(q1 q1Var) {
        this.f44945c = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i10;
        jj jjVar = this.M;
        if (jjVar != null && jjVar.w3()) {
            ji.a aVar = this.U;
            q1 q1Var = this.f44945c;
            if (aVar == null) {
                this.U = new ji.a(q1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f44959t) != null && (i10 = y3 - this.S) > 0) {
                int offsetForHorizontal = this.f44959t.getOffsetForHorizontal(staticLayout.getLineForVertical(i10 - i0.L(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.f(true);
                        clickableSpanArr[0].onClick(q1Var);
                        return true;
                    }
                    q80 q80Var = new q80(clickableSpanArr[0], null, x10, y3, 0);
                    this.U.b(q80Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        k80 b10 = q80Var.b();
                        b10.e(this.f44959t, spanStart, this.T, this.S);
                        this.f44959t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return true;
                    }
                }
                this.U.f(true);
                q1Var.invalidate();
            }
            if (action == 0) {
                int i11 = 0;
                while (true) {
                    Rect[] rectArr = this.f44949j;
                    if (i11 < rectArr.length) {
                        if (rectArr[i11].contains(x10, y3)) {
                            this.O = i11;
                            this.L.setHotspot(x10, y3);
                            this.P = true;
                            c(true);
                            return true;
                        }
                        i11++;
                    } else if (this.I.contains(x10, y3)) {
                        this.Q = true;
                        return true;
                    }
                }
            } else if (action == 1) {
                if (this.P) {
                    if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().s1(q1Var, this.O);
                    }
                    q1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    jj jjVar2 = this.M;
                    if (jjVar2 != null && jjVar2.f16337k != null) {
                        k0.d(jjVar2, new l(jjVar2, 18), new z0(3));
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

    public final void b(Canvas canvas, int i10, int i11, p6 p6Var) {
        float f7;
        TextPaint textPaint;
        float f10;
        float f11;
        kp kpVar;
        int w02;
        int i12;
        jj jjVar = this.M;
        if (jjVar != null && jjVar.w3()) {
            y yVar = this.L;
            q1 q1Var = this.f44945c;
            jc jcVar = null;
            if (yVar == null) {
                int x02 = t6.x0(null, t6.f21020i6, false);
                this.K = x02;
                y a02 = t6.a0(x02, 12, 12);
                this.L = a02;
                a02.setCallback(q1Var);
            }
            this.f44963y.setColor(t6.f21130o2.getColor());
            this.f44964z.setColor(t6.x0(null, t6.f21169q5, false));
            this.A.setColor(t6.f21130o2.getColor());
            if (this.M.P3()) {
                TextPaint textPaint2 = this.f44962x;
                int i13 = t6.Lb;
                textPaint2.setColor(t6.w0(i13, p6Var));
                this.B.setColor(t6.w0(i13, p6Var));
                this.C.setColor(t6.w0(t6.Ob, p6Var));
            } else {
                TextPaint textPaint3 = this.f44962x;
                int i14 = t6.f21318yd;
                textPaint3.setColor(t6.w0(i14, p6Var));
                this.B.setColor(t6.w0(i14, p6Var));
                this.C.setColor(t6.w0(t6.Id, p6Var));
            }
            if (this.N) {
                this.B.setColor(t6.w0(t6.Tk, p6Var));
            }
            canvas.save();
            int L = i11 - i0.L(4.0f);
            float f12 = L;
            canvas.translate(f12, i10);
            this.I.set(L, i10, this.f44952m + L, this.f44951l + i10);
            canvas.saveLayer(0.0f, 0.0f, this.f44952m, this.f44951l, this.D, 31);
            this.d.h(canvas, null);
            float f13 = this.f44952m / 2.0f;
            float L2 = i0.L(106.0f);
            int L3 = i0.L(12.0f) + this.H.width();
            int L4 = i0.L(10.0f) + this.H.height();
            this.F.set(f13 - ((i0.L(2.0f) + L3) / 2.0f), L2 - ((i0.L(2.0f) + L4) / 2.0f), ((i0.L(2.0f) + L3) / 2.0f) + f13, ((i0.L(2.0f) + L4) / 2.0f) + L2);
            canvas.drawRoundRect(this.F, i0.L(11.0f), i0.L(11.0f), this.E);
            float f14 = L3 / 2.0f;
            float f15 = L4 / 2.0f;
            this.F.set(f13 - f14, L2 - f15, f13 + f14, L2 + f15);
            canvas.drawRoundRect(this.F, i0.L(10.0f), i0.L(10.0f), this.B);
            Drawable drawable = this.f44955p;
            if (drawable != null) {
                drawable.setBounds(i0.L(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - i0.L(6.96f), i0.L(21.24f) + ((int) this.F.left), i0.L(6.96f) + ((int) this.F.centerY()));
                this.f44955p.draw(canvas);
            }
            String str = this.f44956q;
            float centerX = this.F.centerX();
            if (this.N) {
                f7 = 8.0f;
            } else {
                f7 = 0.0f;
            }
            float L5 = centerX + i0.L(f7);
            float centerY = this.F.centerY() + i0.L(4.0f);
            if (this.N) {
                textPaint = this.f44961w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, L5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, i0.L(128.0f));
            int L6 = i0.L(128.0f) + i10;
            this.S = this.f44953n + L6;
            this.T = (int) ((this.f44957r / 2.0f) + f12);
            canvas.save();
            canvas.translate(this.f44957r / 2.0f, 0.0f);
            this.f44958s.draw(canvas);
            canvas.translate(0.0f, this.f44953n);
            this.f44959t.draw(canvas);
            canvas.restore();
            float f16 = 6.0f;
            canvas.translate(0.0f, i0.L(6.0f) + this.f44954o);
            int C = m5.C(6.0f, this.f44954o, L6);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                boolean[] zArr = this.f44950k;
                if (i15 >= zArr.length) {
                    break;
                } else if (zArr[i15]) {
                    canvas.save();
                    int i17 = i15;
                    float f17 = 0.0f;
                    while (true) {
                        f11 = f16;
                        f17 += this.h[i17] + i0.L(40.0f);
                        i17++;
                        boolean[] zArr2 = this.f44950k;
                        if (i17 >= zArr2.length || this.f44948i[i17] || !zArr2[i17]) {
                            break;
                        }
                        f16 = f11;
                    }
                    float f18 = f13 - (f17 / 2.0f);
                    canvas.translate(f18, 0.0f);
                    int i18 = ((int) f18) + L;
                    int i19 = i15;
                    while (true) {
                        TLRPC.User user = this.f44947g[i19];
                        if (this.M.P3()) {
                            w02 = t6.w0(t6.Lb, p6Var);
                        } else {
                            int e = h20.e(user);
                            if (e < 7) {
                                w02 = t6.w0(t6.f21188r8[e], p6Var);
                            } else {
                                lp lpVar = vp.r1(d20.f15147s0).f18888r4;
                                if (lpVar == null) {
                                    kpVar = jcVar;
                                } else {
                                    kpVar = lpVar.d(e);
                                }
                                if (kpVar != 0) {
                                    w02 = kpVar.f();
                                } else {
                                    w02 = t6.w0(t6.f21188r8[0], p6Var);
                                }
                            }
                        }
                        int i20 = this.O;
                        if (i20 >= 0 && i20 == i19) {
                            i12 = w02;
                        } else {
                            i12 = i16;
                        }
                        this.f44962x.setColor(w02);
                        this.C.setColor(w02);
                        this.C.setAlpha(25);
                        this.f44943a[i19].h(canvas, jcVar);
                        CharSequence charSequence = this.f44946f[i19];
                        int i21 = i18;
                        canvas.drawText(charSequence, 0, charSequence.length(), i0.L(30.0f), i0.L(16.0f), this.f44962x);
                        this.G.set(0.0f, 0.0f, this.h[i19] + i0.L(40.0f), i0.L(24.0f));
                        canvas.drawRoundRect(this.G, i0.L(12.0f), i0.L(12.0f), this.C);
                        float f19 = i21;
                        this.f44949j[i19].set(i21, C, (int) (this.G.width() + f19), i0.L(24.0f) + C);
                        canvas.translate(this.G.width() + i0.L(f11), 0.0f);
                        i18 = (int) (this.G.width() + i0.L(f11) + f19);
                        i19++;
                        boolean[] zArr3 = this.f44950k;
                        if (i19 >= zArr3.length || this.f44948i[i19] || !zArr3[i19]) {
                            break;
                        }
                        i16 = i12;
                        jcVar = null;
                    }
                    canvas.restore();
                    canvas.translate(0.0f, i0.L(30.0f));
                    C += i0.L(30.0f);
                    i15 = i19;
                    i16 = i12;
                    jcVar = null;
                    f16 = f11;
                } else {
                    i15++;
                    jcVar = null;
                }
            }
            canvas.translate(0.0f, i0.L(f16));
            canvas.save();
            canvas.translate(this.f44957r / 2.0f, 0.0f);
            this.f44960u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (t6.I.q()) {
                    f10 = 0.12f;
                } else {
                    f10 = 0.1f;
                }
                int r12 = t6.r1(f10, i16);
                if (this.K != r12) {
                    y yVar2 = this.L;
                    this.K = r12;
                    t6.H1(yVar2, r12, true);
                }
                this.L.setBounds(this.f44949j[this.O]);
                this.L.setCallback(q1Var);
            }
            ji.a aVar = this.U;
            if (aVar != null && aVar.h(canvas)) {
                q1Var.invalidate();
            }
        }
    }

    public final void c(boolean z10) {
        jj jjVar = this.M;
        if (jjVar != null && jjVar.w3() && this.L != null) {
            ji.a aVar = this.U;
            if (aVar != null) {
                aVar.f(true);
            }
            q1 q1Var = this.f44945c;
            if (z10) {
                this.L.setCallback(new s0(this, 7));
                this.L.setState(this.J);
                q1Var.invalidate();
                return;
            }
            this.L.setState(StateSet.NOTHING);
            q1Var.invalidate();
        }
    }

    public final void d(int i10, jj jjVar) {
        boolean z10;
        float f7;
        boolean z11;
        this.M = null;
        this.f44958s = null;
        this.f44959t = null;
        this.f44960u = null;
        this.f44951l = 0;
        this.f44952m = 0;
        this.N = false;
        if (jjVar.w3()) {
            this.M = jjVar;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f44961w = new TextPaint(1);
                this.f44962x = new TextPaint(1);
                this.f44963y = new TextPaint(1);
                this.f44964z = new TextPaint(1);
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
                this.f44946f = new CharSequence[10];
                this.f44947g = new TLRPC.User[10];
                this.h = new float[10];
                this.f44948i = new boolean[10];
                this.f44949j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f44945c);
                this.d = imageReceiver;
                imageReceiver.f14424z1 = true;
                Paint paint = this.E;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTypeface(i0.o());
                this.v.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTextSize(i0.L(12.0f));
                TextPaint textPaint = this.v;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.f44961w.setTypeface(i0.o());
                this.f44961w.setTextSize(i0.L(12.0f));
                this.f44961w.setTextAlign(align);
                this.f44961w.setColor(-1);
                this.f44962x.setTypeface(i0.o());
                this.f44962x.setTextSize(i0.L(13.0f));
                this.A.setTextSize(i0.L(13.0f));
                this.f44963y.setTextSize(i0.L(14.0f));
                this.f44964z.setTextSize(i0.L(14.0f));
                this.f44964z.setTextAlign(align);
            }
            if (this.f44943a == null) {
                this.f44943a = new ImageReceiver[10];
                this.f44944b = new r8[10];
                this.f44950k = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f44943a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.f44945c);
                    ImageReceiver imageReceiver2 = this.f44943a[i11];
                    imageReceiver2.f14424z1 = true;
                    imageReceiver2.J0(i0.L(12.0f));
                    this.f44944b[i11] = new r8((p6) null);
                    this.f44944b[i11].u(i0.L(18.0f));
                    this.f44949j[i11] = new Rect();
                    i11++;
                }
            }
            this.d.f14410u0 = false;
            if (this.e == null) {
                this.e = new bi0(2131624038, i0.L(120.0f), i0.L(120.0f));
            }
            this.d.w0(this.e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) jjVar.f16337k.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f44943a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f44943a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f44944b = (r8[]) Arrays.copyOf(this.f44944b, size);
                this.f44950k = Arrays.copyOf(this.f44950k, size);
                this.f44946f = (CharSequence[]) Arrays.copyOf(this.f44946f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f44948i = Arrays.copyOf(this.f44948i, size);
                this.f44949j = (Rect[]) Arrays.copyOf(this.f44949j, size);
                this.f44947g = (TLRPC.User[]) Arrays.copyOf(this.f44947g, size);
                for (int i12 = length - 1; i12 < size; i12++) {
                    this.f44943a[i12] = new ImageReceiver(this.f44945c);
                    ImageReceiver imageReceiver3 = this.f44943a[i12];
                    imageReceiver3.f14424z1 = true;
                    imageReceiver3.J0(i0.L(12.0f));
                    this.f44944b[i12] = new r8((p6) null);
                    this.f44944b[i12].u(i0.L(18.0f));
                    this.f44949j[i12] = new Rect();
                }
            }
            int L = i0.L(90.0f);
            int L2 = i0.L(230.0f);
            SpannableStringBuilder W2 = i0.W2(cd.L0(2131753386, "BoostingGiveawayResultsMsgWinnersSelected"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(W2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, W2.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder R2 = i0.R2(cd.J0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinnersTitle"), t6.Uc, 0, new b(this, jjVar, tL_messageMediaGiveawayResults, 0), null);
            this.R.append((CharSequence) i0.J2(R2, i0.W2("**" + tL_messageMediaGiveawayResults.winners_count + "**"), "%1$d"));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder W22 = i0.W2(cd.J0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinners"));
            this.R.append((CharSequence) W22);
            this.R.setSpan(new RelativeSizeSpan(1.05f), R2.length() + 2, W22.length() + R2.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) i0.W2(cd.G(tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), "BoostingGiveawayResultsMsgAllAndMoreWinners", new Object[0])));
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
                spannableStringBuilder2.append((CharSequence) cd.H(' ', "BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) cd.L0(2131753388, null));
            }
            TextPaint textPaint2 = this.f44963y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f44958s = ov0.c(spannableStringBuilder, textPaint2, L2, alignment, i0.L(2.0f), truncateAt, L2, 10, true);
            this.f44959t = ov0.c(this.R, this.f44963y, L2, alignment, i0.L(2.0f), truncateAt, L2, 10, true);
            this.f44960u = ov0.c(spannableStringBuilder2, this.f44963y, L2, alignment, i0.L(3.0f), truncateAt, L2, 10, true);
            int max = Math.max(i10, L2);
            this.f44957r = max - L2;
            float f10 = max;
            float f11 = L;
            float f12 = f11 / 2.0f;
            this.d.y0((f10 / 2.0f) - f12, i0.L(70.0f) - f12, f11, f11);
            StaticLayout staticLayout = this.f44958s;
            int L3 = i0.L(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f44953n = L3;
            StaticLayout staticLayout2 = this.f44959t;
            this.f44954o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L3;
            StaticLayout staticLayout3 = this.f44960u;
            int lineBottom = this.f44951l + this.f44954o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f44951l = lineBottom;
            this.f44951l = i0.L(128.0f) + lineBottom;
            this.f44952m = max;
            if (this.N) {
                if (this.f44955p == null) {
                    this.f44955p = i0.a.f(w0.f19025b, 2131231124);
                }
                this.f44956q = cd.E((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f44955p = null;
                this.f44956q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f44956q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            float f13 = 20.0f;
            if (this.N) {
                Rect rect = this.H;
                rect.right = i0.L(20.0f) + rect.right;
            }
            Arrays.fill(this.f44950k, false);
            this.f44951l = i0.L(30.0f) + this.f44951l;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Long l4 = arrayList2.get(i13);
                i13++;
                Long l10 = l4;
                if (vp.r1(d20.f15147s0).Z1(l10) != null) {
                    arrayList.add(l10);
                }
            }
            int i14 = 0;
            float f14 = 0.0f;
            while (i14 < arrayList.size()) {
                Long l11 = (Long) arrayList.get(i14);
                long longValue = l11.longValue();
                TLRPC.User Z1 = vp.r1(d20.f15147s0).Z1(l11);
                if (Z1 != null) {
                    this.f44950k[i14] = true;
                    this.f44947g[i14] = Z1;
                    f7 = f13;
                    this.f44946f[i14] = TextUtils.ellipsize(k6.m(h20.p(Z1), this.f44962x.getFontMetricsInt(), false, null, 0), this.f44962x, 0.8f * f10, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f44962x;
                    CharSequence charSequence = this.f44946f[i14];
                    fArr[i14] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.h[i14] + i0.L(40.0f);
                    f14 += L4;
                    if (i14 > 0) {
                        boolean[] zArr = this.f44948i;
                        if (f14 > 0.9f * f10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zArr[i14] = z11;
                        if (z11) {
                            this.f44951l = i0.L(30.0f) + this.f44951l;
                            f14 = L4;
                        }
                    } else {
                        this.f44948i[i14] = false;
                    }
                    this.f44944b[i14].r(Z1);
                    this.f44943a[i14].i0(Z1, this.f44944b[i14], null);
                    this.f44943a[i14].y0(0.0f, 0.0f, i0.L(24.0f), i0.L(24.0f));
                } else {
                    f7 = f13;
                    this.f44947g[i14] = null;
                    this.f44950k[i14] = false;
                    this.f44946f[i14] = "";
                    this.f44948i[i14] = false;
                    this.h[i14] = i0.L(f7);
                    this.f44944b[i14].k(longValue, "", "", null);
                }
                i14++;
                f13 = f7;
            }
        }
    }
}
