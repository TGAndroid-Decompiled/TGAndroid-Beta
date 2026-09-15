package wg;

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
import i.f;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.z80;
import org.telegram.ui.web.b1;
import tg.t;
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
    public z L;
    public MessageObject M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public z80 U;
    public ImageReceiver[] f45049a;
    public f9[] f45050b;
    public final t1 f45051c;
    public ImageReceiver d;
    public xi0 e;
    public CharSequence[] f45052f;
    public TLRPC.User[] f45053g;
    public float[] h;
    public boolean[] f45054i;
    public Rect[] f45055j;
    public boolean[] f45056k;
    public int f45059n;
    public int f45060o;
    public Drawable f45061p;
    public String f45062q;
    public int f45063r;
    public StaticLayout f45064s;
    public StaticLayout f45065t;
    public StaticLayout f45066u;
    public TextPaint v;
    public TextPaint f45067w;
    public TextPaint f45068x;
    public TextPaint f45069y;
    public TextPaint f45070z;
    public int f45057l = 0;
    public int f45058m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public c(t1 t1Var) {
        this.f45051c = t1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i10;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            z80 z80Var = this.U;
            t1 t1Var = this.f45051c;
            if (z80Var == null) {
                this.U = new z80(t1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f45065t) != null && (i10 = y3 - this.S) > 0) {
                int offsetForHorizontal = this.f45065t.getOffsetForHorizontal(staticLayout.getLineForVertical(i10 - AndroidUtilities.dp(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.d(true);
                        clickableSpanArr[0].onClick(t1Var);
                        return true;
                    }
                    d90 d90Var = new d90(clickableSpanArr[0], null, x10, y3, 0);
                    this.U.a(d90Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        w80 b10 = d90Var.b();
                        b10.e(this.f45065t, spanStart, this.T, this.S);
                        this.f45065t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return true;
                    }
                }
                this.U.d(true);
                t1Var.invalidate();
            }
            if (action == 0) {
                int i11 = 0;
                while (true) {
                    Rect[] rectArr = this.f45055j;
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
                    if (t1Var.getDelegate() != null) {
                        t1Var.getDelegate().M(this.O, t1Var);
                    }
                    t1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    MessageObject messageObject2 = this.M;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        t.d(messageObject2, new b1(messageObject2, 10), new j3(6));
                        return false;
                    }
                }
            } else if (action != 2 && action == 3) {
                this.U.d(true);
                if (this.P) {
                    c(false);
                }
                this.P = false;
                this.Q = false;
            }
        }
        return false;
    }

    public final void b(Canvas canvas, int i10, int i11, e6 e6Var) {
        float f7;
        TextPaint textPaint;
        float f10;
        boolean[] zArr;
        MessagesController.PeerColor color;
        int v02;
        int i12;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            z zVar = this.L;
            t1 t1Var = this.f45051c;
            if (zVar == null) {
                int w02 = i6.w0(null, i6.f18926i6, false);
                this.K = w02;
                z Y = i6.Y(w02, 12, 12);
                this.L = Y;
                Y.setCallback(t1Var);
            }
            this.f45069y.setColor(i6.f19034o2.getColor());
            this.f45070z.setColor(i6.w0(null, i6.f19073q5, false));
            this.A.setColor(i6.f19034o2.getColor());
            if (this.M.isOutOwner()) {
                TextPaint textPaint2 = this.f45068x;
                int i13 = i6.Xa;
                textPaint2.setColor(i6.v0(i13, e6Var));
                this.B.setColor(i6.v0(i13, e6Var));
                this.C.setColor(i6.v0(i6.f18784ab, e6Var));
            } else {
                TextPaint textPaint3 = this.f45068x;
                int i14 = i6.Kc;
                textPaint3.setColor(i6.v0(i14, e6Var));
                this.B.setColor(i6.v0(i14, e6Var));
                this.C.setColor(i6.v0(i6.Uc, e6Var));
            }
            if (this.N) {
                this.B.setColor(i6.v0(i6.fk, e6Var));
            }
            canvas.save();
            int dp = i11 - AndroidUtilities.dp(4.0f);
            float f11 = dp;
            canvas.translate(f11, i10);
            this.I.set(dp, i10, this.f45058m + dp, this.f45057l + i10);
            canvas.saveLayer(0.0f, 0.0f, this.f45058m, this.f45057l, this.D, 31);
            this.d.draw(canvas);
            float f12 = this.f45058m / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.H.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.H.height();
            this.F.set(f12 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f12, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.E);
            float f13 = dp3 / 2.0f;
            float f14 = dp4 / 2.0f;
            this.F.set(f12 - f13, dp2 - f14, f12 + f13, dp2 + f14);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.B);
            Drawable drawable = this.f45061p;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.F.left), AndroidUtilities.dp(6.96f) + ((int) this.F.centerY()));
                this.f45061p.draw(canvas);
            }
            String str = this.f45062q;
            float centerX = this.F.centerX();
            if (this.N) {
                f7 = 8.0f;
            } else {
                f7 = 0.0f;
            }
            float dp5 = centerX + AndroidUtilities.dp(f7);
            float centerY = this.F.centerY() + AndroidUtilities.dp(4.0f);
            if (this.N) {
                textPaint = this.f45067w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, dp5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
            int dp6 = AndroidUtilities.dp(128.0f) + i10;
            this.S = this.f45059n + dp6;
            this.T = (int) ((this.f45063r / 2.0f) + f11);
            canvas.save();
            canvas.translate(this.f45063r / 2.0f, 0.0f);
            this.f45064s.draw(canvas);
            canvas.translate(0.0f, this.f45059n);
            this.f45065t.draw(canvas);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f45060o);
            int C = w1.C(6.0f, this.f45060o, dp6);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                boolean[] zArr2 = this.f45056k;
                if (i15 >= zArr2.length) {
                    break;
                } else if (zArr2[i15]) {
                    canvas.save();
                    int i17 = i15;
                    float f15 = 0.0f;
                    do {
                        f15 += this.h[i17] + AndroidUtilities.dp(40.0f);
                        i17++;
                        zArr = this.f45056k;
                        if (i17 >= zArr.length || this.f45054i[i17]) {
                            break;
                        }
                    } while (zArr[i17]);
                    float f16 = f12 - (f15 / 2.0f);
                    canvas.translate(f16, 0.0f);
                    int i18 = ((int) f16) + dp;
                    int i19 = i15;
                    while (true) {
                        TLRPC.User user = this.f45053g[i19];
                        if (this.M.isOutOwner()) {
                            v02 = i6.v0(i6.Xa, e6Var);
                        } else {
                            int colorId = UserObject.getColorId(user);
                            if (colorId < 7) {
                                v02 = i6.v0(i6.f19094r8[colorId], e6Var);
                            } else {
                                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                                if (peerColors == null) {
                                    color = null;
                                } else {
                                    color = peerColors.getColor(colorId);
                                }
                                if (color != null) {
                                    v02 = color.getColor1();
                                } else {
                                    v02 = i6.v0(i6.f19094r8[0], e6Var);
                                }
                            }
                        }
                        int i20 = this.O;
                        if (i20 >= 0 && i20 == i19) {
                            i12 = v02;
                        } else {
                            i12 = i16;
                        }
                        this.f45068x.setColor(v02);
                        this.C.setColor(v02);
                        this.C.setAlpha(25);
                        this.f45049a[i19].draw(canvas);
                        CharSequence charSequence = this.f45052f[i19];
                        int i21 = i18;
                        canvas.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.f45068x);
                        this.G.set(0.0f, 0.0f, this.h[i19] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawRoundRect(this.G, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.C);
                        float f17 = i21;
                        this.f45055j[i19].set(i21, C, (int) (this.G.width() + f17), AndroidUtilities.dp(24.0f) + C);
                        canvas.translate(this.G.width() + AndroidUtilities.dp(6.0f), 0.0f);
                        i18 = (int) (this.G.width() + AndroidUtilities.dp(6.0f) + f17);
                        i19++;
                        boolean[] zArr3 = this.f45056k;
                        if (i19 >= zArr3.length || this.f45054i[i19] || !zArr3[i19]) {
                            break;
                        }
                        i16 = i12;
                    }
                    canvas.restore();
                    canvas.translate(0.0f, AndroidUtilities.dp(30.0f));
                    C += AndroidUtilities.dp(30.0f);
                    i15 = i19;
                    i16 = i12;
                } else {
                    i15++;
                }
            }
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f));
            canvas.save();
            canvas.translate(this.f45063r / 2.0f, 0.0f);
            this.f45066u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (i6.I.q()) {
                    f10 = 0.12f;
                } else {
                    f10 = 0.1f;
                }
                int l1 = i6.l1(f10, i16);
                if (this.K != l1) {
                    z zVar2 = this.L;
                    this.K = l1;
                    i6.B1(zVar2, l1, true);
                }
                this.L.setBounds(this.f45055j[this.O]);
                this.L.setCallback(t1Var);
            }
            z80 z80Var = this.U;
            if (z80Var != null && z80Var.f(canvas)) {
                t1Var.invalidate();
            }
        }
    }

    public final void c(boolean z10) {
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults() && this.L != null) {
            z80 z80Var = this.U;
            if (z80Var != null) {
                z80Var.d(true);
            }
            t1 t1Var = this.f45051c;
            if (z10) {
                this.L.setCallback(new f(this, 7));
                this.L.setState(this.J);
                t1Var.invalidate();
                return;
            }
            this.L.setState(StateSet.NOTHING);
            t1Var.invalidate();
        }
    }

    public final void d(MessageObject messageObject, int i10) {
        boolean z10;
        TLRPC.User user;
        boolean z11;
        TLRPC.User user2 = null;
        this.M = null;
        this.f45064s = null;
        this.f45065t = null;
        this.f45066u = null;
        this.f45057l = 0;
        this.f45058m = 0;
        this.N = false;
        if (messageObject.isGiveawayResults()) {
            this.M = messageObject;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f45067w = new TextPaint(1);
                this.f45068x = new TextPaint(1);
                this.f45069y = new TextPaint(1);
                this.f45070z = new TextPaint(1);
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
                this.f45052f = new CharSequence[10];
                this.f45053g = new TLRPC.User[10];
                this.h = new float[10];
                this.f45054i = new boolean[10];
                this.f45055j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f45051c);
                this.d = imageReceiver;
                imageReceiver.setAllowLoadingOnAttachedOnly(true);
                Paint paint = this.E;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTypeface(AndroidUtilities.bold());
                this.v.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTextSize(AndroidUtilities.dp(12.0f));
                TextPaint textPaint = this.v;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.f45067w.setTypeface(AndroidUtilities.bold());
                this.f45067w.setTextSize(AndroidUtilities.dp(12.0f));
                this.f45067w.setTextAlign(align);
                this.f45067w.setColor(-1);
                this.f45068x.setTypeface(AndroidUtilities.bold());
                this.f45068x.setTextSize(AndroidUtilities.dp(13.0f));
                this.A.setTextSize(AndroidUtilities.dp(13.0f));
                this.f45069y.setTextSize(AndroidUtilities.dp(14.0f));
                this.f45070z.setTextSize(AndroidUtilities.dp(14.0f));
                this.f45070z.setTextAlign(align);
            }
            if (this.f45049a == null) {
                this.f45049a = new ImageReceiver[10];
                this.f45050b = new f9[10];
                this.f45056k = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f45049a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.f45051c);
                    this.f45049a[i11].setAllowLoadingOnAttachedOnly(true);
                    this.f45049a[i11].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f45050b[i11] = new f9((e6) null);
                    this.f45050b[i11].u(AndroidUtilities.dp(18.0f));
                    this.f45055j[i11] = new Rect();
                    i11++;
                }
            }
            this.d.setAllowStartLottieAnimation(false);
            if (this.e == null) {
                this.e = new xi0(R.raw.giveaway_results, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
            }
            this.d.setImageBitmap(this.e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f45049a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f45049a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f45050b = (f9[]) Arrays.copyOf(this.f45050b, size);
                this.f45056k = Arrays.copyOf(this.f45056k, size);
                this.f45052f = (CharSequence[]) Arrays.copyOf(this.f45052f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f45054i = Arrays.copyOf(this.f45054i, size);
                this.f45055j = (Rect[]) Arrays.copyOf(this.f45055j, size);
                this.f45053g = (TLRPC.User[]) Arrays.copyOf(this.f45053g, size);
                for (int i12 = length - 1; i12 < size; i12++) {
                    this.f45049a[i12] = new ImageReceiver(this.f45051c);
                    this.f45049a[i12].setAllowLoadingOnAttachedOnly(true);
                    this.f45049a[i12].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f45050b[i12] = new f9((e6) null);
                    this.f45050b[i12].u(AndroidUtilities.dp(18.0f));
                    this.f45055j[i12] = new Rect();
                }
            }
            int dp = AndroidUtilities.dp(90.0f);
            int dp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tL_messageMediaGiveawayResults.winners_count), i6.gc, 0, new b(this, messageObject, tL_messageMediaGiveawayResults, 0));
            this.R.append((CharSequence) AndroidUtilities.replaceCharSequence("%1$d", replaceSingleTag, AndroidUtilities.replaceTags("**" + tL_messageMediaGiveawayResults.winners_count + "**")));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinners", tL_messageMediaGiveawayResults.winners_count));
            this.R.append((CharSequence) replaceTags2);
            this.R.setSpan(new RelativeSizeSpan(1.05f), replaceSingleTag.length() + 2, replaceTags2.length() + replaceSingleTag.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayResultsMsgAllAndMoreWinners", tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), new Object[0])));
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
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringSpaced("BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.BoostingGiveawayResultsMsgAllWinnersReceivedLinks));
            }
            TextPaint textPaint2 = this.f45069y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f45064s = jw0.c(spannableStringBuilder, textPaint2, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f45065t = jw0.c(this.R, this.f45069y, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f45066u = jw0.c(spannableStringBuilder2, this.f45069y, dp2, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, dp2, 10, true);
            int max = Math.max(i10, dp2);
            this.f45063r = max - dp2;
            float f7 = max;
            float f10 = dp;
            float f11 = f10 / 2.0f;
            this.d.setImageCoords((f7 / 2.0f) - f11, AndroidUtilities.dp(70.0f) - f11, f10, f10);
            StaticLayout staticLayout = this.f45064s;
            int dp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f45059n = dp3;
            StaticLayout staticLayout2 = this.f45065t;
            this.f45060o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp3;
            StaticLayout staticLayout3 = this.f45066u;
            int lineBottom = this.f45057l + this.f45060o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f45057l = lineBottom;
            this.f45057l = AndroidUtilities.dp(128.0f) + lineBottom;
            this.f45058m = max;
            if (this.N) {
                if (this.f45061p == null) {
                    this.f45061p = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f45062q = LocaleController.formatNumber((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f45061p = null;
                this.f45062q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f45062q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            if (this.N) {
                Rect rect = this.H;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f45056k, false);
            this.f45057l = AndroidUtilities.dp(30.0f) + this.f45057l;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Long l4 = arrayList2.get(i13);
                i13++;
                Long l10 = l4;
                if (MessagesController.getInstance(UserConfig.selectedAccount).getUser(l10) != null) {
                    arrayList.add(l10);
                }
            }
            int i14 = 0;
            float f12 = 0.0f;
            while (i14 < arrayList.size()) {
                Long l11 = (Long) arrayList.get(i14);
                long longValue = l11.longValue();
                TLRPC.User user3 = MessagesController.getInstance(UserConfig.selectedAccount).getUser(l11);
                if (user3 != null) {
                    this.f45056k[i14] = true;
                    this.f45053g[i14] = user3;
                    user = user2;
                    this.f45052f[i14] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user3), this.f45068x.getFontMetricsInt(), false), this.f45068x, 0.8f * f7, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f45068x;
                    CharSequence charSequence = this.f45052f[i14];
                    fArr[i14] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.h[i14] + AndroidUtilities.dp(40.0f);
                    f12 += dp4;
                    if (i14 > 0) {
                        boolean[] zArr = this.f45054i;
                        if (f12 > 0.9f * f7) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zArr[i14] = z11;
                        if (z11) {
                            this.f45057l = AndroidUtilities.dp(30.0f) + this.f45057l;
                            f12 = dp4;
                        }
                    } else {
                        this.f45054i[i14] = false;
                    }
                    this.f45050b[i14].r(user3);
                    this.f45049a[i14].setForUserOrChat(user3, this.f45050b[i14]);
                    this.f45049a[i14].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    user = user2;
                    this.f45053g[i14] = user;
                    this.f45056k[i14] = false;
                    this.f45052f[i14] = "";
                    this.f45054i[i14] = false;
                    this.h[i14] = AndroidUtilities.dp(20.0f);
                    this.f45050b[i14].n(longValue, "", "");
                }
                i14++;
                user2 = user;
            }
        }
    }
}
