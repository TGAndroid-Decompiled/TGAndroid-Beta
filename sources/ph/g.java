package ph;

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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.wr;
public final class g extends Drawable implements DownloadController.FileDownloadProgressListener, jo0 {
    public String E;
    public String F;
    public boolean G;
    public MessageObject H;
    public double I;
    public int J;
    public final ko0 K;
    public float L;
    public float M;
    public SvgHelper.SvgDrawable N;
    public kq O;
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
    public final le.b f40410a;
    public int f40411a0;
    public final ImageReceiver f40412b;
    public int f40413b0;
    public final int f40414c;
    public final t1 d;
    public final int f40416d0;
    public String e;
    public int f40417e0;
    public String f40418f;
    public int f40419f0;
    public int f40420g0;
    public String h;
    public t01 f40421n;
    public t01 f40422r;
    public t01 f40423s;
    public t01 v;
    public final RadialProgress2 f40425x;
    public final boolean f40426y;
    public final Paint f40424w = new Paint(1);
    public int Z = 0;
    public int f40415c0 = 255;

    public g(int i10, t1 t1Var, f6 f6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        this.f40412b = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        this.f40414c = i10;
        this.f40426y = z10;
        this.f40425x = new RadialProgress2(t1Var, f6Var);
        this.d = t1Var;
        ko0 ko0Var = new ko0(t1Var);
        this.K = ko0Var;
        ko0Var.h = this;
        this.f40410a = new le.b(t1Var, ke.a.f12431a, 180L);
        this.f40416d0 = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a() {
        this.f40412b.onAttachedToWindow();
        this.f40425x.e();
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
        t01 t01Var = this.f40421n;
        if (t01Var != null) {
            if (z10) {
                i11 = j6.Fb;
            } else {
                i11 = j6.Dd;
            }
            t01Var.o(j6.w0(null, i11, false));
        }
        this.f40424w.setColor(1711276032);
        t01 t01Var2 = this.v;
        if (t01Var2 != null) {
            t01Var2.o(-1);
        }
        SvgHelper.SvgDrawable svgDrawable = this.N;
        if (svgDrawable != null) {
            if (z10) {
                i10 = j6.Pb;
            } else {
                i10 = j6.f18169qe;
            }
            svgDrawable.setColorKey(i10);
        }
        boolean z11 = this.X;
        RadialProgress2 radialProgress2 = this.f40425x;
        if (!z11 && !this.W) {
            radialProgress2.g(j6.f18081le, j6.f18099me, j6.ne, j6.f18133oe);
            return;
        }
        ko0 ko0Var = this.K;
        if (z10) {
            int w02 = j6.w0(null, j6.f18276wb, false);
            int w03 = j6.w0(null, j6.f18294xb, false);
            int i12 = j6.f18330zb;
            ko0Var.h(w02, w03, j6.w0(null, i12, false), j6.w0(null, i12, false), j6.w0(null, j6.f18311yb, false));
            radialProgress2.g(j6.Nb, j6.Ob, j6.Pa, j6.Qa);
            return;
        }
        radialProgress2.g(j6.f18025ie, j6.f18043je, j6.f18242uc, j6.f18259vc);
        int w04 = j6.w0(null, j6.f18243ud, false);
        int w05 = j6.w0(null, j6.f18260vd, false);
        int i13 = j6.f18295xd;
        ko0Var.h(w04, w05, j6.w0(null, i13, false), j6.w0(null, i13, false), j6.w0(null, j6.f18277wd, false));
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
        if (this.f40415c0 != 0 && !bounds.isEmpty()) {
            int i11 = 0;
            f(false);
            boolean z10 = this.W;
            int i12 = 2;
            RadialProgress2 radialProgress2 = this.f40425x;
            if (!z10 && !this.X) {
                ImageReceiver imageReceiver = this.f40412b;
                imageReceiver.setAlpha(this.f40415c0 / 255.0f);
                imageReceiver.setImageCoords(bounds);
                imageReceiver.draw(canvas);
                if (this.Y && (drawable = this.P) != null) {
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.P.getIntrinsicHeight() * 0.8f);
                    int A = (int) e2.A(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - wr.f28823k.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                    this.P.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                    this.P.setBounds(A, imageHeight, intrinsicWidth + A, intrinsicHeight + imageHeight);
                    this.P.draw(canvas);
                }
                radialProgress2.q(bounds.centerX() - AndroidUtilities.dp(22.0f), bounds.centerY() - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f) + bounds.centerX(), AndroidUtilities.dp(22.0f) + bounds.centerY());
                if (this.G && this.v != null) {
                    canvas.drawRoundRect(AndroidUtilities.dp(6.0f) + bounds.left, AndroidUtilities.dp(6.0f) + bounds.top, bounds.left + this.v.f27247c + AndroidUtilities.dp(18.0f), AndroidUtilities.dp(23.0f) + bounds.top, AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), this.f40424w);
                    this.v.e(canvas, AndroidUtilities.dp(12.0f) + bounds.left, AndroidUtilities.dp(15.0f) + bounds.top);
                }
            } else {
                int i13 = bounds.left;
                boolean z11 = this.f40426y;
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
                t01 t01Var = this.f40421n;
                if (t01Var != null) {
                    t01Var.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(15.0f) + i16 + i11);
                }
                if (this.X) {
                    float f7 = this.f40410a.e;
                    if (this.f40422r != null && f7 < 1.0f) {
                        canvas.save();
                        float f10 = 1.0f - f7;
                        int i17 = i16 + i11;
                        canvas.scale(f10, f10, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        this.f40422r.f27245a.setAlpha((int) (f10 * 255.0f));
                        this.f40422r.e(canvas, AndroidUtilities.dp(56.0f) + i14, AndroidUtilities.dp(35.0f) + i17);
                        canvas.restore();
                    }
                    if (f7 > 0.0f) {
                        ko0 ko0Var = this.K;
                        ko0Var.f24783t = f7;
                        ko0Var.j(em.v(56.0f, i14, bounds.right), AndroidUtilities.dp(30.0f));
                        canvas.save();
                        float dp3 = AndroidUtilities.dp(45.0f) + i14;
                        this.L = dp3;
                        float dp4 = AndroidUtilities.dp(21.0f) + i16 + i11;
                        this.M = dp4;
                        canvas.translate(dp3, dp4);
                        ko0Var.b(canvas);
                        canvas.restore();
                    }
                }
                t01 t01Var2 = this.f40423s;
                if (t01Var2 != null) {
                    float dp5 = AndroidUtilities.dp(56.0f) + i14;
                    int i18 = i11 + i16;
                    if (this.X) {
                        i10 = 20;
                    } else {
                        i10 = 2;
                    }
                    t01Var2.e(canvas, dp5, AndroidUtilities.dp(i10 + 34) + i18);
                }
                int dp6 = AndroidUtilities.dp(2.0f) + i14;
                this.f40411a0 = dp6;
                int dp7 = AndroidUtilities.dp(5.0f) + i16;
                this.f40413b0 = dp7;
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
                    if (aVar != null && aVar.f40391g) {
                        if (this.X) {
                            l(3, true);
                        } else {
                            k(3);
                        }
                    } else if (this.X) {
                        if (aVar != null && aVar.f40390f) {
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
        if (this.f40426y) {
            f7 = 64.0f;
        } else {
            f7 = 72.0f;
        }
        int dp = width - AndroidUtilities.dp(f7);
        if (this.Z != dp || z10) {
            this.Z = dp;
            String str = this.e;
            if (str != null) {
                if (this.f40421n == null) {
                    this.f40421n = new t01(str, 15.0f, AndroidUtilities.bold());
                }
                t01 t01Var = this.f40421n;
                t01Var.r(TextUtils.ellipsize(this.e, t01Var.f27245a, dp, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f40418f;
            if (str2 != null) {
                if (this.f40422r == null) {
                    this.f40422r = new t01(str2, 14.0f, null);
                }
                t01 t01Var2 = this.f40422r;
                t01Var2.r(TextUtils.ellipsize(this.f40418f, t01Var2.f27245a, dp, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.f40423s == null) {
                    this.f40423s = new t01(str3, 12.0f, null);
                }
                t01 t01Var3 = this.f40423s;
                t01Var3.r(TextUtils.ellipsize(this.h, t01Var3.f27245a, dp, TextUtils.TruncateAt.END));
            }
            if (this.G && this.v == null) {
                this.v = new t01(AndroidUtilities.formatLongDuration(this.J), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.X;
        if (z10 && this.f40410a.f12870f) {
            return !MediaController.getInstance().isMessagePaused();
        }
        if (!this.G && !z10) {
            if (this.W) {
                a aVar = this.Q;
                if (aVar != null && aVar.f40390f) {
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
        return this.f40415c0;
    }

    @Override
    public final int getObserverTag() {
        return this.f40416d0;
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
        if (this.f40426y) {
            i11 = (i10 * 4) / 5;
        } else {
            i11 = (i10 * 5) / 4;
        }
        return Math.min(round, i11);
    }

    public final boolean i() {
        if (this.X && MediaController.getInstance().isPlayingMessage(this.H) && MediaController.getInstance().getPlayingMessageObject() != null && MediaController.getInstance().getPlayingMessageObject().isPlayingExplanationObject == this.f40426y) {
            return true;
        }
        return false;
    }

    public final boolean j(float f7, float f10, int i10) {
        if (!this.X || this.f40419f0 == 4) {
            return false;
        }
        if (i10 == 0) {
            int dp = AndroidUtilities.dp(36.0f);
            int dp2 = AndroidUtilities.dp(27.0f);
            int i11 = this.f40411a0 + dp2;
            if (f7 >= i11 && f7 <= i11 + dp) {
                int i12 = this.f40413b0 + dp2;
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
                    TLRPC.Document document = aVar.f40388b;
                    int i13 = aVar.f40387a;
                    if (aVar.f40391g) {
                        FileLoader.getInstance(i13).cancelLoadFile(document);
                        aVar.a();
                    } else if (!aVar.f40390f) {
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
        if (this.f40417e0 != i10) {
            this.f40417e0 = i10;
            this.f40425x.setIcon(i10, true, true);
        }
    }

    public final void l(int i10, boolean z10) {
        if (this.f40419f0 != i10) {
            this.f40419f0 = i10;
            this.f40425x.k(i10, true, z10);
        }
    }

    public final void m(org.telegram.messenger.MessageObject r26, org.telegram.tgnet.TLRPC.MessageMedia r27, org.telegram.messenger.MessageObject r28, int r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: ph.g.m(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, int, java.lang.String, boolean):void");
    }

    public final void n(boolean z10) {
        int i10;
        if (this.X && this.H != null) {
            MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
            boolean i11 = i();
            this.f40410a.a(i11, z10);
            if (playingMessageObject != null && i11) {
                i10 = playingMessageObject.audioProgressSec;
                ko0 ko0Var = this.K;
                if (!ko0Var.e) {
                    ko0Var.i(playingMessageObject.audioProgress);
                    ko0Var.f24780q = playingMessageObject.bufferedProgress;
                }
                ko0Var.k(playingMessageObject);
            } else {
                i10 = 0;
            }
            if (this.f40420g0 != i10) {
                this.f40420g0 = i10;
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
        this.f40425x.o(min, true);
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
        this.f40425x.o(min, true);
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
        this.f40415c0 = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
