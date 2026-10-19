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
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.Components.yo0;
public final class g extends Drawable implements DownloadController.FileDownloadProgressListener, xo0 {
    public String E;
    public String F;
    public boolean G;
    public MessageObject H;
    public double I;
    public int J;
    public final yo0 K;
    public float L;
    public float M;
    public SvgHelper.SvgDrawable N;
    public oq O;
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
    public final ne.b f45749a;
    public int f45750a0;
    public final ImageReceiver f45751b;
    public int f45752b0;
    public final int f45753c;
    public final u1 d;
    public final int f45755d0;
    public String e;
    public int f45756e0;
    public String f45757f;
    public int f45758f0;
    public int f45759g0;
    public String h;
    public e11 f45760n;
    public e11 f45761r;
    public e11 f45762s;
    public e11 v;
    public final RadialProgress2 f45764x;
    public final boolean f45765y;
    public final Paint f45763w = new Paint(1);
    public int Z = 0;
    public int f45754c0 = 255;

    public g(int i10, u1 u1Var, d6 d6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(u1Var);
        this.f45751b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.f45753c = i10;
        this.f45765y = z10;
        this.f45764x = new RadialProgress2(u1Var, d6Var);
        this.d = u1Var;
        yo0 yo0Var = new yo0(u1Var);
        this.K = yo0Var;
        yo0Var.h = this;
        this.f45749a = new ne.b(u1Var, me.a.f16853a, 180L);
        this.f45755d0 = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a() {
        this.f45751b.onAttachedToWindow();
        this.f45764x.e();
    }

    @Override
    public final void b(float f7) {
        if (i()) {
            MediaController.getInstance().seekToProgress(MediaController.getInstance().getPlayingMessageObject(), f7);
            n(true);
        }
    }

    @Override
    public final void c(float f7) {
        if (i()) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            playingMessageObject.audioProgress = f7;
            playingMessageObject.audioProgressSec = (int) (playingMessageObject.getDuration() * f7);
            n(true);
        }
    }

    public final void d(boolean z10) {
        int i10;
        int i11;
        e11 e11Var = this.f45760n;
        if (e11Var != null) {
            if (z10) {
                i11 = h6.Fb;
            } else {
                i11 = h6.Dd;
            }
            e11Var.o(h6.x0(null, i11, false));
        }
        this.f45763w.setColor(1711276032);
        e11 e11Var2 = this.v;
        if (e11Var2 != null) {
            e11Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.N;
        if (svgDrawable != null) {
            if (z10) {
                i10 = h6.Pb;
            } else {
                i10 = h6.f21232qe;
            }
            svgDrawable.setColorKey(i10);
        }
        boolean z11 = this.X;
        RadialProgress2 radialProgress2 = this.f45764x;
        if (!z11 && !this.W) {
            radialProgress2.g(h6.f21139le, h6.f21158me, h6.f21178ne, h6.f21196oe);
            return;
        }
        yo0 yo0Var = this.K;
        if (z10) {
            int x02 = h6.x0(null, h6.f21343wb, false);
            int x03 = h6.x0(null, h6.f21362xb, false);
            int i12 = h6.f21397zb;
            yo0Var.h(x02, x03, h6.x0(null, i12, false), h6.x0(null, i12, false), h6.x0(null, h6.f21380yb, false));
            radialProgress2.g(h6.Nb, h6.Ob, h6.Pa, h6.Qa);
            return;
        }
        radialProgress2.g(h6.f21083ie, h6.f21102je, h6.f21308uc, h6.f21326vc);
        int x04 = h6.x0(null, h6.f21309ud, false);
        int x05 = h6.x0(null, h6.f21327vd, false);
        int i13 = h6.f21364xd;
        yo0Var.h(x04, x05, h6.x0(null, i13, false), h6.x0(null, i13, false), h6.x0(null, h6.f21345wd, false));
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int dp2;
        int i10;
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.f45754c0 != 0 && !bounds.isEmpty()) {
            int i11 = 0;
            f(false);
            boolean z10 = this.W;
            int i12 = 2;
            RadialProgress2 radialProgress2 = this.f45764x;
            if (!z10 && !this.X) {
                ImageReceiver imageReceiver = this.f45751b;
                imageReceiver.setAlpha(this.f45754c0 / 255.0f);
                imageReceiver.setImageCoords(bounds);
                imageReceiver.draw(canvas);
                if (this.Y && (drawable = this.P) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.P.getIntrinsicHeight() * 0.8f);
                    int z11 = (int) k3.z(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - bs.f25016k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                    this.P.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                    this.P.setBounds(z11, imageHeight, intrinsicWidth + z11, intrinsicHeight + imageHeight);
                    this.P.draw(canvas);
                }
                radialProgress2.q(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
                if (this.G && this.v != null) {
                    canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.f25728c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.f45763w);
                    this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
                }
            } else {
                int i13 = bounds.left;
                boolean z12 = this.f45765y;
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
                e11 e11Var = this.f45760n;
                if (e11Var != null) {
                    e11Var.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(15.0f) + i16 + i11);
                }
                if (this.X) {
                    float f7 = this.f45749a.e;
                    if (this.f45761r != null && f7 < 1.0f) {
                        canvas.save();
                        float f10 = 1.0f - f7;
                        int i17 = i16 + i11;
                        canvas.scale(f10, f10, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        this.f45761r.f25726a.setAlpha((int) (f10 * 255.0f));
                        this.f45761r.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        canvas.restore();
                    }
                    if (f7 > 0.0f) {
                        yo0 yo0Var = this.K;
                        yo0Var.f32722t = f7;
                        yo0Var.j(kk.y(56.0f, i14, bounds.right), AndroidUtilities.dp(30.0f));
                        canvas.save();
                        float dp3 = AndroidUtilities.dp(45.0f) + i14;
                        this.L = dp3;
                        float dp4 = AndroidUtilities.dp(21.0f) + i16 + i11;
                        this.M = dp4;
                        canvas.translate(dp3, dp4);
                        yo0Var.b(canvas);
                        canvas.restore();
                    }
                }
                e11 e11Var2 = this.f45762s;
                if (e11Var2 != null) {
                    float dp5 = AndroidUtilities.dp(56.0f) + i14;
                    int i18 = i11 + i16;
                    if (this.X) {
                        i10 = 20;
                    } else {
                        i10 = 2;
                    }
                    e11Var2.e(canvas, dp5, AndroidUtilities.dp(i10 + 34) + i18);
                }
                int dp6 = AndroidUtilities.dp(2.0f) + i14;
                this.f45750a0 = dp6;
                int dp7 = AndroidUtilities.dp(5.0f) + i16;
                this.f45752b0 = dp7;
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
                    if (aVar != null && aVar.f45730g) {
                        if (this.X) {
                            l(3, true);
                        } else {
                            k(3);
                        }
                    } else if (this.X) {
                        if (aVar != null && aVar.f45729f) {
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
        if (this.f45765y) {
            f7 = 64.0f;
        } else {
            f7 = 72.0f;
        }
        int dp = width - AndroidUtilities.dp(f7);
        if (this.Z != dp || z10) {
            this.Z = dp;
            String str = this.e;
            if (str != null) {
                if (this.f45760n == null) {
                    this.f45760n = new e11(str, 15.0f, AndroidUtilities.bold());
                }
                e11 e11Var = this.f45760n;
                e11Var.r(TextUtils.ellipsize(this.e, e11Var.f25726a, dp, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f45757f;
            if (str2 != null) {
                if (this.f45761r == null) {
                    this.f45761r = new e11(str2, 14.0f, null);
                }
                e11 e11Var2 = this.f45761r;
                e11Var2.r(TextUtils.ellipsize(this.f45757f, e11Var2.f25726a, dp, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f45762s == null) {
                    this.f45762s = new e11(str3, 12.0f, null);
                }
                e11 e11Var3 = this.f45762s;
                e11Var3.r(TextUtils.ellipsize(this.h, e11Var3.f25726a, dp, TextUtils.TruncateAt.END));
            }
            if (this.G && this.v == null) {
                this.v = new e11(AndroidUtilities.formatLongDuration(this.J), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.X;
        if (z10 && this.f45749a.f17384f) {
            return !MediaController.getInstance().isMessagePaused();
        }
        if (!this.G && !z10) {
            if (this.W) {
                a aVar = this.Q;
                if (aVar != null && aVar.f45729f) {
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
        return this.f45754c0;
    }

    @Override
    public final int getObserverTag() {
        return this.f45755d0;
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
        if (this.f45765y) {
            i11 = (i10 * 4) / 5;
        } else {
            i11 = (i10 * 5) / 4;
        }
        return Math.min(round, i11);
    }

    public final boolean i() {
        if (this.X && MediaController.getInstance().isPlayingMessage(this.H) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.f45765y) {
            return true;
        }
        return false;
    }

    public final boolean j(float f7, float f10, int i10) {
        if (!this.X || this.f45758f0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(36.0f);
            int dp2 = AndroidUtilities.dp(27.0f);
            int i11 = this.f45750a0 + dp2;
            if (f7 >= i11 && f7 <= i11 + dp) {
                int i12 = this.f45752b0 + dp2;
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
                    TLRPC.Document document = aVar.f45727b;
                    int i13 = aVar.f45726a;
                    if (aVar.f45730g) {
                        FileLoader.getInstance(i13).cancelLoadFile(document);
                        aVar.a();
                    } else if (!aVar.f45729f) {
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
        if (this.f45756e0 != i10) {
            this.f45756e0 = i10;
            this.f45764x.setIcon(i10, true, true);
        }
    }

    public final void l(int i10, boolean z10) {
        if (this.f45758f0 != i10) {
            this.f45758f0 = i10;
            this.f45764x.k(i10, true, z10);
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
            this.f45749a.a(i11, z10);
            if (playingMessageObject != null && i11) {
                i10 = playingMessageObject.audioProgressSec;
                yo0 yo0Var = this.K;
                if (!yo0Var.e) {
                    yo0Var.i(playingMessageObject.audioProgress);
                    yo0Var.f32719q = playingMessageObject.bufferedProgress;
                }
                yo0Var.k(playingMessageObject);
            } else {
                i10 = 0;
            }
            if (this.f45759g0 != i10) {
                this.f45759g0 = i10;
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
        this.f45764x.o(min, true);
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
        this.f45764x.o(min, true);
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
        this.f45754c0 = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
