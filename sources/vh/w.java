package vh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.gr;
public final class w {
    public int f52087a;
    public final org.telegram.ui.Components.t5 f52088b;
    public final ImageReceiver f52089c;
    public kg.j2 d;
    public TextureView e;
    public boolean f52090f;
    public q h;
    public boolean f52096m;
    public n5 f52097n;
    public ValueAnimator f52098o;
    public final x f52099p;
    public volatile long f52091g = -1;
    public boolean f52092i = false;
    public final RectF f52093j = new RectF();
    public final RectF f52094k = new RectF();
    public float f52095l = 1.0f;

    public w(x xVar) {
        this.f52099p = xVar;
        this.f52088b = new org.telegram.ui.Components.t5(xVar, 0L, 1200L, gr.f26524g);
        this.f52089c = new ImageReceiver(xVar);
    }

    public final void a(n5 n5Var) {
        String str;
        float f7;
        kg.j2 j2Var = this.d;
        if (j2Var != null) {
            j2Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.e;
        if (textureView != null) {
            org.telegram.messenger.i0.E2(textureView);
            this.e = null;
        }
        this.f52090f = false;
        this.f52097n = n5Var;
        StringBuilder sb2 = new StringBuilder();
        Point point = org.telegram.messenger.i0.f16172q;
        sb2.append((int) Math.ceil(point.x / org.telegram.messenger.i0.f16171p));
        sb2.append("_");
        sb2.append((int) Math.ceil(point.y / org.telegram.messenger.i0.f16171p));
        if (n5Var != null && n5Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String r10 = a1.g.r(sb2, str, "_exif");
        n5 n5Var2 = this.f52097n;
        x xVar = this.f52099p;
        ImageReceiver imageReceiver = this.f52089c;
        if (n5Var2 == null) {
            imageReceiver.f();
        } else if (n5Var2.K) {
            Bitmap bitmap = n5Var2.M0;
            if (bitmap != null) {
                imageReceiver.v0(bitmap);
            } else {
                Bitmap bitmap2 = n5Var2.f51534b1;
                if (bitmap2 != null) {
                    imageReceiver.v0(bitmap2);
                } else {
                    String str2 = n5Var2.N;
                    if (str2 != null) {
                        imageReceiver.o0(str2, r10, null, null, 0L);
                    } else {
                        imageReceiver.f();
                    }
                }
            }
            TextureView textureView2 = new TextureView(xVar.getContext());
            this.e = textureView2;
            xVar.addView(textureView2);
            kg.j2 j2Var2 = new kg.j2(this, 1);
            this.d = j2Var2;
            j2Var2.allowMultipleInstances(true);
            this.d.with(this.e);
            this.d.preparePlayer(Uri.fromFile(this.f52097n.L), false, 1.0f);
            kg.j2 j2Var3 = this.d;
            if (!xVar.f52166v0) {
                n5 n5Var3 = this.f52097n;
                if (!n5Var3.Y && xVar.f52156n0) {
                    f7 = n5Var3.P;
                    j2Var3.setVolume(f7);
                    if (!xVar.f52156n0 && !xVar.f52159q0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f7 = 0.0f;
            j2Var3.setVolume(f7);
            if (!xVar.f52156n0) {
            }
            this.d.play();
        } else {
            imageReceiver.o0(n5Var2.L.getAbsolutePath(), r10, null, null, 0L);
        }
        xVar.invalidate();
    }

    public final void b(q qVar, boolean z10) {
        q qVar2 = this.h;
        if (qVar != null) {
            this.h = qVar;
        }
        ValueAnimator valueAnimator = this.f52098o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f52098o = null;
        }
        RectF rectF = this.f52094k;
        x xVar = this.f52099p;
        if (z10) {
            boolean z11 = this.f52092i;
            RectF rectF2 = this.f52093j;
            if (!z11) {
                x.c(xVar, rectF2, qVar);
            } else {
                org.telegram.messenger.i0.Z1(rectF2, rectF, this.f52095l, rectF2);
            }
            if (qVar == null) {
                x.c(xVar, rectF, qVar2);
            } else {
                xVar.k(rectF, qVar);
            }
            this.f52095l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f52098o = ofFloat;
            ofFloat.addUpdateListener(new bg.o(this, 13));
            this.f52098o.addListener(new sg.r(this, 14));
            this.f52098o.setInterpolator(gr.h);
            this.f52098o.setDuration(360L);
            this.f52098o.start();
        } else {
            xVar.k(rectF, qVar);
            this.f52095l = 1.0f;
        }
        xVar.invalidate();
        this.f52092i = true;
    }
}
