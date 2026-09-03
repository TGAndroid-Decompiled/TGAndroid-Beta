package qh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ss0;
public final class x {
    public int f46284a;
    public final org.telegram.ui.Components.z5 f46285b;
    public final ImageReceiver f46286c;
    public fg.s2 d;
    public TextureView f46287e;
    public boolean f46288f;
    public q h;
    public boolean f46294m;
    public r6 f46295n;
    public ValueAnimator f46296o;
    public final y f46297p;
    public volatile long f46289g = -1;
    public boolean f46290i = false;
    public final RectF f46291j = new RectF();
    public final RectF f46292k = new RectF();
    public float f46293l = 1.0f;

    public x(y yVar) {
        this.f46297p = yVar;
        this.f46285b = new org.telegram.ui.Components.z5(yVar, 0L, 1200L, pr.f30169g);
        this.f46286c = new ImageReceiver(yVar);
    }

    public final void a(r6 r6Var) {
        String str;
        float f10;
        fg.s2 s2Var = this.d;
        if (s2Var != null) {
            s2Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f46287e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.f46287e = null;
        }
        this.f46288f = false;
        this.f46295n = r6Var;
        StringBuilder sb = new StringBuilder();
        sb.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb.append("_");
        sb.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (r6Var != null && r6Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String r10 = android.support.v4.media.a.r(sb, str, "_exif");
        r6 r6Var2 = this.f46295n;
        y yVar = this.f46297p;
        ImageReceiver imageReceiver = this.f46286c;
        if (r6Var2 == null) {
            imageReceiver.clearImage();
        } else if (r6Var2.K) {
            Bitmap bitmap = r6Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = r6Var2.f45997b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = r6Var2.N;
                    if (str2 != null) {
                        imageReceiver.setImage(str2, r10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(yVar.getContext());
            this.f46287e = textureView2;
            yVar.addView(textureView2);
            fg.s2 s2Var2 = new fg.s2(this, 1);
            this.d = s2Var2;
            s2Var2.allowMultipleInstances(true);
            this.d.with(this.f46287e);
            this.d.preparePlayer(Uri.fromFile(this.f46295n.L), false, 1.0f);
            fg.s2 s2Var3 = this.d;
            if (!yVar.f46347s0) {
                r6 r6Var3 = this.f46295n;
                if (!r6Var3.Y && yVar.f46337k0) {
                    f10 = r6Var3.P;
                    s2Var3.setVolume(f10);
                    if (!yVar.f46337k0 && !yVar.f46340n0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            s2Var3.setVolume(f10);
            if (!yVar.f46337k0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(r6Var2.L.getAbsolutePath(), r10, null, null, 0L);
        }
        yVar.invalidate();
    }

    public final void b(q qVar, boolean z4) {
        q qVar2 = this.h;
        if (qVar != null) {
            this.h = qVar;
        }
        ValueAnimator valueAnimator = this.f46296o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46296o = null;
        }
        RectF rectF = this.f46292k;
        y yVar = this.f46297p;
        if (z4) {
            boolean z10 = this.f46290i;
            RectF rectF2 = this.f46291j;
            if (!z10) {
                y.c(yVar, rectF2, qVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f46293l, rectF2);
            }
            if (qVar == null) {
                y.c(yVar, rectF, qVar2);
            } else {
                yVar.k(rectF, qVar);
            }
            this.f46293l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f46296o = ofFloat;
            ofFloat.addUpdateListener(new f2.d0(this, 10));
            this.f46296o.addListener(new ss0(this, 29));
            this.f46296o.setInterpolator(pr.h);
            this.f46296o.setDuration(360L);
            this.f46296o.start();
        } else {
            yVar.k(rectF, qVar);
            this.f46293l = 1.0f;
        }
        yVar.invalidate();
        this.f46290i = true;
    }
}
