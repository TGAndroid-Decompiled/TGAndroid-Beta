package rh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.tl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.zr;
public final class g extends Drawable implements DownloadController.FileDownloadProgressListener, bp0 {
    public String E;
    public String F;
    public boolean G;
    public MessageObject H;
    public double I;
    public int J;
    public final cp0 K;
    public float L;
    public float M;
    public SvgHelper.SvgDrawable N;
    public mq O;
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
    public final ne.b f46181a;
    public int f46182a0;
    public final ImageReceiver f46183b;
    public int f46184b0;
    public final int f46185c;
    public final t1 d;
    public final int f46187d0;
    public String e;
    public int f46188e0;
    public String f46189f;
    public int f46190f0;
    public int f46191g0;
    public String h;
    public h11 f46192n;
    public h11 f46193r;
    public h11 f46194s;
    public h11 v;
    public final RadialProgress2 f46196x;
    public final boolean f46197y;
    public final Paint f46195w = new Paint(1);
    public int Z = 0;
    public int f46186c0 = 255;

    public g(int i10, t1 t1Var, g6 g6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        this.f46183b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.f46185c = i10;
        this.f46197y = z10;
        this.f46196x = new RadialProgress2(t1Var, g6Var);
        this.d = t1Var;
        cp0 cp0Var = new cp0(t1Var);
        this.K = cp0Var;
        cp0Var.h = this;
        this.f46181a = new ne.b(t1Var, me.a.f16916a, 180L);
        this.f46187d0 = DownloadController.getInstance(i10).generateObserverTag();
    }

    @Override
    public final void a(float f7) {
        if (i()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
            n(true);
        }
    }

    @Override
    public final void b(float f7) {
        if (i()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f7;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * f7);
            n(true);
        }
    }

    public final void c() {
        this.f46183b.onAttachedToWindow();
        this.f46196x.e();
    }

    public final void d(boolean z10) {
        int i10;
        int i11;
        h11 h11Var = this.f46192n;
        if (h11Var != null) {
            if (z10) {
                i11 = k6.Fb;
            } else {
                i11 = k6.Dd;
            }
            h11Var.o(k6.x0(null, i11, false));
        }
        this.f46195w.setColor(1711276032);
        h11 h11Var2 = this.v;
        if (h11Var2 != null) {
            h11Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.N;
        if (svgDrawable != null) {
            if (z10) {
                i10 = k6.Pb;
            } else {
                i10 = k6.f21429qe;
            }
            svgDrawable.setColorKey(i10);
        }
        boolean z11 = this.X;
        RadialProgress2 radialProgress2 = this.f46196x;
        if (!z11 && !this.W) {
            radialProgress2.g(k6.f21336le, k6.f21355me, k6.f21375ne, k6.f21393oe);
            return;
        }
        cp0 cp0Var = this.K;
        if (z10) {
            int x02 = k6.x0(null, k6.f21540wb, false);
            int x03 = k6.x0(null, k6.f21559xb, false);
            int i12 = k6.f21594zb;
            cp0Var.h(x02, x03, k6.x0(null, i12, false), k6.x0(null, i12, false), k6.x0(null, k6.f21577yb, false));
            radialProgress2.g(k6.Nb, k6.Ob, k6.Pa, k6.Qa);
            return;
        }
        radialProgress2.g(k6.f21280ie, k6.f21299je, k6.f21505uc, k6.f21523vc);
        int x04 = k6.x0(null, k6.f21506ud, false);
        int x05 = k6.x0(null, k6.f21524vd, false);
        int i13 = k6.f21561xd;
        cp0Var.h(x04, x05, k6.x0(null, i13, false), k6.x0(null, i13, false), k6.x0(null, k6.f21542wd, false));
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int dp2;
        int i10;
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.f46186c0 != 0 && !bounds.isEmpty()) {
            int i11 = 0;
            f(false);
            boolean z10 = this.W;
            int i12 = 2;
            RadialProgress2 radialProgress2 = this.f46196x;
            if (!z10 && !this.X) {
                ImageReceiver imageReceiver = this.f46183b;
                imageReceiver.setAlpha(this.f46186c0 / 255.0f);
                imageReceiver.setImageCoords(bounds);
                imageReceiver.draw(canvas);
                if (this.Y && (drawable = this.P) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.P.getIntrinsicHeight() * 0.8f);
                    int z11 = (int) k3.z(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - zr.f33341k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                    this.P.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                    this.P.setBounds(z11, imageHeight, intrinsicWidth + z11, intrinsicHeight + imageHeight);
                    this.P.draw(canvas);
                }
                radialProgress2.r(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
                if (this.G && this.v != null) {
                    canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.f26843c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.f46195w);
                    this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
                }
            } else {
                int i13 = bounds.left;
                boolean z12 = this.f46197y;
                if (z12) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(8.0f);
                }
                int i14 = i13 + dp;
                int i15 = bounds.top;
                if (z12) {
                    dp2 = 0;
                } else {
                    dp2 = AndroidUtilities.dp(3.0f);
                }
                int i16 = i15 + dp2;
                if (!this.X) {
                    i11 = AndroidUtilities.dp(3.0f);
                }
                h11 h11Var = this.f46192n;
                if (h11Var != null) {
                    h11Var.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(15.0f) + i16 + i11);
                }
                if (this.X) {
                    float f7 = this.f46181a.e;
                    if (this.f46193r != null && f7 < 1.0f) {
                        canvas.save();
                        float f10 = 1.0f - f7;
                        int i17 = i16 + i11;
                        canvas.scale(f10, f10, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        this.f46193r.f26841a.setAlpha((int) (f10 * 255.0f));
                        this.f46193r.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        canvas.restore();
                    }
                    if (f7 > 0.0f) {
                        cp0 cp0Var = this.K;
                        cp0Var.f25424t = f7;
                        cp0Var.j(tl.y(56.0f, i14, bounds.right), AndroidUtilities.dp(30.0f));
                        canvas.save();
                        float dp3 = AndroidUtilities.dp(45.0f) + i14;
                        this.L = dp3;
                        float dp4 = AndroidUtilities.dp(21.0f) + i16 + i11;
                        this.M = dp4;
                        canvas.translate(dp3, dp4);
                        cp0Var.b(canvas);
                        canvas.restore();
                    }
                }
                h11 h11Var2 = this.f46194s;
                if (h11Var2 != null) {
                    float dp5 = AndroidUtilities.dp(56.0f) + i14;
                    int i18 = i11 + i16;
                    if (this.X) {
                        i10 = 20;
                    } else {
                        i10 = 2;
                    }
                    h11Var2.e(canvas, dp5, AndroidUtilities.dp(i10 + 34) + i18);
                }
                int dp6 = AndroidUtilities.dp(2.0f) + i14;
                this.f46182a0 = dp6;
                int dp7 = AndroidUtilities.dp(5.0f) + i16;
                this.f46184b0 = dp7;
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
                    if (aVar != null && aVar.f46162g) {
                        if (this.X) {
                            l(3, true);
                        } else {
                            k(3);
                        }
                    } else if (this.X) {
                        if (aVar != null && aVar.f46161f) {
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

    public final void e() {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void f(boolean z10) {
        float f7;
        int width = getBounds().width();
        if (this.f46197y) {
            f7 = 64.0f;
        } else {
            f7 = 72.0f;
        }
        int dp = width - AndroidUtilities.dp(f7);
        if (this.Z != dp || z10) {
            this.Z = dp;
            String str = this.e;
            if (str != null) {
                if (this.f46192n == null) {
                    this.f46192n = new h11(str, 15.0f, AndroidUtilities.bold());
                }
                h11 h11Var = this.f46192n;
                h11Var.r(TextUtils.ellipsize(this.e, h11Var.f26841a, dp, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f46189f;
            if (str2 != null) {
                if (this.f46193r == null) {
                    this.f46193r = new h11(str2, 14.0f, null);
                }
                h11 h11Var2 = this.f46193r;
                h11Var2.r(TextUtils.ellipsize(this.f46189f, h11Var2.f26841a, dp, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f46194s == null) {
                    this.f46194s = new h11(str3, 12.0f, null);
                }
                h11 h11Var3 = this.f46194s;
                h11Var3.r(TextUtils.ellipsize(this.h, h11Var3.f26841a, dp, TextUtils.TruncateAt.END));
            }
            if (this.G && this.v == null) {
                this.v = new h11(AndroidUtilities.formatLongDuration(this.J), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.X;
        if (z10 && this.f46181a.f17447f) {
            return !MediaController.getInstance().isMessagePaused();
        }
        if (!this.G && !z10) {
            if (this.W) {
                a aVar = this.Q;
                if (aVar != null && aVar.f46161f) {
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
        return this.f46186c0;
    }

    @Override
    public final int getObserverTag() {
        return this.f46187d0;
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
        if (this.f46197y) {
            i11 = (i10 * 4) / 5;
        } else {
            i11 = (i10 * 5) / 4;
        }
        return Math.min(round, i11);
    }

    public final boolean i() {
        if (this.X && MediaController.getInstance().isPlayingMessage(this.H) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.f46197y) {
            return true;
        }
        return false;
    }

    public final boolean j(float f7, float f10, int i10) {
        if (!this.X || this.f46190f0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(36.0f);
            int dp2 = AndroidUtilities.dp(27.0f);
            int i11 = this.f46182a0 + dp2;
            if (f7 >= i11 && f7 <= i11 + dp) {
                int i12 = this.f46184b0 + dp2;
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
                    TLRPC.Document document = aVar.f46159b;
                    int i13 = aVar.f46158a;
                    if (aVar.f46162g) {
                        FileLoader.getInstance(i13).cancelLoadFile(document);
                        aVar.a();
                    } else if (!aVar.f46161f) {
                        FileLoader.getInstance(i13).loadFile(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    e();
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
        if (this.f46188e0 != i10) {
            this.f46188e0 = i10;
            this.f46196x.setIcon(i10, true, true);
        }
    }

    public final void l(int i10, boolean z10) {
        if (this.f46190f0 != i10) {
            this.f46190f0 = i10;
            this.f46196x.k(i10, true, z10);
        }
    }

    public final void m(org.telegram.messenger.MessageObject r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.MessageObject r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: rh.g.m(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, int, java.lang.String, boolean):void");
    }

    public final void n(boolean z10) {
        int i10;
        if (this.X && this.H != null) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            boolean i11 = i();
            this.f46181a.a(i11, z10);
            if (playingMessageObject != null && i11) {
                i10 = playingMessageObject.audioProgressSec;
                cp0 cp0Var = this.K;
                if (!cp0Var.e) {
                    cp0Var.i(playingMessageObject.audioProgress);
                    cp0Var.f25421q = playingMessageObject.bufferedProgress;
                }
                cp0Var.k(playingMessageObject);
            } else {
                i10 = 0;
            }
            if (this.f46191g0 != i10) {
                this.f46191g0 = i10;
                this.h = AndroidUtilities.formatShortDuration(i10, (int) this.I);
                f(true);
                this.d.invalidate();
            }
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        e();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float min;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.f46196x.p(min, true);
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
        this.f46196x.p(min, true);
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
        e();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f46186c0 = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
