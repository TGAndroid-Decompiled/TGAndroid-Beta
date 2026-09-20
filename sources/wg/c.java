package wg;

import ah.d;
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
import org.telegram.messenger.l0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.web.b1;
import tg.s;
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
    public h90 U;
    public ImageReceiver[] f45344a;
    public g9[] f45345b;
    public final u1 f45346c;
    public ImageReceiver d;
    public hj0 e;
    public CharSequence[] f45347f;
    public TLRPC.User[] f45348g;
    public float[] h;
    public boolean[] f45349i;
    public Rect[] f45350j;
    public boolean[] f45351k;
    public int f45354n;
    public int f45355o;
    public Drawable f45356p;
    public String f45357q;
    public int f45358r;
    public StaticLayout f45359s;
    public StaticLayout f45360t;
    public StaticLayout f45361u;
    public TextPaint v;
    public TextPaint f45362w;
    public TextPaint f45363x;
    public TextPaint f45364y;
    public TextPaint f45365z;
    public int f45352l = 0;
    public int f45353m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public c(u1 u1Var) {
        this.f45346c = u1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i10;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            h90 h90Var = this.U;
            u1 u1Var = this.f45346c;
            if (h90Var == null) {
                this.U = new h90(u1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f45360t) != null && (i10 = y3 - this.S) > 0) {
                int offsetForHorizontal = this.f45360t.getOffsetForHorizontal(staticLayout.getLineForVertical(i10 - AndroidUtilities.dp(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.d(true);
                        clickableSpanArr[0].onClick(u1Var);
                        return true;
                    }
                    l90 l90Var = new l90(clickableSpanArr[0], null, x10, y3, 0);
                    this.U.a(l90Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        e90 b10 = l90Var.b();
                        b10.e(this.f45360t, spanStart, this.T, this.S);
                        this.f45360t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
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
                    Rect[] rectArr = this.f45350j;
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
                        u1Var.getDelegate().M(this.O, u1Var);
                    }
                    u1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    MessageObject messageObject2 = this.M;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        s.d(messageObject2, new b1(messageObject2, 10), new j3(6));
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

    public final void b(Canvas canvas, int i10, int i11, f6 f6Var) {
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
            u1 u1Var = this.f45346c;
            if (zVar == null) {
                int w02 = j6.w0(null, j6.f19184i6, false);
                this.K = w02;
                z Y = j6.Y(w02, 12, 12);
                this.L = Y;
                Y.setCallback(u1Var);
            }
            this.f45364y.setColor(j6.f19292o2.getColor());
            this.f45365z.setColor(j6.w0(null, j6.f19332q5, false));
            this.A.setColor(j6.f19292o2.getColor());
            if (this.M.isOutOwner()) {
                TextPaint textPaint2 = this.f45363x;
                int i13 = j6.Xa;
                textPaint2.setColor(j6.v0(i13, f6Var));
                this.B.setColor(j6.v0(i13, f6Var));
                this.C.setColor(j6.v0(j6.f19042ab, f6Var));
            } else {
                TextPaint textPaint3 = this.f45363x;
                int i14 = j6.Kc;
                textPaint3.setColor(j6.v0(i14, f6Var));
                this.B.setColor(j6.v0(i14, f6Var));
                this.C.setColor(j6.v0(j6.Uc, f6Var));
            }
            if (this.N) {
                this.B.setColor(j6.v0(j6.fk, f6Var));
            }
            canvas.save();
            int dp = i11 - AndroidUtilities.dp(4.0f);
            float f11 = dp;
            canvas.translate(f11, i10);
            this.I.set(dp, i10, this.f45353m + dp, this.f45352l + i10);
            canvas.saveLayer(0.0f, 0.0f, this.f45353m, this.f45352l, this.D, 31);
            this.d.draw(canvas);
            float f12 = this.f45353m / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.H.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.H.height();
            this.F.set(f12 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f12, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.E);
            float f13 = dp3 / 2.0f;
            float f14 = dp4 / 2.0f;
            this.F.set(f12 - f13, dp2 - f14, f12 + f13, dp2 + f14);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.B);
            Drawable drawable = this.f45356p;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.F.left), AndroidUtilities.dp(6.96f) + ((int) this.F.centerY()));
                this.f45356p.draw(canvas);
            }
            String str = this.f45357q;
            float centerX = this.F.centerX();
            if (this.N) {
                f7 = 8.0f;
            } else {
                f7 = 0.0f;
            }
            float dp5 = centerX + AndroidUtilities.dp(f7);
            float centerY = this.F.centerY() + AndroidUtilities.dp(4.0f);
            if (this.N) {
                textPaint = this.f45362w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, dp5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
            int dp6 = AndroidUtilities.dp(128.0f) + i10;
            this.S = this.f45354n + dp6;
            this.T = (int) ((this.f45358r / 2.0f) + f11);
            canvas.save();
            canvas.translate(this.f45358r / 2.0f, 0.0f);
            this.f45359s.draw(canvas);
            canvas.translate(0.0f, this.f45354n);
            this.f45360t.draw(canvas);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f45355o);
            int C = l0.C(6.0f, this.f45355o, dp6);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                boolean[] zArr2 = this.f45351k;
                if (i15 >= zArr2.length) {
                    break;
                } else if (zArr2[i15]) {
                    canvas.save();
                    int i17 = i15;
                    float f15 = 0.0f;
                    do {
                        f15 += this.h[i17] + AndroidUtilities.dp(40.0f);
                        i17++;
                        zArr = this.f45351k;
                        if (i17 >= zArr.length || this.f45349i[i17]) {
                            break;
                        }
                    } while (zArr[i17]);
                    float f16 = f12 - (f15 / 2.0f);
                    canvas.translate(f16, 0.0f);
                    int i18 = ((int) f16) + dp;
                    int i19 = i15;
                    while (true) {
                        TLRPC.User user = this.f45348g[i19];
                        if (this.M.isOutOwner()) {
                            v02 = j6.v0(j6.Xa, f6Var);
                        } else {
                            int colorId = UserObject.getColorId(user);
                            if (colorId < 7) {
                                v02 = j6.v0(j6.f19353r8[colorId], f6Var);
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
                                    v02 = j6.v0(j6.f19353r8[0], f6Var);
                                }
                            }
                        }
                        int i20 = this.O;
                        if (i20 >= 0 && i20 == i19) {
                            i12 = v02;
                        } else {
                            i12 = i16;
                        }
                        this.f45363x.setColor(v02);
                        this.C.setColor(v02);
                        this.C.setAlpha(25);
                        this.f45344a[i19].draw(canvas);
                        CharSequence charSequence = this.f45347f[i19];
                        int i21 = i18;
                        canvas.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.f45363x);
                        this.G.set(0.0f, 0.0f, this.h[i19] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawRoundRect(this.G, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.C);
                        float f17 = i21;
                        this.f45350j[i19].set(i21, C, (int) (this.G.width() + f17), AndroidUtilities.dp(24.0f) + C);
                        canvas.translate(this.G.width() + AndroidUtilities.dp(6.0f), 0.0f);
                        i18 = (int) (this.G.width() + AndroidUtilities.dp(6.0f) + f17);
                        i19++;
                        boolean[] zArr3 = this.f45351k;
                        if (i19 >= zArr3.length || this.f45349i[i19] || !zArr3[i19]) {
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
            canvas.translate(this.f45358r / 2.0f, 0.0f);
            this.f45361u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (j6.I.q()) {
                    f10 = 0.12f;
                } else {
                    f10 = 0.1f;
                }
                int l1 = j6.l1(f10, i16);
                if (this.K != l1) {
                    z zVar2 = this.L;
                    this.K = l1;
                    j6.B1(zVar2, l1, true);
                }
                this.L.setBounds(this.f45350j[this.O]);
                this.L.setCallback(u1Var);
            }
            h90 h90Var = this.U;
            if (h90Var != null && h90Var.f(canvas)) {
                u1Var.invalidate();
            }
        }
    }

    public final void c(boolean z10) {
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults() && this.L != null) {
            h90 h90Var = this.U;
            if (h90Var != null) {
                h90Var.d(true);
            }
            u1 u1Var = this.f45346c;
            if (z10) {
                this.L.setCallback(new d(this, 8));
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
        this.f45359s = null;
        this.f45360t = null;
        this.f45361u = null;
        this.f45352l = 0;
        this.f45353m = 0;
        this.N = false;
        if (messageObject.isGiveawayResults()) {
            this.M = messageObject;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f45362w = new TextPaint(1);
                this.f45363x = new TextPaint(1);
                this.f45364y = new TextPaint(1);
                this.f45365z = new TextPaint(1);
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
                this.f45347f = new CharSequence[10];
                this.f45348g = new TLRPC.User[10];
                this.h = new float[10];
                this.f45349i = new boolean[10];
                this.f45350j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f45346c);
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
                this.f45362w.setTypeface(AndroidUtilities.bold());
                this.f45362w.setTextSize(AndroidUtilities.dp(12.0f));
                this.f45362w.setTextAlign(align);
                this.f45362w.setColor(-1);
                this.f45363x.setTypeface(AndroidUtilities.bold());
                this.f45363x.setTextSize(AndroidUtilities.dp(13.0f));
                this.A.setTextSize(AndroidUtilities.dp(13.0f));
                this.f45364y.setTextSize(AndroidUtilities.dp(14.0f));
                this.f45365z.setTextSize(AndroidUtilities.dp(14.0f));
                this.f45365z.setTextAlign(align);
            }
            if (this.f45344a == null) {
                this.f45344a = new ImageReceiver[10];
                this.f45345b = new g9[10];
                this.f45351k = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f45344a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.f45346c);
                    this.f45344a[i11].setAllowLoadingOnAttachedOnly(true);
                    this.f45344a[i11].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f45345b[i11] = new g9((f6) null);
                    this.f45345b[i11].u(AndroidUtilities.dp(18.0f));
                    this.f45350j[i11] = new Rect();
                    i11++;
                }
            }
            this.d.setAllowStartLottieAnimation(false);
            if (this.e == null) {
                this.e = new hj0(R.raw.giveaway_results, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
            }
            this.d.setImageBitmap(this.e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f45344a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f45344a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f45345b = (g9[]) Arrays.copyOf(this.f45345b, size);
                this.f45351k = Arrays.copyOf(this.f45351k, size);
                this.f45347f = (CharSequence[]) Arrays.copyOf(this.f45347f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f45349i = Arrays.copyOf(this.f45349i, size);
                this.f45350j = (Rect[]) Arrays.copyOf(this.f45350j, size);
                this.f45348g = (TLRPC.User[]) Arrays.copyOf(this.f45348g, size);
                for (int i12 = length - 1; i12 < size; i12++) {
                    this.f45344a[i12] = new ImageReceiver(this.f45346c);
                    this.f45344a[i12].setAllowLoadingOnAttachedOnly(true);
                    this.f45344a[i12].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f45345b[i12] = new g9((f6) null);
                    this.f45345b[i12].u(AndroidUtilities.dp(18.0f));
                    this.f45350j[i12] = new Rect();
                }
            }
            int dp = AndroidUtilities.dp(90.0f);
            int dp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tL_messageMediaGiveawayResults.winners_count), j6.gc, 0, new b(this, messageObject, tL_messageMediaGiveawayResults, 0));
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
            TextPaint textPaint2 = this.f45364y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f45359s = uw0.c(spannableStringBuilder, textPaint2, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f45360t = uw0.c(this.R, this.f45364y, dp2, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, dp2, 10, true);
            this.f45361u = uw0.c(spannableStringBuilder2, this.f45364y, dp2, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, dp2, 10, true);
            int max = Math.max(i10, dp2);
            this.f45358r = max - dp2;
            float f7 = max;
            float f10 = dp;
            float f11 = f10 / 2.0f;
            this.d.setImageCoords((f7 / 2.0f) - f11, AndroidUtilities.dp(70.0f) - f11, f10, f10);
            StaticLayout staticLayout = this.f45359s;
            int dp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f45354n = dp3;
            StaticLayout staticLayout2 = this.f45360t;
            this.f45355o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp3;
            StaticLayout staticLayout3 = this.f45361u;
            int lineBottom = this.f45352l + this.f45355o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f45352l = lineBottom;
            this.f45352l = AndroidUtilities.dp(128.0f) + lineBottom;
            this.f45353m = max;
            if (this.N) {
                if (this.f45356p == null) {
                    this.f45356p = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f45357q = LocaleController.formatNumber((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f45356p = null;
                this.f45357q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f45357q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            if (this.N) {
                Rect rect = this.H;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f45351k, false);
            this.f45352l = AndroidUtilities.dp(30.0f) + this.f45352l;
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
                    this.f45351k[i14] = true;
                    this.f45348g[i14] = user3;
                    user = user2;
                    this.f45347f[i14] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user3), this.f45363x.getFontMetricsInt(), false), this.f45363x, 0.8f * f7, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f45363x;
                    CharSequence charSequence = this.f45347f[i14];
                    fArr[i14] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.h[i14] + AndroidUtilities.dp(40.0f);
                    f12 += dp4;
                    if (i14 > 0) {
                        boolean[] zArr = this.f45349i;
                        if (f12 > 0.9f * f7) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zArr[i14] = z11;
                        if (z11) {
                            this.f45352l = AndroidUtilities.dp(30.0f) + this.f45352l;
                            f12 = dp4;
                        }
                    } else {
                        this.f45349i[i14] = false;
                    }
                    this.f45345b[i14].r(user3);
                    this.f45344a[i14].setForUserOrChat(user3, this.f45345b[i14]);
                    this.f45344a[i14].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    user = user2;
                    this.f45348g[i14] = user;
                    this.f45351k[i14] = false;
                    this.f45347f[i14] = "";
                    this.f45349i[i14] = false;
                    this.h[i14] = AndroidUtilities.dp(20.0f);
                    this.f45345b[i14].n(longValue, "", "");
                }
                i14++;
                user2 = user;
            }
        }
    }
}
