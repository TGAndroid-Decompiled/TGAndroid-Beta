package wg;

import ai.i;
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
import i.f;
import ii.q1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.q;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.mx0;
import tg.s;
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
    public z S;
    public MessageObject T;
    public boolean U;
    public ImageReceiver[] f50338a;
    public j9[] f50339b;
    public final u1 f50340c;
    public ImageReceiver d;
    public CharSequence[] f50341e;
    public TLRPC.Chat[] f50342f;
    public float[] f50343g;
    public boolean[] h;
    public Rect[] f50344i;
    public boolean[] f50345j;
    public int f50348m;
    public float f50349n;
    public String f50350o;
    public int f50351p;
    public int f50352q;
    public int f50353r;
    public int f50354s;
    public Drawable f50355t;
    public String f50356u;
    public int v;
    public StaticLayout f50357w;
    public StaticLayout f50358x;
    public StaticLayout f50359y;
    public StaticLayout f50360z;
    public int f50346k = 0;
    public int f50347l = 0;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;

    static {
        HashMap hashMap = new HashMap();
        Y = hashMap;
        hg.c.o(1, hashMap, "1⃣", 3, "2⃣");
        hg.c.o(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public a(u1 u1Var) {
        this.f50340c = u1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway()) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.f50344i;
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
                    u1 u1Var = this.f50340c;
                    if (u1Var.getDelegate() != null) {
                        u1Var.getDelegate().M(this.V, u1Var);
                    }
                    u1Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    MessageObject messageObject2 = this.T;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        s.d(messageObject2, new q1(messageObject2, 13), new i(24));
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

    public final void b(Canvas canvas, int i10, int i11, e6 e6Var) {
        float f7;
        TextPaint textPaint;
        float f10;
        float f11;
        float f12;
        MessagesController.PeerColor color;
        int w02;
        int i12;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway()) {
            z zVar = this.S;
            u1 u1Var = this.f50340c;
            int i13 = 0;
            if (zVar == null) {
                int x02 = i6.x0(null, i6.f20888i6, false);
                this.R = x02;
                z Z = i6.Z(x02, 12, 12);
                this.S = Z;
                Z.setCallback(u1Var);
            }
            this.E.setColor(i6.f20996o2.getColor());
            this.F.setColor(i6.m1(0.45f, i6.f20996o2.getColor()));
            this.G.setColor(i6.m1(0.15f, i6.f20996o2.getColor()));
            this.H.setColor(i6.f20996o2.getColor());
            if (this.T.isOutOwner()) {
                TextPaint textPaint2 = this.D;
                int i14 = i6.Xa;
                textPaint2.setColor(i6.w0(i14, e6Var));
                this.I.setColor(i6.w0(i14, e6Var));
                this.J.setColor(i6.w0(i6.f20745ab, e6Var));
            } else {
                TextPaint textPaint3 = this.D;
                int i15 = i6.Kc;
                textPaint3.setColor(i6.w0(i15, e6Var));
                this.I.setColor(i6.w0(i15, e6Var));
                this.J.setColor(i6.w0(i6.Uc, e6Var));
            }
            if (this.U) {
                this.I.setColor(i6.w0(i6.fk, e6Var));
            }
            canvas2.save();
            int dp = i11 - AndroidUtilities.dp(4.0f);
            canvas2.translate(dp, i10);
            this.P.set(dp, i10, this.f50347l + dp, this.f50346k + i10);
            canvas2.saveLayer(0.0f, 0.0f, this.f50347l, this.f50346k, this.K, 31);
            this.d.draw(canvas2);
            float f13 = this.f50347l / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.O.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.O.height();
            this.M.set(f13 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f13, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas2.drawRoundRect(this.M, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.L);
            float f14 = dp3 / 2.0f;
            float f15 = dp4 / 2.0f;
            this.M.set(f13 - f14, dp2 - f15, f13 + f14, dp2 + f15);
            canvas2.drawRoundRect(this.M, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.I);
            Drawable drawable = this.f50355t;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.M.left), AndroidUtilities.dp(6.96f) + ((int) this.M.centerY()));
                this.f50355t.draw(canvas2);
            }
            String str = this.f50356u;
            float centerX = this.M.centerX();
            if (this.U) {
                f7 = 8.0f;
            } else {
                f7 = 0.0f;
            }
            float dp5 = centerX + AndroidUtilities.dp(f7);
            float centerY = this.M.centerY() + AndroidUtilities.dp(4.0f);
            if (this.U) {
                textPaint = this.C;
            } else {
                textPaint = this.B;
            }
            canvas2.drawText(str, dp5, centerY, textPaint);
            canvas2.restore();
            canvas2.translate(0.0f, AndroidUtilities.dp(128.0f));
            int dp6 = AndroidUtilities.dp(128.0f) + i10;
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.f50357w.draw(canvas2);
            canvas2.translate(0.0f, this.f50351p);
            float f16 = 6.0f;
            if (this.f50358x != null) {
                canvas2.restore();
                canvas2.save();
                float dp7 = (this.f50351p + this.f50348m) - AndroidUtilities.dp(6.0f);
                float f17 = this.f50347l / 2.0f;
                canvas2.drawText(this.f50350o, f17, dp7, this.F);
                f10 = 16.0f;
                canvas2.drawLine(AndroidUtilities.dp(17.0f), dp7 - AndroidUtilities.dp(4.0f), (f17 - (this.f50349n / 2.0f)) - AndroidUtilities.dp(6.0f), dp7 - AndroidUtilities.dp(4.0f), this.G);
                canvas2 = canvas;
                canvas2.drawLine(AndroidUtilities.dp(6.0f) + (this.f50349n / 2.0f) + f17, dp7 - AndroidUtilities.dp(4.0f), this.f50347l - AndroidUtilities.dp(16.0f), dp7 - AndroidUtilities.dp(4.0f), this.G);
                canvas2.translate((this.f50347l - this.f50358x.getWidth()) / 2.0f, this.f50351p);
                this.f50358x.draw(canvas2);
                canvas2.restore();
                canvas2.save();
                canvas2.translate(this.v / 2.0f, this.f50348m + this.f50351p);
            } else {
                f10 = 16.0f;
            }
            this.f50359y.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f50352q);
            int C = q.C(6.0f, this.f50352q, dp6);
            int i16 = 0;
            int i17 = 0;
            while (true) {
                boolean[] zArr = this.f50345j;
                if (i16 >= zArr.length) {
                    break;
                } else if (zArr[i16]) {
                    canvas2.save();
                    int i18 = i16;
                    float f18 = 0.0f;
                    while (true) {
                        f12 = f16;
                        f18 += this.f50343g[i18] + AndroidUtilities.dp(40.0f);
                        i18++;
                        boolean[] zArr2 = this.f50345j;
                        if (i18 >= zArr2.length || this.h[i18] || !zArr2[i18]) {
                            break;
                        }
                        f16 = f12;
                    }
                    float f19 = f13 - (f18 / 2.0f);
                    canvas2.translate(f19, 0.0f);
                    int i19 = ((int) f19) + dp;
                    int i20 = i16;
                    while (true) {
                        TLRPC.Chat chat = this.f50342f[i20];
                        if (this.T.isOutOwner()) {
                            w02 = i6.w0(i6.Xa, e6Var);
                        } else {
                            int colorId = ChatObject.getColorId(chat);
                            if (colorId < 7) {
                                w02 = i6.w0(i6.f21057r8[colorId], e6Var);
                            } else {
                                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                                if (peerColors == null) {
                                    color = null;
                                } else {
                                    color = peerColors.getColor(colorId);
                                }
                                if (color != null) {
                                    w02 = color.getColor(i13, e6Var);
                                } else {
                                    w02 = i6.w0(i6.f21057r8[i13], e6Var);
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
                        this.f50338a[i20].draw(canvas2);
                        CharSequence charSequence = this.f50341e[i20];
                        int i22 = i19;
                        canvas2.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(f10), this.D);
                        this.N.set(0.0f, 0.0f, this.f50343g[i20] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas2.drawRoundRect(this.N, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.J);
                        float f20 = i22;
                        this.f50344i[i20].set(i22, C, (int) (this.N.width() + f20), AndroidUtilities.dp(24.0f) + C);
                        canvas2.translate(this.N.width() + AndroidUtilities.dp(f12), 0.0f);
                        i19 = (int) (this.N.width() + AndroidUtilities.dp(f12) + f20);
                        i20++;
                        boolean[] zArr3 = this.f50345j;
                        if (i20 >= zArr3.length || this.h[i20] || !zArr3[i20]) {
                            break;
                        }
                        i17 = i12;
                        i13 = 0;
                    }
                    canvas2.restore();
                    canvas2.translate(0.0f, AndroidUtilities.dp(30.0f));
                    C += AndroidUtilities.dp(30.0f);
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
                canvas2.translate((this.f50347l - this.A.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f));
                this.A.draw(canvas2);
                canvas2.restore();
                canvas2.translate(0.0f, this.f50354s);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(f21));
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.f50360z.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
            if (this.V >= 0) {
                if (i6.I.q()) {
                    f11 = 0.12f;
                } else {
                    f11 = 0.1f;
                }
                int m12 = i6.m1(f11, i17);
                if (this.R != m12) {
                    z zVar2 = this.S;
                    this.R = m12;
                    i6.C1(zVar2, m12, true);
                }
                this.S.setBounds(this.f50344i[this.V]);
                this.S.setCallback(u1Var);
            }
        }
    }

    public final void c(boolean z10) {
        z zVar;
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway() && (zVar = this.S) != null) {
            u1 u1Var = this.f50340c;
            if (z10) {
                zVar.setCallback(new f(this, 6));
                this.S.setState(this.Q);
                u1Var.invalidate();
                return;
            }
            zVar.setState(StateSet.NOTHING);
            u1Var.invalidate();
        }
    }

    public final void d(int i10, int i11, MessageObject messageObject) {
        float f7;
        boolean z10;
        float f10;
        TLRPC.Document document;
        boolean z11;
        String str;
        boolean z12;
        int dp;
        TLRPC.Peer peer;
        String str2;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout staticLayout3;
        int i12;
        boolean z13;
        String str3;
        this.T = null;
        this.f50357w = null;
        this.f50358x = null;
        this.f50359y = null;
        this.f50360z = null;
        this.A = null;
        int i13 = 0;
        this.f50346k = 0;
        this.f50347l = 0;
        this.f50348m = 0;
        this.f50349n = 0.0f;
        if (messageObject.isGiveaway()) {
            this.T = messageObject;
            float f11 = 12.0f;
            boolean z14 = true;
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
                this.f50341e = new CharSequence[10];
                this.f50342f = new TLRPC.Chat[10];
                this.f50343g = new float[10];
                this.h = new boolean[10];
                this.f50344i = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f50340c);
                this.d = imageReceiver;
                imageReceiver.setAllowLoadingOnAttachedOnly(true);
                Paint paint = this.L;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTypeface(AndroidUtilities.bold());
                this.B.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTextSize(AndroidUtilities.dp(12.0f));
                TextPaint textPaint = this.B;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.C.setTypeface(AndroidUtilities.bold());
                this.C.setTextSize(AndroidUtilities.dp(12.0f));
                this.C.setTextAlign(align);
                this.C.setColor(-1);
                this.D.setTypeface(AndroidUtilities.bold());
                this.D.setTextSize(AndroidUtilities.dp(13.0f));
                this.H.setTextSize(AndroidUtilities.dp(13.0f));
                this.E.setTextSize(AndroidUtilities.dp(14.0f));
                this.F.setTextSize(AndroidUtilities.dp(14.0f));
                this.F.setTextAlign(align);
            }
            float f12 = 18.0f;
            if (this.f50338a == null) {
                this.f50338a = new ImageReceiver[10];
                this.f50339b = new j9[10];
                this.f50345j = new boolean[10];
                int i14 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f50338a;
                    if (i14 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i14] = new ImageReceiver(this.f50340c);
                    this.f50338a[i14].setAllowLoadingOnAttachedOnly(true);
                    this.f50338a[i14].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f50339b[i14] = new j9((e6) null);
                    this.f50339b[i14].u(AndroidUtilities.dp(18.0f));
                    this.f50344i[i14] = new Rect();
                    i14++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            String str4 = UserConfig.getInstance(UserConfig.selectedAccount).premiumGiftsStickerPack;
            if (str4 == null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).checkPremiumGiftStickers();
                f7 = 12.0f;
                z10 = true;
                f10 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSetByName(str4);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSetByEmojiOrName(str4);
                }
                if (stickerSetByName != null) {
                    String str5 = (String) Y.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = stickerSetByName.packs;
                    int size = arrayList.size();
                    document = null;
                    int i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i15);
                            i15++;
                            TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                            f7 = f11;
                            if (Objects.equals(tL_stickerPack2.emoticon, str5)) {
                                ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                                int size2 = arrayList2.size();
                                f10 = f12;
                                int i16 = i13;
                                while (true) {
                                    if (i16 < size2) {
                                        Long l4 = arrayList2.get(i16);
                                        i16++;
                                        long longValue = l4.longValue();
                                        ArrayList<TLRPC.Document> arrayList3 = stickerSetByName.documents;
                                        int size3 = arrayList3.size();
                                        z10 = z14;
                                        int i17 = i13;
                                        while (true) {
                                            if (i17 < size3) {
                                                TLRPC.Document document2 = arrayList3.get(i17);
                                                i17++;
                                                TLRPC.Document document3 = document2;
                                                ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                                str = str5;
                                                if (document3.f20044id == longValue) {
                                                    document = document3;
                                                    break;
                                                } else {
                                                    str5 = str;
                                                    arrayList3 = arrayList4;
                                                }
                                            } else {
                                                str = str5;
                                                break;
                                            }
                                        }
                                        if (document != null) {
                                            break;
                                        }
                                        z14 = z10;
                                        str5 = str;
                                        i13 = 0;
                                    } else {
                                        str = str5;
                                        z10 = z14;
                                        break;
                                    }
                                }
                            } else {
                                str = str5;
                                z10 = z14;
                                f10 = f12;
                            }
                            if (document != null) {
                                break;
                            }
                            f11 = f7;
                            f12 = f10;
                            z14 = z10;
                            str5 = str;
                            i13 = 0;
                        } else {
                            f7 = f11;
                            z10 = z14;
                            f10 = f12;
                            break;
                        }
                    }
                    if (document == null && !stickerSetByName.documents.isEmpty()) {
                        document = stickerSetByName.documents.get(0);
                    }
                } else {
                    f7 = 12.0f;
                    z10 = true;
                    f10 = 18.0f;
                    document = null;
                }
                if (document != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, i6.f20781c7, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    this.d.setImage(ImageLocation.getForDocument(document), "160_160_firstframe", svgThumb, "tgs", stickerSetByName, 1);
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
                    MediaDataController mediaDataController = MediaDataController.getInstance(UserConfig.selectedAccount);
                    if (tL_messages_stickerSet == null) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    mediaDataController.loadStickersByEmojiOrName(str4, false, z11);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            if ((tL_messageMediaGiveaway2.flags & 32) != 0) {
                z12 = z10;
            } else {
                z12 = false;
            }
            this.U = z12;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.f50338a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.f50338a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.f50339b = (j9[]) Arrays.copyOf(this.f50339b, size4);
                this.f50345j = Arrays.copyOf(this.f50345j, size4);
                this.f50341e = (CharSequence[]) Arrays.copyOf(this.f50341e, size4);
                this.f50343g = Arrays.copyOf(this.f50343g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.f50344i = (Rect[]) Arrays.copyOf(this.f50344i, size4);
                this.f50342f = (TLRPC.Chat[]) Arrays.copyOf(this.f50342f, size4);
                int i18 = length - 1;
                while (i18 < size4) {
                    this.f50338a[i18] = new ImageReceiver(this.f50340c);
                    this.f50338a[i18].setAllowLoadingOnAttachedOnly(z10);
                    this.f50338a[i18].setRoundRadius(AndroidUtilities.dp(f7));
                    this.f50339b[i18] = new j9((e6) null);
                    this.f50339b[i18].u(AndroidUtilities.dp(f10));
                    this.f50344i[i18] = new Rect();
                    i18++;
                    z10 = true;
                }
            }
            int dp2 = AndroidUtilities.dp(148.0f);
            if (AndroidUtilities.isTablet()) {
                dp = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(80.0f);
            } else {
                dp = i10 - AndroidUtilities.dp(80.0f);
            }
            int i19 = dp;
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            boolean isForwarded = messageObject.isForwarded();
            TLRPC.Message message = messageObject.messageOwner;
            if (isForwarded) {
                peer = message.fwd_from.from_id;
            } else {
                peer = message.peer_id;
            }
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-MessageObject.getPeerId(peer))));
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingGiveawayPrizes));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTags);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (this.U) {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("BoostingStarsGiveawayMsgInfoPlural1", (int) tL_messageMediaGiveaway2.stars)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayMsgInfoPlural2", tL_messageMediaGiveaway2.quantity, new Object[0])));
            } else {
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("BoostingGiveawayMsgInfoPlural1", tL_messageMediaGiveaway2.quantity)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayMsgInfoPlural2", tL_messageMediaGiveaway2.quantity, LocaleController.formatPluralString("BoldMonths", tL_messageMediaGiveaway2.months, new Object[0]))));
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder3.append((CharSequence) "\n\n");
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.4f), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayMsgParticipants", R.string.BoostingGiveawayMsgParticipants));
            spannableStringBuilder3.append((CharSequence) replaceTags2);
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilder2.length() + 2, replaceTags2.length() + spannableStringBuilder2.length() + 2, 33);
            spannableStringBuilder3.append((CharSequence) "\n");
            if (tL_messageMediaGiveaway2.only_new_subscribers) {
                if (isChannelAndNotMegaGroup) {
                    str3 = "BoostingGiveawayMsgNewSubsPlural";
                } else {
                    str3 = "BoostingGiveawayMsgNewSubsGroupPlural";
                }
                spannableStringBuilder3.append((CharSequence) LocaleController.formatPluralString(str3, tL_messageMediaGiveaway2.channels.size(), new Object[0]));
            } else {
                if (isChannelAndNotMegaGroup) {
                    str2 = "BoostingGiveawayMsgAllSubsPlural";
                } else {
                    str2 = "BoostingGiveawayMsgAllSubsGroupPlural";
                }
                spannableStringBuilder3.append((CharSequence) LocaleController.formatPluralString(str2, tL_messageMediaGiveaway2.channels.size(), new Object[0]));
            }
            SpannableStringBuilder replaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString("BoostingWinnersDate", R.string.BoostingWinnersDate));
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(replaceTags3);
            spannableStringBuilder4.setSpan(new RelativeSizeSpan(1.05f), 0, replaceTags3.length(), 33);
            Date date = new Date(tL_messageMediaGiveaway2.until_date * 1000);
            String format = LocaleController.getInstance().getFormatterGiveawayCard().format(date);
            String format2 = LocaleController.getInstance().getFormatterDay().format(date);
            spannableStringBuilder4.append((CharSequence) "\n");
            spannableStringBuilder4.append((CharSequence) LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, format, format2));
            TextPaint textPaint2 = this.E;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.f50357w = mx0.c(spannableStringBuilder, textPaint2, i19, alignment, AndroidUtilities.dp(2.0f), truncateAt, i19, 10, true);
            this.f50359y = mx0.c(spannableStringBuilder3, this.E, i19, alignment, AndroidUtilities.dp(2.0f), truncateAt, i19, 10, true);
            this.f50360z = mx0.c(spannableStringBuilder4, this.E, i19, alignment, AndroidUtilities.dp(3.0f), truncateAt, i19, 10, true);
            int i20 = 0;
            for (int i21 = 0; i21 < this.f50357w.getLineCount(); i21++) {
                i20 = (int) Math.max(i20, Math.ceil(this.f50357w.getLineWidth(i21)));
            }
            for (int i22 = 0; i22 < this.f50359y.getLineCount(); i22++) {
                i20 = (int) Math.max(i20, Math.ceil(this.f50359y.getLineWidth(i22)));
            }
            for (int i23 = 0; i23 < this.f50360z.getLineCount(); i23++) {
                i20 = (int) Math.max(i20, Math.ceil(this.f50360z.getLineWidth(i23)));
            }
            if (i20 < AndroidUtilities.dp(180.0f)) {
                i20 = AndroidUtilities.dp(180.0f);
            }
            int i24 = i20;
            String str6 = tL_messageMediaGiveaway2.prize_description;
            if (str6 != null && !str6.isEmpty()) {
                StaticLayout c10 = mx0.c(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.quantity, tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false), this.E, i24, Layout.Alignment.ALIGN_CENTER, AndroidUtilities.dp(2.0f), TextUtils.TruncateAt.END, i24, 20, true);
                this.f50358x = c10;
                this.f50348m = AndroidUtilities.dp(22.0f) + c10.getLineBottom(c10.getLineCount() - 1);
                String string = LocaleController.getString(R.string.BoostingGiveawayMsgWithDivider);
                this.f50350o = string;
                this.f50349n = this.F.measureText(string, 0, string.length());
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
                    String languageFlag = LocaleController.getLanguageFlag(str8);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (languageFlag != null) {
                        spannableStringBuilder5.append((CharSequence) languageFlag).append((CharSequence) " ");
                    }
                    spannableStringBuilder5.append((CharSequence) displayCountry);
                    arrayList5.add(spannableStringBuilder5);
                }
                if (!arrayList5.isEmpty()) {
                    this.A = mx0.c(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveAwayFromCountries", R.string.BoostingGiveAwayFromCountries, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false), this.H, i24, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, i24, 10, true);
                }
            }
            int max = Math.max(i11, Math.min(AndroidUtilities.dp(38.0f) + i24, i19));
            this.v = max - i19;
            float f13 = max;
            float f14 = dp2;
            float f15 = f14 / 2.0f;
            this.d.setImageCoords((f13 / 2.0f) - f15, AndroidUtilities.dp(42.0f) - f15, f14, f14);
            int dp3 = AndroidUtilities.dp(5.0f) + this.f50357w.getLineBottom(staticLayout.getLineCount() - 1);
            this.f50351p = dp3;
            this.f50352q = this.f50359y.getLineBottom(staticLayout2.getLineCount() - 1) + dp3 + this.f50348m;
            this.f50353r = this.f50360z.getLineBottom(staticLayout3.getLineCount() - 1);
            StaticLayout staticLayout4 = this.A;
            if (staticLayout4 != null) {
                i12 = staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(f7);
            } else {
                i12 = 0;
            }
            this.f50354s = i12;
            int i26 = this.f50346k + this.f50352q + i12 + this.f50353r;
            this.f50346k = i26;
            this.f50346k = AndroidUtilities.dp(128.0f) + i26;
            this.f50347l = max;
            if (this.U) {
                if (this.f50355t == null) {
                    this.f50355t = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f50356u = LocaleController.formatNumber((int) tL_messageMediaGiveaway2.stars, ',');
            } else {
                this.f50355t = null;
                this.f50356u = "x" + tL_messageMediaGiveaway2.quantity;
            }
            TextPaint textPaint3 = this.B;
            String str9 = this.f50356u;
            textPaint3.getTextBounds(str9, 0, str9.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f50345j, false);
            this.f50346k = AndroidUtilities.dp(30.0f) + this.f50346k;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i27 = 0;
            while (i27 < size6) {
                Long l10 = arrayList8.get(i27);
                i27++;
                Long l11 = l10;
                if (MessagesController.getInstance(UserConfig.selectedAccount).getChat(l11) != null) {
                    arrayList7.add(l11);
                }
            }
            float f16 = 0.0f;
            for (int i28 = 0; i28 < arrayList7.size(); i28++) {
                Long l12 = (Long) arrayList7.get(i28);
                long longValue2 = l12.longValue();
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(l12);
                if (chat != null) {
                    this.f50345j[i28] = true;
                    this.f50342f[i28] = chat;
                    this.f50341e[i28] = TextUtils.ellipsize(Emoji.replaceEmoji(chat.title, this.D.getFontMetricsInt(), false), this.D, 0.8f * f13, TextUtils.TruncateAt.END);
                    float[] fArr = this.f50343g;
                    TextPaint textPaint4 = this.D;
                    CharSequence charSequence = this.f50341e[i28];
                    fArr[i28] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.f50343g[i28] + AndroidUtilities.dp(40.0f);
                    f16 += dp4;
                    if (i28 > 0) {
                        boolean[] zArr = this.h;
                        if (f16 > 0.9f * f13) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zArr[i28] = z13;
                        if (z13) {
                            this.f50346k = AndroidUtilities.dp(30.0f) + this.f50346k;
                            f16 = dp4;
                        }
                    } else {
                        this.h[i28] = false;
                    }
                    this.f50339b[i28].q(chat);
                    this.f50338a[i28].setForUserOrChat(chat, this.f50339b[i28]);
                    this.f50338a[i28].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    this.f50342f[i28] = null;
                    this.f50345j[i28] = false;
                    this.f50341e[i28] = "";
                    this.h[i28] = false;
                    this.f50343g[i28] = AndroidUtilities.dp(20.0f);
                    this.f50339b[i28].n(longValue2, "", "");
                }
            }
        }
    }
}
