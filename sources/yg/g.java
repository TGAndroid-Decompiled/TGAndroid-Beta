package yg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.up;
public final class g extends Drawable implements DownloadController.FileDownloadProgressListener, kn0 {
    public String A;
    public String B;
    public boolean C;
    public MessageObject D;
    public double E;
    public int F;
    public final ln0 G;
    public float H;
    public float I;
    public SvgHelper.SvgDrawable J;
    public up K;
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
    public final td.a f50224a;
    public int f50225a0;
    public final ImageReceiver f50226b;
    public int f50227b0;
    public final int f50228c;
    public int f50229c0;
    public final t1 d;
    public String f50230e;
    public String f50231f;
    public String h;
    public nz0 f50232n;
    public nz0 f50233r;
    public nz0 f50234s;
    public nz0 v;
    public final RadialProgress2 f50236x;
    public final boolean f50237y;
    public final Paint f50235w = new Paint(1);
    public int V = 0;
    public int Y = 255;

    public g(int i9, t1 t1Var, b6 b6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        this.f50226b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.f50228c = i9;
        this.f50237y = z10;
        this.f50236x = new RadialProgress2(t1Var, b6Var);
        this.d = t1Var;
        ln0 ln0Var = new ln0(t1Var);
        this.G = ln0Var;
        ln0Var.h = this;
        this.f50224a = new td.a(t1Var, sd.a.f47511a, 180L);
        this.Z = DownloadController.getInstance(i9).generateObserverTag();
    }

    public final void a() {
        this.f50226b.onAttachedToWindow();
        this.f50236x.e();
    }

    @Override
    public final void b(float f10) {
        if (i()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f10);
            n(true);
        }
    }

    public final void c(boolean z10) {
        int i9;
        int i10;
        nz0 nz0Var = this.f50232n;
        if (nz0Var != null) {
            if (z10) {
                i10 = f6.Fb;
            } else {
                i10 = f6.Dd;
            }
            nz0Var.o(f6.w0(null, i10, false));
        }
        this.f50235w.setColor(1711276032);
        nz0 nz0Var2 = this.v;
        if (nz0Var2 != null) {
            nz0Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.J;
        if (svgDrawable != null) {
            if (z10) {
                i9 = f6.Pb;
            } else {
                i9 = f6.f23237qe;
            }
            svgDrawable.setColorKey(i9);
        }
        boolean z11 = this.T;
        RadialProgress2 radialProgress2 = this.f50236x;
        if (!z11 && !this.S) {
            radialProgress2.g(f6.f23152le, f6.f23169me, f6.f23186ne, f6.oe);
            return;
        }
        ln0 ln0Var = this.G;
        if (z10) {
            int w02 = f6.w0(null, f6.f23338wb, false);
            int w03 = f6.w0(null, f6.f23356xb, false);
            int i11 = f6.f23391zb;
            ln0Var.h(w02, w03, f6.w0(null, i11, false), f6.w0(null, i11, false), f6.w0(null, f6.f23374yb, false));
            radialProgress2.g(f6.Nb, f6.Ob, f6.Pa, f6.Qa);
            return;
        }
        radialProgress2.g(f6.f23099ie, f6.f23116je, f6.f23309uc, f6.f23323vc);
        int w04 = f6.w0(null, f6.f23310ud, false);
        int w05 = f6.w0(null, f6.vd, false);
        int i12 = f6.f23358xd;
        ln0Var.h(w04, w05, f6.w0(null, i12, false), f6.w0(null, i12, false), f6.w0(null, f6.f23340wd, false));
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
        int dp;
        int dp2;
        int i9;
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.Y != 0 && !bounds.isEmpty()) {
            int i10 = 0;
            f(false);
            boolean z10 = this.S;
            int i11 = 2;
            RadialProgress2 radialProgress2 = this.f50236x;
            if (!z10 && !this.T) {
                ImageReceiver imageReceiver = this.f50226b;
                imageReceiver.setAlpha(this.Y / 255.0f);
                imageReceiver.setImageCoords(bounds);
                imageReceiver.draw(canvas);
                if (this.U && (drawable = this.L) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.L.getIntrinsicHeight() * 0.8f);
                    int A = (int) e2.c.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - gr.f28848k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                    this.L.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                    this.L.setBounds(A, imageHeight, intrinsicWidth + A, intrinsicHeight + imageHeight);
                    this.L.draw(canvas);
                }
                radialProgress2.q(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
                if (this.C && this.v != null) {
                    canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.f31223c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.f50235w);
                    this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
                }
            } else {
                int i12 = bounds.left;
                boolean z11 = this.f50237y;
                if (z11) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                int i13 = i12 + dp;
                int i14 = bounds.top;
                if (z11) {
                    dp2 = 0;
                } else {
                    dp2 = AndroidUtilities.dp(3.0f);
                }
                int i15 = i14 + dp2;
                if (!this.T) {
                    i10 = AndroidUtilities.dp(3.0f);
                }
                nz0 nz0Var = this.f50232n;
                if (nz0Var != null) {
                    nz0Var.e(canvas, AndroidUtilities.dp(56.0f) + i13, AndroidUtilities.dp(15.0f) + i15 + i10);
                }
                if (this.T) {
                    float f10 = this.f50224a.f47775e;
                    if (this.f50233r != null && f10 < 1.0f) {
                        canvas.save();
                        float f11 = 1.0f - f10;
                        int i16 = i15 + i10;
                        canvas.scale(f11, f11, AndroidUtilities.dp(56.0f) + i13, AndroidUtilities.dp(35.0f) + i16);
                        this.f50233r.f31221a.setAlpha((int) (f11 * 255.0f));
                        this.f50233r.e(canvas, AndroidUtilities.dp(56.0f) + i13, AndroidUtilities.dp(35.0f) + i16);
                        canvas.restore();
                    }
                    if (f10 > 0.0f) {
                        ln0 ln0Var = this.G;
                        ln0Var.f30504t = f10;
                        ln0Var.j(ll.w(56.0f, i13, bounds.right), AndroidUtilities.dp(30.0f));
                        canvas.save();
                        float dp3 = AndroidUtilities.dp(45.0f) + i13;
                        this.H = dp3;
                        float dp4 = AndroidUtilities.dp(21.0f) + i15 + i10;
                        this.I = dp4;
                        canvas.translate(dp3, dp4);
                        ln0Var.b(canvas);
                        canvas.restore();
                    }
                }
                nz0 nz0Var2 = this.f50234s;
                if (nz0Var2 != null) {
                    float dp5 = AndroidUtilities.dp(56.0f) + i13;
                    int i17 = i10 + i15;
                    if (this.T) {
                        i9 = 20;
                    } else {
                        i9 = 2;
                    }
                    nz0Var2.e(canvas, dp5, AndroidUtilities.dp(i9 + 34) + i17);
                }
                int dp6 = AndroidUtilities.dp(2.0f) + i13;
                this.W = dp6;
                int dp7 = AndroidUtilities.dp(5.0f) + i15;
                this.X = dp7;
                radialProgress2.q(dp6, dp7, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(2.0f) + i13, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(5.0f) + i15);
            }
            if (!this.U) {
                MessageObject messageObject = this.D;
                if (messageObject != null && messageObject.isSending()) {
                    if (ImageLoader.getInstance().getFileProgressSizes(this.B) == null) {
                        radialProgress2.o(1.0f, true);
                        if (this.T) {
                            l(6, true);
                        } else {
                            k(6);
                        }
                    }
                } else {
                    a aVar = this.M;
                    if (aVar != null && aVar.f50204g) {
                        if (this.T) {
                            l(3, true);
                        } else {
                            k(3);
                        }
                    } else if (this.T) {
                        if (aVar != null && aVar.f50203f) {
                            i11 = 4;
                        }
                        l(i11, true);
                    } else {
                        k(g());
                    }
                }
                if (this.T) {
                    k(g());
                }
                radialProgress2.draw(canvas);
            }
        }
    }

    @Override
    public final void e(float f10) {
        if (i()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f10;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * f10);
            n(true);
        }
    }

    public final void f(boolean z10) {
        float f10;
        int width = getBounds().width();
        if (this.f50237y) {
            f10 = 64.0f;
        } else {
            f10 = 72.0f;
        }
        int dp = width - AndroidUtilities.dp(f10);
        if (this.V != dp || z10) {
            this.V = dp;
            String str = this.f50230e;
            if (str != null) {
                if (this.f50232n == null) {
                    this.f50232n = new nz0(str, 15.0f, AndroidUtilities.bold());
                }
                nz0 nz0Var = this.f50232n;
                nz0Var.r(TextUtils.ellipsize(this.f50230e, nz0Var.f31221a, dp, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f50231f;
            if (str2 != null) {
                if (this.f50233r == null) {
                    this.f50233r = new nz0(str2, 14.0f, null);
                }
                nz0 nz0Var2 = this.f50233r;
                nz0Var2.r(TextUtils.ellipsize(this.f50231f, nz0Var2.f31221a, dp, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f50234s == null) {
                    this.f50234s = new nz0(str3, 12.0f, null);
                }
                nz0 nz0Var3 = this.f50234s;
                nz0Var3.r(TextUtils.ellipsize(this.h, nz0Var3.f31221a, dp, TextUtils.TruncateAt.END));
            }
            if (this.C && this.v == null) {
                this.v = new nz0(AndroidUtilities.formatLongDuration(this.F), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.T;
        if (z10 && this.f50224a.f47776f) {
            return !MediaController.getInstance().isMessagePaused();
        }
        if (!this.C && !z10) {
            if (this.S) {
                a aVar = this.M;
                if (aVar != null && aVar.f50203f) {
                    return 5;
                }
                return 2;
            }
            return 4;
        }
        return 0;
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

    public final int h(int i9) {
        int i10;
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
        int round = Math.round((i9 / i11) * this.R);
        if (this.f50237y) {
            i10 = (i9 * 4) / 5;
        } else {
            i10 = (i9 * 5) / 4;
        }
        return Math.min(round, i10);
    }

    public final boolean i() {
        if (this.T && MediaController.getInstance().isPlayingMessage(this.D) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.f50237y) {
            return true;
        }
        return false;
    }

    public final boolean j(float f10, float f11, int i9) {
        if (!this.T || this.f50227b0 == 4) {
            return false;
        }
        if (i9 == 0) {
            int dp = AndroidUtilities.dp(36.0f);
            int dp2 = AndroidUtilities.dp(27.0f);
            int i10 = this.W + dp2;
            if (f10 >= i10 && f10 <= i10 + dp) {
                int i11 = this.X + dp2;
                if (f11 >= i11 && f11 <= i11 + dp) {
                    this.N = true;
                    return true;
                }
            }
        }
        boolean z10 = this.N;
        if (z10) {
            if (i9 == 1) {
                a aVar = this.M;
                if (aVar != null) {
                    TLRPC.Document document = aVar.f50200b;
                    int i12 = aVar.f50199a;
                    if (aVar.f50204g) {
                        FileLoader.getInstance(i12).cancelLoadFile(document);
                        aVar.a();
                    } else if (!aVar.f50203f) {
                        FileLoader.getInstance(i12).loadFile(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    d();
                }
                this.N = false;
                return true;
            } else if (i9 == 3) {
                this.N = false;
                return true;
            }
        }
        return z10;
    }

    public final void k(int i9) {
        if (this.f50225a0 != i9) {
            this.f50225a0 = i9;
            this.f50236x.setIcon(i9, true, true);
        }
    }

    public final void l(int i9, boolean z10) {
        if (this.f50227b0 != i9) {
            this.f50227b0 = i9;
            this.f50236x.k(i9, true, z10);
        }
    }

    public final void m(org.telegram.messenger.MessageObject r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.MessageObject r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: yg.g.m(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, int, java.lang.String, boolean):void");
    }

    public final void n(boolean z10) {
        int i9;
        if (this.T && this.D != null) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            boolean i10 = i();
            this.f50224a.a(i10, z10);
            if (playingMessageObject != null && i10) {
                i9 = playingMessageObject.audioProgressSec;
                ln0 ln0Var = this.G;
                if (!ln0Var.f30490e) {
                    ln0Var.i(playingMessageObject.audioProgress);
                    ln0Var.f30501q = playingMessageObject.bufferedProgress;
                }
                ln0Var.k(playingMessageObject);
            } else {
                i9 = 0;
            }
            if (this.f50229c0 != i9) {
                this.f50229c0 = i9;
                this.h = AndroidUtilities.formatShortDuration(i9, (int) this.E);
                f(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        d();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f50236x.o(min, true);
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        int i9 = 3;
        if (this.T) {
            if (min >= 1.0f) {
                i9 = 4;
            }
            l(i9, true);
        } else {
            if (min >= 1.0f) {
                i9 = g();
            }
            k(i9);
        }
        this.d.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f50236x.o(min, true);
        a aVar = this.M;
        if (aVar != null) {
            aVar.a();
        }
        int i9 = 3;
        if (this.T) {
            if (min >= 1.0f) {
                i9 = 4;
            }
            l(i9, true);
        } else {
            if (min >= 1.0f) {
                i9 = g();
            }
            k(i9);
        }
        this.d.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
        d();
    }

    @Override
    public final void setAlpha(int i9) {
        this.Y = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
