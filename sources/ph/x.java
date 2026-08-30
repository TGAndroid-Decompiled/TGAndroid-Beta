package ph;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.nr;
import org.telegram.ui.ls0;
public final class x {
    public int f42518a;
    public final org.telegram.ui.Components.z5 f42519b;
    public final ImageReceiver f42520c;
    public eg.t2 d;
    public TextureView e;
    public boolean f42521f;
    public q h;
    public boolean f42527m;
    public u6 f42528n;
    public ValueAnimator f42529o;
    public final y f42530p;
    public volatile long f42522g = -1;
    public boolean f42523i = false;
    public final RectF f42524j = new RectF();
    public final RectF f42525k = new RectF();
    public float f42526l = 1.0f;

    public x(y yVar) {
        this.f42530p = yVar;
        this.f42519b = new org.telegram.ui.Components.z5(yVar, 0L, 1200L, nr.f27347g);
        this.f42520c = new ImageReceiver(yVar);
    }

    public final void a(u6 u6Var) {
        String str;
        float f10;
        eg.t2 t2Var = this.d;
        if (t2Var != null) {
            t2Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.e = null;
        }
        this.f42521f = false;
        this.f42528n = u6Var;
        StringBuilder sb = new StringBuilder();
        sb.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb.append("_");
        sb.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (u6Var != null && u6Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String r10 = android.support.v4.media.a.r(sb, str, "_exif");
        u6 u6Var2 = this.f42528n;
        y yVar = this.f42530p;
        ImageReceiver imageReceiver = this.f42520c;
        if (u6Var2 == null) {
            imageReceiver.clearImage();
        } else if (u6Var2.K) {
            Bitmap bitmap = u6Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = u6Var2.f42403b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = u6Var2.N;
                    if (str2 != null) {
                        imageReceiver.setImage(str2, r10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(yVar.getContext());
            this.e = textureView2;
            yVar.addView(textureView2);
            eg.t2 t2Var2 = new eg.t2(this, 1);
            this.d = t2Var2;
            t2Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.f42528n.L), false, 1.0f);
            eg.t2 t2Var3 = this.d;
            if (!yVar.f42598s0) {
                u6 u6Var3 = this.f42528n;
                if (!u6Var3.Y && yVar.f42588k0) {
                    f10 = u6Var3.P;
                    t2Var3.setVolume(f10);
                    if (!yVar.f42588k0 && !yVar.f42591n0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            t2Var3.setVolume(f10);
            if (!yVar.f42588k0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(u6Var2.L.getAbsolutePath(), r10, null, null, 0L);
        }
        yVar.invalidate();
    }

    public final void b(q qVar, boolean z4) {
        q qVar2 = this.h;
        if (qVar != null) {
            this.h = qVar;
        }
        ValueAnimator valueAnimator = this.f42529o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42529o = null;
        }
        RectF rectF = this.f42525k;
        y yVar = this.f42530p;
        if (z4) {
            boolean z10 = this.f42523i;
            RectF rectF2 = this.f42524j;
            if (!z10) {
                y.c(yVar, rectF2, qVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f42526l, rectF2);
            }
            if (qVar == null) {
                y.c(yVar, rectF, qVar2);
            } else {
                yVar.k(rectF, qVar);
            }
            this.f42526l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f42529o = ofFloat;
            ofFloat.addUpdateListener(new eg.b1(this, 10));
            this.f42529o.addListener(new ls0(this, 29));
            this.f42529o.setInterpolator(nr.h);
            this.f42529o.setDuration(360L);
            this.f42529o.start();
        } else {
            yVar.k(rectF, qVar);
            this.f42526l = 1.0f;
        }
        yVar.invalidate();
        this.f42523i = true;
    }
}
