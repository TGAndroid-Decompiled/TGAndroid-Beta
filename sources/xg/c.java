package xg;

import ah.f1;
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
import ci.e;
import ig.l0;
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
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y90;
import ug.r;
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
    public u90 U;
    public ImageReceiver[] f49805a;
    public h9[] f49806b;
    public final u1 f49807c;
    public ImageReceiver d;
    public uj0 e;
    public CharSequence[] f49808f;
    public TLRPC.User[] f49809g;
    public float[] h;
    public boolean[] f49810i;
    public Rect[] f49811j;
    public boolean[] f49812k;
    public int f49815n;
    public int f49816o;
    public Drawable f49817p;
    public String f49818q;
    public int f49819r;
    public StaticLayout f49820s;
    public StaticLayout f49821t;
    public StaticLayout f49822u;
    public TextPaint v;
    public TextPaint f49823w;
    public TextPaint f49824x;
    public TextPaint f49825y;
    public TextPaint f49826z;
    public int f49813l = 0;
    public int f49814m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public c(u1 u1Var) {
        this.f49807c = u1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i10;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            u90 u90Var = this.U;
            u1 u1Var = this.f49807c;
            if (u90Var == null) {
                this.U = new u90(u1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f49821t) != null && (i10 = y3 - this.S) > 0) {
                int offsetForHorizontal = this.f49821t.getOffsetForHorizontal(staticLayout.getLineForVertical(i10 - AndroidUtilities.dp(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.d(true);
                        clickableSpanArr[0].onClick(u1Var);
                        return true;
                    }
                    y90 y90Var = new y90(clickableSpanArr[0], null, x10, y3, 0);
                    this.U.a(y90Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        r90 b10 = y90Var.b();
                        b10.e(this.f49821t, spanStart, this.T, this.S);
                        this.f49821t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return true;
                    }
                }
                this.U.d(true);
                u1Var.invalidate();
            }
            if (action == 0) {
                int i11 = 0;
                while (true) {
                    Rect[] rectArr = this.f49811j;
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
                    if (u1Var.getDelegate() != null) {
                        u1Var.getDelegate().K(this.O, u1Var);
                    }
                    u1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    MessageObject messageObject2 = this.M;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        r.d(messageObject2, new l0(messageObject2, 19), new e(24));
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

    public final void b(Canvas canvas, int i10, int i11, d6 d6Var) {
        float f7;
        TextPaint textPaint;
        float f10;
        boolean[] zArr;
        MessagesController.PeerColor color;
        int w02;
        int i12;
        float f11;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            z zVar = this.L;
            u1 u1Var = this.f49807c;
            if (zVar == null) {
                int x02 = h6.x0(null, h6.f21076i6, false);
                this.K = x02;
                z Z = h6.Z(x02, 12, 12);
                this.L = Z;
                Z.setCallback(u1Var);
            }
            this.f49825y.setColor(h6.f21186o2.getColor());
            this.f49826z.setColor(h6.x0(null, h6.f21224q5, false));
            this.A.setColor(h6.f21186o2.getColor());
            if (this.M.isOutOwner()) {
                TextPaint textPaint2 = this.f49824x;
                int i13 = h6.Xa;
                textPaint2.setColor(h6.w0(i13, d6Var));
                this.B.setColor(h6.w0(i13, d6Var));
                this.C.setColor(h6.w0(h6.f20933ab, d6Var));
            } else {
                TextPaint textPaint3 = this.f49824x;
                int i14 = h6.Kc;
                textPaint3.setColor(h6.w0(i14, d6Var));
                this.B.setColor(h6.w0(i14, d6Var));
                this.C.setColor(h6.w0(h6.Uc, d6Var));
            }
            if (this.N) {
                this.B.setColor(h6.w0(h6.fk, d6Var));
            }
            canvas.save();
            int dp = i11 - AndroidUtilities.dp(4.0f);
            float f12 = dp;
            canvas.translate(f12, i10);
            this.I.set(dp, i10, this.f49814m + dp, this.f49813l + i10);
            canvas.saveLayer(0.0f, 0.0f, this.f49814m, this.f49813l, this.D, 31);
            this.d.draw(canvas);
            float f13 = this.f49814m / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.H.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.H.height();
            this.F.set(f13 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f13, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.E);
            float f14 = dp3 / 2.0f;
            float f15 = dp4 / 2.0f;
            this.F.set(f13 - f14, dp2 - f15, f13 + f14, dp2 + f15);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.B);
            Drawable drawable = this.f49817p;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.F.left), AndroidUtilities.dp(6.96f) + ((int) this.F.centerY()));
                this.f49817p.draw(canvas);
            }
            String str = this.f49818q;
            float centerX = this.F.centerX();
            if (this.N) {
                f7 = 8.0f;
            } else {
                f7 = 0.0f;
            }
            float dp5 = centerX + AndroidUtilities.dp(f7);
            float centerY = this.F.centerY() + AndroidUtilities.dp(4.0f);
            if (this.N) {
                textPaint = this.f49823w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, dp5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
            int dp6 = AndroidUtilities.dp(128.0f) + i10;
            this.S = this.f49815n + dp6;
            this.T = (int) ((this.f49819r / 2.0f) + f12);
            canvas.save();
            canvas.translate(this.f49819r / 2.0f, 0.0f);
            this.f49820s.draw(canvas);
            canvas.translate(0.0f, this.f49815n);
            this.f49821t.draw(canvas);
            canvas.restore();
            float f16 = 6.0f;
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f49816o);
            int C = g0.C(6.0f, this.f49816o, dp6);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                boolean[] zArr2 = this.f49812k;
                if (i15 >= zArr2.length) {
                    break;
                } else if (zArr2[i15]) {
                    canvas.save();
                    int i17 = i15;
                    float f17 = 0.0f;
                    do {
                        f17 += this.h[i17] + AndroidUtilities.dp(40.0f);
                        i17++;
                        zArr = this.f49812k;
                        if (i17 >= zArr.length || this.f49810i[i17]) {
                            break;
                        }
                    } while (zArr[i17]);
                    float f18 = f13 - (f17 / 2.0f);
                    canvas.translate(f18, 0.0f);
                    int i18 = ((int) f18) + dp;
                    int i19 = i15;
                    while (true) {
                        TLRPC.User user = this.f49809g[i19];
                        if (this.M.isOutOwner()) {
                            w02 = h6.w0(h6.Xa, d6Var);
                        } else {
                            int colorId = UserObject.getColorId(user);
                            if (colorId < 7) {
                                w02 = h6.w0(h6.f21246r8[colorId], d6Var);
                            } else {
                                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                                if (peerColors == null) {
                                    color = null;
                                } else {
                                    color = peerColors.getColor(colorId);
                                }
                                if (color != null) {
                                    w02 = color.getColor1();
                                } else {
                                    w02 = h6.w0(h6.f21246r8[0], d6Var);
                                }
                            }
                        }
                        int i20 = this.O;
                        if (i20 >= 0 && i20 == i19) {
                            i12 = w02;
                        } else {
                            i12 = i16;
                        }
                        this.f49824x.setColor(w02);
                        this.C.setColor(w02);
                        this.C.setAlpha(25);
                        this.f49805a[i19].draw(canvas);
                        CharSequence charSequence = this.f49808f[i19];
                        int i21 = i18;
                        f11 = f16;
                        canvas.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.f49824x);
                        this.G.set(0.0f, 0.0f, this.h[i19] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawRoundRect(this.G, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.C);
                        float f19 = i21;
                        this.f49811j[i19].set(i21, C, (int) (this.G.width() + f19), AndroidUtilities.dp(24.0f) + C);
                        canvas.translate(this.G.width() + AndroidUtilities.dp(f11), 0.0f);
                        i18 = (int) (this.G.width() + AndroidUtilities.dp(f11) + f19);
                        i19++;
                        boolean[] zArr3 = this.f49812k;
                        if (i19 >= zArr3.length || this.f49810i[i19] || !zArr3[i19]) {
                            break;
                        }
                        f16 = f11;
                        i16 = i12;
                    }
                    canvas.restore();
                    canvas.translate(0.0f, AndroidUtilities.dp(30.0f));
                    C += AndroidUtilities.dp(30.0f);
                    f16 = f11;
                    i15 = i19;
                    i16 = i12;
                } else {
                    i15++;
                }
            }
            canvas.translate(0.0f, AndroidUtilities.dp(f16));
            canvas.save();
            canvas.translate(this.f49819r / 2.0f, 0.0f);
            this.f49822u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (h6.I.q()) {
                    f10 = 0.12f;
                } else {
                    f10 = 0.1f;
                }
                int m12 = h6.m1(f10, i16);
                if (this.K != m12) {
                    z zVar2 = this.L;
                    this.K = m12;
                    h6.C1(zVar2, m12, true);
                }
                this.L.setBounds(this.f49811j[this.O]);
                this.L.setCallback(u1Var);
            }
            u90 u90Var = this.U;
            if (u90Var != null && u90Var.f(canvas)) {
                u1Var.invalidate();
            }
        }
    }

    public final void c(boolean z10) {
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults() && this.L != null) {
            u90 u90Var = this.U;
            if (u90Var != null) {
                u90Var.d(true);
            }
            u1 u1Var = this.f49807c;
            if (z10) {
                this.L.setCallback(new f1(this, 10));
                this.L.setState(this.J);
                u1Var.invalidate();
                return;
            }
            this.L.setState(StateSet.NOTHING);
            u1Var.invalidate();
        }
    }

    public final void d(MessageObject messageObject, int i10) {
        boolean z10;
        TLRPC.User user;
        boolean z11;
        TLRPC.User user2 = null;
        this.M = null;
        this.f49820s = null;
        this.f49821t = null;
        this.f49822u = null;
        this.f49813l = 0;
        this.f49814m = 0;
        this.N = false;
        if (messageObject.isGiveawayResults()) {
            this.M = messageObject;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f49823w = new TextPaint(1);
                this.f49824x = new TextPaint(1);
                this.f49825y = new TextPaint(1);
                this.f49826z = new TextPaint(1);
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
                this.f49808f = new CharSequence[10];
                this.f49809g = new TLRPC.User[10];
                this.h = new float[10];
                this.f49810i = new boolean[10];
                this.f49811j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f49807c);
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
                this.f49823w.setTypeface(AndroidUtilities.bold());
                this.f49823w.setTextSize(AndroidUtilities.dp(12.0f));
                this.f49823w.setTextAlign(align);
                this.f49823w.setColor(-1);
                this.f49824x.setTypeface(AndroidUtilities.bold());
                this.f49824x.setTextSize(AndroidUtilities.dp(13.0f));
                this.A.setTextSize(AndroidUtilities.dp(13.0f));
                this.f49825y.setTextSize(AndroidUtilities.dp(14.0f));
                this.f49826z.setTextSize(AndroidUtilities.dp(14.0f));
                this.f49826z.setTextAlign(align);
            }
            if (this.f49805a == null) {
                this.f49805a = new ImageReceiver[10];
                this.f49806b = new h9[10];
                this.f49812k = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f49805a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.f49807c);
                    this.f49805a[i11].setAllowLoadingOnAttachedOnly(true);
                    this.f49805a[i11].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f49806b[i11] = new h9((d6) null);
                    this.f49806b[i11].u(AndroidUtilities.dp(18.0f));
                    this.f49811j[i11] = new Rect();
                    i11++;
                }
            }
            this.d.setAllowStartLottieAnimation(false);
            if (this.e == null) {
                this.e = new uj0(R.raw.giveaway_results, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
            }
            this.d.setImageBitmap(this.e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f49805a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f49805a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f49806b = (h9[]) Arrays.copyOf(this.f49806b, size);
                this.f49812k = Arrays.copyOf(this.f49812k, size);
                this.f49808f = (CharSequence[]) Arrays.copyOf(this.f49808f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f49810i = Arrays.copyOf(this.f49810i, size);
                this.f49811j = (Rect[]) Arrays.copyOf(this.f49811j, size);
                this.f49809g = (TLRPC.User[]) Arrays.copyOf(this.f49809g, size);
                for (int i12 = length - 1; i12 < size; i12++) {
                    this.f49805a[i12] = new ImageReceiver(this.f49807c);
                    this.f49805a[i12].setAllowLoadingOnAttachedOnly(true);
                    this.f49805a[i12].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f49806b[i12] = new h9((d6) null);
                    this.f49806b[i12].u(AndroidUtilities.dp(18.0f));
                    this.f49811j[i12] = new Rect();
                }
            }
            int dp = AndroidUtilities.dp(90.0f);
            int dp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tL_messageMediaGiveawayResults.winners_count), h6.f21046gc, 0, new b(this, messageObject, tL_messageMediaGiveawayResults, 0));
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
            TextPaint textPaint2 = this.f49825y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f49820s = ex0.c(spannableStringBuilder, textPaint2, dp2, alignment, AndroidUtilities.dp(2.0f), truncateAt, dp2, 10, true);
            this.f49821t = ex0.c(this.R, this.f49825y, dp2, alignment, AndroidUtilities.dp(2.0f), truncateAt, dp2, 10, true);
            this.f49822u = ex0.c(spannableStringBuilder2, this.f49825y, dp2, alignment, AndroidUtilities.dp(3.0f), truncateAt, dp2, 10, true);
            int max = Math.max(i10, dp2);
            this.f49819r = max - dp2;
            float f7 = max;
            float f10 = dp;
            float f11 = f10 / 2.0f;
            this.d.setImageCoords((f7 / 2.0f) - f11, AndroidUtilities.dp(70.0f) - f11, f10, f10);
            StaticLayout staticLayout = this.f49820s;
            int dp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f49815n = dp3;
            StaticLayout staticLayout2 = this.f49821t;
            this.f49816o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp3;
            StaticLayout staticLayout3 = this.f49822u;
            int lineBottom = this.f49813l + this.f49816o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f49813l = lineBottom;
            this.f49813l = AndroidUtilities.dp(128.0f) + lineBottom;
            this.f49814m = max;
            if (this.N) {
                if (this.f49817p == null) {
                    this.f49817p = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f49818q = LocaleController.formatNumber((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f49817p = null;
                this.f49818q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f49818q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            if (this.N) {
                Rect rect = this.H;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f49812k, false);
            this.f49813l = AndroidUtilities.dp(30.0f) + this.f49813l;
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
                    this.f49812k[i14] = true;
                    this.f49809g[i14] = user3;
                    user = user2;
                    this.f49808f[i14] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user3), this.f49824x.getFontMetricsInt(), false), this.f49824x, 0.8f * f7, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f49824x;
                    CharSequence charSequence = this.f49808f[i14];
                    fArr[i14] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.h[i14] + AndroidUtilities.dp(40.0f);
                    f12 += dp4;
                    if (i14 > 0) {
                        boolean[] zArr = this.f49810i;
                        if (f12 > 0.9f * f7) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zArr[i14] = z11;
                        if (z11) {
                            this.f49813l = AndroidUtilities.dp(30.0f) + this.f49813l;
                            f12 = dp4;
                        }
                    } else {
                        this.f49810i[i14] = false;
                    }
                    this.f49806b[i14].r(user3);
                    this.f49805a[i14].setForUserOrChat(user3, this.f49806b[i14]);
                    this.f49805a[i14].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    user = user2;
                    this.f49809g[i14] = user;
                    this.f49812k[i14] = false;
                    this.f49808f[i14] = "";
                    this.f49810i[i14] = false;
                    this.h[i14] = AndroidUtilities.dp(20.0f);
                    this.f49806b[i14].n(longValue, "", "");
                }
                i14++;
                user2 = user;
            }
        }
    }
}
