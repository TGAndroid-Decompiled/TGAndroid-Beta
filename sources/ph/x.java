package ph;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.mr;
import org.telegram.ui.ss0;
public final class x {
    public int f42552a;
    public final org.telegram.ui.Components.z5 f42553b;
    public final ImageReceiver f42554c;
    public eg.t2 d;
    public TextureView e;
    public boolean f42555f;
    public q h;
    public boolean f42561m;
    public t6 f42562n;
    public ValueAnimator f42563o;
    public final y f42564p;
    public volatile long f42556g = -1;
    public boolean f42557i = false;
    public final RectF f42558j = new RectF();
    public final RectF f42559k = new RectF();
    public float f42560l = 1.0f;

    public x(y yVar) {
        this.f42564p = yVar;
        this.f42553b = new org.telegram.ui.Components.z5(yVar, 0L, 1200L, mr.f27123g);
        this.f42554c = new ImageReceiver(yVar);
    }

    public final void a(t6 t6Var) {
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
        this.f42555f = false;
        this.f42562n = t6Var;
        StringBuilder sb = new StringBuilder();
        sb.append((int) Math.ceil(AndroidUtilities.displaySize.x / AndroidUtilities.density));
        sb.append("_");
        sb.append((int) Math.ceil(AndroidUtilities.displaySize.y / AndroidUtilities.density));
        if (t6Var != null && t6Var.K) {
            str = "_g";
        } else {
            str = "";
        }
        String r10 = android.support.v4.media.a.r(sb, str, "_exif");
        t6 t6Var2 = this.f42562n;
        y yVar = this.f42564p;
        ImageReceiver imageReceiver = this.f42554c;
        if (t6Var2 == null) {
            imageReceiver.clearImage();
        } else if (t6Var2.K) {
            Bitmap bitmap = t6Var2.M0;
            if (bitmap != null) {
                imageReceiver.setImageBitmap(bitmap);
            } else {
                Bitmap bitmap2 = t6Var2.f42404b1;
                if (bitmap2 != null) {
                    imageReceiver.setImageBitmap(bitmap2);
                } else {
                    String str2 = t6Var2.N;
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
            this.d.preparePlayer(Uri.fromFile(this.f42562n.L), false, 1.0f);
            eg.t2 t2Var3 = this.d;
            if (!yVar.f42635s0) {
                t6 t6Var3 = this.f42562n;
                if (!t6Var3.Y && yVar.f42625k0) {
                    f10 = t6Var3.P;
                    t2Var3.setVolume(f10);
                    if (!yVar.f42625k0 && !yVar.f42628n0) {
                        this.d.pause();
                    } else {
                        this.d.play();
                    }
                }
            }
            f10 = 0.0f;
            t2Var3.setVolume(f10);
            if (!yVar.f42625k0) {
            }
            this.d.play();
        } else {
            imageReceiver.setImage(t6Var2.L.getAbsolutePath(), r10, null, null, 0L);
        }
        yVar.invalidate();
    }

    public final void b(q qVar, boolean z4) {
        q qVar2 = this.h;
        if (qVar != null) {
            this.h = qVar;
        }
        ValueAnimator valueAnimator = this.f42563o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42563o = null;
        }
        RectF rectF = this.f42559k;
        y yVar = this.f42564p;
        if (z4) {
            boolean z10 = this.f42557i;
            RectF rectF2 = this.f42558j;
            if (!z10) {
                y.c(yVar, rectF2, qVar);
            } else {
                AndroidUtilities.lerp(rectF2, rectF, this.f42560l, rectF2);
            }
            if (qVar == null) {
                y.c(yVar, rectF, qVar2);
            } else {
                yVar.k(rectF, qVar);
            }
            this.f42560l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f42563o = ofFloat;
            ofFloat.addUpdateListener(new eg.b1(this, 10));
            this.f42563o.addListener(new ss0(this, 29));
            this.f42563o.setInterpolator(mr.h);
            this.f42563o.setDuration(360L);
            this.f42563o.start();
        } else {
            yVar.k(rectF, qVar);
            this.f42560l = 1.0f;
        }
        yVar.invalidate();
        this.f42557i = true;
    }
}
