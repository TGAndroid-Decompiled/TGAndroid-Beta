package qh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u01;
public final class g extends Drawable implements DownloadController.FileDownloadProgressListener, no0 {
    public String E;
    public String F;
    public boolean G;
    public MessageObject H;
    public double I;
    public int J;
    public final oo0 K;
    public float L;
    public float M;
    public SvgHelper.SvgDrawable N;
    public eq O;
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
    public final le.b f42066a;
    public int f42067a0;
    public final ImageReceiver f42068b;
    public int f42069b0;
    public final int f42070c;
    public final u1 d;
    public final int f42072d0;
    public String e;
    public int f42073e0;
    public String f42074f;
    public int f42075f0;
    public int f42076g0;
    public String h;
    public u01 f42077n;
    public u01 f42078r;
    public u01 f42079s;
    public u01 v;
    public final RadialProgress2 f42081x;
    public final boolean f42082y;
    public final Paint f42080w = new Paint(1);
    public int Z = 0;
    public int f42071c0 = 255;

    public g(int i10, u1 u1Var, f6 f6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(u1Var);
        this.f42068b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.f42070c = i10;
        this.f42082y = z10;
        this.f42081x = new RadialProgress2(u1Var, f6Var);
        this.d = u1Var;
        oo0 oo0Var = new oo0(u1Var);
        this.K = oo0Var;
        oo0Var.h = this;
        this.f42066a = new le.b(u1Var, ke.a.f13589a, 180L);
        this.f42072d0 = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a() {
        this.f42068b.onAttachedToWindow();
        this.f42081x.e();
    }

    @Override
    public final void b(float f7) {
        if (i()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
            n(true);
        }
    }

    public final void c(boolean z10) {
        int i10;
        int i11;
        u01 u01Var = this.f42077n;
        if (u01Var != null) {
            if (z10) {
                i11 = j6.Fb;
            } else {
                i11 = j6.Dd;
            }
            u01Var.o(j6.w0(null, i11, false));
        }
        this.f42080w.setColor(1711276032);
        u01 u01Var2 = this.v;
        if (u01Var2 != null) {
            u01Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.N;
        if (svgDrawable != null) {
            if (z10) {
                i10 = j6.Pb;
            } else {
                i10 = j6.f19340qe;
            }
            svgDrawable.setColorKey(i10);
        }
        boolean z11 = this.X;
        RadialProgress2 radialProgress2 = this.f42081x;
        if (!z11 && !this.W) {
            radialProgress2.g(j6.f19248le, j6.f19267me, j6.ne, j6.f19303oe);
            return;
        }
        oo0 oo0Var = this.K;
        if (z10) {
            int w02 = j6.w0(null, j6.f19448wb, false);
            int w03 = j6.w0(null, j6.f19465xb, false);
            int i12 = j6.f19501zb;
            oo0Var.h(w02, w03, j6.w0(null, i12, false), j6.w0(null, i12, false), j6.w0(null, j6.f19482yb, false));
            radialProgress2.g(j6.Nb, j6.Ob, j6.Pa, j6.Qa);
            return;
        }
        radialProgress2.g(j6.f19192ie, j6.f19210je, j6.f19413uc, j6.f19430vc);
        int w04 = j6.w0(null, j6.f19414ud, false);
        int w05 = j6.w0(null, j6.f19431vd, false);
        int i13 = j6.f19466xd;
        oo0Var.h(w04, w05, j6.w0(null, i13, false), j6.w0(null, i13, false), j6.w0(null, j6.f19449wd, false));
    }

    @Override
    public final void d(float f7) {
        if (i()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f7;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * f7);
            n(true);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int dp2;
        int i10;
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.f42071c0 != 0 && !bounds.isEmpty()) {
            int i11 = 0;
            f(false);
            boolean z10 = this.W;
            int i12 = 2;
            RadialProgress2 radialProgress2 = this.f42081x;
            if (!z10 && !this.X) {
                ImageReceiver imageReceiver = this.f42068b;
                imageReceiver.setAlpha(this.f42071c0 / 255.0f);
                imageReceiver.setImageCoords(bounds);
                imageReceiver.draw(canvas);
                if (this.Y && (drawable = this.P) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.P.getIntrinsicHeight() * 0.8f);
                    int A = (int) e2.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - qr.f27646k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                    this.P.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                    this.P.setBounds(A, imageHeight, intrinsicWidth + A, intrinsicHeight + imageHeight);
                    this.P.draw(canvas);
                }
                radialProgress2.q(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
                if (this.G && this.v != null) {
                    canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.f28493c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.f42080w);
                    this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
                }
            } else {
                int i13 = bounds.left;
                boolean z11 = this.f42082y;
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
                u01 u01Var = this.f42077n;
                if (u01Var != null) {
                    u01Var.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(15.0f) + i16 + i11);
                }
                if (this.X) {
                    float f7 = this.f42066a.e;
                    if (this.f42078r != null && f7 < 1.0f) {
                        canvas.save();
                        float f10 = 1.0f - f7;
                        int i17 = i16 + i11;
                        canvas.scale(f10, f10, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        this.f42078r.f28491a.setAlpha((int) (f10 * 255.0f));
                        this.f42078r.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        canvas.restore();
                    }
                    if (f7 > 0.0f) {
                        oo0 oo0Var = this.K;
                        oo0Var.f27021t = f7;
                        oo0Var.j(rk.x(56.0f, i14, bounds.right), AndroidUtilities.dp(30.0f));
                        canvas.save();
                        float dp3 = AndroidUtilities.dp(45.0f) + i14;
                        this.L = dp3;
                        float dp4 = AndroidUtilities.dp(21.0f) + i16 + i11;
                        this.M = dp4;
                        canvas.translate(dp3, dp4);
                        oo0Var.b(canvas);
                        canvas.restore();
                    }
                }
                u01 u01Var2 = this.f42079s;
                if (u01Var2 != null) {
                    float dp5 = AndroidUtilities.dp(56.0f) + i14;
                    int i18 = i11 + i16;
                    if (this.X) {
                        i10 = 20;
                    } else {
                        i10 = 2;
                    }
                    u01Var2.e(canvas, dp5, AndroidUtilities.dp(i10 + 34) + i18);
                }
                int dp6 = AndroidUtilities.dp(2.0f) + i14;
                this.f42067a0 = dp6;
                int dp7 = AndroidUtilities.dp(5.0f) + i16;
                this.f42069b0 = dp7;
                radialProgress2.q(dp6, dp7, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(2.0f) + i14, AndroidUtilities.dp(44.0f) + AndroidUtilities.dp(5.0f) + i16);
            }
            if (!this.Y) {
                MessageObject messageObject = this.H;
                if (messageObject != null && messageObject.isSending()) {
                    if (ImageLoader.getInstance().getFileProgressSizes(this.F) == null) {
                        radialProgress2.o(1.0f, true);
                        if (this.X) {
                            l(6, true);
                        } else {
                            k(6);
                        }
                    }
                } else {
                    a aVar = this.Q;
                    if (aVar != null && aVar.f42047g) {
                        if (this.X) {
                            l(3, true);
                        } else {
                            k(3);
                        }
                    } else if (this.X) {
                        if (aVar != null && aVar.f42046f) {
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
        if (this.f42082y) {
            f7 = 64.0f;
        } else {
            f7 = 72.0f;
        }
        int dp = width - AndroidUtilities.dp(f7);
        if (this.Z != dp || z10) {
            this.Z = dp;
            String str = this.e;
            if (str != null) {
                if (this.f42077n == null) {
                    this.f42077n = new u01(str, 15.0f, AndroidUtilities.bold());
                }
                u01 u01Var = this.f42077n;
                u01Var.r(TextUtils.ellipsize(this.e, u01Var.f28491a, dp, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f42074f;
            if (str2 != null) {
                if (this.f42078r == null) {
                    this.f42078r = new u01(str2, 14.0f, null);
                }
                u01 u01Var2 = this.f42078r;
                u01Var2.r(TextUtils.ellipsize(this.f42074f, u01Var2.f28491a, dp, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f42079s == null) {
                    this.f42079s = new u01(str3, 12.0f, null);
                }
                u01 u01Var3 = this.f42079s;
                u01Var3.r(TextUtils.ellipsize(this.h, u01Var3.f28491a, dp, TextUtils.TruncateAt.END));
            }
            if (this.G && this.v == null) {
                this.v = new u01(AndroidUtilities.formatLongDuration(this.J), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.X;
        if (z10 && this.f42066a.f14170f) {
            return !MediaController.getInstance().isMessagePaused();
        }
        if (!this.G && !z10) {
            if (this.W) {
                a aVar = this.Q;
                if (aVar != null && aVar.f42046f) {
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
        return this.f42071c0;
    }

    @Override
    public final int getObserverTag() {
        return this.f42072d0;
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
        if (this.f42082y) {
            i11 = (i10 * 4) / 5;
        } else {
            i11 = (i10 * 5) / 4;
        }
        return Math.min(round, i11);
    }

    public final boolean i() {
        if (this.X && MediaController.getInstance().isPlayingMessage(this.H) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.f42082y) {
            return true;
        }
        return false;
    }

    public final boolean j(float f7, float f10, int i10) {
        if (!this.X || this.f42075f0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(36.0f);
            int dp2 = AndroidUtilities.dp(27.0f);
            int i11 = this.f42067a0 + dp2;
            if (f7 >= i11 && f7 <= i11 + dp) {
                int i12 = this.f42069b0 + dp2;
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
                    TLRPC.Document document = aVar.f42044b;
                    int i13 = aVar.f42043a;
                    if (aVar.f42047g) {
                        FileLoader.getInstance(i13).cancelLoadFile(document);
                        aVar.a();
                    } else if (!aVar.f42046f) {
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
        if (this.f42073e0 != i10) {
            this.f42073e0 = i10;
            this.f42081x.setIcon(i10, true, true);
        }
    }

    public final void l(int i10, boolean z10) {
        if (this.f42075f0 != i10) {
            this.f42075f0 = i10;
            this.f42081x.k(i10, true, z10);
        }
    }

    public final void m(org.telegram.messenger.MessageObject r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.MessageObject r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: qh.g.m(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, int, java.lang.String, boolean):void");
    }

    public final void n(boolean z10) {
        int i10;
        if (this.X && this.H != null) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            boolean i11 = i();
            this.f42066a.a(i11, z10);
            if (playingMessageObject != null && i11) {
                i10 = playingMessageObject.audioProgressSec;
                oo0 oo0Var = this.K;
                if (!oo0Var.e) {
                    oo0Var.i(playingMessageObject.audioProgress);
                    oo0Var.f27018q = playingMessageObject.bufferedProgress;
                }
                oo0Var.k(playingMessageObject);
            } else {
                i10 = 0;
            }
            if (this.f42076g0 != i10) {
                this.f42076g0 = i10;
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
    public final void onProgressDownload(String str, long j3, long j10) {
        float min;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.f42081x.o(min, true);
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
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
        float min;
        if (j10 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j3) / ((float) j10));
        }
        this.f42081x.o(min, true);
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
        this.f42071c0 = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
