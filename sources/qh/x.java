package qh;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.pr;
import org.telegram.ui.ns0;
public final class x {
    public int f46244a;
    public final org.telegram.ui.Components.z5 f46245b;
    public final ImageReceiver f46246c;
    public fg.s2 d;
    public TextureView f46247e;
    public boolean f46248f;
    public q h;
    public boolean f46254m;
    public s6 f46255n;
    public ValueAnimator f46256o;
    public final y f46257p;
    public volatile long f46249g = -1;
    public boolean f46250i = false;
    public final RectF f46251j = new RectF();
    public final RectF f46252k = new RectF();
    public float f46253l = 1.0f;

    public x(y yVar) {
        this.f46257p = yVar;
        this.f46245b = new org.telegram.ui.Components.z5(yVar, 0L, 1200L, pr.f30184g);
        this.f46246c = new ImageReceiver(yVar);
    }

    public final void a(s6 s6Var) {
        String str;
        float f10;
        fg.s2 s2Var = this.d;
        if (s2Var != null) {
            s2Var.pause();
            this.d.release(null);
            this.d = null;
        }
        TextureView textureView = this.f46247e;
        if (textureView != null) {
            AndroidUtilities.removeFromParent(textureView);
            this.f46247e = null;
        }
        this.f46248f = false;
        this.f46255n = s6Var;
        StringBuilder sb = new StringBuilder();
        sb.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb.append("_");
        sb.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (s6Var != null && s6Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String r10 = android.support.v4.media.a.r(sb, str, "_exif");
        s6 s6Var2 = this.f46255n;
        y yVar = this.f46257p;
        ImageReceiver imageReceiver = this.f46246c;
        if (s6Var2 == null) {
            imageReceiver.clearImage();
        } else if (s6Var2.K) {
            Bitmap bitmap = s6Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = s6Var2.f46046b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = s6Var2.N;
                    if (str2 != null) {
                        imageReceiver.setImage(str2, r10, null, null, 0L);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
            }
            TextureView textureView2 = new TextureView(yVar.getContext());
            this.f46247e = textureView2;
            yVar.addView(textureView2);
            fg.s2 s2Var2 = new fg.s2(this, 1);
            this.d = s2Var2;
            s2Var2.allowMultipleInstances(true);
            this.d.with(this.f46247e);
            this.d.preparePlayer(Uri.fromFile(this.f46255n.L), false, 1.0f);
            fg.s2 s2Var3 = this.d;
            if (!yVar.f46337s0) {
                s6 s6Var3 = this.f46255n;
                if (!s6Var3.Y && yVar.f46327k0) {
                    f10 = s6Var3.P;
                    s2Var3.setVolume(f10);
                    if (!yVar.f46327k0 && !yVar.f46330n0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            s2Var3.setVolume(f10);
            if (!yVar.f46327k0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(s6Var2.L.getAbsolutePath(), r10, null, null, 0L);
        }
        yVar.invalidate();
    }

    public final void b(q qVar, boolean z4) {
        q qVar2 = this.h;
        if (qVar != null) {
            this.h = qVar;
        }
        ValueAnimator valueAnimator = this.f46256o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46256o = null;
        }
        RectF rectF = this.f46252k;
        y yVar = this.f46257p;
        if (z4) {
            boolean z10 = this.f46250i;
            RectF rectF2 = this.f46251j;
            if (!z10) {
                y.c(yVar, rectF2, qVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f46253l, rectF2);
            }
            if (qVar == null) {
                y.c(yVar, rectF, qVar2);
            } else {
                yVar.k(rectF, qVar);
            }
            this.f46253l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f46256o = ofFloat;
            ofFloat.addUpdateListener(new f2.d0(this, 10));
            this.f46256o.addListener(new ns0(this, 29));
            this.f46256o.setInterpolator(pr.h);
            this.f46256o.setDuration(360L);
            this.f46256o.start();
        } else {
            yVar.k(rectF, qVar);
            this.f46253l = 1.0f;
        }
        yVar.invalidate();
        this.f46250i = true;
    }
}
