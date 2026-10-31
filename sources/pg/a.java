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
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import bi.s0;
import c3.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import mg.k0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.kp;
import org.telegram.messenger.lp;
import org.telegram.messenger.m5;
import org.telegram.messenger.ui;
import org.telegram.messenger.v5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.r8;
public final class a {
    public static final HashMap Y;
    public StaticLayout A;
    public TextPaint B;
    public TextPaint C;
    public TextPaint D;
    public TextPaint E;
    public TextPaint F;
    public Paint G;
    public TextPaint H;
    public Paint I;
    public Paint J;
    public Paint K;
    public Paint L;
    public RectF M;
    public RectF N;
    public Rect O;
    public Rect P;
    public int[] Q;
    public int R;
    public y S;
    public jj T;
    public boolean U;
    public ImageReceiver[] f44918a;
    public r8[] f44919b;
    public final q1 f44920c;
    public ImageReceiver d;
    public CharSequence[] e;
    public TLRPC.Chat[] f44921f;
    public float[] f44922g;
    public boolean[] h;
    public Rect[] f44923i;
    public boolean[] f44924j;
    public int f44927m;
    public float f44928n;
    public String f44929o;
    public int f44930p;
    public int f44931q;
    public int f44932r;
    public int f44933s;
    public Drawable f44934t;
    public String f44935u;
    public int v;
    public StaticLayout f44936w;
    public StaticLayout f44937x;
    public StaticLayout f44938y;
    public StaticLayout f44939z;
    public int f44925k = 0;
    public int f44926l = 0;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;

    static {
        HashMap hashMap = new HashMap();
        Y = hashMap;
        i0.w(1, hashMap, "1⃣", 3, "2⃣");
        i0.w(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public a(q1 q1Var) {
        this.f44920c = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        jj jjVar = this.T;
        if (jjVar != null && jjVar.u3()) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.f44923i;
                    if (i10 < rectArr.length) {
                        if (rectArr[i10].contains(x10, y3)) {
                            this.V = i10;
                            this.S.setHotspot(x10, y3);
                            this.W = true;
                            c(true);
                            return true;
                        }
                        i10++;
                    } else if (this.P.contains(x10, y3)) {
                        this.X = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.W) {
                    q1 q1Var = this.f44920c;
                    if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().s1(q1Var, this.V);
                    }
                    q1Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    jj jjVar2 = this.T;
                    if (jjVar2 != null && jjVar2.f16337k != null) {
                        k0.d(jjVar2, new l(jjVar2, 18), new z0(3));
                        return false;
                    }
                }
            } else if (motionEvent.getAction() != 2 && motionEvent.getAction() == 3) {
                if (this.W) {
                    c(false);
                }
                this.W = false;
                this.X = false;
            }
        }
        return false;
    }

    public final void b(Canvas canvas, int i10, int i11, p6 p6Var) {
        float f7;
        TextPaint textPaint;
        float f10;
        float f11;
        float f12;
        kp d;
        int w02;
        int i12;
        Canvas canvas2 = canvas;
        jj jjVar = this.T;
        if (jjVar != null && jjVar.u3()) {
            y yVar = this.S;
            q1 q1Var = this.f44920c;
            int i13 = 0;
            if (yVar == null) {
                int x02 = t6.x0(null, t6.f21020i6, false);
                this.R = x02;
                y a02 = t6.a0(x02, 12, 12);
                this.S = a02;
                a02.setCallback(q1Var);
            }
            this.E.setColor(t6.f21130o2.getColor());
            this.F.setColor(t6.r1(0.45f, t6.f21130o2.getColor()));
            this.G.setColor(t6.r1(0.15f, t6.f21130o2.getColor()));
            this.H.setColor(t6.f21130o2.getColor());
            if (this.T.P3()) {
                TextPaint textPaint2 = this.D;
                int i14 = t6.Lb;
                textPaint2.setColor(t6.w0(i14, p6Var));
                this.I.setColor(t6.w0(i14, p6Var));
                this.J.setColor(t6.w0(t6.Ob, p6Var));
            } else {
                TextPaint textPaint3 = this.D;
                int i15 = t6.f21318yd;
                textPaint3.setColor(t6.w0(i15, p6Var));
                this.I.setColor(t6.w0(i15, p6Var));
                this.J.setColor(t6.w0(t6.Id, p6Var));
            }
            if (this.U) {
                this.I.setColor(t6.w0(t6.Tk, p6Var));
            }
            canvas2.save();
            int L = i11 - org.telegram.messenger.i0.L(4.0f);
            canvas2.translate(L, i10);
            this.P.set(L, i10, this.f44926l + L, this.f44925k + i10);
            canvas2.saveLayer(0.0f, 0.0f, this.f44926l, this.f44925k, this.K, 31);
            this.d.h(canvas2, null);
            float f13 = this.f44926l / 2.0f;
            float L2 = org.telegram.messenger.i0.L(106.0f);
            int L3 = org.telegram.messenger.i0.L(12.0f) + this.O.width();
            int L4 = org.telegram.messenger.i0.L(10.0f) + this.O.height();
            this.M.set(f13 - ((org.telegram.messenger.i0.L(2.0f) + L3) / 2.0f), L2 - ((org.telegram.messenger.i0.L(2.0f) + L4) / 2.0f), ((org.telegram.messenger.i0.L(2.0f) + L3) / 2.0f) + f13, ((org.telegram.messenger.i0.L(2.0f) + L4) / 2.0f) + L2);
            canvas2.drawRoundRect(this.M, org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), this.L);
            float f14 = L3 / 2.0f;
            float f15 = L4 / 2.0f;
            this.M.set(f13 - f14, L2 - f15, f13 + f14, L2 + f15);
            canvas2.drawRoundRect(this.M, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), this.I);
            Drawable drawable = this.f44934t;
            if (drawable != null) {
                drawable.setBounds(org.telegram.messenger.i0.L(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - org.telegram.messenger.i0.L(6.96f), org.telegram.messenger.i0.L(21.24f) + ((int) this.M.left), org.telegram.messenger.i0.L(6.96f) + ((int) this.M.centerY()));
                this.f44934t.draw(canvas2);
            }
            String str = this.f44935u;
            float centerX = this.M.centerX();
            if (this.U) {
                f7 = 8.0f;
            } else {
                f7 = 0.0f;
            }
            float L5 = centerX + org.telegram.messenger.i0.L(f7);
            float centerY = this.M.centerY() + org.telegram.messenger.i0.L(4.0f);
            if (this.U) {
                textPaint = this.C;
            } else {
                textPaint = this.B;
            }
            canvas2.drawText(str, L5, centerY, textPaint);
            canvas2.restore();
            canvas2.translate(0.0f, org.telegram.messenger.i0.L(128.0f));
            int L6 = org.telegram.messenger.i0.L(128.0f) + i10;
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.f44936w.draw(canvas2);
            canvas2.translate(0.0f, this.f44930p);
            float f16 = 6.0f;
            if (this.f44937x != null) {
                canvas2.restore();
                canvas2.save();
                float L7 = (this.f44930p + this.f44927m) - org.telegram.messenger.i0.L(6.0f);
                float f17 = this.f44926l / 2.0f;
                canvas2.drawText(this.f44929o, f17, L7, this.F);
                f10 = 16.0f;
                canvas2.drawLine(org.telegram.messenger.i0.L(17.0f), L7 - org.telegram.messenger.i0.L(4.0f), (f17 - (this.f44928n / 2.0f)) - org.telegram.messenger.i0.L(6.0f), L7 - org.telegram.messenger.i0.L(4.0f), this.G);
                canvas2 = canvas;
                canvas2.drawLine(org.telegram.messenger.i0.L(6.0f) + (this.f44928n / 2.0f) + f17, L7 - org.telegram.messenger.i0.L(4.0f), this.f44926l - org.telegram.messenger.i0.L(16.0f), L7 - org.telegram.messenger.i0.L(4.0f), this.G);
                canvas2.translate((this.f44926l - this.f44937x.getWidth()) / 2.0f, this.f44930p);
                this.f44937x.draw(canvas2);
                canvas2.restore();
                canvas2.save();
                canvas2.translate(this.v / 2.0f, this.f44927m + this.f44930p);
            } else {
                f10 = 16.0f;
            }
            this.f44938y.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, org.telegram.messenger.i0.L(6.0f) + this.f44931q);
            int C = m5.C(6.0f, this.f44931q, L6);
            int i16 = 0;
            int i17 = 0;
            while (true) {
                boolean[] zArr = this.f44924j;
                if (i16 >= zArr.length) {
                    break;
                } else if (zArr[i16]) {
                    canvas2.save();
                    int i18 = i16;
                    float f18 = 0.0f;
                    while (true) {
                        f12 = f16;
                        f18 += this.f44922g[i18] + org.telegram.messenger.i0.L(40.0f);
                        i18++;
                        boolean[] zArr2 = this.f44924j;
                        if (i18 >= zArr2.length || this.h[i18] || !zArr2[i18]) {
                            break;
                        }
                        f16 = f12;
                    }
                    float f19 = f13 - (f18 / 2.0f);
                    canvas2.translate(f19, 0.0f);
                    int i19 = ((int) f19) + L;
                    int i20 = i16;
                    while (true) {
                        TLRPC.Chat chat = this.f44921f[i20];
                        if (this.T.P3()) {
                            w02 = t6.w0(t6.Lb, p6Var);
                        } else {
                            int F = w3.F(chat);
                            if (F < 7) {
                                w02 = t6.w0(t6.f21188r8[F], p6Var);
                            } else {
                                lp lpVar = vp.r1(d20.f15147s0).f18888r4;
                                if (lpVar == null) {
                                    d = null;
                                } else {
                                    d = lpVar.d(F);
                                }
                                if (d != null) {
                                    w02 = d.e(i13, p6Var);
                                } else {
                                    w02 = t6.w0(t6.f21188r8[i13], p6Var);
                                }
                            }
                        }
                        int i21 = this.V;
                        if (i21 >= 0 && i21 == i20) {
                            i12 = w02;
                        } else {
                            i12 = i17;
                        }
                        this.D.setColor(w02);
                        this.J.setColor(w02);
                        this.J.setAlpha(25);
                        this.f44918a[i20].h(canvas2, null);
                        CharSequence charSequence = this.e[i20];
                        int i22 = i19;
                        canvas2.drawText(charSequence, 0, charSequence.length(), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(f10), this.D);
                        this.N.set(0.0f, 0.0f, this.f44922g[i20] + org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(24.0f));
                        canvas2.drawRoundRect(this.N, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), this.J);
                        float f20 = i22;
                        this.f44923i[i20].set(i22, C, (int) (this.N.width() + f20), org.telegram.messenger.i0.L(24.0f) + C);
                        canvas2.translate(this.N.width() + org.telegram.messenger.i0.L(f12), 0.0f);
                        i19 = (int) (this.N.width() + org.telegram.messenger.i0.L(f12) + f20);
                        i20++;
                        boolean[] zArr3 = this.f44924j;
                        if (i20 >= zArr3.length || this.h[i20] || !zArr3[i20]) {
                            break;
                        }
                        i17 = i12;
                        i13 = 0;
                    }
                    canvas2.restore();
                    canvas2.translate(0.0f, org.telegram.messenger.i0.L(30.0f));
                    C += org.telegram.messenger.i0.L(30.0f);
                    i16 = i20;
                    i17 = i12;
                    i13 = 0;
                    f16 = f12;
                } else {
                    i16++;
                    i13 = 0;
                }
            }
            float f21 = f16;
            if (this.A != null) {
                canvas2.save();
                canvas2.translate((this.f44926l - this.A.getWidth()) / 2.0f, org.telegram.messenger.i0.L(4.0f));
                this.A.draw(canvas2);
                canvas2.restore();
                canvas2.translate(0.0f, this.f44933s);
            }
            canvas2.translate(0.0f, org.telegram.messenger.i0.L(f21));
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.f44939z.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
            if (this.V >= 0) {
                if (t6.I.q()) {
                    f11 = 0.12f;
                } else {
                    f11 = 0.1f;
                }
                int r12 = t6.r1(f11, i17);
                if (this.R != r12) {
                    y yVar2 = this.S;
                    this.R = r12;
                    t6.H1(yVar2, r12, true);
                }
                this.S.setBounds(this.f44923i[this.V]);
                this.S.setCallback(q1Var);
            }
        }
    }

    public final void c(boolean z10) {
        y yVar;
        jj jjVar = this.T;
        if (jjVar != null && jjVar.u3() && (yVar = this.S) != null) {
            q1 q1Var = this.f44920c;
            if (z10) {
                yVar.setCallback(new s0(this, 6));
                this.S.setState(this.Q);
                q1Var.invalidate();
                return;
            }
            yVar.setState(StateSet.NOTHING);
            q1Var.invalidate();
        }
    }

    public final void d(int i10, int i11, jj jjVar) {
        float f7;
        boolean z10;
        float f10;
        TLRPC.Document document;
        boolean z11;
        String str;
        boolean z12;
        int L;
        TLRPC.Peer peer;
        String str2;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout staticLayout3;
        int i12;
        boolean z13;
        String str3;
        this.T = null;
        this.f44936w = null;
        this.f44937x = null;
        this.f44938y = null;
        this.f44939z = null;
        this.A = null;
        boolean z14 = false;
        this.f44925k = 0;
        this.f44926l = 0;
        this.f44927m = 0;
        this.f44928n = 0.0f;
        if (jjVar.u3()) {
            this.T = jjVar;
            float f11 = 12.0f;
            boolean z15 = true;
            if (this.B == null) {
                this.B = new TextPaint(1);
                this.C = new TextPaint(1);
                this.D = new TextPaint(1);
                this.E = new TextPaint(1);
                this.F = new TextPaint(1);
                this.G = new Paint(1);
                this.H = new TextPaint(1);
                this.I = new Paint(1);
                this.J = new Paint(1);
                this.K = new Paint();
                this.L = new Paint();
                this.M = new RectF();
                this.N = new RectF();
                this.O = new Rect();
                this.P = new Rect();
                this.Q = new int[]{16842910, 16842919};
                this.e = new CharSequence[10];
                this.f44921f = new TLRPC.Chat[10];
                this.f44922g = new float[10];
                this.h = new boolean[10];
                this.f44923i = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f44920c);
                this.d = imageReceiver;
                imageReceiver.f14424z1 = true;
                Paint paint = this.L;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTypeface(org.telegram.messenger.i0.o());
                this.B.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTextSize(org.telegram.messenger.i0.L(12.0f));
                TextPaint textPaint = this.B;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.C.setTypeface(org.telegram.messenger.i0.o());
                this.C.setTextSize(org.telegram.messenger.i0.L(12.0f));
                this.C.setTextAlign(align);
                this.C.setColor(-1);
                this.D.setTypeface(org.telegram.messenger.i0.o());
                this.D.setTextSize(org.telegram.messenger.i0.L(13.0f));
                this.H.setTextSize(org.telegram.messenger.i0.L(13.0f));
                this.E.setTextSize(org.telegram.messenger.i0.L(14.0f));
                this.F.setTextSize(org.telegram.messenger.i0.L(14.0f));
                this.F.setTextAlign(align);
            }
            float f12 = 18.0f;
            if (this.f44918a == null) {
                this.f44918a = new ImageReceiver[10];
                this.f44919b = new r8[10];
                this.f44924j = new boolean[10];
                int i13 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f44918a;
                    if (i13 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i13] = new ImageReceiver(this.f44920c);
                    ImageReceiver imageReceiver2 = this.f44918a[i13];
                    imageReceiver2.f14424z1 = true;
                    imageReceiver2.J0(org.telegram.messenger.i0.L(12.0f));
                    this.f44919b[i13] = new r8((p6) null);
                    this.f44919b[i13].u(org.telegram.messenger.i0.L(18.0f));
                    this.f44923i[i13] = new Rect();
                    i13++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) jjVar.f16337k.media;
            String str4 = d20.i(d20.f15147s0).f15152b0;
            if (str4 == null) {
                ui.b0(d20.f15147s0).z();
                f7 = 12.0f;
                z10 = true;
                f10 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet p02 = ui.b0(d20.f15147s0).p0(str4);
                if (p02 == null) {
                    p02 = ui.b0(d20.f15147s0).n0(str4);
                }
                if (p02 != null) {
                    String str5 = (String) Y.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = p02.packs;
                    int size = arrayList.size();
                    document = null;
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i14);
                            i14++;
                            TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                            f7 = f11;
                            if (Objects.equals(tL_stickerPack2.emoticon, str5)) {
                                ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                                int size2 = arrayList2.size();
                                f10 = f12;
                                int i15 = z14;
                                while (true) {
                                    if (i15 < size2) {
                                        Long l4 = arrayList2.get(i15);
                                        int i16 = i15 + 1;
                                        long longValue = l4.longValue();
                                        ArrayList<TLRPC.Document> arrayList3 = p02.documents;
                                        int size3 = arrayList3.size();
                                        z10 = z15;
                                        int i17 = z14;
                                        while (true) {
                                            if (i17 < size3) {
                                                TLRPC.Document document2 = arrayList3.get(i17);
                                                int i18 = i17 + 1;
                                                TLRPC.Document document3 = document2;
                                                ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                                str = str5;
                                                if (document3.f19799id == longValue) {
                                                    document = document3;
                                                    break;
                                                }
                                                str5 = str;
                                                arrayList3 = arrayList4;
                                                i17 = i18;
                                            } else {
                                                str = str5;
                                                break;
                                            }
                                        }
                                        if (document != null) {
                                            break;
                                        }
                                        z15 = z10;
                                        str5 = str;
                                        z14 = false;
                                        i15 = i16;
                                    } else {
                                        str = str5;
                                        z10 = z15;
                                        break;
                                    }
                                }
                            } else {
                                str = str5;
                                z10 = z15;
                                f10 = f12;
                            }
                            if (document != null) {
                                break;
                            }
                            f11 = f7;
                            f12 = f10;
                            z15 = z10;
                            str5 = str;
                            z14 = false;
                        } else {
                            f7 = f11;
                            z10 = z15;
                            f10 = f12;
                            break;
                        }
                    }
                    if (document == null && !p02.documents.isEmpty()) {
                        z14 = false;
                        document = p02.documents.get(0);
                    } else {
                        z14 = false;
                    }
                } else {
                    f7 = 12.0f;
                    z10 = true;
                    f10 = 18.0f;
                    document = null;
                }
                if (document != null) {
                    c00 d = v5.d(document.thumbs, t6.f20911c7, 0.2f, z14);
                    if (d != null) {
                        d.e = 512;
                        d.f14875f = 512;
                    }
                    this.d.q0(ic.b(document), "160_160_firstframe", d, "tgs", p02, 1);
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
                    ui b02 = ui.b0(d20.f15147s0);
                    if (tL_messages_stickerSet == null) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    b02.c1(str4, false, z11);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) jjVar.f16337k.media;
            if ((tL_messageMediaGiveaway2.flags & 32) != 0) {
                z12 = z10;
            } else {
                z12 = false;
            }
            this.U = z12;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.f44918a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.f44918a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.f44919b = (r8[]) Arrays.copyOf(this.f44919b, size4);
                this.f44924j = Arrays.copyOf(this.f44924j, size4);
                this.e = (CharSequence[]) Arrays.copyOf(this.e, size4);
                this.f44922g = Arrays.copyOf(this.f44922g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.f44923i = (Rect[]) Arrays.copyOf(this.f44923i, size4);
                this.f44921f = (TLRPC.Chat[]) Arrays.copyOf(this.f44921f, size4);
                int i19 = length - 1;
                while (i19 < size4) {
                    this.f44918a[i19] = new ImageReceiver(this.f44920c);
                    ImageReceiver imageReceiver3 = this.f44918a[i19];
                    imageReceiver3.f14424z1 = z10;
                    imageReceiver3.J0(org.telegram.messenger.i0.L(f7));
                    this.f44919b[i19] = new r8((p6) null);
                    this.f44919b[i19].u(org.telegram.messenger.i0.L(f10));
                    this.f44923i[i19] = new Rect();
                    i19++;
                    z10 = true;
                }
            }
            int L2 = org.telegram.messenger.i0.L(148.0f);
            if (org.telegram.messenger.i0.Q1()) {
                L = org.telegram.messenger.i0.Q0() - org.telegram.messenger.i0.L(80.0f);
            } else {
                L = i10 - org.telegram.messenger.i0.L(80.0f);
            }
            int i20 = L;
            vp r12 = vp.r1(d20.f15147s0);
            boolean l32 = jj.l3(jjVar.f16337k);
            TLRPC.Message message = jjVar.f16337k;
            if (l32) {
                peer = message.fwd_from.from_id;
            } else {
                peer = message.peer_id;
            }
            boolean V = w3.V(r12.L0(Long.valueOf(-jj.C1(peer))));
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.L0(2131753393, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(W2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, W2.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (this.U) {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(cd.H(',', "BoostingStarsGiveawayMsgInfoPlural1", (int) tL_messageMediaGiveaway2.stars)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(tL_messageMediaGiveaway2.quantity, "BoostingStarsGiveawayMsgInfoPlural2", new Object[0])));
            } else {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(cd.H(',', "BoostingGiveawayMsgInfoPlural1", tL_messageMediaGiveaway2.quantity)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgInfoPlural2", cd.G(tL_messageMediaGiveaway2.months, "BoldMonths", new Object[0]))));
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder3.append((CharSequence) "\n\n");
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.4f), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
            SpannableStringBuilder W22 = org.telegram.messenger.i0.W2(cd.L0(2131753410, "BoostingGiveawayMsgParticipants"));
            spannableStringBuilder3.append((CharSequence) W22);
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilder2.length() + 2, W22.length() + spannableStringBuilder2.length() + 2, 33);
            spannableStringBuilder3.append((CharSequence) "\n");
            if (tL_messageMediaGiveaway2.only_new_subscribers) {
                if (V) {
                    str3 = "BoostingGiveawayMsgNewSubsPlural";
                } else {
                    str3 = "BoostingGiveawayMsgNewSubsGroupPlural";
                }
                spannableStringBuilder3.append((CharSequence) cd.G(tL_messageMediaGiveaway2.channels.size(), str3, new Object[0]));
            } else {
                if (V) {
                    str2 = "BoostingGiveawayMsgAllSubsPlural";
                } else {
                    str2 = "BoostingGiveawayMsgAllSubsGroupPlural";
                }
                spannableStringBuilder3.append((CharSequence) cd.G(tL_messageMediaGiveaway2.channels.size(), str2, new Object[0]));
            }
            SpannableStringBuilder W23 = org.telegram.messenger.i0.W2(cd.L0(2131753168, "BoostingWinnersDate"));
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(W23);
            spannableStringBuilder4.setSpan(new RelativeSizeSpan(1.05f), 0, W23.length(), 33);
            Date date = new Date(tL_messageMediaGiveaway2.until_date * 1000);
            String format = cd.D0().r0().format(date);
            String format2 = cd.D0().o0().format(date);
            spannableStringBuilder4.append((CharSequence) "\n");
            spannableStringBuilder4.append((CharSequence) cd.a0("formatDateAtTime", null, 2131742808, format, format2));
            TextPaint textPaint2 = this.E;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f44936w = ov0.c(spannableStringBuilder, textPaint2, i20, alignment, org.telegram.messenger.i0.L(2.0f), truncateAt, i20, 10, true);
            this.f44938y = ov0.c(spannableStringBuilder3, this.E, i20, alignment, org.telegram.messenger.i0.L(2.0f), truncateAt, i20, 10, true);
            this.f44939z = ov0.c(spannableStringBuilder4, this.E, i20, alignment, org.telegram.messenger.i0.L(3.0f), truncateAt, i20, 10, true);
            int i21 = 0;
            for (int i22 = 0; i22 < this.f44936w.getLineCount(); i22++) {
                i21 = (int) Math.max(i21, Math.ceil(this.f44936w.getLineWidth(i22)));
            }
            for (int i23 = 0; i23 < this.f44938y.getLineCount(); i23++) {
                i21 = (int) Math.max(i21, Math.ceil(this.f44938y.getLineWidth(i23)));
            }
            for (int i24 = 0; i24 < this.f44939z.getLineCount(); i24++) {
                i21 = (int) Math.max(i21, Math.ceil(this.f44939z.getLineWidth(i24)));
            }
            if (i21 < org.telegram.messenger.i0.L(180.0f)) {
                i21 = org.telegram.messenger.i0.L(180.0f);
            }
            int i25 = i21;
            String str6 = tL_messageMediaGiveaway2.prize_description;
            if (str6 != null && !str6.isEmpty()) {
                StaticLayout c10 = ov0.c(k6.m(org.telegram.messenger.i0.W2(cd.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false, null, 0), this.E, i25, Layout.Alignment.ALIGN_CENTER, org.telegram.messenger.i0.L(2.0f), TextUtils.TruncateAt.END, i25, 20, true);
                this.f44937x = c10;
                this.f44927m = org.telegram.messenger.i0.L(22.0f) + c10.getLineBottom(c10.getLineCount() - 1);
                String L0 = cd.L0(2131753406, null);
                this.f44929o = L0;
                this.f44928n = this.F.measureText(L0, 0, L0.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i26 = 0;
                while (i26 < size5) {
                    String str7 = arrayList6.get(i26);
                    i26++;
                    String str8 = str7;
                    String displayCountry = new Locale("", str8).getDisplayCountry(Locale.getDefault());
                    String E0 = cd.E0(str8);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (E0 != null) {
                        spannableStringBuilder5.append((CharSequence) E0).append((CharSequence) " ");
                    }
                    spannableStringBuilder5.append((CharSequence) displayCountry);
                    arrayList5.add(spannableStringBuilder5);
                }
                if (!arrayList5.isEmpty()) {
                    this.A = ov0.c(k6.m(org.telegram.messenger.i0.W2(cd.a0("BoostingGiveAwayFromCountries", null, 2131753493, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false, null, 0), this.H, i25, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, i25, 10, true);
                }
            }
            int max = Math.max(i11, Math.min(org.telegram.messenger.i0.L(38.0f) + i25, i20));
            this.v = max - i20;
            float f13 = max;
            float f14 = L2;
            float f15 = f14 / 2.0f;
            this.d.y0((f13 / 2.0f) - f15, org.telegram.messenger.i0.L(42.0f) - f15, f14, f14);
            int L3 = org.telegram.messenger.i0.L(5.0f) + this.f44936w.getLineBottom(staticLayout.getLineCount() - 1);
            this.f44930p = L3;
            this.f44931q = this.f44938y.getLineBottom(staticLayout2.getLineCount() - 1) + L3 + this.f44927m;
            this.f44932r = this.f44939z.getLineBottom(staticLayout3.getLineCount() - 1);
            StaticLayout staticLayout4 = this.A;
            if (staticLayout4 != null) {
                i12 = staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + org.telegram.messenger.i0.L(f7);
            } else {
                i12 = 0;
            }
            this.f44933s = i12;
            int i27 = this.f44925k + this.f44931q + i12 + this.f44932r;
            this.f44925k = i27;
            this.f44925k = org.telegram.messenger.i0.L(128.0f) + i27;
            this.f44926l = max;
            if (this.U) {
                if (this.f44934t == null) {
                    this.f44934t = i0.a.f(w0.f19025b, 2131231124);
                }
                this.f44935u = cd.E((int) tL_messageMediaGiveaway2.stars, ',');
            } else {
                this.f44934t = null;
                this.f44935u = "x" + tL_messageMediaGiveaway2.quantity;
            }
            TextPaint textPaint3 = this.B;
            String str9 = this.f44935u;
            textPaint3.getTextBounds(str9, 0, str9.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = org.telegram.messenger.i0.L(20.0f) + rect.right;
            }
            Arrays.fill(this.f44924j, false);
            this.f44925k = org.telegram.messenger.i0.L(30.0f) + this.f44925k;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i28 = 0;
            while (i28 < size6) {
                Long l10 = arrayList8.get(i28);
                i28++;
                Long l11 = l10;
                if (vp.r1(d20.f15147s0).L0(l11) != null) {
                    arrayList7.add(l11);
                }
            }
            float f16 = 0.0f;
            for (int i29 = 0; i29 < arrayList7.size(); i29++) {
                Long l12 = (Long) arrayList7.get(i29);
                long longValue2 = l12.longValue();
                TLRPC.Chat L02 = vp.r1(d20.f15147s0).L0(l12);
                if (L02 != null) {
                    this.f44924j[i29] = true;
                    this.f44921f[i29] = L02;
                    this.e[i29] = TextUtils.ellipsize(k6.m(L02.title, this.D.getFontMetricsInt(), false, null, 0), this.D, 0.8f * f13, TextUtils.TruncateAt.END);
                    float[] fArr = this.f44922g;
                    TextPaint textPaint4 = this.D;
                    CharSequence charSequence = this.e[i29];
                    fArr[i29] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.f44922g[i29] + org.telegram.messenger.i0.L(40.0f);
                    f16 += L4;
                    if (i29 > 0) {
                        boolean[] zArr = this.h;
                        if (f16 > 0.9f * f13) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zArr[i29] = z13;
                        if (z13) {
                            this.f44925k = org.telegram.messenger.i0.L(30.0f) + this.f44925k;
                            f16 = L4;
                        }
                    } else {
                        this.h[i29] = false;
                    }
                    this.f44919b[i29].q(L02);
                    this.f44918a[i29].i0(L02, this.f44919b[i29], null);
                    this.f44918a[i29].y0(0.0f, 0.0f, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
                } else {
                    this.f44921f[i29] = null;
                    this.f44924j[i29] = false;
                    this.e[i29] = "";
                    this.h[i29] = false;
                    this.f44922g[i29] = org.telegram.messenger.i0.L(20.0f);
                    this.f44919b[i29].k(longValue2, "", "", null);
                }
            }
        }
    }
}
