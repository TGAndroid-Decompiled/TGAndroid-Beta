package ye;

import af.f;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.t;
import h3.k0;
import h7.n;
import java.util.HashMap;
import lh.y3;
import m.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
import org.webrtc.TextureViewRenderer;

public final class d {

    public static int f49858n;

    public static final Rect f49859o = new Rect();

    public final t3 f49860a;

    public final f f49861b;

    public final String f49862c;
    public final int d;

    public final int f49863e;

    public final boolean f49864f;

    public final af.a f49865g;
    public final bf.c h;

    public final t f49866i;

    public View f49867j;

    public View f49868k;

    public k0 f49869l;

    public boolean f49870m;

    public d(t3 t3Var, c cVar) {
        int i10 = f49858n;
        f49858n = i10 + 1;
        bf.c cVar2 = new bf.c();
        this.h = cVar2;
        t tVar = new t(new y3(this, 1));
        this.f49866i = tVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f49851c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String string = sb2.toString();
        this.f49862c = string;
        this.f49865g = cVar.f49850b;
        this.d = cVar.f49852e;
        this.f49863e = cVar.d;
        this.f49864f = cVar.f49853f;
        this.f49860a = t3Var;
        cVar2.c(cVar.h, cVar.f49855i);
        this.f49869l = cVar.f49854g;
        this.f49868k = cVar.f49857k;
        this.f49861b = new f(this);
        View view = cVar.f49856j;
        tVar.O(view);
        this.f49867j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) t3Var.f17473a).put(string, this);
        t3Var.g();
    }

    public final PictureInPictureParams a() {
        PictureInPictureParams.Builder builderA = this.h.a();
        builderA.setActions(null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            builderA.setAutoEnterEnabled(i10 >= 31);
        }
        return builderA.build();
    }

    public final void b(boolean z10) {
        boolean z11 = this.h.b() && this.f49865g.g();
        if (this.f49870m != z11) {
            this.f49870m = z11;
            if (z10) {
                t3 t3Var = this.f49860a;
                t3Var.g();
                ((a) t3Var.f17475c).invalidate();
            }
        }
    }

    public final void c() {
        this.f49866i.O(null);
        t3 t3Var = this.f49860a;
        if (((HashMap) t3Var.f17473a).remove(this.f49862c) != null) {
            t3Var.g();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f49860a.a(this);
        }
    }

    public final void e(View view) {
        boolean zC;
        t3 t3Var = this.f49860a;
        if (AndroidUtilities.isInPictureInPictureMode((LaunchActivity) t3Var.d)) {
            return;
        }
        LaunchActivity launchActivity = (LaunchActivity) t3Var.d;
        int[] iArr = bf.d.f2083a;
        view.getLocationOnScreen(iArr);
        boolean z10 = false;
        int i10 = iArr[0];
        int i11 = iArr[1];
        View decorView = launchActivity.getWindow().getDecorView();
        decorView.getLocationOnScreen(iArr);
        int i12 = i10 - iArr[0];
        int i13 = i11 - iArr[1];
        int width = view.getWidth() + i12;
        int height = view.getHeight() + i13;
        int i14 = iArr[0];
        int iB = n.b(i12, i14, decorView.getWidth() + i14);
        int i15 = iArr[1];
        int iB2 = n.b(i13, i15, decorView.getHeight() + i15);
        int i16 = iArr[0];
        int iB3 = n.b(width, i16, decorView.getWidth() + i16);
        int i17 = iArr[1];
        int iB4 = n.b(height, i17, decorView.getHeight() + i17);
        Rect rect = f49859o;
        rect.set(iB, iB2, iB3, iB4);
        bf.c cVar = this.h;
        Rect rect2 = cVar.f2081a;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
            z10 = true;
        }
        if (!(view instanceof TextureViewRenderer)) {
            if (view.getWidth() != 0 && view.getHeight() != 0) {
                zC = cVar.c(view.getWidth(), view.getHeight());
            }
            if (z10) {
                b(true);
                t3Var.a(this);
            }
        }
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) view;
        zC = cVar.c(textureViewRenderer.rotatedFrameWidth, textureViewRenderer.rotatedFrameHeight);
        z10 |= zC;
        if (z10) {
            b(true);
            t3Var.a(this);
        }
    }
}
