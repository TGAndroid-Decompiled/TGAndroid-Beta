package yg;

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
import bh.u0;
import di.e;
import ig.o;
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
import org.telegram.messenger.t;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.xj0;
import vg.s;
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
    public MessageObject M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public w90 U;
    public ImageReceiver[] f52554a;
    public j9[] f52555b;
    public final s1 f52556c;
    public ImageReceiver d;
    public xj0 e;
    public CharSequence[] f52557f;
    public TLRPC.User[] f52558g;
    public float[] h;
    public boolean[] f52559i;
    public Rect[] f52560j;
    public boolean[] f52561k;
    public int f52564n;
    public int f52565o;
    public Drawable f52566p;
    public String f52567q;
    public int f52568r;
    public StaticLayout f52569s;
    public StaticLayout f52570t;
    public StaticLayout f52571u;
    public TextPaint v;
    public TextPaint f52572w;
    public TextPaint f52573x;
    public TextPaint f52574y;
    public TextPaint f52575z;
    public int f52562l = 0;
    public int f52563m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public c(s1 s1Var) {
        this.f52556c = s1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i10;
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults()) {
            w90 w90Var = this.U;
            s1 s1Var = this.f52556c;
            if (w90Var == null) {
                this.U = new w90(s1Var);
            }
            int action = motionEvent.getAction();
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.f52570t) != null && (i10 = y3 - this.S) > 0) {
                int offsetForHorizontal = this.f52570t.getOffsetForHorizontal(staticLayout.getLineForVertical(i10 - AndroidUtilities.dp(10.0f)), x9 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.d(true);
                        clickableSpanArr[0].onClick(s1Var);
                        return true;
                    }
                    aa0 aa0Var = new aa0(clickableSpanArr[0], null, x9, y3, 0);
                    this.U.a(aa0Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        s90 b10 = aa0Var.b();
                        b10.e(this.f52570t, spanStart, this.T, this.S);
                        this.f52570t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return true;
                    }
                }
                this.U.d(true);
                s1Var.invalidate();
            }
            if (action == 0) {
                int i11 = 0;
                while (true) {
                    Rect[] rectArr = this.f52560j;
                    if (i11 < rectArr.length) {
                        if (rectArr[i11].contains(x9, y3)) {
                            this.O = i11;
                            this.L.setHotspot(x9, y3);
                            this.P = true;
                            c(true);
                            return true;
                        }
                        i11++;
                    } else if (this.I.contains(x9, y3)) {
                        this.Q = true;
                        return true;
                    }
                }
            } else if (action == 1) {
                if (this.P) {
                    if (s1Var.getDelegate() != null) {
                        s1Var.getDelegate().J(this.O, s1Var);
                    }
                    s1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    MessageObject messageObject2 = this.M;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        s.d(messageObject2, new o(messageObject2, 23), new e(24));
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

    public final void b(Canvas canvas, int i10, int i11, u6 u6Var) {
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
            y yVar = this.L;
            s1 s1Var = this.f52556c;
            if (yVar == null) {
                int x02 = y6.x0(null, y6.f23446i6, false);
                this.K = x02;
                y Z = y6.Z(x02, 12, 12);
                this.L = Z;
                Z.setCallback(s1Var);
            }
            this.f52574y.setColor(y6.f23554o2.getColor());
            this.f52575z.setColor(y6.x0(null, y6.q5, false));
            this.A.setColor(y6.f23554o2.getColor());
            if (this.M.isOutOwner()) {
                TextPaint textPaint2 = this.f52573x;
                int i13 = y6.Xa;
                textPaint2.setColor(y6.w0(i13, u6Var));
                this.B.setColor(y6.w0(i13, u6Var));
                this.C.setColor(y6.w0(y6.f23301ab, u6Var));
            } else {
                TextPaint textPaint3 = this.f52573x;
                int i14 = y6.Kc;
                textPaint3.setColor(y6.w0(i14, u6Var));
                this.B.setColor(y6.w0(i14, u6Var));
                this.C.setColor(y6.w0(y6.Uc, u6Var));
            }
            if (this.N) {
                this.B.setColor(y6.w0(y6.fk, u6Var));
            }
            canvas.save();
            int dp = i11 - AndroidUtilities.dp(4.0f);
            float f12 = dp;
            canvas.translate(f12, i10);
            this.I.set(dp, i10, this.f52563m + dp, this.f52562l + i10);
            canvas.saveLayer(0.0f, 0.0f, this.f52563m, this.f52562l, this.D, 31);
            this.d.draw(canvas);
            float f13 = this.f52563m / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.H.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.H.height();
            this.F.set(f13 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f13, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.E);
            float f14 = dp3 / 2.0f;
            float f15 = dp4 / 2.0f;
            this.F.set(f13 - f14, dp2 - f15, f13 + f14, dp2 + f15);
            canvas.drawRoundRect(this.F, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.B);
            Drawable drawable = this.f52566p;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.F.left), AndroidUtilities.dp(6.96f) + ((int) this.F.centerY()));
                this.f52566p.draw(canvas);
            }
            String str = this.f52567q;
            float centerX = this.F.centerX();
            if (this.N) {
                f7 = 8.0f;
            } else {
                f7 = 0.0f;
            }
            float dp5 = centerX + AndroidUtilities.dp(f7);
            float centerY = this.F.centerY() + AndroidUtilities.dp(4.0f);
            if (this.N) {
                textPaint = this.f52572w;
            } else {
                textPaint = this.v;
            }
            canvas.drawText(str, dp5, centerY, textPaint);
            canvas.restore();
            canvas.translate(0.0f, AndroidUtilities.dp(128.0f));
            int dp6 = AndroidUtilities.dp(128.0f) + i10;
            this.S = this.f52564n + dp6;
            this.T = (int) ((this.f52568r / 2.0f) + f12);
            canvas.save();
            canvas.translate(this.f52568r / 2.0f, 0.0f);
            this.f52569s.draw(canvas);
            canvas.translate(0.0f, this.f52564n);
            this.f52570t.draw(canvas);
            canvas.restore();
            float f16 = 6.0f;
            canvas.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f52565o);
            int D = t.D(6.0f, this.f52565o, dp6);
            int i15 = 0;
            int i16 = 0;
            while (true) {
                boolean[] zArr2 = this.f52561k;
                if (i15 >= zArr2.length) {
                    break;
                } else if (zArr2[i15]) {
                    canvas.save();
                    int i17 = i15;
                    float f17 = 0.0f;
                    do {
                        f17 += this.h[i17] + AndroidUtilities.dp(40.0f);
                        i17++;
                        zArr = this.f52561k;
                        if (i17 >= zArr.length || this.f52559i[i17]) {
                            break;
                        }
                    } while (zArr[i17]);
                    float f18 = f13 - (f17 / 2.0f);
                    canvas.translate(f18, 0.0f);
                    int i18 = ((int) f18) + dp;
                    int i19 = i15;
                    while (true) {
                        TLRPC.User user = this.f52558g[i19];
                        if (this.M.isOutOwner()) {
                            w02 = y6.w0(y6.Xa, u6Var);
                        } else {
                            int colorId = UserObject.getColorId(user);
                            if (colorId < 7) {
                                w02 = y6.w0(y6.f23614r8[colorId], u6Var);
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
                                    w02 = y6.w0(y6.f23614r8[0], u6Var);
                                }
                            }
                        }
                        int i20 = this.O;
                        if (i20 >= 0 && i20 == i19) {
                            i12 = w02;
                        } else {
                            i12 = i16;
                        }
                        this.f52573x.setColor(w02);
                        this.C.setColor(w02);
                        this.C.setAlpha(25);
                        this.f52554a[i19].draw(canvas);
                        CharSequence charSequence = this.f52557f[i19];
                        int i21 = i18;
                        f11 = f16;
                        canvas.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(16.0f), this.f52573x);
                        this.G.set(0.0f, 0.0f, this.h[i19] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawRoundRect(this.G, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.C);
                        float f19 = i21;
                        this.f52560j[i19].set(i21, D, (int) (this.G.width() + f19), AndroidUtilities.dp(24.0f) + D);
                        canvas.translate(this.G.width() + AndroidUtilities.dp(f11), 0.0f);
                        i18 = (int) (this.G.width() + AndroidUtilities.dp(f11) + f19);
                        i19++;
                        boolean[] zArr3 = this.f52561k;
                        if (i19 >= zArr3.length || this.f52559i[i19] || !zArr3[i19]) {
                            break;
                        }
                        f16 = f11;
                        i16 = i12;
                    }
                    canvas.restore();
                    canvas.translate(0.0f, AndroidUtilities.dp(30.0f));
                    D += AndroidUtilities.dp(30.0f);
                    f16 = f11;
                    i15 = i19;
                    i16 = i12;
                } else {
                    i15++;
                }
            }
            canvas.translate(0.0f, AndroidUtilities.dp(f16));
            canvas.save();
            canvas.translate(this.f52568r / 2.0f, 0.0f);
            this.f52571u.draw(canvas);
            canvas.restore();
            canvas.restore();
            if (this.O >= 0) {
                if (y6.I.q()) {
                    f10 = 0.12f;
                } else {
                    f10 = 0.1f;
                }
                int o12 = y6.o1(f10, i16);
                if (this.K != o12) {
                    y yVar2 = this.L;
                    this.K = o12;
                    y6.E1(yVar2, o12, true);
                }
                this.L.setBounds(this.f52560j[this.O]);
                this.L.setCallback(s1Var);
            }
            w90 w90Var = this.U;
            if (w90Var != null && w90Var.f(canvas)) {
                s1Var.invalidate();
            }
        }
    }

    public final void c(boolean z10) {
        MessageObject messageObject = this.M;
        if (messageObject != null && messageObject.isGiveawayResults() && this.L != null) {
            w90 w90Var = this.U;
            if (w90Var != null) {
                w90Var.d(true);
            }
            s1 s1Var = this.f52556c;
            if (z10) {
                this.L.setCallback(new u0(this, 11));
                this.L.setState(this.J);
                s1Var.invalidate();
                return;
            }
            this.L.setState(StateSet.NOTHING);
            s1Var.invalidate();
        }
    }

    public final void d(MessageObject messageObject, int i10) {
        boolean z10;
        TLRPC.User user;
        boolean z11;
        TLRPC.User user2 = null;
        this.M = null;
        this.f52569s = null;
        this.f52570t = null;
        this.f52571u = null;
        this.f52562l = 0;
        this.f52563m = 0;
        this.N = false;
        if (messageObject.isGiveawayResults()) {
            this.M = messageObject;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.f52572w = new TextPaint(1);
                this.f52573x = new TextPaint(1);
                this.f52574y = new TextPaint(1);
                this.f52575z = new TextPaint(1);
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
                this.f52557f = new CharSequence[10];
                this.f52558g = new TLRPC.User[10];
                this.h = new float[10];
                this.f52559i = new boolean[10];
                this.f52560j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f52556c);
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
                this.f52572w.setTypeface(AndroidUtilities.bold());
                this.f52572w.setTextSize(AndroidUtilities.dp(12.0f));
                this.f52572w.setTextAlign(align);
                this.f52572w.setColor(-1);
                this.f52573x.setTypeface(AndroidUtilities.bold());
                this.f52573x.setTextSize(AndroidUtilities.dp(13.0f));
                this.A.setTextSize(AndroidUtilities.dp(13.0f));
                this.f52574y.setTextSize(AndroidUtilities.dp(14.0f));
                this.f52575z.setTextSize(AndroidUtilities.dp(14.0f));
                this.f52575z.setTextAlign(align);
            }
            if (this.f52554a == null) {
                this.f52554a = new ImageReceiver[10];
                this.f52555b = new j9[10];
                this.f52561k = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f52554a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.f52556c);
                    this.f52554a[i11].setAllowLoadingOnAttachedOnly(true);
                    this.f52554a[i11].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f52555b[i11] = new j9((u6) null);
                    this.f52555b[i11].u(AndroidUtilities.dp(18.0f));
                    this.f52560j[i11] = new Rect();
                    i11++;
                }
            }
            this.d.setAllowStartLottieAnimation(false);
            if (this.e == null) {
                this.e = new xj0(R.raw.giveaway_results, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f));
            }
            this.d.setImageBitmap(this.e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageObject.messageOwner.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.f52554a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.f52554a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.f52555b = (j9[]) Arrays.copyOf(this.f52555b, size);
                this.f52561k = Arrays.copyOf(this.f52561k, size);
                this.f52557f = (CharSequence[]) Arrays.copyOf(this.f52557f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.f52559i = Arrays.copyOf(this.f52559i, size);
                this.f52560j = (Rect[]) Arrays.copyOf(this.f52560j, size);
                this.f52558g = (TLRPC.User[]) Arrays.copyOf(this.f52558g, size);
                for (int i12 = length - 1; i12 < size; i12++) {
                    this.f52554a[i12] = new ImageReceiver(this.f52556c);
                    this.f52554a[i12].setAllowLoadingOnAttachedOnly(true);
                    this.f52554a[i12].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f52555b[i12] = new j9((u6) null);
                    this.f52555b[i12].u(AndroidUtilities.dp(18.0f));
                    this.f52560j[i12] = new Rect();
                }
            }
            int dp = AndroidUtilities.dp(90.0f);
            int dp2 = AndroidUtilities.dp(230.0f);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayResultsMsgWinnersSelected", R.string.BoostingGiveawayResultsMsgWinnersSelected));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getPluralString("BoostingGiveawayResultsMsgWinnersTitle", tL_messageMediaGiveawayResults.winners_count), y6.gc, 0, new b(this, messageObject, tL_messageMediaGiveawayResults, 0));
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
            TextPaint textPaint2 = this.f52574y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f52569s = px0.c(spannableStringBuilder, textPaint2, dp2, alignment, AndroidUtilities.dp(2.0f), truncateAt, dp2, 10, true);
            this.f52570t = px0.c(this.R, this.f52574y, dp2, alignment, AndroidUtilities.dp(2.0f), truncateAt, dp2, 10, true);
            this.f52571u = px0.c(spannableStringBuilder2, this.f52574y, dp2, alignment, AndroidUtilities.dp(3.0f), truncateAt, dp2, 10, true);
            int max = Math.max(i10, dp2);
            this.f52568r = max - dp2;
            float f7 = max;
            float f10 = dp;
            float f11 = f10 / 2.0f;
            this.d.setImageCoords((f7 / 2.0f) - f11, AndroidUtilities.dp(70.0f) - f11, f10, f10);
            StaticLayout staticLayout = this.f52569s;
            int dp3 = AndroidUtilities.dp(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.f52564n = dp3;
            StaticLayout staticLayout2 = this.f52570t;
            this.f52565o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + dp3;
            StaticLayout staticLayout3 = this.f52571u;
            int lineBottom = this.f52562l + this.f52565o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.f52562l = lineBottom;
            this.f52562l = AndroidUtilities.dp(128.0f) + lineBottom;
            this.f52563m = max;
            if (this.N) {
                if (this.f52566p == null) {
                    this.f52566p = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f52567q = LocaleController.formatNumber((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.f52566p = null;
                this.f52567q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.f52567q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            if (this.N) {
                Rect rect = this.H;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f52561k, false);
            this.f52562l = AndroidUtilities.dp(30.0f) + this.f52562l;
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
                    this.f52561k[i14] = true;
                    this.f52558g[i14] = user3;
                    user = user2;
                    this.f52557f[i14] = TextUtils.ellipsize(Emoji.replaceEmoji(UserObject.getUserName(user3), this.f52573x.getFontMetricsInt(), false), this.f52573x, 0.8f * f7, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.f52573x;
                    CharSequence charSequence = this.f52557f[i14];
                    fArr[i14] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.h[i14] + AndroidUtilities.dp(40.0f);
                    f12 += dp4;
                    if (i14 > 0) {
                        boolean[] zArr = this.f52559i;
                        if (f12 > 0.9f * f7) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zArr[i14] = z11;
                        if (z11) {
                            this.f52562l = AndroidUtilities.dp(30.0f) + this.f52562l;
                            f12 = dp4;
                        }
                    } else {
                        this.f52559i[i14] = false;
                    }
                    this.f52555b[i14].r(user3);
                    this.f52554a[i14].setForUserOrChat(user3, this.f52555b[i14]);
                    this.f52554a[i14].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    user = user2;
                    this.f52558g[i14] = user;
                    this.f52561k[i14] = false;
                    this.f52557f[i14] = "";
                    this.f52559i[i14] = false;
                    this.h[i14] = AndroidUtilities.dp(20.0f);
                    this.f52555b[i14].n(longValue, "", "");
                }
                i14++;
                user2 = user;
            }
        }
    }
}
