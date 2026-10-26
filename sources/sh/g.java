package sh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import c3.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.ip0;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.qq;
public final class g extends Drawable implements DownloadController.FileDownloadProgressListener, hp0 {
    public String E;
    public String F;
    public boolean G;
    public MessageObject H;
    public double I;
    public int J;
    public final ip0 K;
    public float L;
    public float M;
    public SvgHelper.SvgDrawable N;
    public qq O;
    public Drawable P;
    public a Q;
    public boolean R;
    public boolean S;
    public TLRPC.MessageMedia T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final oe.b f48633a;
    public int f48634a0;
    public final ImageReceiver f48635b;
    public int f48636b0;
    public final int f48637c;
    public final s1 d;
    public final int f48639d0;
    public String e;
    public int f48640e0;
    public String f48641f;
    public int f48642f0;
    public int f48643g0;
    public String h;
    public q11 f48644n;
    public q11 f48645r;
    public q11 f48646s;
    public q11 v;
    public final RadialProgress2 f48648x;
    public final boolean f48649y;
    public final Paint f48647w = new Paint(1);
    public int Z = 0;
    public int f48638c0 = 255;

    public g(int i10, s1 s1Var, u6 u6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.f48635b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.f48637c = i10;
        this.f48649y = z10;
        this.f48648x = new RadialProgress2(s1Var, u6Var);
        this.d = s1Var;
        ip0 ip0Var = new ip0(s1Var);
        this.K = ip0Var;
        ip0Var.h = this;
        this.f48633a = new oe.b(s1Var, ne.a.f18779a, 180L);
        this.f48639d0 = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a() {
        this.f48635b.onAttachedToWindow();
        this.f48648x.e();
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        q11 q11Var = this.f48644n;
        if (q11Var != null) {
            if (z10) {
                i11 = y6.Fb;
            } else {
                i11 = y6.Dd;
            }
            q11Var.o(y6.x0(null, i11, false));
        }
        this.f48647w.setColor(1711276032);
        q11 q11Var2 = this.v;
        if (q11Var2 != null) {
            q11Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.N;
        if (svgDrawable != null) {
            if (z10) {
                i10 = y6.Pb;
            } else {
                i10 = y6.qe;
            }
            svgDrawable.setColorKey(i10);
        }
        boolean z11 = this.X;
        RadialProgress2 radialProgress2 = this.f48648x;
        if (!z11 && !this.W) {
            radialProgress2.g(y6.f23510le, y6.f23528me, y6.f23548ne, y6.f23568oe);
            return;
        }
        ip0 ip0Var = this.K;
        if (z10) {
            int x02 = y6.x0(null, y6.f23716wb, false);
            int x03 = y6.x0(null, y6.f23735xb, false);
            int i12 = y6.f23772zb;
            ip0Var.h(x02, x03, y6.x0(null, i12, false), y6.x0(null, i12, false), y6.x0(null, y6.f23753yb, false));
            radialProgress2.g(y6.Nb, y6.Ob, y6.Pa, y6.Qa);
            return;
        }
        radialProgress2.g(y6.ie, y6.f23472je, y6.f23679uc, y6.f23697vc);
        int x04 = y6.x0(null, y6.f23680ud, false);
        int x05 = y6.x0(null, y6.f23698vd, false);
        int i13 = y6.f23737xd;
        ip0Var.h(x04, x05, y6.x0(null, i13, false), y6.x0(null, i13, false), y6.x0(null, y6.f23718wd, false));
    }

    @Override
    public final void c(float f7) {
        if (i()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
            n(true);
        }
    }

    public final void d() {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int dp2;
        int i10;
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.f48638c0 != 0 && !bounds.isEmpty()) {
            int i11 = 0;
            e(false);
            boolean z10 = this.W;
            int i12 = 2;
            RadialProgress2 radialProgress2 = this.f48648x;
            if (!z10 && !this.X) {
                ImageReceiver imageReceiver = this.f48635b;
                imageReceiver.setAlpha(this.f48638c0 / 255.0f);
                imageReceiver.setImageCoords(bounds);
                imageReceiver.draw(canvas);
                if (this.Y && (drawable = this.P) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.P.getIntrinsicHeight() * 0.8f);
                    int B = (int) h0.B(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - ds.f27590k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                    this.P.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                    this.P.setBounds(B, imageHeight, intrinsicWidth + B, intrinsicHeight + imageHeight);
                    this.P.draw(canvas);
                }
                radialProgress2.r(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
                if (this.G && this.v != null) {
                    canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.f31790c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.f48647w);
                    this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
                }
            } else {
                int i13 = bounds.left;
                boolean z11 = this.f48649y;
                if (z11) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                int i14 = i13 + dp;
                int i15 = bounds.top;
                if (z11) {
                    dp2 = 0;
                } else {
                    dp2 = AndroidUtilities.dp(3.0f);
                }
                int i16 = i15 + dp2;
                if (!this.X) {
                    i11 = AndroidUtilities.dp(3.0f);
                }
                q11 q11Var = this.f48644n;
                if (q11Var != null) {
                    q11Var.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(15.0f) + i16 + i11);
                }
                if (this.X) {
                    float f7 = this.f48633a.e;
                    if (this.f48645r != null && f7 < 1.0f) {
                        canvas.save();
                        float f10 = 1.0f - f7;
                        int i17 = i16 + i11;
                        canvas.scale(f10, f10, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        this.f48645r.f31788a.setAlpha((int) (f10 * 255.0f));
                        this.f48645r.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        canvas.restore();
                    }
                    if (f7 > 0.0f) {
                        ip0 ip0Var = this.K;
                        ip0Var.f29346t = f7;
                        ip0Var.j(vh.z(56.0f, i14, bounds.right), AndroidUtilities.dp(30.0f));
                        canvas.save();
                        float dp3 = AndroidUtilities.dp(45.0f) + i14;
                        this.L = dp3;
                        float dp4 = AndroidUtilities.dp(21.0f) + i16 + i11;
                        this.M = dp4;
                        canvas.translate(dp3, dp4);
                        ip0Var.b(canvas);
                        canvas.restore();
                    }
                }
                q11 q11Var2 = this.f48646s;
                if (q11Var2 != null) {
                    float dp5 = AndroidUtilities.dp(56.0f) + i14;
                    int i18 = i11 + i16;
                    if (this.X) {
                        i10 = 20;
                    } else {
                        i10 = 2;
                    }
                    q11Var2.e(canvas, dp5, AndroidUtilities.dp(i10 + 34) + i18);
                }
                int dp6 = AndroidUtilities.dp(2.0f) + i14;
                this.f48634a0 = dp6;
                int dp7 = AndroidUtilities.dp(5.0f) + i16;
                this.f48636b0 = dp7;
                radialProgress2.r(dp6, dp7, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(2.0f) + i14, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(5.0f) + i16);
            }
            if (!this.Y) {
                MessageObject messageObject = this.H;
                if (messageObject != null && messageObject.isSending()) {
                    if (ImageLoader.getInstance().getFileProgressSizes(this.F) == null) {
                        radialProgress2.p(1.0f, true);
                        if (this.X) {
                            l(6, true);
                        } else {
                            k(6);
                        }
                    }
                } else {
                    a aVar = this.Q;
                    if (aVar != null && aVar.f48614g) {
                        if (this.X) {
                            l(3, true);
                        } else {
                            k(3);
                        }
                    } else if (this.X) {
                        if (aVar != null && aVar.f48613f) {
                            i12 = 4;
                        }
                        l(i12, true);
                    } else {
                        k(g());
                    }
                }
                if (this.X) {
                    k(g());
                }
                radialProgress2.draw(canvas);
            }
        }
    }

    public final void e(boolean z10) {
        float f7;
        int width = getBounds().width();
        if (this.f48649y) {
            f7 = 64.0f;
        } else {
            f7 = 72.0f;
        }
        int dp = width - AndroidUtilities.dp(f7);
        if (this.Z != dp || z10) {
            this.Z = dp;
            String str = this.e;
            if (str != null) {
                if (this.f48644n == null) {
                    this.f48644n = new q11(str, 15.0f, AndroidUtilities.bold());
                }
                q11 q11Var = this.f48644n;
                q11Var.r(TextUtils.ellipsize(this.e, q11Var.f31788a, dp, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f48641f;
            if (str2 != null) {
                if (this.f48645r == null) {
                    this.f48645r = new q11(str2, 14.0f, null);
                }
                q11 q11Var2 = this.f48645r;
                q11Var2.r(TextUtils.ellipsize(this.f48641f, q11Var2.f31788a, dp, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f48646s == null) {
                    this.f48646s = new q11(str3, 12.0f, null);
                }
                q11 q11Var3 = this.f48646s;
                q11Var3.r(TextUtils.ellipsize(this.h, q11Var3.f31788a, dp, TextUtils.TruncateAt.END));
            }
            if (this.G && this.v == null) {
                this.v = new q11(AndroidUtilities.formatLongDuration(this.J), 12.0f, null);
            }
        }
    }

    @Override
    public final void f(float f7) {
        if (i()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f7;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * f7);
            n(true);
        }
    }

    public final int g() {
        boolean z10 = this.X;
        if (z10 && this.f48633a.f19327f) {
            return !MediaController.getInstance().isMessagePaused();
        }
        if (!this.G && !z10) {
            if (this.W) {
                a aVar = this.Q;
                if (aVar != null && aVar.f48613f) {
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
        return this.f48638c0;
    }

    @Override
    public final int getObserverTag() {
        return this.f48639d0;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i10) {
        int i11;
        if (this.X) {
            return AndroidUtilities.dp(63.0f);
        }
        if (this.W) {
            return AndroidUtilities.dp(56.0f);
        }
        int i12 = this.U;
        if (i12 == 0) {
            return AndroidUtilities.dp(100.0f);
        }
        int round = Math.round((i10 / i12) * this.V);
        if (this.f48649y) {
            i11 = (i10 * 4) / 5;
        } else {
            i11 = (i10 * 5) / 4;
        }
        return Math.min(round, i11);
    }

    public final boolean i() {
        if (this.X && MediaController.getInstance().isPlayingMessage(this.H) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.f48649y) {
            return true;
        }
        return false;
    }

    public final boolean j(float f7, float f10, int i10) {
        if (!this.X || this.f48642f0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(36.0f);
            int dp2 = AndroidUtilities.dp(27.0f);
            int i11 = this.f48634a0 + dp2;
            if (f7 >= i11 && f7 <= i11 + dp) {
                int i12 = this.f48636b0 + dp2;
                if (f10 >= i12 && f10 <= i12 + dp) {
                    this.R = true;
                    return true;
                }
            }
        }
        boolean z10 = this.R;
        if (z10) {
            if (i10 == 1) {
                a aVar = this.Q;
                if (aVar != null) {
                    TLRPC.Document document = aVar.f48611b;
                    int i13 = aVar.f48610a;
                    if (aVar.f48614g) {
                        FileLoader.getInstance(i13).cancelLoadFile(document);
                        aVar.a();
                    } else if (!aVar.f48613f) {
                        FileLoader.getInstance(i13).loadFile(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    d();
                }
                this.R = false;
                return true;
            } else if (i10 == 3) {
                this.R = false;
                return true;
            }
        }
        return z10;
    }

    public final void k(int i10) {
        if (this.f48640e0 != i10) {
            this.f48640e0 = i10;
            this.f48648x.setIcon(i10, true, true);
        }
    }

    public final void l(int i10, boolean z10) {
        if (this.f48642f0 != i10) {
            this.f48642f0 = i10;
            this.f48648x.k(i10, true, z10);
        }
    }

    public final void m(org.telegram.messenger.MessageObject r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.MessageObject r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: sh.g.m(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, int, java.lang.String, boolean):void");
    }

    public final void n(boolean z10) {
        int i10;
        if (this.X && this.H != null) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            boolean i11 = i();
            this.f48633a.a(i11, z10);
            if (playingMessageObject != null && i11) {
                i10 = playingMessageObject.audioProgressSec;
                ip0 ip0Var = this.K;
                if (!ip0Var.e) {
                    ip0Var.i(playingMessageObject.audioProgress);
                    ip0Var.f29343q = playingMessageObject.bufferedProgress;
                }
                ip0Var.k(playingMessageObject);
            } else {
                i10 = 0;
            }
            if (this.f48643g0 != i10) {
                this.f48643g0 = i10;
                this.h = AndroidUtilities.formatShortDuration(i10, (int) this.I);
                e(true);
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
        this.f48648x.p(min, true);
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        int i10 = 3;
        if (this.X) {
            if (min >= 1.0f) {
                i10 = 4;
            }
            l(i10, true);
        } else {
            if (min >= 1.0f) {
                i10 = g();
            }
            k(i10);
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
        this.f48648x.p(min, true);
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        int i10 = 3;
        if (this.X) {
            if (min >= 1.0f) {
                i10 = 4;
            }
            l(i10, true);
        } else {
            if (min >= 1.0f) {
                i10 = g();
            }
            k(i10);
        }
        this.d.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
        d();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f48638c0 = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
