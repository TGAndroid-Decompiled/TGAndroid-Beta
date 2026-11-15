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
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cp;
import org.telegram.messenger.dp;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.pz;
import org.telegram.messenger.si;
import org.telegram.messenger.t0;
import org.telegram.messenger.t3;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.t8;
import ug.p1;
import wg.q;
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
    public gj T;
    public boolean U;
    public ImageReceiver[] f61359a;
    public t8[] f61360b;
    public final q1 f61361c;
    public ImageReceiver d;
    public CharSequence[] f61362e;
    public TLRPC.Chat[] f61363f;
    public float[] f61364g;
    public boolean[] h;
    public Rect[] f61365i;
    public boolean[] f61366j;
    public int f61369m;
    public float f61370n;
    public String f61371o;
    public int f61372p;
    public int f61373q;
    public int f61374r;
    public int f61375s;
    public Drawable f61376t;
    public String f61377u;
    public int v;
    public StaticLayout f61378w;
    public StaticLayout f61379x;
    public StaticLayout f61380y;
    public StaticLayout f61381z;
    public int f61367k = 0;
    public int f61368l = 0;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;

    static {
        HashMap hashMap = new HashMap();
        Y = hashMap;
        i5.c.s(1, hashMap, "1⃣", 3, "2⃣");
        i5.c.s(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public a(q1 q1Var) {
        this.f61361c = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        gj gjVar = this.T;
        if (gjVar != null && gjVar.u3()) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i7 = 0;
                while (true) {
                    Rect[] rectArr = this.f61365i;
                    if (i7 < rectArr.length) {
                        if (rectArr[i7].contains(x10, y10)) {
                            this.V = i7;
                            this.S.setHotspot(x10, y10);
                            this.W = true;
                            c(true);
                            return true;
                        }
                        i7++;
                    } else if (this.P.contains(x10, y10)) {
                        this.X = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.W) {
                    q1 q1Var = this.f61361c;
                    if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().K1(q1Var, this.V);
                    }
                    q1Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    gj gjVar2 = this.T;
                    if (gjVar2 != null && gjVar2.f23819k != null) {
                        q.d(gjVar2, new p1(gjVar2, 2), new pg.c(1));
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

    public final void b(Canvas canvas, int i7, int i10, e6 e6Var) {
        float f10;
        TextPaint textPaint;
        float f11;
        float f12;
        float f13;
        cp d;
        int w02;
        int i11;
        Canvas canvas2 = canvas;
        gj gjVar = this.T;
        if (gjVar != null && gjVar.u3()) {
            y yVar = this.S;
            q1 q1Var = this.f61361c;
            int i12 = 0;
            if (yVar == null) {
                int x02 = j6.x0(null, j6.f28941i6, false);
                this.R = x02;
                y a02 = j6.a0(x02, 12, 12);
                this.S = a02;
                a02.setCallback(q1Var);
            }
            this.E.setColor(j6.f29046o2.getColor());
            this.F.setColor(j6.r1(0.45f, j6.f29046o2.getColor()));
            this.G.setColor(j6.r1(0.15f, j6.f29046o2.getColor()));
            this.H.setColor(j6.f29046o2.getColor());
            if (this.T.P3()) {
                TextPaint textPaint2 = this.D;
                int i13 = j6.Ob;
                textPaint2.setColor(j6.w0(i13, e6Var));
                this.I.setColor(j6.w0(i13, e6Var));
                this.J.setColor(j6.w0(j6.Rb, e6Var));
            } else {
                TextPaint textPaint3 = this.D;
                int i14 = j6.Bd;
                textPaint3.setColor(j6.w0(i14, e6Var));
                this.I.setColor(j6.w0(i14, e6Var));
                this.J.setColor(j6.w0(j6.Ld, e6Var));
            }
            if (this.U) {
                this.I.setColor(j6.w0(j6.Wk, e6Var));
            }
            canvas2.save();
            int L = i10 - g0.L(4.0f);
            canvas2.translate(L, i7);
            this.P.set(L, i7, this.f61368l + L, this.f61367k + i7);
            canvas2.saveLayer(0.0f, 0.0f, this.f61368l, this.f61367k, this.K, 31);
            this.d.h(canvas2, null);
            float f14 = this.f61368l / 2.0f;
            float L2 = g0.L(106.0f);
            int L3 = g0.L(12.0f) + this.O.width();
            int L4 = g0.L(10.0f) + this.O.height();
            this.M.set(f14 - ((g0.L(2.0f) + L3) / 2.0f), L2 - ((g0.L(2.0f) + L4) / 2.0f), ((g0.L(2.0f) + L3) / 2.0f) + f14, ((g0.L(2.0f) + L4) / 2.0f) + L2);
            canvas2.drawRoundRect(this.M, g0.L(11.0f), g0.L(11.0f), this.L);
            float f15 = L3 / 2.0f;
            float f16 = L4 / 2.0f;
            this.M.set(f14 - f15, L2 - f16, f14 + f15, L2 + f16);
            canvas2.drawRoundRect(this.M, g0.L(10.0f), g0.L(10.0f), this.I);
            Drawable drawable = this.f61376t;
            if (drawable != null) {
                drawable.setBounds(g0.L(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - g0.L(6.96f), g0.L(21.24f) + ((int) this.M.left), g0.L(6.96f) + ((int) this.M.centerY()));
                this.f61376t.draw(canvas2);
            }
            String str = this.f61377u;
            float centerX = this.M.centerX();
            if (this.U) {
                f10 = 8.0f;
            } else {
                f10 = 0.0f;
            }
            float L5 = centerX + g0.L(f10);
            float centerY = this.M.centerY() + g0.L(4.0f);
            if (this.U) {
                textPaint = this.C;
            } else {
                textPaint = this.B;
            }
            canvas2.drawText(str, L5, centerY, textPaint);
            canvas2.restore();
            canvas2.translate(0.0f, g0.L(128.0f));
            int L6 = g0.L(128.0f) + i7;
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.f61378w.draw(canvas2);
            canvas2.translate(0.0f, this.f61372p);
            float f17 = 6.0f;
            if (this.f61379x != null) {
                canvas2.restore();
                canvas2.save();
                float L7 = (this.f61372p + this.f61369m) - g0.L(6.0f);
                float f18 = this.f61368l / 2.0f;
                canvas2.drawText(this.f61371o, f18, L7, this.F);
                f11 = 16.0f;
                canvas2.drawLine(g0.L(17.0f), L7 - g0.L(4.0f), (f18 - (this.f61370n / 2.0f)) - g0.L(6.0f), L7 - g0.L(4.0f), this.G);
                canvas2 = canvas;
                canvas2.drawLine(g0.L(6.0f) + (this.f61370n / 2.0f) + f18, L7 - g0.L(4.0f), this.f61368l - g0.L(16.0f), L7 - g0.L(4.0f), this.G);
                canvas2.translate((this.f61368l - this.f61379x.getWidth()) / 2.0f, this.f61372p);
                this.f61379x.draw(canvas2);
                canvas2.restore();
                canvas2.save();
                canvas2.translate(this.v / 2.0f, this.f61369m + this.f61372p);
            } else {
                f11 = 16.0f;
            }
            this.f61380y.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, g0.L(6.0f) + this.f61373q);
            int C = k5.C(6.0f, this.f61373q, L6);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                boolean[] zArr = this.f61366j;
                if (i15 >= zArr.length) {
                    break;
                } else if (zArr[i15]) {
                    canvas2.save();
                    int i17 = i15;
                    float f19 = 0.0f;
                    while (true) {
                        f13 = f17;
                        f19 += this.f61364g[i17] + g0.L(40.0f);
                        i17++;
                        boolean[] zArr2 = this.f61366j;
                        if (i17 >= zArr2.length || this.h[i17] || !zArr2[i17]) {
                            break;
                        }
                        f17 = f13;
                    }
                    float f20 = f14 - (f19 / 2.0f);
                    canvas2.translate(f20, 0.0f);
                    int i18 = ((int) f20) + L;
                    int i19 = i15;
                    while (true) {
                        TLRPC.Chat chat = this.f61363f[i19];
                        if (this.T.P3()) {
                            w02 = j6.w0(j6.Ob, e6Var);
                        } else {
                            int F = t3.F(chat);
                            if (F < 7) {
                                w02 = j6.w0(j6.f29110r8[F], e6Var);
                            } else {
                                dp dpVar = np.s1(m10.f24940t0).f25383r4;
                                if (dpVar == null) {
                                    d = null;
                                } else {
                                    d = dpVar.d(F);
                                }
                                if (d != null) {
                                    w02 = d.e(i12, e6Var);
                                } else {
                                    w02 = j6.w0(j6.f29110r8[i12], e6Var);
                                }
                            }
                        }
                        int i20 = this.V;
                        if (i20 >= 0 && i20 == i19) {
                            i11 = w02;
                        } else {
                            i11 = i16;
                        }
                        this.D.setColor(w02);
                        this.J.setColor(w02);
                        this.J.setAlpha(25);
                        this.f61359a[i19].h(canvas2, null);
                        CharSequence charSequence = this.f61362e[i19];
                        int i21 = i18;
                        canvas2.drawText(charSequence, 0, charSequence.length(), g0.L(30.0f), g0.L(f11), this.D);
                        this.N.set(0.0f, 0.0f, this.f61364g[i19] + g0.L(40.0f), g0.L(24.0f));
                        canvas2.drawRoundRect(this.N, g0.L(12.0f), g0.L(12.0f), this.J);
                        float f21 = i21;
                        this.f61365i[i19].set(i21, C, (int) (this.N.width() + f21), g0.L(24.0f) + C);
                        canvas2.translate(this.N.width() + g0.L(f13), 0.0f);
                        i18 = (int) (this.N.width() + g0.L(f13) + f21);
                        i19++;
                        boolean[] zArr3 = this.f61366j;
                        if (i19 >= zArr3.length || this.h[i19] || !zArr3[i19]) {
                            break;
                        }
                        i16 = i11;
                        i12 = 0;
                    }
                    canvas2.restore();
                    canvas2.translate(0.0f, g0.L(30.0f));
                    C += g0.L(30.0f);
                    i15 = i19;
                    i16 = i11;
                    i12 = 0;
                    f17 = f13;
                } else {
                    i15++;
                    i12 = 0;
                }
            }
            float f22 = f17;
            if (this.A != null) {
                canvas2.save();
                canvas2.translate((this.f61368l - this.A.getWidth()) / 2.0f, g0.L(4.0f));
                this.A.draw(canvas2);
                canvas2.restore();
                canvas2.translate(0.0f, this.f61375s);
            }
            canvas2.translate(0.0f, g0.L(f22));
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.f61381z.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
            if (this.V >= 0) {
                if (j6.I.q()) {
                    f12 = 0.12f;
                } else {
                    f12 = 0.1f;
                }
                int r12 = j6.r1(f12, i16);
                if (this.R != r12) {
                    y yVar2 = this.S;
                    this.R = r12;
                    j6.H1(yVar2, r12, true);
                }
                this.S.setBounds(this.f61365i[this.V]);
                this.S.setCallback(q1Var);
            }
        }
    }

    public final void c(boolean z10) {
        y yVar;
        gj gjVar = this.T;
        if (gjVar != null && gjVar.u3() && (yVar = this.S) != null) {
            q1 q1Var = this.f61361c;
            if (z10) {
                yVar.setCallback(new a5.b(this, 9));
                this.S.setState(this.Q);
                q1Var.invalidate();
                return;
            }
            yVar.setState(StateSet.NOTHING);
            q1Var.invalidate();
        }
    }

    public final void d(int i7, int i10, gj gjVar) {
        float f10;
        boolean z10;
        float f11;
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
        int i11;
        boolean z13;
        String str3;
        this.T = null;
        this.f61378w = null;
        this.f61379x = null;
        this.f61380y = null;
        this.f61381z = null;
        this.A = null;
        boolean z14 = false;
        this.f61367k = 0;
        this.f61368l = 0;
        this.f61369m = 0;
        this.f61370n = 0.0f;
        if (gjVar.u3()) {
            this.T = gjVar;
            float f12 = 12.0f;
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
                this.f61362e = new CharSequence[10];
                this.f61363f = new TLRPC.Chat[10];
                this.f61364g = new float[10];
                this.h = new boolean[10];
                this.f61365i = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f61361c);
                this.d = imageReceiver;
                imageReceiver.A1 = true;
                Paint paint = this.L;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTypeface(g0.o());
                this.B.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTextSize(g0.L(12.0f));
                TextPaint textPaint = this.B;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.C.setTypeface(g0.o());
                this.C.setTextSize(g0.L(12.0f));
                this.C.setTextAlign(align);
                this.C.setColor(-1);
                this.D.setTypeface(g0.o());
                this.D.setTextSize(g0.L(13.0f));
                this.H.setTextSize(g0.L(13.0f));
                this.E.setTextSize(g0.L(14.0f));
                this.F.setTextSize(g0.L(14.0f));
                this.F.setTextAlign(align);
            }
            float f13 = 18.0f;
            if (this.f61359a == null) {
                this.f61359a = new ImageReceiver[10];
                this.f61360b = new t8[10];
                this.f61366j = new boolean[10];
                int i12 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f61359a;
                    if (i12 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i12] = new ImageReceiver(this.f61361c);
                    ImageReceiver imageReceiver2 = this.f61359a[i12];
                    imageReceiver2.A1 = true;
                    imageReceiver2.J0(g0.L(12.0f));
                    this.f61360b[i12] = new t8((e6) null);
                    this.f61360b[i12].u(g0.L(18.0f));
                    this.f61365i[i12] = new Rect();
                    i12++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) gjVar.f23819k.media;
            String str4 = m10.i(m10.f24940t0).f24947c0;
            if (str4 == null) {
                si.b0(m10.f24940t0).z();
                f10 = 12.0f;
                z10 = true;
                f11 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet p02 = si.b0(m10.f24940t0).p0(str4);
                if (p02 == null) {
                    p02 = si.b0(m10.f24940t0).n0(str4);
                }
                if (p02 != null) {
                    String str5 = (String) Y.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = p02.packs;
                    int size = arrayList.size();
                    document = null;
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i13);
                            i13++;
                            TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                            f10 = f12;
                            if (Objects.equals(tL_stickerPack2.emoticon, str5)) {
                                ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                                int size2 = arrayList2.size();
                                f11 = f13;
                                int i14 = z14;
                                while (true) {
                                    if (i14 < size2) {
                                        Long l10 = arrayList2.get(i14);
                                        int i15 = i14 + 1;
                                        long longValue = l10.longValue();
                                        ArrayList<TLRPC.Document> arrayList3 = p02.documents;
                                        int size3 = arrayList3.size();
                                        z10 = z15;
                                        int i16 = z14;
                                        while (true) {
                                            if (i16 < size3) {
                                                TLRPC.Document document2 = arrayList3.get(i16);
                                                int i17 = i16 + 1;
                                                TLRPC.Document document3 = document2;
                                                ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                                str = str5;
                                                if (document3.f28057id == longValue) {
                                                    document = document3;
                                                    break;
                                                }
                                                str5 = str;
                                                arrayList3 = arrayList4;
                                                i16 = i17;
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
                                        i14 = i15;
                                    } else {
                                        str = str5;
                                        z10 = z15;
                                        break;
                                    }
                                }
                            } else {
                                str = str5;
                                z10 = z15;
                                f11 = f13;
                            }
                            if (document != null) {
                                break;
                            }
                            f12 = f10;
                            f13 = f11;
                            z15 = z10;
                            str5 = str;
                            z14 = false;
                        } else {
                            f10 = f12;
                            z10 = z15;
                            f11 = f13;
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
                    f10 = 12.0f;
                    z10 = true;
                    f11 = 18.0f;
                    document = null;
                }
                if (document != null) {
                    pz d = t5.d(document.thumbs, j6.f28832c7, 0.2f, z14);
                    if (d != null) {
                        d.f26029e = 512;
                        d.f26030f = 512;
                    }
                    this.d.q0(gc.b(document), "160_160_firstframe", d, "tgs", p02, 1);
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = p02;
                    si b02 = si.b0(m10.f24940t0);
                    if (tL_messages_stickerSet == null) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    b02.c1(str4, false, z11);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) gjVar.f23819k.media;
            if ((tL_messageMediaGiveaway2.flags & 32) != 0) {
                z12 = z10;
            } else {
                z12 = false;
            }
            this.U = z12;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.f61359a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.f61359a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.f61360b = (t8[]) Arrays.copyOf(this.f61360b, size4);
                this.f61366j = Arrays.copyOf(this.f61366j, size4);
                this.f61362e = (CharSequence[]) Arrays.copyOf(this.f61362e, size4);
                this.f61364g = Arrays.copyOf(this.f61364g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.f61365i = (Rect[]) Arrays.copyOf(this.f61365i, size4);
                this.f61363f = (TLRPC.Chat[]) Arrays.copyOf(this.f61363f, size4);
                int i18 = length - 1;
                while (i18 < size4) {
                    this.f61359a[i18] = new ImageReceiver(this.f61361c);
                    ImageReceiver imageReceiver3 = this.f61359a[i18];
                    imageReceiver3.A1 = z10;
                    imageReceiver3.J0(g0.L(f10));
                    this.f61360b[i18] = new t8((e6) null);
                    this.f61360b[i18].u(g0.L(f11));
                    this.f61365i[i18] = new Rect();
                    i18++;
                    z10 = true;
                }
            }
            int L2 = g0.L(148.0f);
            if (g0.Q1()) {
                L = g0.Q0() - g0.L(80.0f);
            } else {
                L = i7 - g0.L(80.0f);
            }
            int i19 = L;
            np s12 = np.s1(m10.f24940t0);
            boolean l32 = gj.l3(gjVar.f23819k);
            TLRPC.Message message = gjVar.f23819k;
            if (l32) {
                peer = message.fwd_from.from_id;
            } else {
                peer = message.peer_id;
            }
            boolean V = t3.V(s12.M0(Long.valueOf(-gj.B1(peer))));
            SpannableStringBuilder X2 = g0.X2(hd.M0(2131753393, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, X2.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (this.U) {
                spannableStringBuilder2.append((CharSequence) g0.X2(hd.H(',', "BoostingStarsGiveawayMsgInfoPlural1", (int) tL_messageMediaGiveaway2.stars)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) g0.X2(hd.G(tL_messageMediaGiveaway2.quantity, "BoostingStarsGiveawayMsgInfoPlural2", new Object[0])));
            } else {
                spannableStringBuilder2.append((CharSequence) g0.X2(hd.H(',', "BoostingGiveawayMsgInfoPlural1", tL_messageMediaGiveaway2.quantity)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) g0.X2(hd.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgInfoPlural2", hd.G(tL_messageMediaGiveaway2.months, "BoldMonths", new Object[0]))));
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder3.append((CharSequence) "\n\n");
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.4f), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
            SpannableStringBuilder X22 = g0.X2(hd.M0(2131753410, "BoostingGiveawayMsgParticipants"));
            spannableStringBuilder3.append((CharSequence) X22);
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilder2.length() + 2, X22.length() + spannableStringBuilder2.length() + 2, 33);
            spannableStringBuilder3.append((CharSequence) "\n");
            if (tL_messageMediaGiveaway2.only_new_subscribers) {
                if (V) {
                    str3 = "BoostingGiveawayMsgNewSubsPlural";
                } else {
                    str3 = "BoostingGiveawayMsgNewSubsGroupPlural";
                }
                spannableStringBuilder3.append((CharSequence) hd.G(tL_messageMediaGiveaway2.channels.size(), str3, new Object[0]));
            } else {
                if (V) {
                    str2 = "BoostingGiveawayMsgAllSubsPlural";
                } else {
                    str2 = "BoostingGiveawayMsgAllSubsGroupPlural";
                }
                spannableStringBuilder3.append((CharSequence) hd.G(tL_messageMediaGiveaway2.channels.size(), str2, new Object[0]));
            }
            SpannableStringBuilder X23 = g0.X2(hd.M0(2131753168, "BoostingWinnersDate"));
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(X23);
            spannableStringBuilder4.setSpan(new RelativeSizeSpan(1.05f), 0, X23.length(), 33);
            Date date = new Date(tL_messageMediaGiveaway2.until_date * 1000);
            String format = hd.E0().s0().format(date);
            String format2 = hd.E0().p0().format(date);
            spannableStringBuilder4.append((CharSequence) "\n");
            spannableStringBuilder4.append((CharSequence) hd.a0("formatDateAtTime", null, 2131742783, format, format2));
            TextPaint textPaint2 = this.E;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f61378w = ou0.c(spannableStringBuilder, textPaint2, i19, alignment, g0.L(2.0f), truncateAt, i19, 10, true);
            this.f61380y = ou0.c(spannableStringBuilder3, this.E, i19, alignment, g0.L(2.0f), truncateAt, i19, 10, true);
            this.f61381z = ou0.c(spannableStringBuilder4, this.E, i19, alignment, g0.L(3.0f), truncateAt, i19, 10, true);
            int i20 = 0;
            for (int i21 = 0; i21 < this.f61378w.getLineCount(); i21++) {
                i20 = (int) Math.max(i20, Math.ceil(this.f61378w.getLineWidth(i21)));
            }
            for (int i22 = 0; i22 < this.f61380y.getLineCount(); i22++) {
                i20 = (int) Math.max(i20, Math.ceil(this.f61380y.getLineWidth(i22)));
            }
            for (int i23 = 0; i23 < this.f61381z.getLineCount(); i23++) {
                i20 = (int) Math.max(i20, Math.ceil(this.f61381z.getLineWidth(i23)));
            }
            if (i20 < g0.L(180.0f)) {
                i20 = g0.L(180.0f);
            }
            int i24 = i20;
            String str6 = tL_messageMediaGiveaway2.prize_description;
            if (str6 != null && !str6.isEmpty()) {
                StaticLayout c10 = ou0.c(org.telegram.messenger.j6.m(g0.X2(hd.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false, null, 0), this.E, i24, Layout.Alignment.ALIGN_CENTER, g0.L(2.0f), TextUtils.TruncateAt.END, i24, 20, true);
                this.f61379x = c10;
                this.f61369m = g0.L(22.0f) + c10.getLineBottom(c10.getLineCount() - 1);
                String M0 = hd.M0(2131753406, null);
                this.f61371o = M0;
                this.f61370n = this.F.measureText(M0, 0, M0.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i25 = 0;
                while (i25 < size5) {
                    String str7 = arrayList6.get(i25);
                    i25++;
                    String str8 = str7;
                    String displayCountry = new Locale("", str8).getDisplayCountry(Locale.getDefault());
                    String F0 = hd.F0(str8);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (F0 != null) {
                        spannableStringBuilder5.append((CharSequence) F0).append((CharSequence) " ");
                    }
                    spannableStringBuilder5.append((CharSequence) displayCountry);
                    arrayList5.add(spannableStringBuilder5);
                }
                if (!arrayList5.isEmpty()) {
                    this.A = ou0.c(org.telegram.messenger.j6.m(g0.X2(hd.a0("BoostingGiveAwayFromCountries", null, 2131753493, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false, null, 0), this.H, i24, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, i24, 10, true);
                }
            }
            int max = Math.max(i10, Math.min(g0.L(38.0f) + i24, i19));
            this.v = max - i19;
            float f14 = max;
            float f15 = L2;
            float f16 = f15 / 2.0f;
            this.d.y0((f14 / 2.0f) - f16, g0.L(42.0f) - f16, f15, f15);
            int L3 = g0.L(5.0f) + this.f61378w.getLineBottom(staticLayout.getLineCount() - 1);
            this.f61372p = L3;
            this.f61373q = this.f61380y.getLineBottom(staticLayout2.getLineCount() - 1) + L3 + this.f61369m;
            this.f61374r = this.f61381z.getLineBottom(staticLayout3.getLineCount() - 1);
            StaticLayout staticLayout4 = this.A;
            if (staticLayout4 != null) {
                i11 = staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + g0.L(f10);
            } else {
                i11 = 0;
            }
            this.f61375s = i11;
            int i26 = this.f61367k + this.f61373q + i11 + this.f61374r;
            this.f61367k = i26;
            this.f61367k = g0.L(128.0f) + i26;
            this.f61368l = max;
            if (this.U) {
                if (this.f61376t == null) {
                    this.f61376t = i5.c.g(t0.f26609b, 2131231124);
                }
                this.f61377u = hd.E((int) tL_messageMediaGiveaway2.stars, ',');
            } else {
                this.f61376t = null;
                this.f61377u = "x" + tL_messageMediaGiveaway2.quantity;
            }
            TextPaint textPaint3 = this.B;
            String str9 = this.f61377u;
            textPaint3.getTextBounds(str9, 0, str9.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = g0.L(20.0f) + rect.right;
            }
            Arrays.fill(this.f61366j, false);
            this.f61367k = g0.L(30.0f) + this.f61367k;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i27 = 0;
            while (i27 < size6) {
                Long l11 = arrayList8.get(i27);
                i27++;
                Long l12 = l11;
                if (np.s1(m10.f24940t0).M0(l12) != null) {
                    arrayList7.add(l12);
                }
            }
            float f17 = 0.0f;
            for (int i28 = 0; i28 < arrayList7.size(); i28++) {
                Long l13 = (Long) arrayList7.get(i28);
                long longValue2 = l13.longValue();
                TLRPC.Chat M02 = np.s1(m10.f24940t0).M0(l13);
                if (M02 != null) {
                    this.f61366j[i28] = true;
                    this.f61363f[i28] = M02;
                    this.f61362e[i28] = TextUtils.ellipsize(org.telegram.messenger.j6.m(M02.title, this.D.getFontMetricsInt(), false, null, 0), this.D, 0.8f * f14, TextUtils.TruncateAt.END);
                    float[] fArr = this.f61364g;
                    TextPaint textPaint4 = this.D;
                    CharSequence charSequence = this.f61362e[i28];
                    fArr[i28] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.f61364g[i28] + g0.L(40.0f);
                    f17 += L4;
                    if (i28 > 0) {
                        boolean[] zArr = this.h;
                        if (f17 > 0.9f * f14) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zArr[i28] = z13;
                        if (z13) {
                            this.f61367k = g0.L(30.0f) + this.f61367k;
                            f17 = L4;
                        }
                    } else {
                        this.h[i28] = false;
                    }
                    this.f61360b[i28].q(M02);
                    this.f61359a[i28].i0(M02, this.f61360b[i28], null);
                    this.f61359a[i28].y0(0.0f, 0.0f, g0.L(24.0f), g0.L(24.0f));
                } else {
                    this.f61363f[i28] = null;
                    this.f61366j[i28] = false;
                    this.f61362e[i28] = "";
                    this.h[i28] = false;
                    this.f61364g[i28] = g0.L(20.0f);
                    this.f61360b[i28].k(longValue2, "", "", null);
                }
            }
        }
    }
}
