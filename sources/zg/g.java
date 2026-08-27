package zg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.sp;

public final class g extends Drawable implements DownloadController.FileDownloadProgressListener, ln0 {
    public String A;
    public String B;
    public boolean C;
    public MessageObject D;
    public double E;
    public int F;
    public final mn0 G;
    public float H;
    public float I;
    public SvgHelper.SvgDrawable J;
    public sp K;
    public Drawable L;
    public a M;
    public boolean N;
    public boolean O;
    public TLRPC.MessageMedia P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int W;
    public int X;
    public final int Z;

    public final ud.a f50820a;

    public int f50821a0;

    public final ImageReceiver f50822b;

    public int f50823b0;

    public final int f50824c;

    public int f50825c0;
    public final s1 d;

    public String f50826e;

    public String f50827f;
    public String h;

    public pz0 f50828n;

    public pz0 f50829r;

    public pz0 f50830s;
    public pz0 v;

    public final RadialProgress2 f50832x;

    public final boolean f50833y;

    public final Paint f50831w = new Paint(1);
    public int V = 0;
    public int Y = 255;

    public g(int i10, s1 s1Var, c6 c6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.f50822b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.f50824c = i10;
        this.f50833y = z10;
        this.f50832x = new RadialProgress2(s1Var, c6Var);
        this.d = s1Var;
        mn0 mn0Var = new mn0(s1Var);
        this.G = mn0Var;
        mn0Var.h = this;
        this.f50820a = new ud.a(s1Var, td.a.f48160a, 180L);
        this.Z = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a() {
        this.f50822b.onAttachedToWindow();
        this.f50832x.e();
    }

    @Override
    public final void b(float f10) {
        if (i()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
            n(true);
        }
    }

    public final void c(boolean z10) {
        pz0 pz0Var = this.f50828n;
        if (pz0Var != null) {
            pz0Var.o(g6.w0(null, z10 ? g6.Fb : g6.Dd, false));
        }
        this.f50831w.setColor(1711276032);
        pz0 pz0Var2 = this.v;
        if (pz0Var2 != null) {
            pz0Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.J;
        if (svgDrawable != null) {
            svgDrawable.setColorKey(z10 ? g6.Pb : g6.f23290qe);
        }
        boolean z11 = this.T;
        RadialProgress2 radialProgress2 = this.f50832x;
        if (!z11 && !this.S) {
            radialProgress2.g(g6.f23205le, g6.f23223me, g6.f23241ne, g6.f23258oe);
            return;
        }
        mn0 mn0Var = this.G;
        if (z10) {
            int iW0 = g6.w0(null, g6.wb, false);
            int iW1 = g6.w0(null, g6.f23410xb, false);
            int i10 = g6.f23446zb;
            mn0Var.h(iW0, iW1, g6.w0(null, i10, false), g6.w0(null, i10, false), g6.w0(null, g6.f23428yb, false));
            radialProgress2.g(g6.Nb, g6.Ob, g6.Pa, g6.Qa);
            return;
        }
        radialProgress2.g(g6.f23152ie, g6.f23170je, g6.f23363uc, g6.f23379vc);
        int iW2 = g6.w0(null, g6.f23364ud, false);
        int iW3 = g6.w0(null, g6.f23380vd, false);
        int i11 = g6.f23412xd;
        mn0Var.h(iW2, iW3, g6.w0(null, i11, false), g6.w0(null, i11, false), g6.w0(null, g6.wd, false));
    }

    public final void d() {
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.Y == 0 || bounds.isEmpty()) {
            return;
        }
        f(false);
        boolean z10 = this.S;
        int i10 = 2;
        RadialProgress2 radialProgress2 = this.f50832x;
        if (z10 || this.T) {
            int i11 = bounds.left;
            boolean z11 = this.f50833y;
            int iDp = i11 + (z11 ? 0 : AndroidUtilities.dp(8.0f));
            int iDp2 = bounds.top + (z11 ? 0 : AndroidUtilities.dp(3.0f));
            int iDp3 = this.T ? 0 : AndroidUtilities.dp(3.0f);
            pz0 pz0Var = this.f50828n;
            if (pz0Var != null) {
                pz0Var.e(canvas, AndroidUtilities.dp(56.0f) + iDp, AndroidUtilities.dp(15.0f) + iDp2 + iDp3);
            }
            if (this.T) {
                float f10 = this.f50820a.f48497e;
                if (this.f50829r != null && f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    int i12 = iDp2 + iDp3;
                    canvas.scale(f11, f11, AndroidUtilities.dp(56.0f) + iDp, AndroidUtilities.dp(35.0f) + i12);
                    this.f50829r.f31695a.setAlpha((int) (f11 * 255.0f));
                    this.f50829r.e(canvas, AndroidUtilities.dp(56.0f) + iDp, AndroidUtilities.dp(35.0f) + i12);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    mn0 mn0Var = this.G;
                    mn0Var.f30722t = f10;
                    mn0Var.j(rl.u(56.0f, iDp, bounds.right), AndroidUtilities.dp(30.0f));
                    canvas.save();
                    float fDp = AndroidUtilities.dp(45.0f) + iDp;
                    this.H = fDp;
                    float fDp2 = AndroidUtilities.dp(21.0f) + iDp2 + iDp3;
                    this.I = fDp2;
                    canvas.translate(fDp, fDp2);
                    mn0Var.b(canvas);
                    canvas.restore();
                }
            }
            pz0 pz0Var2 = this.f50830s;
            if (pz0Var2 != null) {
                pz0Var2.e(canvas, AndroidUtilities.dp(56.0f) + iDp, AndroidUtilities.dp((this.T ? 20 : 2) + 34) + iDp3 + iDp2);
            }
            int iDp4 = AndroidUtilities.dp(2.0f) + iDp;
            this.W = iDp4;
            int iDp5 = AndroidUtilities.dp(5.0f) + iDp2;
            this.X = iDp5;
            radialProgress2.q(iDp4, iDp5, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(2.0f) + iDp, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(5.0f) + iDp2);
        } else {
            float f12 = this.Y / 255.0f;
            ImageReceiver imageReceiver = this.f50822b;
            imageReceiver.setAlpha(f12);
            imageReceiver.setImageCoords(bounds);
            imageReceiver.draw(canvas);
            if (this.U && (drawable = this.L) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.L.getIntrinsicHeight() * 0.8f);
                int iA = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - er.f28126k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                this.L.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                this.L.setBounds(iA, imageHeight, intrinsicWidth + iA, intrinsicHeight + imageHeight);
                this.L.draw(canvas);
            }
            radialProgress2.q(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
            if (this.C && this.v != null) {
                canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.f31697c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.f50831w);
                this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
            }
        }
        if (this.U) {
            return;
        }
        MessageObject messageObject = this.D;
        if (messageObject == null || !messageObject.isSending()) {
            a aVar = this.M;
            if (aVar == null || !aVar.f50800g) {
                if (this.T) {
                    if (aVar != null && aVar.f50799f) {
                        i10 = 4;
                    }
                    l(i10, true);
                } else {
                    k(g());
                }
            } else if (this.T) {
                l(3, true);
            } else {
                k(3);
            }
        } else if (ImageLoader.getInstance().getFileProgressSizes(this.B) == null) {
            radialProgress2.o(1.0f, true);
            if (this.T) {
                l(6, true);
            } else {
                k(6);
            }
        }
        if (this.T) {
            k(g());
        }
        radialProgress2.draw(canvas);
    }

    @Override
    public final void e(float f10) {
        if (i()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f10;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * ((double) f10));
            n(true);
        }
    }

    public final void f(boolean z10) {
        int iWidth = getBounds().width() - AndroidUtilities.dp(this.f50833y ? 64.0f : 72.0f);
        if (this.V != iWidth || z10) {
            this.V = iWidth;
            String str = this.f50826e;
            if (str != null) {
                if (this.f50828n == null) {
                    this.f50828n = new pz0(str, 15.0f, AndroidUtilities.bold());
                }
                pz0 pz0Var = this.f50828n;
                pz0Var.r(TextUtils.ellipsize(this.f50826e, pz0Var.f31695a, iWidth, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f50827f;
            if (str2 != null) {
                if (this.f50829r == null) {
                    this.f50829r = new pz0(str2, 14.0f, null);
                }
                pz0 pz0Var2 = this.f50829r;
                pz0Var2.r(TextUtils.ellipsize(this.f50827f, pz0Var2.f31695a, iWidth, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f50830s == null) {
                    this.f50830s = new pz0(str3, 12.0f, null);
                }
                pz0 pz0Var3 = this.f50830s;
                pz0Var3.r(TextUtils.ellipsize(this.h, pz0Var3.f31695a, iWidth, TextUtils.TruncateAt.END));
            }
            if (this.C && this.v == null) {
                this.v = new pz0(AndroidUtilities.formatLongDuration(this.F), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.T;
        if (z10 && this.f50820a.f48498f) {
            return !MediaController.getInstance().isMessagePaused() ? 1 : 0;
        }
        if (this.C || z10) {
            return 0;
        }
        if (!this.S) {
            return 4;
        }
        a aVar = this.M;
        return (aVar == null || !aVar.f50799f) ? 2 : 5;
    }

    @Override
    public final int getAlpha() {
        return this.Y;
    }

    @Override
    public final int getObserverTag() {
        return this.Z;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i10) {
        if (this.T) {
            return AndroidUtilities.dp(63.0f);
        }
        if (this.S) {
            return AndroidUtilities.dp(56.0f);
        }
        int i11 = this.Q;
        if (i11 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        return Math.min(Math.round((i10 / i11) * this.R), this.f50833y ? (i10 * 4) / 5 : (i10 * 5) / 4);
    }

    public final boolean i() {
        return this.T && MediaController.getInstance().isPlayingMessage(this.D) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.f50833y;
    }

    public final boolean j(float f10, float f11, int i10) {
        if (!this.T || this.f50823b0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int iDp = AndroidUtilities.dp(36.0f);
            int iDp2 = AndroidUtilities.dp(27.0f);
            int i11 = this.W + iDp2;
            if (f10 >= i11 && f10 <= i11 + iDp) {
                int i12 = this.X + iDp2;
                if (f11 >= i12 && f11 <= i12 + iDp) {
                    this.N = true;
                    return true;
                }
            }
        }
        boolean z10 = this.N;
        if (z10) {
            if (i10 == 1) {
                a aVar = this.M;
                if (aVar != null) {
                    TLRPC.Document document = aVar.f50796b;
                    int i13 = aVar.f50795a;
                    if (aVar.f50800g) {
                        FileLoader.getInstance(i13).cancelLoadFile(document);
                        aVar.a();
                    } else if (!aVar.f50799f) {
                        FileLoader.getInstance(i13).loadFile(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    d();
                }
                this.N = false;
                return true;
            }
            if (i10 == 3) {
                this.N = false;
                return true;
            }
        }
        return z10;
    }

    public final void k(int i10) {
        if (this.f50821a0 != i10) {
            this.f50821a0 = i10;
            this.f50832x.setIcon(i10, true, true);
        }
    }

    public final void l(int i10, boolean z10) {
        if (this.f50823b0 != i10) {
            this.f50823b0 = i10;
            this.f50832x.k(i10, true, z10);
        }
    }

    public final void m(MessageObject messageObject, TLRPC.MessageMedia messageMedia, MessageObject messageObject2, int i10, String str, boolean z10) {
        boolean z11;
        TLRPC.Document document;
        boolean z12;
        int i11;
        double d;
        String str2 = this.A;
        this.Q = 0;
        this.R = 0;
        this.D = messageObject;
        this.P = messageMedia;
        this.S = false;
        this.T = false;
        this.C = false;
        this.U = false;
        this.E = 0.0d;
        this.F = 0;
        this.B = str;
        this.A = null;
        this.M = null;
        int i12 = this.f50824c;
        RadialProgress2 radialProgress2 = this.f50832x;
        ImageReceiver imageReceiver = this.f50822b;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            z11 = false;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), true, closestPhotoSizeWithSize, true);
            if (closestPhotoSizeWithSize2 == null) {
                z11 = false;
            } else {
                int i13 = closestPhotoSizeWithSize2.f22405w;
                this.Q = i13;
                int i14 = closestPhotoSizeWithSize2.h;
                this.R = i14;
                Locale locale = Locale.US;
                float f10 = AndroidUtilities.density;
                String strL = com.google.android.recaptcha.internal.a.l((int) (i13 / f10), "_", (int) (i14 / f10));
                String strConcat = strL.concat("_b");
                this.A = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                imageReceiver.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, photo), strL, ImageLocation.getForObject(closestPhotoSizeWithSize, photo), strConcat, null, closestPhotoSizeWithSize2.size, null, messageObject2, 1);
                z11 = true;
            }
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
            if (messageMedia.geo != null) {
                if (this.J == null) {
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(R.raw.map_placeholder, g6.Pb, (g6.I.q() ? 3 : 6) * 0.12f);
                    this.J = svgThumb;
                    svgThumb.setAspectCenter(true);
                    this.K = new sp(this.J);
                }
                if (this.L == null) {
                    this.L = this.d.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                }
                this.U = true;
                this.Q = i10;
                int i15 = (i10 * 9) / 16;
                this.R = i15;
                TLRPC.GeoPoint geoPoint = messageMedia.geo;
                float f11 = AndroidUtilities.density;
                imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, (int) (i10 / f11), (int) (i15 / f11), 15, Math.min(2, (int) Math.ceil(f11)))), (String) null, (ImageLocation) null, (String) null, this.K, messageObject2, 0);
                z11 = true;
            } else {
                z11 = false;
            }
        } else if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument) || (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) == null) {
            z11 = false;
        } else {
            this.M = new a(i12, messageObject, document, str);
            this.A = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
            if (MessageObject.isMusicDocument(document)) {
                this.T = true;
                this.f50826e = MessageObject.getMusicTitle(document, true);
                this.f50827f = MessageObject.getMusicAuthor(document, true);
                int i16 = 0;
                while (true) {
                    if (i16 >= document.attributes.size()) {
                        d = 0.0d;
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i16);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                        d = documentAttribute.duration;
                        break;
                    }
                    i16++;
                }
                if (MessageObject.isDocumentHasThumb(document)) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
                    radialProgress2.j(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize3, true), closestPhotoSizeWithSize3, document, this.D);
                } else {
                    String artworkUrl = MessageObject.getArtworkUrl(document, true);
                    if (TextUtils.isEmpty(artworkUrl)) {
                        radialProgress2.i(null, null, null);
                    } else {
                        radialProgress2.h(artworkUrl);
                    }
                }
                this.E = d;
                this.h = AndroidUtilities.formatShortDuration(i() ? MediaController.getInstance().getPlayingMessageObject().audioProgressSec : 0, (int) this.E);
                z12 = true;
            } else if (MessageObject.isVideoDocument(document)) {
                this.F = (int) Math.max(1L, Math.round(MessageObject.getDocumentDuration(document)));
                this.C = true;
                TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.getPhotoSize(), true, null, true);
                float f12 = i10;
                TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, (int) (f12 / AndroidUtilities.density), false, closestPhotoSizeWithSize4, false);
                ImageLocation forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize4, document);
                ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize5, document);
                int i17 = (int) (f12 / AndroidUtilities.density);
                if (closestPhotoSizeWithSize4 != null) {
                    int i18 = closestPhotoSizeWithSize4.f22405w;
                    this.Q = i18;
                    int i19 = closestPhotoSizeWithSize4.h;
                    this.R = i19;
                    if (i18 != 0) {
                        i11 = (i19 * i17) / i18;
                    } else {
                        i11 = i17;
                    }
                } else if (closestPhotoSizeWithSize5 != null) {
                    int i20 = closestPhotoSizeWithSize5.f22405w;
                    this.Q = i20;
                    int i21 = closestPhotoSizeWithSize5.h;
                    this.R = i21;
                    if (i20 != 0) {
                        i11 = (i21 * i17) / i20;
                    } else {
                        i11 = i17;
                    }
                } else {
                    i11 = i17;
                }
                String strL2 = com.google.android.recaptcha.internal.a.l(i17, "_", i11);
                z12 = true;
                imageReceiver.setImage(null, strL2, forDocument, strL2, forDocument2, strL2, null, 0L, null, messageObject2, 0);
            } else {
                z12 = true;
                this.S = true;
                this.f50826e = FileLoader.getDocumentFileName(document);
                String str3 = AndroidUtilities.formatFileSize(document.size) + " " + FileLoader.getDocumentExtension(document);
                this.h = str3;
                this.f50827f = str3;
            }
            f(z12);
            z11 = true;
        }
        this.O = z11;
        if (!z11) {
            imageReceiver.clearImage();
        }
        if (!TextUtils.equals(str2, this.A)) {
            if (!TextUtils.isEmpty(str2)) {
                DownloadController.getInstance(i12).removeLoadingFileObserver(this);
            }
            if (!TextUtils.isEmpty(this.A)) {
                DownloadController.getInstance(i12).addLoadingFileObserver(this.A, this);
            }
        }
        if (!this.T) {
            radialProgress2.i(null, null, null);
            l(4, false);
        }
        n(z10);
    }

    public final void n(boolean z10) {
        int i10;
        if (!this.T || this.D == null) {
            return;
        }
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        boolean zI = i();
        this.f50820a.a(zI, z10);
        if (playingMessageObject == null || !zI) {
            i10 = 0;
        } else {
            i10 = playingMessageObject.audioProgressSec;
            mn0 mn0Var = this.G;
            if (!mn0Var.f30708e) {
                mn0Var.i(playingMessageObject.audioProgress);
                mn0Var.f30719q = playingMessageObject.bufferedProgress;
            }
            mn0Var.k(playingMessageObject);
        }
        if (this.f50825c0 != i10) {
            this.f50825c0 = i10;
            this.h = AndroidUtilities.formatShortDuration(i10, (int) this.E);
            f(true);
            this.d.invalidate();
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        d();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float fMin = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.f50832x.o(fMin, true);
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        if (this.T) {
            l(fMin >= 1.0f ? 4 : 3, true);
        } else {
            k(fMin >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float fMin = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.f50832x.o(fMin, true);
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        if (this.T) {
            l(fMin >= 1.0f ? 4 : 3, true);
        } else {
            k(fMin >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
        d();
    }

    @Override
    public final void setAlpha(int i10) {
        this.Y = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
