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
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import bh.u0;
import di.e;
import ig.o;
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
import org.telegram.messenger.t;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.px0;
import vg.s;
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
    public MessageObject T;
    public boolean U;
    public ImageReceiver[] f52529a;
    public j9[] f52530b;
    public final s1 f52531c;
    public ImageReceiver d;
    public CharSequence[] e;
    public TLRPC.Chat[] f52532f;
    public float[] f52533g;
    public boolean[] h;
    public Rect[] f52534i;
    public boolean[] f52535j;
    public int f52538m;
    public float f52539n;
    public String f52540o;
    public int f52541p;
    public int f52542q;
    public int f52543r;
    public int f52544s;
    public Drawable f52545t;
    public String f52546u;
    public int v;
    public StaticLayout f52547w;
    public StaticLayout f52548x;
    public StaticLayout f52549y;
    public StaticLayout f52550z;
    public int f52536k = 0;
    public int f52537l = 0;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;

    static {
        HashMap hashMap = new HashMap();
        Y = hashMap;
        ic.a.q(1, hashMap, "1⃣", 3, "2⃣");
        ic.a.q(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public a(s1 s1Var) {
        this.f52531c = s1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway()) {
            int x9 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.f52534i;
                    if (i10 < rectArr.length) {
                        if (rectArr[i10].contains(x9, y3)) {
                            this.V = i10;
                            this.S.setHotspot(x9, y3);
                            this.W = true;
                            c(true);
                            return true;
                        }
                        i10++;
                    } else if (this.P.contains(x9, y3)) {
                        this.X = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.W) {
                    s1 s1Var = this.f52531c;
                    if (s1Var.getDelegate() != null) {
                        s1Var.getDelegate().J(this.V, s1Var);
                    }
                    s1Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    MessageObject messageObject2 = this.T;
                    if (messageObject2 != null && messageObject2.messageOwner != null) {
                        s.d(messageObject2, new o(messageObject2, 23), new e(24));
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

    public final void b(Canvas canvas, int i10, int i11, u6 u6Var) {
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
            y yVar = this.S;
            s1 s1Var = this.f52531c;
            int i13 = 0;
            if (yVar == null) {
                int x02 = y6.x0(null, y6.f23446i6, false);
                this.R = x02;
                y Z = y6.Z(x02, 12, 12);
                this.S = Z;
                Z.setCallback(s1Var);
            }
            this.E.setColor(y6.f23554o2.getColor());
            this.F.setColor(y6.o1(0.45f, y6.f23554o2.getColor()));
            this.G.setColor(y6.o1(0.15f, y6.f23554o2.getColor()));
            this.H.setColor(y6.f23554o2.getColor());
            if (this.T.isOutOwner()) {
                TextPaint textPaint2 = this.D;
                int i14 = y6.Xa;
                textPaint2.setColor(y6.w0(i14, u6Var));
                this.I.setColor(y6.w0(i14, u6Var));
                this.J.setColor(y6.w0(y6.f23301ab, u6Var));
            } else {
                TextPaint textPaint3 = this.D;
                int i15 = y6.Kc;
                textPaint3.setColor(y6.w0(i15, u6Var));
                this.I.setColor(y6.w0(i15, u6Var));
                this.J.setColor(y6.w0(y6.Uc, u6Var));
            }
            if (this.U) {
                this.I.setColor(y6.w0(y6.fk, u6Var));
            }
            canvas2.save();
            int dp = i11 - AndroidUtilities.dp(4.0f);
            canvas2.translate(dp, i10);
            this.P.set(dp, i10, this.f52537l + dp, this.f52536k + i10);
            canvas2.saveLayer(0.0f, 0.0f, this.f52537l, this.f52536k, this.K, 31);
            this.d.draw(canvas2);
            float f13 = this.f52537l / 2.0f;
            float dp2 = AndroidUtilities.dp(106.0f);
            int dp3 = AndroidUtilities.dp(12.0f) + this.O.width();
            int dp4 = AndroidUtilities.dp(10.0f) + this.O.height();
            this.M.set(f13 - ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f), dp2 - ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f), ((AndroidUtilities.dp(2.0f) + dp3) / 2.0f) + f13, ((AndroidUtilities.dp(2.0f) + dp4) / 2.0f) + dp2);
            canvas2.drawRoundRect(this.M, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), this.L);
            float f14 = dp3 / 2.0f;
            float f15 = dp4 / 2.0f;
            this.M.set(f13 - f14, dp2 - f15, f13 + f14, dp2 + f15);
            canvas2.drawRoundRect(this.M, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.I);
            Drawable drawable = this.f52545t;
            if (drawable != null) {
                drawable.setBounds(AndroidUtilities.dp(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - AndroidUtilities.dp(6.96f), AndroidUtilities.dp(21.24f) + ((int) this.M.left), AndroidUtilities.dp(6.96f) + ((int) this.M.centerY()));
                this.f52545t.draw(canvas2);
            }
            String str = this.f52546u;
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
            this.f52547w.draw(canvas2);
            canvas2.translate(0.0f, this.f52541p);
            float f16 = 6.0f;
            if (this.f52548x != null) {
                canvas2.restore();
                canvas2.save();
                float dp7 = (this.f52541p + this.f52538m) - AndroidUtilities.dp(6.0f);
                float f17 = this.f52537l / 2.0f;
                canvas2.drawText(this.f52540o, f17, dp7, this.F);
                f10 = 16.0f;
                canvas2.drawLine(AndroidUtilities.dp(17.0f), dp7 - AndroidUtilities.dp(4.0f), (f17 - (this.f52539n / 2.0f)) - AndroidUtilities.dp(6.0f), dp7 - AndroidUtilities.dp(4.0f), this.G);
                canvas2 = canvas;
                canvas2.drawLine(AndroidUtilities.dp(6.0f) + (this.f52539n / 2.0f) + f17, dp7 - AndroidUtilities.dp(4.0f), this.f52537l - AndroidUtilities.dp(16.0f), dp7 - AndroidUtilities.dp(4.0f), this.G);
                canvas2.translate((this.f52537l - this.f52548x.getWidth()) / 2.0f, this.f52541p);
                this.f52548x.draw(canvas2);
                canvas2.restore();
                canvas2.save();
                canvas2.translate(this.v / 2.0f, this.f52538m + this.f52541p);
            } else {
                f10 = 16.0f;
            }
            this.f52549y.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, AndroidUtilities.dp(6.0f) + this.f52542q);
            int D = t.D(6.0f, this.f52542q, dp6);
            int i16 = 0;
            int i17 = 0;
            while (true) {
                boolean[] zArr = this.f52535j;
                if (i16 >= zArr.length) {
                    break;
                } else if (zArr[i16]) {
                    canvas2.save();
                    int i18 = i16;
                    float f18 = 0.0f;
                    while (true) {
                        f12 = f16;
                        f18 += this.f52533g[i18] + AndroidUtilities.dp(40.0f);
                        i18++;
                        boolean[] zArr2 = this.f52535j;
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
                        TLRPC.Chat chat = this.f52532f[i20];
                        if (this.T.isOutOwner()) {
                            w02 = y6.w0(y6.Xa, u6Var);
                        } else {
                            int colorId = ChatObject.getColorId(chat);
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
                                    w02 = color.getColor(i13, u6Var);
                                } else {
                                    w02 = y6.w0(y6.f23614r8[i13], u6Var);
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
                        this.f52529a[i20].draw(canvas2);
                        CharSequence charSequence = this.e[i20];
                        int i22 = i19;
                        canvas2.drawText(charSequence, 0, charSequence.length(), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(f10), this.D);
                        this.N.set(0.0f, 0.0f, this.f52533g[i20] + AndroidUtilities.dp(40.0f), AndroidUtilities.dp(24.0f));
                        canvas2.drawRoundRect(this.N, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.J);
                        float f20 = i22;
                        this.f52534i[i20].set(i22, D, (int) (this.N.width() + f20), AndroidUtilities.dp(24.0f) + D);
                        canvas2.translate(this.N.width() + AndroidUtilities.dp(f12), 0.0f);
                        i19 = (int) (this.N.width() + AndroidUtilities.dp(f12) + f20);
                        i20++;
                        boolean[] zArr3 = this.f52535j;
                        if (i20 >= zArr3.length || this.h[i20] || !zArr3[i20]) {
                            break;
                        }
                        i17 = i12;
                        i13 = 0;
                    }
                    canvas2.restore();
                    canvas2.translate(0.0f, AndroidUtilities.dp(30.0f));
                    D += AndroidUtilities.dp(30.0f);
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
                canvas2.translate((this.f52537l - this.A.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f));
                this.A.draw(canvas2);
                canvas2.restore();
                canvas2.translate(0.0f, this.f52544s);
            }
            canvas2.translate(0.0f, AndroidUtilities.dp(f21));
            canvas2.save();
            canvas2.translate(this.v / 2.0f, 0.0f);
            this.f52550z.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
            if (this.V >= 0) {
                if (y6.I.q()) {
                    f11 = 0.12f;
                } else {
                    f11 = 0.1f;
                }
                int o12 = y6.o1(f11, i17);
                if (this.R != o12) {
                    y yVar2 = this.S;
                    this.R = o12;
                    y6.E1(yVar2, o12, true);
                }
                this.S.setBounds(this.f52534i[this.V]);
                this.S.setCallback(s1Var);
            }
        }
    }

    public final void c(boolean z10) {
        y yVar;
        MessageObject messageObject = this.T;
        if (messageObject != null && messageObject.isGiveaway() && (yVar = this.S) != null) {
            s1 s1Var = this.f52531c;
            if (z10) {
                yVar.setCallback(new u0(this, 10));
                this.S.setState(this.Q);
                s1Var.invalidate();
                return;
            }
            yVar.setState(StateSet.NOTHING);
            s1Var.invalidate();
        }
    }

    public final void d(MessageObject messageObject, int i10, int i11) {
        float f7;
        boolean z10;
        float f10;
        TLRPC.Document document;
        String str;
        int dp;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        StaticLayout staticLayout3;
        this.T = null;
        this.f52547w = null;
        this.f52548x = null;
        this.f52549y = null;
        this.f52550z = null;
        this.A = null;
        int i12 = 0;
        this.f52536k = 0;
        this.f52537l = 0;
        this.f52538m = 0;
        this.f52539n = 0.0f;
        if (messageObject.isGiveaway()) {
            this.T = messageObject;
            float f11 = 12.0f;
            boolean z11 = true;
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
                this.f52532f = new TLRPC.Chat[10];
                this.f52533g = new float[10];
                this.h = new boolean[10];
                this.f52534i = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.f52531c);
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
            if (this.f52529a == null) {
                this.f52529a = new ImageReceiver[10];
                this.f52530b = new j9[10];
                this.f52535j = new boolean[10];
                int i13 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.f52529a;
                    if (i13 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i13] = new ImageReceiver(this.f52531c);
                    this.f52529a[i13].setAllowLoadingOnAttachedOnly(true);
                    this.f52529a[i13].setRoundRadius(AndroidUtilities.dp(12.0f));
                    this.f52530b[i13] = new j9((u6) null);
                    this.f52530b[i13].u(AndroidUtilities.dp(18.0f));
                    this.f52534i[i13] = new Rect();
                    i13++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            String str2 = UserConfig.getInstance(UserConfig.selectedAccount).premiumGiftsStickerPack;
            if (str2 == null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).checkPremiumGiftStickers();
                f7 = 12.0f;
                z10 = true;
                f10 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSetByName(str2);
                if (stickerSetByName == null) {
                    stickerSetByName = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSetByEmojiOrName(str2);
                }
                if (stickerSetByName != null) {
                    String str3 = (String) Y.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = stickerSetByName.packs;
                    int size = arrayList.size();
                    document = null;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            f7 = f11;
                            z10 = z11;
                            f10 = f12;
                            break;
                        }
                        TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i14);
                        i14++;
                        TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                        f7 = f11;
                        if (Objects.equals(tL_stickerPack2.emoticon, str3)) {
                            ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                            int size2 = arrayList2.size();
                            f10 = f12;
                            int i15 = i12;
                            while (true) {
                                if (i15 >= size2) {
                                    str = str3;
                                    z10 = z11;
                                    break;
                                }
                                Long l4 = arrayList2.get(i15);
                                i15++;
                                long longValue = l4.longValue();
                                ArrayList<TLRPC.Document> arrayList3 = stickerSetByName.documents;
                                int size3 = arrayList3.size();
                                z10 = z11;
                                int i16 = i12;
                                while (true) {
                                    if (i16 >= size3) {
                                        str = str3;
                                        break;
                                    }
                                    TLRPC.Document document2 = arrayList3.get(i16);
                                    i16++;
                                    TLRPC.Document document3 = document2;
                                    ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                    str = str3;
                                    if (document3.f22033id == longValue) {
                                        document = document3;
                                        break;
                                    } else {
                                        str3 = str;
                                        arrayList3 = arrayList4;
                                    }
                                }
                                if (document != null) {
                                    break;
                                }
                                z11 = z10;
                                str3 = str;
                                i12 = 0;
                            }
                        } else {
                            str = str3;
                            z10 = z11;
                            f10 = f12;
                        }
                        if (document != null) {
                            break;
                        }
                        f11 = f7;
                        f12 = f10;
                        z11 = z10;
                        str3 = str;
                        i12 = 0;
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
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, y6.f23336c7, 0.2f);
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    this.d.setImage(ImageLocation.getForDocument(document), "160_160_firstframe", svgThumb, "tgs", stickerSetByName, 1);
                } else {
                    MediaDataController.getInstance(UserConfig.selectedAccount).loadStickersByEmojiOrName(str2, false, stickerSetByName == null ? z10 : false);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) messageObject.messageOwner.media;
            this.U = (tL_messageMediaGiveaway2.flags & 32) != 0 ? z10 : false;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.f52529a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.f52529a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.f52530b = (j9[]) Arrays.copyOf(this.f52530b, size4);
                this.f52535j = Arrays.copyOf(this.f52535j, size4);
                this.e = (CharSequence[]) Arrays.copyOf(this.e, size4);
                this.f52533g = Arrays.copyOf(this.f52533g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.f52534i = (Rect[]) Arrays.copyOf(this.f52534i, size4);
                this.f52532f = (TLRPC.Chat[]) Arrays.copyOf(this.f52532f, size4);
                int i17 = length - 1;
                while (i17 < size4) {
                    this.f52529a[i17] = new ImageReceiver(this.f52531c);
                    this.f52529a[i17].setAllowLoadingOnAttachedOnly(z10);
                    this.f52529a[i17].setRoundRadius(AndroidUtilities.dp(f7));
                    this.f52530b[i17] = new j9((u6) null);
                    this.f52530b[i17].u(AndroidUtilities.dp(f10));
                    this.f52534i[i17] = new Rect();
                    i17++;
                    z10 = true;
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
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(messagesController.getChat(Long.valueOf(-MessageObject.getPeerId(isForwarded ? message.fwd_from.from_id : message.peer_id))));
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
                spannableStringBuilder3.append((CharSequence) LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingGiveawayMsgNewSubsPlural" : "BoostingGiveawayMsgNewSubsGroupPlural", tL_messageMediaGiveaway2.channels.size(), new Object[0]));
            } else {
                spannableStringBuilder3.append((CharSequence) LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "BoostingGiveawayMsgAllSubsPlural" : "BoostingGiveawayMsgAllSubsGroupPlural", tL_messageMediaGiveaway2.channels.size(), new Object[0]));
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
            this.f52547w = px0.c(spannableStringBuilder, textPaint2, i18, alignment, AndroidUtilities.dp(2.0f), truncateAt, i18, 10, true);
            this.f52549y = px0.c(spannableStringBuilder3, this.E, i18, alignment, AndroidUtilities.dp(2.0f), truncateAt, i18, 10, true);
            this.f52550z = px0.c(spannableStringBuilder4, this.E, i18, alignment, AndroidUtilities.dp(3.0f), truncateAt, i18, 10, true);
            int i19 = 0;
            for (int i20 = 0; i20 < this.f52547w.getLineCount(); i20++) {
                i19 = (int) Math.max(i19, Math.ceil(this.f52547w.getLineWidth(i20)));
            }
            for (int i21 = 0; i21 < this.f52549y.getLineCount(); i21++) {
                i19 = (int) Math.max(i19, Math.ceil(this.f52549y.getLineWidth(i21)));
            }
            for (int i22 = 0; i22 < this.f52550z.getLineCount(); i22++) {
                i19 = (int) Math.max(i19, Math.ceil(this.f52550z.getLineWidth(i22)));
            }
            if (i19 < AndroidUtilities.dp(180.0f)) {
                i19 = AndroidUtilities.dp(180.0f);
            }
            int i23 = i19;
            String str4 = tL_messageMediaGiveaway2.prize_description;
            if (str4 != null && !str4.isEmpty()) {
                StaticLayout c10 = px0.c(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.quantity, tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false), this.E, i23, Layout.Alignment.ALIGN_CENTER, AndroidUtilities.dp(2.0f), TextUtils.TruncateAt.END, i23, 20, true);
                this.f52548x = c10;
                this.f52538m = AndroidUtilities.dp(22.0f) + c10.getLineBottom(c10.getLineCount() - 1);
                String string = LocaleController.getString(R.string.BoostingGiveawayMsgWithDivider);
                this.f52540o = string;
                this.f52539n = this.F.measureText(string, 0, string.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i24 = 0;
                while (i24 < size5) {
                    String str5 = arrayList6.get(i24);
                    i24++;
                    String str6 = str5;
                    String displayCountry = new Locale("", str6).getDisplayCountry(Locale.getDefault());
                    String languageFlag = LocaleController.getLanguageFlag(str6);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (languageFlag != null) {
                        spannableStringBuilder5.append((CharSequence) languageFlag).append((CharSequence) " ");
                    }
                    spannableStringBuilder5.append((CharSequence) displayCountry);
                    arrayList5.add(spannableStringBuilder5);
                }
                if (!arrayList5.isEmpty()) {
                    this.A = px0.c(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveAwayFromCountries", R.string.BoostingGiveAwayFromCountries, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false), this.H, i23, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, i23, 10, true);
                }
            }
            int max = Math.max(i11, Math.min(AndroidUtilities.dp(38.0f) + i23, i18));
            this.v = max - i18;
            float f13 = max;
            float f14 = dp2;
            float f15 = f14 / 2.0f;
            this.d.setImageCoords((f13 / 2.0f) - f15, AndroidUtilities.dp(42.0f) - f15, f14, f14);
            int dp3 = AndroidUtilities.dp(5.0f) + this.f52547w.getLineBottom(staticLayout.getLineCount() - 1);
            this.f52541p = dp3;
            this.f52542q = this.f52549y.getLineBottom(staticLayout2.getLineCount() - 1) + dp3 + this.f52538m;
            this.f52543r = this.f52550z.getLineBottom(staticLayout3.getLineCount() - 1);
            StaticLayout staticLayout4 = this.A;
            int lineBottom = staticLayout4 != null ? staticLayout4.getLineBottom(staticLayout4.getLineCount() - 1) + AndroidUtilities.dp(f7) : 0;
            this.f52544s = lineBottom;
            int i25 = this.f52536k + this.f52542q + lineBottom + this.f52543r;
            this.f52536k = i25;
            this.f52536k = AndroidUtilities.dp(128.0f) + i25;
            this.f52537l = max;
            if (this.U) {
                if (this.f52545t == null) {
                    this.f52545t = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.filled_giveaway_stars).mutate();
                }
                this.f52546u = LocaleController.formatNumber((int) tL_messageMediaGiveaway2.stars, ',');
            } else {
                this.f52545t = null;
                this.f52546u = "x" + tL_messageMediaGiveaway2.quantity;
            }
            TextPaint textPaint3 = this.B;
            String str7 = this.f52546u;
            textPaint3.getTextBounds(str7, 0, str7.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = AndroidUtilities.dp(20.0f) + rect.right;
            }
            Arrays.fill(this.f52535j, false);
            this.f52536k = AndroidUtilities.dp(30.0f) + this.f52536k;
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
            float f16 = 0.0f;
            for (int i27 = 0; i27 < arrayList7.size(); i27++) {
                Long l12 = (Long) arrayList7.get(i27);
                long longValue2 = l12.longValue();
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(l12);
                if (chat != null) {
                    this.f52535j[i27] = true;
                    this.f52532f[i27] = chat;
                    this.e[i27] = TextUtils.ellipsize(Emoji.replaceEmoji(chat.title, this.D.getFontMetricsInt(), false), this.D, 0.8f * f13, TextUtils.TruncateAt.END);
                    float[] fArr = this.f52533g;
                    TextPaint textPaint4 = this.D;
                    CharSequence charSequence = this.e[i27];
                    fArr[i27] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float dp4 = this.f52533g[i27] + AndroidUtilities.dp(40.0f);
                    f16 += dp4;
                    if (i27 > 0) {
                        boolean[] zArr = this.h;
                        boolean z12 = f16 > 0.9f * f13;
                        zArr[i27] = z12;
                        if (z12) {
                            this.f52536k = AndroidUtilities.dp(30.0f) + this.f52536k;
                            f16 = dp4;
                        }
                    } else {
                        this.h[i27] = false;
                    }
                    this.f52530b[i27].q(chat);
                    this.f52529a[i27].setForUserOrChat(chat, this.f52530b[i27]);
                    this.f52529a[i27].setImageCoords(0.0f, 0.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                } else {
                    this.f52532f[i27] = null;
                    this.f52535j[i27] = false;
                    this.e[i27] = "";
                    this.h[i27] = false;
                    this.f52533g[i27] = AndroidUtilities.dp(20.0f);
                    this.f52530b[i27].n(longValue2, "", "");
                }
            }
        }
    }
}
