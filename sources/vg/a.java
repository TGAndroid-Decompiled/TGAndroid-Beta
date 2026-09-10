package vg;

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
import hi.s0;
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
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l3;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.web.y1;
import sg.s;
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
    public ImageReceiver[] f43310a;
    public g9[] f43311b;
    public final t1 f43312c;
    public ImageReceiver d;
    public CharSequence[] e;
    public TLRPC.Chat[] f43313f;
    public float[] f43314g;
    public boolean[] h;
    public Rect[] f43315i;
    public boolean[] f43316j;
    public int f43319m;
    public float f43320n;
    public String f43321o;
    public int f43322p;
    public int f43323q;
    public int f43324r;
    public int f43325s;
    public Drawable f43326t;
    public String f43327u;
    public int v;
    public StaticLayout f43328w;
    public StaticLayout f43329x;
    public StaticLayout f43330y;
    public StaticLayout f43331z;
    public int f43317k = 0;
    public int f43318l = 0;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;

    static {
        HashMap hashMap = new HashMap();
        Y = hashMap;
        hc.b.r(1, hashMap, "1⃣", 3, "2⃣");
        hc.b.r(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public a(t1 t1Var) {
        this.f43312c = t1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway()) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.f43315i;
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
                    t1 t1Var = this.f43312c;
                    if (t1Var.getDelegate() != null) {
                        t1Var.getDelegate().L(this.V, t1Var);
                    }
                    t1Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    MessageObject messageObject2 = this.T;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        s.d(messageObject2, new y1(messageObject2, 6), new l3(6));
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

    public final void b(Canvas canvas, int i10, int i11, f6 f6Var) {
        float f7;
        TextPaint textPaint;
        float f10;
        float f11;
        MessagesController.PeerColor color;
        int v02;
        int i12;
        Canvas canvas2 = canvas;
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway()) {
            z zVar = this.S;
            t1 t1Var = this.f43312c;
            int i13 = 0;
            if (zVar == null) {
                int w02 = j6.w0(null, j6.f18017i6, false);
                this.R = w02;
                z Y2 = j6.Y(w02, 12, 12);
                this.S = Y2;
                Y2.setCallback(t1Var);
            }
            this.E.setColor(j6.f18122o2.getColor());
            this.F.setColor(j6.l1(0.45f, j6.f18122o2.getColor()));
            this.G.setColor(j6.l1(0.15f, j6.f18122o2.getColor()));
            this.H.setColor(j6.f18122o2.getColor());
            if (this.T.isOutOwner()) {
                TextPaint textPaint2 = this.D;
                int i14 = j6.Xa;
                textPaint2.setColor(j6.v0(i14, f6Var));
                this.I.setColor(j6.v0(i14, f6Var));
                this.J.setColor(j6.v0(j6.f17876ab, f6Var));
            } else {
                TextPaint textPaint3 = this.D;
                int i15 = j6.Kc;
                textPaint3.setColor(j6.v0(i15, f6Var));
                this.I.setColor(j6.v0(i15, f6Var));
                this.J.setColor(j6.v0(j6.Uc, f6Var));
            }
            if (this.U) {
                this.I.setColor(j6.v0(j6.fk, f6Var));
            }
            canvas2.save();
            int dp = i11 - AndroidUtilities.dp(4.0f);
            canvas2.translate(dp, i10);
            this.P.set(dp, i10, this.f43318l + dp, this.f43317k + i10);
            canvas2.saveLayer(0.0f, 0.0f, this.f43318l, this.f43317k, this.K, 31);
            this.d.draw(canvas2);
            float f12 = this.f43318l / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.O.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.O.height();
            this.M.set(f12 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f12, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas2.drawRoundRect(this.M, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.L);
            float f13 = dp3 / 2.0f;
            float f14 = dp4 / 2.0f;
            this.M.set(f12 - f13, dp2 - f14, f12 + f13, dp2 + f14);
            canvas2.drawRoundRect(this.M, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.I);
            Drawable drawable = this.f43326t;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.M.left), AndroidUtilities.dp(6.96f) + ((int) this.M.centerY()));
                this.f43326t.draw(canvas2);
            }
            String str = this.f43327u;
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
            this.f43328w.draw(canvas2);
            canvas2.translate(0.0f, this.f43322p);
            if (this.f43329x != null) {
                canvas2.restore();
                canvas2.save();
                float dp7 = (this.f43322p + this.f43319m) - AndroidUtilities.dp(6.0f);
                float f15 = this.f43318l / 2.0f;
                canvas2.drawText(this.f43321o, f15, dp7, this.F);
                f10 = 16.0f;
                canvas2.drawLine(AndroidUtilities.dp(17.0f), dp7 - AndroidUtilities.dp(4.0f), (f15 - (this.f43320n / 2.0f)) - AndroidUtilities.dp(6.0f), dp7 - AndroidUtilities.dp(4.0f), this.G);
                canvas2 = canvas;
                canvas2.drawLine(AndroidUtilities.dp(6.0f) + (this.f43320n / 2.0f) + f15, dp7 - AndroidUtilities.dp(4.0f), this.f43318l - AndroidUtilities.dp(16.0f), dp7 - AndroidUtilities.dp(4.0f), this.G);
                canvas2.translate((this.f43318l - this.f43329x.getWidth()) / 2.0f, this.f43322p);
                this.f43329x.draw(canvas2);
                canvas2.restore();
                canvas2.save();
                canvas2.translate(this.v / 2.0f, this.f43319m + this.f43322p);
            } else {
                f10 = 16.0f;
            }
            this.f43330y.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f43323q);
            int C = a2.C(6.0f, this.f43323q, dp6);
            int i16 = 0;
            int i17 = 0;
            while (true) {
                boolean[] zArr = this.f43316j;
                if (i16 >= zArr.length) {
                    break;
                }
                if (zArr[i16]) {
                    canvas2.save();
                    int i18 = i16;
                    float f16 = 0.0f;
                    while (true) {
                        f16 += this.f43314g[i18] + AndroidUtilities.dp(40.0f);
                        i18++;
                        boolean[] zArr2 = this.f43316j;
                        if (i18 >= zArr2.length || this.h[i18] || !zArr2[i18]) {
                            break;
                        }
                    }
                    float f17 = f12 - (f16 / 2.0f);
                    canvas2.translate(f17, 0.0f);
                    int i19 = ((int) f17) + dp;
                    int i20 = i16;
                    while (true) {
                        TLRPC.Chat chat = this.f43313f[i20];
                        if (this.T.isOutOwner()) {
                            v02 = j6.v0(j6.Xa, f6Var);
                        } else {
                            int colorId = ChatObject.getColorId(chat);
                            if (colorId < 7) {
                                v02 = j6.v0(j6.f18182r8[colorId], f6Var);
                            } else {
                                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                                if (peerColors == null) {
                                    color = null;
                                } else {
                                    color = peerColors.getColor(colorId);
                                }
                                if (color != null) {
                                    v02 = color.getColor(i13, f6Var);
                                } else {
                                    v02 = j6.v0(j6.f18182r8[i13], f6Var);
                                }
                            }
                        }
                        int i21 = this.V;
                        if (i21 >= 0 && i21 == i20) {
                            i12 = v02;
                        } else {
                            i12 = i17;
                        }
                        this.D.setColor(v02);
                        this.J.setColor(v02);
                        this.J.setAlpha(25);
                        this.f43310a[i20].draw(canvas2);
                        CharSequence charSequence = this.e[i20];
                        int i22 = i19;
                        canvas2.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(f10), this.D);
                        this.N.set(0.0f, 0.0f, this.f43314g[i20] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas2.drawRoundRect(this.N, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.J);
                        float f18 = i22;
                        this.f43315i[i20].set(i22, C, (int) (this.N.width() + f18), AndroidUtilities.dp(24.0f) + C);
                        canvas2.translate(this.N.width() + AndroidUtilities.dp(6.0f), 0.0f);
                        i19 = (int) (this.N.width() + AndroidUtilities.dp(6.0f) + f18);
                        i20++;
                        boolean[] zArr3 = this.f43316j;
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
                } else {
                    i16++;
                }
                i13 = 0;
            }
            if (this.A != null) {
                canvas2.save();
                canvas2.translate((this.f43318l - this.A.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f));
                this.A.draw(canvas2);
                canvas2.restore();
                canvas2.translate(0.0f, this.f43325s);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f));
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.f43331z.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
            if (this.V >= 0) {
                if (j6.I.q()) {
                    f11 = 0.12f;
                } else {
                    f11 = 0.1f;
                }
                int l1 = j6.l1(f11, i17);
                if (this.R != l1) {
                    z zVar2 = this.S;
                    this.R = l1;
                    j6.B1(zVar2, l1, true);
                }
                this.S.setBounds(this.f43315i[this.V]);
                this.S.setCallback(t1Var);
            }
        }
    }

    public final void c(boolean z10) {
        z zVar;
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway() && (zVar = this.S) != null) {
            t1 t1Var = this.f43312c;
            if (z10) {
                zVar.setCallback(new s0(this, 6));
                this.S.setState(this.Q);
                t1Var.invalidate();
                return;
            }
            zVar.setState(StateSet.NOTHING);
            t1Var.invalidate();
        }
    }

    public final void d(int i10, int i11, MessageObject messageObject) {
        float f7;
        float f10;
        TLRPC.Document document;
        boolean z10;
        String str;
        boolean z11;
        int dp;
        TLRPC.Peer peer;
        String str2;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout staticLayout3;
        int i12;
        boolean z12;
        String str3;
        this.T = null;
        this.f43328w = null;
        this.f43329x = null;
        this.f43330y = null;
        this.f43331z = null;
        this.A = null;
        this.f43317k = 0;
        this.f43318l = 0;
        this.f43319m = 0;
        this.f43320n = 0.0f;
        if (messageObject.isGiveaway()) {
            this.T = messageObject;
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
                this.f43313f = new TLRPC.Chat[10];
                this.f43314g = new float[10];
                this.h = new boolean[10];
                this.f43315i = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f43312c);
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
            if (this.f43310a == null) {
                this.f43310a = new ImageReceiver[10];
                this.f43311b = new g9[10];
                this.f43316j = new boolean[10];
                int i13 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f43310a;
                    if (i13 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i13] = new ImageReceiver(this.f43312c);
                    this.f43310a[i13].setAllowLoadingOnAttachedOnly(true);
                    this.f43310a[i13].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f43311b[i13] = new g9((f6) null);
                    this.f43311b[i13].u(AndroidUtilities.dp(18.0f));
                    this.f43315i[i13] = new Rect();
                    i13++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            String str4 = UserConfig.getInstance(UserConfig.selectedAccount).premiumGiftsStickerPack;
            if (str4 == null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).checkPremiumGiftStickers();
                f7 = 12.0f;
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
                    int i14 = 0;
                    while (true) {
                        if (i14 < size) {
                            TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i14);
                            i14++;
                            TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                            f7 = 12.0f;
                            if (Objects.equals(tL_stickerPack2.emoticon, str5)) {
                                ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                                int size2 = arrayList2.size();
                                int i15 = 0;
                                f10 = 18.0f;
                                while (i15 < size2) {
                                    Long l4 = arrayList2.get(i15);
                                    i15++;
                                    long longValue = l4.longValue();
                                    ArrayList<TLRPC.Document> arrayList3 = stickerSetByName.documents;
                                    int size3 = arrayList3.size();
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < size3) {
                                            TLRPC.Document document2 = arrayList3.get(i16);
                                            i16++;
                                            TLRPC.Document document3 = document2;
                                            ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                            str = str5;
                                            if (document3.f17201id == longValue) {
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
                                    str5 = str;
                                }
                                str = str5;
                            } else {
                                str = str5;
                                f10 = 18.0f;
                            }
                            if (document != null) {
                                break;
                            }
                            str5 = str;
                        } else {
                            f7 = 12.0f;
                            f10 = 18.0f;
                            break;
                        }
                    }
                    if (document == null && !stickerSetByName.documents.isEmpty()) {
                        document = stickerSetByName.documents.get(0);
                    }
                } else {
                    f7 = 12.0f;
                    f10 = 18.0f;
                    document = null;
                }
                if (document != null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, j6.f17911c7, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    this.d.setImage(ImageLocation.getForDocument(document), "160_160_firstframe", svgThumb, "tgs", stickerSetByName, 1);
                } else {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
                    MediaDataController mediaDataController = MediaDataController.getInstance(UserConfig.selectedAccount);
                    if (tL_messages_stickerSet == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mediaDataController.loadStickersByEmojiOrName(str4, false, z10);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            if ((tL_messageMediaGiveaway2.flags & 32) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.U = z11;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.f43310a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.f43310a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.f43311b = (g9[]) Arrays.copyOf(this.f43311b, size4);
                this.f43316j = Arrays.copyOf(this.f43316j, size4);
                this.e = (CharSequence[]) Arrays.copyOf(this.e, size4);
                this.f43314g = Arrays.copyOf(this.f43314g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.f43315i = (Rect[]) Arrays.copyOf(this.f43315i, size4);
                this.f43313f = (TLRPC.Chat[]) Arrays.copyOf(this.f43313f, size4);
                for (int i17 = length - 1; i17 < size4; i17++) {
                    this.f43310a[i17] = new ImageReceiver(this.f43312c);
                    this.f43310a[i17].setAllowLoadingOnAttachedOnly(true);
                    this.f43310a[i17].setRoundRadius(AndroidUtilities.dp(f7));
                    this.f43311b[i17] = new g9((f6) null);
                    this.f43311b[i17].u(AndroidUtilities.dp(f10));
                    this.f43315i[i17] = new Rect();
                }
            }
            int dp2 = AndroidUtilities.dp(148.0f);
            if (AndroidUtilities.isTablet()) {
                dp = AndroidUtilities.getMinTabletSide() - AndroidUtilities.dp(80.0f);
            } else {
                dp = i10 - AndroidUtilities.dp(80.0f);
            }
            int i18 = dp;
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
            this.f43328w = uw0.c(spannableStringBuilder, textPaint2, i18, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, i18, 10, true);
            this.f43330y = uw0.c(spannableStringBuilder3, this.E, i18, alignment, AndroidUtilities.dp(2.0f), false, truncateAt, i18, 10, true);
            this.f43331z = uw0.c(spannableStringBuilder4, this.E, i18, alignment, AndroidUtilities.dp(3.0f), false, truncateAt, i18, 10, true);
            int i19 = 0;
            for (int i20 = 0; i20 < this.f43328w.getLineCount(); i20++) {
                i19 = (int) Math.max(i19, Math.ceil(this.f43328w.getLineWidth(i20)));
            }
            for (int i21 = 0; i21 < this.f43330y.getLineCount(); i21++) {
                i19 = (int) Math.max(i19, Math.ceil(this.f43330y.getLineWidth(i21)));
            }
            for (int i22 = 0; i22 < this.f43331z.getLineCount(); i22++) {
                i19 = (int) Math.max(i19, Math.ceil(this.f43331z.getLineWidth(i22)));
            }
            if (i19 < AndroidUtilities.dp(180.0f)) {
                i19 = AndroidUtilities.dp(180.0f);
            }
            int i23 = i19;
            String str6 = tL_messageMediaGiveaway2.prize_description;
            if (str6 != null && !str6.isEmpty()) {
                StaticLayout c10 = uw0.c(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.quantity, tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false), this.E, i23, Layout.Alignment.ALIGN_CENTER, AndroidUtilities.dp(2.0f), false, TextUtils.TruncateAt.END, i23, 20, true);
                this.f43329x = c10;
                this.f43319m = AndroidUtilities.dp(22.0f) + c10.getLineBottom(c10.getLineCount() - 1);
                String string = LocaleController.getString(R.string.BoostingGiveawayMsgWithDivider);
                this.f43321o = string;
                this.f43320n = this.F.measureText(string, 0, string.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i24 = 0;
                while (i24 < size5) {
                    String str7 = arrayList6.get(i24);
                    i24++;
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
                    this.A = uw0.c(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveAwayFromCountries", R.string.BoostingGiveAwayFromCountries, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false), this.H, i23, Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, i23, 10, true);
                }
            }
            int max = Math.max(i11, Math.min(AndroidUtilities.dp(38.0f) + i23, i18));
            this.v = max - i18;
            float f11 = max;
            float f12 = dp2;
            float f13 = f12 / 2.0f;
            this.d.setImageCoords((f11 / 2.0f) - f13, AndroidUtilities.dp(42.0f) - f13, f12, f12);
            int dp3 = AndroidUtilities.dp(5.0f) + this.f43328w.getLineBottom(staticLayout.getLineCount() - 1);
            this.f43322p = dp3;
            this.f43323q = this.f43330y.getLineBottom(staticLayout2.getLineCount() - 1) + dp3 + this.f43319m;
            this.f43324r = this.f43331z.getLineBottom(staticLayout3.getLineCount() - 1);
            StaticLayout staticLayout4 = this.A;
            if (staticLayout4 != null) {
                i12 = staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(f7);
            } else {
                i12 = 0;
            }
            this.f43325s = i12;
            int i25 = this.f43317k + this.f43323q + i12 + this.f43324r;
            this.f43317k = i25;
            this.f43317k = AndroidUtilities.dp(128.0f) + i25;
            this.f43318l = max;
            if (this.U) {
                if (this.f43326t == null) {
                    this.f43326t = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f43327u = LocaleController.formatNumber((int) tL_messageMediaGiveaway2.stars, ',');
            } else {
                this.f43326t = null;
                this.f43327u = "x" + tL_messageMediaGiveaway2.quantity;
            }
            TextPaint textPaint3 = this.B;
            String str9 = this.f43327u;
            textPaint3.getTextBounds(str9, 0, str9.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f43316j, false);
            this.f43317k = AndroidUtilities.dp(30.0f) + this.f43317k;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i26 = 0;
            while (i26 < size6) {
                Long l10 = arrayList8.get(i26);
                i26++;
                Long l11 = l10;
                if (MessagesController.getInstance(UserConfig.selectedAccount).getChat(l11) != null) {
                    arrayList7.add(l11);
                }
            }
            float f14 = 0.0f;
            for (int i27 = 0; i27 < arrayList7.size(); i27++) {
                Long l12 = (Long) arrayList7.get(i27);
                long longValue2 = l12.longValue();
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(l12);
                if (chat != null) {
                    this.f43316j[i27] = true;
                    this.f43313f[i27] = chat;
                    this.e[i27] = TextUtils.ellipsize(Emoji.replaceEmoji(chat.title, this.D.getFontMetricsInt(), false), this.D, 0.8f * f11, TextUtils.TruncateAt.END);
                    float[] fArr = this.f43314g;
                    TextPaint textPaint4 = this.D;
                    CharSequence charSequence = this.e[i27];
                    fArr[i27] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.f43314g[i27] + AndroidUtilities.dp(40.0f);
                    f14 += dp4;
                    if (i27 > 0) {
                        boolean[] zArr = this.h;
                        if (f14 > 0.9f * f11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zArr[i27] = z12;
                        if (z12) {
                            this.f43317k = AndroidUtilities.dp(30.0f) + this.f43317k;
                            f14 = dp4;
                        }
                    } else {
                        this.h[i27] = false;
                    }
                    this.f43311b[i27].q(chat);
                    this.f43310a[i27].setForUserOrChat(chat, this.f43311b[i27]);
                    this.f43310a[i27].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    this.f43313f[i27] = null;
                    this.f43316j[i27] = false;
                    this.e[i27] = "";
                    this.h[i27] = false;
                    this.f43314g[i27] = AndroidUtilities.dp(20.0f);
                    this.f43311b[i27].n(longValue2, "", "");
                }
            }
        }
    }
}
